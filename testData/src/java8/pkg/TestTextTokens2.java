package pkg;

public class TestTextTokens2 {
  public void foo() {
    System.out.println(newLine(newLine(newLine("Lorem ipsum dolor sit amet, consectetur adipiscing"))));
  }

  public String newLine(String s) {
    return s + "\n";
  }
}
