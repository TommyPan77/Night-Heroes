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
public class OBJ_arco2 extends SuperObject {

    public OBJ_arco2() {
        name="arco2";
        try{
           image=ImageIO.read(getClass().getResourceAsStream("/res/player/objects/Roca con arco arriba derecha.png/")) ;
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    
}
