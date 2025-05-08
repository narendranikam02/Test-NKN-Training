package operators;

public class TernaryOperator {

	public static void main(String[] args) {
		// Conditional/ternary operator ?, :
		// var=exp ? result 1 : result 2
		
		int a=200, b=100;
		
		//case 1
		int x= (a>b) ? a:b;
		System.out.println(x);
		
		//case 2
		int c=200, d=100;
		int y= (c<d) ? a:b;
		System.out.println(y);
		
		//case 3
		int f=(1==1)? 100:200;
		System.out.println("this is " +f);
		
		//case 4
		int g=(1==2)? 100:200;
		System.out.println("this is " +g);
		
		//case 5
		int person_age=10;
		String voteeligible=(person_age>=18)? "Eligible for vote":"Not Eligible for vote";
		System.out.println(voteeligible);

	}

}
