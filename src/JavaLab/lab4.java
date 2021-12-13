package JavaLab;

abstract class shape{
      public abstract void circleArea(int r);
      public abstract void squareArea(int a);
      public abstract void rectangleArea(int l,int b);
}

class area extends shape{
      @Override
      public void circleArea(int r) {
            System.out.println("Circle Area - "+3.14*r*r);
      }

      @Override
      public void squareArea(int a) {
            System.out.println("Square Area - "+a*a);
      }

      @Override
      public void rectangleArea(int l, int b) {
            System.out.println("Rectangle Area - "+l*b);
      }
}

public class lab4 {
      public static void main(String[] args) {
            area a = new area();
            a.circleArea(5);
            a.squareArea(5);
            a.rectangleArea(2,3);
      }
}
