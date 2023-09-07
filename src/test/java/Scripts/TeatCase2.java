package Scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddtoCartFb;
import pomPages.SkillaryDemoLoginPage;
import pomPages.SkillaryLoginPage;

public class TeatCase2  extends BaseClass {
	@Test
	public void tc2()throws Throwable
	{
	 SkillaryLoginPage s = new SkillaryLoginPage(driver);
   	 s.gearsbutton();
   	 s.skillaryarydemoapplication();
   	
   	SkillaryDemoLoginPage sd = new SkillaryDemoLoginPage(driver);
   	utilies.switchingtabs(driver);
   	utilies.dropDown(sd.getCoursedd(), pdata.getPropertydata("coursedd"));
   	AddtoCartFb tp=new AddtoCartFb(driver);
   	utilies.dragdrop(driver, tp.getSeleniumtraining(),tp.getCarttab());
	}
}
