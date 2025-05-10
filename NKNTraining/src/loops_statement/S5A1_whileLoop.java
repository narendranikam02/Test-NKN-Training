package loops_statement;

public class S5A1_whileLoop {

	public static void main(String[] args) {
		/*- You're programming a laundry machine timer. The machine runs for a certain number of minutes (let's say 5). For each minute, the machine displays:"Washing... Minute: X"

Once it finishes, it shows "Washing complete!"

This for loop runs 5 times, representing each minute of the wash cycle.
*/
		
		int i=1;
		while(i<=5)
		{
				System.out.println("washing minute "+i);
				i++;
				if(i==5)
				{
					System.out.println("washing completed ");
					break;
				}
		}

	}

}
