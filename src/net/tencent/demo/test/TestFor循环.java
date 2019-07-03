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
		
		//需求：从200-300中找奇数，找到10个就可以了
		int count = 0;
		for (int i = 200; i <= 300; i++) {
			if(i % 2 != 0) {
				count++ ;
				System.out.println(i);
			}
			if(count == 10) {
				break;//打破打断，中断循环的意思 
			}
		}
		//需求：找出1-100中的偶数，并打印输出
		
		for (int i = 0; i <= 100; i++) {
			if(i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}

	}
}
