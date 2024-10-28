public class Mushroom extends ToppingDecorator{

    BasePizza basePizza;

    public Mushroom(BasePizza pizza){
        this.basePizza = pizza;
    }
    @Override
    public int cost() {
        System.out.println("Mushroom");
        return this.basePizza.cost() + 15;
    }
}
