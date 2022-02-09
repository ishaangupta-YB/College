package JavaLab;
import java.util.Locale;
import java.util.Scanner;

public class lab10 {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter name");
            String name = sc.nextLine();
            System.out.println("Full name "+name);
            String[] s = name.split(" ");
            String ans = "";
            for(int i=0;i<s.length-1;i++)
                  ans+=s[i].toUpperCase().charAt(0)+". ";
            ans+=s[s.length-1];
            System.out.println("Abbreviated Name "+ans);
      }
}
