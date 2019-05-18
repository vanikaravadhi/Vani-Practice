package NaveenPrograms;

public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="!@ this /* is java + program";
		//regular expression[^a-zA-Z0-9]
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
				
	}

}
