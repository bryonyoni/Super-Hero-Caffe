// import org.junit.*;
// import static org.junit.Assert.*;
//
// public class HeroTest {
//
//   @After
//     public void tearDown() {
//     Hero.clear();
//   }
//
//   @Test
//   public void Hero_instantiatesCorrectly_true(){
//     Hero myHero = new Hero("spiderman");
//     assertEquals(true,myHero instanceof Hero);
//   }
//
//   @Test
//   public void getName_instantiatesWithDescription_String(){
//     Hero myHero = new Hero("spiderman");
//     assertEquals("spiderman",myHero.getName());
//   }
//
//   @Test
//   public void all_returnsAllInstancesOfHeroes_true(){
//     Hero firstHero = new Hero("spiderman");
//     Hero secondHero = new Hero("superman");
//     assertEquals(true,Hero.all().contains(firstHero));
//     assertEquals(true,Hero.all().contains(secondHero));
//   }
//
//   @Test
//   public void getHeroId_HerosIdInInstance_1(){
//     Hero myHero = new Hero("spiderman");
//     assertEquals(1,myHero.getHeroId());
//   }
//
//   @Test
//   public void find_returnsHeroWithTheStatedId_secondHero(){
//     Hero firstHero = new Hero("spiderman");
//     Hero secondHero = new Hero("superman");
//     assertEquals(Hero.find(secondHero.getHeroId()),secondHero);
//   }
//
// }
