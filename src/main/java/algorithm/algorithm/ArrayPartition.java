package algorithm.algorithm;

import java.util.Arrays;

/**
 * 数组划分（561）
 * @author sunhongliang04
 */
public class ArrayPartition {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		int sum = arrayPairSum(nums);
		System.out.println(sum);
		
	}

	public static int arrayPairSum(int[] nums) {
		int result = 0;
		Arrays.sort(nums);
		for (int i = 0; i <= nums.length - 1; i += 2) {
			result += nums[i];
		}
		return result;
	}
}
