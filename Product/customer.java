import java.util.Scanner;
class customer extends product
{
  customer(long a,double b,int c,double d,double e)
  {
   super(a,b,c,d,e);
      
  }
  public double calcuTax()
  {
  double d;
  d=price*tax;
  return (price+d);
  }
  
  public double calcuDisc()
  {
   double e;
   e= price*discount;
   return (e);
       
  }
  double a=calcuTax();
  double b=calcuDisc();
  public double totalPrice()
  {
    double t;
    t=(a-b)*qty;
     return (t);	
  }
  
  public void showInfo()
  {
   System.out.println("Prouduct number:"+productnum);  
   System.out.println("Tax is:"+calcuTax());
   System.out.println("Discount is:"+calcuDisc());
   System.out.println("Total price :"+totalPrice());
  }
  
  
  
}