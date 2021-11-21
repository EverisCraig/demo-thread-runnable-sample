public class Client {
    private final String name;
    private final int[] shoppingCart;

    public Client(String name, int[] shoppingCart) {
        this.name = name;
        this.shoppingCart = shoppingCart;
    }

    public String getName() {
        return name;
    }

    public int[] getShoppingCart() {
        return shoppingCart;
    }
}
