package Week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1="stops";
		String text2="posts";
		int length1=text1.length();
		System.out.println(length1);
		int length2=text2.length();
		System.out.println(length2);
		if(length1==length2)
		{
			System.out.println("The Length is equal");
		}
		else
		{
			System.out.println("It is not Equal");
		}
	char[] charArray2 = text1.toCharArray();
	char[] charArray = text2.toCharArray();
	
	Arrays.sort(charArray);
	Arrays.sort(charArray2);
	if(Arrays.equals(charArray, charArray2))
	{
		System.out.println("It is Anagram");
	}
	else
	{
		System.out.println("It is not a Anagram");
	}
	}
}
