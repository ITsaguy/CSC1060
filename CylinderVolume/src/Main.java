import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = in.nextDouble();

        System.out.print("Enter the length: ");
        double length = in.nextDouble();

        double area = computeArea(radius);
        double volume = computeVolume(area, length);

        System.out.println("The volume of the cylinder is " + volume);
    }

    public static double computeArea(double radius) {
        return radius * radius * Math.PI;
    }

    public static double computeVolume(double area, double length) {
        return area * length;
    }
}