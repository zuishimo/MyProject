package List;

public class Item implements Comparable<Item> {

	public String name;
	public int price;
	
	public Item() {
		
	}
	
	public Item(String name, int price) {
		
		this.name=name;
		this.price=price;
		
	}
	
	public int compareTo(Item anotherItem) {
		return price-anotherItem.price;
	}
	
	public String toString() {
		
		return "Item [name=" + name + ", price=" + price + "]\r\n";
	}
	
}
