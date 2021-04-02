import java.util.Scanner;
class CelsiusToFahrenheit 
{
  public static void main(String[] args) 
  {
    double temperature;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter temperature in Celsius");
    temperature = in.nextDouble();
    temperature = (temperature*1.8)+32;
    System.out.println("temperature in Fahrenheit  = " + temperature);
  }
}