// Description: This class is used to create a credit card object. It has methods to get the personal information of the owner, the balance of the credit card, the credit limit of the credit card, charge the credit card, and make a payment on the credit card.
// Author: Nicole Sparkes
// Feburary 9, 2025

public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = creditLimit; 
        this.balance = new Money(0);
    }

    public String getPersonal () {
        return owner.toString();
    }

    public Money getBalance() {
        return new Money(balance.getAmount()); 
    }

    public Money getCreditLimit() {
        return new Money(creditLimit.getAmount()); 
    }

    public void charge(Money amount) {
        if (balance.add(amount).lessThan(creditLimit)){
            balance = balance.add(amount);
            System.out.println("Charge successful! " + amount);
        } else {
            System.out.println("Charge failed! " + amount);
        }
    }

    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment" + amount);
    }
}