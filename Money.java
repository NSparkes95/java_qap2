// Description: This class is used to create a Money object that can be used to add, subtract, and compare money values.
// Author: Nicole Sparkes
// Feburary 9, 2025

public class Money {
    private double amount;

    public Money(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public Money add(Money other) {
        return new Money(amount + other.amount);
    }

    public Money subtract(Money other) {
        return new Money(amount - other.amount);
    }

    public boolean lessThan(Money other) {
        return this.amount < other.amount;
    }

    @Override
    public String toString() {
        return String.format("$%.2f", amount);
    }
}
