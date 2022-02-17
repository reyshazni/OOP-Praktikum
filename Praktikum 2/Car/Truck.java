/**
 * @author [18220013] [Muhammad Rey Shazni Helmi]
 */

public class Truck extends Car {

    private boolean loaded;

    public Truck (int numberOfWheels, boolean loaded) {
        super(numberOfWheels);
        this.loaded = loaded;
    }

    public boolean isLoaded() {
        return loaded;
    }
    
    public void load() {
        this.loaded = true;
    }

    public void unload() {
        this.loaded = false;
    }

    public String toString() {
        return "Number of Wheels: " + String.valueOf(this.getNumberOfWheels()) + ", Mileage: " + String.valueOf(this.getMileage()) + ", Is Loaded: "+String.valueOf(this.isLoaded());
    }

    public long getPrice(){
        return (long) this.getNumberOfWheels() * 5000000;
    }
}