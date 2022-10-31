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
        } else {
            System.out.println("Thank You for Choosing our Company. Hereunder we ask you some questions to process your loan");
            System.out.println("Did you have a Criminal Record?");
            System.out.println("Write '1' if you have a previous criminal record");
            System.out.println("Write '2' if you don't have a previous criminal record");

            int criminalrecord = scan.nextInt();

            if (criminalrecord == 1) {
                System.out.println("Sorry you are not allowed to take a Loan");
                System.out.println("Thank you for Visiting");
            } else {
                System.out.println("How Long is your Saving Period?");
                System.out.println("If you save for less than six months please write 1");
                System.out.println("If you save for more than six months please write 2");

                int savingperiod = scan.nextInt();
                if (savingperiod == 1) {
                    System.out.println("To get a credit from our Company you have to save for a minimum of six months. Thank You For Visiting");
                } else if (savingperiod == 2) {
                    System.out.println("Please Insert the amount of Money for Credit");
                    int requestedloanamount = scan.nextInt();
                    System.out.println("Please Insert the amount of Money you saved up to date");
                    int savingamount = scan.nextInt();
                    int maxpossibleloanamount = savingamount * 4;

                    if (maxpossibleloanamount < requestedloanamount) {
                        System.out.println("Sorry your Saving Account Show you have saved ETB " + savingamount);
                        System.out.println("The Maximum Amount of Loan you can process from our company is " + maxpossibleloanamount);
                    } else {
                        System.out.println("are you willing to bring an external collateral or use the the Property as a collateral?");
                        System.out.println("for external collateral write 1");
                        System.out.println("to use the property as a collateral write 2");
                        System.out.println("if you can not provide a collateral write 3");
                        int collateral = scan.nextInt();
                        if (collateral != 1 && collateral != 2) {
                            System.out.println("Sorry without a collateral we can not process your request. Thank You");
                        } else {

                            System.out.println("Please Insert the number of Years for Repayment");

                            int repaymentperiod = scan.nextInt();
                            double interest = 0.15;
                            double interestamount = interest * requestedloanamount;
                            double totalinterest = interestamount * repaymentperiod;
                            double totalloanandinterest = totalinterest + requestedloanamount;
                            int monthlyrepaymentamount = (int) totalloanandinterest / (repaymentperiod * 12);
                            System.out.println("Congratulations " + customername + ", your request for Credit of ETB " + requestedloanamount + " is successful.");
                            System.out.println("Credit Summary");
                            System.out.println("Requested Loan Amount = ETB" + requestedloanamount);
                            System.out.println("Repayment Period = " + repaymentperiod + " Years");
                            System.out.println("Total Interest Amount = ETB" + totalinterest);
                            System.out.println("Monthly Repayment Amount = ETB" + monthlyrepaymentamount);
                            System.out.println("Thank You");
                        }
                    }
                }
            }
        }
    }
}


