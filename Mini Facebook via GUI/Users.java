import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Users {
	
	public ArrayList<Friends> friendList = new ArrayList<Friends>();
	public ArrayList<Friends> blockList = new ArrayList<Friends>();
	
	private int userID;
	private String name;
	private String username;
	private String password;
	private Date dateOfBirth;
	private String schoolInfo;
	private Date lastLoginDate;
	private String relationShip;
	private boolean isSignIn = false;
	private static int userCount = 0;

	public Users(String name, String username, String password, Date date, String schoolInfo, String relationShip) {
		this.name = name;
		this.username = username;
		this.password = password;
		this.dateOfBirth = date;
		this.schoolInfo = schoolInfo;
		this.lastLoginDate = lastLoginDate;
		this.setRelationShip(relationShip);
		this.userCount++;
		this.setUserID(userCount);

	}
	public Users(String name, String username, Date date, String schoolInfo, String relationShip) {
		this.name = name;
		this.username = username;
		this.password = password;
		this.dateOfBirth = date;
		this.schoolInfo = schoolInfo;
		this.lastLoginDate = lastLoginDate;
		this.setRelationShip(relationShip);

	}

	public static void addFriend(Users firstUser, Users secondUser) {

		firstUser.friendList.add(new Friends(secondUser.getName(),secondUser.getUsername(),secondUser.getPassword(),secondUser.getDateOfBirth(),
				secondUser.getSchoolInfo(),secondUser.getUserID()));
		secondUser.friendList.add(new Friends(firstUser.getName(),firstUser.getUsername(),firstUser.getPassword(),firstUser.getDateOfBirth(),
				firstUser.getSchoolInfo(),firstUser.getUserID()));
		
	}
	public static void blockFriend(Users firstUser, Users secondUser) {
		firstUser.blockList.add(new Friends(secondUser.getName(), secondUser.getUsername(), secondUser.getPassword(),
				secondUser.getDateOfBirth(), secondUser.getSchoolInfo(), secondUser.getUserID()));
		secondUser.blockList.add(new Friends(firstUser.getName(), firstUser.getUsername(), firstUser.getPassword(),
				firstUser.getDateOfBirth(), firstUser.getSchoolInfo(), firstUser.getUserID()));
		firstUser.friendList.remove(secondUser);
		secondUser.friendList.remove(firstUser);


	}
	public String toString() {

		return getUsername();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the dateOfBirth
	 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * @return the schoolInfo
	 */
	public String getSchoolInfo() {
		return schoolInfo;
	}

	/**
	 * @param schoolInfo the schoolInfo to set
	 */
	public void setSchoolInfo(String schoolInfo) {
		this.schoolInfo = schoolInfo;
	}

	/**
	 * @return the lastLoginDate
	 */
	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	/**
	 * @param lastLoginDate the lastLoginDate to set
	 */
	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	/**
	 * @return the relationShip
	 */
	public String getRelationShip() {
		return relationShip;
	}

	/**
	 * @param relationShip the relationShip to set
	 */
	public void setRelationShip(String relationShip) {
		this.relationShip = relationShip;
	}

	/**
	 * @return the isSignIn
	 */
	public boolean isSignIn() {
		return isSignIn;
	}

	/**
	 * @param isSignIn the isSignIn to set
	 */
	public void setSignIn(boolean isSignIn) {
		this.isSignIn = isSignIn;
	}


	
	/**
	 * @return the userID
	 */
	public int getUserID() {
		return userID;
	}
	/**
	 * @param userID the userID to set
	 */
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public static void signOut(Users users) {
		users.setSignIn(false);
	
	}

}
