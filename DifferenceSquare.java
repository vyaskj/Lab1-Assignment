import java.util.*;
public class DifferenceSquare {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		sc.close();
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int result=calculateDifference(num);
		System.out.println("Total Differnce is "+result);
	}

	private static int calculateDifference(int n) {
		int sum=0,sumNatural=0,sumSquare=0;
		int sumNaturalSquare ;
		//-------Sum of the squares of the first n natural numbers---
		for(int i=1;i<=n;i++) {
			sumNatural+=i;
		}
		sumNaturalSquare=sumNatural*sumNatural; //square of sum natural number
		
		//-----sum of the squares----
		for(int i=1;i<=n;i++) {
			sumSquare+=i*i;
		}
		sum=sumSquare-sumNaturalSquare;
		return sum;
	}
}