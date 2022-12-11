import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Day6_1 {
    public static void main(String args[]) throws IOException {  //static method
        String input = Files.readString(Path.of("InputDay6.txt"));
        LinkedList<Character> markerList = new LinkedList<Character>();

        boolean goodToGo = false;
        int markerPos = 0;
        for(int i = 0; i < input.length();i++){
            if(markerList.size() == 4){
                markerList.add(input.charAt(i));
                markerList.remove(0);
                System.out.print(markerList.get(0));
                System.out.print(markerList.get(1));
                System.out.print(markerList.get(2));
                System.out.println(markerList.get(3));
                for (Character c :
                        markerList) {
                    CopyOnWriteArrayList tmp = new CopyOnWriteArrayList<>(markerList);
                    tmp.remove(c);
                    if(tmp.contains(c)){
                        goodToGo = false;
                        break;
                    }
                    goodToGo = true;

                }

            }else {
                markerList.add(input.charAt(i));
            }

            if(goodToGo){
                markerPos = i+1;
                break;
            }
        }

        System.out.println(markerPos);

    }

    private static int StringToInt(String number){
        return Integer.parseInt(number.replaceAll("[^a-zA-Z0-9]", ""));
    }
}
