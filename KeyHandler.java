package entity;
import object.OBJ_roca1;
import object.OBJ_roca2;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import main.GamePanel;
import main.KeyHandler;
import object.OBJ_roca3;
import object.OBJ_roca4;

public class player extends entity {
    GamePanel gp;
    KeyHandler keyH;
    
    public int screenX=0;
    public int screenY=0;
    boolean moving;
    String tipo;

    public player(GamePanel gp, KeyHandler keyH, String tipo) {
        this.gp = gp;
        this.keyH = keyH;
        this.tipo = tipo;
        
        screenX= gp.anchoPantalla/2-(gp.tileSize/2);
        screenY= gp.largoPantalla/2-(gp.tileSize/2);
        
        solidArea=new Rectangle();
        solidArea.x=8;
        solidArea.y=16;
        solidAreaDefaultX=solidArea.x;
        solidAreaDefaultY=solidArea.y;
        solidArea.width=32;
        solidArea.height=32;
        setDefaultValues();
        getPlayerImage();
    }
    public void setDefaultValues() {
        worldX = (gp.maxWorldCol / 2) * gp.tileSize;
        worldY = (gp.maxWorldRow / 2) * gp.tileSize;
        velocidad = 4;
        direccion = "up";
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
            moving=true;
        }
        else if (keyH.teclaAbajo == true) {
            direccion="down";
            moving=true;
        }
        else if (keyH.teclaIzquierda == true) {
            direccion= "left";
            moving = true;
        }
        else if (keyH.teclaDerecha==true) {
            direccion= "right";
            moving = true;
        }
        
        collisionOn=false;
        gp.cChecker.checkTile(this);
        int objIndex=gp.cChecker.checkObject(this, true);
        pickUpObject(objIndex);
        
        if(moving && collisionOn==false){
            switch(direccion){
                case "up":
                    worldY-=velocidad;
                    break;
                case "down":
                    worldY+=velocidad;
                    break;
                case "left":
                    worldX -= velocidad;
                    break;
                case "right":
                    worldX += velocidad;
                    break;
            }
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
    public void pickUpObject(int i){
        if(i!=999){
            int base=(i/4)*4;
            int x0=gp.obj[base].worldX;
            int y0=gp.obj[base].worldY;
            int x1=gp.obj[base+1].worldX;
            int y1=gp.obj[base+1].worldY;
            int x2=gp.obj[base+2].worldX;
            int y2=gp.obj[base+2].worldY;
            int x3=gp.obj[base+3].worldX;
            int y3=gp.obj[base+3].worldY;
            gp.obj[base]= new OBJ_roca1();
            gp.obj[base+1]= new OBJ_roca2();
            gp.obj[base+2]= new OBJ_roca3();
            gp.obj[base+3]= new OBJ_roca4();
            gp.obj[base].worldX = x0;
            gp.obj[base].worldY = y0;
            gp.obj[base+1].worldX = x1;
            gp.obj[base+1].worldY = y1;
            gp.obj[base+2].worldX = x2;
            gp.obj[base+2].worldY = y2;
            gp.obj[base+3].worldX = x3;
            gp.obj[base+3].worldY = y3;
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
        g2.drawImage(imagen, screenX, screenY, gp.tileSize, gp.tileSize, null);
    }
}
