import java.util.Scanner;

public class CustomerService {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please Insert Your Name");
        String customername = scan.nextLine();

        System.out.println("Welcome " + customername);

        System.out.println("For Loan Service Please Write 1");
        int forloan = scan.nextInt();

        if (forloan != 1) {
            System.out.println("Sorry for the time being we did not start other services. Thank You For Visiting");
       } else if (forloan == 1) {
           System.out.println("Thank You for Choosing our Company. Hereunder we ask you some questions to process your loan");
           System.out.println("Did you have a Criminal Record?");
           System.out.println("Write '1' if you have a previous criminal record");
           System.out.println("Write '2' if you don't have a previous criminal record");
               int criminalrecord = scan.nextInt();

             if (criminalrecord == 1) {
           System.out.println("Sorry you are not allowed to take a Loan");
           System.out.println("Thank you for Visiting");
         }
             else if (criminalrecord == 2) {
           System.out.println("How Long is your Saving Period?");
           System.out.println("If you save for less than 6 months please write 1");
           System.out.println("If you save for more than 6 months please write 2");
             int savingtime = scan.nextInt();

              if (savingtime == 1) {
            System.out.println("Sorry for the time being we did not start other services. Thank You For Visiting");
             }
             else if (savingtime == 2) {
            System.out.println("Please Insert the amount of Money for Credit");
              }
                int requestedloanamount = scan.nextInt();
               System.out.println("Please Insert the amount of Money you saved up to date");
                int savingamount = scan.nextInt();
                int maxpossibleloanamount = savingamount * 4;
                String[] loantype = {"House", "Car", "Business"};

              if (maxpossibleloanamount < requestedloanamount) {
                System.out.println("Sorry your Saving Account Show you have saved ETB " + savingamount);
                System.out.println( "The Maximum Amount of Loan you can process from our company is " + maxpossibleloanamount);
              }
              else if (maxpossibleloanamount >= requestedloanamount) {
                System.out.println("Please Insert the number of Years for Repayment");
                 int repaymentperiod = scan.nextInt();
                System.out.println("If you Want the Loan for " + loantype[0] + " Write 1");
                System.out.println("If you Want the Loan for " + loantype[1] + " Write 2");
                System.out.println("If you Want the Loan for " + loantype[2] + " Write 3");
                 int loanpurpose = scan.nextInt();
                 double interest = 0.15;
                 double interestamount = interest * requestedloanamount;
                 double totalinterest = interestamount * repaymentperiod;
                 double totalloanandinterest = totalinterest + requestedloanamount;
                 int monthlyrepaymentamount = (int) totalloanandinterest/(repaymentperiod*12);
                System.out.println("your requested total loan amount including the Interest rate is ETB " + totalloanandinterest);
                System.out.println(customername + "your request for Credit of ETB " + requestedloanamount );
                System.out.println("Your Monthly Repayment Amount is ETB " + monthlyrepaymentamount);
        }
            }
        }
    }
}