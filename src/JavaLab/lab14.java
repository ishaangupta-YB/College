package JavaLab;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lab14 implements ActionListener {
      Button b2;
      TextField tf;
      lab14(){
            Frame f = new Frame("lab14");
            f.setSize(400,400);

            tf = new TextField();
            tf.setBounds(100,100,150,20);
            f.add(tf);

            Button b1 = new Button("Clear Textfield");
            b1.setBounds(100,200,200,20);
            f.add(b1);

            b2 = new Button("Print Textfield");
            b2.setBounds(100,300,200,20);
            f.add(b2);

            b1.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        tf.setText(null);
                        System.out.println("Clear TextField Button Clicked");
                  }
            });

            b2.addActionListener(this);
            f.setLayout(null);
            f.setVisible(true);
      }

      @Override
      public void actionPerformed(ActionEvent e) {
            if(e.getSource() == b2){
                  System.out.println("Print Textfield Button Clicked\nText in TextField is : "+tf.getText());
            }
      }

      public static void main(String[] args) {
            new lab14();
      }
}
