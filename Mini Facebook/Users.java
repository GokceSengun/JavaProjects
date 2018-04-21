import java.nio.channels.FileLockInterruptionException;
import java.util.ArrayList;
import java.util.Date;
/**
 * 
 * @author GÖKÇE
 *
 */
public class Users {

	public ArrayList<Users> friendList = new ArrayList<Users>();
	private ArrayList<Users> blockList = new ArrayList<Users>();
	public ArrayList<Post> postList = new ArrayList<Post>();

	private int userID;
	private String name;
	private String username;
	private String password;
	private Date dateOfBirth;
	private String schoolInfo;
	private Date lastLoginDate;
	private static int userCount = 0;
	private boolean isSignIn = false;
	Date b = new Date();
	/**
	 * @param userID user id
	 * @param name name
	 * @param username user name
	 * @param password password
	 * @param dateOfBirth date of birth
	 * @param schoolInfo school info
	 * @param lastLoginDate last login
	 */
	public Users(int userID, String name, String username, String password, Date dateOfBirth, String schoolInfo,
			Date lastLoginDate) {
		// this.userID = userID;
		this.name = name;
		this.username = username;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.schoolInfo = schoolInfo;
		this.lastLoginDate = lastLoginDate;
		this.userCount++;
		this.setUserID(userCount);

	}

	
	public Users() {
		// TODO Auto-generated constructor stub
	}
/**
 * 
 * @param name name
 * @param username user name
 * @param dateOfBirth date of birth
 * @param schoolInfo school info
 */
	public Users(String name, String username, Date dateOfBirth, String schoolInfo) {

		this.name = name;
		this.username = username;
		this.dateOfBirth = dateOfBirth;
		this.schoolInfo = schoolInfo;

	}
/**
 * 
 * @param name name
 * @param username user name
 * @param password password
 * @param dateOfBirth date of birth
 * @param schoolInfo school info
 */
	public Users(String name, String username, String password, Date dateOfBirth, String schoolInfo) {

		this.name = name;
		this.username = username;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.schoolInfo = schoolInfo;
		this.userCount++;
		this.setUserID(userCount);

	}
/**
 * 
 * @return user id
 */
	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return user name
	 */
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
/**
 * 
 * @return password
 */
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
/**
 * 
 * @return date of birth
 */
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
/**
 * 
 * @return school info
 */
	public String getSchoolInfo() {
		return schoolInfo;
	}

	public void setSchoolInfo(String schoolInfo) {
		this.schoolInfo = schoolInfo;
	}
/**
 * 
 * @return last login
 */
	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
/**
 * 
 * @return post list
 */
	public ArrayList<Post> getPostList() {
		return postList;
	}

	public void setPostList(ArrayList<Post> postList) {
		this.postList = postList;
	}

	/**
	 * 
	 * @param newdateOfBirth birth
	 * @param newschoolGraduate graduate
	 */
	public void updateProfile(Date newdateOfBirth, String newschoolGraduate) {
		this.dateOfBirth = newdateOfBirth;
		this.schoolInfo = newschoolGraduate;
		System.out.println("Your user profile has been successfully updated.");

	}
/**
 * 
 * @return sign in
 */
	public boolean isSignIn() {
		return isSignIn;
	}
/**
 * 
 * @param isSignIn signin
 */
	public void setSignIn(boolean isSignIn) {
		this.isSignIn = isSignIn;
	}
/**
 * 
 */
	public String toString() {

		return "Name : " + getName() + "\nUsername: " + getUsername() + "\nDate of Birth: " + getDateOfBirth()
				+ "\nSchool: " + getSchoolInfo() + "\n---------------------------";
	}
/**
 * 
 * @param oldpass old pass
 * @param newpass new pass
 */
	public void chpass(String oldpass, String newpass) {

		this.password = newpass;
		// System.out.println("sifreniz degisti.");

	}
/**
 * 
 * @param friend friend
 * @param signedUser sign user
 */
	public void addFriend(Users friend, Users signedUser) {
		boolean isFriendExistList = false;

		if (signedUser.friendList.isEmpty()) {
			signedUser.friendList.add(friend);
			System.out.println(friend.name + " has been successfully added to your friend list.");
		} else {

			for (int i = 0; i < signedUser.friendList.size(); i++) {
				if (signedUser.friendList.get(i).username.equals(friend.username)) {
					isFriendExistList = true;
				}
			}
			if (isFriendExistList) {
				System.out.println("This user is already in your friend list!");
			} else {
				signedUser.friendList.add(friend);
				System.out.println(friend.username + " has been successfully added to your friend list.");
			}

		}
	}
/**
 * 
 * @param userName user name
 */
	public void removeFriend(String userName) {

		boolean suchuSer = false;

		System.out.println(friendList.size());
		for (int i = 0; i < friendList.size(); i++) {
			System.out.println("1111");
			if (friendList.get(i).username.equals(userName)) {
				System.out.println("2222");
				System.out.println(userName + " has been successfully removed from your friend list.");
				friendList.remove(i);
				suchuSer = true;

			}

		}
		if (!suchuSer) {
			System.out.println("No such friend!");
			System.out.println("33333");
		}

	}

