package loops_statement;

public class S5A3_jumpingStatement {

	public static void main(String[] args) {
		/*
		 * 
- You are building a basic game system where a player completes levels from 1 to 10.

The player gets eliminated at level 6 (we'll use break here to stop the game).

If the player skips level 3 for some reason (maybe it's locked or under maintenance), the program will skip that level using continue.
		 */
     for(int i=1; i<=10;i++)
     {
    	// System.out.println("Level "+i); 
    	 
    	 if(i==3)
     	{
     		continue;
     	}
    	 else if(i==7) 
    	 {
    		break; 
    	 }
    	 
     	  System.out.println("Level "+i); 
    	
     }
      System.out.println("Level 3 is Skipped as it's under maintenance");
     System.out.println("Game Stopped");
	}
	

}
