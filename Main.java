import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        int choice;

        do {
            System.out.println("\n====== BANK MANAGEMENT SYSTEM ======");
            System.out.println("1. Create New Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Show All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Account No: ");
                    String accNo = sc.nextLine();
                    System.out.print("Enter Holder Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double bal = sc.nextDouble();
                    bank.addAccount(new Account(accNo, name, bal));
                    break;

                case 2:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextLine();
                    Account acc = bank.findAccount(accNo);
                    if (acc != null) {
                        System.out.print("Enter Deposit Amount: ");
                        double amt = sc.nextDouble();
                        acc.deposit(amt);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextLine();
                    acc = bank.findAccount(accNo);
                    if (acc != null) {
                        System.out.print("Enter Withdrawal Amount: ");
                        double amt = sc.nextDouble();
                        acc.withdraw(amt);
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Account No: ");
                    accNo = sc.nextLine();
                    acc = bank.findAccount(accNo);
                    if (acc != null) {
                        acc.displayAccount();
                    } else {
                        System.out.println("Account not found!");
                    }
                    break;

                case 5:
                    bank.showAllAccounts();
                    break;

                case 6:
                    System.out.println("Thank you for using our Bank System!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);

        sc.close();
    }
}