package com.dunwoody;

import java.util.ArrayList;
import java.util.Scanner;

public class Housing {
	
		ArrayList<Resident> resList = new ArrayList<Resident>();
		
		static Scanner user = new Scanner(System.in);
		
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Dunwoody Housing App !\n");
		System.out.println("Press 'Enter' to add a new Resident");
		
		newResident();

		
	}
	
	public static void newResident() {
		System.out.println("Enter '1' if Resident is a worker, '2' if athlete or '3' if scholar");
		int resType = user.nextInt();
		System.out.println("Enter Residents first name");
		String fName = user.nextLine();
		System.out.println("Enter Residents last name");
		String lName = user.nextLine();
		System.out.println("Enter Residents id number");
		int idNum = user.nextInt();
		System.out.println("Enter Residents room number");
		int roomNum = user.nextInt();
		System.out.println("Enter Residents floor number");
		int floorNum = user.nextInt();
		
		if(resType == 1) {
			System.out.println("Enter Residents number of hours worked");
			float hrsWork = user.nextFloat();
			
			
			Worker aWorker = new Worker(fName, lName, idNum, roomNum, floorNum, hrsWork);
		} else if(resType == 2) {
			
			
		}else if(resType == 3) {
			
			
		}else {}
	}

}
