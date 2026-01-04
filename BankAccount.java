class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    // 1(a). Default constructor - balance = 0
    BankAccount() {
        balance = 0;
    }

    // 1(b). Parameterized constructor
    BankAccount(int accNo, String name, double bal) {
        this.accountNumber = accNo;
        this.holderName = name;
        this.balance = bal;
    }

    // 2. Deposit method
    void deposit(double amount) {
        balance += amount;
        System.out.println(holderName + " deposited: " + amount);
    }

    // 2. Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(holderName + " withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance for " + holderName);
        }
    }

    // 3. Overloaded transfer method
    void transfer(BankAccount receiver, double amount) {
        if (amount <= balance) {
            this.balance -= amount;
            receiver.balance += amount;
            System.out.println("Transferred " + amount + " from " + holderName + " to " + receiver.holderName);
        } else {
            System.out.println("Transfer failed! Insufficient balance in " + holderName + "'s account.");
        }
    }

    // Display account details
    void display() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + holderName + ", Balance: " + balance);
    }

    // 4. Main method to demonstrate
    public static void main(String[] args) {
        // Using default constructor
        BankAccount acc1 = new BankAccount();
        acc1.accountNumber = 1001;
        acc1.holderName = "Alice";

        // Using parameterized constructor
        BankAccount acc2 = new BankAccount(1002, "Bob", 5000);

        // Deposit and Withdraw
        acc1.deposit(2000);
        acc2.withdraw(1000);

        // Transfer between accounts
        acc2.transfer(acc1, 1500);

        // Display final balances
        System.out.println("\n--- Final Account Details ---");
        acc1.display();
        acc2.display();
    }
}
