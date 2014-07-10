package iaf_quartz.quartzjar;

import org.springframework.stereotype.Service;

@Service("nextJob")
public class NextJob extends MyTask {

	public void run(){
		System.out.println("job2执行");
	}
	
}
