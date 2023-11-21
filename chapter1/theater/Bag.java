package chapter1.theater;

public class Bag {
    private Long amount;
    private Invitation invitation;
    private Ticket ticket;

    // 이벤트에 당첨되지 않은 관람객
    public Bag(Long amount) {
        this.amount = amount;
    }
    // 이벤트에 당첨된 관람객
    public Bag(Long amount, Invitation invitation) {
        this.amount = amount;
        this.invitation = invitation;
    }

    public Long hold(Ticket ticket) {
        if (hasInvitation()) {
            // 판매원에게 받은 티켓을 가방 스스로 자기안에 넣는다.
            setTicket(ticket);
            return 0L;
        } else {
            // 판매원에게 받은 티켓을 가방 스스로 자기안에 넣는다.
            setTicket(ticket);
            // 스스로 티켓 금액 만큼 차감
            minusAmount(ticket.getFee());
            // 구매한 금액 반환
            return ticket.getFee();
        }
    }

    // 초대장 보유 여부 판단
    private boolean hasInvitation() {
        return invitation != null;
    }
    // 티켓 보유 여부 판단
    private boolean hasTicket() {
        return ticket != null;
    }
    // 초대장을 티켓으로 교환
    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    // 현금 감소
    private void minusAmount(Long amount) {
        this.amount -= amount;
    }
}
