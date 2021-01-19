package page;

import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;


public class Page {

    static WebDriver driver;

    private static String imgSandalia = "//*[@id='content']/div[5]/section/div[2]/ul/li[8]/a";
    private static String selectSandalia = "//*[@id='item-list']/div[1]/div[5]/div[1]/a";
    private static String selectNunberSandalia = "//*[@id='buy-box']/section[2]/div/ul/li[2]/a";
    private static String btnComprar = "//*[@id='buy-button-now']";
    private static String tituloSandalia = "/html/body/div[1]/div[2]/div[2]/div[1]/div[2]/div/div[1]/div/div/h3";

    public Page(WebDriver driver) {
        Page.driver = driver;
    }

    public void acessarUrlLogin(String url) throws IOException {

        Page.driver.get(url);
    }

    public void selecionoOModeloDeSandalia()
    {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scrollBy(0,1150)", "");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(imgSandalia)));
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Page.driver.findElement(By.xpath(imgSandalia)).click();

    }

    public void sandaliaDesejada()
    {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scrollBy(0,850)", "");
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectSandalia)));
        try {
            Thread.currentThread().sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Page.driver.findElement(By.xpath(selectSandalia)).click();
        jse.executeScript("scrollBy(0,150)", "");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(selectNunberSandalia)));
        Page.driver.findElement(By.xpath(selectNunberSandalia)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(btnComprar)));
        try {
            Thread.currentThread().sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Page.driver.findElement(By.xpath(btnComprar)).click();
    }

    public void validarTexto()
    {
       WebElement element = driver.findElement(By.xpath(tituloSandalia));
       String text = element.getText();
       Assert.assertTrue(text.contains("Sandália Anabela Shoestock Salto Alto Corda Feminina"));
    }

    @After
    public void fecharNavegador() {

        System.out.println("Navegador fechado");
        driver.close();

    }
}
