import java.util.Scanner;
public class Converter 
{
    public static void main(String args[])
    {
        int m, y, w, d;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of days:");
        m = s.nextInt();
        y = m / 365;
        m = m % 365;
        System.out.println("No. of years:"+y);
        w = m / 7;
        m = m % 7;
        System.out.println("No. of weeks:"+w);
        d = m;
        System.out.println("No. of days:"+d);
    }
}