package chapter4.movie;

import java.time.Duration;
import java.util.List;

public class Movie {
    /**
     * 영화 제목
     */
    private String title;

    /**
     * 영화 재생 시간
     */
    private Duration runningTime;

    /**
     * 영화 관람 가격
     */
    private Money fee;

    /**
     * 영화 할인 정책 계산
     */
    private List<DiscountCondition> discountConditions;

    /**
     * 영화 할인 정책 타입
     */
    private MovieType movieType;

    /**
     * 할인 가격 정보
     */
    private Money discountAmount;

    /**
     * 할인 비율 정보
     */
    private double discountPercent;

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public Money getFee() {
        return fee;
    }

    public void setFee(Money fee) {
        this.fee = fee;
    }

    public List<DiscountCondition> getDiscountConditions() {
        return discountConditions;
    }

    public void setDiscountConditions(List<DiscountCondition> discountConditions) {
        this.discountConditions = discountConditions;
    }

    public Money getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Money discountAmount) {
        this.discountAmount = discountAmount;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }
}