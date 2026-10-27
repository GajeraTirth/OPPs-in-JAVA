import java.util.Scanner;

public class Minibank{

    record Bankinfo(String name, String branch)
    {}
    
    enum TransactionType{
         OPEN_ACCOUNT, 
         DEPOSIT, 
        WITHDRAW,
        TRANSFER, 
        EXIT
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Bankinfo Bank = new Bankinfo("Mini Bank", "Main Branch");

        System.out.println("Welcome to " + Bank.name() + " - " + Bank.branch());

        int choice;

            do {
         
            System.out.println("\n------ MiniBank Menu ------");
            System.out.println("1. Open Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

    
            String message = switch (choice) {
                case 1 -> "Open Account — to be implemented in a later lab";
                case 2 -> "Deposit — to be implemented in a later lab";
                case 3 -> "Withdraw — to be implemented in a later lab";
                case 4 -> "Transfer — to be implemented in a later lab";
                case 5 -> "Exit selected";
                default -> "Invalid choice! Please select 1 to 5.";
            };

            System.out.println(message);

        } while (choice != 5);

        System.out.println("\nThank you for using MiniBank!");
        System.out.println("Goodbye!");

        sc.close();
    }
}

    

