import org.junit.*;
import static org.junit.Assert.*;

public class HeroTest {

  // @After
  //   public void tearDown() {
  //   Task.clear();
  // }

  @Test
  public void Hero_instantiatesCorrectly_true(){
    Hero myHero = new Hero("spiderman");
    assertEquals(true,myHero instanceof Hero);
  }

  @Test
  public void Hero_instantiatesWithDescription_String(){
    Hero myHero = new Hero("spiderman");
    assertEquals("spiderman",myHero.getName());
  }

}
