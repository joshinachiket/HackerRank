package Arrays;

import java.util.Scanner;

public class Arrays_DS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		
		int [] myArray = new int[size];
		
		for (int i=0;i<size;i++) {
			myArray[i] = input.nextInt();
		}
		
		System.out.println(size);
		
		for(int i=0;i<size;i++) {
			System.out.print(myArray[i] + " ");
		}
		
		System.out.println();;
		
		for(int i=size-1;i>=0;i--) {
			System.out.print(myArray[i] + " ");
		}
		
		

	}

}
