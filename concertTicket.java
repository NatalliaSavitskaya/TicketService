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
        System.out.println("Ticket creation time is: " + creationTime);
        System.out.println("Concert hall is: " + concertHall);
        System.out.println("Event code is: " + eventCode);
        System.out.println("Event time is: " + eventTime);
        System.out.println("Ticket is promo:" + isPromo);
        System.out.println("Stadium sector is: " + stadiumSector);
        System.out.println("Max allowed backpack weight: " + String.format("%.2f", maxWeight) + " kg.g");
        System.out.println("Price=" + price + " EUR");
    }
}