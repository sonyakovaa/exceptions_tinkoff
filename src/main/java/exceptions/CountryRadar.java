package exceptions;

import java.util.Scanner;

import static exceptions.Country.getCountry;
import static exceptions.CountryOpenChecker.getOpen;
import static exceptions.Logger.log;
import static exceptions.MessageComposer.getFinalMessage;
import static exceptions.MessageComposer.getInstructions;

public class CountryRadar {

    public void launch() throws NoSuchCountryException {
        final Scanner scanner = new Scanner(System.in);
        String input;
        Country country;
        String open = "";
        String finalMessage;
        while (true) {
            log(getInstructions());

            input = scanner.nextLine().trim();
            if ("q".equalsIgnoreCase(input)) { // удалила пробел до и после q
                log("Whatever!");
                break;
            }

            country = getCountry(input);
            if (country == null) {
                log("Country name input incorrect, try again");
                continue;
            }

            try {
                open = getOpen(country);
            }
            catch (NoSuchCountryException exception) {
                System.out.println("Country " + input + " not found, try again");
                continue;
            }
            finalMessage = getFinalMessage(country, open);

            log(finalMessage);
        }
        scanner.close();
    }
}
