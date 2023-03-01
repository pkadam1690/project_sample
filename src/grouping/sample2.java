package grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample2 
{

	@Test(groups="Profile")
	public void test()
	{
		Reporter.log("This is sample2",true);
	}
	
	@Test(groups="Dashboard")
	public void test1()
	{
		Reporter.log("This is sample2",true);
	}
	@Test(groups="payment")
	public void test2()
	{
		Reporter.log("This is sample2",true);
	}
	@Test(groups="watchlist")
	public void test3()
	{
		Reporter.log("This is sample2",true);
	}
	@Test(groups="setting")
	public void test4()
	{
		Reporter.log("This is sample2",true);
	}
	@Test(groups="dashboard")
	public void test5()
	{
		Reporter.log("This is sample2",true);
	}
	
	
}
