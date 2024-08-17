package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverinitilization {

	public static WebDriver driver;

	private Properties prop;

	public Driverinitilization() throws IOException {

		prop = new Properties();
		// TODO Auto-generated method stub
		try {

			FileInputStream input = new FileInputStream(
					"C:\\Users\\RAM KUMAR\\eclipse-workspace\\SeleniumJava\\src\\test\\resources\\new.properties");

			prop.load(input);

			input.close();

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	@Test
	public void driverSetup() {

		String baseURL = prop.getProperty("baseURL");

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get(baseURL);

	}

}
