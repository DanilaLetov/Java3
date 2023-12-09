import java.util.Scanner;

public class TemperatureConverter {
    public static void Farrenheit() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsiusTemperature = scanner.nextDouble();

        Converter kelvinConverter = new CelsiusToKelvinConverter();
        double kelvinTemperature = kelvinConverter.convert(celsiusTemperature);

        Converter fahrenheitConverter = new CelsiusToFahrenheitConverter();
        double fahrenheitTemperature = fahrenheitConverter.convert(celsiusTemperature);

        System.out.println("Celsius: " + celsiusTemperature);
        System.out.println("Kelvin: " + kelvinTemperature);
        System.out.println("Fahrenheit: " + fahrenheitTemperature);
    }
}