public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = new Money(creditLimit); // Create a copy to avoid modification
        this.balance = new Money(0.0);             // Initial balance is zero
    }

    // Getters (using copy constructors for Money objects)
    public Money getBalance() { return new Money(balance); }
    public Money getCreditLimit() { return new Money(creditLimit); }
    public String getPersonals() { return owner.toString(); }

    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) <= 0) {
            balance = balance.add(amount);
        } else {
            System.out.println("Charge exceeds credit limit.");
        }
    }

    public void payment(Money amount) {
        balance = balance.subtract(amount);
    }

    // Add a toString method for CreditCard for easy testing
    @Override
    public String toString() {
        return "CreditCard{" +
                "balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", owner=" + owner +
                '}';
    }
}
