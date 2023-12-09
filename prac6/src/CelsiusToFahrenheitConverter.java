public class CelsiusToFahrenheitConverter implements Converter {
    @Override
    public double convert(double temperature) {
        return (temperature * 9/5) + 32;
    }
}