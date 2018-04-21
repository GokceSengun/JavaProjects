import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
/**
 * 
 * @author GOKCE
 *
 */
public abstract class Post implements PostInterface {

	private String userNames;
	private Date date;
	private UUID PostID;
	private String text;
	public ArrayList<Location> location = new ArrayList<Location>();
	public ArrayList<String> taggedList = new ArrayList<>();
	
	public Post(UUID postID, String text, Date postDate) {
		super();
		this.PostID = postID;
		this.text = text;
		this.date = postDate;
	}

	Location location1 ;
	/**
	 * 
	 * @param textContent post textContent
	 * @param longitude post longitude
	 * @param latitude post latitude
	 * @param userNames posts userNames
	 */
	public Post(String textContent,Date date, double longitude, double latitude, String userNames) {
		this.text=textContent;
		this.date = date;
		this.setUserNames(userNames);
		location1=new Location(longitude,latitude);
	}
	

	public String getText() {
		return text;
	}

	
	public void setText(String text) {
		this.text = text;
	}

	// private UUID Post;
	

	
	public abstract void showTaggedUser();

	public abstract void showLocation();

	/**
	 * @return the postID post id
	 */
	public UUID getID() {
		return PostID;
	}

	/**
	 * 
	 * @param postID make a postid
	 */
	public void setPostID(UUID postID) {
		PostID = postID;
	}

	/**
	 * @return the postDate call postdate
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * 
	 * @param postDate make postdate
	 */
	public void setDate(Date postDate) {
		this.date = postDate;
	}

	/**
	 * @return the userNames call username
	 */
	public String getUserNames() {
		return userNames;
	}

	/**
	 * @param userNames the userNames to set make usernames
	 */
	public void setUserNames(String userNames) {
		this.userNames = userNames;
	}

	

	

	

}
