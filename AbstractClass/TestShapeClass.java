
// public class TestShapeClass {
//      public static void main(String[] args){
//             Triangle triangle = new Triangle();
//             System.out.println("Triangle Area: " + triangle.calculateArea());
//      }
// }

public class TestShapeClass {
    public static void main(String[] args) {
        Circle circle = new Circle(8);
        System.out.println("Area of circle " + " " + circle.calculateArea());
        System.out.println("Perimeter of circle " + " " + circle.calculatePerimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Perimeter of triangle" + " " + triangle.calculatePerimeter());
        System.out.println("Area of triangle" + " " + triangle.calculateArea());
    }
}
