import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        BankAccount account = new BankAccount("сом", 10000);
        Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите сумму: ");
                int sum= scan.nextInt();
                account.withDraw(sum);
            } catch (LimitException e1) {
                System.out.println(e1.getMessage() + "\nУ Вас осталось: " + account.getAmount() + " сом");
                System.out.println("Продолжить операции или прервать 'Y' или 'N'?");
                String e2 = scan.next();
                if (e2.equalsIgnoreCase("Y")) {
                    System.out.println("Ваш остаток равен: " + account.getAmount());
                    int sum= scan.nextInt();
                    account.withDraw(sum);
                    System.out.println("Введите сумму не превышающий Ваш баланс: ");
                    account.getAmount();
                    break;
                }
                if (e2.equalsIgnoreCase("N")) {
                    System.out.println("Ваш баланс " + account.getAmount());
                    break;
                }
                else { break; }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }
}
