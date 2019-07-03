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
		
		//使用do...while循环累加1-10奇数的和
		int sum2 = 0;
		int a2 = 1;
		do {
			if(a % 2 != 0) {
				sum2 += a2;
			}
			a2++;
		}while(a2 <= 10);
		
		System.out.println("1-10的奇数的和: "+sum2);
		
		//用for循环改写从1-100的所有奇数相加的和
		int count = 0;//存放累加的和
		for (int i = 0; i < 100 + 1; i++) {
			if(i % 2 != 0) {
				count += i;
			}
		}
		System.out.println("1-100的奇数的和: "+count);
		
		
		
	}

}
