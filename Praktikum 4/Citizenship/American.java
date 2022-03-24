/**
 * American.java
 * 
 * @author [18220013] [Muhammad Rey Shazni Helmi]
 */

public class American extends Citizenship {
    private String state;

    public American(String surname, String givenName, String state) {
        // Konstruktor
        super(surname, givenName);
        this.state = state;
    }

    public String getState() {
        // Mengembalikan atribut state
        return this.state;
    }

    @Override
    public void speak() {
        // Mencetak "Hello buddy!" diakhiri newline
        System.out.printf("Hello buddy!\n");
    }
}