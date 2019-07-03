package net.tencent.demo.test;

public class TestSwitch语句 {

	public static void main(String[] args) {
		//根据成绩判断等级
		/**
		 * >=90 优秀
		 * >=80 <90 良好
		 * >=70 <80中等
		 * >=60 <70及格
		 * <60 不及格
		 */
		int score = 92;
		int shang = score/10;//9
		/**
		 * switch 语句的注意事项
		 * 1.switch(condition)条件
		 * 表达式的值只可以接受int、byte、char、short、String型,不接受其他类型的值,5种
		 * 2.case分支不可以重复
		 * 3.switch一但碰到第一次case匹配，程序就会跳到这个标签位置，开始顺序执行以后所有的程序代码，
		 * 而不管后面的case条件是否匹配，直到碰到break语句为止
		 */
		switch (shang) {
		case 10://if(score==value)
		case 9:
			System.out.println("优秀");
			break;
		case 8:
			System.out.println("良好");
			break;
		case 7:
			System.out.println("中等");
			break;
		case 6:
			System.out.println("及格");
			break;
		default://<60分
			System.out.println("不及格");
			break;
		}
	}

}
