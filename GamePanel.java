package entity;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;

public class entity {
    public int worldX,worldY;
    public int velocidad;
    public BufferedImage up1, up2, down1, down2, left1, left2, right1, right2, upIdle, downIdle; //Inicializar imagenes
    public String direccion;
    
    public int spriteCounter=0;
    public int spriteNumber=1;
    
    public Rectangle solidArea;
    public int solidAreaDefaultX, solidAreaDefaultY;
    public boolean collisionOn=false;
}
