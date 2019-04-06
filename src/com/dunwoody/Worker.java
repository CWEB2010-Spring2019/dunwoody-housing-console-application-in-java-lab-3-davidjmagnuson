package com.dunwoody;

public class Worker extends Resident {
	
	public float rent; 
	
	public Worker(String first, String last, int id, int room, int floor)
    {
		super(first, last, id, room, floor);
		
        this.first = first;
        this.last = last;
        this.id = id;
        this.room = room;
        this.floor = floor;
        
        //this.hrsWorked = hrsWorked;
    }
	
	public float calcRent(float hrsWorked) {
		return rent = 1245 - (hrsWorked * 14);
	}
	
	public void displayWorker() {
		System.out.printf("%s %s - id:%-6d room: %-2d floor: %-2d rent: $%g", first, last, id, room, floor, rent);
	}
}