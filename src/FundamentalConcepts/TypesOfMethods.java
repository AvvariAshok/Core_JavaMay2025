package FundamentalConcepts;

public class TypesOfMethods {
	
	
	static int x=11;
	static int y=2;
	
	  public static void multi() {                   // without parameters
			 int x=11;
			 int y=2;
			 System.out.println("multi :" +(x*y));
	  }
	
	 public static void addition(int x,int y) {      // with parameters
		
	  System.out.println("Addition :" +(x+y));
	 }
	  
	  public static void subtraction() {
	         
	  System.out.println("subtraction :" +(x-y));
	  
	  }
	  public static int division() {              // without parameter with return value
		  int x=11;
		  int y=2;
		  return x/y;
		  
	  }
	  
	  public static boolean CompareData(int a, int b) {   // with parameter with return value
		 return a<b;
	  }
	  
	  public static int modDivision(int a,int b) {
		  return a%b;
		  
	  }

	public static void main(String[] args) {
		
		addition(1000,2000);
		
		System.out.println(division());
		
		int a=1000;
		System.out.println(a);
		
	  int 	result= modDivision(1000001,100000);
	  System.out.println(result);
		

	
			 
		 }
		  

	}


