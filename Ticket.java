import java.util.Random;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.math.BigDecimal;

public class Ticket {
    private String id;
    private String concertHall;
    private String eventCode;
    private Timestamp eventTime;
    private boolean isPromo;
    private char stadiumSector;
    private float maxWeight;
    private BigDecimal price;
    private final LocalDateTime creationTime = LocalDateTime.now().truncatedTo(ChronoUnit.SECONDS);

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final Random RANDOM = new Random();

    public Ticket() {
        this.id = generateID();
    }

    public Ticket(String concertHall, String eventCode, Timestamp eventTime){
        this.id = generateID();
        this.concertHall = concertHall;
        this.eventCode = eventCode;
        this.eventTime = eventTime;
    }

    public Ticket(String concertHall, String eventCode, Timestamp eventTime, boolean isPromo,
                  char stadiumSector, float maxWeight, BigDecimal price){
        this.id = generateID();
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

    private String generateID(){
        StringBuilder id = new StringBuilder(4);
        for (int i = 0; i < 4; i++) {
            id.append(CHARACTERS.charAt(RANDOM.nextInt(CHARACTERS.length())));
        }
        return id.toString();
    }

    public String toString() {
        return "Ticket ID is:'" + id +
                ", ticket creation time is: " + creationTime +
                ", concert hall is: " + concertHall +
                ", event code is: " + eventCode +
                ", event time is: " + eventTime +
                ", ticket is promo: " + isPromo +
                ", stadium sector is: " + stadiumSector +
                ", max allowed backpack weight (kg.g): " + String.format("%.2f", maxWeight) +
                ", price=" + price;
    }
}
