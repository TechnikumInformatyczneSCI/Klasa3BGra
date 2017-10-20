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
public class MyThread implements Runnable{

    private int count=0;
    private int c=0;
    private static int threadNumber = 0;
    private int number=0;
    private int sleepTime=0;
    
    
    MyThread(int i,int time) {
        number = threadNumber++;
        count = i;
        sleepTime = time;
    }
    
    @Override
    public void run() {
        System.out.println("Startuje nowy wątek. Numer:"+number);
        while (c<count) {
            System.out.println("Tu wątek numer: "+number + " Licznik="+ c);
            c++;
            try {
            Thread.sleep(sleepTime);
            }
            catch(InterruptedException e) {
                System.out.println("Wyjątek podczas snu");
            }
            
        }
        System.out.println("Kończę wątek. Numer:"+number);
        
    }
}
