package NaveenPrograms;

public class MissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {-1,0,1,2,4,5,6,7,8,9,10};
		int b=0;
		int c=0;
		for(int i=0;i<a.length;i++) {
			b=b+a[i];
		}
		System.out.println(b);
      for(int j=-1;j<=10;j++)
      {
    	  c=c+j;
      }
      System.out.println(c);
      System.out.println("missing number :"+(c-b));
	}

}
