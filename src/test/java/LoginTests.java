import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests {
    @BeforeClass
    public void preCondition(){
        //open browser
        //open site
    }
    @Test
   public void loginSuccess(){

       //open form(find element+clik)
       //fill email(find element+clik+clear+type)
        //fill password(find element+clik+clear+type)
       //sumbit form(find element+clik)
   }
   @Test
    public void loginWrongEmail(){
       //open form(find element+clik)
       //fill email(find element+clik+clear+type)
       //fill password(find element+clik+clear+type)
       //sumbit form(find element+clik)
    }
    @Test
    public void loginWrongPassword(){
        //open form(find element+clik)
        //fill email(find element+clik+clear+type)
        //fill password(find element+clik+clear+type)
        //sumbit form(find element+clik)
    }
    @Test
    public void loginUnregisteredUser(){
        //open form(find element+clik)
        //fill email(find element+clik+clear+type)
        //fill password(find element+clik+clear+type)
        //sumbit form(find element+clik)
    }
    @AfterClass
    public void postCondition(){
        //close browser
   }
}
