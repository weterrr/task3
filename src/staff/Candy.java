package staff;

public class Candy extends staff {
    private String color;
    public Candy(String name, Double weight, Double price, String color) {
        super(name, weight, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Candy + [" + super.toString() + ", color = " + color + "]";
    }
}
