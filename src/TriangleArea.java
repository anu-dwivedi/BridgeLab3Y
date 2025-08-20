
import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = input.nextDouble();
        System.out.print("Enter height: ");
        double height = input.nextDouble();
        double areaCm2 = 0.5 * base * height;
        double areaInch2 = areaCm2 / (2.54 * 2.54);
        System.out.println("Area of triangle is " + areaCm2 + " cm^2 and " + areaInch2 + " inch^2");
        input.close();
    }
}
