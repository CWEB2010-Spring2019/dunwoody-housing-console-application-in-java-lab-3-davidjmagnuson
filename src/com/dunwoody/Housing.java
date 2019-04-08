package com.dunwoody;

import java.util.*;

public class Housing {
		static Scanner user = new Scanner(System.in);
		
		public static ArrayList<Worker> workerList = new ArrayList<Worker>();
		public static ArrayList<Scholar> scholarList = new ArrayList<Scholar>();
		public static ArrayList<Athlete> athleteList = new ArrayList<Athlete>();
		static int choice;
		
	public static void main(String[] args) {
		//greeting message
		System.out.println("Welcome to the Dunwoody Housing App !\n");
		newOrSee();
		
		do {
		choice = user.nextInt();
		if(choice == 1) {
			//another resident or display
			newResident();
		}else if(choice == 2) {
			//displaying the residents
			displayAll();
		}
		}while (choice != 3);
		System.out.println("\nThanks for using the Dunwoody Housing App !");
	}

	public static void newOrSee() {
		System.out.println("Enter '1' to add a new resident, '2' to see all residents, or '3' to exit");
	}

	public static void newResident() {
		//determining resident type
		System.out.println("Enter '1' if Resident is a worker, '2' if athlete or '3' if scholar");
		int resType = user.nextInt();
		
		//getting resident information from user
        System.out.println("Enter Residents first name");
        String fName = user.next();
		System.out.println("Enter Residents last name");
		String lName = user.next();
		
		//creating residents based on resident type
		Random random = new Random();
		int id = random.nextInt(999999);
		if(resType == 1) {
			System.out.println("Enter Residents number of hours worked");
			float hrsWork = user.nextFloat();
			System.out.println("Enter Residents floor number (1-3)");
			int floorNum = user.nextInt();
			System.out.println("Enter Residents room number");
			int roomNum = user.nextInt();
			Worker aWorker = new Worker(fName, lName, id, roomNum, floorNum);
			aWorker.calcRent(hrsWork);
			workerList.add(aWorker);
			System.out.println("\nYou just added " + aWorker.first + "!");
			aWorker.displayWorker();
		} else if(resType == 2) {
			System.out.println("Enter Residents floor number (4-6)");
			int floorNum = user.nextInt();
			System.out.println("Enter Residents room number");
			int roomNum = user.nextInt();
			Athlete aAthlete = new Athlete(fName, lName, id, roomNum, floorNum);
			athleteList.add(aAthlete);
			System.out.println("\nYou just added " + aAthlete.first + "!");
			aAthlete.displayAthlete();
		}else if(resType == 3) {
			System.out.println("Enter Residents floor number (7 or 8)");
			int floorNum = user.nextInt();
			System.out.println("Enter Residents room number");
			int roomNum = user.nextInt();
			Scholar aScholar = new Scholar(fName, lName, id, roomNum, floorNum);
			scholarList.add(aScholar);
			System.out.println("\nYou just added " + aScholar.first + "!");
			aScholar.displayScholar();
		}else {}
		System.out.println("");
		newOrSee();
	}
	
	public static void displayAll() {
		workerList.forEach((worker) -> worker.displayWorker());
		athleteList.forEach((athlete) -> athlete.displayAthlete());
		scholarList.forEach((scholar) -> scholar.displayScholar());
		System.out.println("");
		newOrSee();
	}
}