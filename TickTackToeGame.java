package CS121;

import java.util.Scanner;

public class TickTackToeGame {
	
//using a public static scanner this time around so my method can use it too.
public static Scanner scanner = new Scanner(System.in);
public static int turn = 1;
	public static void main(String[] args) {
	//declaring variables
		String enter = "";
		boolean flag = true;
		int currentMove = 0;
		int input = 0;
		int[][] t = new int[4][4];
		
		
		
		//start of main loop
		do 
		{
		
			cls();
			reset(t);
			title("Game Menu");
			display(t);
			
			
			System.out.println("1 - Play Tic Tac Toe");
			System.out.println("2 - Quit");
			System.out.println();
			System.out.printf("%24s","Enter your Choice ");
			
			enter = scanner.nextLine();
			try 
			{
				input = Integer.parseInt(enter);
			}
			catch(Exception err)
			{
				input = 9;
			}
		
			switch(input)
			{
				//case 1 is the main gameplay loop
				case 1:
					do
					{
						cls();
						title("Game Play");
						//pass False for bot's move
						currentMove = Move(t, false);
						t[(currentMove-1)/3 + 1][(currentMove-1) % 3 + 1] = -1;
						display(t);
						turn++;
						System.out.printf("%25s","Robot makes  its move");
						System.out.println();

						if(winner(t) == -3)
						{
							System.out.println();
							System.out.printf("%25s","The Bot is victorious");
							System.out.println();
							System.out.println("Press enter to return to menu");
							scanner.nextLine();
							break;
						}
						
						if(winner(t) == -2)
						{
							System.out.println();
							System.out.printf("%20s","It's a draw");
							System.out.println();
							System.out.println("Press enter to return to menu");
							System.out.println();
							scanner.nextLine();
							break;
						}
						else
						{
							System.out.println();
							System.out.println();
							//pass true to move method for user's move

							currentMove = Move(t, true);
							t[(currentMove-1)/3 + 1][(currentMove-1) % 3 + 1] = 1;
							cls();
							display(t);
							turn++;
							if(winner(t) == 3)
							{
								System.out.println();
								System.out.printf("%24s","The Player has won!");
								System.out.println();
								System.out.println("Press enter to return to menu");
								scanner.nextLine();
								break;
							}	
						}
					}while(true);
					turn = 1;
					break;
					//end of case 1
					
				case 2:
					cls();
					System.out.println("Thanks for playing, Goodbye!");
					flag = false;
					break;
					
				default:
					cls();
					System.out.println("Unrecognized option, please pick 1 or 2");
					System.out.println("Press enter to continue...");
					scanner.nextLine();
					break;
			}
			
		}while (flag);
		
		scanner.close();
		
	}//end of main
	
	public static void cls() 
	{
		for(int i = 1; i < 50; i++)
		{
			System.out.println();
		}
	}//end of cls
	
	public static void display(int [][] t)
	{
		
		System.out.printf("%23s","The Current Board");
		System.out.println();
		for(int i = 1; i<=9; i++)
		{

			int row = (i-1)/3 + 1;
			int col = ((i-1) % 3 + 1);
			

			if(t[row][col] == 0)
			{
				if(col == 1)
				{
					System.out.print("         ");
				}
				
				System.out.printf("%2d", i);
			}
			
			if(t[row][col] == -1)
			{
				if(col == 1)
				{
					System.out.print("         ");
				}
				
				System.out.printf("%2s", "X");
			}
			if(t[row][col] == 1)
			{
				if(col == 1)
				{
					System.out.print("         ");
				}
				
				System.out.printf("%2s", "O");
			}
			
			if(i % 3 == 0) 
			{
				System.out.println();
				if(row < 3)
				{
					System.out.printf("%20s","---+---+---");
				}
				
				System.out.println();
			}
			if(i % 3 != 0) 
			{
				System.out.print(" |");
			}	
		}//end of i for loop
	}// end of display method
	
	public static void title(String sub)
	{
		System.out.printf("%24s","Tick Tack  Toe Game");
		System.out.println();
		System.out.printf("%22s","By Jonah Layman");
		System.out.println();
		System.out.printf("%19s",sub);
		System.out.println();
		System.out.println();	
	}//end of title
	
	public static int winner(int [][] t)
	{
		int w = 0;
		int movesLeft = 9;
				
		//check rows for computer win/tie
		for(int i = 1; i<=3; i++)
		{
			w = 0;
			for(int j =1; j<=3; j++)
			{
				w = w+t[i][j];
			}
			if(w == -3 || w == 3)
			{
				return w;
			}
		}
		
		//diagonal check
		w=0;
		w = t[1][3] + t[2][2] + t[3][1];
		
		if(w == 3 || w == -3)
		{
			return w;
		}
		w=0;
		w = t[3][3] + t[2][2] + t[1][1];
		
		if(w == 3 || w == -3)
		{
			return w;
		}
		
		//col check
		w = 0;
		for(int i = 1; i<=3; i++)
		{
			w = 0;
			for(int j =1; j<=3; j++)
			{
				w = w+t[j][i];
			}
			if(w == -3 || w == 3)
			{
				return w;
			}
		}
		
		//finally we check for a tie
		
		for(int i = 1; i<=3; i++)
		{
			for(int j =1; j<=3; j++)
			{
				if(t[i][j] != 0)
				{
					movesLeft--;
				}
			}
			if(movesLeft <= 0)
			{
				w = -2;
				return w;
			}
		}
		return 0;
		
		
	}//end of winner
	
