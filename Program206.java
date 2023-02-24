// Java program to find the ASCII value of a character
import java.util.*;
public class Program206
{  
public static void main(String[] args)
    {
	char ch;
	Scanner sc = new Scanner(System.in);
	ch = sc.next().charAt(0);
	int ascii = (int) ch;
	System.out.println("ASCII of " + ch + " is " + ascii);   // Prints the ASCII value of the input character
	}
}
