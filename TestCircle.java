public class TestCircle {

    public static void main(String[] args){
        Circle circle1 = new Circle();

        circle1.setRadius(4.2);
        System.out.println("The radius of cirlce1 is " + circle1.getRadius() + " and it has an area of  " + circle1.getArea());
        
        
        Circle circle2 = new Circle();
        circle2.setColor("Blue");
        System.out.println("The circle has a" + circle2.getColor() + " color");

        Circle circle3 = new Circle();
        circle3.setRadius(2.1);
        circle3.setColor("Green");
        System.out.println("The third has a radius of " + circle3.getRadius() + " and a total area of " + circle3.getArea() + " with a color " + circle3.getColor());
       
        // Error message -> raius has private access
        // Circle circle4 = new Circle();
        // System.out.println(circle4.radius);
    }
}
