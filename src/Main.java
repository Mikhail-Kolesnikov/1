import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        OperationWithDebiting operationWithDebiting1 = new OperationWithDebiting(1000, Debiting.PROFITABLE_DEBIT);
        OperationWithDebiting operationWithDebiting2 = new OperationWithDebiting(1000, Debiting.SAVINGS_DEBIT);
        OperationWithDebiting operationWithDebiting3 = new OperationWithDebiting(1000, Debiting.DEBIT_FOR_EVERYONE);
        DebitCalculate debitCalculate = new DebitCalculate();

        double debitProfit1 = debitCalculate.calculate(operationWithDebiting1, 4);
        double debitProfit2 = debitCalculate.calculate(operationWithDebiting2, 4);
        double debitProfit3 = debitCalculate.calculate(operationWithDebiting3, 4);

        System.out.println(operationWithDebiting1);
        System.out.println(operationWithDebiting2);
        System.out.println(operationWithDebiting3);

        System.out.println(debitProfit1);
        System.out.println(debitProfit2);
        System.out.println(debitProfit3);

        System.out.println();

        System.out.println("Добро пожаловать в наш банк");
        System.out.println("Выберите тип вклада: ");
        System.out.println("1 - PROFITABLE_DEBIT, 2 - SAVINGS_DEBIT, 3 -  DEBIT_FOR_EVERYONE ");
        Scanner scanner = new Scanner(System.in);
        double PROFITABLE_DEBIT = 5.9;
        double SAVINGS_DEBIT = 6.5;
        double DEBIT_FOR_EVERYONE = 7.1;
        double currency = scanner.nextDouble();
        System.out.println("Введите жалаемую сумму");
        double amount = scanner.nextDouble();
        System.out.println("Введите желаемый срок по вкладу");
        double years = scanner.nextByte();

        if (currency == 1) {
            double res1 = PROFITABLE_DEBIT * amount * years;
            System.out.println("Сумма по вкладу по окончании срока :" + res1);
        }
        if (currency == 2) {
            double res2 = SAVINGS_DEBIT * amount * years;
            System.out.println("Сумма по вкладу по окончании срока :" + res2);
        }
        if (currency == 3) {
            double res3 = DEBIT_FOR_EVERYONE * amount * years;
            System.out.println("Сумма по вкладу по окончании срока :" + res3);

        }


        }




    }




