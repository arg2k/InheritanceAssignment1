package Material;

import Stock.Inventory;

public class Laptops extends Inventory {
	private int id;
    private String description;

    public Laptops(int id, String description, int quantity) {
        super(quantity, 3);
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
