import java.util.*;
public class Program202a {
static boolean isEven(int n)
{ 
if (n%2==0) 
	{return true;}
else 
	{return false;}
}
public static void main (String[] args)
{
Scanner sc = new Scanner(System.in);
int n;
System.out.println("Enter the number :");
n = sc.nextInt();
if(isEven(n))
System.out.print("Even\n");
else
System.out.print("Odd\n");
}
}
