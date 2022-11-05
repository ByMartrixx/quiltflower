package org.jetbrains.java.decompiler.main.collectors;

import org.jetbrains.java.decompiler.util.TextToken;

import java.util.ArrayList;
import java.util.List;

public class TextTokenCollector {
  private final List<TextToken> tokens = new ArrayList<>();

  public void addAll(List<TextToken> tokens) {
    this.tokens.addAll(tokens);
  }

  public TextToken[] getTokens() {
    return tokens.toArray(new TextToken[0]);
  }
}
