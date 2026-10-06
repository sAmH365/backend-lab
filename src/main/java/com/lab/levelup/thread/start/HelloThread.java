package com.lab.levelup.thread.start;

public class HelloThread extends Thread {

  @Override
  public void run() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println(Thread.currentThread().getName() + " : run()");
  }

}
