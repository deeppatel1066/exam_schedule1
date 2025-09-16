import java.util.Scanner;
class odd
{
	public static void main(String args[])
	{   
	    int a,b;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter value a:");
        a = input.nextInt();
		System.out.println("Enter value b:");
		b = input.nextInt();
		int c = a+b;
		System.out.println("Addition of a+b:"+c);
	}
}