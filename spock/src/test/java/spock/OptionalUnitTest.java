package spock;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import spock.util.Optional;

public class OptionalUnitTest {
  @Test
  public void checkNull() throws Exception {

    Optional<String> optional = Optional.empty();

    assertEquals(optional.isPresent(), false);
  }

  @Test
  public void checkNonNull() throws Exception {

    String str = "Hello";
    Optional<String> optional = Optional.ofNullable(str);

    assertEquals(optional.isPresent(), true);
  }
}