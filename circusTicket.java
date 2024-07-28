import java.math.BigDecimal;
import java.sql.Timestamp;

public class circusTicket extends Ticket {
    public circusTicket() {
    }

    public circusTicket(String circus, String eventCode, Timestamp eventTime) {
        super(circus, eventCode, eventTime);
    }

    public circusTicket(String circus, String eventCode, Timestamp eventTime, boolean isPromo,
                         char circusSector, float maxWeight, BigDecimal price) {
        super(circus, eventCode, eventTime, isPromo, circusSector, maxWeight, price);
    }
}