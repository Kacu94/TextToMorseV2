package First;
import java.util.Scanner;


/**
 * Created by Kacper on 2017-12-06.
 */
public class ReadFromConsole {

    public static String textScan(){

        Scanner scannedText = new Scanner(System.in);
        System.out.println("Type in text to convert");
        String rawtext = scannedText.nextLine();

        return rawtext;
    }


}
