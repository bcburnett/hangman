/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;

/**
 *
 * @author brian
 */
public class Letters {

  public String letter;
  public boolean correct = false;

  public Letters(String s) {
    letter = s;
    if (s.matches("[ .'?!,&-]")) {
      correct = true;
    }
  }

  public Letters(String s, boolean b) {
    letter = s;
    correct = b;
  }
}
