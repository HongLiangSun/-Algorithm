package com.shell.algorithm;

/**
 * 字符串中翻转单词（557）
 * 
 * @author sunhongliang04
 * 
 */
public class ReverseWords {

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		String reverseWords = reverseWords(s);
		System.out.println(reverseWords);
	}

	public static String reverseWords(String s) {
		if (s == null || "".equals(s.trim())) {
			return "";
		}
		char[] words = s.toCharArray();
		int p = 0;
		for (int i = 0; i < words.length; i++) {
			if (i == words.length - 1 || words[i + 1] == ' ') {
				char temp;
				for (int j = p, k = i; j < k; j++, k--) {
					temp = words[j];
					words[j] = words[k];
					words[k] = temp;
				}
				p = i + 2;
			}
		}
		return new String(words);
	}
}
