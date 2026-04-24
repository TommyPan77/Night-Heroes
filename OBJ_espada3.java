/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;

import java.io.IOException;
import javax.imageio.ImageIO;
import object.SuperObject;

/**
 *
 * @author USER
 */
public class OBJ_escudo1 extends SuperObject {

    public OBJ_escudo1() {
        name="escudo1";
        try{
           image=ImageIO.read(getClass().getResourceAsStream("/res/player/objects/Roca con arco arriba izquierda.png/")) ;
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    
}
