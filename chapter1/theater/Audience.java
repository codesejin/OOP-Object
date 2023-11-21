package chapter1.theater;

public class Audience {
    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Bag getBag() {
        return bag;
    }

    public Long buy (Ticket ticket) {
        // 자신의 가방안에 초대장이 있는지 확인 -> 이벤트 당첨자
        if (bag.hasInvitation()) {
            // 판매원에게 받은 티켓을 관람객이 가방안에 넣는다.
           bag.setTicket(ticket);
           return 0L;
        // 초대장이 없다면 -> 이벤트 당첨되지 않은 관람객
        } else {
            // 관람객이 판매원에게 받은 티켓을 관람객이 가방안에 넣는다.
            bag.setTicket(ticket);
            // 자신의 가방에서 티켓 금액 만큼 차감
            bag.minusAmount(ticket.getFee());
            // 구매한 금액 반환
            return ticket.getFee();
        }
    }
}
