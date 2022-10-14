package Six_practice.eleventhTask;

public class Convert implements Convertable {
    private double celsius;

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    @Override
    public void convertKelvin(float celsius) {
        float kelvin = celsius + 273.15f;
        System.out.println(kelvin + " kelvins");
    }

    @Override
    public void convertFahrenheit(double celsius) {
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println(fahrenheit + " fahrenheit");
    }
}
