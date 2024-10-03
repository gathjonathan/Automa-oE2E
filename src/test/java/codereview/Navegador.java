package codereview;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navegador extends Driversreview {

	public static void abrirNavegador() {

		driver = new ChromeDriver();
		driver.get("http://52.2.114.98/");
		driver.manage().window().maximize();

	}
}
