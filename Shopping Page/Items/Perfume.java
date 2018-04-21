package Items;

public class Perfume extends Cosmetic{
	int lastingDuration;

	/**
	 * @param price of pefume
	 * @param id of pefume
	 * @param manufacturer of pefume
	 * @param brand of pefume
	 * @param expDate of pefume
	 * @param weight of pefume
	 * @param organicOrNot of pefume
	 * @param lastingDuration of pefume
	 */
	public Perfume(int price, int id, String manufacturer, String brand, String expDate, int weight, String organicOrNot,
			int lastingDuration) {
		super(price, id, manufacturer, brand, expDate, weight, organicOrNot);
		this.lastingDuration = lastingDuration;
	}

	public int getLastingDuration() {
		return lastingDuration;
	}

	public void setLastingDuration(int lastingDuration) {
		this.lastingDuration = lastingDuration;
	}
	public String toString(){
		return "-----------------------\n"+"Type: Perfume \nItem ID: "+getId()+"\nPrice: "+getPrice()+".0 $\nManufacturer: "+getManufacturer()+"\nBrand: "+getBrand()+"\nOrganic: "+getOrganicOrNot()+"\nExpiration Date: "+getExpDate()+"\nWeight: "+getWeight()+" g.\nLasting Duration: "+getLastingDuration()+" min.";
	}
	
}
