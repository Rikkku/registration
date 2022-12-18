package Registration;
import java.util.Scanner;
import java.util.Arrays;
public class New_registration {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		int options = 2;
		int looping = 0;
		String[] IDNumber =  new String[1000000];
		String[] FirstName = new String[1000000];
		String[] MiddleName = new String[1000000];
		String[] LastName = new String[1000000];
		
		
		do{
			System.out.println("Please Pick from 2 options");
			System.out.println("1. Register");
			System.out.println("2. Look for Student");
			looping++;
		options = input.nextInt();
		
		
		switch(options) {
		//register
		case 1:
		
		for(int INPid = 1; INPid < 5; INPid++) {
			for(int UTPid = 1; UTPid == INPid + 1; UTPid++){
		System.out.println("Please input Student ID");
		IDNumber[INPid] = input.next();
			}
			break;
		}
		break;
		
		
		
		
		
		//Look for Student
		case 2:
		
			
			System.out.println(Arrays.deepToString(IDNumber));
			
			
		//	for(int prStudent = 1; IDNumber.length >= prStudent + 1; prStudent++) {
		//System.out.println("Printing index " + IDNumber[prStudent]);
		//int a = input.nextInt();
		//break;
			//}
		//break;
		
		
		default:
		System.out.println("Input number is out of range");
		break;
		}
		
		}while(looping < 1000000);
		
		
		

	}

}
