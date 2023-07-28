package lsp2.model;

public abstract class Orderable {
    protected final int price;
    protected final int quantity;

    public Orderable(int price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public abstract int getAmount();

    @Override
    public String toString() {
        return "Oderable{" +
                "price=" + price +
                ",quantity=" + quantity +
                '}' + " it's a bonus order";
    }
}
