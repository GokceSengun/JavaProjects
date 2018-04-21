import java.util.ArrayList;
import java.util.Scanner;

public class UserCollection {

	static ArrayList<Users> usersList = new ArrayList<Users>();

	public static boolean signIn(String userName, String pass) {

		for (Users user : usersList) {
			if (user.getUsername().equals(userName)) {
				if (user.getPassword().equals(pass)) {
					user.setSignIn(true);
					return true;
				}
				else
					return false;
			}

		}return false;

	}

	public static void removeUser(Users selectedValue) {
		usersList.remove(selectedValue);
		Main.modelUser.remove(Main.modelUser.indexOf(selectedValue));
		
	}
	
	
	

}
