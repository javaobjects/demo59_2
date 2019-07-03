package net.tencent.demo.test;

public class TestFor循环 {

	public static void main(String[] args) {
		//需求;求1-100的数字和的
		
		//声明一个变量，用来存放累 加的结果
		
		int sum = 0;
		for (int i = 0; i < 100 + 1; i++) {
			sum += i;//sum = sum + i
		}
		System.out.println("1-100的和： " + sum);
		
		int a = 1;
		//声明一个变量，用来存放累 加的结果
		int result = 0;
		while(a <= 100) {
			result += a;
			a++;
		}
		
		System.out.println("1-100的和： " + result);
	}

}
