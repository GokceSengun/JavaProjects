package shoppingPackage;
/**
 * 
 * @author GÖKÇE
 *
 */
public class Campaign extends Shopping {
	String startDate;
	String endDate;
	String itemType;
	int rate;
	/**
	 * 
	 * @param startDate start date of campaign
	 * @param endDate end date of campaign
	 * @param itemType type of items for campaign
	 * @param rate rate of campaign
	 */
	public Campaign(String startDate, String endDate, String itemType, int rate) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.itemType = itemType;
		this.rate = rate;
	}
	/**
	 * @return the startDate get start date
	 */
	public String getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	/**
	 * @return the itemType
	 */
	public String getItemType() {
		return itemType;
	}
	/**
	 * @param itemType the itemType to set
	 */
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	/**
	 * @return the rate
	 */
	public int getRate() {
		return rate;
	}
	/**
	 * @param rate the rate to set
	 */
	public void setRate(int rate) {
		this.rate = rate;
	}
//	public String toString(){
//		return "Customer name: "+getName()+"\tID " +getCustomerID()+"\te_mail: "+getE_mail()+"\tDate of Birth: "+getDateOfBirth()/*+"\tbalance: "+getiBalance()+"\tpassword: "+getPassword()*/+"\tStatus: "+getCustomerStatus();
//	}
	
	
}
