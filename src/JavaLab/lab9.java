package JavaLab;

import java.util.Arrays;

public class lab9 {
      public static void main(String[] args) {
            String a = "Ishaan";
            String b = new String("Gupta");
            System.out.println("Original String of A "+a);
            System.out.println("Original String of B "+b);
            System.out.println("First char of a "+a.charAt(0));
            System.out.println("Check if a is empty "+a.isEmpty());
            System.out.println("Length of a "+a.length());
            char[] ch = a.toCharArray();
            System.out.println("Convert a to char array "+ch);
            System.out.println("Uppercase "+a.toUpperCase());
            System.out.println("Lowercase "+a.toLowerCase());
            String c = a.concat(b);
            System.out.println("A concatenate to B "+c);
            System.out.println("If a == b "+a == b);
            System.out.println("If a.equals(b) "+a.equals(b));
            System.out.println("Index of 'n' "+a.indexOf('n'));
            System.out.println("Split string "+ Arrays.toString(c.split("n")));
            String x = "  ishaan   ";
            System.out.println("Trim the string "+x.trim());
            System.out.println("Substring from index-2 : "+a.substring(2));
      }
}
