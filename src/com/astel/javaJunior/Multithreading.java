package com.astel.javaJunior;

/**
 * Created by Александр on 14.03.2017.
 * When extends Thread class, each of your threads creates unique object and associate with it
 *
 * When implements Runable, it shares the same object to multiple threads.
 * You can save a space for your class to extend any other class
 */

public class Multithreading {

public static int N = 10;

    static  void work(){
        for(int i=0; i<N; i++){
            System.out.println(Thread.currentThread().getId() + " " + Thread.currentThread().getName()+ " " + i);
            try{
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                Thread.currentThread().interrupt();
            }
        }
    }

    /**
     * Thread methods:
     * start
     * name,id,priority...
     */
    static class ThreadSample extends Thread{
        ThreadSample(){
            start();

        }

        @Override
        public void run(){
            work();
        }

    }

    /**
     * Runnable = Object + public void run()
     */
    static class RunnableSamle implements Runnable{
        Thread thread;

        RunnableSamle(){
            thread = new Thread(this);
            thread.start();
        }

        public void run(){
            work();
        }
    }

    public static void main(String[] args) {

        ThreadSample thread = new ThreadSample();
        RunnableSamle runabble = new RunnableSamle();

        work();

    }
}
