package Items;

public class Cosmetic extends Items{
	public String manufacturer;
	public String brand;
	public String expDate;
	public int weight;
	public String organicOrNot;
	/**
	 * @param price
	 * @param id
	 * @param manufacturer
	 * @param brand
	 * @param expDate
	 * @param weight
	 * @param organicOrNot
	 */
	public Cosmetic(int price, int id, String manufacturer, String brand, String expDate, int weight,
			String organicOrNot) {
		super(price, id);
		this.manufacturer = manufacturer;
		this.brand = brand;
		this.expDate = expDate;
		this.weight = weight;
		this.setOrganicOrNot(organicOrNot);
	}
	/**
	 * 
	 * @return call manufactor
	 */
	public String getManufacturer() {
		return manufacturer;
	}
	/**
	 * 
	 * @param manufacturer set manufactor
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	/**
	 * 
	 * @return
	 */
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getOrganicOrNot() {
		return organicOrNot;
	}
	/**
	 * 
	 * @param organicOrNot organic or not
	 */
	public void setOrganicOrNot(String organicOrNot) {
		if(organicOrNot.equals("1")){
			organicOrNot="Yes";
		}
		else{
			organicOrNot="No";
		}
		this.organicOrNot = organicOrNot;
	}
	
	
}
