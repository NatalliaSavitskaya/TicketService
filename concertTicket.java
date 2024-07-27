import java.math.BigDecimal;
import java.sql.Timestamp;

public class concertTicket extends Ticket {
    public concertTicket() {
    }

    public concertTicket(String concertHall, String eventCode, Timestamp eventTime) {
        super(concertHall, eventCode, eventTime);
    }

    public concertTicket(String concertHall, String eventCode, Timestamp eventTime, boolean isPromo,
                  char stadiumSector, float maxWeight, BigDecimal price){
        super (concertHall, eventCode, eventTime, isPromo, stadiumSector, maxWeight, price);
    }
}