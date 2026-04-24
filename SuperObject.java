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
public class OBJ_espada3 extends SuperObject {
    public OBJ_espada3(){
        name="espada3";
        try{
           image=ImageIO.read(getClass().getResourceAsStream("/res/player/objects/Roca con espada abajo izquierda.png/")) ;
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}
