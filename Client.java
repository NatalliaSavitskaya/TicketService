public class Client extends User {
    public Client() {
    }

    @Override
    public void printRole() {
        System.out.println("The role of the user is Client.");
    }

    public void getTicket() {
        System.out.println("Here Client is getting the ticket...");
    }
}