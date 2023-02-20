package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StartGame {
	
	
	private int gameFlag=10;
	

	public void beginGame( List<Player> playerList,char[] gameboard)
	{
		System.out.println("Entering beginGame method");
		if(playerList.size()!=0)
		{
			
			for(int i=0;i<playerList.size();i++)
			{
				Player p = playerList.get(i);
				System.out.print(p);
			}
			
		/*
			Player p;
			p.setPosition(position);
			if()
			{
				p.setPosition(position);
				p.setScore(score);
			}
			else
			{
				//subract the score with 5
				p.setPosition(position);
				int setScore = p.getScore()-5;
				p.setScore(setScore);
			}
			
			p.setScore(score);
			startwithPlayer(p);
			*/
		}
		else
		{
			System.out.println("Playerlist not set.");
		}
		
		
		System.out.println("Exiting beginGame method");
		
	}
	
	public void startwithPlayer(Player p)
	{
		int diceValue = rollDice();
		System.out.printf("Your dice value is :%d ", diceValue);
		
		
	}
	
	public void scoreCalculator()
	{
		
	}
	public int rollDice()
	{
		int min=1;
		int max=6;
		int number = getRandomNumberUsingNextInt(min,max);
		return number;
	}
	
	public int getRandomNumberUsingNextInt(int min, int max) {
	    Random random = new Random();
	    return random.nextInt(max - min) + min;
	}


}
