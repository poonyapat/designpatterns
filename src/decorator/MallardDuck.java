package decorator;

public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack Mallard");
    }
}
