import java.util.Date;
import java.util.UUID;
/**
 * 
 * @author GOKCE
 *
 */
public class ImagePost extends TextPost{
	
	/**
	 * @param fileName is my images name
	 * @param resolution images resolution
	 */
	
	private String fileName;
	private String resolution;
	/**
	 * 
	 * @param postID images id
	 * @param text post text
	 * @param postDate post date
	 */
	/*public ImagePost(UUID postID, String text, String postDate) {
		super(postID, text, postDate);
		// TODO Auto-generated constructor stub
	}*/

	/**
	 * 
	 * @param textContent images text
	 * @param longitude images longitude
	 * @param latitude images latitude
	 * @param userNames images username
	 * @param filePath images name
	 * @param resolution images resolution
	 * @param b date
	 */
	public ImagePost(String textContent, double longitude, double latitude, String userNames, String filePath,
			String resolution, Date b) {
		super(textContent,  longitude,  latitude,  userNames, b);
		this.fileName =filePath;
		this.resolution=resolution;
	}
	/**
	 * @return the fileName fileName
	 */
	public String getFileName() {
		return fileName;
	}
	/**
	 * @param fileName the fileName to set fileName
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	/**
	 * @return the resolution resolution
	 */
	public String getResolution() {
		return resolution;
	}
	/**
	 * @param resolution the resolution to set resolution
	 */
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

}
