package FundamentalConcepts;

public class LoopingStatements {
	public static void printTables(int numbers) {
		for(int i=0;i<=10;i++) {
			System.out.println(numbers+ "X"+i+ "="+(i*numbers));
		
	}
	}

	public static void main(String[] args) {
		
//		System.out.println("hello java");
//		System.out.println("hello java");
//
//		System.out.println("hello java");
//		System.out.println("hello java");
//		System.out.println("hello java");
//		System.out.println("hello java");
//		System.out.println("hello java");

		for(int i=0; i<10;i++) {
			System.out.println("hello java");
		}
		
		printTables(2);
		int a=15;
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print( a+" ");
				a--;
			}
			System.out.println(" ");
			
		}
		System.out.println("--------------------------------------");
		int p=1;
		while(p<=10) {
//			System.out.println(p);
			p++;
			if(p<6) {
				continue;
			}
			System.out.println(p);
		}
		System.out.println("--------------------------------------");
		int x=1;
		do {
			System.out.println(x);
			x++;
		}while(x<=10);
			
		
		

		
		}
	}


