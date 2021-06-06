package swinglibrary;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class Lights extends JFrame {

        public Lights() {
            BorderLayout borderLayout = new BorderLayout();
            this.setLayout(borderLayout);

            JPanel mainPanel = new MainPanel(Color.BLUE);
            JPanel controlPanel = new ControlPanel(mainPanel, Color.CYAN);

            this.add(mainPanel, BorderLayout.CENTER);
            this.add(controlPanel, BorderLayout.SOUTH);

            this.setSize(300, 300);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
        }
    }

    class MainPanel extends JPanel {

        private Color color;

        public MainPanel(Color color) {
            this.color = color;

            this.setBackground(color);
        }
    }

    class ControlPanel extends JPanel {

        private JButton buttonRed;
        private JButton buttonGreen;
        private JButton buttonBlue;

        private Color color;
        private JPanel panel;

        {
            buttonRed = new JButton("RED");
            buttonGreen = new JButton("GREEN");
            buttonBlue = new JButton("BLUE");
        }

        public ControlPanel(JPanel panel, Color color) {
            this.setBackground(Color.CYAN);

//        buttonRed.setText("RED");
//        buttonGreen.setText("GREEN");
//        buttonBlue.setText("BLUE");

            this.add(buttonRed);
            this.add(buttonGreen);
            this.add(buttonBlue);

            buttonRed.addActionListener(new ButtonActionListener(panel, Color.RED));
            buttonGreen.addActionListener(new ButtonActionListener(panel, Color.GREEN));
            buttonBlue.addActionListener(new ButtonActionListener(panel, Color.BLUE));

        }
    }

    class ButtonActionListener implements ActionListener {

        private Color color;
        private JPanel panel;

        public ButtonActionListener(JPanel panel, Color color) {
            this.color = color;
            this.panel = panel;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(color);
        }
    }

