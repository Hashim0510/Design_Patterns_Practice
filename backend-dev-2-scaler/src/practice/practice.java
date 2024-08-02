package practice;

import java.util.ArrayList;
import java.util.List;

public class practice {

    private static boolean flag = false;

    public static void main(String[] args) {

//        student st1 = new student(2, "hashim");
//
//        student st2 = new student(st1);
//
//        System.out.println("st2 VALUE : " + System.identityHashCode(st2.value) + " " +   st2.value);
//        System.out.println("st1 VALUE : " + System.identityHashCode(st1.value) + " " +   st1.value);
//        st2.name = "divya";
//
//        st1.value = 10;
//
//        System.out.println("after st2 VALUE : " + System.identityHashCode(st2.value) + " " +  st2.value);
//        System.out.println("after st1 VALUE : " + System.identityHashCode(st1.value) + " " +  st1.value);

//        System.out.println("after st2 VALUE : " + System.identityHashCode(st2.name));
//
//        System.out.println("after st1 VALUE : " + System.identityHashCode(st1.name));
//
//        int value = playingCricket.cricket;
//
//        C c = new C();
//        c.fun();
//        c.fun1();
//        c.fun2();

//
//        parent p  = new child();
//
//        p.display();
//
//        List<Integer> l = new ArrayList<>();
//        l.add("hashim");

//        innerclasses innerclasses = new innerclasses();
//
//        innerclasses.method1();

//        new Thread(
//                ()->{
//                  System.out.println("hello from thread");
//
//                }
//        ).start();
//
//        Thread writerThread = new Thread(() -> {
//            try {
//                Thread.sleep(10); // Simulate some work with a delay
//            } catch (InterruptedException e) {
//                Thread.currentThread().interrupt();
//            }
//            System.out.println("Flag updated to true by writer thread");
//            flag = true; // Update the flag
//            System.out.println("Flag updated to true by writer thread");
//        });
//
//        Thread readerThread = new Thread(() -> {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            while ( flag) {
////                Thread.onSpinWait();
//                // Busy-wait until the flag becomes true
//                System.out.println("Reader thread detected flag change  " + flag
//                );
//            }
//            System.out.println("Reader thread detected flag change"
//            );
//        });
//
//        writerThread.start();
//        readerThread.start();

        practice Practice = new practice();
        boolean f = practice.flag;
        boolean f2 = Practice.flag;
        System.out.println(f + ""  + f2);







    }
}
