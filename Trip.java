import java.util.Scanner;

public class Trip {

    public static void main(String[] args) {
        Trip main = new Trip();
        main.inputdrive();

    }

    private void inputdrive() {
        double gallon;
        double mile;
        double milegallon;

        System.out.print("enter gallons used in tank (-1 for exit): ");
        Scanner scanner = new Scanner(System.in);
        gallon = scanner.nextDouble();

        while (gallon != -1) {
            System.out.print("Please enter distance in miles: ");
            mile = scanner.nextDouble();

            milegallon = mile / gallon;
            System.out.println("Mile per gallon is: " + milegallon);
        }
    }
}