package com.shell.algorithm;

/**
 * 数字补码（476）
 * 
 * @author sunhongliang04
 * 
 */
public class NumberComplement {
	public static void main(String[] args) {
		int complement = findComplement(5);
		System.out.println(complement);
	}

	public static int findComplement(int num) {
		int temp = 0;
		for (int i = 0; i < 32; i++) {
			if (((num >> i) & 1) == 1) {
				temp = 31 - i;
			}
		}
		return (~num << temp) >> temp;
	}
}
