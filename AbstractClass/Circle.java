public class Circle extends Shape {
    double radius;
    // Constructor
    public Circle(double radius){
         this.radius = radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * Math.PI * this.radius;
    }
    
}