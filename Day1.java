
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Day1 {

    public static void main(String args[]) throws IOException  //static method
    {
        String input = Files.readString(Path.of("InputDay1.txt"));
        int temp = 0;
        int first = 0;
        int second = 0;
        int third = 0;
        String[] inputarray = input.split("\n");

        for (String a :
                inputarray) {
            if (a.isBlank()) {
                if(first <=temp){
                    third = second;
                    second = first;
                    first = temp;
                } else if (second <= temp) {
                    third = second;
                    second = temp;
                }else if(third <= temp) {
                    third = temp;
                }
                System.out.println(temp);
                temp = 0;
            }else{

                temp += Integer.parseInt(a.replaceAll("[^a-zA-Z0-9]", ""));
            }
        }

        /*
        for(int i = 0; i <= inputarray.length-1;i++){
            if(inputarray[i].isBlank()){

                if(biggest<temp){
                    biggest = temp;
                }
                System.out.println(temp);
                temp = 0;
            }else{

                temp += Integer.parseInt(inputarray[i].replaceAll("[^a-zA-Z0-9]", ""));
            }
        }*/
        
            System.out.println(first + " "+ second+ " "+third);
        System.out.println(first + second+third);


    }
}

