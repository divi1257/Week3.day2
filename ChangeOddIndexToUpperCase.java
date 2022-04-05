package Week3.day1;

public class ChangeOddIndexToUpperCase {
        
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Changeme";
		char Ch[]= text.toCharArray();
		for(int i=0; i<Ch.length; i++) {
		}
		for(int i=0; i<Ch.length; i++) {
			if(i%2!=0)
				System.out.println(Character.toUpperCase(Ch[i]));
				
			else
				System.out.println(Ch[i]);
			
		}
	}

}
