package usantatecla.movies.v22;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;

    private List<Rental> rentals;

    public Customer(String name) {
        this.name = name;
        this.rentals = new ArrayList<>();
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        String result = statementTitle();
        result += "Amount owed is " + this.getTotalCharge() + "\n";
        result += "You earned " + this.getTotalFrequentRenterPoints() + " frequent renter points";
        return result;
    }

    private String statementTitle() {
        return this.rentals.stream()
                .map(rental -> "\t" + rental.getMovie().getTitle() + "\t" + rental.getCharge() + "\n")
                .reduce("Rental Record for " + this.getName() + "\n", (s1, s2) -> s1 + s2);
    }

    private double getTotalCharge() {
        return this.rentals.stream()
                .map(Rental::getCharge)
                .reduce(0.0, Double::sum);
    }

    private int getTotalFrequentRenterPoints() {
        return this.rentals.stream()
                .map(Rental::getFrequentRenterPoints)
                .reduce(0, Integer::sum);
    }
}
