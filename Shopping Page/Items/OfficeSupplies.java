package Items;

public class OfficeSupplies extends Items {
	
	String releaseDate;
	String coveTitle;
	/**
	 * @param price of OfficeSupplies
	 * @param id of OfficeSupplies
	 * @param releaseDate of OfficeSupplies
	 * @param coveTitle of OfficeSupplies
	 */
	public OfficeSupplies(int price, int id, String releaseDate, String coveTitle) {
		super(price, id);
		this.releaseDate = releaseDate;
		this.coveTitle = coveTitle;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getCoveTitle() {
		return coveTitle;
	}
	public void setCoveTitle(String coveTitle) {
		this.coveTitle = coveTitle;
	}

	
	
}
