import java.util.ArrayList;

class Bank {
    ArrayList<Account> accounts = new ArrayList<>();

    public void addAccount(Account acc) {
        accounts.add(acc);
        System.out.println("Account created successfully!");
    }

    public Account findAccount(String accNo) {
        for (Account acc : accounts) {
            if (acc.getAccountNo().equals(accNo)) {
                return acc;
            }
        }
        return null;
    }

    public void showAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found!");
            return;
        }
        for (Account acc : accounts) {
            acc.displayAccount();
        }
    }
}