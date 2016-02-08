import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class PingPongTest {


  @Test
  public void countPingPong_willReturnAnArray() {
    PingPong testPingPong = new PingPong();
    ArrayList<Integer> numbersArray = new ArrayList<Integer>();
    numbersArray.add(1);
    numbersArray.add(2);
    assertEquals(numbersArray, testPingPong.countPingPong(2));
  }

  @Test
  public void countPingPong_willReplaceNumbersDivisibleBy3WithPing() {
    PingPong testPingPong = new PingPong();
    ArrayList<Object> numbersArray = new ArrayList<Object>();
    numbersArray.add(1);
    numbersArray.add(2);
    numbersArray.add("ping");
    assertEquals(numbersArray, testPingPong.countPingPong(3));
  }

  // @Test
  // public void isPingPong_forNumberDivisibleByFifteen() {
  //   PingPong testPingPong = new PingPong();
  //   assertEquals()
  // }
}
