package main;
import javax.swing.JPanel;

import java.awt.Graphics2D;
import object.SuperObject;
import tile.tileManager;
public class GamePanel extends JPanel implements Runnable {
    final int tamanoOriginalPantalla = 16;
    final int escala = 3;
    public final int tileSize = tamanoOriginalPantalla * escala; 
    public final int maxLargoPantalla = 20;
    public final int maxAnchoPantalla = 12;
    public final int anchoPantalla = tileSize * maxLargoPantalla;
    public final int largoPantalla = tileSize * maxAnchoPantalla;
    
    //Configuracion del mapa
    
    public final int maxWorldCol=30; //Ajustar al tamano del mapa que se decida
    public final int maxWorldRow=30;
    public final int worldWidth=tileSize*maxWorldCol;
    public final int worldHeight=tileSize*maxWorldRow;
    int FPS = 60;
    public String personaje;
    KeyHandler keyH = new KeyHandler();
    Thread NightHeroesThread;
    public CollisionChecker cChecker =new CollisionChecker(this);
    public AssetSetter aSetter=new AssetSetter(this);
    tileManager tileM=new tileManager(this);
    public entity.player player;
    public SuperObject obj[]=new SuperObject[100];
    
       
    public GamePanel(String personaje) {
        this.personaje = personaje;

        this.setPreferredSize(new java.awt.Dimension(anchoPantalla, largoPantalla));
        this.setBackground(java.awt.Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);

        player = new entity.player(this, keyH, personaje);
    }
    public void setupGame(){
        aSetter.setObject(); 
        
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
    @Override
    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        
        tileM.draw(g2);
        for(int i=0;i<obj.length;i++){
            if(obj[i]!=null){
                obj[i].draw(g2,this);
            }
        }
        player.draw(g2);
        g2.dispose();
    }
}
