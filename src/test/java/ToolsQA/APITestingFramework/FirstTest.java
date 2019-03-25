package ToolsQA.APITestingFramework;



import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class FirstTest {
	
	private static Logger log=LogManager.getLogger(FirstTest.class.getName());
	
	@Test
	public void test1()
	{
		//System.out.println("this is test 1");
		log.info("this is test 1");
	}
	
	@Test
	public void test2()
	{
		//System.out.println("this is test 2");
		log.info("this is test 2");
	}

}
