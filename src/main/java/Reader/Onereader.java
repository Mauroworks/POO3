
package Reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Onereader {

    public static void main(String[] args) {
        String csvFile = "primos.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplitBy = ",";

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
               
                String[] numerosPrimosStr = line.split(csvSplitBy);
                List<Integer> numerosPrimos = new ArrayList<>();
                
                for (String numeroStr : numerosPrimosStr) {
                    try {
                        int numero = Integer.parseInt(numeroStr.trim());
                        numerosPrimos.add(numero);
                    } catch (NumberFormatException e) {
                       
                        System.err.println("Error al convertir número: " + e.getMessage());
                    }
                }
                
                
                System.out.println("Numeros primos encontrados: " + numerosPrimos);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


    
