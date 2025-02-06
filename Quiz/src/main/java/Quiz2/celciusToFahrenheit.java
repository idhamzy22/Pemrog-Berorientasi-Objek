package Quiz2;

public class celciusToFahrenheit {
    public static double celciusToFahrenheit(double celcius) {
        return (celcius * 9/5) + 32;
    }

    public static void main(String[] args) {
        double celcius = 10.0;
        System.out.println(celcius + " derajat Celcius sama dengan " + celciusToFahrenheit(celcius) + " derajat Fahrenheit.");
    }
}