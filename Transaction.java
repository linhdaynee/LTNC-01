public class Transaction {
    private String operation; // Tên loại giao dịch
    private double amount; // số tiền giao dịch
    private double balance; // Số dư còn lại trong tài khoản
    public static final String DEPOSIT = "deposit";
    public static final String WITHDRAW = "withdraw";

    /**
     * Giao dịch.
     * @param operation loại giao dịch.
     * @param amount số tiền giao dịch.
     * @param balance số dư tài khoản.
     */
    public Transaction(String operation, double amount, double balance) {
        this.operation = operation;
        this.amount = amount;
        this.balance = balance;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
