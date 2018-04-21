package home2new;

import java.util.ArrayList;

import Items.*;

/**
 * 
 * @author GÖKÇE
 *
 */
public class Technician extends Employee {
	private int isSeniorTechnician; // Boolean olabilir

	/**
	 *  default technician
	 */
	public Technician() {
		super();
		this.setIsSeniorTechnician(-1); //
	}

	/**
	 * 
	 * @param nameP is technician name
	 * @param e_mailP is technician e mail
	 * @param dateofBirthP is date of birth technician
	 * @param salary is salary of technician
	 * @param isSeniorTechnician senior or not
	 */
	public Technician(String nameP, String e_mailP, String dateofBirthP, int salary, int isSeniorTechnician) {
		super(nameP, e_mailP, dateofBirthP, salary);
		this.isSeniorTechnician = isSeniorTechnician;
	}

	/**
	 * 
	 * @param t object of technician
	 */
	public Technician(Technician t) {
		super(t);
		this.isSeniorTechnician = t.isSeniorTechnician;
	}

	/**
	 * 
	 * @return get senior data
	 */
	public int getIsSeniorTechnician() {
		return isSeniorTechnician;
	}

	/**
	 * 
	 * @param senior technician senior or not
	 */
	public void setIsSeniorTechnician(int senior) {
		this.isSeniorTechnician = senior;
	}

	/**
	 * display technician datas
	 */
	public String toString() {
		return ("Technician name: " + getName() + " e_mail: " + getE_mail() + " date of birth: " + getDateOfBirth()
				+ " salary: " + getSalary() + " isSeniorTechnician " + getIsSeniorTechnician());
	}


	/**
	 * 
	 * @param techList has tehnicians datas
	 * @param adminName is name of technician
	 * @return
	 */
	public boolean isTechnicianExist(ArrayList<Technician> techList, String adminName) {
		boolean value = false;
		for (int i = 0; i < techList.size(); i++) {
			if (techList.get(i).getName().contains(adminName)) {
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
	 * @param itemList has items datas
	 * @param typeItems show of type of item
	 */
	public void dispItemSof(ArrayList<Items> itemList, String typeItems) {
		String[] typeItem1 = typeItems.split(":");
		for (int i = 0; i < typeItem1.length; i++) {
			for (int j = 0; j < itemList.size(); j++) {
				String itemTypeStr = itemList.get(j).getClass().getName()
						.substring(itemList.get(j).getClass().getName().indexOf('.') + 1).toUpperCase();
				if (itemTypeStr.equals(typeItem1[i])) {
					System.out.println(itemList.get(j));
				}
			}
		}
	}
/**
 * 
 * @param itemList show item list for add item
 * @param arguments items
 */
	public void addItem(ArrayList<Items> itemList, String arguments) {
		String[] typeItem2 = arguments.split(":");
		/*
		if (typeItem2[0].equals("BOOK")) {
			itemList.add(new Book(Integer.parseInt(typeItem2[1]),Items.IDcount,typeItem2[2],typeItem2[3],typeItem2[4],typeItem2[5],Integer.parseInt(typeItem2[6])));
		}
		else if (typeItem2[0].equals("CDDVD")) {
			itemList.add(new CDDVD(Integer.parseInt(typeItem2[1]),Items.IDcount,typeItem2[2],typeItem2[3],typeItem2[4],typeItem2[5]));
		}
		else if (typeItem2[0].equals("DESKTOP")) {
			itemList.add(new Desktop(Integer.parseInt(typeItem2[1]),Items.IDcount,typeItem2[2],typeItem2[3],Integer.parseInt(typeItem2[4]),Integer.parseInt(typeItem2[5]),typeItem2[6],typeItem2[7],Integer.parseInt(typeItem2[8]),Integer.parseInt(typeItem2[9]),typeItem2[10]));
		}
		else if (typeItem2[0].equals("LAPTOP")) {
			itemList.add(new Laptop(Integer.parseInt(typeItem2[1]),Items.IDcount,typeItem2[2],typeItem2[3],Integer.parseInt(typeItem2[4]),Integer.parseInt(typeItem2[5]),typeItem2[6],typeItem2[7],Integer.parseInt(typeItem2[8]),Integer.parseInt(typeItem2[9]),typeItem2[10]));
		}
		else if (typeItem2[0].equals("TABLET")) {
			itemList.add(new Tablet(Integer.parseInt(typeItem2[1]),Items.IDcount,typeItem2[2],typeItem2[3],Integer.parseInt(typeItem2[4]),Integer.parseInt(typeItem2[5]),typeItem2[6],typeItem2[7],Integer.parseInt(typeItem2[8]),Integer.parseInt(typeItem2[9]),Integer.parseInt(typeItem2[10])));
		}
		else if (typeItem2[0].equals("TV")) {
			itemList.add(new TV(Integer.parseInt(typeItem2[1]),Items.IDcount,typeItem2[2],typeItem2[3],Integer.parseInt(typeItem2[4]),Integer.parseInt(typeItem2[5]),Integer.parseInt(typeItem2[6])));
		}
		else if (typeItem2[0].equals("SMARTPHONE")) {
			itemList.add(new SmartPhone(Integer.parseInt(typeItem2[1]),Items.IDcount,typeItem2[2],typeItem2[3],Integer.parseInt(typeItem2[4]),Integer.parseInt(typeItem2[5]),typeItem2[6]));
		}
		else if (typeItem2[0].equals("HAIRCARE")) {
			itemList.add(new HairCare(Integer.parseInt(typeItem2[1]),Items.IDcount,typeItem2[2],typeItem2[3],typeItem2[4],Integer.parseInt(typeItem2[5]),typeItem2[6],typeItem2[7]));
		}
		else if (typeItem2[0].equals("PERFUME")) {
			itemList.add(new Perfume(Integer.parseInt(typeItem2[1]),Items.IDcount,typeItem2[2],typeItem2[3],typeItem2[4],Integer.parseInt(typeItem2[5]),typeItem2[6],Integer.parseInt(typeItem2[7])));
		}
		else if (typeItem2[0].equals("SKINCARE")) {
			itemList.add(new SkinCare(Integer.parseInt(typeItem2[1]),Items.IDcount,typeItem2[2],typeItem2[3],typeItem2[4],Integer.parseInt(typeItem2[5]),typeItem2[6],typeItem2[7]));
		}*/
		
	}
/**
 * 
 * @param string show order
 */
	public void showOrders(String string) {
		// TODO Auto-generated method stub
		
	}
}
