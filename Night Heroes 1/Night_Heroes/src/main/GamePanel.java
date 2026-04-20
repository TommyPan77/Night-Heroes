package main;
import javax.swing.JPanel;

import java.awt.Graphics2D;
public class GamePanel extends JPanel implements Runnable {
    final int tamanoOriginalPantalla = 16;
    final int escala = 3;
    public final int tileSize = tamanoOriginalPantalla * escala; 
    final int maxLargoPantalla = 20;
    final int maxAnchoPantalla = 12;
    final int anchoPantalla = tileSize * maxLargoPantalla;
    final int largoPantalla = tileSize * maxAnchoPantalla;
    int FPS = 1000;
    String personaje;
    entity.player player;
    KeyHandler keyH = new KeyHandler();
    Thread NightHeroesThread;

    //Posicion incial
    int jugadorX = 100;
    int jugadorY = 100;
    int jugadorVelocidad= 4;
    
    public GamePanel(String personaje) {
        this.personaje = personaje;

        this.setPreferredSize(new java.awt.Dimension(anchoPantalla, largoPantalla));
        this.setBackground(java.awt.Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);

        player = new entity.player(this, keyH, personaje);
    }
    public void startGameThread() {
        NightHeroesThread = new Thread(this);
        NightHeroesThread.start();
    }

    @Override
    public void run(){
        double intervalo=1000000000/FPS;
        double delta=0;
        long ultimoTiempo=System.nanoTime();
        long tiempoActual;
        long contador=0;
        int conteo=0;
        while(NightHeroesThread != null) {
            tiempoActual=System.nanoTime();
            delta+=(tiempoActual-ultimoTiempo)/intervalo;
            contador+=(tiempoActual-ultimoTiempo);
            ultimoTiempo=tiempoActual;
            if(delta>=1) {
                update();
                repaint();
                delta--;
                conteo++;
            }
            if (contador>=1000000000) {
                System.out.println("FPS: "+conteo);
                conteo=0;
                contador=0;
            }
        }
    }
    public void update() {
        player.update();
    }
    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        player.draw(g2);
        g2.dispose();
    }
}
