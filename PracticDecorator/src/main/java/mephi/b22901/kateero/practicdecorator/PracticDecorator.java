package mephi.b22901.kateero.practicdecorator;

public class PracticDecorator {

    public static void main(String[] args) {
        Component stew = new NordicStew();
        stew = new AddFireSouce(stew);
        stew = new AddSnowBerries(stew);
        System.out.println(stew.getPrice());
    }
}
