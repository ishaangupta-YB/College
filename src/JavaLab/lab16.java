package JavaLab;

import java.awt.*;
import java.awt.event.*;

class mouseAdapt extends MouseAdapter {
      Frame f;
      mouseAdapt(){
            f = new Frame("MouseAdapter");
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

class mma extends MouseMotionAdapter {
      Frame f;
      mma(){
            f = new Frame("MouseMotionAdapter");
            f.addMouseMotionListener(this);
            f.setLayout(null);
            f.setSize(600,600);
            f.setVisible(true);
      }

      @Override
      public void mouseDragged(MouseEvent e) {
            System.out.println("Mouse Dragged");
      }

      @Override
      public void mouseMoved(MouseEvent e) {
            System.out.println("Mouse Moved");
      }
}

class keyAdapt extends KeyAdapter {
      Frame f;
      TextField tf;
      keyAdapt(){
            f = new Frame("KeyAdapter");
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

class focusAdapt extends FocusAdapter {
      Frame f;
      focusAdapt(){
            f = new Frame("FocusAdapter");
            f.addFocusListener(this);
            f.setLayout(null);
            f.setSize(600,600);
            f.setVisible(true);
      }

      @Override
      public void focusGained(FocusEvent e) {
            System.out.println("Focus Gained");
      }

      @Override
      public void focusLost(FocusEvent e) {
            System.out.println("Focus Lost");
      }
}

public class lab16{
      public static void main(String[] args) {
//            new mouseAdapt();
//            new mma();
//            new keyAdapt();
            new focusAdapt();
      }
}