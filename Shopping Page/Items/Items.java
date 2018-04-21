package Items;

public class Items {
	public static int IDcount=0;
	int price;
	private int id;
	/**
	 * @param price  price of items
	 * @param id	id of items
	 */
	public Items(int price, int id) {
		//super();
		this.price = price;
		this.IDcount++;
		this.setId(IDcount);
	}
	/**
	 * @return  price of item
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price   price of item
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return  id of item to gets visibility method
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id   id of item
	 */
	public void setId(int id) {
		this.id = id;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * @override
	 */
	public String toString(){
		return ("\tItem name: ");
	}
	
	
}
