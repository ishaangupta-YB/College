package JavaProgs;

import java.awt.*;
import java.awt.event.*;

class ma extends MouseAdapter {
      Frame f;
      ma(){
            f = new Frame("Mouse Adapter");
            f.addMouseListener(this);
            f.setLayout(null);
            f.setSize(600,600);
            f.setVisible(true);
      }

      @Override
      public void mouseClicked(MouseEvent e) {
            System.out.println("Clicked");
      }

      @Override
      public void mousePressed(MouseEvent e) {
            System.out.println("Pressed");
      }
}

class ka extends KeyAdapter {
      Frame f;
      TextField tf;
      ka(){
            f = new Frame("Key Adapter");
            tf = new TextField();
            tf.setBounds(200,200,300,30);
            f.add(tf);

            tf.addKeyListener(this);

            f.setLayout(null);
            f.setSize(600,600);
            f.setVisible(true);
      }

      @Override
      public void keyPressed(KeyEvent e) {
            System.out.println("Key Pressed");
      }

      @Override
      public void keyReleased(KeyEvent e) {
            System.out.println("Key Released");
      }
}
public class prc{
      public static void main(String[] args) {
            new ma();
            new ka();
      }
}