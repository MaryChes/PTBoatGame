package com.ssa.boat;

public class PTBoatGame 
{
	
	private  PTBoat[] boats = new PTBoat[6];
	private int numberOfBoats = 0;
	
	public void addBoat(int location)
	{
		boats[numberOfBoats] = new PTBoat(location);
		numberOfBoats++;
	}
	public boolean guess(int location)
	{
		for(int i = 0; i < boats.length; i++) 
		{
			if(boats[i].location==location)
			{
				System.out.println("We got a hit at " + location);
				return true;
			}
		}
		System.out.println("We missed at " + location);
		return false;
	}
	public static void main(String[] args) 
	{
		PTBoatGame game1 = new PTBoatGame();
		game1.addBoat(4);
		game1.addBoat(13);
		game1.addBoat(25);
		game1.addBoat(7);
		game1.addBoat(45);
		game1.addBoat(81);
		
		game1.guess(2);
		game1.guess(13);
		game1.guess(56);
		game1.guess(7);
		game1.guess(89);
		game1.guess(23);
	}
}
