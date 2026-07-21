import java.util.Scanner;

public class testTempture {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        temperatureDemo temp = new temperatureDemo();

        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();
        System.out.println(c + " °C = " + temp.cToF(c) + " °F");

        System.out.print("Enter temperature in Fahrenheit: ");
        double f = sc.nextDouble();
        System.out.println(f + " °F = " + temp.fToC(f) + " °C");

        sc.close();
    }
}
