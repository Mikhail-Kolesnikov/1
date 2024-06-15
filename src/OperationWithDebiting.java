import java.util.Objects;
import java.util.Scanner;

public class OperationWithDebiting {

    private double amount;

    private Debiting type;
    private int years;

    private static final double BASE_DEBIT_RATE = 1.0;

    public OperationWithDebiting(double amount, Debiting type) {
        this.amount = amount;
        this.type = type;

    }

    public double calculateDebit() {
        if (type == Debiting.PROFITABLE_DEBIT) {
            return 1.49;
        }
        if (type == Debiting.SAVINGS_DEBIT) {
            return 2.15;
        }
        if (type == Debiting.DEBIT_FOR_EVERYONE) {
            return 1.11;
        }
        return BASE_DEBIT_RATE;
    }

    @Override
    public String toString() {
        return "OperationWithDebiting{" +
                "amount=" + amount +
                ", type=" + type +
                '}';
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Debiting getType() {
        return type;
    }

    public void setType(Debiting type) {
        this.type = type;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperationWithDebiting that = (OperationWithDebiting) o;
        return Double.compare(amount, that.amount) == 0 && years == that.years && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, type, years);
    }
}
