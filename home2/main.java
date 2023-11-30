package home2;

public class main {
    public static void main(String[] args) {
        Market market = new Market();
        Human human1 = new Human("Вадим");
        Human human2 = new Human("Артем");
        market.acceptToMarket(human1);
        market.acceptToMarket(human2);
        market.update();

    }
}
