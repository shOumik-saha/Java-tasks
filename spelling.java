import java.util.Scanner;
public class spelling{ 
public static void main(String args[]){ 
String s1="Game";
String s2="Role"; 
String s3="Character"; 
String s4="Flag";


Scanner scanner=new Scanner(System.in);
System.out.println("Enter  Word:");
String s5= scanner.nextLine();


int index1=s5.indexOf("1");
int index2=s5.indexOf("2");
int index3=s5.indexOf("3");
int index4=s5.indexOf("4");
int index5=s5.indexOf("5");
int index6=s5.indexOf("6");
int index7=s5.indexOf("7");
int index8=s5.indexOf("8");
int index9=s5.indexOf("9");
int index0=s5.indexOf("0");

if(index1==-1&&index2==-1&&index3==-1&&index4==-1&&index5==-1&&index6==-1&&index7==-1&&index8==-1&&index9==-1&&index0==-1)
{
if(s5.equalsIgnoreCase(s1) )
{
	System.out.println("!!!!!!!!The word is correct!!!!!");
}
else if(s5.equalsIgnoreCase(s2) )
{
	System.out.println("!!!!!!!!The word is correct!!!!!");
}
else if(s5.equalsIgnoreCase(s3) )
{
	System.out.println("!!!!!!!!The word is correct!!!!!");
}
else if(s5.equalsIgnoreCase(s4) )
{
	System.out.println("!!!!!!!!The word is correct!!!!!");
}
else 
{
	System.out.println("!!!!!The word is incorrect!!!!!");
}	
}
else
{
	System.out.println("<<<<Only letters are accepted>>>>");
}




}
}  