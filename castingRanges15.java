import java.util.Scanner;
public class castingRanges15 {
    public static void main(String[] args) {
        //program for converting temp in farenheit to celsius
        Scanner scanner = new Scanner(System.in);
        // asking the user for temp in farenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        //formula for converting temp from farenheit to celsius
        double celsius = (fahrenheit - 32) * 5 / 9;
        int celsiusRounded = (int)(celsius + 0.5);
        //printing out the temp in celsius
        System.out.println("Temperature in Celsius: " + celsiusRounded);
    }
}
