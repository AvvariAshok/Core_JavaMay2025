package FundamentalConcepts;

public class ArrayExample {

	public static void main(String[] args) {
          int intArr[]={100,200,300,400,500};
          System.out.println(intArr.length);
          System.out.println("--------------------------------------");
          
          System.out.println(intArr[3]);
          System.out.println(intArr[2]);
          System.out.println(intArr[0]);
          System.out.println("--------------------------------------");
          for(int i=0;i<intArr.length;i++) {
        	  System.out.println(intArr[i]);
          }
          
          System.out.println("--------------------------------------");
          
          for(int eachval:intArr) {
        	  System.out.println(eachval);
          }
          
          System.out.println("--------------------------------------");
          String strArr[]={"Apple","Banana","Cherry"};
          for(String eachFruit:strArr) {
        	  System.out.println(eachFruit);
          }
          System.out.println("--------------------------------------");
          
          int intArr2[]=new int[5];
          for(int eachvalue:intArr2) {
        	  System.out.println(eachvalue);
                  }
          
          intArr2[0]=1000;
          intArr2[1]=2000;
          intArr2[2]=3000;
          intArr2[3]=4000;
          intArr2[4]=5000;
          for(int eachvalue:intArr2) {
          System.out.println(eachvalue);
	}
          
          System.out.println("--------------2D Array----------------");
          
          int intArr3[][]= {{10,20,30,40},{100,200,300,400},{1000,2000,3000,4000}};
          for(int i=0;i<intArr3.length;i++) {
        	  for(int j=0;j<intArr3[i].length;j++) {
        		  System.out.println(intArr3[i][j]);
        	  }
          }
          
          System.out.println("--------------2D Array enhanced for loop----------------");
          
          for(int[] eachArr:intArr3) {
        	  for(int eachValue:eachArr) {
        		  System.out.print(eachValue );
        	  }
          }
	}
          	

}
