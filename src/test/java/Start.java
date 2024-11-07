import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start {
    WebDriver wd;
    @Test
    public void test(){
        wd=new ChromeDriver();
       // wd.get("https://demoqa.com/");ne sohranyet istoriu perehodom
        wd.navigate().to("https://demoqa.com/");//сохраняет
        wd.navigate().back();
        wd.navigate().refresh();
        wd.navigate().forward();

        wd.quit();//all
       // wd.close();//one tab

    }

}
