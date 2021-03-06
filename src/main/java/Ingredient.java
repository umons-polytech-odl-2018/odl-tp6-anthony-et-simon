public class Ingredient implements Food {

    private String name;
    private float price;

    public Ingredient(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getPrice() {
        return price;
    }

    @Override
    public void setName(String n) {

    }

    @Override
    public void setPrice(float p) {

    }

    @Override
    public String toString() {
        return "Ingredient{" +
            "name='" + name + '\'' +
            ", price=" + price +
            '}';
    }
}
