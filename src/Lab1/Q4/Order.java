package Lab1.Q4;
import java.util.List;
import java.util.ArrayList;
public class Order {
    private int ID;
    private List<Item> items;

    public Order(int ID) {
        this.ID = ID;
        this.items = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateAverageCost() {
        if (items.isEmpty()) {
            return 0.0;
        }
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice();
        }

        return total / items.size();
    }

}
