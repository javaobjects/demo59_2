package net.tencent.demo.test;

public class TestIf {

	public static void main(String[] args) {

		//1、if后面的()，其中必须放置能够返回boolean值的数据或者表达式
		String name = "怡宝纯净水";
		String type = "罐装";
		int number = 30000;
		
		String base_sql = "select * from product where 1 == 1";
		if(name != null && "".equals(name)) {
			base_sql += " and name = " + name;
		}
		if(type !=null && !"".equals(type)) {
			base_sql += " and type = "+ type;
		}
		if(number>0) {
			base_sql += " and number >"+ number;
		}
		boolean temp = true;
		int a = 100;
		char sex = '男';
		if(sex == '男') {
			System.out.println(sex);
		}
		//2.if语句，两个分支
		//适用场景：登录的结果处理，登录成功，登录失败
		if(temp) {
			
		}else {
			
		}
		//3.三个或者以上的分支
		//输入商品名称，类别，销量完成组合查询
	
		//根据成绩判断等级
		/**
		 * >=90 优秀
		 * >=80 <90 良好
		 * >=70 <80中等
		 * >=60 <70及格
		 * <60 不及格
		 */
		int score = 67;
		if(score >=90) {
			System.out.println("优秀");
		}else if(score>=80 && score < 90) {
			System.out.println("良好");
		}else if(score >= 70 && score < 80) {
			System.out.println("中等");
		}else if(score >=60 && score < 70) {
			System.out.println("及格");
		}else {
			System.out.println("不及格");
		}
		
		
		
//		if(表达式一) {
//			
//		}else if(表达式二) {
//			
//		}else if(表达式三) {//可以有多个
//			
//		}else {
//			
//		}
		
		
		
	}

}
