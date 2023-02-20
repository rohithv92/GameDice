package src;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class MyTest {
	
	static ArrayList<Player> playerList;
	static HashMap<String, Player> playerDetails ;
	
	public static void main(String args[])
	{
		char[] intArray = {'1', '2', '0', '0', '9','1', '7', '0', '0', '0','5','6','2','4','6','1','0','7','4','1','1', '2', '0', '0', '9','1', '7', '0', '0', '0','5','6','2','4','6','1','0','7','4','1'};
		
		int s = intArray.length;
		
		System.out.println("Your array list is ready!!");
		System.out.println(intArray);
		System.out.printf("Size of array : %d ",s);
		//System.out.println(intArray[5]);
		//int x = Integer.parseInt(String.valueOf(intArray[5]));
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to my game");
		
		int noOfPlayers;
		do {
			System.out.println("Enter the number of players");
		    while (!sc.hasNextInt()) {
		        System.out.println("That's not a number!");
		        System.out.println("Enter the number of players");
		        sc.next(); // this is important!
		    }
		    noOfPlayers = sc.nextInt();
		} while (noOfPlayers <= 0);
		
		System.out.println("Thank you! No of players set to :  " + noOfPlayers);
		playerList = new ArrayList<Player>();
		playerDetails = new HashMap<String, Player>();
		for(int i=1;i<=noOfPlayers;i++)
		{
			int id;
			String name = null;
			Scanner nameSC = new Scanner(System.in);
			System.out.printf("Enter Player %d name",i);
			name = nameSC.nextLine();
			Player p = new Player(i, name);
			playerList.add(p);
			playerDetails.put(name, p);
			
		}
		
		System.out.print(playerDetails);
		System.out.println("Players ready!!!");
		System.out.println(playerList.toString());
		
		StartGame myGame = new StartGame();
		myGame.beginGame(playerList,intArray);
		
			
	}

	
	

}
