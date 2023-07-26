package com.jjh.app;

import com.jjh.messages.MessageGenerator;

public class App {
  public static void main(String [] args) {
    MessageGenerator mg = new MessageGenerator();
    String msg = mg.getMessage();
    System.out.println(msg);
  }
}
