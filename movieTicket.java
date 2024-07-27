import java.math.BigDecimal;
import java.sql.Timestamp;

public class movieTicket extends Ticket {
    public movieTicket() {
    }

    public movieTicket(String concertHall, String eventCode, Timestamp eventTime) {
        super(concertHall, eventCode, eventTime);
    }

    public movieTicket(String concertHall, String eventCode, Timestamp eventTime, boolean isPromo,
                         char stadiumSector, float maxWeight, BigDecimal price){
        super (concertHall, eventCode, eventTime, isPromo, stadiumSector, maxWeight, price);
    }

    @Override
    public void printTicket() {
        System.out.println("This is an additional message about movie ticket type.");
    }
}