package iaf_quartz.quartzjar;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

public class JobTest {
	public Scheduler getSc() {
		return sc;
	}

	public void setSc(Scheduler sc) {
		this.sc = sc;
	}

	private Scheduler sc;

	public void start(){
		try {
			if(this.sc.isShutdown()){
				ApplicationContext ac= new ClassPathXmlApplicationContext("classpath*:beans.xml");
				sc=(Scheduler) ac.getBean("factoryBean");
			}
			
			this.sc.start();
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void stop(){
		try {
			this.sc.shutdown(true);
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
