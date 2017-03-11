package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author archmagece
 * @since 2017-03-04
 *
4
4
1 2 3 4
8
5 4 3 2 1 6 7 8
8
5 6 7 8 1 2 3 4
7
9 1 3 7 5 6 20
답 5

2
8
5 6 7 8 1 2 3 4
7
9 1 3 7 5 6 20
 */
public class LIS_2 {

	public static int[] numFilter(int[] nums){
		if(nums.length<3){
			return nums;
		}
		int[] numsTmp = new int[nums.length];
		int j=0;
		numsTmp[j++] = nums[0];
		for(int i=1;i<nums.length-1;i++){
			if(nums[i-1]<nums[i] && nums[i]<nums[i+1]){
				numsTmp[j++] = nums[i];
			}else if(nums[i-1] < nums[i+1]){
				numsTmp[j++] = nums[i+1];
				i++;
			}
		}
		numsTmp[j++] = nums[nums.length-1];
		int[] numsResult = new int[j];
		for(int i=0;i<j;i++){
			numsResult[i] = numsTmp[i];
		}
		return numsResult;
	}

	public static void lisRun(int c, String[] numsStr) {
		int maxCount = 0;
		int count = 0;

		int[] nums = new int[c];
		for (int i = 0; i < c; i++) {
			nums[i] = Integer.parseInt(numsStr[i]);
		}
		nums = numFilter(nums);

		for (int i = 0; i < nums.length; i++) {
			if(count==0 && i < nums.length-1) {
				//배열마지막
				if (nums[i] < nums[i + 1]) {
					count++;
					if (count > maxCount) {
						maxCount = count;
					}
				}
			}else{
				if(nums[i - 1] < nums[i]){
					count++;
					if (count > maxCount) {
						maxCount = count;
					}
				}else{
					count=0;
				}
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