package mephi.b22901.kateero.practicdecorator;

public class AddDoubleDeer extends BaseDecorator {

    public AddDoubleDeer(Component c) {
        super(c);
        this.name = "Двойная порция оленины";
        this.price = 20;
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
