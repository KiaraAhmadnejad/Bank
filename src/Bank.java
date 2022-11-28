import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Bank {

    // Attribudes
    ArrayList<Customer> customers = new ArrayList<>();
    ArrayList<Account> accounts = new ArrayList<>();
    Scanner myScan = new Scanner(System.in);

    // Constructors
    public Bank(){
        System.out.println("Vill du ska en ny kund? (1. yes, 2. NO)");

        while(true){
            try{
                int ans = myScan.nextInt();
                if (ans == 2){
                    System.out.println("ingen ny kund");
                }
                break;
        }   catch(Exception e){
                System.out.println();e.getMessage();
                System.out.println("nått gick fel");
        }
    }
        System.out.println("vill du lägga till ett nytt bankkonto? (1. ja, 2. nej)");
        while (true){
            try{
                int ans = myScan.nextInt();

                if (ans  == 2){
                System.out.println("inget nytt bankkonto");
            }
            break;
        }catch (Exception e){
            System.out.println();e.getMessage();
            System.out.println("Något gick fel!!");
        }

    // Methods



    //Getters/setters

}
