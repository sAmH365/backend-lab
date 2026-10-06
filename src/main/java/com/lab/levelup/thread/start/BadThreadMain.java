package com.lab.levelup.thread.start;

public class BadThreadMain {

  public static void main(String[] args) throws InterruptedException {

    System.out.println(Thread.currentThread().getName() + ": main() start");

    HelloThread ht = new HelloThread();
//    ht.run(); run() 이 아니라 start()를 호출해야 별도의 스레드에서 run()코드가 실행된다
    System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
    ht.run(); // run()을 호출하면 별도의 스레드가 실행시키는게 아닌 main스레드가 호출 시킴
    System.out.println(Thread.currentThread().getName() + ": start() 호출 후");

    System.out.println(Thread.currentThread().getName() + ": main() end");
  }

}
