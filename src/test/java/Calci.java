import java.util.Scanner;

public class Calci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,cal,choice;
		Scanner s1= new Scanner(System.in);
		System.out.println("enter the two no");
		a=s1.nextInt();
		b=s1.nextInt();
		System.out.println("enter operation you want to do");
		choice=s1.nextInt();
		if (choice==1)
		{
			cal=a+b;
			System.out.println("sum of two no is " + cal);
		}
		else if (choice==2)
		{
			cal=a-b;
			System.out.println("sub of two no is " + cal);
		}
		else if (choice==3)
		{
			cal=a*b;
			System.out.println("mul of two no is " + cal);
		}
		else if (choice==4)
		{
			cal=a/b;
			System.out.println("div of two no is " + cal);
		}
		else {
			System.out.println("Inavalid Input");
		}
		
	}

}
