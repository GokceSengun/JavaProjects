import java.sql.Date;
import java.util.UUID;
/**
 * 
 * @author GOKCE
 *
 */
public interface PostInterface {
/**
 * 
 * @param text post text
 */
	public void setText(String text);
	/**
	 * 
	 * @return call post text
	 */
	public String getText();
	/**
	 * 
	 * @return call id
	 */
	public UUID getID();
	/**
	 * 
	 * @return call date
	 */
	public java.util.Date getDate();
}
