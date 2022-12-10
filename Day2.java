import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Day2 {
    public static void main(String args[]) throws IOException{  //static method
        String input = Files.readString(Path.of("InputDay2.txt"));
        int score = 0;

        String[] inputarray = input.split("\n");
        System.out.println(inputarray[0].contains("C") && inputarray[0].contains("X"));
        // A X Rock(1)
        // B Y Paper(2)
        // C Z Scissor(3)
        // Draw 3
        // Loss 0
        // Win  6
        for (String a :
                inputarray) {
            if (a.contains("A")) {
                if(a.contains("X")){
                    // draw Rock
                    score += 4;
                }
                if(a.contains("Y")){
                    score += 8;
                }
                if(a.contains("Z")){
                    score += 3;
                }
            }

            if (a.contains("B")) {
                if(a.contains("X")){
                    score += 1;
                }
                if(a.contains("Y")){
                    score += 5;
                }
                if(a.contains("Z")){
                    score += 9;
                }
            }

            if (a.contains("C")) {
                if(a.contains("X")){
                    score += 7;
                }
                if(a.contains("Y")){
                    score += 2;
                }
                if(a.contains("Z")){
                    score += 6;
                }
            }
        }
        System.out.println(score);

    }
}
