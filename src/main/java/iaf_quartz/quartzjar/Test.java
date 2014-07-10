package iaf_quartz.quartzjar;

import java.util.Scanner;

import org.quartz.Scheduler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac= new ClassPathXmlApplicationContext("classpath*:mytest.xml");
		JobTest jt=(JobTest) ac.getBean("jobTest");
		//jt.start();
		System.out.println("输入任意字符停止:");
		Scanner input =new Scanner(System.in);
		if (!input.next().equals(""))
		jt.stop();
	}

}
