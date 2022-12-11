import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.stream.IntStream;

public class Day3_1 {
    public static void main(String args[]) throws IOException {  //static method
        String input = Files.readString(Path.of("InputDay3.txt"));
        HashMap<Character,Integer> intToString = new HashMap<Character, Integer>();
        System.out.println('a'*2 % 52);
        String[] inputarray = input.split("\n");
        String first;
        String second;


        for (String a:
             inputarray) {
            first = a.substring(0,a.length()/2);
            second = a.substring(a.length()/2);
        for(int i = 0;i <= first.length()-1;i++){
            for(int j = 0;j <= second.length()-1;j++){
                //System.out.println(b.charAt(i) == c.charAt(j));
                if(first.charAt(i) == second.charAt(j)){
                    System.out.println(first.charAt(i));
                }
            }
        }
        }
    }
}
