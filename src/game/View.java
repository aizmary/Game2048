package game;

import javax.swing.*;
import java.awt.event.KeyListener;

public class View extends JFrame{




    private JPanel mainPanel;
    private Model model;
    private Controller controller;


    public View() {
        model = new Model();
        controller = new Controller(model,this);
        mainPanel = new MainPanel(model);
        this.add(mainPanel);


        //we should add controller
        //controller наследуется от KeyAdapter, который имплементирует KeyListener
        //this.addKeyListener(controller);

        mainPanel.addKeyListener(controller);
        mainPanel.setFocusable(true);
        mainPanel.requestFocus();


        this.setSize(500,500);
        this.setTitle("2048 - 3x3");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);



    }
}
