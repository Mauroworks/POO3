
package Hilos;
import PrimeList.PrimeList;
import PrimesThread.PrimesThread;

public class Ejecucionhilos {

    
    public static void main(String[] args) {
     PrimeList primeList = new PrimeList();
     
   PrimesThread thread1 = new PrimesThread(primeList);
   PrimesThread thread2 = new PrimesThread(primeList);  
     
   Thread t1 = new Thread(thread1);
   Thread t2 = new Thread(thread2);
   
   t1.start();
   t2.start();
   
    try {
          
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

       
        int primesCount = primeList.getPrimesCount();
        System.out.println("Cantidad de numeros primos encontrados: " + primesCount);
    }
}
   
   
    
    

