package composite;


import java.util.ArrayList;
import java.util.List;

public class Flock {
    private List<Quackable> quackableCreatures = new ArrayList<>();

    public void addQuackbleCreature(Quackable creature) {
        quackableCreatures.add(creature);
    }

    public void allQuack() {
        quackableCreatures.forEach(Quackable::quack);
    }
}
