import java.util.Scanner;
class customerInfo{
	
public static void main(String[] args){
	Scanner input= new Scanner(System.in);
    customer pro=new customer(102, 369.63, 5,0.05,0.15);
	pro.calcuTax();
	pro.calcuDisc();
	pro.totalPrice();
	pro.showInfo();
	
}

}