package Variables;

public class FahrenheitToCelcius {
/* Convert 100 Fahrenheit to Celcius
Google formular:  °C = (°F - 32) × 5/9;
OBS: hvis svaret er i decimaltal, skal Fahrenheit være en double, selvom den er et heltal.
 */

    public static void main(String[] args) {
        double f = 100;
        double svar =(f-32) * 5/9;

        System.out.println(svar);

    }
}
