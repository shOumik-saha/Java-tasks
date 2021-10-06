import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        double Salary = 200;
        double percent = 9;
        double SalesPercent;
        double totalSalary;

        System.out.print("Enter Companies Sales Quantity: ");
        Scanner scanner = new Scanner(System.in);
        SalesPercent = scanner.nextDouble();

        totalSalary = (SalesPercent * (percent/100));

        System.out.println("Total Salary " + (totalSalary+Salary));
    }
}