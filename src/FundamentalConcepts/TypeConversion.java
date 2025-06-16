package FundamentalConcepts;

public class TypeConversion {
	
	public static int division (int a,int b) {
		
		return a/b;
	}
	
	public static byte modDivision(int a,int b) {
		
		return (byte)(a/b);
	}
	
	

	public static void main(String[] args) {
		
	 byte byte1=100;
	 short short1= byte1;   // 1 byte of data can fit for 2 byte of data  // Implicit conversion
//	 byte byte2 =short1;  // 2 byte of data can not fit for  2 byte of data
	 byte byte2=(byte)short1;     // Explicit conversion
	  System.out.println(short1);
	 float float1=10.5f;
	  System.out.println("float value :" + float1);
	  
	  int int1=(int)float1;                       // Explicit conversion
	  System.out.println("int value :" + int1);  
	  
	  float1=int1;    //no loss data
	  System.out.println("float value :" + float1);
         
	  String a="1000";
	  System.out.println(a);
	  
//      byte byte3=a;     //can not convert to  Primitive to non primitive conversion
      
//      String string1=(byte)byte3; //can not convert to  non primitive to primitive conversion
      
	  byte result= (byte)division(1000,100);
	  

	}

}
