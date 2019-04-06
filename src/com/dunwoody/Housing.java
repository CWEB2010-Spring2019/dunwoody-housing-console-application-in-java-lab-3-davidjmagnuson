package com.dunwoody;

import java.util.*;

public class Housing {
		static Scanner user = new Scanner(System.in);
		
		public static ArrayList<Worker> workerList = new ArrayList<Worker>();
		public static ArrayList<Scholar> scholarList = new ArrayList<Scholar>();
		public static ArrayList<Athlete> athleteList = new ArrayList<Athlete>();
		
	public static void main(String[] args) {
		//greeting message
		System.out.println("Welcome to the Dunwoody Housing App !\n");
		System.out.println("Enter '1' to add a new Resident or '2' to see all residents");
		int choice = user.nextInt();
		
		if(choice == 1) {
		//creating the resident
		newResident();
		//another resident or display
		System.out.println("Enter '1' to add another resident or '2' to see all residents");
		int decide = user.nextInt();
			if(decide == 1) {
				newResident();
			}else if(decide == 2) {
				displayAll();
			}else {}
		}else if(choice == 2) {
		//displaying the residents
		displayAll();
		}
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
		System.out.println("Enter Residents room number");
		int roomNum = user.nextInt();
		System.out.println("Enter Residents floor number");
		int floorNum = user.nextInt();
		
		//creating residents based on resident type
		Random random = new Random();
		int id = random.nextInt(999999);
		if(resType == 1) {
			System.out.println("Enter Residents number of hours worked");
			float hrsWork = user.nextFloat();
			Worker aWorker = new Worker(fName, lName, id, roomNum, floorNum);
			aWorker.calcRent(hrsWork);
			workerList.add(aWorker);	
		} else if(resType == 2) {
			Athlete aAthlete = new Athlete(fName, lName, id, roomNum, floorNum);
			athleteList.add(aAthlete);
		}else if(resType == 3) {
			Scholar aScholar = new Scholar(fName, lName, id, roomNum, floorNum);
			scholarList.add(aScholar);
		}else {}	
	}
	
	public static void displayAll() {
		workerList.forEach((worker) -> worker.displayWorker());
		athleteList.forEach((athlete) -> athlete.displayAthlete());
		scholarList.forEach((scholar) -> scholar.displayScholar());
	}
}