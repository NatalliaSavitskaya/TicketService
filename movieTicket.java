import java.math.BigDecimal;
import java.sql.Timestamp;

public class movieTicket extends Ticket {
    public movieTicket() {
    }

    public movieTicket(String cinemaHall, String eventCode, Timestamp eventTime) {
        super(cinemaHall, eventCode, eventTime);
    }

    public movieTicket(String cinemaHall, String eventCode, Timestamp eventTime, boolean isPromo,
                         char row, float maxWeight, BigDecimal price){
        super (cinemaHall, eventCode, eventTime, isPromo, row, maxWeight, price);
    }

    @Override
    public void printTicket() {
        System.out.println("This is a ticket to the movie.");
        System.out.println("Ticket ID: " + getID());
        System.out.println("Ticket creation time is: " + creationTime);
        System.out.println("Cinema hall is: " + concertHall);
        System.out.println("Movie time is: " + eventTime);
        System.out.println("Price=" + price + " EUR");
    }
}