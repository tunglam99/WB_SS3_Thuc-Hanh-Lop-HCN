import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width");
        double width = scanner.nextDouble();
        System.out.println("Enter the height");
        double height = scanner.nextDouble();

        Rectangle rectangle1 = new Rectangle(width,height);
        System.out.println("Your Rectangle" + rectangle1.display());
        System.out.println("Your Area" + rectangle1.getArea());
        System.out.println("Your Perimeter" + rectangle1.getPerimeter());
    }
}
