package NaveenPrograms;

public class RevNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//revNumWhile();
		SBrevNum();

	}
	
	public static void revNumWhile()
	{
		long n=546789;
		long rev=0;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		System.out.println(rev);
		
	}
	public static void SBrevNum()
	{
		long n=4567898;
		System.out.println(new StringBuffer(String.valueOf(n)).reverse());
	}

}
