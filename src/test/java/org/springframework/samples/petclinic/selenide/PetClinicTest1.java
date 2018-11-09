/**
 * 
 */
package org.springframework.samples.petclinic.selenide;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import java.util.Random;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;

/**
 * @author setupuser
 *
 */
public class PetClinicTest1 extends SelenideBase {
	
	@Test
	public void test() {
		int id = new Random().nextInt(10000);
		
		open("http://localhost:8080/");
		// Find OWNERESリンク押下
		$(By.xpath("//*[@id=\"main-navbar\"]/ul/li[3]/a")).click();
		
		//[Find Owners]画面
		// Add Ownerボタンクリック
		$(By.xpath("/html/body/div/div/a")).click();
		
		//[Add Owner]画面
		$("#firstName").val("田中");
		$("#lastName").val(String.valueOf(id) + "郎");
		$("#address").val("〒135-0061 東京都江東区豊洲３丁目２−２０");
		$("#city").val("東京");
		$("#telephone").val("0351662500");
		// Add Ownerボタンクリック
		$(By.xpath("//*[@id=\"add-owner-form\"]/div[2]/div/button")).click();
		
		//[Owner Information]画面
		// Add New Petボタンクリック
		$(By.xpath("/html/body/div/div/a[2]")).click();
		
		//[New Pet]画面
		$("#name").val("ポチ" + id);
		$("#birthDate").val("1990-01-01");
		$("#type").selectOption("dog");
		// Add Petボタンクリック
		$(By.xpath("/html/body/div/div/form/div[2]/div/button")).click();
		
		//[Owner Information]画面
		// Add Visitリンク押下
		$(By.xpath("/html/body/div/div/table[2]/tbody/tr/td[2]/table/tbody/tr/td[2]/a")).click();
		
		//[New Visit]画面
		$("#description").val("初回訪問");
		$(By.xpath("/html/body/div/div/form/div[2]/div/button")).click();
		
		//[Owner Information]画面
		// FIND OWNERESリンク押下
		$(By.xpath("//*[@id=\"main-navbar\"]/ul/li[3]/a")).click();
		
		//[Find Owneres]画面
		$("#lastName").val(String.valueOf(id) + "郎");
		//Find Ownerボタン押下
		$(By.xpath("//*[@id=\"search-owner-form\"]/div[2]/div/button")).click();
		
		//[Ownere Information]画面
		$("body").shouldHave(text("ポチ" + id));
		
	}

}
