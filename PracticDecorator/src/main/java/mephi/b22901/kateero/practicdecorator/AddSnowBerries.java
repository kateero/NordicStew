package mephi.b22901.kateero.practicdecorator;

public class AddSnowBerries extends BaseDecorator {

    public AddSnowBerries(Component c) {
        super(c);
        this.name = "Снежные ягоды";
        this.price = 5;
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
