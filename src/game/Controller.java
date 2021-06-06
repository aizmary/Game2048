package game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Controller extends KeyAdapter {

    //ссылка на модель, так как нужные методы вызываем у него
    private Model model;
    private View view;


    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    @Override
    public void keyPressed(KeyEvent e) {
    super.keyPressed(e);

    switch (e.getKeyCode()) {
        // какая клавиша будет нажата

        //int direction = 0;
        case KeyEvent.VK_LEFT:
            model.moveLeft();
            break;

        case KeyEvent.VK_RIGHT:
            model.moveRight();
            break;

        case KeyEvent.VK_UP:
            model.moveUp();
            break;

        case KeyEvent.VK_DOWN:
            model.moveDown();
            break;

    }
    model.createNewNumbers();
    view.repaint();
    }




}
