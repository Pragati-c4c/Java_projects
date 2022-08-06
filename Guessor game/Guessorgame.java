



import java.util.*;



class Guesser
{
	public static int numinRange(int Num) {
		Scanner scan=new Scanner(System.in);
		int n=3;
		while(n>0)
			{
				if(Num<0||Num>10)
				{
					System.out.println("Please guess number from 1 to 10");
					Num=scan.nextInt();
					n--;
					if(Num>0&&Num<=10)
						//break;
						return Num;
					
					else if(n>0)
					{
					    System.out.println(n+" "+"attempts left");
					    scan.nextLine();
					}
					else 
						{
						System.out.println("Start game again!");
						 guessNumber();
						}
					
				}
				
			}
		
		return Num;
	}
	static int guessNum;
	
	public static int guessNumber()
	{
		Scanner scan=new Scanner(System.in);
		
		int n=3;
		System.out.println("Guesser kindly guess the number from 1 to 10");
		guessNum=scan.nextInt();
		if(guessNum>0&&guessNum<=10)
		{
			
			return guessNum;
		}
		else{
			guessNum=numinRange(guessNum);
		}

		
		     
		return guessNum;	
		
	}	

}

class Player
{
	int pguessNum;
	
	public int guessNumber()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player kindly guess the number from 1 to 10");
		pguessNum=scan.nextInt();
		if(pguessNum>0&&pguessNum<=10)
		{
			
			return pguessNum;
		}
		else{
			pguessNum=Guesser.numinRange(pguessNum);
		}
		return pguessNum;
	}
}

class Umpire
{
	
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	
	public void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNumber();
		
	}
	
	
	public void collectNumFromPlayer()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		
		numFromPlayer1=p1.guessNumber();
		numFromPlayer2=p2.guessNumber();
		numFromPlayer3=p3.guessNumber();
	}
	
	void compare()
	{
		
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("Game tied all three players guessed correctly");
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("Player 1 and Player2 won the game");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 and Player3 won ");
			}
			else
			{
			
			System.out.println("Player 1 won the game");
			}
		}
		
		
		else if(numFromGuesser==numFromPlayer2)
		{
			
			if(numFromGuesser==numFromPlayer3)
			{
			System.out.println("Player 2 and Player3 won the game");
			}
			else
			{
				System.out.println("Player 2 won the game");
			}
		}
		
		
		
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost! try again");
		}
	}
	
}





public class Guessorgame {

	public static void main(String[] args) {
		
		
		
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();

	}

}








