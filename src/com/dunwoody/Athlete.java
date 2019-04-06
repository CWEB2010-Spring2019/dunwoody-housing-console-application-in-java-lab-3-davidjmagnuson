package com.dunwoody;


public class Athlete extends Resident {
	
	private float rent = 1200;
	
	public float getRent() {
		return rent;
	}
	
	public Athlete(String first, String last, int id, int room, int floor)
    {
		super(first, last, id, room, floor);
		
        this.first = first;
        this.last = last;
        this.id = id;
        this.room = room;
        this.floor = floor;
    }
	
	public void displayAthlete() {
		System.out.printf("%s %s - id:%-6d room: %-2d floor: %-2d rent: $%g", first, last, id, room, floor, rent);
	}
}
