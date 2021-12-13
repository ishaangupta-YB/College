package JavaProgs;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class awtwindowex implements WindowListener {
      Frame f;
      awtwindowex (){
            f = new Frame("Window Ex");
            f.addWindowListener(this);
            f.setSize(700,700);
            f.setLayout(null);
            f.setVisible(true);
      }

      @Override
      public void windowOpened(WindowEvent e) {
            System.out.println("Window Opened");
      }

      @Override
      public void windowClosing(WindowEvent e) {
            System.out.println("Window Closing");
      }

      @Override
      public void windowClosed(WindowEvent e) {
            System.out.println("Window Closed");
            f.dispose();
      }

      @Override
      public void windowIconified(WindowEvent e) {
            System.out.println("Window Conified");
      }

      @Override
      public void windowDeiconified(WindowEvent e) {
            System.out.println("Window Deiconified");
      }

      @Override
      public void windowActivated(WindowEvent e) {
            System.out.println("Window Activated");
      }

      @Override
      public void windowDeactivated(WindowEvent e) {
            System.out.println("Window Deactivated");
      }


      public static void main(String[] args) {
            awtwindowex a = new awtwindowex();
      }
}
