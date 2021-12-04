package JavaProgs;

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class awtpage {

      awtpage(){
            Frame f = new Frame("Registration Page");
            f.setLayout(null);
            f.setSize(500,500);

            Label namel = new Label("Name");
            namel.setBounds(30,50,50,20);
            f.add(namel);

            TextField name = new TextField();
            name.setBounds(90,50,120,20);
            f.add(name);

            Label genderl = new Label("Gender");
            genderl.setBounds(30,100,50,20);
            f.add(genderl);

            CheckboxGroup cg = new CheckboxGroup();
            Checkbox cb1 = new Checkbox("Male", cg, true);
            cb1.setBounds(90,100, 70,30);
            Checkbox cb2 = new Checkbox("Female", cg, false);
            cb2.setBounds(170,100, 90,30);
            f.add(cb1); f.add(cb2);

            Label agel = new Label("Age");
            agel.setBounds(30,150,50,20);
            f.add(agel);

            TextField age = new TextField();
            age.setBounds(90,150,120,20);
            f.add(age);

            Label subjectl = new Label("Subject");
            subjectl.setBounds(30,210,50,20);
            f.add(subjectl);

            Checkbox javacb = new Checkbox("Java");
            javacb.setBounds(90, 210,  70, 20);
            f.add(javacb);

            Checkbox adacb = new Checkbox("Ada");
            adacb.setBounds(180, 210,  70, 20);
            f.add(adacb);

            Checkbox secb = new Checkbox("SE");
            secb.setBounds(90, 260,  70, 20);
            f.add(secb);

            Checkbox dccb = new Checkbox("DC");
            dccb.setBounds(180, 260,  70, 20);
            f.add(dccb);

            Checkbox imcb = new Checkbox("IM");
            imcb.setBounds(90, 300,  70, 20);
            f.add(imcb);

            Checkbox cspcb = new Checkbox("CSP");
            cspcb.setBounds(180, 300,  70, 20);
            f.add(cspcb);

            Label collegel = new Label("College Name");
            collegel.setBounds(30,340,100,20);
            f.add(collegel);

            TextField college = new TextField();
            college.setBounds(150,340,120,20);
            f.add(college);

            Label hobbiesl = new Label("Hobbies");
            hobbiesl.setBounds(30,380,100,40);
            f.add(hobbiesl);

            TextField hobbies = new TextField();
            hobbies.setBounds(150,380,150,40);
            f.add(hobbies);

            Button submit = new Button("Submit");
            submit.setBounds(120,440,80,30);
            f.add(submit);

            submit.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                        if(e.getSource().equals(submit)){
                              System.out.println("Details are\n"+"\nName - "+name.getText().toString()+
                                      "\nGender - "+cg.getSelectedCheckbox().getLabel().toString()+"\nAge - "+age.getText().toString()
                                      +"\nSubjects - "+((javacb.getState())?javacb.getLabel().toString()+",":"")+
                                      ((adacb.getState())?adacb.getLabel().toString()+",":"")
                                      +((dccb.getState())?dccb.getLabel().toString()+",":"")
                                      +((imcb.getState())?imcb.getLabel().toString()+",":"")
                                      +((secb.getState())?secb.getLabel().toString()+",":"")
                                      +((cspcb.getState())?cspcb.getLabel().toString()+",":"")
                                      +"\nHobbies - "+hobbies.getText().toString()+"\nCollege Name - "+college.getText().toString());
                        }
                  }
            });

            f.setVisible(true);
      }

      public static void main(String[] args) {
            awtpage a = new awtpage();
      }
}
