import java.util.ArrayList;
import java.util.Scanner;

public class sorter {

    private static ArrayList<String> userInput = new ArrayList<String>();

    private static void reverse(ArrayList<String> array){

        for (int i = 0; i < array.size(); i++){

            String element = array.get(i);
            String setter = "";
            for (int k = 0; k< element.length(); k++){
                char temp = element.charAt(element.length() - k - 1);
                setter += temp;
            }

            array.set(i, setter);

        }

    }

    private static void alphabetize(ArrayList<String> array){
        int length = array.size();

        for (int i = 0; i < length; i++){
            int minIndex = i;
            for (int j = i+1; j < length; j++){
                String indexI = array.get(i);
                String indexJ = array.get(j);
                if (indexJ.compareTo(indexI) < 0){
                    minIndex = j;
                }
            }

            String temp = array.get(i);
            array.set(i, array.get(minIndex));
            array.set(minIndex, temp);

        }

        userInput = array;

    }

    private static void print(ArrayList<String> array){
        for (String line : array){
            System.out.println(line);
        }
    }

    public static void main (String[] ivara){

        System.out.println("Type your input. Enter in \" -h\" if you need help.");
        Scanner in = new Scanner(System.in);
        String input = "";
        String word = "";

        boolean reverse = false;
        boolean alphabetize = false;

        while (in.hasNext()) {
            input = in.nextLine();
            if (input.contains("-r")) {
                reverse = true;
                break;
            } else if (input.contains("-a")) {
                alphabetize = true;
                break;
            } else if (input.contains("-q")) {
                break;
            } else if (input.contains("-h")) {
                System.out.println("Need Some help ?"
                        + " Don't worry! \n The commands for this program are : \n"
                        + " \" -q \": END INPUT PROGRAM AND ECHO\n"
                        + " \" -r \": REVERSES INPUT AND ECHO"
                        + " \" -a \": ALPHABETIZE INPUT IN ASCENDING ORDER AND ECHO BACK \n");
            } else {
                userInput.add(input.toLowerCase().trim());
            }
        }
            in.close();

            if (reverse){
                reverse(userInput);
                print(userInput);
            } else if (alphabetize){
                alphabetize(userInput);
                print(userInput);
            } else {
                print(userInput);
            }
            System.out.println("----------------------------------");
            System.out.println("Thank for using Sorter By Ivara !");
            System.out.println("----------------------------------");


    }

}
