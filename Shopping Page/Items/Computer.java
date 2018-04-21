package Items;
/**
 * 
 * @author GÖKÇE
 *
 */
public class Computer extends Electronic{
	
	String OS;
	String CPUType;
	int RAM;
	int HDD;
	/**
	 * @param price of computer
	 * @param id of computer
	 * @param manufacturer of computer
	 * @param brand of computer
	 * @param maxAllowVoltage of computer
	 * @param maxPowerCons of computer
	 * @param oS of computer
	 * @param cPUType of computer
	 * @param rAM of computer
	 * @param hDD of computer
	 */
	public Computer(int price, int id, String manufacturer, String brand, int maxAllowVoltage, int maxPowerCons,
			String oS, String cPUType, int rAM, int hDD) {
		super(price, id, manufacturer, brand, maxAllowVoltage, maxPowerCons);
		OS = oS;
		CPUType = cPUType;
		RAM = rAM;
		HDD = hDD;
	}
	/**
	 * 
	 * @return call os
	 */
	public String getOS() {
		return OS;
	}
	/**
	 * 
	 * @param oS set os
	 */
	public void setOS(String oS) {
		OS = oS;
	}
	/**
	 * 
	 * @return call cpu type
	 */
	public String getCPUType() {
		return CPUType;
	}
	/**
	 * 
	 * @param cPUType set cpu type
	 */
	public void setCPUType(String cPUType) {
		CPUType = cPUType;
	}
	/**
	 * 
	 * @return call ram
	 */
	public int getRAM() {
		return RAM;
	}
	/**
	 * 
	 * @param rAM set ram
	 */
	public void setRAM(int rAM) {
		RAM = rAM;
	}
	/**
	 * 
	 * @return call hdd
	 */
	public int getHDD() {
		return HDD;
	}
	/**
	 * 
	 * @param hDD set hdd
	 */
	public void setHDD(int hDD) {
		HDD = hDD;
	}
	
	

}
