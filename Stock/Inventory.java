package Stock;

public class Inventory {
	private static int quantity;
    private static int lowOrderLevelQuantity;

    public Inventory(int quantity, int lowOrderLevelQuantity) {
    	Inventory.quantity = quantity;
    	Inventory.lowOrderLevelQuantity = lowOrderLevelQuantity;
    }

    public static int getQuantity() {
        return quantity;
    }

    public static void setQuantity(int quantity) {
    	Inventory.quantity = quantity;
    }

    public static int getLowOrderLevelQuantity() {
        return lowOrderLevelQuantity;
    }

    public static void setLowOrderLevelQuantity(int lowOrderLevelQuantity) {
    	Inventory.lowOrderLevelQuantity = lowOrderLevelQuantity;
    }
}
