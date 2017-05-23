package algorithm.algorithm;

/**
 * 汉明距离（461）
 * 
 * @author sunhongliang04
 */
public class HammingDistance {
	public static void main(String[] args) {
		int distance = hammingDistance(3, 4);
		System.out.println(distance);
	}

	public static int hammingDistance(int x, int y) {
		int result = 0;
		int tem = x ^ y;
		for (int i = 0; i < 32; i++) {
			if ((tem & 1) == 1)
				result++;
			tem = tem >> 1;
		}
		return result;
	}
}
