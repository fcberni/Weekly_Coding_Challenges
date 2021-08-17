package Week_3_Word_Bucket;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


//Method uses split method to achieve a similar result to the coding challenge
//Was not able to solve for specific character limit and returning empty arrays for smaller buckets
public class WordBucket {

	public static List<String> changeDatatype(String[] array){
		List<String> result = new ArrayList<String>();
		for(String string: array) {
			result.add(string);
		}
		return result;
	}
	
	public static String cutLastCharacter(String string) {
		String result = "";
		for(int i=0; i<string.length()-1;i++) {
			result += string.charAt(i);
		}
		return result;
	}
	
	public static List<String> bucketize(String string, int limit){
		List<String> result = new ArrayList<String>();
		String temp = "";
		String addedString = "";
		List<String> listOfWords = changeDatatype(string.split(" "));
		for(int i=0; i<listOfWords.size()+2;i++) {
			if(i == listOfWords.size()+1) {
				if(0 <= i && i < listOfWords.size()) temp += listOfWords.get(i)+" ";
				result.add(cutLastCharacter(addedString));
			}
			
			if(temp.length()-1 > limit) {
				result.add(cutLastCharacter(addedString));
				if(0 <= i-1 && i-1 < listOfWords.size()) temp = listOfWords.get(i-1)+" ";
				addedString = "";
			}
			
			if(i < listOfWords.size()) temp += listOfWords.get(i)+" ";
			if(0 <= i-1 && i-1 < listOfWords.size()) addedString += listOfWords.get(i-1)+" ";
		}
		return result;
	}
	


	public static void main(String[] args) {
		
		//List<String> solution = WordBucket.bucketize("the mouse jumped over the cheese", 7);
		//List<String> solution = WordBucket.bucketize("fairy dust coated the air", 20);
		//List<String> solution = WordBucket.bucketize("a b c d e", 2);
		List<String> solution = WordBucket.bucketize("she sells sea shells by the sea", 10);
		System.out.println(solution);
		System.out.println(solution.size());
		
		


	}

}
