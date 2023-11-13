import java.util.Scanner;

public class CtoF
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double celsiusTemperature = 0;
        boolean isValidInput = false;

        do
        {
            System.out.print("Enter the temperature in Celsius: ");

            if (scanner.hasNextDouble())
            {
                celsiusTemperature = scanner.nextDouble();
                isValidInput = true;
            }
            else
            {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }

        } while (!isValidInput);

        double fahrenheitTemperature = (celsiusTemperature * 9/5) + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheitTemperature);

    }
}
