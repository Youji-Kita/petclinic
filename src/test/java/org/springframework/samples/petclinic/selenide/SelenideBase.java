/**
 * 
 */
package org.springframework.samples.petclinic.selenide;

import org.junit.BeforeClass;
import org.openqa.selenium.Proxy;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;

/**
 * @author setupuser
 *
 */
public class SelenideBase {

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\SeleniumDriver\\chromedriver.exe");
		Configuration.browser = WebDriverRunner.CHROME;
//		Proxy webProxy = new Proxy();
//		webProxy.setHttpProxy("http://20850:yojikita0@proxy1.scskinfo.jp:8089");
//		WebDriverRunner.setProxy(webProxy);
	}

}
