package ui_testing;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_Resolution1 {

	public static void main(String[] args) throws IOException {
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		Dimension d=new Dimension(1920, 1086);
		driver.manage().window().setSize(d);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String timestamp=LocalDateTime.now().toString().replace(':', '-');
		System.out.println(timestamp);
		String name="window-1920-1080"+timestamp;
		System.out.println(name);
		String path="./ChromeScreenshot1./TestCase1.png";;
		File dest=new File(path);
		FileUtils.copyFile(src, dest);
		driver.close();
	}

}