	public void listUsers() {

		for (int i = 0; i < UserCollection.usersList.size(); i++) {
			System.out.println("Name: " + UserCollection.usersList.get(i).getName() + "\nUsername: "
					+ UserCollection.usersList.get(i).getUsername() + "\nDate of Birth:"
					+ UserCollection.usersList.get(i).getDateOfBirth() + "\nSchool: "
					+ UserCollection.usersList.get(i).getSchoolInfo());

			System.out.println("---------------------------");

		}
	}

	public void listFriend() {

		for (int i = 0; i < friendList.size(); i++) {
			System.out.println("Name: " + friendList.get(i).getName() + "\nUsername: " + friendList.get(i).getUsername()
					+ "\nDate of Birth:" + friendList.get(i).getDateOfBirth() + "\nSchool: "
					+ friendList.get(i).getSchoolInfo());

			System.out.println("---------------------------");
		}
	}

	public void signOut() {

		this.setSignIn(false);
		System.out.println("You have successfully signed out.");
	}
/**
 * 
 * @param userName user name
 */
	public void block(String userName) {

		for (int i = 0; i < UserCollection.usersList.size(); i++) {
			if (UserCollection.usersList.get(i).username.equals(userName)) {

				blockList.add(UserCollection.usersList.get(i));
				System.out.println(userName + " has been successfully blocked.");

			}
		}

	}
/**
 * 
 * @param userName user name
 */
	public void unBlock(String userName) {

		for (int i = 0; i < UserCollection.usersList.size(); i++) {
			if (UserCollection.usersList.get(i).username.equals(userName)) {

				blockList.remove(UserCollection.usersList.get(i));
				System.out.println(userName + " has been successfully unblocked.");

			}
		}

	}

	public void showBlockFriends() {

		if (!blockList.isEmpty()) {
			for (int i = 0; i < blockList.size(); i++) {
				System.out.println("Name: " + blockList.get(i).getName() + "\nUsername: "
						+ blockList.get(i).getUsername() + "\nDate of Birth:" + blockList.get(i).getDateOfBirth()
						+ "\nSchool: " + blockList.get(i).getSchoolInfo());
				System.out.println("---------------------------");
			}
		} else
			System.out.println("You haven't blocked any users yet!");

	}

	public void showBlockUsers() {

		if (!blockList.isEmpty()) {
			for (int i = 0; i < blockList.size(); i++) {
				System.out.println("Name: " + blockList.get(i).getName() + "\nUsername: "
						+ blockList.get(i).getUsername() + "\nDate of Birth:" + blockList.get(i).getDateOfBirth()
						+ "\nSchool: " + blockList.get(i).getSchoolInfo());
				System.out.println("---------------------------");
			}
		} else
			System.out.println("You haven't blocked any users yet!");

	}
/**
 * 
 * @param imagePost image post
 */
	public void addpostImage(ImagePost imagePost) {

		ArrayList<String> blist = new ArrayList<>();
		String[] names = imagePost.getUserNames().split(":");
		ArrayList<String> friendname = new ArrayList<>();
		for (Users a : this.friendList) {
			friendname.add(a.username);

		}
		for (String name : names) {
			if (friendname.contains(name)) {
				blist.add(name);

			} else
				System.out.println("Username " + name + " is not your friend,and will not be tagged!");

		}
		imagePost.taggedList = blist;

		postList.add(imagePost);
		System.out.println("The post has been successfully added.");
	}
/**
 * 
 * @param videoPost video post
 */
	public void addpostVideo(VideoPost videoPost) {
		
		ArrayList<String> blist = new ArrayList<>();
		String[] names = videoPost.getUserNames().split(":");
		ArrayList<String> friendname = new ArrayList<>();
		for (Users a : this.friendList) {
			friendname.add(a.username);

		}
		for (String name : names) {
			if (friendname.contains(name)) {
				blist.add(name);
				
			} else
				System.out.println("Username " + name + " is not your friend,and will not be tagged!");

		}
		videoPost.taggedList = blist;

		if (Integer.parseInt(videoPost.duration) <= 10) {
		postList.add(videoPost);
		System.out.println("The post has been successfully added.");
		} else {
			System.out.println("Error: Your video exceeds maximum allowed duration of 10 minutes.");
		}
	}

	public void removeLastPost() {

		postList.remove(postList.size() - 1);
		System.out.println("Your last post has been successfully removed.");

	}
/**
 * 
 * @param textPost text post
 */
	public void addpostText(TextPost textPost) {

		boolean nameExist = false;
		ArrayList<String> alist = new ArrayList<>();
		String[] names = textPost.getUserNames().split(":");
		ArrayList<String> friendname = new ArrayList<>();
		for (Users a : this.friendList) {
			friendname.add(a.username);

		}
		for (String name : names) {
			if (friendname.contains(name)) {
				alist.add(name);
				/*
				 * postList.add(textPost);
				 * System.out.println("The post hass been successfully added.");
				 * nameExist = true;
				 */
			} else
				System.out.println("Username " + name + " is not your friend,and will not be tagged!");

		}
		textPost.taggedList = alist;

		postList.add(textPost);
		System.out.println("The post has been successfully added.");
	}

	

}
