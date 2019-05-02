package otherLabs;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.Scanner;

public class DiagDifference {
private static Scanner scanner;
    public static void main(String[] args)  {
		scanner = new Scanner(System.in);
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = diagonalDifference(arr);

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
	//public class Solution {

	    // Complete the diagonalDifference function below.
	    public static int diagonalDifference(int[][] arr) {
	       // X X X  i is across
	       // X X X  j is down
	       // X X X
	        int leftDiag =0;
	        int rightDiag =0;
	        int diff =0;
	        for (int i = 0; i < arr[i].length; i++) {
	            
	            for (int j = 0; j < arr[j].length; j++) {
	                leftDiag = leftDiag + arr[i][j];
	                System.out.println(leftDiag);
	            }
	        }
	        for (int i = arr.length-1; i >0; i--) {
	            
	            for (int j = arr.length-1; j >0; j--) {
	                rightDiag = rightDiag + arr[i][j];
	                System.out.println(rightDiag);
	            }
	        }
	        diff = Math.abs(leftDiag - rightDiag);
	        return diff;
	    }
}

	

