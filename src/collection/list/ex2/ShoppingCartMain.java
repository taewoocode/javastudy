package collection.list.ex2;

public class ShoppingCartMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item( "마늘", 2000, 2 );
        Item item2 = new Item( "상추", 3000, 4 );

        cart.add( item1 );
        cart.add( item2 );
        cart.displayItem();

    }
}
