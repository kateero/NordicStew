package mephi.b22901.kateero.practicdecorator;

public class NordicStew implements Component{
    
    private String name = "Нордское рагу";
    private int price = 50;

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getName() {
        return this.name;
    }
    
}
