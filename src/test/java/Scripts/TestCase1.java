package Scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddtoCartPage;
import pomPages.SkillaryDemoLoginPage;
import pomPages.SkillaryLoginPage;

public class TestCase1 extends BaseClass {
     @Test
     public void tc1() {
    	 SkillaryLoginPage s = new SkillaryLoginPage(driver);
    	 s.gearsbutton();
    	 s.skillaryarydemoapplication();
    	 utilies.switchingtabs(driver);
    	 SkillaryDemoLoginPage sd = new SkillaryDemoLoginPage(driver);
    	 
    	 utilies.mouseHover(driver, sd.getCoursetab());
    	 sd.seleniumtrainingtab();
    	 AddtoCartPage d=new AddtoCartPage(driver);
    	 utilies.doubleclick(driver, d.getAddbtn());
    	 d.carttocartbtn();
    	 utilies.alertpopup(driver);
    	 
     }
     
}
