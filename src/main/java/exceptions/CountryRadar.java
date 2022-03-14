package exceptions;

import java.util.Scanner;

import static exceptions.Country.getCountry;
import static exceptions.CountryOpenChecker.getOpen;
import static exceptions.Logger.log;
import static exceptions.MessageComposer.getFinalMessage;
import static exceptions.MessageComposer.getInstructions;

public class CountryRadar {

    public void launch() {
        final Scanner scanner = new Scanner(System.in);
        String input;
        Country country;
        String open = "";
        String finalMessage;
        while (true) {
            log(getInstructions());

            input = scanner.nextLine().trim();
            if (" q ".equalsIgnoreCase(input)) {
                log("Whatever!");
                break;
            }

            country = getCountry(input);
            if (country == null) {
                log("Country name input incorrect, try again");
                continue;
            }

            open = getOpen(country);
            finalMessage = getFinalMessage(country, open);

            log(finalMessage);
        }
        scanner.close();
    }

}
