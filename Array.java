import java.util.Scanner;
import java.util.Random;
public class Array
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter array amount = ");
		int element= scan.nextInt();
		int array[]= new int[element];
		
		for(int i=0;i<element;i++)
		{
			System.out.print("Enter integer value = ");
			int input = scan.nextInt();
			array[i]=input;
		}

		System.out.println("Press 1 to check if an array is empty ");
		System.out.println("Press 2 to print current array ");
		System.out.println("Press 3 to reverse an array ");
		System.out.println("Press 4 to check if a value is present ");
		System.out.println("Press 5 to remove duplicates ");
		System.out.println("Press 6 to insert a value remove an element ");
		System.out.println("Press 7 to insert a value between two values ");
		System.out.println("Press 8 to get a random value  ");
		System.out.println("Press 9 to suffle the elements ");
		System.out.println("Press 10 to sort in ascending order ");
		System.out.println("Press 11 to sort in descending order ");
        System.out.println("Press 12 to move all the 0's to the end ");
		System.out.println("Press 13 to find min, max, sum and average ");

		int num = 1;
		while(num>0)
		{
			System.out.println("Enter number to check = ");
			int i = scan.nextInt();
			num=i;
			if(num==1)
			{
				if(element==0)
				{
					System.out.println("Array is empty");
			    }
			else
			{
				System.out.println("Array is not empty");
		    }
			}
			if(num==2)
			{
				for(int j=0;j<element;j++)
			    {
				System.out.print(array[j]+" ");
				}
			}
			if(num==3)
			{
				System.out.println("Reversing array:");
				for(i=array.length-1; i>=0; i--)
				{System.out.print(array[i]+" ");}
			}
			if(num==4)
			{
				int l=0;
				System.out.print("Enter any value to check- ");
				int k = scan.nextInt();
					
				if(array[l]==k)
					{
						System.out.println("Value is present");
						
					}
					
					else
					{
						System.out.println("Value is not present");				
				    }
			    
			}
			if(num==5)
			{
				int s,t;
				element = array.length;
                  
            for ( s = 0; s < element; s++) 
            {
            for ( t = s+1; t < element; t++)
            {
                 
                if(array[s] == array[t])
                {                     
                    array[t] = array[element-1]; 
                    element--;
                    t--;
                }
            }
            }
                System.out.println("Array without duplicate values : ");
         
            for (s = 0; s < element; s++)
               {
                System.out.print(array[s]+" ");
               }
			}
			if(num==6)
			{
				System.out.print("Enter any index of the element you want to remove = ");
				int p= scan.nextInt();
				array[p]=0;
				for(int r=0;r<element;r++)
				{
					System.out.println(" "+array[r]);
				}
				
			}
			if(num==7)
			{
				 System.out.print("Enter Position where you want to put the value:");
	          int position=scan.nextInt();
	               System.out.print("Enter the value you want to insert:");
	          int x= scan.nextInt();
	               for(int k = (element-1); k >= (position-1); k--)
	         {
		           array[k+1]=array[k];
	         }
	               array[position-1]=x;
 	          System.out.println("After inserting the array is:");
	               for(int k=0;k<element;k++)
	         {
		      System.out.print(array[k]+" ");
	         }
	          System.out.println(array[element]);
			}
			
			if(num==8)
			{
				element=element-1;
				System.out.print("Enter any number between 0 to "+element+" = ");
				int m = scan.nextInt();
				System.out.println("A value from the array is = "+array[m]);
			}
			if(num==9)
			{
				Random rand = new Random();
		
		    for (int g = 0; g < element; g++) 
			{
			int o = rand.nextInt(element);
			int temp = array[o];
			array[o] = array[g];
			array[g] = temp;
		    }
				for(int g=0;g<element;g++)
				{
					System.out.println(" "+array[g]);
				}
			}
			if(num==10){
				for(int u=0;u<element;u++)
				{
					for(int v=u+1;v<element;v++)
					{
						int tempor;
						if(array[u]>array[v])
						{
							tempor = array[u];
							array[u] = array[v];
							array[v] = tempor;
						}
					}
				}
				for(int u=0;u<element;u++)
				{
					System.out.println(" "+array[u]);
				}
			}
			if(num==11)
			{
				for(int w=0;w<element;w++)
				{
					for(int z=w+1;z<element;z++)
					{
						int temporary;
						if(array[w]<array[z])
						{
							temporary= array[w];
							array[w]= array[z];
							array[z]=temporary;
						}
					}
				}
				for(int w=0;w<element;w++)
				{
					System.out.println(" "+array[w]);
                }
			}
			if(num==12)
			{
			
			//int element=array.length;
			int count=0;
			for(int x=0;x<element;x++)
			{
				if(array[x] !=0)
				{
					array[count++]=array[x];
				}
			}
			while(count<element)
			{
				array[count++]=0;
			}
			for(int x=0;x<element;x++)
			{
				System.out.println(array[x]);
			}
			}
			if(num==13)
			{
				int max=array[0];
			for(i=1; i<array.length; i++)
			{
				if(max<array[i])
				{
					max=array[i];
				}
			}
			System.out.println("Max value:"+max);
			int min=array[0];
			for(i=1; i<array.length; i++)
			{
				if(min>array[i])
				{
					min=array[i];
				}
			}
			System.out.println("Minimum value:"+min);
			int sum=0;
			int avg=0;
			for(i=0; i<array.length; i++)
			{sum=sum+array[i];
		     avg=sum/array.length;
			}
			System.out.println("Summation on:"+sum);
			System.out.println("Average :"+avg);
			}
		}
	}
}
