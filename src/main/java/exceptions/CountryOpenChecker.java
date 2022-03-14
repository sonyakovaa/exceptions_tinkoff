package exceptions;

public class CountryOpenChecker {

    public static String getOpen(final Country country) {
        switch (country.name()) {
            case "RUSSIA":
            case "CHILI":
                return "open";
            case "USA":
            case "HUNGARY":
                return "limited open";
            case "СHINA":
            case "UK":
                return "closed";
            default:
                throw new exceptions.NoSuchCountryException();
        }
    }
}
