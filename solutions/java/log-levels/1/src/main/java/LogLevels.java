
public class LogLevels {

    public static String message(String logLine) {
        int posicao = logLine.indexOf(":");
        return logLine.substring(posicao + 1).trim();
    }

    public static String logLevel(String logLine) {
        int posicao = logLine.indexOf("]");
        return logLine.substring(1, posicao).toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
