public class ExtraCheese extends ToppingDecorator {

    BasePizza basePizza;

    public ExtraCheese(BasePizza pizza){
        this.basePizza = pizza;
    }
    @Override
    public int cost() {
        System.out.println("Extra cheese");
        return this.basePizza.cost() + 10;
    }
}
