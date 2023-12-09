package chapter5.movie;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
