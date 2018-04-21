
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import home2new.*;
import shoppingPackage.Campaign;
import Items.*;
/**
 * 
 * @author GÖKÇE
 *
 */
public class Main {
	static ArrayList<Customer> customerList = new ArrayList<Customer>();
	static ArrayList<Admin> adminList = new ArrayList<Admin>();
	static ArrayList<Technician> techList = new ArrayList<Technician>();
	static ArrayList<Campaign> campaignList = new ArrayList<Campaign>();

	static ArrayList<Items> itemList = new ArrayList<Items>();
/**
 * 
 * @param args   get arguments from input file
 */
	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(new File(args[0]));
			while (input.hasNextLine()) {
				String[] split = input.nextLine().split("\t");
				if (split[0].equals("CUSTOMER")) {
					customerList
							.add(new Customer(split[1], split[2], split[3], Double.parseDouble(split[4]), split[5]));
				}
				if (split[0].equals("ADMIN")) {
					adminList.add(new Admin(split[1], split[2], split[3], Integer.parseInt(split[4]), split[5]));
				}
				if (split[0].equals("TECH")) {
					techList.add(new Technician(split[1], split[2], split[3], Integer.parseInt(split[4]),
							Integer.parseInt(split[5])));
				}
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

				if (split[0].equals("BOOK")) {
					itemList.add(new Book(Integer.parseInt(split[1]), Items.IDcount, split[2], split[3], split[4],
							split[5], Integer.parseInt(split[6])));
				}
				if (split[0].equals("CDDVD")) {
					itemList.add(new CDDVD(Integer.parseInt(split[1]), Items.IDcount, split[2], split[3], split[4],
							split[5]));

				}
				if (split[0].equals("DESKTOP")) {
					itemList.add(new Desktop(Integer.parseInt(split[1]), Items.IDcount, split[2], split[3],
							Integer.parseInt(split[4]), Integer.parseInt(split[5]), split[6], split[7],
							Integer.parseInt(split[8]), Integer.parseInt(split[9]), split[10]));

				}
				if (split[0].equals("LAPTOP")) {
					itemList.add(new Laptop(Integer.parseInt(split[1]), Items.IDcount, split[2], split[3],
							Integer.parseInt(split[4]), Integer.parseInt(split[5]), split[6], split[7],
							Integer.parseInt(split[8]), Integer.parseInt(split[9]), split[10]));

				}
				if (split[0].equals("TABLET")) {
					itemList.add(new Tablet(Integer.parseInt(split[1]), Items.IDcount, split[2], split[3],
							Integer.parseInt(split[4]), Integer.parseInt(split[5]), split[6], split[7],
							Integer.parseInt(split[8]), Integer.parseInt(split[9]), Integer.parseInt(split[10])));

				}
				if (split[0].equals("TV")) {
					itemList.add(new TV(Integer.parseInt(split[1]), Items.IDcount, split[2], split[3],
							Integer.parseInt(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6])));

				}
				if (split[0].equals("SMARTPHONE")) {
					itemList.add(new SmartPhone(Integer.parseInt(split[1]), Items.IDcount, split[2], split[3],
							Integer.parseInt(split[4]), Integer.parseInt(split[5]), split[6]));

				}
				if (split[0].equals("HAIRCARE")) {
					itemList.add(new HairCare(Integer.parseInt(split[1]), Items.IDcount, split[2], split[3], split[5],
							Integer.parseInt(split[6]), split[4], split[7]));
				}
				if (split[0].equals("PERFUME")) {
					itemList.add(new Perfume(Integer.parseInt(split[1]), Items.IDcount, split[2], split[3], split[5],
							Integer.parseInt(split[6]), split[4], Integer.parseInt(split[7])));

				}
				if (split[0].equals("SKINCARE")) {
					itemList.add(new SkinCare(Integer.parseInt(split[1]), Items.IDcount, split[2], split[3], split[5],
							Integer.parseInt(split[6]), split[4], split[7]));

				}

			}
			input.close();
		} catch (FileNotFoundException ex) {
			System.out.println("No File Found!");
			return;
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("No argument acceseses!");
			return;
		}
		Admin adminA = new Admin();
		Technician techA = new Technician();
		Employee employeeA = new Employee();
		Customer custA = new Customer();
		try {
			Scanner veri = new Scanner(new File(args[2]));
			while (veri.hasNextLine()) {
				String[] myList = veri.nextLine().split("\\s+");

				if (myList[0].equals("ADDCUSTOMER")) {
					if (adminA.isAdminExist(adminList, myList[1])) {
						adminA.addcustomer(customerList, myList[2], myList[3], myList[4], Double.parseDouble(myList[5]),
								myList[6]);
					} else {
						System.out.println("No admin person named " + myList[1] + " exists!");
					}
				} else if (myList[0].equals("SHOWCUSTOMER")) {
					if (adminA.isAdminExist(adminList, myList[1])) {
						adminA.showCustInfo(customerList, Integer.parseInt(myList[2]));
					} else {
						System.out.println("No admin person named " + myList[1] + " exists!");
					}
				} else if (myList[0].equals("SHOWCUSTOMERS")) {
					if (adminA.isAdminExist(adminList, myList[1])) {
						adminA.showCustomers(customerList);
					} else {
						System.out.println("No admin person named " + myList[1] + " exists!");
					}
				} else if (myList[0].equals("SHOWADMININFO")) {
					if (adminA.isAdminExist(adminList, myList[1])) {
						adminA.showAdminInfo(adminList, myList[1]);
					} else {
						System.out.println("No admin person named " + myList[1] + " exists!");
					}

				}
				if (myList[0].equals("ADDADMIN")) {
					if (adminA.isAdminExist(adminList, myList[1])) {
						adminA.addAdmin(adminList, myList[2], myList[3], myList[4], Integer.parseInt(myList[5]),
								myList[6]);
					} else {
						System.out.println("No admin person named " + myList[1] + " exists!");
					}
				} else if (myList[0].equals("ADDTECH")) {
					if (adminA.isAdminExist(adminList, myList[1])) {
						adminA.addTech(techList, myList[2], myList[3], myList[4], Integer.parseInt(myList[5]),
								Integer.parseInt(myList[6]));
					} else {
						System.out.println("No admin person named " + myList[1] + " exists!");
					}
				} else if (myList[0].equals("CREATECAMPAIGN")) {
					if (adminA.isAdminExist(adminList, myList[1])) {
						if (Integer.parseInt(myList[5]) <= 50) {
							adminA.createCampaign(campaignList, myList[2], myList[3], myList[4],
									Integer.parseInt(myList[5]));
						} else {
							System.out.print("Campaign was not created. Discount rate exceeds maximum rate of 50%.\n");
						}
					} else {
						System.out.println("No admin person named " + myList[1] + " exists!");
					}
				} else if (myList[0].equals("ADDITEM")) {
					if (techA.isTechnicianExist(techList, myList[1])) {
						techA.addItem(itemList, myList[2]);
					} else {
						System.out.println("No technician person named " + myList[1] + " exists!");
					}
				}

				else if (myList[0].equals("LISTITEM")) {
					if (techA.isTechnicianExist(techList, myList[1]) || adminA.isAdminExist(adminList, myList[1])) {
						employeeA.listItem(itemList);

					} else {
						System.out.println("No admin or technician person named " + myList[1] + " exists!");
					}
				} else if (myList[0].equals("DISPITEMSOF")) {
					if (techA.isTechnicianExist(techList, myList[1])) {
						techA.dispItemSof(itemList, myList[2]);
					} else {
						System.out.println("No admin person named " + myList[1] + " exists!");
					}
				} else if (myList[0].equals("CHPASS")) {
					for (int i = 0; i < customerList.size(); i++) {
						if (customerList.get(i).getCustomerID() == Integer.parseInt(myList[1])) {
							if (myList[2] != myList[3]) {
								adminA.chPass(customerList, myList[3]);
							}
							break;
						} else {
							System.out.println(
									"The given password does not match the current password. Please try again.");
						}
					}
				} else if (myList[0].equals("DEPOSITMONEY")) {
					for (int i = 0; i < customerList.size(); i++) {
						if (customerList.get(i).getCustomerID() == Integer.parseInt(myList[1])) {
							custA.depositMoney();

						} else {
							System.out.println("No customer with ID number " + myList[1] + " exists!");
						}
					}
				} else if (myList[0].equals("SHOWCAMPAIGNS")) {
					for (int i = 0; i < customerList.size(); i++) {
						if (customerList.get(i).getCustomerID() == Integer.parseInt(myList[1])) {
							custA.showCampaigns();
						} else
							System.out.println("No admin person named " + myList[1] + " exists!");

					}
				} else if (myList[0].equals("SHOWITEMSLOWONSTOCK")) {

					if (techA.isTechnicianExist(techList, myList[1]) || adminA.isAdminExist(adminList, myList[1])) {
						employeeA.showItemsLowOnStock(myList[2]);
					} else
						System.out.println("No admin person named " + myList[1] + " exists!");

				}
				else if (myList[0].equals("SHOWVIP")) {

					if (techA.isTechnicianExist(techList, myList[1]) || adminA.isAdminExist(adminList, myList[1])) {
						employeeA.showVIP(myList[2]);
					} //else
					//	System.out.println("No admin person named " + myList[1] + " exists!");

				}
				else if (myList[0].equals("SHOWORDERS")) {

					if (techA.isTechnicianExist(techList, myList[1])) {
						techA.showOrders(myList[2]);
					} //else
					//	System.out.println("No admin person named " + myList[1] + " exists!");

				}
				else if (myList[0].equals("ADDTOCART")) {

					if (techA.isTechnicianExist(techList, myList[1]) || adminA.isAdminExist(adminList, myList[1])) {
						employeeA.addToCart();
					} //else
						//System.out.println("No admin person named " + myList[1] + " exists!");

				}
				else if (myList[0].equals("EMPTYCART")) {

					if (techA.isTechnicianExist(techList, myList[1]) || adminA.isAdminExist(adminList, myList[1])) {
						custA.emptyCart();
					} //else
						//System.out.println("No admin person named " + myList[1] + " exists!");

				}
				else if (myList[0].equals("ORDER")) {

					if (techA.isTechnicianExist(techList, myList[1]) || adminA.isAdminExist(adminList, myList[1])) {
						custA.order();
					} //else
						//System.out.println("No admin person named " + myList[1] + " exists!");

				}

			}
			veri.close();
		} catch (FileNotFoundException ex) {
			System.out.println("No File Found!");
			return;
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("No argument acceseses!");
			return;
		}
	}
}
