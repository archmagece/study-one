package DP;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @author archmagece
 * @since 2017-03-04
 */
public class LIS {

	public static void lisRun(int c, String[] numsStr) {
		int maxCount = 0;
		int count = 0;

		int[] nums = new int[c];
		for (int i = 0; i < c; i++) {
			nums[i] = Integer.parseInt(numsStr[i]);
		}

		for (int i = 0; i < nums.length; i++) {
			if(count==0 || i-1 < 0) {
				if (nums[i] < nums[i + 1]) {
					count++;
					if (count > maxCount) {
						maxCount = count;
					}
				}
			}else if(i+1 >= nums.length){
				if (nums[i - 1] < nums[i]) {
					count++;
					if (count > maxCount) {
						maxCount = count;
					}
				}
			}else if(nums[i - 1] < nums[i] && nums[i] < nums[i + 1]) {
				count++;
				if (count > maxCount) {
					maxCount = count;
				}
			} else {
				count = 0;
			}
		}
		System.out.println(maxCount);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		int testCount = Integer.parseInt(input.readLine());

		for (int i = 0; i < testCount; i++) {
			int c = Integer.parseInt(input.readLine());
			String line = input.readLine().trim();
			String[] lineSplit = line.split("\\s");
			lisRun(c, lineSplit);
		}
	}

}