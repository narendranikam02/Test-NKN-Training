package array_concep2;

public class object_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object a[] = {1,1.1,'N',"Narendra",true};
		for(Object x:a)
		{
			System.out.println(x);
		}
		
		System.out.println("--------------------------------------");
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}

}
