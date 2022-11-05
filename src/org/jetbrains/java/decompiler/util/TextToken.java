package org.jetbrains.java.decompiler.util;

public class TextToken {
  public int start;
  public int end;
  public final String text;
  public final String data;
  public final boolean def;
  public final Type type;

  public TextToken(int start, int end, String text, String data, boolean def, Type type) {
    this.start = start;
    this.end = end;
    this.text = text;
    this.data = data;
    this.def = def;
    this.type = type;
  }

  public void shift(int i) {
    this.start += i;
    this.end += i;
  }

  public TextToken copy() {
    return new TextToken(start, end, text, data, def, type);
  }

  public TextToken copyShifted(int i) {
    return new TextToken(start + i, end + i, text, data, def, type);
  }

  @Override
  public String toString() {
    return type + (def ? " (def) " : " ") + (text.equals(data) ? text : text + " " + data);
  }

  public enum Type {
    CLASS,
    FIELD,
    METHOD,
    LOCAL,
    PACKAGE
  }
}
