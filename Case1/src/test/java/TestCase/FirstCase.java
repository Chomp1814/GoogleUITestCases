package TestCase;


import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FirstCase extends GooglePage {

    @Test
    @Order(1)
    public void firstCase(){

        openGoogleCalculationPage();

        //Подсчет (1 + 2) × 3 - 40 ÷ 5
        click("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[1]/td[1]/div/div"); // (
        click("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[1]/div/div"); // 1
        click("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[4]/div/div"); // +
        click("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[2]/div/div"); // 2
        click("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[1]/td[2]/div/div"); // )
        click("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[4]/div/div"); // *
        click("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[3]/div/div"); // 3
        click("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[4]/td[4]/div/div"); // -
        click("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[1]/div/div"); // 4
        click("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[1]/div/div"); // 0
        click("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[2]/td[4]/div/div"); // /
        click("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[2]/div/div"); // 5
        click("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div"); // =

        String text = driver.findElement(By.xpath("//*[@id=\"cwos\"]")).getText();
        Assertions.assertEquals("1", text);
  }

    @Test
    @Order(2)
    public void secondCase(){
        openGoogleCalculationPage();

        // Подсчет 6 / 0
        click("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[3]/td[3]/div/div"); // 6
        click("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[2]/td[4]/div/div"); // /
        click("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[1]/div/div"); // 0
        click("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div"); // =

        String text = driver.findElement(By.xpath("//*[@id=\"cwos\"]")).getText();
        Assertions.assertEquals("Infinity", text);
    }

    @Test
    @Order(3)
    public void thirdCase(){
        openGoogleCalculationPage();

        // Подсчет sin(
        click("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[1]/tbody/tr[2]/td[2]/div/div[1]"); // sin
        click("//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/div/div[3]/div/table[2]/tbody/tr[5]/td[3]/div/div"); // 0

        String text = driver.findElement(By.xpath("//*[@id=\"cwos\"]")).getText();
        Assertions.assertEquals("Error", text);
    }
}
