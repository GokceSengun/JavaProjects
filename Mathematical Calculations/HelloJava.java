import java.io.*;											//it is for math methods
import java.io.FileNotFoundException;						//it is for reading error
import java.util.Scanner; 									// it is for read file
public class HelloJava {
	
 public static void main(String[] args) { 
   try {
	   Scanner input = new Scanner(new File("inputs.txt")); 
	   while(input.hasNextLine()){
		   String[] list =input.nextLine().split(" ");        // i read my input and i splited these datas
		   if(list[0].equals("IntegrateReimann")){
			   String a =list[2];                             // i identified 3 rd elemnet of the list as "a"
			   String b =list[3];							  // i identified 3 rd elemnet of the list as "b"
			   String c =list[4];							  // i identified 3 rd elemnet of the list as "c"
			   Double number1=(Double.parseDouble(a));		  // i converted a string to double
			   Double number2=(Double.parseDouble(b));
			   int number3=(Integer.parseInt(c));
			   if(list[1].equals("Func1")){		              // i converted a string to integer 
				   func1(number1,number2,number3);			  // it calls to function1 for integratereimann		   
			     }
			   if(list[1].equals("Func2")){		   
				   func2(number1,number2,number3);			  // it calls to function2 for integratereimann 
			     }
			   if(list[1].equals("Func3")){
				   Double number4=(Double.parseDouble(c));
				   func3(number1,number2,number4);			  // it calls to function3 for integratereimann 	   
			     }		   
		   }
		   	   if(list[0].equals("Arcsinh")){
			   String num= list[1];
			   Double number=(Double.parseDouble(num));
			   maclaurin(number);			   			      //it calls to maclaurin function for appromiximation arcsinh(x)
		         }
		       if(list[0].equals("Armstrong")){
			   String dig= list[1];
			   int number=(Integer.parseInt(dig));
			   printAll(number);			                  //it calls to armstrong function 
		        }		   	
      }			      
		input.close();
      }   
   catch (FileNotFoundException ex) {                        // if can not find file ,it errors
    	System.out.println("No File Found!");
    	return;    								}
   catch (ArrayIndexOutOfBoundsException ex ){        
	   System.out.println("No argument acceseses!");
	   return;
   }   
 } 
 public static void maclaurin(double value){
	    double function = 0;
	    double x =value;									// i assigned value as x
	    
	    for (int n = 0; n < 31; n++) {                      // it limited infinity number till 30
	        function += (Math.pow(-1,n)*factorial(2*n)*Math.pow(x,2*n+1))/(Math.pow(4,n)*Math.pow(factorial(n),2)*(2*n+1));	     //it is arcsin formula  
	     }
	    	System.out.println("Arcsinh " + x + " Result: " + function);	   
	}
 public static int factorial(int fact) {                    // function of factorial calculates factorial 
	    if(fact== 1 || fact==0)								// if value equal to 1 or 0, use that value
	        return 1;
	    int result =fact*factorial(fact-1);					// it is recursive 
	    return result;
	} 
 public static void printAll(int end) {
     System.out.print("Armstrong " + end+" ");
     System.out.print("Result: ");
     int digitnum=end;	    	
	    	 for(int i=0;i<= (Math.pow(10, (digitnum+1)-1)) ;i++){ //if my input is how many digit is, it finds armstrong number of till that digit 
	    		  if (isArmstrong(i)) {	        	   			   // if my numbers give input in isArmstrong function
		               System.out.print(i+" ");
		           }	    	   
     }	    	    	 
}
 public static boolean isArmstrong(int input) {		      // it calculates armstrong numbers
	 String inputasString= input +"";		     
	 int numberOfDigit=inputasString.length();            // it calcultes how many digit have
	 int copyOfInput=input;
	 int c=0,a; 
	 while(copyOfInput!=0) {  
	    	a=copyOfInput%10;							 // a is mod of input
	    	c=c+(int)Math.pow(a ,numberOfDigit);         // it calculates power that how many digit have of each number
	    	copyOfInput=copyOfInput/10;  		    	 
	    }  
	    if(c==input)  
	    	return true;
	    else  
	        return false; 
	   } 
 public static void func1(double a, double b, int n){     //it calculates function1 for reimann
 	  double width = (b - a) / n;					      // it is middle reimann sum
 	  double sum = 0.0;
 	  for (int i = 0; i < n; i++) {
 		    double x=a + (width / 2.0) + i * width;      // it is middle reimann 
 		    sum += (x*x-x+3);
 		    }
 		    System.out.println("IntegrateReimann Func1 "+a+" "+b+" "+n+" "+"Result "+(sum*width));
 		}
 public static void func2(double a, double b, int n){     //it calculates function2 for reimann
 		    double width = (b - a) / n;                   // it is middle reimann sum
 		    double sum = 0.0;
 		    for (int i = 0; i < n; i++) {
 		    	double x=a + (width / 2.0) + i * width;
 		        sum = sum + (Math.pow((3*Math.sin(x))-4,2));         
 		    }
 		    System.out.println("IntegrateReimann Func2 "+a+" "+b+" "+n+" "+"Result "+(sum*width));
 		}	
 public static void func3(double a, double b, double n){  //it calculates function3 for reimann
 		    double width = (b - a) / n;					  // it is middle reimann sum
 		    double sum = 0.0;
 		    for (int i = 0; i < n; i++) {
 		    	double x=a + (width / 2.0) + i * width;	  
 		    	for(int g = 0; g < 31; g++)	{
 		    	sum = sum + (Math.pow(-1,g)*factorial(2*g)*Math.pow(x,2*g+1))/(Math.pow(4,g)*Math.pow(factorial(g),2)*(2*g+1)); //it calculates arcsin formula
 		    	}
 		    }
 		    System.out.println("IntegrateReimann Func3 "+a+" "+b+" "+n+" "+"Result "+(sum*width));  
 		}	
}
