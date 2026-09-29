import java.util.Scanner;
public class customerinterests {
    static int deposit;
    static double rate;
    static double interest;
    static double total;
    public static void calculateinterest(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the deposit amount: ");
        deposit = input.nextInt();
        System.out.print("Enter the interest rate: ");
        rate = input.nextDouble();

        interest = deposit * rate;
        total = deposit + interest;
    }
    public static void report(){
        System.out.println("\n---savings interest report---" );
        System.out.println("original deposit: " + deposit);
        System.out.println("interest rate: " + rate);
        System.out.println("interest earned: " + interest);
        System.out.println("total amount: " + total);
        int roundedinterest = (int) interest;
        int roundedtotal = (int) total;
        String RateAsString= Double.toString(rate);

        System.out.println("\n---conversion accuracy---");
        System.out.println("rounded interest: " + roundedinterest);
        System.out.println("rounded total: " + roundedtotal);
        System.out.println("Rate as String: "+ RateAsString);

    }

}
