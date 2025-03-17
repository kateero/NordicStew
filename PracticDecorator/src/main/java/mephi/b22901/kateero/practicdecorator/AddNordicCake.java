package mephi.b22901.kateero.practicdecorator;

public class AddNordicCake extends BaseDecorator{

    public AddNordicCake(Component c) {
        super(c);
        this.name = "Нордская лепешка";
        this.price = 7;
    }

    public String extraName() {
        return this.name;
    }

    public int extraPrice() {
        return this.price;
    }

    public int getPrice() {
        return super.getPrice() + extraPrice();
    }

    public String getName() {
        return super.getName() + " + " + extraName();
    }
}
