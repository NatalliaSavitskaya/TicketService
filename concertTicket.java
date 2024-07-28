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

    @Override
    public void printTicket() {
        System.out.println("This is a ticket to the concert.");
        System.out.println("Ticket ID: " + getID());
        System.out.println("Ticket creation time is: " + getCreationTime());
        System.out.println("Concert hall is: " + getConcertHall());
        System.out.println("Event code is: " + getEventCode());
        System.out.println("Event time is: " + getEventTime());
        System.out.println("Ticket is promo:" + getIsPromo());
        System.out.println("Stadium sector is: " + getStadiumSector());
        System.out.println("Max allowed backpack weight: " + String.format("%.2f", getMaWeight()) + " kg.g");
        System.out.println("Price=" + getPrice() + " EUR");
    }
}