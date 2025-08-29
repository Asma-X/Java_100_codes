// class Student {
//     private String name; // private variable

//     // Getter
//     public String getName() {
//         return name;
//     }

//     // Setter
//     public void setName(String name) {
//         this.name = name;
//     }
// }

// public class Encapsulation {
//     public static void main(String[] args) {
//         Student s = new Student();
//         s.setName("Asma");
//         System.out.println(s.getName()); // Asma
//     }
// }

// example 2
class BankAccount {
    // private data (hidden from outside)
    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    // public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // public method to withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // public getter (controlled access)
    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);

        acc.deposit(500); // ✅ Safe deposit
        acc.withdraw(200); // ✅ Safe withdraw
        System.out.println("Balance: " + acc.getBalance());

        // ❌ Not allowed: acc.balance = 100000; (because balance is private)
    }
}
