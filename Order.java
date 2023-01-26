import Material.Accessories;
import Material.Laptops;

public class Order {
	public String orderLaptop(int orderAmmount) {
		if (orderAmmount < Laptops.getLowOrderLevelQuantity()) {
			return "RequestForMaterial is generated";
		} else if (orderAmmount <= Laptops.getQuantity()) {
			int currentQuantity=Laptops.getQuantity();
			Laptops.setQuantity(currentQuantity - orderAmmount);
			return "Order placed";
		} else {
			return "Insufficient stock";
		}
	}

	public String orderAccessories(int orderAmmount) {
		if (orderAmmount < Laptops.getLowOrderLevelQuantity()) {
			return "RequestForMaterial is generated";
		} else if (orderAmmount <= Accessories.getQuantity()) {
			int currentQuantity=Accessories.getQuantity();
			Accessories.setQuantity(currentQuantity - orderAmmount);
			return "Order placed";
		} else {
			return "Insufficient stock";
		}
	}
}