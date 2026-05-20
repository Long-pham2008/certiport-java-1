import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Rectangle
{
    // TO DO: Create attributes for your Rectangle class
    private double length;
    private double width;
    
    // TO DO: Create constructor(s) for your Rectangle class
    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double size)
    {
        this(size, size);
    }

    public Rectangle()
    {
        this(1.0);
    }

    // TO DO: Create methods that compute the perimeter and area of your Rectangle
    public double Area()
    {
        double area = length * width;
        return area;
    }

    public double Perimeter()
    {
        double perimeter = (length + width) * 2;
        return perimeter;
    }

    public static void main(String[] args) throws IOException
    {
        File f = new File("input.txt");
        Scanner scan = new Scanner(f);

        String name = scan.nextLine();
        int grade = Integer.parseInt(scan.nextLine());

        System.out.printf("Hello %s! You are in %dth grade!%n", name, grade);

        // TO DO: Add code that reads in a third and fourth line, which are the GPA and school name.
        double GPA = Double.parseDouble(scan.nextLine());
        String school = scan.nextLine();
        // Add these fields to your input.txt
        // Print a message that displays these values
        System.out.printf("Hello %s! You are in %dth grade! Your GPA is %.1f and you go to %s.%n", name, grade, GPA, school);


        // TO DO: Create Rectangle objects and compute their perimeter and areas
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(2,4);
        Rectangle rectangle3 = new Rectangle(3);

        System.out.println("Area for the first rectangle is " + rectangle1.Area());
        System.out.println("Perimeter for the second rectangle is " + rectangle2.Perimeter());
        System.out.println("Area for the third rectangle is " + rectangle3.Area());

        scan.close();
    }
}