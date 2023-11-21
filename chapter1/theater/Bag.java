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

    // 초대장 보유 여부 판단
    public boolean hasInvitation() {
        return invitation != null;
    }
    // 티켓 보유 여부 판단
    public boolean hasTicket() {
        return ticket != null;
    }
    // 초대장을 티켓으로 교환
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    // 현금 감소
    public void minusAmount(Long amount) {
        this.amount -= amount;
    }
    // 현금 증가
    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}
