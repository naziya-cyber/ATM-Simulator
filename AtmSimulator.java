package ATM_Simulator;
import java.util.Scanner;


public class AtmSimulator {
   static Scanner sc = new Scanner(System.in);
  
  public static void main(String[] args){
    // ! ATM Simulator 
        // 1 Declare variable 
        double balance = 14.90;
        boolean isWorking = true;
        int userChoice;

        System.out.println("______________________\n");
        System.out.println("   ATM SIMULATOR");
        System.out.println("______________________");
        
        while(isWorking){
        System.out.println("Features:");
        System.out.println("1. Show The Bank Account Balance!");
        System.out.println("2. Deposite Your Money!");
        System.out.println("3. Withdrowl Your Money!");
        System.out.println("4. Exit!");

        System.out.print("Enter Your Choice from (1) to (4) : ");
        userChoice = sc.nextInt();
        System.out.println();
        
        switch(userChoice){
            case 1:
            System.out.print("The total amount is : "); 
              showBalance(balance);
             break;

            case 2:
             balance += depositeMoney();
             System.out.println("Your Money has been Deposited Successfully!\nThe total amount is : " + balance);
             break;


            case 3:
              balance -= withdrawlMoney(balance);
              System.out.println("The Total Remaining Amount : " + balance);
              break;

              
              case 4:
              isWorking = false;
              break;
              
            default : System.out.println("Invalid Number !!");
            
            
            System.out.println("_____________________________________________");
            System.out.println("Thank you for using the ATM Have a nice day!!");
            System.out.println("_____________________________________________");
          }
            
            
            isWorking = false;
            System.out.print("Type (1) to start again or (0) to Exit: ");
            int startAgain = sc.nextInt();
            if( startAgain == 1){
              isWorking = true;
            }
            else if(startAgain == 0){
              isWorking = false;
              System.out.println("Exited");
            }else{
              System.out.println("Invalid Input!!");
            }
            
          }
          

          sc.close();
        }

       
    
    
    //  show the balance 
    static void showBalance(double balance){
      System.out.printf("%.2f\n", balance);
      System.out.println("_______________________");
      
    }
    // deposite money
    static double depositeMoney(){
      double amount;
      System.out.print("Enter the amount to be Deposited: ");
      amount = sc.nextDouble();
      
      
      if(amount < 0){
        System.out.println("Amount can't be negetive please enter the valid amount!");
        return 0;  // we dod return something even it is zero
      }
      else{
        return amount;
      }

      
    }
    // withdrawl money
    static double withdrawlMoney(double balance){
      double amount ;
      System.out.print("Enter the amount to be Withdrawl: ");
      amount = sc.nextDouble();

      if(amount > balance){
        System.out.println("Balance is not sufficiant to withrawl this amount");
        return 0;
      }
      else if(amount < 0){
        System.out.println("The amount can't be negetive");
        return 0;

      }
      else{
       return amount;
      }

    }
  

}

