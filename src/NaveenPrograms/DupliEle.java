package NaveenPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DupliEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s= {"java","javascript","jsp","c","jee","AJS","java","c"};
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].equals(s[j]))
				{
					System.out.println("duplicate element is:"+s[i]);
				}
			}
		}
		System.out.println("**************************");
		Set<String> name=new HashSet<String>();
		for(String names:s)
		{
			if(name.add(names)==false)
			{
				System.out.println("duplicate element is:"+names);
			}
		}
		System.out.println("*******************************");
		Map<String,Integer> m=new HashMap<String,Integer>();
		for(String ele:s)
		{
			//Integer count=ele
		}
		

	}

}
