package com.dunwoody;

public class Worker extends Resident {
	
	public float hrsWorked;
	
	public float rent = 1245 - (hrsWorked * 14);
	
	public Worker(String first, String last, int id, int room, int floor, float hrsWorked)
    {
		super(first, last, id, room, floor);
		
        this.first = first;
        this.last = last;
        this.id = id;
        this.room = room;
        this.floor = floor;
        
        this.hrsWorked = hrsWorked;
    }
	

}