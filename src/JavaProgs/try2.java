package JavaProgs;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Iterator;

public class try2 {
      public static void main(String[] args) {
            int index=0;
            String[] box = {"Red","green","blue","black"};
            try{
                  double x = 9.0/0.0;
                  index++;
                  int y = 5/0;
                  index++;
            }catch (ArithmeticException e){
                  index++;
            }finally {
                  index++;
            }
            System.out.printf(box[index]);


      }
}
