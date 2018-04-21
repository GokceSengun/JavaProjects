package Items;

public class Desktop extends Computer{
	
	String boxColor;

	/**
	 * @param price of desktop
	 * @param id of desktop
	 * @param manufacturer of desktop
	 * @param brand of desktop
	 * @param maxAllowVoltage  of desktop
	 * @param maxPowerCons of desktop
	 * @param oS of desktop
	 * @param cPUType of desktop
	 * @param rAM of desktop
	 * @param hDD of desktop
	 * @param boxColor of desktop
	 */
	public Desktop(int price, int id, String manufacturer, String brand, int maxAllowVoltage, int maxPowerCons,
			String oS, String cPUType, int rAM, int hDD, String boxColor) {
		super(price, id, manufacturer, brand, maxAllowVoltage, maxPowerCons, oS, cPUType, rAM, hDD);
		this.boxColor = boxColor;
	}

	/**
	 * 
	 * @return call box color
	 */
	public String getBoxColor() {
		return boxColor;
	}

	/**
	 * 
	 * @param boxColor set box color
	 */
	public void setBoxColor(String boxColor) {
		this.boxColor = boxColor;
	}
/**
 *  display of desktop
 */
	public String toString(){
		return "-----------------------\n"+"Type: Desktop \nItem ID: "+getId()+"\nPrice: "+getPrice()+".0 $\nManufacturer: "+getManufacturer()+"\nBrand: "+getBrand()+"\nMax Volt: "+getMaxAllowVoltage()+" V.\nMax Watt: "+getMaxPowerCons()+" W.\nOperating System: "+getOS()+"\nCPU Type: "+getCPUType()+"\nRAM Capacity: "+getRAM()+" GB.\nHDD Capacity: "+getHDD()+" GB.\nMBox Color: "+getBoxColor();
	}
	
}
