package JavaProgs;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class awtmousex implements MouseListener {
      Frame f;

      awtmousex(){
            f = new Frame("Mouse Example");
            f.addMouseListener(this);
            f.setLayout(null);
            f.setSize(600,600);
            f.setVisible(true);
      }

      @Override
      public void mouseClicked(MouseEvent e) {
            System.out.println("Mouse Clicked");
      }

      @Override
      public void mousePressed(MouseEvent e) {
            System.out.println("Mouse Pressed");
      }

      @Override
      public void mouseReleased(MouseEvent e) {
            System.out.println("Mouse Released");
      }

      @Override
      public void mouseEntered(MouseEvent e) {
            System.out.println("Mouse Entered");
      }

      @Override
      public void mouseExited(MouseEvent e) {
            System.out.println("Mouse Exited");
      }

      public static void main(String[] args) {
            awtmousex a = new awtmousex();
      }
}