	public static int Move(int [][] t, boolean choice)
	{
		int col = 0;
		int row = 0;
		int move = 0;
		int x = 0;
		int w = 0;
		//decides if bot or player is moving
		//if true for player, else false for bot logic
		if(choice)
		{

			do 
			{
			
				System.out.printf("%27s","Please enter your move: ");
				String input = scanner.nextLine();
				
				try 
				{
					x = Integer.parseInt(input);
				}
				catch(Exception err)
				{
					
				};
				if(x >= 1 && x <=9)
				{
					row = (x-1)/3 + 1;
					col = ((x-1) % 3 + 1);
					
					if(t[row][col] == 0)
					{
						move = x;
						return move;
					}
				}
				
				else
				{
					cls();
					title("Game Play");
					display(t);
					System.out.println();
					System.out.printf("%21s","Invalid move.");
					System.out.println();
					System.out.printf("%25s","Try a different spot.");
					System.out.println();
					System.out.println();
				}
			}while(true);
		}//end of player move logic
		
		//============BOT LOGIC============
		else
		{
			//bot move logic if false is passed to method			
			if(turn == 1)
			{
				return 3;
			}
			
			//turn two take diagonal across to set up fork if they take middle
			if(turn == 3 && t[2][2] == 1)
			{
				return 7;
			}
			
			if(turn == 3 && t[2][2] == 0)
			{
				return 5;
			}
			//checking for winning moves, both bot and player..
			
			//check rows for computer winning move
			for(int j = 1; j<=3; j++)
			{
				w = 0;
				for(int i =1; i<=3; i++)
				{
					w = w+t[j][i];
				}
				if(w == -2)
				{
					for(int i = 1; i<=3; i++)
					{
						if(t[j][i] == 0)
						{
							move = (j-1)*3 + i;
						}
					}
					return move;
				}
			}
			
			//check col for computer winning move
			for(int j = 1; j<=3; j++)
			{
				w = 0;
				for(int i =1; i<=3; i++)
				{
					w = w+t[i][j];
				}
				if(w == -2)
				{
					for(int i = 1; i<=3; i++)
					{
						if(t[i][j] == 0)
						{
							move = (i-1)*3 + j;
						}
					}
					return move;
				}

			}
			
			//diagonal check for computer winning move
			w=0;
			w = t[1][3] + t[2][2] + t[3][1];
			
			if(w == -2)
			{
				for(int i = 1; i<=3; i++)
				{
					if(t[i][4-i] == 0)
					{
						return move = (i-1)*3 + (4-i);
					}
				}
			}

			w = t[1][1] + t[2][2] + t[3][3];
			
			if(w == -2)
			{
				for(int i = 1; i<=3; i++)
				{
					if(t[i][i] == 0)
					{
						return move = (i-1)*3 + i;
					}
					
				}
			}
			
			
			
			
			
			//check for player row move to block,
			for(int j = 1; j<=3; j++)
			{
				w = 0;
				for(int i =1; i<=3; i++)
				{
					w = w+t[j][i];
				}
				if(w == 2)
				{
					for(int i = 1; i<=3; i++)
					{
						if(t[j][i] == 0)
						{
							move = (j-1)*3 + i;
						}
					}
					return move;
				}
			}
			//check for player col move to block
			for(int j = 1; j<=3; j++)
			{
				w = 0;
				for(int i =1; i<=3; i++)
				{
					w = w+t[i][j];
				}
			
				if(w == 2)
				{
					for(int i = 1; i<=3; i++)
					{
						if(t[i][j] == 0)
						{
							move = (i-1)*3 + j;
						}
					}
					return move;
				}
			}
			//check for diagonal play move to block
			w = t[1][3] + t[2][2] + t[3][1];
			if(w == 2)
			{
				for(int i = 1; i<=3; i++)
				{
					if(t[i][4-i] == 0)
					{
						return move = (i-1)*3 + (4-i);
					}
				}
			}
			
			w = t[1][1] + t[2][2] + t[3][3];
			if(w == 2)
			{
				for(int i = 1; i<=3; i++)
				{
					if(t[i][i] == 0)
					{
						return move = (i-1)*3 + i;
					}
					
				}
			}
			
			//random move if nothing to win or block.
			do
			{
				double rand = Math.random() * 9 + 1;
				x = (int) rand;
				
				row = (x-1)/3 + 1;
				col = ((x-1) % 3 + 1);
				
				if(t[row][col] == 0)
				{
					move = x;
				}
					
			} while(move == 0);
			return move;
		}//end of the bot's move logic
	}// end of move()
	
	public static void reset(int [][] t)
	{
		for(int i = 1; i <= 3; i++)
		{
			for(int j = 1; j <= 3; j++)
			{
				t[i][j] = 0;
			}
		}
		
	}//end of reset()
	
}//end of class
