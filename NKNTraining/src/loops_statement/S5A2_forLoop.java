package loops_statement;

public class S5A2_forLoop {

	public static void main(String[] args) {
/*
 * 
- You're programming a laundry machine timer. The machine runs for a certain number of minutes (let's say 5). For each minute, the machine displays:"Washing... Minute: X"

Once it finishes, it shows "Washing complete!"

This for loop runs 5 times, representing each minute of the wash cycle.
 */
	 for(int i=1; i<=6;i++)
	 {
		if(i<=5)
		{
			System.out.println("washing minute "+i);
		}
		else
		{
			System.out.println("washing completed ");
		}
	 }

	}

}
