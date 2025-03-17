package mephi.b22901.kateero.practicdecorator;

public class AddFireSouce extends BaseDecorator{
    
    public AddFireSouce(Component c) {
        super(c);
        this.name = "Огненный соус";
        this.price = 10;
    }
    
    public String extraName(){
        return this.name;
    }
    
    public int extraPrice(){
        return this.price;
    }
    
     public int getPrice(){
        return super.getPrice() + extraPrice();
    }
    
    public String getName(){
        return super.getName() + " + " + extraName();
    }
    
}
