import java.sql.Timestamp;
import java.math.BigDecimal;

class TicketService {
    public static void main(String []args) {
        Timestamp eventTime = new Timestamp(System.currentTimeMillis());
        BigDecimal price = BigDecimal.valueOf(19.99);

        Ticket emptyTicket = new Ticket();
        System.out.println("The info about the empty ticket is:");
        System.out.println(emptyTicket.toString());

        Ticket limitedTicket = new Ticket("Alexandria", "012", eventTime);
        System.out.println("The info about the limited ticket is:");
        System.out.println(limitedTicket.toString());

        Ticket fullTicket = new Ticket("Alexandria", "012", eventTime, true, 'A', 10.15F, price);
        fullTicket.ticketValidation();
        System.out.println("The info about the full ticket is:");
        System.out.println(fullTicket.toString());
    }
}

