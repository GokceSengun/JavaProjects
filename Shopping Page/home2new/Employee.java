package home2new;

import java.util.ArrayList;
import Items.Items;
/**
 * 
 * @author GÖKÇE
 *
 */
public class Employee extends Person{
	private int salary;
/**
 * 
 */
	public Employee(){
		super();
		this.setSalary(0);
	}
	/**
	 * 
	 * @param nameP is employee name
	 * @param e_mailP is employee e mail
	 * @param dateOfBirthP is employees date of birth
	 * @param salary is salary of employee
	 */
	public Employee(String nameP , String e_mailP, String dateOfBirthP,int salary){
		super(nameP , e_mailP,dateOfBirthP);
		this.setSalary(salary);
	}
	/**
	 * 
	 * @param e object of employee
	 */
	public Employee(Employee e){
		super(e);
		this.setSalary(e.getSalary());
	}
	/**
	 * 
	 * @return salary
	 */
	public int getSalary() {
		return salary;
	}
	/**
	 * 
	 * @param salary set salary
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}
	/**
	 *  display employee custructor
	 */
	public String toString(){
		return ("\tEmployee name: "+getName() +" e_mail: "+getE_mail()+" date of birth: "+getDateOfBirth()+" salary: "+getSalary());
	}
	/**
	 * 
	 * @param itemList has items datas
	 */
	public void listItem(ArrayList<Items> itemList){ 
	
		for (int i = 0; i < itemList.size(); i++) {
			System.out.println(itemList.get(i));
		}
	}
	/**
	 * 
	 * @param string shows stocks low item
	 */
	public void showItemsLowOnStock(String string) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 
	 * @param string shows výp customer
	 */
	public void showVIP(String string) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * add cart
	 */
	public void addToCart() {
		// TODO Auto-generated method stub
		
	}
	
	
}
