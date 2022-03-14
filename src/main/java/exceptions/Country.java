package exceptions;

public enum Country {
    RUSSIA, USA, CHINA, UK, HUNGARY, CHILI;

    public static Country getCountry(final String input) {
        try {
            return valueOf(input.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}