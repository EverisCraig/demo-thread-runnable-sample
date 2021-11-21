public class Client {
    private String name;
    private int[] shoppingCart;

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
