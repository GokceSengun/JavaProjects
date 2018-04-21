package Items;

public class SkinCare extends Cosmetic{
	
	String babySEnsetiveorNot;

	/**
	 * @param price of SkinCare
	 * @param id of SkinCare
	 * @param manufacturer of SkinCare
	 * @param brand of SkinCare
	 * @param expDate of SkinCare
	 * @param weight of SkinCare
	 * @param organicOrNot of SkinCare
	 * @param babySEnsetiveorNot of SkinCare
	 */
	public SkinCare(int price, int id, String manufacturer, String brand, String expDate, int weight, String organicOrNot,
			String babySEnsetiveorNot) {
		super(price, id, manufacturer, brand, expDate, weight, organicOrNot);
		this.setBabySEnsetiveorNot(babySEnsetiveorNot);
	}

	public String getBabySEnsetiveorNot() {
		return babySEnsetiveorNot;
	}

	public void setBabySEnsetiveorNot(String babySEnsetiveorNot) {
		if(babySEnsetiveorNot.equals("1")){
			babySEnsetiveorNot="Yes";
		}
		else{
			babySEnsetiveorNot = "No";
		}
		this.babySEnsetiveorNot=babySEnsetiveorNot;
	}
	
	public String toString(){
		return "-----------------------\n"+"Type: SkinCare \nItem ID: "+getId()+"\nPrice: "+getPrice()+".0 $\nManufacturer: "+getManufacturer()+"\nBrand: "+getBrand()+"\nOrganic: "+getOrganicOrNot()+"\nExpiration Date: "+getExpDate()+"\nWeight: "+getWeight()+" g.\nBaby Sensetive: "+getBabySEnsetiveorNot();
	}
	
}
