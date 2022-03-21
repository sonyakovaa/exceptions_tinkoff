package exceptions;

import com.sun.source.tree.BreakTree;

public class CountryOpenChecker {

    public static String getOpen(final Country country) throws NoSuchCountryException {
        switch (country) {
            case RUSSIA:
            case CHILI:
                return "open";
            case USA:
            case HUNGARY:
                return "limited open";
            /* FIXME: Символ С является символом из кириллицы */
            case CHINA:
            case UK:
                return "closed";
            default:
                throw new NoSuchCountryException();
        }
    }
}
