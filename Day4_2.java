import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Day4_2 {
    public static void main(String args[]) throws IOException {  //static method
        String input = Files.readString(Path.of("InputDay4.txt"));

        int score = 0;
        String[] inputarray = input.split("\n");
        String[] tmp;
        String[] first;
        String[] second;

        for (String a :
                inputarray) {
            tmp = a.split(",");

            first = tmp[0].split("-");
            second = tmp[1].split("-");

            if(StringToInt(first[0])<=StringToInt(second[0]) && StringToInt(first[1])>=StringToInt(second[0])
                    ){
                score++;
            } else if (StringToInt(first[0])<=StringToInt(second[1]) && StringToInt(first[1])>= StringToInt(second[1])
                    ) {
                score++;

            }else if(StringToInt(first[0])>=StringToInt(second[0])
                    && StringToInt(first[1])<= StringToInt(second[1])){
                score++;
            } else if (StringToInt(first[0])<=StringToInt(second[0])
                    && StringToInt(first[1])>= StringToInt(second[1])) {
                score++;

            }
        }
        System.out.println(score);

    }

    private static int StringToInt(String number){
        return Integer.parseInt(number.replaceAll("[^a-zA-Z0-9]", ""));
    }
}
