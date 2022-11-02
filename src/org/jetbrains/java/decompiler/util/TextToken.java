package org.jetbrains.java.decompiler.util;

public class TextToken {
  public int start;
  public int end;
  public final String text;
  public final String data;
  public final boolean def;

  public TextToken(int start, int end, String text, String data, boolean def) {
    this.start = start;
    this.end = end;
    this.text = text;
    this.data = data;
    this.def = def;
  }

  public void shift(int i) {
    this.start += i;
    this.end += i;
  }

  public TextToken copyShifted(int i) {
    return new TextToken(start + i, end + i, text, data, def);
  }
}
