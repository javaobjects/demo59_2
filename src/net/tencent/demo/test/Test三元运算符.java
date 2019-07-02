package net.tencent.demo.test;

public class Test三元运算符 {

	public static void main(String[] args) {

		//需求：服务器代码接收性别是男，希望转换成数字1，接收性别是女，希望转换成数字0
		
		String sex = "男";
		
		int s = 0;//把s变量初始化为0，不是最终结果
		
		if(sex.equals("男")) {
			s = 1;
		}else {
			s = 0;
		}
		System.out.println("性别： " + s);
		
		//那个需求有没有更好的实现方式呢？
		/**
		 * 三元表达式：
		 * 1、语法：表达式一？表达式一：表达式三
		 * 2、替换if--else语句
		 * 3、常用来做赋值操作
		 */
		int result = sex.equals("男") ? 1 : 0;
		System.out.println("性别： " + result);
	}

}
