package com.lab.levelup.thread.start;

import static com.lab.levelup.util.MyLogger.log;

public class ManyThreadMainV2 {

  public static void main(String[] args) {
    log("main() start");

    HelloRunnable runnable = new HelloRunnable();

    for (int i = 1; i <= 100; i++) {
      Thread thread = new Thread(runnable);
      thread.setName("스레드-" + i);
      thread.start();
    }

    log("main() end");
  }
}
