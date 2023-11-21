package chapter1.theater;

public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    public void enter(Audience audience) {
        // 관람객이 가방안에 초대장이 있는지 확인 -> 이벤트 당첨자
        if (audience.getBag().hasInvitation()) {
            // 판매원에게 맞은 티켓을 관람객의 가방안에 넣어준다.
            Ticket ticket = ticketSeller.getTicketOffice().getTickets();
            audience.getBag().setTicket(ticket);
            // 초대장이 없다면 -> 이벤트 당첨되지 않은 관람객
        } else {
            // 판매원이 티켓을 판매한다.
            Ticket ticket = ticketSeller.getTicketOffice().getTickets();
            // 소극장이 관람객의 가방에서 티켓 금액 만큼 차감
            audience.getBag().minusAmount(ticket.getFee());
            // 매표소의 금액을 판매금액 만큼 증가시킨다
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
            // 가방안에 넣어준다.
            audience.getBag().setTicket(ticket);
        }
    }
}
