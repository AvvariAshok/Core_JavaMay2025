package FundamentalConcepts;

public class InterviewQuestions_Part1 {

	public static void SwapUsingThirdValue() {
	    int a=100;
		int b=200;
		System.out.println(a);
		System.out.println(b);
		int c=a;  //c=100;
		 a=b;
		 b=c;
		 
		System.out.println("after swapp "+ a);
		System.out.println("after swapp"+b);
	}

	public static void swappingUsingWithoutValue() {
		int x=100;
		int y=200;
		System.out.println(x);
		System.out.println(y);
		x=x+y; //100+200=300
		y=x-y; //y=300-200=100
		x=x-y;//300-200=100
		System.out.println("after swapp :"+x);
		System.out.println("after swapp :"+y);
	}
	
	// swap two String values without using third variable
	 public static void   swapTwoStringValuesWithoutUsing3rd() {
	  String a="Hello";
	  String b="Java";
	  System.out.println(a);
	  System.out.println(b);
	  a=a+b; //a=java;
	  b=a.replace(b," ");//b=;
	  a=a.replace(b, " ");
	 
	  System.out.println("after swapp :" +a);
	  System.out.println("after swapp :" +b);
	 }
		
		
    public static void main(String[] args) {
			
//			SwapUsingThirdValue();
//    	swappingUsingWithoutValue();
    	 swapTwoStringValuesWithoutUsing3rd();
    	 
			
	
	
	
		
	}

	

}
