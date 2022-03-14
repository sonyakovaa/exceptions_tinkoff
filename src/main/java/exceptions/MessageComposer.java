package exceptions;

public class MessageComposer {

    public static String getInstructions() {
        final StringBuilder message = new StringBuilder();
        message.append("----------------------------------\n");
        for (Country c : Country.values()) {
            message.append(c).append("\n");
        }
        message.append("\tPrint country or Q to quit");
        return message.toString();
    }

    public static String getFinalMessage(final Country country, final String open) {
        return "Country [" + country + "] is " + open + " for visits.";
    }
}
