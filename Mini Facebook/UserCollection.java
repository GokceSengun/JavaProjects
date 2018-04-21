
import java.util.ArrayList;
import java.util.Date;
/**
 * 
 * @author GOKCE
 *
 */
public class UserCollection {

	static ArrayList<Users> usersList = new ArrayList<Users>();
/**
 * 
 * @param name is name
 * @param userName is user name
 * @param password is password
 * @param dateOfBirth is date of birth
 * @param schoolGraduated is school graduate
 */
	public static void addUser(String name, String userName, String password, Date dateOfBirth,
			String schoolGraduated) {

		usersList.add(new Users(name, userName, password, dateOfBirth, schoolGraduated));
		// System.out.print(line);
		System.out.println(name + " has been successfully added.");
		// System.out.println(usersList);
	}

	/**
	 * 
	 * @param userID user id
	 */
	public static void removeUser(int userID) {
		for (int i = 0; i < usersList.size(); i++) {
			if (userID == UserCollection.usersList.get(i).getUserID()) {
				usersList.remove(userID - 1);
				System.out.println("User has been successfully removed.");
				// System.out.println(usersList);
				break;
			} else
				System.out.println("No such user!");

		}

	}

	/**
	 * 
	 * @param userName username
	 * @param password password
	 */
	public static void signIn(String userName, String password) {

		for (Users user : usersList) {
			if (user.getUsername().equals(userName)) {
				if (user.getPassword().equals(password)) {
					System.out.println("You have successfully signed in.");
					user.setSignIn(true);
				} else {
					System.out.println("Invalid username or password! Please try again.");
				}
			}
		}

	}

	/**
	 * 
	 * @param userName username 
	 * @return true
	 */
	public static boolean isUserNameExist(String userName) {

		for (Users user : usersList) {
			if (user.getUsername().equals(userName)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param userName username
	 */
	/*public static void showPosts(String userName) {

		
				for (Users users : usersList) {
					if (users.getUsername().equals(userName)) {
						System.out.println("**************\n"+users.getUsername()+"'s Posts\n**************");
						for (Post output:users.postList) {
							System.out.println("---------------------------");
							System.out.println(output.getText());
							System.out.println("Date"+output.getDate());

							System.out.println("Image Resulation"+((ImagePost)output).getResolution());

							System.out.println("SJKSALJ");
							

						}
					}
				

			

		}

	}*/

}
