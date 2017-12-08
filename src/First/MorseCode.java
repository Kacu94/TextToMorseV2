package First;



/**
 * Created by Kacper on 2017-12-04.
 */
public class MorseCode {

    public static String morseAlphabet(String signChar) {

        String signMorse = null;


        switch (signChar.toLowerCase()) {
            case "a":
                signMorse = "· − ";
                return signMorse;

            case "b":
                signMorse = "− · · · ";
                return signMorse;

            case "c":
                signMorse = "− · − ·  ";
                return signMorse;

            case "d":
                signMorse = "− · · ";
                return signMorse;

            case "e":
                signMorse = "· ";
                return signMorse;

            case "f":
                signMorse = "· · − · ";
                return signMorse;

            case "g":
                signMorse = "− − · ";
                return signMorse;

            case "h":
                signMorse = "· · · · ";
                return signMorse;

            case "i":
                signMorse = "· · ";
                return signMorse;

            case "j":
                signMorse = "· − − − ";
                return signMorse;

            case "k":
                signMorse = "− · − ";
                return signMorse;

            case "l":
                signMorse = "· − · · ";
                return signMorse;

            case "m":
                signMorse = "− − ";
                return signMorse;

            case "n":
                signMorse = "− · ";
                return signMorse;

            case "o":
                signMorse = "− − − ";
                return signMorse;

            case "p":
                signMorse = "· − − · ";
                return signMorse;

            case "q":
                signMorse = "− − · − ";
                return signMorse;

            case "r":
                signMorse = "· − · ";
                return signMorse;

            case "s":
                signMorse = "· · · ";
                return signMorse;

            case "t":
                signMorse = "− ";
                return signMorse;

            case "u":
                signMorse = "· · − ";
                return signMorse;

            case "v":
                signMorse = "· · · − ";
                return signMorse;

            case "w":
                signMorse = "· − − ";
                return signMorse;

            case "x":
                signMorse = "− · · − ";
                return signMorse;

            case "y":
                signMorse = "− · − − ";
                return signMorse;

            case "z":
                signMorse = "− − · · ";
                return signMorse;

            case "0":
                signMorse = "− − − − − ";
                return signMorse;

            case "1":
                signMorse = "· − − − − ";
                return signMorse;

            case "2":
                signMorse = "· · − − − ";
                return signMorse;

            case "3":
                signMorse = "· · · − − ";
                return signMorse;

            case "4":
                signMorse = "· · · · − ";
                return signMorse;

            case "5":
                signMorse = "· ·· · ·  ";
                return signMorse;

            case "6":
                signMorse = "−· · · · ";
                return signMorse;

            case "7":
                signMorse = "− −· · ·  ";
                return signMorse;

            case "8":
                signMorse = " − −−· ·  ";
                return signMorse;

            case "9":
                signMorse = " −− −−·  ";
                return signMorse;

            case " ":
                signMorse = "/ ";
                return signMorse;



        }
    return String.valueOf(0);
    }
}