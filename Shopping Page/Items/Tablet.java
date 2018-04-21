package Items;

public class Tablet extends Computer{
	
	int dimension;

	/**
	 * @param price  of tablet
	 * @param id  of tablet
	 * @param manufacturer  of tablet
	 * @param brand  of tablet
	 * @param maxAllowVoltage of tablet
	 * @param maxPowerCons  of tablet
	 * @param oS  of tablet
	 * @param cPUType  of tablet
	 * @param rAM  of tablet
	 * @param hDD  of tablet
	 * @param dimension  of tablet
	 */
	public Tablet(int price, int id, String manufacturer, String brand, int maxAllowVoltage, int maxPowerCons,
			String oS, String cPUType, int rAM, int hDD, int dimension) {
		super(price, id, manufacturer, brand, maxAllowVoltage, maxPowerCons, oS, cPUType, rAM, hDD);
		this.dimension = dimension;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}
	/* (non-Javadoc)
	 * @see Items.Items#toString()
	 */
	public String toString(){
		return "-----------------------\n"+"Type: Tablet \nItem ID: "+getId()+"\nPrice: "+getPrice()+".0 $\nManufacturer: "+getManufacturer()+"\nBrand: "+getBrand()+"\nMax Volt: "+getMaxAllowVoltage()+" V.\nMax Watt: "+getMaxPowerCons()+" W.\nOperating System: "+getOS()+"\nCPU Type: "+getCPUType()+"\nRAM Capacity: "+getRAM()+" GB.\nHDD Capacity: "+getHDD()+" GB.\nDimension: "+getDimension();
	}

	
}
