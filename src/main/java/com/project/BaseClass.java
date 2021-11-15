package com.project;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver to_browser_launch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\AZHAGURAJ\\eclipse-workspace\\Cucumber\\driver\\chromedriver95.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}

	public static void to_close() {
		driver.close();
	}
	
	public static void to_clear(WebElement element) {
		
		element.clear();
	}

	public static void to_quit() {
		driver.quit();
	}

	public static void to_navigate_to(String str) {
		driver.navigate().to(str);
	}

	public static void to_navigate_back() {
		driver.navigate().back();
	}

	public static void to_navigate_forward() {
		driver.navigate().forward();
	}

	public static void to_referesh() {
		driver.navigate().refresh();
	}

	public static void to_sleep(int millis) throws Throwable {
		Thread.sleep(millis);
	}

	public static void to_implicit_wait(int seconds) {
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}

	public static void to_explicit_wait(int seconds, WebElement framework) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		wait.until(ExpectedConditions.visibilityOf(framework));
		framework.click();
	}

	public static void to_get(String str) {
		driver.get(str);
	}
	public static void to_simple_alert() {
		Alert simplealert=driver.switchTo().alert();
		simplealert.accept();
	}

	public static void to_alert_accept(By selector) {
		
		driver.findElement(selector).click();
		driver.switchTo().alert().accept();
	}

	public static void to_alert_reject(By selector) {
		driver.findElement(selector).click();
		driver.switchTo().alert().dismiss();
	}

	public static void to_action_move_to_element(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
	}

	public static void to_action_context_click(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).build().perform();
	}

	public static void to_action_click(WebElement element) {
		Actions action = new Actions(driver);		
		action.click(element).build().perform();
	}

	public static void to_action_double_click(WebElement element) {
		Actions action = new Actions(driver);		
		action.doubleClick(element).build().perform();
	}

	public static void to_action_click_and_hold(WebElement element) {
		Actions action = new Actions(driver);		
		action.clickAndHold(element).build().perform();
	}

	public static void to_action_drag_and_drop(WebElement source,WebElement target) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).build().perform();
	}

	public static void to_frames_index(int index) {
		driver.switchTo().frame(index);
	}

	public static void to_frames_nameorid(String nameorid) {
		driver.switchTo().frame(nameorid);
	}

	public static void to_frames_webelement(WebElement webelement) {
		driver.switchTo().frame(webelement);
	}

	public static void to_robot_keypress_down() throws Throwable {
		Robot rc = new Robot();
		rc.keyPress(KeyEvent.VK_DOWN);
	}

	public static void to_robot_keyrelease_down() throws Throwable {
		Robot rc = new Robot();
		rc.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void to_robot_keypress_enter() throws Throwable {
		Robot rc = new Robot();
		rc.keyPress(KeyEvent.VK_ENTER);
	}

	public static void to_robot_keyrelease_enter() throws Throwable {
		Robot rc = new Robot();
		rc.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void to_window_handle(WebDriver element) {
		String mainwindow = element.getWindowHandle();
		String title = element.switchTo().window(mainwindow).getTitle();
		System.out.println(title);
	}

	public static void to_window_handles(WebDriver element, String string_title) {
		Set<String> allwindow = element.getWindowHandles();
		for (String id : allwindow) {
			String title = element.switchTo().window(id).getTitle();
			System.out.println(title);
		}

		String ActualTitle = string_title;
		for (String ID : allwindow) {
			if (driver.switchTo().window(ID).getTitle().equals(ActualTitle)) {
				break;
			}
		}
	}

	public static void to_check_box(WebElement element) {
		element.click();
	}

	public static void to_is_enable(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
	}

	public static void to_is_displayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}

	public static void to_is_selected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}

	public static void to_get_option(By selector) {
	}

	public static void to_get_title() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void to_get_current_url() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}

	public static void to_get_text(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static void to_get_attribute(By selector, String name) {
		WebElement element = driver.findElement(selector);
		element.getAttribute(name);
	}

	public static void to_take_screenshot(String name) throws Throwable {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File Source1 = ts.getScreenshotAs(OutputType.FILE);
		File destination1 = new File(
				"C:\\Users\\AZHAGURAJ\\eclipse-workspace\\Maven_Projects\\screen shot\\" + name + ".png");
		FileUtils.copyFile(Source1, destination1);
	}

	public static void to_scroll_up(int pixels) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + -pixels + ")", "");
	}

	public static void to_scroll_down(int pixel) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + pixel + ")", "");
	}

	public static void to_sendkeys(WebElement element, String str) {
		element.sendKeys(str);
	}

	public static void to_get_first_selected_options(By selector) {
		WebElement element = driver.findElement(selector);
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption);
	}

	public static void to_get_all_selected_options(By selector) {
		WebElement element = driver.findElement(selector);
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		System.out.println(allSelectedOptions);
	}

	public static void to_is_multiple(By selector) {
		WebElement element = driver.findElement(selector);
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}
	public static void to_dropdown(WebElement element,String option,String input) {
		Select s = new Select(element);
		if(option.equals("index")) {
			int parseInt =Integer.parseInt(input);
			s.selectByIndex(parseInt);
			
		}
		else if(option.equals("value")) {
			s.selectByValue(input);
		}
		else if(option.equals("text")) {
			s.selectByVisibleText(input);
		}
		else {
			System.out.println("PLs check input options");
		}
		
				
	}

	public static void to_click(WebElement element) {
		element.click();
	}
	




}
