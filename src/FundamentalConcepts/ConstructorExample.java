package FundamentalConcepts;

public class ConstructorExample {
	
	static String a;
	static int b;
	
	char c;
	float d;
	public ConstructorExample(String a,int  b,char c,float d){
		
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}
   public static void addition(int a,int b) {
//	 static int a=10;
//	 static int b=20;
	 System.out.println(a);
	 System.out.println(b);
	
}
   public void subtraction(int a, int b) {
	   
	   System.out.println(a);
		 System.out.println(b);
		 System.out.println(a-b);
	   
   }
		
		
	

	public static void main(String[] args) {
		
		
		System.out.println(a);
		System.out.println(b);
//		System.out.println(c);
//	    System.out.println(d);
		
		 ConstructorExample consEx=new ConstructorExample("Hello",10,'A',10.5f);
//		 its allocates memory for instance variable and also,it is initilize global variable.
		 System.out.println(consEx);
		 System.out.println(consEx.d);
		 System.out.println(consEx.c);
		 consEx.subtraction(1000,2000);
		 
		 ConstructorExample consEx2=new ConstructorExample("java",20,'B',20.5f);
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(consEx.c);
		 System.out.println(consEx.d);

		 
	}
	

}

