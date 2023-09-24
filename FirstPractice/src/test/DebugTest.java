package test;

import java.util.Arrays;

public class DebugTest {

	public static void main(String[] args) {
		
		String[] s = {"12", "6", "34", "56", "0", "55", "5", "99", "66"};
			
		int[] i = convert(s);
			
		System.out.println(Arrays.toString(i));
			
	}


	
	private static int[] convert(String[] stringArr) {
		try 
		{
			int[] intArray = new int[stringArr.length];
			for(int i =0; i <stringArr.length;i++) 
			{
				intArray[i] = Integer.valueOf(stringArr[i]);
			}
			return intArray;
		}catch(NumberFormatException e)
		{
			return null;
		}
	}
}
