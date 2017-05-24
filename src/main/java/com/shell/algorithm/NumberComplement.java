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
		System.out.println("数字补码未:"+complement);
	}

	public static int findComplement(int num) {
		//找出二进制中最高位为1的位置之前有多少个0
		int temp = 0;
		for (int i = 0; i < 32; i++) {
			if (((num >> i) & 1) == 1) {
				temp = 31 - i;
			}
		}
		return (~num << temp) >> temp;
	}
}
