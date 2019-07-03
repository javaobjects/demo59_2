package net.tencent.demo.test;

public class TestWhile循环 {

	public static void main(String[] args) {

		//计算从1到100的所有奇数相加
		int sum = 0;
		int a = 1;//初始值
		while(a <= 100){
			if(a%2 != 0) {
				sum += a;//sum = sum + a;
			}
			a++;//a自增1
		}
		System.out.println("1-100的奇数的和: "+sum);
	}

}
