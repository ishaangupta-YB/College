package JavaProgs;

import java.awt.*;
import java.awt.event.*;

//public class awtex {
//      awtex(){
//            Frame f = new Frame();
//            f.setLayout(null);
//            f.setSize(500,500);
//
//            TextField textField = new TextField();
//            textField.setBounds(30,50, 150,40);
//            f.add(textField);
//
//            Button b=new Button("Submit");
//            b.setBounds(30,100,100,40);
//            f.add(b);
//
//            b.addActionListener(new ActionListener(){
//                  public void actionPerformed(ActionEvent e){
//                        System.out.println(textField.getText().toString());
//                  }
//            });
//
//            f.setVisible(true);
//      }
//
//      public static void main(String[] args) {
//            awtex a = new awtex();
//      }
//}

public class awtex implements ActionListener{
      TextField textField;
      Button b;
      awtex(){
            Frame f = new Frame();
            f.setLayout(null);
            f.setSize(500,500);

            textField = new TextField();
            textField.setBounds(30,50, 150,40);
            f.add(textField);

            b=new Button("Submit");
            b.setBounds(30,100,100,40);
            b.addActionListener(this);
            f.add(b);

            f.setVisible(true);
      }

      public static void main(String[] args) {
            awtex a = new awtex();
      }

      @Override
      public void actionPerformed(ActionEvent e) {
           if(e.getSource().equals(b))  System.out.println(textField.getText().toString());
      }
}
