package chapter1.theater;

public class TicketSeller {
    private TicketOffice ticketOffice;

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public void sellTo(Audience audience) {
        // 판매된 금액 매표소에 증가시킴
        ticketOffice.plusAmount(audience.buy(ticketOffice.getTickets()));
    }
}
