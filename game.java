package game;
import java.util.Random;
import java.util.Scanner;

public class game {
	
	
	public static void start()
	{
		System.out.println("New game: press 1");
		System.out.println("Exit: press 2");
		Scanner game = new Scanner(System.in);
		int g = game.nextInt();
		
		switch (g)
		{
		
		case 1: 
			gra();
		case 2:
			System.exit(0);
			default: gra();
			
		}	
		
	}
	
	
	
	public static void gra()
	{
		System.out.println("Find out number from 1 to 36:");
		
		
		Random rand = new Random();
		int ukryta = rand.nextInt((36-1)+1)+1;
		//System.out.println(ukryta);
		
		
		
		Scanner skan = new Scanner(System.in);
		
		
		while (true)
		{
			int liczba = skan.nextInt();
			if(ukryta == liczba)
				break;
			if (liczba > ukryta)
				System.out.println("Too high");
			else if (liczba < ukryta)
				System.out.println("Too low");
		}
		
			
			System.out.println("You sexi teen lover you win:" + ukryta + "\n \n");
			start();
		
	}


	
	

	
	
	public static void main (String[] args)
{
	start();
		

}








}
