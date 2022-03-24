/**
 * Animal.java
 * Abstract yang yang mengimplementasikan interface HavePower
 * @author [18220013] [Muhammad Rey Shazni Helmi]
 */

public abstract class Animal implements HavePower{
    private int rawPower;
    private String habitat;
    
    public Animal(int rawPower, String habitat){
        this.rawPower = rawPower;
        this.habitat = habitat;
    }

    public String getHabitat(){
        return habitat;
    }

    public int getRawPower(){
        return rawPower;
    }

    public boolean isStrongerThan(HavePower havepower){
        return this.getRawPower() > havepower.getRawPower();
    }

    public void fight (Animal animal){
        if (this.rawPower > animal.getRawPower() && this.habitat == animal.getHabitat()){
            this.rawPower += animal.getRawPower();
        }
    }

    public abstract void speak();

}
