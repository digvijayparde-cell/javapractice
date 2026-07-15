public class Account {
    String user;
    int balance;

    public Account() {
        this.user = "Default";
        this.balance = 0;
    }

    public Account(String user) {
        this.user = user;
        this.balance = 0;
    }

    public Account(String user, int balance) {
        this.user = user;
        this.balance = balance;
    }

    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account("UserA");
        Account a3 = new Account("UserB", 500);

        System.out.println(a1.user);
        System.out.println(a2.user);
        System.out.println(a3.balance);
    }
}