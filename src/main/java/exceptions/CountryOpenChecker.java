package exceptions;

public class CountryOpenChecker {

    public static String getOpen(final Country country) throws NoSuchCountryException {
        return switch (country) {
            case RUSSIA, CHILI -> "open";
            case USA, HUNGARY -> "limited open";
            /* FIXME: Символ С является символом из кириллицы */
            case CHINA, UK -> "closed";
            default -> throw new NoSuchCountryException();
        };
    }
}
