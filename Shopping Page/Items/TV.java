package Items;

public class TV extends Electronic{
	
	int screenSize;

	/**
	 * @param price of TV
	 * @param id of TV
	 * @param manufacture of TVr
	 * @param brand of TV
	 * @param maxAllowVoltage of TV
	 * @param maxPowerCons of TV
	 * @param screenSize of TV
	 */
	public TV(int price, int id, String manufacturer, String brand, int maxAllowVoltage, int maxPowerCons,
			int screenSize) {
		super(price, id, manufacturer, brand, maxAllowVoltage, maxPowerCons);
		this.screenSize = screenSize;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	public String toString(){
		return "-----------------------\n"+"Type: TV \nItem ID: "+getId()+"\nPrice: "+getPrice()+".0 $\nManufacturer: "+getManufacturer()+"\nBrand: "+getBrand()+"\nMax Volt: "+getMaxAllowVoltage()+" GB.\nMax Watt: "+getMaxPowerCons()+" GB.\nScreen size: "+getScreenSize()+"\"";
	}
	
}
