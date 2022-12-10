import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Day2_2 {
    public static void main(String args[]) throws IOException{  //static method
        String input = Files.readString(Path.of("InputDay2.txt"));
        int score = 0;

        String[] inputarray = input.split("\n");
        System.out.println(inputarray[0].contains("C") && inputarray[0].contains("X"));
        // A Rock(1)
        // B Paper(2)
        // C Scissor(3)
        // X Loss 0
        // Y Draw 3
        // Z Win  6
        for (String a :
                inputarray) {
            if (a.contains("A")) {
                if(a.contains("X")){
                    // Loose with Scissor
                    score += 3;
                }
                if(a.contains("Y")){
                    //Draw with Rock
                    score += 4;
                }
                if(a.contains("Z")){
                    //Win with Paper
                    score += 8;
                }
            }

            if (a.contains("B")) {
                if(a.contains("X")){
                    // Loose with Rock
                    score += 1;
                }
                if(a.contains("Y")){
                    //Draw with Paper
                    score += 5;
                }
                if(a.contains("Z")){
                    //Win with Scissor
                    score += 9;
                }
            }

            if (a.contains("C")) {
                if(a.contains("X")){
                    // Loose with Paper
                    score += 2;
                }
                if(a.contains("Y")){
                    //Draw with Scissor
                    score += 6;
                }
                if(a.contains("Z")){
                    //Win with Rock
                    score += 7;
                }
            }
        }
        System.out.println(score);

    }
}
