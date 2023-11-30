package tarea3;

import java.util.Random;

public class NumAleatorio {
    public static void main(String[] args) {
        
        Random random = new Random();

        
        System.out.println("20 Random Numbers:");
        for (int i = 0; i < 30; i++) {
            int randomNumber = random.nextInt(10)+1; 
            System.out.println(randomNumber);
        }
    }
}