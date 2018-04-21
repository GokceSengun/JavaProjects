import java.awt.EventQueue;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.ListSelectionModel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JScrollBar;

public class Main {

	static DefaultListModel<Users> modelUser;

	private JFrame frmSystem;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JLabel facebooklogo;
	private JButton btnRemoveUser;
	private JButton btnNewUser;
	private JLabel lblRegisteredUsers;
	private JList list;
	private JPanel panelsystem;
	private JScrollBar scrollBar;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmSystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		Date b = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
		try {
			Scanner input = new Scanner(new File(args[0]));
			while (input.hasNextLine()) {
				String[] split = input.nextLine().split("\t");
				Date date = null;
				try {
					date = formatter.parse(split[3]);
				} catch (ParseException e) {

					e.printStackTrace();
				}

				UserCollection.usersList.add(new Users(split[0], split[1], split[2], date, split[4], split[5]));

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
			Scanner input = new Scanner(new File(args[1]));
			while (input.hasNextLine()) {
				String[] split = input.nextLine().split("\t");
				if (split[0].equals("ADDFRIEND")) {
					Users user1 = null;
					Users user2 = null;

					for (Users user : UserCollection.usersList) {
						if (user.getUsername().equals(split[1])) {
							user1 = user;
						}

					}
					for (Users user : UserCollection.usersList) {
						if (user.getUsername().equals(split[2])) {
							user2 = user;
						}
					}
					if (user1 != null && user2 != null) {
						Users.addFriend(user1, user2);
					}

				}  else if (split[0].equals("BLOCKFRIEND")) {

					Users user1 = null;
					Users user2 = null;

					for (Users user : UserCollection.usersList) {
						if (user.getUsername().equals(split[1])) {
							user1 = user;
						}

					}
					for (Users user : UserCollection.usersList) {
						if (user.getUsername().equals(split[2])) {
							user2 = user;
						}
					}
					if (user1 != null && user2 != null) {
						Users.blockFriend(user1, user2);
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

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSystem = new JFrame();
		frmSystem.getContentPane().setBackground(Color.WHITE);
		frmSystem.setTitle("Facebook Login Page");
		frmSystem.setBounds(100, 100, 582, 428);
		frmSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSystem.getContentPane().setLayout(null);

		JLabel username = new JLabel("Username");
		username.setBounds(357, 99, 82, 16);
		frmSystem.getContentPane().add(username);

		JLabel password = new JLabel("Password");
		password.setBounds(357, 128, 67, 16);
		frmSystem.getContentPane().add(password);

		usernameField = new JTextField();
		usernameField.setBounds(436, 96, 116, 22);
		frmSystem.getContentPane().add(usernameField);
		usernameField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(436, 125, 116, 22);
		frmSystem.getContentPane().add(passwordField);

		facebooklogo = new JLabel("New label");
		Image img = new ImageIcon(this.getClass().getResource("/Facebooklogo1.png")).getImage();
		facebooklogo.setIcon(new ImageIcon(img));
		facebooklogo.setBounds(22, 16, 304, 183);
		frmSystem.getContentPane().add(facebooklogo);

		btnNewUser = new JButton("New User...");
		btnNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CreateUser nw = new CreateUser();
				nw.setVisible(true);
			}
		});
		btnNewUser.setBounds(390, 343, 162, 25);
		frmSystem.getContentPane().add(btnNewUser);

		lblRegisteredUsers = new JLabel("Registered Users");
		lblRegisteredUsers.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblRegisteredUsers.setBounds(22, 225, 198, 25);
		frmSystem.getContentPane().add(lblRegisteredUsers);
		
		panelsystem = new JPanel();
		panelsystem.setBackground(Color.LIGHT_GRAY);
		panelsystem.setBounds(0, 0, 564, 22);
		frmSystem.getContentPane().add(panelsystem);
		panelsystem.setLayout(null);
		
		lblNewLabel_1 = new JLabel("System");
		lblNewLabel_1.setBounds(12, 0, 77, 22);
		panelsystem.add(lblNewLabel_1);
		
		scrollBar = new JScrollBar();
		scrollBar.setOrientation(JScrollBar.HORIZONTAL);
		scrollBar.setBounds(22, 314, 530, 16);
		frmSystem.getContentPane().add(scrollBar);

		modelUser = new DefaultListModel<Users>();

		for (Users user : UserCollection.usersList) {
			modelUser.addElement(user);
		}

		list = new JList(modelUser);
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				Users selectedUser = (Users) list.getSelectedValue();
				usernameField.setText(selectedUser.getUsername());
				passwordField.setText(selectedUser.getPassword());

			}
		});
		list.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		list.setLayoutOrientation(JList.VERTICAL_WRAP);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setVisibleRowCount(2);

		list.setBounds(22, 252, 530, 62);
		frmSystem.getContentPane().add(list);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String userNname = usernameField.getText();
				String passWord = passwordField.getText();

				if(UserCollection.signIn(userNname, passWord)==true){
				ProfilePage nw = new ProfilePage();
				nw.setVisible(true);
				}
				else
					JOptionPane.showMessageDialog(frmSystem, "Password or username is false. ");


			}
		});
		btnLogin.setBounds(436, 155, 116, 25);
		frmSystem.getContentPane().add(btnLogin);
		
		btnRemoveUser = new JButton("Remove User");
		btnRemoveUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int opcion = JOptionPane.showConfirmDialog(null, "Are you sure to delete ?", "Delete", JOptionPane.YES_NO_OPTION);

				if (opcion == 0) { 
				   if(!(list.isSelectionEmpty())){
						UserCollection.removeUser((Users)list.getSelectedValue());
						
					}
				}
				
				
			}
		});
		btnRemoveUser.setBounds(22, 343, 162, 25);
		frmSystem.getContentPane().add(btnRemoveUser);
	}
	
}

