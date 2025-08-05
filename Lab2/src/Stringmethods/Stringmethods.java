package Stringmethods;
import java.util.Scanner;
public class Stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the string");
     String input =s.nextLine();
     System.out.println("Character at position :" + input.charAt(1));
     System.out.println("Length of string :" +input.length());
     System.out.println("String in upperCase :" +input.toUpperCase());
     System.out.println("String in lowerCase :" +input.toLowerCase());
     System.out.println("Subsstring from index 2 to 6:" +input.substring(2,6));
     System.out.println("Enter the word");
     String searchWord=s.nextLine();
     if(input.contains(searchWord)){
    	 System.out.println("The string contains '" +searchWord+ "'");
     }
     else {
    	 System.out.println("The string doesnot contains '"+searchWord+ "'");
    			 
    	 
    	 
     }
     s.close();
	}
}
