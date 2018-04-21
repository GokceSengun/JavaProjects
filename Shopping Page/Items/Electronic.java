package Items;

/**
 * 
 * @author GÖKÇE
 *
 */
public class Electronic extends Items{
	String manufacturer;
	String brand;
	int maxAllowVoltage;
	int maxPowerCons;
	/**
	 * @param price of electronic
	 * @param id of electronic
	 * @param manufacturer of electronic
	 * @param brand of electronic
	 * @param maxAllowVoltage of electronic
	 * @param maxPowerCons of electronic
	 */
	public Electronic(int price, int id, String manufacturer, String brand, int maxAllowVoltage, int maxPowerCons) {
		super(price, id);
		this.manufacturer = manufacturer;
		this.brand = brand;
		this.maxAllowVoltage = maxAllowVoltage;
		this.maxPowerCons = maxPowerCons;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getMaxAllowVoltage() {
		return maxAllowVoltage;
	}
	public void setMaxAllowVoltage(int maxAllowVoltage) {
		this.maxAllowVoltage = maxAllowVoltage;
	}
	public int getMaxPowerCons() {
		return maxPowerCons;
	}
	public void setMaxPowerCons(int maxPowerCons) {
		this.maxPowerCons = maxPowerCons;
	}
	
	
}
