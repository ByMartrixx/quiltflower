package pkg;

import java.util.function.Function;

public class TestTextTokens {
  private Bee bee = new Bee();

  public void foo() {
    bar("Hello world");
    bee.buzz();

    method(method(string -> method(s1 -> s1 + "lorem ipsum dolor sit amet") + string)).apply("Lorem ipsum dolor sit amet");
  }

  private static void bar(String s) {
    System.out.println(s);
  }

  private static Function<String, String> method(Function<String, String> s) {
    return s.andThen(str -> str.replace(" ", ""));
  }

  @Deprecated
  private class Bee {
    public void buzz() {
      bar("bzzz");
    }
  }
}
