// import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*; //imports all assert types
import org.junit.*;
import java.util.*;

public class BearTest {

  Bear bear;
  Salmon salmon;
  Human human;
  SmallerBear smallerBear;
  ChickenSatay chickenSatay;
  Chicken chicken;

  @Before
  public void before() {
    bear = new Bear("Baloo");
    salmon = new Salmon();
    human = new Human();
    smallerBear = new SmallerBear();
    chickenSatay = new ChickenSatay();
    chicken = new Chicken();
  }

  @Test
  public void hasName(){
    assertEquals("Baloo", bear.getName());
  }

  @Test
  public void bellyStartsEmpty(){
    assertEquals(bear.foodCount(), 0);
  }

  @Test
  public void canEatSalmon(){
    bear.eat(salmon);
    assertEquals(bear.foodCount(), 1);
  }

  @Test
  public void canEatHuman(){
    bear.eat(human);
    assertEquals(bear.foodCount(), 1);
  }

  @Test
  public void canEatSmallerBear() {
    bear.eat(smallerBear);
    assertEquals(bear.foodCount(), 1);
  }

  @Test
  public void canEatChickenSatay() {
    bear.eat(chickenSatay);
    assertEquals(bear.foodCount(), 1);
  }

  @Test
  public void canEatChicken() {
    bear.eat(chicken);
    assertEquals(bear.foodCount(), 1);
  }

  @Test
  public void canTellUsWhatItAte() {
    bear.eat(chicken);
    bear.eat(chickenSatay);
    ArrayList<String> list = bear.getBellyContents();
    assertEquals("class Chicken", list.get(0));
  }

  /*@Test
  public void canNotEatSalmonWhenBellyFull(){
    for(int i = 0; i<10; i++){
      bear.eat(salmon);
    }
    assertEquals(bear.foodCount(), 5);
  }*/

  @Test
  public void shouldEmptyBellyAfterSleeping(){
    bear.eat(salmon);
    bear.sleep();
    assertEquals(bear.foodCount(), 0);
  }

  @Test
  public void canThrowUp() {
    bear.eat(salmon);
    Edible food = bear.throwUp();
    // assertNotNull(food);
    Salmon original = (Salmon)food; //casting food to Salmon object original
    // assertEquals("swimming", food.swim()); //fails because salmon only has interface methods available to it after being eaten
    assertEquals("swimming", original.swim());
  }
}
