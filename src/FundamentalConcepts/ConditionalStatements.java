package FundamentalConcepts;

public class ConditionalStatements {
	
	static int a=100;
	
   static	int b =200;
	
	

	public static void main(String[] args) {
		
		int a=100;
       	int b =200;
			
		if(a>b){
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		if(a>b) {
			System.out.println(a);
		}else if(a==b) {
			
			System.out.println(b);
		}else {
			System.out.println("no result found");
		}
		
	
	
	    String str="Hello";
	    switch(str) {
	    	case "banana":
	    		System.out.println(str);
	    		break;
	    	case "Hello":
	    		System.out.println(str);
	    		break;
	        default:
	        	System.out.println("not found");
	    }
}
}
        


