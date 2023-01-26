import Material.Accessories;
import Material.Laptops;

public class TesterOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order ord = new Order();
		Laptops.setQuantity(11);
        Accessories.setQuantity(21);
        
        Laptops.setLowOrderLevelQuantity(3);
        Accessories.setLowOrderLevelQuantity(5);
        
        String latopOrderStatus = ord.orderLaptop(5);
        String accessoriesOrderStatus = ord.orderAccessories(10);
        System.out.println(latopOrderStatus);
        System.out.println(accessoriesOrderStatus);
        System.out.println("Current count of laptops is " + Laptops.getQuantity());
        System.out.println("Current count of Accessories is " + Accessories.getQuantity());
        
        latopOrderStatus = ord.orderLaptop(1);
        accessoriesOrderStatus = ord.orderAccessories(6);
        System.out.println(latopOrderStatus);
        System.out.println(accessoriesOrderStatus);
	}

}
