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
public class OBJ_arco4 extends SuperObject {

    public OBJ_arco4() {
        name="arco4";
        try{
           image=ImageIO.read(getClass().getResourceAsStream("/res/player/objects/Roca con arco abajo derecha.png/")) ;
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    
}
