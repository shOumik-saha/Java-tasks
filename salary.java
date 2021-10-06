import java.util.Scanner;
public class salary
{
 public static void main(String [] args)
 {
   double managerSalary;
   double adminsalary;
   double salesSalary;
   double finalManager;
   double finalAdmin;
   double finalSales;
   
   Scanner scanner=new Scanner(System.in);
   System.out.println("Monthly salary of manager:");
   managerSalary = scanner.nextDouble();
   
   System.out.println("Monthly salary of Admin Officer:");
   adminsalary=scanner.nextDouble();
   
   System.out.println("Monthly salary of Salesman:");
   salesSalary=scanner.nextDouble();
   
   finalManager=managerSalary*12;
   finalAdmin=adminsalary*12;
   finalSales=salesSalary*12;
  
 
 
   System.out.println("Yearly salary of Manager:"+finalManager+"taka");
   System.out.println("Yearly salary of Admin Officers:"+finalAdmin+"taka");
   System.out.println("Yearly salary of Salesman:"+finalSales+"taka");
  
   
   
 }
}