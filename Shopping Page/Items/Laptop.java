package Items;

/**
 * @author GÖKÇE
 *
 */
public class Laptop extends Computer{
	
	String HDMISupportorNot;

	/**
	 * @param price     price of item
	 * @param id        id of item
	 * @param manufacturer   manufacturer of item
	 * @param brand          brand of item
	 * @param maxAllowVoltage  number of max allow voltage of item
	 * @param maxPowerCons		number of max power cons
	 * @param oS        operating system of item
	 * @param cPUType	CPU type of item
	 * @param rAM  		capacity of RAM
	 * @param hDD		capacity HDD
	 * @param hDMISupportorNot   is support HDMI or not
	 */
	public Laptop(int price, int id, String manufacturer, String brand, int maxAllowVoltage, int maxPowerCons,
			String oS, String cPUType, int rAM, int hDD, String hDMISupportorNot) {
		super(price, id, manufacturer, brand, maxAllowVoltage, maxPowerCons, oS, cPUType, rAM, hDD);
		this.setHDMISupportorNot(hDMISupportorNot);
	}

	/**
	 * @return is support HDMI or not
	 */
	public String getHDMISupportorNot() {
		return HDMISupportorNot;
	}

	/**
	 * @param hDMISupportorNot    is support HDMI or not if equals 1 yes else no
	 */
	public void setHDMISupportorNot(String hDMISupportorNot) {
		if(hDMISupportorNot.equals("1")){
			hDMISupportorNot="Yes";
		}
		else{
			hDMISupportorNot="No";
		}
		HDMISupportorNot = hDMISupportorNot;
	}
	
	/* (non-Javadoc)
	 * @see Items.Items#toString()
	 * @override
	 */
	public String toString(){
		return "-----------------------\n"+"Type: Laptop \nItem ID: "+getId()+"\nPrice: "+getPrice()+".0 $\nManufacturer: "+getManufacturer()+"\nBrand: "+getBrand()+"\nMax Volt: "+getMaxAllowVoltage()+" V.\nMax Watt: "+getMaxPowerCons()+" W.\nOperating System: "+getOS()+"\nCPU Type: "+getCPUType()+"\nRAM Capacity: "+getRAM()+" GB.\nHDD Capacity: "+getHDD()+" GB.\nHDMI support: "+getHDMISupportorNot();
	}

}
