package FundamentalConcepts;

public class StaticAndInstanceData {
	
	int a=100;            //
	static int b=200;   // memory will be allocated by JVM while loading the class
	                    // JVM can allocated by only one time
	
	public StaticAndInstanceData(){
		
	}
	
	public void display1() {    //instance method
		System.out.println(this.a);
		this.display3();
	}
	
	public static void display2() {  // static method
		System.out.println(b);
		StaticAndInstanceData.display4();
		
		
		
	}
	
	public void display3() {    //instance method
		System.out.println(this.a);
		this.display3();
		System.out.println(StaticAndInstanceData.b);
		StaticAndInstanceData.display2();
	}
	public static void display4() {    // static  method
		System.out.println(b);
//		this.display3();
	}

	public static void main(String[] args) {
		
//    	System.out.println(a);
		System.out.println(b);
		
		StaticAndInstanceData stringIns=new StaticAndInstanceData();
		System.out.println(stringIns);
	     System.out.println(stringIns.a);
	     
//	     display1();  // instance method
	     
	     display2();  // static method
	     
	     StaticAndInstanceData stringIns1=new StaticAndInstanceData();
	     StaticAndInstanceData stringIns2=new StaticAndInstanceData();
	     StaticAndInstanceData stringIns3=new StaticAndInstanceData();
	     StaticAndInstanceData stringIns4=new StaticAndInstanceData();
	     
	     System.out.println("====================================================");
	     
	      stringIns1.a=300;
	      System.out.println(stringIns1.a);
	      System.out.println( stringIns2.a);
	      System.out.println( stringIns3.a);
	      
	      System.out.println("===============================================");
	      
	      stringIns1.b=400;
	      System.out.println(stringIns1.b);
	      System.out.println(stringIns2.b);  
	      System.out.println(stringIns3.b);
	      
	      System.out.println("======================Access static Instance=========================");
	      
	      System.out.println(StaticAndInstanceData.b);
	      StaticAndInstanceData.display2();
	     
//	      display1();
//	      stringIns.display1();
	      
	      
	      
	      
	      }

}
