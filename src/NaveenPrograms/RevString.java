package NaveenPrograms;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//forRev();
		SBrev();
		
	}
	
	public static void forRev()
	{
        String s="this is practice";
		
		String rev="";
		int l=s.length();
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);

	}
	
	public static void SBrev()
	{
	   String s="hello";
	   StringBuffer sb=new StringBuffer(s);
	   System.out.println(sb.reverse());
	   

}
}
