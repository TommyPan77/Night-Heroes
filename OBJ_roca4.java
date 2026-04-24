/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package object;

import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author USER
 */
public class OBJ_espada2 extends SuperObject {
    public OBJ_espada2(){
        name="espada1";
        try{
           image=ImageIO.read(getClass().getResourceAsStream("/res/player/objects/Roca con espada arriba derecha.png/")) ;
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
