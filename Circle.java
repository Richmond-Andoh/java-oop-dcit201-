//Getting the radius and area of a circle

public class Circle {

    private double radius;
    private String color;

    public Circle() {
        radius = 7.4;
        color = "Red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

     public double getRadius() {
        return radius;
    }

    public void setColor(String newColor) {
        this.color = newColor;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI * (radius * radius);
    }


}