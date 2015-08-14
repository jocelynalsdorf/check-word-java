import org.junit.*;
import static org.junit.Assert.*;

public class CheckWordTest {

  @Test
  public void getChanged_returnsUserStringWithVowelsReplacedWith_Dash_String() {
      CheckWord testCheckWord = new CheckWord();
      String sentence = "this is an example";
      String answer = "th-s -s -n -x-mpl-";
      assertEquals(answer, testCheckWord.getChanged(sentence));
  }
  @Test
  public void getChangedLower_returnsUserStringWithVowelsReplacedRegardlessOfCase_String() {
      CheckWord testCheckWord = new CheckWord();
      String sentence = "THIS is an EXAMPLE";
      String answer = "TH-S -s -n -X-MPL-";
      assertEquals(answer, testCheckWord.getChanged(sentence));
  }

}