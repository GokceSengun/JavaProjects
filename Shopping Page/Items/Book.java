package Items;
/**
 * 
 * @author GÖKÇE
 *
 */
public class Book extends OfficeSupplies{
	
	String publisher;
	String author;
	int pages;
	/**
	 * @param price name of price
	 * @param id id of book
	 * @param releaseDate release of book
	 * @param coveTitle covetitle of book
	 * @param publisher publisher of book
	 * @param author author of book
	 * @param pages pages of book
	 */
	public Book(int price, int id, String releaseDate, String coveTitle, String publisher, String author, int pages) {
		super(price, id, releaseDate, coveTitle);
		this.publisher = publisher;
		this.author = author;
		this.pages = pages;
	}
	/**
	 * 
	 * @return call publisher
	 */
	public String getPublisher() {
		return publisher;
	}
	/**
	 * 
	 * @param publisher set publisher
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	/**
	 * 
	 * @return call author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * 
	 * @param author set author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * 
	 * @return call pages
	 */
	public int getPages() {
		return pages;
	}
	/**
	 * 
	 * @param pages set pages
	 */
	public void setPages(int pages) {
		this.pages = pages;
	}
	/**
	 * show books datas
	 */
	public String toString(){
		return "-----------------------\n"+"Type: Book \nItem ID: "+getId()+"\nPrice: "+getPrice()+".0 $\nRelease Date: "+getReleaseDate()+"\nTitle: "+getCoveTitle()+"\nPublisher: "+getPublisher()+"\nAuthor: "+getAuthor()+"\nPage: "+getPages()+" pages";
	}

	
}
