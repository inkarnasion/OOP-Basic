package polymorphism_exercises.wildFarm;
public abstract class Food {

    private int quantity;

    public Food(int quantity) {
        this.setQuantity(quantity);
    }

    protected int getQuantity() {
        return this.quantity;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}