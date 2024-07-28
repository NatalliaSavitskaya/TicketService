import java.sql.Timestamp;
import java.math.BigDecimal;

class TicketService {
    public static void main(String []args) {
        Timestamp eventTime = new Timestamp(System.currentTimeMillis());
        BigDecimal price = BigDecimal.valueOf(19.99);

        // working with concert tickets
        concertTicket emptyTicket = new concertTicket();
        System.out.println("The info about the empty concert ticket is:");
        emptyTicket.printTicket();

        concertTicket limitedTicket = new concertTicket("Alexandria", "012", eventTime);
        System.out.println("The info about the limited concert ticket is:");
        limitedTicket.printTicket();

        concertTicket fullTicket = new concertTicket("Alexandria", "012", eventTime, true, 'A', 10.15F, price);
        fullTicket.ticketValidation(); // checking for parameters validation
        System.out.println("The info about the full concert ticket is:");
        fullTicket.printTicket();
        fullTicket.sharedTicket("+37212345678"); // checking for sharing by phone
        fullTicket.sharedTicket("+37212345678", "newemail@mail.com"); // checking for sharing by phone and email

        System.out.println(fullTicket.getID()); // checking for get method of id

        fullTicket.setID(2356);
        fullTicket.printTicket(); // checking for set method of id

        // working with movie tickets
        movieTicket emptyTicket2 = new movieTicket();
        System.out.println("The info about the empty movie ticket is:");
        emptyTicket2.printTicket();

        movieTicket limitedTicket2 = new movieTicket("Kinocinema", "354", eventTime);
        System.out.println("The info about the limited movie ticket is:");
        limitedTicket2.printTicket();

        movieTicket fullTicket2 = new movieTicket("Kinocinema", "354", eventTime, true, 'B', 1.5F, price);
        fullTicket.ticketValidation();
        System.out.println("The info about the full movie ticket is:");
        fullTicket2.printTicket();

        fullTicket2.sharedTicket("+37511111111"); // checking for sharing by phone
        fullTicket2.sharedTicket("+37511111111", "oldmail@mail.com"); // checking for sharing by phone and email

        System.out.println(fullTicket2.getID()); // checking for get method of id
        fullTicket2.setID(2356);
        fullTicket2.printTicket(); // checking for set method of id

        // working with circus tickets
        circusTicket emptyTicket3 = new circusTicket();
        System.out.println("The info about the empty circus ticket is:");
        emptyTicket3.printTicket();

        circusTicket limitedTicket3 = new circusTicket("Circus", "857", eventTime);
        System.out.println("The info about the limited circus ticket is:");
        limitedTicket3.printTicket();

        circusTicket fullTicket3 = new circusTicket("Circus", "857", eventTime, true, 'C', 2.00F, price);
        fullTicket3.ticketValidation();
        System.out.println("The info about the full circus ticket is:");
        fullTicket3.printTicket();

        fullTicket3.sharedTicket("+3702222222"); // checking for sharing by phone
        fullTicket3.sharedTicket("+3702222222", "very.newemail@mail.com"); // checking for sharing by phone and email

        System.out.println(fullTicket3.getID()); // checking for get method of id
        fullTicket3.setID(2356);
        fullTicket3.printTicket(); // checking for set method of id
    }
}

