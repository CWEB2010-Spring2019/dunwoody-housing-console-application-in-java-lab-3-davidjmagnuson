package com.dunwoody;

public abstract class Resident {
	
	protected String first;
	protected String last;
	protected int id;
	protected int room;
	protected int floor;
	protected float rent;

    public Resident(String first, String last, int id, int room, int floor)
    {
        this.first = first;
        this.last = last;
        this.id = id;
        this.room = room;
        this.floor = floor;
    }
    
    

}
