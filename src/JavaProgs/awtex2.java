package JavaProgs;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class awtex2 {

      awtex2(){
            Frame f = new Frame("awtex2");
            f.setLayout(null);
            f.setSize(500,500);

            Label mathsl = new Label("Maths");
            mathsl.setBounds(30,50,50,30);
            f.add(mathsl);

            TextField maths = new TextField();
            maths.setBounds(130,50, 150,30);
            f.add(maths);

            Label physicsl = new Label("Physics");
            physicsl.setBounds(30,90,50,30);
            f.add(physicsl);

            TextField physics = new TextField();
            physics.setBounds(130,90, 150,30);
            f.add(physics);

            Label cheml = new Label("Chemistry");
            cheml.setBounds(30,140,100,30);
            f.add(cheml);

            TextField chem = new TextField();
            chem.setBounds(130,140, 150,30);
            f.add(chem);

            Label ans = new Label();
            ans.setBounds(100,180,50,50);
            f.add(ans);

            Button total=new Button("Total");
            total.setBounds(50,230,100,40);
            total.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        int m = Integer.parseInt(maths.getText().toString());
                        int p = Integer.parseInt(physics.getText().toString());
                        int c = Integer.parseInt(chem.getText().toString());
                        ans.setText("Total value is "+String.valueOf(m+p+c));
                  }
            });
            f.add(total);

            Button perce=new Button("Percent");
            perce.setBounds(170,230,100,40);
            perce.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        int m = Integer.parseInt(maths.getText().toString());
                        int p = Integer.parseInt(physics.getText().toString());
                        int c = Integer.parseInt(chem.getText().toString());
                        int per = (m+p+c)/3;
                        ans.setText("Percentage is "+String.valueOf(per)+"%");
                  }
            });
            f.add(perce);

            f.setVisible(true);
      }

      public static void main(String[] args) {
            awtex2 aw = new awtex2();
      }
}
