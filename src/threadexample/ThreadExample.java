/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threadexample;

/**
 *
 * @author mirek
 */
public class ThreadExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyThread myThread;
        Thread t;
        myThread = new MyThread(10,1000);
                     t = new Thread(myThread);
                    t.start();

           try {
            Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                System.out.println("Wyjątek podczas snu");
            }                    
                    
        myThread = new MyThread(15,1300);
                     t = new Thread(myThread);
                    t.start();
    }
    
}
