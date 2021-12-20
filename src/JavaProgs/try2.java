package JavaProgs;

import java.util.ArrayList;
import java.util.Iterator;

public class try2 {
      public static void main(String[] args) {
            ArrayList<Integer> arrayList  = new ArrayList<>();
            for(int i=0;i<10;i++) arrayList.add(i);
//            arrayList.add(2);
//            arrayList.remove(0);
            System.out.println(arrayList);

            Iterator<Integer> it = arrayList.iterator();
            while (it.hasNext()){
                  System.out.println(it.next());
            }
      }
}
