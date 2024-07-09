
package PrimesThread;
import PrimeList.PrimeList;
import java.util.Random;


public class PrimesThread implements Runnable {
   private PrimeList primeList;
   public PrimesThread(PrimeList primeList) {
        
        this.primeList = primeList;
    }
    @Override
    public void run() {
Random random = new Random();
        int randomNumber = random.nextInt(100);
        if (primeList.isPrime(randomNumber)) {
         
            primeList.add(randomNumber);
            System.out.println("Numero primo encontrado y agregado: " + randomNumber);
        } else {
            System.out.println("Numero no primo: " + randomNumber);
        }
    }
}
        

  
        
 

 


    

     