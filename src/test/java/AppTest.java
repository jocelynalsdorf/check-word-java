import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest{
  public WebDriver webDriver = new HtmlUnitDriver();
  public WebDriver getDefaultDriver(){
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest(){
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Word Changer");
  }
  
  @Test
  public void getchangedword(){
    goTo("http://localhost:4567/");
    fill("#sentence").with("they are nice");
    submit(".btn");
    assertThat(pageSource()).contains("th-y -r- n-c-");
  }

}
