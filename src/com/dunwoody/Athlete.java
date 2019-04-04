package com.dunwoody;

public class Athlete extends Resident {
	
	public float rent = 1200;
	
	public Athlete(String first, String last, int id, int room, int floor)
    {
		super(first, last, id, room, floor);
		
        this.first = first;
        this.last = last;
        this.id = id;
        this.room = room;
        this.floor = floor;
    }

}
