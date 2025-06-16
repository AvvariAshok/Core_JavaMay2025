package FundamentalConcepts;

public class BankTransaction {
	
	static  int mainBalance=100000;
	
	
	public void deposite(int depositeAmount) {
		
		mainBalance= mainBalance + depositeAmount;
	}
	
    public void withdrwal(String accountType,int withdrwal) {
    	if (withdrwal>= mainBalance) {
    		mainBalance= mainBalance - withdrwal;
    		switch(accountType) {
    		case "SAVINGS":
    		if(withdrwal<=50000) {
    			mainBalance= mainBalance - withdrwal;
    		}else {
    			System.out.println("withdrwal amount limit for savings account 50000 only");
    			
    		}
    		break;
    		case "CURRENT":
             if(withdrwal<=100000) {
            	 mainBalance=mainBalance-withdrwal;
            	 
             }else {
            	 System.out.println("withdrwal amount limit for current account 100000 only");
     			
             }
             break;
    		case "RETAIL":
    			if(withdrwal<=1000000) {
    				mainBalance=mainBalance-withdrwal;
    				
    			}else {
    			 System.out.println("withdrwal amount limit for retail account 50000 only");
        			
    			}
    			break;
    			
    			
    		}
    		
   
    		
    	}else {
    		System.out.println("Insufficient Balance");
    	}
    
    	
    }
    
    public void displayBalance() {
    	System.out.println("Balance " + mainBalance);
    }
	public static void main(String[] args) {
		
		BankTransaction iciciBank=new BankTransaction();
		iciciBank.displayBalance();
		
	System.out.println("-----------deposite Amount-------------");
	 iciciBank.deposite(5000);
	 iciciBank.displayBalance();
	 
		System.out.println("-----------withdrwal Amount-------------");
		BankTransaction hdfcBank=new BankTransaction();
		hdfcBank.withdrwal("SAVING",3000);
		hdfcBank.displayBalance();
		
		System.out.println("-----------withdrwal Amount 11000-------------");
		BankTransaction sbiBank=new BankTransaction();
		sbiBank.withdrwal("SAVING",110000);
		sbiBank.withdrwal("SAVING",60000);
		sbiBank.displayBalance();
		
		sbiBank.withdrwal("SAVING",50000);
	}

}


//          Almost out of storage … Your Google One storage subscription was canceled because your payment method failed


