package First;

public class Main {

    public static void main(String[] args) {

        String scannedText = ReadFromConsole.textScan();
        String convertedText = ConvertingText.toMorseConvert(scannedText);
        System.out.println(convertedText);

    }
}
