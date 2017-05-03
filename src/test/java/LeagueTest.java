import org.junit.*;
import static org.junit.Assert.*;

public class LeagueTest {

  @Test
  public void category_instantiatesCorrectly_true() {
    League testLeague = new League("Justice League");
    assertEquals(true, testLeague instanceof League);
  }
}
