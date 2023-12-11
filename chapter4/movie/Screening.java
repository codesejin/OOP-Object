package chapter4.movie;

import java.time.LocalDateTime;

public class Screening {
    /**
     * 상영될 영화 정보
     */
    private Movie movie;

    /**
     * 상영 회차 정보
     */
    private int sequence;

    /**
     * 상영 시작 시간
     */
    private LocalDateTime whenScreened;

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public LocalDateTime getWhenScreened() {
        return whenScreened;
    }

    public void setWhenScreened(LocalDateTime whenScreened) {
        this.whenScreened = whenScreened;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
}
