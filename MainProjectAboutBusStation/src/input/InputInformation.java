package input;

import java.util.Scanner;


public class InputInformation {

    public int inputInt()
    {
        Scanner in = new Scanner(System.in);
        int numberInt;
        numberInt = in.nextInt();
        return numberInt;
    }

    public String inputString()
    {
        Scanner in = new Scanner(System.in);
        String inputLine;
        inputLine = in.nextLine();
        return inputLine;
    }

}
