package task22sept;
import java.util.Scanner;
public class SplitMethod {
	
	public static String wordReverse(String inputString) {
		String[] word=inputString.split("\\s");
		String outputString=" ";
		for(int i=word.length -1; i>=0; i--) {
			outputString=outputString+word[i]+ " ";
		}
		return outputString;
	}
	public static void main(String args[]) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a String");
    String inputString=s.nextLine();
    String outputString=wordReverse(inputString);

    System.out.println("output String : "+outputString);
	}

}
