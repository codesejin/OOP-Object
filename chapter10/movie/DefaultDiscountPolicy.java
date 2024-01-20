package chapter10.movie;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DefaultDiscountPolicy implements DiscountPolicy {

    private List<chapter2.movie.DiscountCondition> conditions = new ArrayList<>();

    public DefaultDiscountPolicy(chapter2.movie.DiscountCondition... conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    @Override
    public chapter2.movie.Money calculateDiscountAmount(chapter2.movie.Screening screening) {
            for (DiscountCondition each : conditions) {
                if (each.isSatisfiedBy(screening)) {
                    return getDiscountAmount(screening);
                }
            }
            return chapter2.movie.Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
}
