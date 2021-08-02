package Solution1;

//Problem 1: Given two Strings A and B. 
//Find the length of the Longest Common Subsequence (LCS) of the given Strings. Input: A = Minneapolis, B = Minnesota.

public class LongestCommonSequence {
	
	int lcs( char[] X, char[] Y, int m, int n ){
        if (m == 0 || n == 0)
        return 0;
        if (X[m-1] == Y[n-1])
        return 1 + lcs(X, Y, m-1, n-1);
        else 
        return max(lcs(X, Y, m, n-1), lcs(X, Y, m-1, n));
    }

    int max(int a, int b){
        return (a > b)? a : b;
    }

	public static void main(String[] args) {
		
		LongestCommonSequence lcs = new LongestCommonSequence();
	    String s1 = "Minneapolis";
	    String s2 = "Minnesota";
	    
	    //Converting our strings into Char Arrays
	    char[] X = s1.toCharArray();
	    char[] Y = s2.toCharArray();
	    //Assigning the length of X and Y to variables
	    int m = X.length;
	    int n = Y.length;
	 
	    System.out.println("Length of LCS is" + " " +
	                                lcs.lcs( X, Y, m, n ) );

	}

}
