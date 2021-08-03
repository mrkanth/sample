package pac;


import org.openqa.selenium.chrome.ChromeDriver;

public class cric {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.setProperty("webdriver.chrome.driver", "F:\\Mywor\\soft\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.cricbuzz.com/");
			driver.manage().window().maximize();	
			
			driver.close();
		}

}

