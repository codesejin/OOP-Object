package chapter10.movie;

public class ServiceLocator {
    private static ServiceLocator soleInstance = new ServiceLocator();
    private DiscountPolicy discountPolicy;
    // DiscountPolicy 인스턴스를 반환하는 메서드
    public static DiscountPolicy discountPolicy() {
        return soleInstance.discountPolicy;
    }
    // DiscountPolicy 인스턴스를 등록하기 위한 메서드
    public static void provide(DiscountPolicy discountPolicy) {
        soleInstance.discountPolicy = discountPolicy;
    }
    private ServiceLocator() {

    }
}
