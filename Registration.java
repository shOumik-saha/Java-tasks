 public class Registration {
	static final int a;
	static int b;
	int c;	
	static {a = 05;}	
	static {
		b = a * 9;
		c = 7;
	}
	Registration(){
		int e;
		c=7;
		a=9;
	}
	Registration(int k){
    System.out.print(++k);
	}
	void nonstaticmethod(){
	staticMethod();
	}
	public static void main(String[] args) {
		Registration sb1 = new Registration();
		System.out.print(a);
		System.out.print(b);
		System.out.print(sb1.c);
		//sb.nonstaticmethod();
		Registration sb2 = new Registration(5);
	}
	static {b=7;}
	static void staticMethod(){
   int c = 1;
	System.out.print(8);
	}	
	static {b=5;int d;}
   }
