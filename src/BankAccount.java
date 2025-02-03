public class BankAccount{
    public static void main(String[] args){
        double balance = 2175.37;
        balance -= 302.50;
        balance += 50.03;
        balance /= 2.0;
        balance += 20.00;
        balance -= 1.00;
        balance *= 2.0;
        balance += 1.0;

        System.out.printf("The final balance is: %.2f", balance);
    }
}