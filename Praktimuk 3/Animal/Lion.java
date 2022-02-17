/**
 * Lion.java
 * Class Lion yang extend dari Animal
 * @author [18220013] [Muhammad Rey Shazni Helmi]
 */

public class Lion extends Animal {
    public Lion(){
        super(150,"LAND");
    }

    public Lion(int rawPower){
        super(rawPower,"LAND");
    }

    public void speak(){
        System.out.printf("GRAWRRRR!!! I'm a Lion!\n");
    }
    
}
