package Week_3_Word_Bucket;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


//Method uses split method to achieve a similar result to the coding challenge
//Was not able to solve for specific character limit and returning empty arrays for smaller buckets
public class WordBucket {
	
	public static void bucketize(String regex, Integer limit) {
		
		String[] strArray = regex.split(" ", limit);
		System.out.println(strArray.length);
		System.out.println(Arrays.toString(strArray));
		
				
	}

	public static void main(String[] args) {
				
		WordBucket.bucketize("she sells sea shells by the sea", 10);
		WordBucket.bucketize("the mouse jumped over the cheese", 7);
		WordBucket.bucketize("fairy dust coated the air", 20);
		WordBucket.bucketize("a b c d e", 2);


	}

}
