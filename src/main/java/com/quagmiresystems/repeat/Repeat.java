package com.quagmiresystems.repeat;

import java.util.HashSet;
import java.util.Set;

public class Repeat {
  
  public char firstRepeater(char[] chars) {
    Set<Character> seen = new HashSet<>();
    for(char c : chars) {
      if(seen.contains(c)) {
        return c;
      } else {
        seen.add(c);
      }
    }
    return (char) -1;
  }

}
