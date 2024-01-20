package chapter10.movie;


public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
