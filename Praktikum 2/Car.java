/**
 * Car.java
 * [Kelas-kelas mobil untuk memodelkan mobil yang akan dijual oleh perusahaan Tasle]
 * @author [18220013] [Muhammad Rey Shazni Helmi]
 */

public abstract class Car {
    private int numberOfWheels;
    private long mileage;
    
    public Car(int numberOfWheels) {
        // Konstruktor, set mileage = 0
        this.numberOfWheels = numberOfWheels;
        this.mileage = 0;
    }
    
    public int getNumberOfWheels() {
        // Mengembalikan atribut numberOfWheels 
        return numberOfWheels;
    }
  
    public long getMileage() {
        // Mengembalikan atribut mileage
        return mileage;
    }
    
    public void increaseMileage(long increment) {
        // Meningkatkan nilai atribut mileage
        mileage += increment;
    }
  
    public String toString() {
        // Mengembalikan informasi mobil dengan format: "Number of Wheels: {numberOfWheels}, Mileage: {mileage}"
        return String.format("Number of Wheels: %d, Mileage: %d", numberOfWheels, mileage);
    }
  
    public abstract long getPrice();
}
  