import org.w3c.dom.css.Rect;

import java.util.Scanner;


public class RectangleRunner {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter rectangle 1 length: ");
        int rect1Length = myScanner.nextInt();
        System.out.print("Enter rectangle 1 width: ");
        int rect1Width = myScanner.nextInt();
        System.out.print("Enter rectangle 1 height: ");
        double rect1Height = myScanner.nextDouble();
        System.out.print("Enter rectangle 2 length: ");
        int rect2Length = myScanner.nextInt();
        System.out.print("Enter rectangle 2 width: ");
        int rect2Width = myScanner.nextInt();
        System.out.print("Enter rectangle 2 height: ");
        double rect2Height = myScanner.nextDouble();

        Rectangle rect1 = new Rectangle(rect1Length, rect1Width);
        Rectangle rect2 = new Rectangle(rect2Length, rect2Width);

        int rect1Area = rect1.calculateArea();
        int rect2Area = rect2.calculateArea();

        double volume1 = rect1.calculateBoxVolume(rect1Height);
        double volume2 = rect2.calculateBoxVolume(rect2Height);

        System.out.println("Rectangle 1's Area: " + rect1Area + ", " + "Box Volume: " + volume1);
        System.out.println("Rectangle 2's Area: " + rect2Area + ", " + "Box Volume: " + volume2);


    }
}
