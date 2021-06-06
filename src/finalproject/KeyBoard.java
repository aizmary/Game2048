package finalproject;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoard implements KeyListener {


    public static boolean[] keys = new boolean[120];
    public static boolean[] lastKeys = new boolean[120];


    public void update() {
        for(int i = 0; i < keys.length; i++) {
            lastKeys[i] = keys[i];
        }
    }

    public static boolean keyDown(int key) {
        return keys[key] && !lastKeys[key];
    }

    public static boolean keyUp(int key) {
        return !keys[key] && lastKeys[key];
    }

    public static boolean key(int key) {
        return keys[key];
    }



    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;

    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;

    }
}
