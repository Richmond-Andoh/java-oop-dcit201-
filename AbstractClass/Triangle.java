public class Triangle extends Shape{
    private double slantSide1;
    private double slantSide2;
    private double base;
    
    //Constructor
    public Triangle(double base, double slantSide1, double slantSide2){
        this.slantSide1 = slantSide1;
        this.slantSide2 = slantSide2;
        this.base = base;
    }
       

    @Override
    public double calculateArea(){
        double semiPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(semiPerimeter * semiPerimeter - slantSide1 * semiPerimeter - slantSide2 * semiPerimeter - base);
    }

    @Override
    public double calculatePerimeter(){
        return  slantSide1 + slantSide2 + base;
    }
}

// public class Triangle extends Shape {
//     double side1, side2, side3;

//     Triangle(double side1, double side2, double side3) {
//         this.side1 = side1;
//         this.side2 = side2;
//         this.side3 = side3;
//     }

//     @Override
//     double calculateArea() {
//         double semiPerimeter = calculatePerimeter() / 2;
//         return Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
//     }

//     @Override
//     double calculatePerimeter() {
//         return side1 + side2 + side3;
//     }
// }