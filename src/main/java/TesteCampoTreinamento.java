import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCampoTreinamento {
	
	@Test
	public void testeTextField() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// abre o navegador com a tela maximixada
		//driver.manage().window().setSize(new Dimension(1750, 750));// abre o navegador com a tela conforme o paramentro selecionado
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		//System.out.println(driver.getTitle());
		//driver.close();// Apenas fecha uma aba
		//driver.quit();//Fechar todas as abas e fechar o processo
		
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Lucas Dias");
		assertEquals("Lucas Dias", driver.findElement(By.id("elementosForm:nome")).getAttribute("value"));
		
		driver.quit();
	}
	
	@Test
	public void testeTextArea(){
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Testes");
		assertEquals("Testes",driver.findElement(By.id("elementosForm:sugestoes")).getAttribute("value"));
		driver.findElement(By.id("elementosForm:sugestoes")).sendKeys("Testes\n Testes \n\n Teste100");
		
		//driver.quit();
		
	}

}
