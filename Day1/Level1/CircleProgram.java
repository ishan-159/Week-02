class Circle{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double DisplayArea(){
        return Math.PI*Math.pow(radius,2);
    }
    public double DisplayCircumference(){
        return 2*Math.PI*radius;
    }

    public void DisplayCircle(){
        System.out.println("Radius : " + radius);
        System.out.println("Area of Circle : " + DisplayArea());
        System.out.println("Circumference of Circle : " + DisplayCircumference());
    }
}

public class CircleProgram{
    public static void main(String[] args){
        Circle circle1 = new Circle(12);
        Circle circle2 = new Circle(14);

        System.out.println("Circle1");
        circle1.DisplayCircle();
        System.out.println("Circle2");
        circle2.DisplayCircle();
    }
}