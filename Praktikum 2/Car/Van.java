/**
 * @author [18220013] [Muhammad Rey Shazni Helmi]
 */

public class Van extends Car{

    private long basePrice;

    public Van (long basePrice) {
        super(4);
        this.basePrice = basePrice;
    }

    public long getBasePrice() {
        return basePrice;
    }

    public long getPrice() {
        if (this.getMileage() >= 0 && this.getMileage() <= 1000){
            return this.getBasePrice();
        }
        else if (this.getMileage() > 1000 && this.getMileage() <= 10000){
            return (long) Math.floor(this.getBasePrice()*3/4);
        }else{
            return (long) Math.floor(this.getBasePrice()/2);
        }
    }
}