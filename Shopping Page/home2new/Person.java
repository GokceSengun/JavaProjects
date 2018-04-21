package home2new;

import java.util.Date;
/**
 * 
 * @author GÖKÇE
 *
 */
class Person{ 
	//properties
	private String name;
	private String e_mail;
	private String dateOfBirth;
	//default constructor
	/**
	 * default constructor
	 */
	public Person(){
		this.setName("no name");//this.name="no name ";
		this.setE_mail("no email");
		this.setDateOfBirth("no dateofBirth");		
	}
	//constructors
	/**
	 * 
	 * @param nameP is people name
	 * @param e_mailP is e mail people e mail
	 * @param dateOfBirthP is people date of birth
	 */
	public Person(String nameP , String e_mailP, String dateOfBirthP){
		this.setName(nameP);  // this.name=nameP;
		this.setE_mail(e_mailP);
		this.setDateOfBirth(dateOfBirthP); 	
	}
	/**
	 * 
	 * @param p object of person
	 */
	public Person(Person p){
		this.setName(p.getName());  // this.name=p.name;
		this.setE_mail(p.getE_mail());
		this.setDateOfBirth(p.getDateOfBirth());
	}
	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name prepare name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @return e mail
	 */
	public String getE_mail() {
		return e_mail;
	}
	/**
	 * 
	 * @param e_mail prepare e mail
	 */
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	/**
	 * 
	 * @return date of birth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * 
	 * @param dateOfBirth  set date of birth
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * display persons datas
	 */
	public String toString(){
		return "\tPerson name: "+getName() +" e_mail: "+getE_mail()+" date of birth: "+getDateOfBirth();
	}

		/**
		 * 
		 * @param name  people have name
		 * @param e_mail people have e mail
		 * @param date people have date of birth
		 * @param balance people have balance
		 */
	void Person(String name,String e_mail,String date,int balance){
		
	}
	
}