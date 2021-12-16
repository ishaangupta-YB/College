package JavaLab;

import java.awt.*;
import java.awt.event.*;

//public class lab16 extends MouseAdapter {
//      Frame f;
//      lab16(){
//            f = new Frame("Lab 16");
//            f.addMouseListener(this);
//            f.setLayout(null);
//            f.setSize(600,600);
//            f.setVisible(true);
//      }
//
//      @Override
//      public void mouseClicked(MouseEvent e) {
//            System.out.println("Clicked");
//      }
//
//      @Override
//      public void mousePressed(MouseEvent e) {
//            System.out.println("Pressed");
//      }
//
//      public static void main(String[] args) {
//            new lab16();
//      }
//}

//public class lab16 extends MouseMotionAdapter {
//      Frame f;
//      lab16(){
//            f = new Frame("Lab 16");
//            f.addMouseMotionListener(this);
//            f.setLayout(null);
//            f.setSize(600,600);
//            f.setVisible(true);
//      }
//
//      @Override
//      public void mouseDragged(MouseEvent e) {
//            System.out.println("Mouse Dragged");
//      }
//
//      @Override
//      public void mouseMoved(MouseEvent e) {
//            System.out.println("Mouse Moved");
//      }
//
//      public static void main(String[] args) {
//            new lab16();
//      }
//}

//public class lab16 extends KeyAdapter {
//      Frame f;
//      TextField tf;
//      lab16(){
//            f = new Frame("Lab 16");
//            tf = new TextField();
//            tf.setBounds(200,200,300,30);
//            f.add(tf);
//
//            tf.addKeyListener(this);
//
//            f.setLayout(null);
//            f.setSize(600,600);
//            f.setVisible(true);
//      }
//
//      @Override
//      public void keyPressed(KeyEvent e) {
//            System.out.println("Key Pressed");
//      }
//
//      @Override
//      public void keyReleased(KeyEvent e) {
//            System.out.println("Key Released");
//      }
//
//      public static void main(String[] args) {
//            new lab16();
//      }
//}

public class lab16 extends FocusAdapter {
      Frame f;
      TextField tf;
      lab16(){
            f = new Frame("Lab 15");
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

      public static void main(String[] args) {
            new lab16();
      }
}