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
public class LIS {

	public static int count = 0;

	public static void prepare(int c, String[] numsStr){
		int maxCount = 0;
		int count = 0;

		int[] nums = new int[c];
		for (int i = 0; i < c; i++) {
			nums[i] = Integer.parseInt(numsStr[i]);
		}

		int result = run(nums, Integer.MAX_VALUE, 0);
		System.out.println(result);
	}

	public static int run(int[] nums, int prevNum, int startNo){
		int maxCount = 0;
		int thisCount;
		if(startNo == nums.length){
			return maxCount;
		}else{
			// 이전값보다크지않으면실패한시행
			if(!(prevNum < nums[startNo])){
				return maxCount;
			}
			// 다음값들을전부확인
			for(int i=1;i<nums.length-startNo;i++){
				thisCount = run(nums, nums[startNo], startNo + i);
				if(thisCount > maxCount){
					maxCount += thisCount;
				}
			}
			return maxCount;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		int testCount = Integer.parseInt(input.readLine());

		for (int i = 0; i < testCount; i++) {
			int c = Integer.parseInt(input.readLine());
			String line = input.readLine().trim();
			String[] lineSplit = line.split("\\s");
			prepare(c, lineSplit);
		}
	}

}