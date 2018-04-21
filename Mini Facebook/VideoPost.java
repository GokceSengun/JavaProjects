import java.util.Date;
import java.util.UUID;
/**
 * 
 * @author GOKCE
 *
 */
public class VideoPost extends TextPost{

	public String videoName;
	public String duration;
	public String maxDuration;
	
	/**
	 * 
	 * @param postID post id
	 * @param text text
	 * @param postDate post date
	 */
	/*public VideoPost(UUID postID, String text, String postDate) {
		super(postID, text, postDate);
		// TODO Auto-generated constructor stub
	}*/
	/**
	 * 
	 * @param textCon super to text post
	 * @param longitude super to text post
	 * @param latitude super to text post
	 * @param userName super to text post
	 * @param videoName video name
	 * @param videoDuration video duration
	 */
	public VideoPost(String textCon, double longitude, double latitude, String userName, String videoName, String videoDuration,Date postDate) {

		super(textCon,longitude,latitude,userName, postDate);
		this.duration=videoDuration;
		this.videoName=videoName;
	}
	/**
	 * 
	 * @return videoname video name
	 */

	public String getVideoName() {
		return videoName;
	}
	public void setVideoName(String videoName) {
		this.videoName = videoName;
	}
	/**
	 * 
	 * @return duration duration
	 */
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	/**
	 * 
	 * @return maxduration maxduration
	 */
	public String getMaxDuration() {
		return maxDuration;
	}
	public void setMaxDuration(String maxDuration) {
		this.maxDuration = maxDuration;
	}
	
}
