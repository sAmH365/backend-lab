package com.lab.levelup.thread.start;

public class HelloThreadMain {

  public static void main(String[] args) throws InterruptedException {

    System.out.println(Thread.currentThread().getName() + ": main() start");

    HelloThread ht = new HelloThread();
//    ht.run(); run() 이 아니라 start()를 호출해야 별도의 스레드에서 run()코드가 실행된다
    System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
    ht.start();
    System.out.println(Thread.currentThread().getName() + ": start() 호출 후");

    System.out.println(Thread.currentThread().getName() + ": main() end");
  }

}
