package PizzaDeliver;

public interface Food {
    public abstract String getName();
    public abstract float getPrice();
    public abstract void setName(String n);
    public abstract void setPrice(float p);
    public abstract String toString();
}
