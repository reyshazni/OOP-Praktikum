/**
 * Indonesian.java
 * 
 * @author [18220013] [Muhammad Rey Shazni Helmi]
 */

public class Indonesian extends Citizenship {
    private IndonesianLocalLanguage localLanguage;

    public Indonesian(String surname, String givenName, IndonesianLocalLanguage localLanguage) {
        // Konstruktor
        super(surname, givenName);
        this.localLanguage = localLanguage;
    }

    public IndonesianLocalLanguage getLocalLanguage() {
        // Mengembalikan atribut localLanguage
        return this.localLanguage;
    }

    public void speakLocalLanguage() {
        // jika localLanguage adalah JAVANESE, mencetak "Nami Kulo Tuan Mal" diakhiri
        // newline
        // jika localLanguage adalah SUNDANESE, mencetak "Nepangkeun wasta sim kuring
        // Tuan Mal" diakhiri newline
        IndonesianLocalLanguage local = getLocalLanguage();
        IndonesianLocalLanguage jawa = IndonesianLocalLanguage.JAVANESE;
        IndonesianLocalLanguage sunda = IndonesianLocalLanguage.SUNDANESE;
        if (local == jawa) {
            System.out.printf("Nami Kulo Tuan Mal\n");
        } else if (local == sunda) {
            System.out.printf("Nepangkeun wasta sim kuring Tuan Mal\n");
        }
    }

    @Override
    public void speak() {
        System.out.printf("Halo, aku Tuan Mal\n");
        // Mencetak "Halo, aku Tuan Mal" diakhiri newline
    }
}
