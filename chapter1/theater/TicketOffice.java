package chapter1.theater;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TicketOffice {
    // 판매 금액
    private Long amount;
    // 교환해줄 티켓 목록
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public void sellTo(Audience audience) {
        // 판매된 금액 매표소에 증가시킴
        plusAmount(audience.buy(getTickets()));
    }
    // 티켓 판매
    private Ticket getTickets() {
        return tickets.remove(0);
    }

    // 판매 금액 증가
    private void plusAmount(Long amount) {
        this.amount += amount;
    }
    // 판매 금액 차감
    private void minusAmount(Long amount) {
        this.amount -= amount;
    }
}
