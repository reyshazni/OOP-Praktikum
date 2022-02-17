/**
 * Tiger.java
 * Class Tiger yang extend dari Animal
 * @author [18220013] [Muhammad Rey Shazni Helmi]
 */

public class Tiger extends Animal {
    public Tiger(){
        super(100,"LAND");
    }

    public Tiger(int rawPower){
        super(rawPower,"LAND");
    }

    public void speak(){
        System.out.printf("RAWRRRR!!! I'm a Tiger!\n");
    }
}