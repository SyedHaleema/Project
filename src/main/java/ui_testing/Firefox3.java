package ui_testing;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox3 {

	public static void main(String[] args) throws IOException {
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.getcalley.com/page-sitemap.xml");
		Dimension d=new Dimension(1536, 864);
		driver.manage().window().setSize(d);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		String timestamp=LocalDateTime.now().toString().replace(':', '-');
		System.out.println(timestamp);
		String name="window-1536-864"+timestamp;
		System.out.println(name);
		String path="./Firefox3./TestCase3.png";;
		File dest=new File(path);
		FileUtils.copyFile(src, dest);
		driver.close();

	}

}
