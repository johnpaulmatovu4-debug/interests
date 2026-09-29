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

}
