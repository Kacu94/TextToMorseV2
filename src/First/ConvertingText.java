package First;

/**
 * Created by Kacper on 2017-12-06.
 */
public class ConvertingText {

    public static String toMorseConvert(String toConvertText){
        String convertingToMorse;
        String convertedToMorse = "";

        for (int i = 0; i < toConvertText.length(); i++){

            char toConvertSignChar = toConvertText.charAt(i);
            String toConvertSign = String.valueOf(toConvertSignChar);

            convertingToMorse = MorseCode.morseAlphabet(toConvertSign);
            convertedToMorse += convertingToMorse;

        }


        return convertedToMorse;
    }
}
