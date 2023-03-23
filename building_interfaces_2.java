interface Fruits {
void taste();
}

interface SweetFruit extends Fruits {
void color();
}

class RedFruits implements SweetFruit {
public void taste() {
    System.out.println("RedFruits taste sweet and juicy!");
}
public void color() {
    System.out.println("RedFruits are red!");
}
}

public class building_interfaces_2 {
public static void main(String[] args) {
    RedFruits redFruits = new RedFruits();
    redFruits.taste(); 
    redFruits.color(); 
}
}