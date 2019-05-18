package NaveenPrograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usingSet();
		//usingFor();
			
		}
	public static void usingFor() {
	String[] s= {"java","javascript","jsp","c","jee","AJS","java","c"};
	for(int i=0;i<s.length;i++)
	{
		for(int j=i+1;j<s.length;j++)
		{
			if(s[i].equals(s[j])) {
				
				System.out.println("duplicate value is :"+s[i]);
			}
		}
	}
	}
public static void usingSet()
	{
	String[] s= {"java","javascript","jsp","c","jee","AJS","java","c"};
	
     Set<String> name=new HashSet<String>();
     for(String names:s)
     {
       if(name.add(names)==false)
       {
       System.out.println("duplicate element is::"+names);
     
	}
}
}
public static void usingMap() {
	String[] s= {"java","javascript","jsp","c","jee","AJS","java","c"};
	
	Map<String, Integer> m=new HashMap<String,Integer>();
	for(String name:s)
	{
	Integer count=m.get(name);
	if(count==null)
	{
	m.put(name, 1);
	}
	else
	{
		m.put(name, ++count);
	}
//	Set<Entry<String,Integer>> e=m.entrySet();
//	if(m.getValue()>1)
	{
		System.out.println("duplicate value is:"+m);
	}
	
}
}
}


