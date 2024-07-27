import java.sql.Timestamp;
import java.math.BigDecimal;

class TicketService {
    public static void main(String []args) {
        Timestamp eventTime = new Timestamp(System.currentTimeMillis());
        BigDecimal price = BigDecimal.valueOf(19.99);

        // working with concert tickets
        concertTicket emptyTicket = new concertTicket();
        System.out.println("The info about the empty ticket is:");
        emptyTicket.printTicket();

        concertTicket limitedTicket = new concertTicket("Alexandria", "012", eventTime);
        System.out.println("The info about the limited ticket is:");
        limitedTicket.printTicket();

        concertTicket fullTicket = new concertTicket("Alexandria", "012", eventTime, true, 'A', 10.15F, price);
        fullTicket.ticketValidation();
        System.out.println("The info about the full ticket is:");
        fullTicket.printTicket();

        System.out.println(fullTicket.getID()); // checking for get method of id
        fullTicket.setID(2356);
        fullTicket.printTicket(); // checking for set method of id

        movieTicket emptyTicket2 = new movieTicket();
        System.out.println("The info about the empty ticket is:");
        emptyTicket2.printTicket();

        // working with movie tickets
        movieTicket limitedTicket2 = new movieTicket("Alexandria", "012", eventTime);
        System.out.println("The info about the limited ticket is:");
        limitedTicket2.printTicket();

        movieTicket fullTicket3 = new movieTicket("Alexandria", "012", eventTime, true, 'A', 10.15F, price);
        fullTicket.ticketValidation();
        System.out.println("The info about the full ticket is:");
        fullTicket3.printTicket();

        System.out.println(fullTicket3.getID()); // checking for get method of id
        fullTicket3.setID(2356);
        fullTicket3.printTicket(); // checking for set method of id
    }
}

