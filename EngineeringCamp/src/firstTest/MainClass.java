package firstTest;

import java.util.Scanner;
	
public class MainClass {
	static Lead [] leadDetail;
	static Team[] teamDetail;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		boolean flag1=true;
		do {
			System.out.println("1. for add Team Details");
			System.out.println("2. for show Lead by campusmind name");
			System.out.println("3. for all detail by lead name");
			System.out.println("4. for exit");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				if(flag1) {
				addLeadDetail(sc);
				}
				else {
					System.out.println("You can add only one time");
				}
				break;
			case 2:
				System.out.println("Enter the name of the campus mind");
				
				sc.nextLine();
				String name=sc.nextLine();
				showLeadDetail(name);
				break;
				
			case 3:
				System.out.println("Enter the name of the Lead");
				
				sc.nextLine();
				String leadName=sc.nextLine();
				showDetail(leadName);
				break;
				
			case 4:
				flag=false;
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			
		}while(flag);

	}
	public static void addLeadDetail(Scanner sc) {
		System.out.println("Enter the no of Team");
		int n=sc.nextInt();
		leadDetail=new Lead[n];
		teamDetail=new Team[n];
		for(int i=0;i<n;i++) {
			teamDetail[i]=new Team();
			System.out.println("Enter the Id of the Team");
			teamDetail[i].setTeamId(sc.nextInt());
			System.out.println("Enter the Track of the team");
			sc.nextLine();
			teamDetail[i].setTeamTrack(sc.nextLine());

			leadDetail[i]=new Lead();
			System.out.println("Enter the Id of the Lead");
			leadDetail[i].setLeadId(sc.nextInt());
			System.out.println("Enter the Name of the Lead");
			sc.nextLine();
			leadDetail[i].setName(sc.nextLine());
			System.out.println("Enter the no of campusMinds");
			int number=sc.nextInt();
			String minds[]=new String[number];
			sc.nextLine();
			System.out.println("Entert Campus mind name");
			for(int k=0;k<number;k++) {
				minds[k]=sc.nextLine();
			}
			
			leadDetail[i].setCampusMindName(minds);
			teamDetail[i].setLead(leadDetail[i]);
			
			
		}
		
	}

	
	public static void showLeadDetail(String name) {
		for(int i=0;i<leadDetail.length;i++) {
			for(int j=0;j<leadDetail[i].getCampusMindName().length;j++) {
				String arr[]=leadDetail[i].getCampusMindName();
				if(name.equals(arr[j])){
					System.out.println("Lead Id : "+leadDetail[i].getLeadId());
					System.out.println("Lead name : "+leadDetail[i].getName());
					break;
				}
			}
		}
		
	}
	
	public static void showDetail(String leadName) {
		for(int i=0;i<leadDetail.length;i++) {
			if(leadDetail[i].getName().equals(leadName)) {
				System.out.println(" Lead Id :"+leadDetail[i].getLeadId());
				System.out.println(" Lead Name :"+leadDetail[i].getName());
				System.out.println(" Team Id :"+teamDetail[i].getTeamId());
				System.out.println(" Team Track : "+teamDetail[i].getTeamTrack());
				String []arr=leadDetail[i].getCampusMindName();
				System.out.println("--Campus Minds are--");
				for(int j=0;j<arr.length;j++) {
					System.out.println(arr[j]);
				}
				
			}
		}
	}

}
