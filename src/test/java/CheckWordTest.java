import org.junit.*;
import static org.junit.Assert.*;

public class CheckWordTest {

  @Test
  public void getChanged_returnsUserStringWithVowelsReplacedWith_Dash_String() {
      CheckWord testCheckWord = new CheckWord();
      String sentence = "This is an example";
      String answer = "Th-s -s -n -x-mpl-";
      assertEquals(answer, testCheckWord.getChanged(sentence));
  }
  public void getChanged_returnsUserStringWithVowelsReplacedRegardlessOfCase_String() {
      CheckWord testCheckWord = new CheckWord();
      String sentence = "THIS is an EXAMPLE";
      String answer = "Th-s -s -n -x-mpl-";
      assertEquals(answer, testCheckWord.getChanged(sentence));
  }

}