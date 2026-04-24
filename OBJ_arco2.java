package main;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    public boolean teclaArriba, teclaAbajo, teclaIzquierda, teclaDerecha;
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int codigo = e.getKeyCode();
        if (codigo == KeyEvent.VK_W) {
            teclaArriba = true;
        }
        if (codigo == KeyEvent.VK_A) {
            teclaIzquierda = true;
        }
        if (codigo == KeyEvent.VK_S) {
            teclaAbajo = true;
        }
        if (codigo == KeyEvent.VK_D) {
            teclaDerecha = true;
        } 
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int codigo = e.getKeyCode();
        if (codigo == KeyEvent.VK_W) {
            teclaArriba = false;
        }
        if (codigo == KeyEvent.VK_A) {
            teclaIzquierda = false;
        }
        if (codigo == KeyEvent.VK_S) {
            teclaAbajo = false;
        }
        if (codigo == KeyEvent.VK_D) {
            teclaDerecha = false;
        }
    }
}
