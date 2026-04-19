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

    public player(GamePanel gp, KeyHandler keyH) {
        this.gp = gp;
        this.keyH = keyH;

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
            /*down1 = ImageIO.read(getClass().getResource("/res/player/Tanque/Tanque_pie_derecho_abajo.png"));
            down2 = ImageIO.read(getClass().getResource("/res/player/Tanque/Tanque pie izquierdo abajo.png"));
            up1 = ImageIO.read(getClass().getResource("/res/player/Tanque/Tanque pie derecho arriba.png"));
            up2 = ImageIO.read(getClass().getResource("/res/player/Tanque/Tanque pie izquierdo arriba.png"));
            left1 = ImageIO.read(getClass().getResource("/res/player/Tanque/Tanque_quieto_izquierda.png"));
            left2 = ImageIO.read(getClass().getResource("/res/player/Tanque/Tanque caminando a la izquierda.png"));
            right1 = ImageIO.read(getClass().getResource("/res/player/Tanque/Tanque quieto a la derecha.png"));
            right2 = ImageIO.read(getClass().getResource("/res/player/Tanque/Tanque caminando a la derecha.png"));*/
            down1 = ImageIO.read(getClass().getResource("/res/player/Arquero/Umbra Archer pie derecho abajo.png"));
            down2 = ImageIO.read(getClass().getResource("/res/player/Arquero/Umbra Archer pie izquierdo abajo.png"));
            up1 = ImageIO.read(getClass().getResource("/res/player/Arquero/Umbra Archer pie derecho arriba.png"));
            up2 = ImageIO.read(getClass().getResource("/res/player/Arquero/Umbra Archer pie izquierdo arriba.png"));
            left1 = ImageIO.read(getClass().getResource("/res/player/Arquero/Umbra Archer quieto a la izquierda.png"));
            left2 = ImageIO.read(getClass().getResource("/res/player/Arquero/Umbra Archer moviendose a la izquierda.png"));
            right1 = ImageIO.read(getClass().getResource("/res/player/Arquero/Umbra Archer quieto a la derecha.png"));
            right2 = ImageIO.read(getClass().getResource("/res/player/Arquero/Umbra Archer moviendose a la derecha.png"));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void update() {
        if (keyH.teclaArriba==true||keyH.teclaAbajo==true||keyH.teclaIzquierda==true||keyH.teclaDerecha==true){
            if (keyH.teclaArriba == true) {
            direccion="up";
            y -= velocidad;
            }
            else if (keyH.teclaAbajo == true) {
                direccion="down";
                y += velocidad;
            }
            else if (keyH.teclaIzquierda == true) {
                direccion="left";
                x -= velocidad;
            } 
            else if (keyH.teclaDerecha == true) {
                direccion="right";
                x += velocidad;
            }
        
            spriteCounter++;

            if(spriteCounter > 12){
                if(spriteNumber == 1){
                    spriteNumber = 2;
                } else {
                    spriteNumber = 1;
                }
                spriteCounter = 0;
            }
        }
    }
    public void draw(Graphics2D g2) {
        BufferedImage imagen = null;
        switch (direccion) {
            case "up": 
                if(spriteNumber==1){
                    imagen = up1;
                }
                if(spriteNumber==2){
                    imagen = up2;
                }
                break;
            case "down":
                if(spriteNumber==1){
                    imagen = down1;
                }
                if(spriteNumber==2){
                    imagen = down2;
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
