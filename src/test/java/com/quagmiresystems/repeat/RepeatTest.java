package com.quagmiresystems.repeat;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RepeatTest {
  
  private Repeat repeat = new Repeat();
  
  @Test
  public void testRepeatFound() {
    assertEquals('j', repeat.firstRepeater("abcdefghijklmnopjklmnop".toCharArray()));
  }
  
  @Test
  public void testRepeatNotFound() {
    assertEquals((char)-1, repeat.firstRepeater("abcdefghijklmnop".toCharArray()));
  }

}
