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

  @Test
  public void countPingPong_willReplaceNumbersDivisiblebyFiveWithPong() {
    PingPong testPingPong = new PingPong();
    ArrayList<Object> numbersArray = new ArrayList<Object>();
    numbersArray.add(1);
    numbersArray.add(2);
    numbersArray.add("ping");
    numbersArray.add(4);
    numbersArray.add("pong");
    assertEquals(numbersArray, testPingPong.countPingPong(5));

  }

  @Test
  public void countPingPong_willReplaceNumbersDivisiblebyFifteenWithPingPong() {
    PingPong testPingPong = new PingPong();
    ArrayList<Object> numbersArray = new ArrayList<Object>();
    numbersArray.add(1);
    numbersArray.add(2);
    numbersArray.add("ping");
    numbersArray.add(4);
    numbersArray.add("pong");
    numbersArray.add("ping");
    numbersArray.add(7);
    numbersArray.add(8);
    numbersArray.add("ping");
    numbersArray.add("pong");
    numbersArray.add(11);
    numbersArray.add("ping");
    numbersArray.add(13);
    numbersArray.add(14);
    numbersArray.add("ping-pong");
    assertEquals(numbersArray, testPingPong.countPingPong(15));

  }

  // @Test
  // public void isPingPong_forNumberDivisibleByFifteen() {
  //   PingPong testPingPong = new PingPong();
  //   assertEquals()
  // }
}
