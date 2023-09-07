public class RewardValue {
    private double cashValue;
    private double milesValue;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035;
    }

    // Constructor that accepts a value in miles
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * 0.0035;
        } else {
            throw new IllegalArgumentException("Invalid constructor for miles value.");
        }
    }

    // Getter method to retrieve the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Getter method to retrieve the miles value
    public double getMilesValue() {
        return milesValue;
    }
}
