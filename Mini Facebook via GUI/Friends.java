import java.util.Date;

public class Friends {

	String password;
	String friendName;
	String friendUsername;
	Date friendDateOfBirth;
	String schoolInfo;
	int friendUserID;

	public Friends() {
		this.friendName = "";
		this.friendUsername = "";
		this.friendDateOfBirth = null;
		this.schoolInfo = "";
		int friendUserID = 0;
	}

	public Friends(String friendName, String friendUsername, String password, Date friendDateOfBirth, String schoolInfo,
			int friendUserID) {
		this.friendName = friendName;
		this.friendUsername = friendUsername;
		this.friendDateOfBirth = friendDateOfBirth;
		this.schoolInfo = schoolInfo;
		this.friendUserID = friendUserID;
		this.password = password;
	}

	public String getFriendName() {
		return friendName;
	}

	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}

	public String getFriendUsername() {
		return friendUsername;
	}

	public void setFriendUsername(String friendUsername) {
		this.friendUsername = friendUsername;
	}

	public String getSchoolInfo() {
		return schoolInfo;
	}

	public void setSchoolInfo(String schoolInfo) {
		this.schoolInfo = schoolInfo;
	}

	public int getFriendUserID() {
		return friendUserID;
	}

	public void setFriendUserID(int friendUserID) {
		this.friendUserID = friendUserID;
	}
}
