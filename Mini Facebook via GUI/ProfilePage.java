import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;

public class ProfilePage extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldDate;
	private JTextField textField_1school;
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public ProfilePage() {
		setTitle("Profile Pages");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 773);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(23, 42, 158, 143);
		Image img1 = new ImageIcon(this.getClass().getResource("/personicon8.png")).getImage();
		contentPane.setLayout(null);
		lblNewLabel.setIcon(new ImageIcon(img1));
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 220, 226, 219);
		panel.setBorder(new TitledBorder(null, "Information", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setToolTipText("fsdgf");
		panel.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2Date1 = new JLabel("Date of Birth");
		lblNewLabel_2Date1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2Date1.setBounds(12, 28, 97, 16);
		panel.add(lblNewLabel_2Date1);
		
		
		textFieldDate = new JTextField();
		textFieldDate.setBackground(SystemColor.control);
		textFieldDate.setBounds(12, 44, 149, 22);
		panel.add(textFieldDate);
		textFieldDate.setColumns(10);
		for (int i=0;i<UserCollection.usersList.size();i++) {
			if(UserCollection.usersList.get(i).isSignIn()==true){
				Date date = null;
				try {
					date = formatter.parse(textFieldDate.getText());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

				textFieldDate.setText(formatter.format(UserCollection.usersList.get(i).getDateOfBirth()));
			}
		}
		
		
		JLabel lblNewLabel_3 = new JLabel("School Graduated");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(12, 71, 116, 16);
		panel.add(lblNewLabel_3);
		
		textField_1school = new JTextField();
		textField_1school.setBackground(SystemColor.control);
		textField_1school.setBounds(12, 89, 149, 22);
		panel.add(textField_1school);
		textField_1school.setColumns(10);
		for (int i=0;i<UserCollection.usersList.size();i++) {
			if(UserCollection.usersList.get(i).isSignIn()==true){
				
				textField_1school.setText(UserCollection.usersList.get(i).getSchoolInfo());
			}
		}
		
		JLabel lblNewLabel_4 = new JLabel("Relationship Status");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(12, 117, 149, 16);
		panel.add(lblNewLabel_4);
		
		String[] iliski ={"Single ", "In relationship", "Divorced", "Complicated"};
		JComboBox comboBoxsingle = new JComboBox(iliski);
		comboBoxsingle.setBounds(12, 141, 149, 22);
		panel.add(comboBoxsingle);
		for (int i=0;i<UserCollection.usersList.size();i++) {
			if(UserCollection.usersList.get(i).isSignIn()==true){
				
				comboBoxsingle.setSelectedItem(UserCollection.usersList.get(i).getRelationShip());
			}
		}
		
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Date date = null;
				try {
					date = formatter.parse(textFieldDate.getText());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				for (int i=0;i<UserCollection.usersList.size();i++) {
					if(UserCollection.usersList.get(i).isSignIn()==true){
						
						UserCollection.usersList.get(i).setRelationShip((String) comboBoxsingle.getSelectedItem());
						setVisible(false);
						JOptionPane.showMessageDialog(null, "Updated your profile. ");
						
					}
				}
				
				
			}
		});
		btnNewButton.setBounds(12, 176, 116, 25);
		panel.add(btnNewButton);
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(23, 481, 226, 181);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JList list = new JList();
		list.setBounds(90, 5, 0, 0);
		panel_1.add(list);
		
		JButton btnNewButton_1 = new JButton("Remove Selected User");
		btnNewButton_1.setBounds(12, 143, 202, 25);
		panel_1.add(btnNewButton_1);
		
		JList list_1 = new JList();
		list_1.setBounds(12, 13, 202, 117);
		panel_1.add(list_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(193, 148, 170, 37);
		for (int i=0;i<UserCollection.usersList.size();i++) {
			if(UserCollection.usersList.get(i).isSignIn()==true){
				
				lblNewLabel_1.setText(UserCollection.usersList.get(i).getName());
			}
		}
		contentPane.add(lblNewLabel_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(296, 235, 516, 427);
		contentPane.add(tabbedPane);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Posts", null, tabbedPane_1, null);
		
		JTabbedPane tabbedPane_2 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Friends' Posts", null, tabbedPane_2, null);
		
		JRadioButton rdbtnNormal = new JRadioButton("Normal");
		rdbtnNormal.setBounds(98, 448, 69, 25);
		contentPane.add(rdbtnNormal);
		
		JRadioButton rdbtnBlocked = new JRadioButton("Blocked");
		rdbtnBlocked.setBounds(169, 447, 80, 25);
		contentPane.add(rdbtnBlocked);
		
		JLabel lblNewLabel_2 = new JLabel("Friends");
		lblNewLabel_2.setBounds(33, 452, 59, 16);
		contentPane.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLUE);
		panel_2.setBounds(0, 0, 914, 37);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(347, 6, 169, 24);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("Logout");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				for (int i=0;i<UserCollection.usersList.size();i++) {
					if(UserCollection.usersList.get(i).isSignIn()==true){
						int opcion = JOptionPane.showConfirmDialog(null, "Are you sure ?", "Log out", JOptionPane.YES_NO_OPTION);

						if (opcion == 0) { 
							Users.signOut(UserCollection.usersList.get(i));
							setVisible(false);
						}
						
					}
				}
				
			}
		});
		
		btnNewButton_2.setBounds(805, 6, 97, 25);
		panel_2.add(btnNewButton_2);
		
		
		
		JButton btnNewButton_3 = new JButton("Create a Post");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(663, 6, 130, 25);
		panel_2.add(btnNewButton_3);
		
		JLabel lblNewLabel_5 = new JLabel("Search Friends");
		lblNewLabel_5.setBounds(247, 0, 100, 36);
		panel_2.add(lblNewLabel_5);
		lblNewLabel_5.setForeground(SystemColor.window);
		
		
	}
}
