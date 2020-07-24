public class BankAccount extends  Exception{
    private  double amount;

    public BankAccount(String message, double amount) {
        super(message);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount += sum;
    }

    public void withDraw(int sum) throws Exception{
        if (sum > getAmount()) {
            throw new LimitException("Недостаточно средств!", amount);
        }
        amount -= sum;
    }
}
