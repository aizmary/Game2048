package gui;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main extends JFrame {

    JPanel panel;
    Model model;

    private final int size = 8;

    {
        panel = new ChessBoard(size);
        model = new Model(size);
    }

    Main() {
        add(panel, BorderLayout.CENTER);
        panel.addKeyListener(new ModelListener());
        panel.setFocusable(true);
        panel.requestFocus();
    }

    public static void main(String[] args) {
        JFrame frame = new Main();

        frame.setTitle("Chessboard");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    class ChessBoard extends JPanel {

        private int cells;

        ChessBoard(int cells) {
            this.cells = cells;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            int width = getWidth() / cells;
            int height = getHeight() / cells;

            Color color = null;
            for (int row = 0; row < cells; row++) {
                for (int col = 0; col < cells; col++) {
                    if (row % 2 == 0) {
                        color = col % 2 == 0 ? Color.BLACK : Color.WHITE;
                    } else {
                        color = col % 2 == 0 ? Color.WHITE : Color.BLACK;
                    }
                    g.setColor(color);
                    g.fillRect(row * width, col * height, width, height);

                }
                g.setColor(Color.RED);
                g.fillOval(model.getRow() * width, model.getCol() * height, width, height);
            }
        }
    }

    class ModelListener extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();

            switch (key) {
                case KeyEvent.VK_LEFT:
                    model.moveLeft();
                    break;

                case KeyEvent.VK_UP:
                    model.moveUp();
                    break;

                case KeyEvent.VK_RIGHT:
                    model.moveRight();
                    break;

                case KeyEvent.VK_DOWN:
                    model.moveDown();
                    break;
                //37
                //38
                //39
                //40
            }
            repaint();
        }
    }

    class Model {

        private int size;
        private int row;
        private int col;

        public Model(int size) {
            this.size = size;
        }

        public void moveUp() {
            if (col > 0) {
                col--;
            } else {
                col = size - 1;
            }
        }

        public void moveDown() {
            if (col + 1 < size) {
                col++;
            }
        }

        public void moveLeft() {
            if (row > 0) {
                row--;
            }
        }

        public void moveRight() {
            if (row + 1 < size) {
                row++;
            }
        }

        public int getRow() {
            return row;
        }

        public int getCol() {
            return col;
        }
    }

}

