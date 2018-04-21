import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CreateUser extends JFrame {

	private JPanel contentPane;
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateUser frame = new CreateUser();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CreateUser() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 517, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTextField textFieldUsername = new JTextField();
		contentPane.setLayout(null);
		textFieldUsername.setBounds(157, 148, 116, 22);
		contentPane.add(textFieldUsername);
		textFieldUsername.setColumns(10);
		
		JPasswordField passwordField = new JPasswordField();
		passwordField.setBounds(157, 183, 116, 22);
		contentPane.add(passwordField);

		JPasswordField passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(157, 218, 113, 22);
		contentPane.add(passwordField_1);

		JTextField textFieldSchool = new JTextField();
		textFieldSchool.setBounds(157, 287, 316, 22);
		contentPane.add(textFieldSchool);
		textFieldSchool.setColumns(10);

		JTextField textFieldnamesurname = new JTextField();
		textFieldnamesurname.setBounds(157, 252, 316, 22);
		contentPane.add(textFieldnamesurname);
		textFieldnamesurname.setColumns(10);


		JTextField textFieldBirth = new JTextField();
		textFieldBirth.setBounds(157, 316, 116, 22);
		contentPane.add(textFieldBirth);
		textFieldBirth.setColumns(10);

		JComboBox relationStatus = new JComboBox();
		relationStatus.setModel(
				new DefaultComboBoxModel(new String[] { "Single", "In relationship", "Divorced", "Complicated" }));
		relationStatus.setBounds(157, 345, 126, 22);
		getContentPane().add(relationStatus);
		
		JLabel username = new JLabel("Username");
		username.setBounds(12, 151, 89, 16);
		getContentPane().add(username);

		JLabel lblNewLabel = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/Facebooklogo1.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img1));
		lblNewLabel.setBounds(115, 13, 316, 93);
		contentPane.add(lblNewLabel);

		JLabel lblPassword1 = new JLabel("Password (re-type)");
		lblPassword1.setBounds(12, 221, 117, 16);
		getContentPane().add(lblPassword1);

		JLabel namesurname = new JLabel("Name Surname");
		namesurname.setBounds(12, 255, 106, 16);
		getContentPane().add(namesurname);

		JLabel school = new JLabel("School graduated");
		school.setBounds(12, 290, 117, 16);
		getContentPane().add(school);

		JLabel relation = new JLabel("Relationship Status");
		relation.setBounds(12, 348, 117, 16);
		getContentPane().add(relation);

		JLabel lblCreateUser = new JLabel("Create User");
		lblCreateUser.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCreateUser.setBounds(173, 113, 170, 22);
		getContentPane().add(lblCreateUser);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(12, 186, 56, 16);
		contentPane.add(lblPassword);

		JLabel birth = new JLabel("Birth Date");
		birth.setBounds(12, 319, 117, 16);
		getContentPane().add(birth);

		JButton btnCreate = new JButton("Create");

		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Date date = null;
				try {
					date = formatter.parse(textFieldBirth.getText());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (passwordField.getText().equals(passwordField_1.getText())) {
					UserCollection.usersList.add(new Users(textFieldnamesurname.getText(), textFieldUsername.getText(),
							passwordField.getText(), date, textFieldSchool.getText(),
							(String) relationStatus.getSelectedItem()));
					Main.modelUser.addElement(new Users(textFieldnamesurname.getText(), textFieldUsername.getText(),
							passwordField.getText(), date, textFieldSchool.getText(),
							(String) relationStatus.getSelectedItem()));
					setVisible(false);

					JOptionPane.showMessageDialog(null, "Created new user. ");
				}
				else{
					JOptionPane.showMessageDialog(null, "Your passwords are not match. ");
				}

			}
		});
		btnCreate.setBounds(173, 417, 135, 25);
		contentPane.add(btnCreate);


	}

}
