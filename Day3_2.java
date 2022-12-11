import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;

public class Day3_2 {
    public static void main(String args[]) throws IOException {  //static method
        String input = Files.readString(Path.of("InputDay3.txt"));
        HashMap<Character,Integer> intToString = new HashMap<Character, Integer>();

        int score = 0;
        String alph = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        boolean find = false;

        String[] inputarray = input.split("\n");
        String first;
        String second;
        String third;


        for (int s = 0; s<= inputarray.length-1;s+=3) {
            first = inputarray[s];
            second = inputarray[s+1];
            third =  inputarray[s+2];

        for(int i = 0;i <= first.length()-1;i++){
            for(int j = 0;j <= second.length()-1;j++){
                //System.out.println(b.charAt(i) == c.charAt(j));
                if(first.charAt(i) == second.charAt(j)){
                    for(int x=0;x <=third.length()-1;x++){
                        if(first.charAt(i) ==third.charAt(x)){
                            find = true;

                            System.out.println(first.charAt(i));
                            for(int z = 0;z <= alph.length()-1;z++){
                                if(alph.charAt(z) == first.charAt(i)){
                                    System.out.println(z+1);
                                    score += (z+1);

                                }
                            }
                            break;
                        }

                    }
                    if(find) break;
                    }
                if(find) break;
                }
            if(find) break;
            }
        find = false;
        }
        System.out.println(score);
    }
}
