package com.lab.levelup.thread.start;

public class DaemonThreadMain {

  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName() + " : main() start");
    DaemonThread daemonThread = new DaemonThread();
    daemonThread.setDaemon(true);
    daemonThread.start(); // 사용자스레드가 모두 종료되니깐 데몬스레드가 10초를 기다리지 않고 바로 종료 됨

    System.out.println(Thread.currentThread().getName() + " : main() end");
  }

  static class DaemonThread extends Thread {

    @Override
    public void run() {
      System.out.println(Thread.currentThread().getName() + ": run() start");

      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }

      System.out.println(Thread.currentThread().getName() + ": run() end");
    }
  }
}
