
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 * 
 * @author GOKCE
 *
 */
public class Main {
/**
 * 
 * @param args string
 */
	public static void main(String[] args) {
		Date b = new Date();

		SimpleDateFormat formatter = new SimpleDateFormat("mmm/DD/yyyy");

		try {
			Scanner input = new Scanner(new File("users.txt"));
			while (input.hasNextLine()) {
				String[] split = input.nextLine().split("\t");
				Date date = null;
				try {
					date = formatter.parse(split[3]);
				} catch (ParseException e) {

					e.printStackTrace();
				}
				UserCollection.usersList.add(new Users(split[0], split[1], split[2], date, split[4]));

			}
			input.close();
		} catch (FileNotFoundException ex) {
			System.out.println("No File Found!");
			return;
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("No argument acceseses!");
			return;
		}

		try {
			Scanner input = new Scanner(new File("commands.txt"));
			while (input.hasNextLine()) {
				String[] split = input.nextLine().split("\t");
				if (split[0].equals("ADDUSER")) {
					Date date = null;
					try {
						date = formatter.parse(split[4]);
					} catch (ParseException e) {
						e.printStackTrace();
					}

					System.out.println("-----------------------");
					System.out.println("Command: " + split[0] + "\t" + split[1] + "\t" + split[2] + "\t" + split[3]
							+ "\t" + split[4] + "\t" + split[5]);
					UserCollection.addUser(split[1], split[2], split[3], date, split[5]);
				}

				else if (split[0].equals("REMOVEUSER")) {

					System.out.println("-----------------------");
					System.out.println("Command: " + split[0] + "\t" + split[1]);
					UserCollection.removeUser(Integer.parseInt(split[1]));
				} else if (split[0].equals("SIGNIN")) {

					System.out.println("-----------------------");
					System.out.println("Command: " + split[0] + "\t" + split[1] + "\t" + split[2]);
					if (UserCollection.isUserNameExist(split[1])) {
						UserCollection.signIn(split[1], split[2]);
					} else {

						System.out.println("No such user!");
					}

				} else if (split[0].equals("UPDATEPROFILE")) {
					boolean nameIsExist = false;
					Date date = null;
					System.out.println("-----------------------");
					System.out.println("Command: " + split[0] + "\t" + split[1] + "\t" + split[2] + "\t" + split[3]);
					try {
						date = formatter.parse(split[2]);
					} catch (ParseException e) {
						e.printStackTrace();
					}

					for (Users user : UserCollection.usersList) {

						if (user.getName().equals(split[1])) {
							if (user.isSignIn()) {
								nameIsExist = true;
								user.updateProfile(date, split[3]);

							} else {
								System.out.println("Error: Please sign in and try again.");
							}
						} else {
							nameIsExist = false;
						}

					}

				}

				else if (split[0].equals("LISTUSERS")) {

					boolean SignIn = false;
					System.out.println("-----------------------");
					System.out.println("Command: " + split[0]);
					for (Users user : UserCollection.usersList) {

						if (user.isSignIn()) {
							SignIn = true;
							user.listUsers();

						}
					}
					if (!SignIn) {
						System.out.println("Error: Please sign in and try again.");
					}

				} else if (split[0].equals("CHPASS")) {

					boolean oldPassExist = false;
					System.out.println("-----------------------");
					System.out.println("Command: " + split[0] + "\t" + split[1] + "\t" + split[2]);
					for (Users user : UserCollection.usersList) {

						if (user.getPassword().equals(split[1])) {

							oldPassExist = true;
							if (user.isSignIn()) {

								user.chpass(split[1], split[2]);

							} else {
								System.out.println("Error: Please sign in and try again.");
							}
						} else {
							oldPassExist = false;

						}

					}
					if (!oldPassExist) {
						System.out.println("Password mismatch! Please, try again.");
					}

				} else if (split[0].equals("ADDFRIEND")) {

					boolean signin = false;
					boolean userNameIsExist = false;
					Users friend = null;
					System.out.println("-----------------------");
					System.out.println("Command: " + split[0] + "\t" + split[1]);

					for (Users user : UserCollection.usersList) {

						if (user.getUsername().equals(split[1])) {

							userNameIsExist = true;
							friend = new Users(user.getName(), user.getUsername(), user.getDateOfBirth(),
									user.getSchoolInfo());
						}
					}
					if (userNameIsExist) {

						for (Users user : UserCollection.usersList) {

							if (user.isSignIn()) {

								signin = true;
								user.addFriend(friend, user);
							}

						}

					} else {
						System.out.println("No such user.");
					}
				} else if (split[0].equals("LISTFRIENDS")) {
					boolean giris = false;
					System.out.println("-----------------------");
					System.out.println("Command: " + split[0]);

					for (Users user : UserCollection.usersList) {

						if (user.isSignIn()) {

							giris = true;
							user.listFriend();
						}
					}
					if (!giris) {
						System.out.println("Error: Please sign in and try again.");
					}
				}

				else if (split[0].equals("REMOVEFRIEND")) {

					boolean signin = false;
					boolean nameExist = false;
					System.out.println("-----------------------");
					System.out.println("Command: " + split[0] + "\t" + split[1]);

					for (Users user : UserCollection.usersList) {

						if (user.isSignIn()) {

							signin = true;

						}
					}

					if (signin) {

						for (Users user : UserCollection.usersList) {

							if (user.getUsername().equals(split[1])) {

								user.removeFriend(split[1]);
								nameExist = true;
							}
						}
						if (!nameExist) {
							System.out.println("No such friend!");
						}
					} else
						System.out.println("Error: Please sign in and try again.");

				} else if (split[0].equals("SIGNOUT")) {

					System.out.println("-----------------------");
					System.out.println("Command: " + split[0]);
					for (Users user : UserCollection.usersList) {
						if (user.isSignIn()) {
							user.signOut();
						}
					}

				} else if (split[0].equals("BLOCK")) {
					boolean signin = false;
					boolean nameExist = false;
					System.out.println("-----------------------");
					System.out.println("Command: " + split[0] + "\t" + split[1]);

					for (Users user : UserCollection.usersList) {

						if (user.isSignIn()) {

							signin = true;

						}
					}

					if (signin) {

						for (Users user : UserCollection.usersList) {

							if (user.getUsername().equals(split[1])) {

								user.block(split[1]);
								nameExist = true;
							}
						}
						if (!nameExist) {
							System.out.println("No such user!");
						}
					} else
						System.out.println("Error: Please sign in and try again.");

				}

				else if (split[0].equals("UNBLOCK")) {
					boolean signin = false;
					boolean nameExist = false;
					System.out.println("-----------------------");
					System.out.println("Command: " + split[0] + "\t" + split[1]);
					for (Users user : UserCollection.usersList) {

						if (user.isSignIn()) {

							signin = true;

						}
					}

					if (signin) {

						for (Users user : UserCollection.usersList) {

							if (user.getUsername().equals(split[1])) {

								user.unBlock(split[1]);
								nameExist = true;
							}
						}
						if (!nameExist) {
							System.out.println("No such user in your blocked users list!");
						}
					} else
						System.out.println("Error: Please sign in and try again.");
				}

				else if (split[0].equals("SHOWBLOCKEDFRIENDS")) {
					boolean signin = false;
					System.out.println("-----------------------");
					System.out.println("Command: " + split[0]);

					for (Users user : UserCollection.usersList) {

						if (user.isSignIn()) {

							signin=true;
							user.showBlockFriends();
						}
					}
					if(!signin){
						System.out.println("Error: Please sign in and try again.");
					}
				} else if (split[0].equals("SHOWBLOCKEDUSERS")) {
					boolean signin = false;
					System.out.println("-----------------------");
					System.out.println("Command: " + split[0]);

					for (Users user : UserCollection.usersList) {

						if (user.isSignIn()) {

							signin=true;
							user.showBlockUsers();
						}
					}
					if(!signin){
						System.out.println("Error: Please sign in and try again.");
					}
				}
				else if (split[0].equals("ADDPOST-TEXT")) {

					boolean signin = false;
					System.out.println("-----------------------");
					System.out.println("Command: " + split[0] + "\t" + split[1] + "\t" + split[2] + "\t" + split[3]
							+ "\t" + split[4]);

					for (Users user : UserCollection.usersList) {

						if (user.isSignIn()) {

							signin = true;
							user.addpostText(new TextPost(split[1], Double.parseDouble(split[2]),Double.parseDouble(split[3]), split[4],b));
						}
					}
					if (!signin) {
						System.out.println("Error: Please sign in and try again.");
					}

				} else if (split[0].equals("ADDPOST-IMAGE")) {

					boolean signin = false;
					System.out.println("-----------------------");
					System.out.println("Command: " + split[0] + "\t" + split[1] + "\t" + split[2] + "\t" + split[3]
							+ "\t" + split[4]);

					for (Users user : UserCollection.usersList) {

						if (user.isSignIn()) {

							signin = true;
							user.addpostImage(new ImagePost(split[1], Double.parseDouble(split[2]),
									Double.parseDouble(split[3]), split[4],split[5],split[6],b));
						}
					}
					if (!signin) {
						System.out.println("Error: Please sign in and try again.");
					}

				}
				else if (split[0].equals("ADDPOST-VIDEO")) {

					boolean signin = false;
					System.out.println("-----------------------");
					System.out.println("Command: " + split[0] + "\t" + split[1] + "\t" + split[2] + "\t" + split[3]
							+ "\t" + split[4]);

					for (Users user : UserCollection.usersList) {

						if (user.isSignIn()) {

							signin = true;
							user.addpostVideo(new VideoPost(split[1], Double.parseDouble(split[2]),
									Double.parseDouble(split[3]), split[4],split[5],split[6],b));
						}
					}
					if (!signin) {
						System.out.println("Error: Please sign in and try again.");
					}

				}
				else if (split[0].equals("REMOVELASTPOST")) {

					boolean signin = false;
					System.out.println("-----------------------");
					System.out.println("Command: " + split[0] );

					for (Users user : UserCollection.usersList) {

						if (user.isSignIn()) {

							signin = true;
							user.removeLastPost();
						}
					}
					if (!signin) {
						System.out.println("Error: Please sign in and try again.");
					}

				}
				else if (split[0].equals("SHOWPOSTS")) {

					boolean signin = false;
					System.out.println("-----------------------");
					System.out.println("Command: " + split[0] + "\t" + split[1]);

					for (Users user : UserCollection.usersList) {

						if (user.isSignIn()) {

							signin = true;
						//	UserCollection.showPosts(split[1]);
						}
					}
					if (!signin) {
						System.out.println("Error: Please sign in and try again.");
					}

				}

			}

			input.close();
		} catch (

		FileNotFoundException ex) {
			System.out.println("No File Found!");
			return;
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("No argument acceseses!");
			return;
		}

		
	}
	


}
