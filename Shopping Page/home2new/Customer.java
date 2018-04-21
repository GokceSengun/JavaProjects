package home2new;

import java.util.ArrayList;

import shoppingPackage.Campaign;
/**
 * 
 * @author GÖKÇE
 *
 */
public class Customer extends Person{
	 private int customerID;
	 private double iBalance;
	 private String password;
	 public static int customerCount=0;
	 private  String customerStatus;  
/**
 * 
 * @param nameP is customer name
 * @param e_mailP is customer e mail
 * @param dateofBirthP is customer date of birth
 * @param iBalance is money of customer
 * @param pass is password of customer
 */
	 public Customer(String nameP, String e_mailP, String dateofBirthP,double iBalance,String pass){
		super( nameP , e_mailP, dateofBirthP);
		this.setiBalance(iBalance);
		this.setPassword(pass);
		this.customerCount++;
		this.setCustomerID(customerCount);
		this.customerStatus = "CLASSIC";
			 
	 }
	 /**
	  * 
	  * @param c
	  */
	 public Customer(Customer c){
		 super(c);
		 this.setiBalance(c.getiBalance());
		 this.setPassword(c.getPassword());
		 this.customerCount++;
		 this.setCustomerID(customerCount);
	 }
	 /**
	  * default constructor
	  */
	 public Customer() {
		// TODO Auto-generated constructor stub
	}
	 /**
	  * 
	  * @return calls balance 
	  */
	public double getiBalance() {
			return iBalance;
		}
	/**
	 * 
	 * @param iBalance prepare balance
	 */
		public void setiBalance(double iBalance) {
			this.iBalance = iBalance;
		}
		/**
		 * 
		 * @return password
		 */
		public String getPassword() {
			return password;
		}
		/**
		 * 
		 * @param password
		 */
		public void setPassword(String password) {
			this.password = password+iBalance;
		}
		/**
		 * 
		 * @return customer shows customer ID
		 */
		public int getCustomerID() {
			return customerID;
		}
		/**
		 * 
		 * @param customerID prepare customer Id
		 */
		public void setCustomerID(int customerID) {
			this.customerID = customerID;
		}
		
		public String toString(){
			return "Customer name: "+getName()+"\tID: " +getCustomerID()+"\te_mail: "+getE_mail()+"\tDate of Birth: "+getDateOfBirth()+"\tStatus: "+getCustomerStatus();
		}
		
	  public static void showInfo(){
		/* for (int i = 0; i < customerList.size(); i++) {
				System.out.println(customerList.get(i));} */
	 }
	  /**
	   * 
	   * @param name shows customers name
	   * @param e_mail shows customers e mail
	   * @param dateofBirth shows customer date of birth
	   * @param iBalance is balance of customer
	   * @param pass is password of customer
	   */
	 public void showInfo(String name, String e_mail, int dateofBirth,int iBalance,String pass){
			//System.out.println("customer bilgileri "+  name+" "+e_mail +" "+ dateofBirth+" "+iBalance+" "+password);		
		}
	 /**
	  * 
	  * @return
	  */
	public String getCustomerStatus() {
		return customerStatus;
	}
	/**
	 * 
	 * @param customerStatus
	 */
	public void setCustomerStatus(String customerStatus) {
		this.customerStatus = customerStatus;
	}
	/**
	 * 
	 */
	public void depositMoney(){
		
	}
	/**
	 * 
	 */
	public void showCampaigns() {
		

		}
	/**
	 * 
	 */
	public void emptyCart() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * 
	 */
	public void order() {
		// TODO Auto-generated method stub
		
	}
		
	}
	 
