package net.tencent.demo.test;

public class Test位运算符 {

	public static void main(String[] args) {

		/**
		 * 位运算符：&、|、^、~、>>、<<、>>>
		 */
		
		// &：逻辑与运算符（只有参加运算的两位都为1，&运算的结果才为1，否则为0）
		
		int a = 3;
		int b = 2;
		//1.把a和b转换成二进制;
		//a: 11
		//b: 10
		//a&b:10
		System.out.println(a & b);//2
		
		int c = 4;//100
		int d = 6;//110
		System.out.println(c & d);//4
	}
}
