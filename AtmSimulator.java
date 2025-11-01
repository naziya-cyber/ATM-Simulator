package ATM-Simulator;
import java.util.Scanner;

public class AtmSimulator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // ! ATM Simulator 
        // 1 Declare variable 
        double balance;
        boolean isWorking = true;
        int userChoice;

        System.out.println("______________________");
        System.out.println("ATM SIMULATOR");
        System.out.println("______________________");
        
        while(isWorking){
        System.out.println("Features:");
        System.out.println("1. Show The Bank Account Balance!");
        System.out.println("2. Deposite Your Money!");
        System.out.println("3. Withdrowl Your Money!");
        System.out.println("Exite!");

        System.out.print("Enter Your Choice from (1) to (4) : ");
        userChoice = sc.nextInt();
        
        switch(userChoice){
          case 1 : 
          System.out.println("1. Show The Bank Account Balance!");

            case 2 :
             System.out.println("2. Deposite Your Money!");

            case 3 :
              System.out.println("3. Withdrowl Your Money!");
              
              case 4 :
              System.out.println("Exite!");
              
            default : System.out.println("Invalid Number !!");
        }
        
      }
      
        
        


        sc.close();
    }
    
}
