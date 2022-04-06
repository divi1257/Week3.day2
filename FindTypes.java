package Week3.day1;

public class FindTypes {

	 public static void main(String[] args) {
		String test = "$$ Welcome 123$$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] charArray=test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			

			if( Character.isLetter(charArray[i])) {
				letter+=1;
				 System.out.println("letter: " + letter);
				
			}
			
			else if (Character.isDigit(charArray[i])) {
				space+=1;
				System.out.println("space: " + space);
			}
			else if (Character.isSpaceChar(charArray[i])) {
				num+=1;
				System.out.println("number: " + num);
			}
			else {
				specialChar+=1;
				System.out.println("specialCharcter: " + specialChar);
			}
		}
	}
	
		
		
		
}