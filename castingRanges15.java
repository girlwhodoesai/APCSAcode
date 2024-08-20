import java.util.Scanner;
public class castingRanges15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        int celsiusRounded = (int)(celsius + 0.5);
        System.out.println("Temperature in Celsius: " + celsiusRounded);
    }
}
