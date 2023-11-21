package chapter1.theater;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        if (audience.getBag().hasInvitation()) {
            // 판매원에게 맞은 티켓을 관람객의 가방안에 넣어준다.
            Ticket ticket = ticketOffice.getTickets();
            audience.getBag().setTicket(ticket);
            // 초대장이 없다면 -> 이벤트 당첨되지 않은 관람객
        } else {
            // 판매원이 티켓을 판매한다.
            Ticket ticket = ticketOffice.getTickets();
            // 소극장이 관람객의 가방에서 티켓 금액 만큼 차감
            audience.getBag().minusAmount(ticket.getFee());
            // 매표소의 금액을 판매금액 만큼 증가시킨다
            ticketOffice.plusAmount(ticket.getFee());
            // 가방안에 넣어준다.
            audience.getBag().setTicket(ticket);
        }
    }
}
