
public class ReplaceArray {
	public static void main(String[] args) 
	   {
	      String string = "Welcome to Sonata Software";    //Input String
	      System.out.println("Input String : "+string);   //Displaying Input String
	      string = string.replaceAll("[AaEeIiOoUu]", "$");  //Replace vowels with star
	      System.out.println(string);    //Display the word after replacement
	      
	   }
}