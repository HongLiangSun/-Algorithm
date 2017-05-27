package com.shell.algorithm;

import java.util.BitSet;

/**
 * 分发糖果 (575)
 * 
 * @author sunhongliang04 The number in given array is in range [-100,000,100,000].
 */
public class DistributeCandies {

	public static void main(String[] args) {
		int[] candies = { 1, 1, 5, -4 };
		int distributeCandies = distributeCandies(candies);
		System.out.println(distributeCandies);
	}

	public static int distributeCandies(int[] candies) {
		int result = 0;
		int half = candies.length >> 1;
		BitSet bitSet = new BitSet();
		for (int i = 0; i < candies.length; i++) {
			// 将数据都扩大100000来保证数据都是 >=0的。
			int j = candies[i] + 100000;
			if (!bitSet.get(j)) {
				bitSet.set(j, true);
				result++;
			}
		}
		return result > half ? half : result;
	}
}
