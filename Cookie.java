public class Cookie {
    private int numberOfCookies;
    private double cupsOfSugar;
    private double cupsOfButter;
    private double cupsOfFlour;
    private double cupsOfChocolateChips;

    // Default constructor
    public Cookie() {
        numberOfCookies = 0;
        cupsOfSugar = 0;
        cupsOfButter = 0;
        cupsOfFlour = 0;
        cupsOfChocolateChips = 0;
    }

    // Constructor that accepts number of cookies and calls calculateIngredients
    public Cookie(int n) {
        numberOfCookies = n;
        calculateIngredients();
    }

    // Setters
    public void setNumberOfCookies(int n) {
        numberOfCookies = n;
        calculateIngredients();
    }

    // Getters
    public int getNumberOfCookies() {
        return numberOfCookies;
    }

    public double getCupsOfSugar() {
        return cupsOfSugar;
    }

    public double getCupsOfButter() {
        return cupsOfButter;
    }

    public double getCupsOfFlour() {
        return cupsOfFlour;
    }

    public double getCupsOfChocolateChips() {
        return cupsOfChocolateChips;
    }

    // Method to calculate ingredients based on the number of cookies
    public void calculateIngredients() {
        cupsOfSugar = numberOfCookies * (1.5 / 48);
        cupsOfButter = numberOfCookies * (1.0 / 48);
        cupsOfFlour = numberOfCookies * (2.75 / 48);
        cupsOfChocolateChips = numberOfCookies * (3.9 / 48);
    }

    // toString method to display ingredient amounts
    public String toString() {
        return String.format("Batch of %d cookies:\nCups of sugar: %.2f\nCups of butter: %.2f\nCups of flour: %.2f\nCups of chocolate chips: %.2f",
                numberOfCookies, cupsOfSugar, cupsOfButter, cupsOfFlour, cupsOfChocolateChips);
    }
}
