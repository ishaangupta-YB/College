package JavaLab;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab14 {
      lab14(){
            Frame f = new Frame("lab14");
            f.setSize(700,700);

            TextField tf = new TextField();
            tf.setBounds(200,300,150,20);
            f.add(tf);

            Button b1 = new Button("Button 1");
            b1.setBounds(200,400,150,20);
            f.add(b1);

            Button b2 = new Button("Button 2");
            b2.setBounds(400,400,150,20);
            f.add(b2);

            b1.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        System.out.println("Button1 Clicked");
                  }
            });

            b2.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        System.out.println("Button2 Clicked\nText in TextField is :"+tf.getText());
                  }
            });
            f.setLayout(null);
            f.setVisible(true);
      }

      public static void main(String[] args) {
            lab14 lb = new lab14();
      }
}
