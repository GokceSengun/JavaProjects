package Items;

public class SmartPhone extends Electronic{
	
	String screenType;

	/**
	 * @param price of smartphone
	 * @param id of smartphone
	 * @param manufacturer of smartphone
	 * @param brand of smartphone
	 * @param maxAllowVoltage of smartphone
	 * @param maxPowerCons of smartphone
	 * @param screenType of smartphone
	 */
	public SmartPhone(int price, int id, String manufacturer, String brand, int maxAllowVoltage, int maxPowerCons,
			String screenType) {
		super(price, id, manufacturer, brand, maxAllowVoltage, maxPowerCons);
		this.screenType = screenType;
	}

	public String getScreenType() {
		return screenType;
	}

	public void setScreenType(String screenType) {
		this.screenType = screenType;
	}
	
	/* (non-Javadoc)
	 * @see Items.Items#toString()
	 */
	public String toString(){
		return "-----------------------\n"+"Type: SmartPhone \nItem ID: "+getId()+"\nPrice: "+getPrice()+".0 $\nManufacturer: "+getManufacturer()+"\nBrand: "+getBrand()+"\nMax Volt: "+getMaxAllowVoltage()+" GB.\nMax Watt: "+getMaxPowerCons()+" W.\nScreen Type: "+getScreenType();
		}

}
