abstract class Shape
{
    abstract public double perimeter();

    abstract public double area();
}

class Circle extends Shape
{
    double radius;

    public double perimeter()
    {
        return 2 * Math.PI *radius;
    }

    public double area()
    {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape
{
    double length, breadth;

    public double perimeter()
    {
        return 2 * (length + breadth);
    }

    public double area()
    {
        return length * breadth;
    }
}


public class Shape_Challenge {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.length = 10;
        r.breadth = 5;
        System.out.println("Rectangle:\n==========");
        System.out.println("Area:\t\t" + r.area());
        System.out.println("Perimeter:\t" + r.perimeter());

        Circle c = new Circle();
        c.radius = 5;
        System.out.println("Circle:\n==========");
        System.out.printf("Area:\t\t%.2f", c.area());
        System.out.printf("\nPerimeter:\t%.2f", c.perimeter());

    }
}
