package entity;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import main.GamePanel;
import main.KeyHandler;

public class player extends entity {
    GamePanel gp;
    KeyHandler keyH;
    
    boolean moving;
    String tipo;

    public player(GamePanel gp, KeyHandler keyH, String tipo) {
        this.gp = gp;
        this.keyH = keyH;
        this.tipo = tipo;

        setDefaultValues();
        getPlayerImage();
    }
    public void setDefaultValues() {
        x = 100;
        y = 100;
        velocidad = 4;
        direccion="up"; 
    }
    public void getPlayerImage() {
        try {
            if (tipo.equals("tanque")){
                downIdle = ImageIO.read(getClass().getResource("/res/player/Tanque/Tanque_frente.png"));
                down1 = ImageIO.read(getClass().getResource("/res/player/Tanque/Tanque_pie_derecho_abajo.png"));
                down2 = ImageIO.read(getClass().getResource("/res/player/Tanque/Tanque_pie_izquierdo_abajo.png"));
                upIdle = ImageIO.read(getClass().getResource("/res/player/Tanque/Tanque_Idle_arriba.png"));
                up1 = ImageIO.read(getClass().getResource("/res/player/Tanque/Tanque_pie_derecho_arriba.png"));
                up2 = ImageIO.read(getClass().getResource("/res/player/Tanque/Tanque_pie_izquierdo_arriba.png"));
                left1 = ImageIO.read(getClass().getResource("/res/player/Tanque/Tanque_quieto_izquierda.png"));
                left2 = ImageIO.read(getClass().getResource("/res/player/Tanque/Tanque_caminando_a_la_izquierda.png"));
                right1 = ImageIO.read(getClass().getResource("/res/player/Tanque/Tanque_quieto_a_la_derecha.png"));
                right2 = ImageIO.read(getClass().getResource("/res/player/Tanque/Tanque_caminando_a_la_derecha.png"));
            }else if(tipo.equals("arquero")){
                downIdle = ImageIO.read(getClass().getResource("/res/player/Arquero/Umbra_Archer_Idle.png"));
                down1 = ImageIO.read(getClass().getResource("/res/player/Arquero/Umbra_Archer_pie_derecho_abajo.png"));
                down2 = ImageIO.read(getClass().getResource("/res/player/Arquero/Umbra_Archer_pie_izquierdo_abajo.png"));
                upIdle = ImageIO.read(getClass().getResource("/res/player/Arquero/Umbra_Archer_Idle_arriba.png"));
                up1 = ImageIO.read(getClass().getResource("/res/player/Arquero/Umbra_Archer_pie_derecho_arriba.png"));
                up2 = ImageIO.read(getClass().getResource("/res/player/Arquero/Umbra_Archer_pie_izquierdo_arriba.png"));
                left1 = ImageIO.read(getClass().getResource("/res/player/Arquero/Umbra_Archer_quieto_a_la_izquierda.png"));
                left2 = ImageIO.read(getClass().getResource("/res/player/Arquero/Umbra_Archer_moviendose_a_la_izquierda.png"));
                right1 = ImageIO.read(getClass().getResource("/res/player/Arquero/Umbra_Archer_quieto_a_la_derecha.png"));
                right2 = ImageIO.read(getClass().getResource("/res/player/Arquero/Umbra_Archer_moviendose_a_la_derecha.png"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void update() {

        moving = false;

        if (keyH.teclaArriba==true) {
            direccion="up";
            y-=velocidad;
            moving=true;
        }
        else if (keyH.teclaAbajo == true) {
            direccion="down";
            y+=velocidad;
            moving=true;
        }
        else if (keyH.teclaIzquierda == true) {
            direccion= "left";
            x -= velocidad;
            moving = true;
        }
        else if (keyH.teclaDerecha==true) {
            direccion= "right";
            x+=velocidad;
            moving = true;
        }

        if(moving){
            spriteCounter++;

            if(spriteCounter >12){
                if(spriteNumber == 1){
                    spriteNumber=2;
                } else {
                    spriteNumber=1;
                }
                spriteCounter=0;
            }
        } else {
            spriteNumber=1;
        }
    }
    public void draw(Graphics2D g2) {
        BufferedImage imagen = null;
        switch (direccion) {
            case "up":
                if(!moving){
                    imagen = upIdle;
                } else {
                    imagen = (spriteNumber == 1) ? up1 : up2;
                }
                break;

            case "down":
                if(!moving){
                    imagen = downIdle;
                } else {
                    imagen = (spriteNumber == 1) ? down1 : down2;
                }
                break;
            case "left":
                if(spriteNumber==1){
                    imagen = left1;
                }
                if(spriteNumber==2){
                    imagen = left2;
                }
                break;
            case "right":
                if(spriteNumber==1){
                    imagen = right1;
                }
                if(spriteNumber==2){
                    imagen = right2;
                }
                break;
        }
        g2.drawImage(imagen, x, y, gp.tileSize, gp.tileSize, null);
    }
}
