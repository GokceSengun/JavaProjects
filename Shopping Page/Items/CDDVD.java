package Items;
/**
 * 
 * @author GÖKÇE
 *
 */
public class CDDVD extends OfficeSupplies{
	
	String composer;
	String song;
	/**
	 * @param price price of cddvd
	 * @param id id of cddvd
	 * @param releaseDate release of cddvd
	 * @param coveTitle covetitle of cddvd
	 * @param composer composer of cddvd
	 * @param song song of cddvd
	 */
	public CDDVD(int price, int id, String releaseDate, String coveTitle, String composer, String song) {
		super(price, id, releaseDate, coveTitle);
		this.composer = composer;
		this.song = song;
	}
	/**
	 * 
	 * @return composer
	 */
	public String getComposer() {
		return composer;
	}
	/**
	 * 
	 * @param composer set composer
	 */
	public void setComposer(String composer) {
		this.composer = composer;
	}
	/**
	 * 
	 * @return call song
	 */
	public String getSong() {
		return song;
	}
	/**
	 * 
	 * @param x ad
	 * @return d
	 */
	public String getSong(String x) {
		return song;
	}
	/**
	 * 
	 * @param song set songs
	 */
	public void setSong(String song) {
		this.song = song;
	}

	public void songs(){
		
	}

	public String toString(){
		String x;
		return "-----------------------\n"+"Type: CDDVD \nItem ID: "+getId()+"\nPrice: "+getPrice()+".0 $\nRelease Date: "+getReleaseDate()+"\nTitle: "+getCoveTitle()+"\nSongs: "+getSong()+"\nComposer: "+getComposer();}
	
}
