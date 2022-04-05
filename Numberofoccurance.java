package Week3.day1;

public class Numberofoccurance {
	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count=0;
		char[] charArray = str.toCharArray();
		int length = str.length();
		for(int i=0; i<length; i++){
			if(charArray[i]=='e')
				count++;
			
			
		}
		System.out.println(count);
	}
}
