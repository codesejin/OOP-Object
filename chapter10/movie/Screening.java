package chapter10.movie;

import chapter5.movie.Customer;
import chapter5.movie.Money;
import chapter5.movie.Movie;
import chapter5.movie.Reservation;

import java.time.LocalDateTime;

public class Screening {
    private chapter5.movie.Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;
    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculateFee(audienceCount),audienceCount);
    }

    private Money calculateFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }

    public int getSequence() {
        return sequence;
    }

    public LocalDateTime getWhenScreened() {
        return whenScreened;
    }

    public Movie getMovie() {
        return movie;
    }
}
