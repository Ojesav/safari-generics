package shopping;

import java.time.LocalDate;

public class UsePair {
  public static void main(String[] args) {
    Pair<String> p = new Pair<>("Left", "Right");
//    p.setLeft(LocalDate.now());
    String s = p.getRight();

    Pair<LocalDate> pld = new Pair<>(LocalDate.now(), LocalDate.now());
    LocalDate ld = pld.getLeft();
  }
}
