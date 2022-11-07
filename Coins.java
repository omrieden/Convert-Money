import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Coins {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Press 1 to convert a Shekels to Dollars");
        System.out.println("Press 2 to convert a Dollars to Shekels");
        System.out.println("Press 3 to convert a Euro to Shekels");
        System.out.println("Press 4 to convert a Shekels to Euro");
        System.out.println("Press 0 to Exit");

        try {
            int coins = scan.nextInt();
            while (coins != 0) {
                if (coins > 4 || coins < 0)
                    throw new Exception();
                System.out.println("please enter amount: ");
                double amount = scan.nextDouble();
                switch (coins) {
                    case 1 -> System.out.println(amount / 3.5260);
                    case 2 -> System.out.println(amount * 3.5260);
                    case 3 -> System.out.println(amount * 3.5860);
                    case 4 -> System.out.println(amount / 3.5860);
                }
                System.out.println("Press 1 to convert a Shekels to Dollars");
                System.out.println("Press 2 to convert a Dollars to Shekels");
                System.out.println("Press 3 to convert a Euro to Shekels");
                System.out.println("Press 4 to convert a Shekels to Euro");
                System.out.println("Press 0 to Exit");
                coins = scan.nextInt();
            }
            System.out.println("Bye Bye Amigo");
        } catch (Exception e) {
            System.out.println("Error, are you drunk?");
        }
    }
}


