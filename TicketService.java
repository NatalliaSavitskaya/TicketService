import java.sql.Timestamp;
import java.math.BigDecimal;

class TicketService {
    public static void main(String []args) {
        Timestamp eventTime = new Timestamp(System.currentTimeMillis());
        BigDecimal price = BigDecimal.valueOf(19.99);

        concertTicket emptyTicket = new concertTicket();
        System.out.println("The info about the empty ticket is:");
        System.out.println(emptyTicket.toString());

        concertTicket limitedTicket = new concertTicket("Alexandria", "012", eventTime);
        System.out.println("The info about the limited ticket is:");
        System.out.println(limitedTicket.toString());

        concertTicket fullTicket = new concertTicket("Alexandria", "012", eventTime, true, 'A', 10.15F, price);
        fullTicket.ticketValidation();
        System.out.println("The info about the full ticket is:");
        System.out.println(fullTicket.toString());


        System.out.println(fullTicket.getID()); // checking for get method of id
        fullTicket.setID(2356);
        System.out.println(fullTicket.toString()); // checking for set method of id

    }
}

