import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {
    WebDriver wd;
    @BeforeClass
    public void setUp(){
        wd=new ChromeDriver();
        wd.get("file:///Users/vasilisa/Desktop/21.index.html");

    }
    @Test
    public void tableTest(){
        WebElement canada= wd.findElement(By.cssSelector("tr:nth-child(3)>td:last-child"));
        Assert.assertEquals(canada.getText(),"Canada");


    }




    @Test
    public void index(){
        //by tagName
        WebElement button=wd.findElement(By.tagName("button")) ;
        WebElement button1= wd.findElement(By.cssSelector("button"));
        WebElement button2= wd.findElement(By.xpath("//button"));
        WebElement button3= wd.findElement(By.xpath("//*[text()='Send']"));

        //elements
        List<WebElement> inputs=wd.findElements(By.tagName("input")) ;
       List<WebElement> inputs1=wd.findElements(By.cssSelector("input"));
       List<WebElement> inputs2= wd.findElements(By.xpath("//input"));

//by classs
        WebElement el= wd.findElement(By.className("container"));
        WebElement ell= wd.findElement(By.cssSelector(".container"));
        WebElement elll= wd.findElement(By.xpath("//*@class='container'"));
        //by id
        WebElement id= wd.findElement(By.id("nav"));
        WebElement id2= wd.findElement(By.cssSelector("#nav"));
        WebElement id3= wd.findElement(By.xpath("//*[#id='nav']"));
        //by attribute
        WebElement inputEmail= wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement inputEmail5= wd.findElement
                (By.xpath("//*[@placehoolder='Type your name']"));

        //start
        WebElement inputEmail1= wd.findElement(By.cssSelector("[placeholder^='Type ']"));
        WebElement inputEmail7= wd.findElement
                (By.xpath("//*[starts-with(@placeholder,'Type) ']"));

        //end
       WebElement inputEmail6= wd.findElement(By.cssSelector("[placeholder%='name ']"));
        //contains
        WebElement inputEmail3= wd.findElement(By.cssSelector("[placeholder*='your']"));
        WebElement inputEmail8= wd.findElement
                (By.xpath("//*contains[placeholder,'your']"));


        WebElement a= wd.findElement(By.cssSelector("[href='#item3']"));
        WebElement el4 =wd.findElement(By.cssSelector("[name='name']"));
        WebElement el5= wd.findElement(By.name("name"));

        //by linkText doesn't use
        //By.linkText By.partialLinkText

        WebElement a1 = wd.findElement(By.linkText("Item 1"));
        WebElement a2 = wd.findElement(By.partialLinkText("m 1"));


    }


}
