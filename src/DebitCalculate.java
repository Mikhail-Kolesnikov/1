public class DebitCalculate {

    public double calculate(OperationWithDebiting operationWithDebiting, int years){
        double debit = operationWithDebiting.calculateDebit();
        double amount = operationWithDebiting.getAmount();
        for (int i = 0; i < years; i++) {

            amount *= debit;

        }
        return amount;
    }


}


