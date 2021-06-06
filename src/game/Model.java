package game;

import java.util.Random;

public class Model {

        private int[][] canvas = new int[5][5];
        private Random rnd = new Random();

        public Model() {

            createNewNumbers();
        }

        public void rotate() {
            int[][] temp = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    temp[2 - j][i] = canvas[i][j];
                }
            }
            canvas = temp;
        }

        public void move(int[] array) {
            int defaultPosition = 0;
            for (int row = 0; row < 3; row++) {
                for (int column = 2; column > 0; column--) {
                    if (array[column - 1] == 0) {
                        array[column - 1] = array[column];
                        array[column] = 0;
                    }
                }
            }
        }

        public void connect(int[] array) {
            for (int row = 2; row > 0; row--) {
                if (array[row - 1] == array[row]) {
                    array[row - 1] *= 2;
                    array[row] = 0;
                }
            }
        }

        public void moveLeft() {
            for (int[] row : canvas) {
                move(row);
                connect(row);
            }

        }

        public void moveRight() {
            rotate();
            rotate();
            moveLeft();
            rotate();
            rotate();
        }

        public void moveDown() {
            rotate();
            rotate();
            rotate();
            moveLeft();
            rotate();
        }

        public void moveUp() {

            rotate();
            moveLeft();
            rotate();
            rotate();
            rotate();
        }

        public int[][] getCanvas() {

            return canvas;
        }

        public void createNewNumbers() {
            boolean visited = false;
            do {
                int x = rnd.nextInt(3);
                int y = rnd.nextInt(3);

                if (canvas[x][y] == 0) {
                    canvas[x][y] = rnd.nextInt(10) < 9 ? 2 : 4;
                    visited = true;

                }
            }while(!visited);
        }
    }

