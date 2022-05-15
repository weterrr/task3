import staff.Candy;
import staff.Jellybean;
import staff.Toffee;
import staff.staff;

public class Base  {
    public static void main(String[] args) {
        Candy candy1 = new Candy("Barbaris", 0.1, 4.1, "red");
        Candy candy2 = new Candy("Mint", 0.2, 4.8, "green");
        Jellybean jellybean1 = new Jellybean("Bee", 10.1, 4.1, "fruit");
        Toffee toffee1 = new Toffee("Cup", 1.1, 5.5, "coffee");
        Toffee toffee2 = new Toffee("Milk", 2.1, 6.1, "vanilla");
        staff[] box = {candy1, candy2, jellybean1, toffee1, toffee2};
        for (staff somestaff : box) {
            System.out.println(somestaff.toString());
        }
        System.out.println("Общая стоимость подарка: ");
        System.out.println(candy1.getPrice() + candy2.getPrice() + jellybean1.getPrice() + toffee1.getPrice() + toffee2.getPrice());
        System.out.println("Общий вес подарка: ");
        System.out.println(candy1.getWeight() + candy2.getWeight() + jellybean1.getWeight() + toffee1.getWeight() + toffee2.getWeight());
    }
}
