package Items;

public class HairCare extends Cosmetic{
	
	String MedicatedorNot;

	/**
	 * @param price of hair care
	 * @param id of hair care
	 * @param manufacturer of hair care
	 * @param brand of hair care
	 * @param expDate of hair care
	 * @param weight of hair care
	 * @param organicOrNot of hair care
	 * @param medicatedorNot of hair care
	 */
	public HairCare(int price, int id, String manufacturer, String brand, String expDate, int weight, String organicOrNot,
			String medicatedorNot) {
		super(price, id, manufacturer, brand, expDate, weight, organicOrNot);
		this.setMedicatedorNot(medicatedorNot);
	}

	public String getMedicatedorNot() {
		return MedicatedorNot;
	}
/**
 * 
 * @param medicatedorNot medicated or not
 */
	public void setMedicatedorNot(String medicatedorNot) {
		if(medicatedorNot.equals("1")){
			medicatedorNot="Yes";
		}
		else{
			medicatedorNot="No";
		}
		this.MedicatedorNot = medicatedorNot;
	}

	/**
	 * display of hair care
	 */
	public String toString(){
		return "-----------------------\n"+"Type: HairCare \nItem ID: "+getId()+"\nPrice: "+getPrice()+".0 $\nManufacturer: "+getManufacturer()+"\nBrand: "+getBrand()+"\nOrganic: "+getOrganicOrNot()+"\nExpiration Date: "+getExpDate()+"\nWeight: "+getWeight()+" g.\nMedicated: "+getMedicatedorNot();
	}
	

}
