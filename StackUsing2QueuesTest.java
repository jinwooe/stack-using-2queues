import org.junit.Assert;
import org.junit.Test;

public class StackUsing2QueuesTest {
	
	@Test
	public void test() {
		StackUsing2Queues stack = new StackUsing2Queues();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		Assert.assertEquals(5, stack.pop());
		Assert.assertEquals(4, stack.pop());
		Assert.assertEquals(3, stack.pop());
		
		stack.push(6);
		Assert.assertEquals(6, stack.pop());
		
		stack.push(7);
		stack.push(8);
		Assert.assertEquals(8, stack.pop());
		Assert.assertEquals(7, stack.pop());
	}
}
