import static org.junit.Assert.*;

import org.junit.Test;


public class MainServletTest {

	@Test
	public void should_greet_you(){
		MainServlet servlet = new MainServlet(); 
		
		String greeting = servlet.sayHello();
		
		assertEquals("Hello from Ilias!", greeting);
	}
}
