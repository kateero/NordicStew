package mephi.b22901.kateero.practicdecorator;

public abstract class BaseDecorator implements Component {
    private Component wrappee;
    protected String name;
    protected int price;
    
    public BaseDecorator(Component c){
        this.wrappee = c;
    }
    
    public int getPrice(){
        return wrappee.getPrice();
    }
    
    public String getName(){
        return wrappee.getName();
    }
}
