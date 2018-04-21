import java.sql.Date;
import java.util.UUID;
/**
 * 
 * @author GOKCE
 *
 */
public class TextPost extends Post {

	private String text;

	/**
	 * 
	 * @param postID text's post post id
	 * @param text text's post text
	 * @param postDate text's post post date
	 */
	/*public TextPost(UUID postID, String text, String postDate) {
		super(postID, text, postDate);
		// TODO Auto-generated constructor stub
	}*/


	/**
	 * 
	 * @param textContent text's post textcontent
	 * @param d longitude
	 * @param e latitude
	 * @param userNames text's post user name
	 * @param filePath text's post name
	 * @param resolution text's post resolution
	 */
/*	public TextPost(String textContent, double d, double e, String userNames, String filePath, String resolution) {
		super(textContent,d,e,userNames);
	}*/

	/**
	 * 
	 * @param textContent text's post textcontent
	 * @param longitude text's post lonitude
	 * @param latitude text's post latitude
	 * @param userNames text's post user name
	 * @param b  NDSA
	 */
	public TextPost(String textContent, double longitude, double latitude, String userNames, java.util.Date b) {
		super( textContent,  b, longitude,  latitude,  userNames);
	}


	
	public String getText() {
		return getText();
	}

	
	public void setText(String text) {
		this.text = text;
	}

	public void showTaggedUser() {

	}

	public void showLocation() {

	}

	
	@Override 
	public UUID getID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getDate() {
		// TODO Auto-generated method stub
		return null;
	}
	/*public String toString(){
		return "Text post: "+getDate();
	}*/
}
