package com.lab.levelup.thread.start;

import static com.lab.levelup.util.MyLogger.log;

public class InnerRunnableMainV2 {

  public static void main(String[] args) {
    log("main() start");
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        log("run()");
      }
    };

    Thread thread = new Thread(runnable);
    thread.start();

    log("main() end");
  }

}
