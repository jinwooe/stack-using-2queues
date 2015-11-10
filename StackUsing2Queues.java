package queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {
	private Queue<Object> queue1 = new LinkedList<>();
	private Queue<Object> queue2 = new LinkedList<>();
	// indicator which queue should be used
	// if flag is true, then queque1 should be used, false then queue2
	private boolean flag = true;
	
	public void push(Object obj) {
		if(flag) {
			while(!queue1.isEmpty()) {
				Object extracted = queue1.poll();
				queue2.offer(extracted);
			}
			queue1.offer(obj);
		}
		else {
			while(!queue2.isEmpty()) {
				Object extracted = queue2.poll();
				queue1.offer(extracted);
			}
			queue2.offer(obj);
		}
	}
	
	public Object pop() {
		Object ret = null;
		if(flag) {
			ret = queue1.poll();
			while(queue2.size() > 1) {
				Object extracted = queue2.poll();
				queue1.offer(extracted);
			}
		}
		else {
			ret = queue2.poll();
			while(queue1.size() > 1) {
				Object extracted = queue1.poll();
				queue2.offer(extracted);
			}
		}
		
		flag = !flag;
		return ret;
	}
}
