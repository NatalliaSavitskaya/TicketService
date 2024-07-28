public class Admin extends User {
    public Admin() {
    }

    @Override
    public void printRole() {
        System.out.println("The role of the user is Admin.");
    }

    public void checkTicket() {
        System.out.println("Here Admin is checking the ticket...");
    }
}
