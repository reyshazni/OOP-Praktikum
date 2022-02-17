/**
 * @author [18220013] [Muhammad Rey Shazni Helmi]
 */

 public class Bus extends Car {

    private int maxCapacity;

    public Bus (int maxCapacity) {
        super(6);
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public String toString() {
        return "Number of Wheels: " + String.valueOf(this.getNumberOfWheels()) + ", Mileage: " + String.valueOf(this.getMileage()) + "Max Capacity: " + String.valueOf(this.getMaxCapacity());
    }

    public long getPrice() {
        if (this.getMileage() >= 0 && this.getMileage() <= 10000 ) {
            return (long) 1000000 * this.getMaxCapacity();
        } else {
            return (long) 500000 * this.getMaxCapacity();
        }
    }
}