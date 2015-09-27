import java.util.Scanner;


public class UnitConversion {

	public static void main(String[] args)
	{	
	double meterToInch = 39.3701;
	double meters;
	double inches1;
	int feet;
	int inches2;
	
	Scanner kb=new Scanner(System.in);
	System.out.println( "Enter the number of meters:");
	meters=kb.nextDouble();
	inches1 = (meters)*meterToInch;
	System.out.println(meters +"=" + inches1 '"');
	feet = inches1 / 12;
	inches2 = (int)inches1 % 12;
	System.out.println( inches1 + "=" +feet + "'" + inches2 + '"');
	
	
} //main
}


