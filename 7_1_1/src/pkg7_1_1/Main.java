
package pkg7_1_1;

import console.Console;
public class Main {

    public static void main(String[] args) {
       
        int max = 10;
        int vetor[] = new int [max];
        
        for (int i = 0; i < max; i++) 
        {
            vetor[i] = i;
        }
                
        for (int i = 0; i < max; i++) 
        {
          Console.writeLn("Numero: " + vetor[i]);     
        }
      
    }
    
}
