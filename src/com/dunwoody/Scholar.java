package com.dunwoody;

public class Scholar extends Resident {
		
	private float rent = 100;
	public String type = "scholar";
	
	public float getRent() {
		return rent;
	}
	
	public Scholar(String first, String last, int id, int room, int floor)
    {
		super(first, last, id, room, floor);
		
        this.first = first;
        this.last = last;
        this.id = id;
        this.room = room;
        this.floor = floor;
    }
	
	public void displayScholar() {
		System.out.printf("%s %s (%s) - id:%-6d room: %-2d floor: %-2d rent: $%.2f\n", first, last, type, id, room, floor, rent);
	}
}
