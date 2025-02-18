public class Money {
    private long dollars;
    private long cents;

    public Money(double amount) {
        long totalCents = Math.round(amount * 100);
        this.dollars = totalCents / 100;
        this.cents = totalCents % 100;
    }

    public Money(Money other) { // Copy constructor
        this.dollars = other.dollars;
        this.cents = other.cents;
    }

    public Money add(Money other) {
        long totalCents = this.dollars * 100 + this.cents + other.dollars * 100 + other.cents;
        return new Money((double) totalCents / 100);
    }

    public Money subtract(Money other) {
        long totalCents = this.dollars * 100 + this.cents - (other.dollars * 100 + other.cents);
        return new Money((double) totalCents / 100);
    }


    @Override
    public boolean equals(Object obj) {
        //Check if the objects are the same
        if (this == obj) return true;
        //Check if the object is null or is of different type
        if (obj == null || getClass() != obj.getClass()) return false;
        //Cast object to the correct type
        Money money = (Money) obj;
        //Compare the values
        return dollars == money.dollars && cents == money.cents;
    }

    public int compareTo(Money other) {
        long thisAmount = this.dollars * 100 + this.cents;
        long otherAmount = other.dollars * 100 + other.cents;
        return Long.compare(thisAmount, otherAmount);
    }

    @Override
    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents);
    }
}
