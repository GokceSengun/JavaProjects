package home2new;
import java.util.ArrayList;
import shoppingPackage.Campaign;

/**
 * @author GÖKÇE
 *
 */

public class Admin extends Employee {

	private String password;

	/**
	 * @param nameP is admin name
	 * @param e_mailP is e mail name
	 * @param dateofBirthP is date of birth
	 * @param salary is salary
	 * @param pass is admins password
	 */
	public Admin(String nameP, String e_mailP, String dateofBirthP, int salary, String pass) {
		super(nameP, e_mailP, dateofBirthP, salary);
		this.password = pass;

	}

/**
 * default constructor
 */
	public Admin() {

	}


	/**
	 * 
	 * @return pas call paswords value
	 */
	private String getPassword() {
		return password;
	}
/**
 * 
 * @param password it properies to password
 */
	private void setPassword(String password) {
		this.password = password;
	}
	public String toString() {
		return ("Admin name: " + getName() + " e_mail: " + getE_mail() + " date of birth: " + getDateOfBirth()
				+ " salary: " + getSalary() + " password: " + getPassword());
	}
/**
 * 
 * @param customerList has a customer datas
 * @param name is customer name
 * @param e_mail is customers e mail
 * @param dateofBirth is customers date of birth
 * @param initialBalance is money of customer
 * @param password is password of cstomer
 */
	public void addcustomer(ArrayList<Customer> customerList, String name, String e_mail, String dateofBirth,
			double initialBalance, String password) {
		customerList.add(new Customer(name, e_mail, dateofBirth, initialBalance, password));
	}
/**
 * 
 * @param adminList has  admins datas
 * @param adminName is admin name
 * @return
 */
	public boolean isAdminExist(ArrayList<Admin> adminList, String adminName) {
		boolean value = false;
		for (int i = 0; i < adminList.size(); i++) {
			if (adminList.get(i).getName().contains(adminName)) {
				value = true;
				break;
			} else {
				value = false;
			}
		}
		return value;
	}
/**
 * 
 * @param customerList has customer list
 * @param ID is customer id
 */
	public void showCustInfo(ArrayList<Customer> customerList, int ID) {

		for (int i = 0; i < customerList.size(); i++) {
			if (customerList.get(i).getCustomerID() == ID) {
				System.out.println("Customer name: " + customerList.get(i).getName() + "\tID: "
						+ customerList.get(i).getCustomerID() + "\te-mail :" + customerList.get(i).getE_mail()
						+ "\tDate of Birth: " + customerList.get(i).getDateOfBirth() + "\tStatus: "
						+ customerList.get(i).getCustomerStatus());

			}

		}

	}
/**
 * 
 * @param customerList  has customers datas
 */
	public void showCustomers(ArrayList<Customer> customerList) {

		for (int i = 0; i < customerList.size(); i++) {
			System.out.println(customerList.get(i));

		}

	}
/**
 * 
 * @param adminList has a admins datas
 * @param adminName is admin name
 */
	public void showAdminInfo(ArrayList<Admin> adminList, String adminName) {

		for (int i = 0; i < adminList.size(); i++) {
			if (adminList.get(i).getName().contains(adminName)) {
				System.out.println("----------- Admin info -----------");
				System.out.println("Admin name: " + adminList.get(i).getName() + "\n" + "Admin e-mail: "
						+ adminList.get(i).getE_mail() + "\n" + "Admin date of birth: "
						+ adminList.get(i).getDateOfBirth());
			}
		}
	}
/**
 * 
 * @param adminList has admins datas
 * @param newName is new admin name
 * @param newE_mail is new e mail of admin
 * @param newDateofBirth is new date of birth of admin
 * @param newSalary is new salary of admin
 * @param newPassword is new password of admin
 */
	public void addAdmin(ArrayList<Admin> adminList, String newName, String newE_mail, String newDateofBirth,
			int newSalary, String newPassword) {
		adminList.add(new Admin(newName, newE_mail, newDateofBirth, newSalary, newPassword));
	}
/**
 * 
 * @param techList has technicians name
 * @param newName is new name of technician
 * @param newE_mail is new e mail of technician
 * @param newDateofBirth is new date of birth of technician
 * @param newSalary is new salary of technician
 * @param isSenior technician may has senior or not
 */
	public void addTech(ArrayList<Technician> techList, String newName, String newE_mail, String newDateofBirth,
			int newSalary, int isSenior) {
		techList.add(new Technician(newName, newE_mail, newDateofBirth, newSalary, isSenior));

	}
/**
 * 
 * @param campaignList has campaigns information
 * @param startDate is start date of campaign
 * @param endDate is end date of campaign 
 * @param itemType campaign include different item data 
 * @param rate is campaign rate
 */
	public void createCampaign(ArrayList<Campaign> campaignList, String startDate, String endDate, String itemType,
			int rate) {
		campaignList.add(new Campaign(startDate, endDate, itemType, rate));

	}
/**
 * 
 * @param customerList has customers datas
 * @param newpass is new password of customer
 */
	public void chPass(ArrayList<Customer> customerList, String newpass) {

		this.password = newpass;
		System.out.println("The password has been succesfully changed.");

	}
}
