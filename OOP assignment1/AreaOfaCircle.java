import java.util.Scanner;

public class AreaOfaCircle{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide the value of a radius");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius ;
        System.out.println("Area of a circle is equal to: " + area);
    }
}