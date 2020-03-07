import java.io.*;

public class essential_binary_fixer{

/* HELLO, I am glad to see you are following 
 * my game, go ahead and hard code the incorrect binary link give to you on facebook
 * to convert into the 
 * correct binary representation of the link
 */
 
 
 // HINT AFTER RUNNING THIS PROGRAM THE BINARY MUST BE CONVERTED INTO A STRING
 // AFTER RUNNING CHECK output.txt FOR THE CORRECT BINARY 
 
	public static void main(String [] args) throws IOException{
	
		String incorrectBinary = ; //set this variable to the incorrect binary
		String correctBinary = "";
		for(int i =0 ; i < incorrectBinary.length(); i++){
		
			if(incorrectBinary.charAt(i) == '0'){
				correctBinary = correctBinary+ "1";
			}
			
			else if(incorrectBinary.charAt(i) == '1'){
				correctBinary = correctBinary+ "0";
			}
			
			else if (incorrectBinary.charAt(i) == ' '){
				correctBinary = correctBinary + " ";
			}
			
		}
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))){
				writer.write(correctBinary);
		}
		
		catch(Exception e){
			System.out.println("Oops something went wrong");
		}
	}
}