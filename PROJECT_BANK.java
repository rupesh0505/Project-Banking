import java.util.Scanner;
public class PROJECT_BANK {

	public static void main(String[] args) {
           Scanner s=new Scanner (System.in);
           int withdrawal,deposit,choice,amount=1000000,password=1234,finalamount = 0;
           System.out.println("------------------------------------------------------");
           System.out.println("                     BANK OF BARODA                   ");
           System.out.println("------------------------------------------------------\n");
           System.out.println("1.Withdrawal.\n2.Deposit.\n3.Check Balance.\n");
           System.out.println("choice (1-3):");
           choice=s.nextInt();
           switch(choice)
           {
           case 1:
        	   System.out.println("-----------------------------------------------");
        	   System.out.println("              Withdrawal Section               ");
        	   System.out.println("-----------------------------------------------\n");
        	   System.out.println("Enter Withdrawal Amount:");
        	   withdrawal=s.nextInt();
        	   System.out.println("Enter Password:");
        	   password=s.nextInt();
        	   if (password==1234)
        	   {
        		   if (withdrawal<=amount)
            	   {
            		   finalamount=amount-withdrawal;
            		   System.out.println("Remaining Balance:"+finalamount);
            	   }   
        	   else
        	   {
        		   System.out.println("You Not Have Enough Amount.");
        	   }
        	   }
        	   else
        	   {
        		   System.out.println("Invalid Password.");
        	   }
        	   break;
        	   
           case 2:
        	   System.out.println("-----------------------------------------------");
        	   System.out.println("                Deposite Section               ");
        	   System.out.println("-----------------------------------------------\n");
        	   System.out.println("Enter Deposite Amount:");
        	   deposit=s.nextInt();
        	   System.out.println("Enter Password:");
        	   password=s.nextInt();
        	   if(password==1234)
        	   {
        		   finalamount=amount+deposit;
        		   System.out.println("Remaining Balance:"+finalamount);
        	   }
        	   else
        	   {
        		   System.out.println("Invalid Password.");
        	   }
        	   break;
        	   
           case 3:
        	   System.out.println("-------------------------------------------");
        	   System.out.println("              Balance Section              ");
        	   System.out.println("-------------------------------------------\n");
        	   System.out.println("Enter Password:");
        	   password=s.nextInt();
        	   if (password==1234)
        	   {
        		   System.out.println("Your Balance:"+amount);
        	   }
        	   else
        	   {
        		   System.out.println("Invalid Password.");
        	   }
        	   break;
        	   
        	   default:
        		   System.out.println("Invalid Choice.");
           }

	}

}
