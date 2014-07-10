package iaf_quartz.quartzjar;

import org.springframework.stereotype.Service;

@Service("helloJob")
public class HelloJob extends MyTask {
	
	public void run(){
		System.out.println("job1执行");
	}
}
