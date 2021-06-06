package game;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel {

    private Model model;



    public MainPanel(Model model) {
        this.model = model;

        Color color = new Color(0x779ABA);
        this.setBackground(color);

    }


    @Override
    protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    Color color = new Color(2, 4, 90);


    int cellSize = 120;
    int gap = 10;
    int width = 400; //размеры одного кубика
    int height = 400;



    int x = getWidth() / 2 - width / 2;
    int y = getHeight() / 2 - height / 2;

   g.setColor(color);
   g.fillRoundRect(x,y,width,height,10,10);
   drawCells(g,cellSize,gap,x + gap, y + gap);




    }

    private void drawCells(Graphics g, int size, int gap, int x, int y) {
        int [][] gameField = model.getCanvas();


        Color color = new Color(172, 151, 151);
        g.setColor(color);
        int zeroX = x;



        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                switch (gameField[i][j]) {
                    case 0:
                        color = new Color(0xD6D6E2);

                        break;

                    case 2:
                        g.setColor(Color.YELLOW);
                        g.drawString("2",x,y);
                        color = new Color(255, 181, 181);
                        break;

                    case 4:
                        g.setColor(Color.YELLOW);
                        g.drawString("4",x,y);
                        color = new Color(14, 51, 236);
                        break;

                    case 8:
                        g.setColor(Color.YELLOW);
                        g.drawString("8",x,y);
                        color = new Color(19, 222, 86);
                        break;

                    case 16:
                        g.setColor(Color.YELLOW);
                        g.drawString("16",x,y);
                        color = new Color(203, 17, 255);
                        break;

                    case 32:
                        g.setColor(Color.YELLOW);
                        g.drawString("32",x,y);
                        color = new Color(161, 10, 145);
                        break;

                    case 64:
                        g.setColor(Color.YELLOW);
                        g.drawString("64",x,y);
                        color = new Color(222, 19, 60);
                        break;

                    case 128:
                        g.setColor(Color.YELLOW);
                        g.drawString("128",x,y);
                        color = new Color(131, 255, 6);
                        break;
                    case 256:
                        g.setColor(Color.YELLOW);
                        g.drawString("256",x,y);
                        color = new Color(18, 255, 186);
                        break;

                    case 512:
                        g.setColor(Color.YELLOW);
                        g.drawString("512",x,y);
                        color = new Color(246, 191, 44);
                        break;

                    case 1024:
                        g.setColor(Color.YELLOW);
                        g.drawString("1024",x,y);
                        color = new Color(160, 104, 97);
                        break;

                    case 2048:
                        g.setColor(Color.YELLOW);
                        g.drawString("2048",x,y);
                        color = new Color(77, 238, 216);
                        break;


                }


                g.setColor(color);
                g.drawRect(x,y,size,size);
                g.fillRoundRect(x,y,size,size,10,10);
                x += size + gap;

            }
            x = zeroX;
            y += size + gap;
        }



    }
}
