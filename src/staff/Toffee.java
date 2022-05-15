package staff;

public class Toffee extends staff {
    private String taste;

    public Toffee(String name, Double weight, Double price, String taste) {
        super(name, weight, price);
        this.taste = taste;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    @Override
    public String toString() {
        return "Toffee + [" + super.toString() + ", taste = " + taste + "]";
    }
}
