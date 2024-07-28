import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.util.Objects;

public abstract class Ticket {
    public int id;
    public String concertHall;
    public String eventCode;
    public Timestamp eventTime;
    public boolean isPromo;
    public char stadiumSector;
    public float maxWeight;
    public BigDecimal price;
    public final LocalDateTime creationTime = LocalDateTime.now();

    private static int currentID = 1000;

    public static int getNextID() {
        if (currentID==9999) {
            System.out.println("The maximum value of id was reached. The id generation started again from 1000.");
            currentID = 1000;
        }
        return currentID++;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        if ((id<1000)||(id>9999))
            throw new IllegalArgumentException("The id should consist of 4 digits.");
        else this.id = id;
    }

    public Ticket() {
        this.id = getNextID();
    }

    public Ticket(String concertHall, String eventCode, Timestamp eventTime) {
        this.id = getNextID();
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.eventTime = eventTime;
    }

    public Ticket(String concertHall, String eventCode, Timestamp eventTime, boolean isPromo,
                  char stadiumSector, float maxWeight, BigDecimal price){
        this.id = getNextID();
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.eventTime = eventTime;
        this.isPromo = isPromo;
        this.stadiumSector = stadiumSector;
        this.maxWeight = maxWeight;
        this.price = price;
    }

    public void ticketValidation() {
        if (concertHall.length() > 10) {
            throw new IllegalArgumentException("Concerthall cannot be longer than 10 characters.");
        }
        if (!eventCode.matches("\\d{3}")) {
            throw new IllegalArgumentException("Eventcode must consist of 3 digits.");
        }
        if ((stadiumSector<'A')||(stadiumSector>'C')) {
            throw new IllegalArgumentException("Stadium sector should be A, B or C.");
        }
        if (maxWeight<0) {
            throw new IllegalArgumentException("Max weight can't be negative.");
        }
    }

    public void printTicket() {
        System.out.println("This is general info about the ticket.");
        System.out.println("Ticket ID: " + getID());
        System.out.println("Ticket creation time is: " + creationTime);
    }

    public void sharedTicket(String phone) {
        System.out.println("This ticket is shared by phone: " + phone);
    }

    public void sharedTicket(String phone, String email) {
        System.out.println("This ticket is shared by phone: " + phone + " and email: " + email);
    }

    @Override
    public String toString() {
        return "Ticket ID is:'" + id +
                ", event code is: " + eventCode +
                ", event time is: " + eventTime;
    }

    @Override
    public boolean equals(Object anyObject) {
        if (this == anyObject) return true; // This ensures that the objects is equal to itself
        if (anyObject == null || getClass() != anyObject.getClass()) return false; //This ensures that the objects being compared are of the same type
       // compare 2 Ticket objects by fields id, eventCode, eventTime
        Ticket ticket = (Ticket) anyObject;
        return id == ticket.id &&
                Objects.equals(eventCode, ticket.eventCode) &&
                Objects.equals(eventTime, ticket.eventTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, eventCode, eventTime);
    }
}
