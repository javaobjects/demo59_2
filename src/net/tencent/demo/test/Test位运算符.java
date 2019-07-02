package net.tencent.demo.test;

public class Test位运算符 {

	public static void main(String[] args) {

		/**
		 * 位运算符：&、|、^、~、>>、<<、>>>
		 */

		// &：逻辑与运算符（只有参加运算的两位都为1，&运算的结果才为1，否则为0）

		int a = 3;
		int b = 2;
		// 1.把a和b转换成二进制;
		// a: 11
		// b: 10
		// a&b:10
		System.out.println(a & b);// 2

		int c = 4;// 100
		int d = 6;// 110
		System.out.println(c & d);// 4

		// |:逻辑或运算符（只有参加运算的两位都为0，|运算的结果才为0，否则为1)
		int e = 5;// 101
		int f = 7;// 111
					// 111
		System.out.println(e | f);

		/**
		 * ^异或运算符 只有参加运算的两位不同，^运算的结果才为1，否则为0
		 */
		int g = 4;// 0100
		int h = 8;// 1000
					// 1100
		System.out.println(g ^ h);// 12

		// ctrl + shift + f Eclipse代码格式化
		int p = 36;
		int k = 2;
		/**
		 * p >> 2:右移缩小，移多少位，就除以2的多少次幂
		 * 36：  0010 0100
		 * >>2:      1001
		 */
		/**
		 * k<<3：左移扩大，移多少位，就乘以2的多少次幂
		 * 2:   0000 0010
		 * <<3: 0001 0000
		 */
		System.out.println(p >> 2);//36/2的2次幂=36/4=9
		System.out.println(k << 3);//2*2的3次幂=2*8=16

	}
}
