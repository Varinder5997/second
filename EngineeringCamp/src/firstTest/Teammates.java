package firstTest;

import java.util.Scanner;

public class Teammates extends Lead{
	static String [] teamMates= {"M Chandana","Kmnidhi Upadhyay","Pooja Patil","Shubham Pandey",
		"Varinder Singh","Jatin Chadha","Sidhanshu Mahajan","Amara Anudeep","Maruti Mangrani",
		"Parasa Surendra"};
	public static void main(String[] args) {
		Teammates t=new Teammates();
		int b=t.a;
		System.out.println(b);
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		do {
			System.out.println("1. for create and show teammates");
			System.out.println("2. for all names in sorted");
			System.out.println("3. for sort all name at even position");
			System.out.println("4. for search for position");
			System.out.println("5. for exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				
				showTeamMates();
				break;
				
			case 2:
				String[] sortedNames=bubblesort();
				displaySortedName(sortedNames);
				break;
			case 3:
				String[] sortedEvenNames=sortedAtEvenPlace();
				displaySorted(sortedEvenNames);
				break;
				
			case 4:
				System.out.println("ENter the position for find name");
				int position =sc.nextInt();
				nameByPosition(position);
				break;
				
			case 5:
				flag=false;
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			
		}while(flag);


	}

	
	public static void showTeamMates() {
		System.out.println("------Team mates Are-----");
		for(int i=0;i<teamMates.length;i++) {
			System.out.println(teamMates[i]);
		}
	}
	
	public static String [] bubblesort() {
		String []sortedNames=teamMates;
		for(int i=0;i<sortedNames.length;i++) {
			for(int j=0;j<sortedNames.length;j++) {
				if(sortedNames[i].compareTo(sortedNames[j])<0) {
					String temp=sortedNames[i];
					sortedNames[i]=sortedNames[j];
					sortedNames[j]=temp;
				}
			}
		}
		
		
		return sortedNames;
	}
	public static void displaySortedName(String[] sortedNames) {
		for(int i=0;i<sortedNames.length;i++) {
			System.out.println(sortedNames[i]);
		}
		
	}
	
	public static void nameByPosition(int position) {
		if(position<0 && position>teamMates.length) {
			System.out.println("Invalid position");
		}
		else {
		System.out.println(teamMates[position]);
	}
	}
	
	public static String[] sortedAtEvenPlace() {
		String []sorted=new String [teamMates.length/2];
		int count=0;
		for(int i=0;i<teamMates.length;i++) {
			if(i%2==0) {
				sorted[count]=teamMates[i];
				count++;
			}
		}
		for(int i=0;i<sorted.length;i++) {
			for(int j=0;j<sorted.length;j++) {
				if(sorted[i].compareTo(sorted[j])<0) {
					String temp=sorted[i];
					sorted[i]=sorted[j];
					sorted[j]=temp;
				}
			}
		}
		
		
		return sorted;
		
	}
	public static void displaySorted(String [] sortEvenNames) {
		for(int i=0;i< sortEvenNames.length;i++) {
			System.out.println( sortEvenNames[i]);
		}
	}
}
