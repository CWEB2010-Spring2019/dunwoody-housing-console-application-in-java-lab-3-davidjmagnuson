package com.dunwoody;

public class Scholar extends Resident {
	
	public float rent = 100;
	
	public Scholar(String first, String last, int id, int room, int floor)
    {
		super(first, last, id, room, floor);
		
        this.first = first;
        this.last = last;
        this.id = id;
        this.room = room;
        this.floor = floor;
    }

}
