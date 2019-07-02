package net.tencent.demo.test;

public class Test逻辑运算符 {

	public static void main(String[] args) {

		// ！ && ||
		// !:该操作符后面跟的是boolean类型的数据，对该数据取反
		boolean result = false;
		int a = 1;
		if(!result)
		{
			System.out.println("1");
		}else {
			System.out.println("2");
		}
		
		//&&：并且的意思 ，只有两个表达式都为真，才返回真
		
		int money = 200000;
		boolean haveHouse = true;
		if(haveHouse && money > 100000) {
			System.out.println("同意结婚");
		}else {
			System.out.println("不同意结婚");
		}
		
	
		//||:或者的意思，两个表达式有一个为真那么就返回真
		//这个女孩子特别贤惠：有房子可以结婚，有一点钱也可以结婚
		if(haveHouse || (money > 10000)) {
			System.out.println("同意结婚");
		}else {
			System.out.println("不同意结婚");
		}
		
		
		int y = 100;
		int x = 200;
		
		if((y++ > 1) || (x++ > 200)) {
			System.out.println("大于200");
		}else {
			System.out.println("没有大于200");
		}
		
		System.out.println("x: " + x);
		/*
		 * && || 都是短路运算符
		 * 相当于“且”，如果用&&连接表达式时，如果左面的表达式为false，则将不会计算其右边的表达式
		 * 相当于“或”，如果左面的表达式为true，则将不会计算其右边的表达式
		 */
	}

}
