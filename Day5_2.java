import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Day5_2 {
    public static void main(String args[]) throws IOException {  //static method
        String input = Files.readString(Path.of("InputDay5.txt"));
        int score = 0;
        int lineOfStackAmount = 0;
        String[] inputArray = input.split("\n");
        String[] inputMatrix = input.split("\nmove");
        String[] Matrix = inputMatrix[0].split("\n");

        List<Character> charList = new ArrayList<>();

        int stackAmount = 0;
        for (int i = 0; i < Matrix.length; i++) {
            if (!Matrix[i].contains("[")) {
                stackAmount = StringToInt(Matrix[i]);

                //stackArray = new Stack[stackAmount%10];
                lineOfStackAmount = i;
                break;
            }
        }
        Stack[] stackArray = new Stack[stackAmount%10];
        for (int i = 0;i< stackArray.length;i++){
            stackArray[i]=new Stack<>();
        }

        for (int i = lineOfStackAmount-1; i >= 0; i--) {
            for (int j = 0; j < stackArray.length; j++) {
                if(Matrix[i].charAt(1+j*4) !=' '){
                //System.out.println(Matrix[i].charAt(1+j*4));
                stackArray[j].push(Matrix[i].charAt(1+j*4));
            }
            }
        }
      //System.out.println(stackArray[1].pop());
      //  System.out.println(inputArray[lineOfStackAmount+2]);

        for (int i = lineOfStackAmount+2;i <inputArray.length; i++){
            String[] commandString = inputArray[i].split(" ");
            int crateAmount = StringToInt(commandString[1]);
            System.out.println(crateAmount);
            int stackFrom = StringToInt(commandString[3]);
            System.out.println(stackFrom);
            int stackTo = StringToInt(commandString[5]);
            System.out.println(stackTo);

            while(crateAmount != 0){
                charList.add((Character) stackArray[stackFrom-1].pop());
                //stackArray[stackTo-1].push(stackArray[stackFrom-1].pop());
                crateAmount--;
            }

            for(int j = charList.size()-1;j >= 0; j--){
                stackArray[stackTo-1].push(charList.get(j));
            }
            charList.removeAll(charList);
        }

        for (Stack s :
                stackArray) {
            System.out.print(s.pop());
        }


    }

    private static int StringToInt(String number){
        return Integer.parseInt(number.replaceAll("[^a-zA-Z0-9]", ""));
    }
}
