public class LogLevels {
    
    public static String message(String logLine) {
        int posicao =  logLine.indexOf(':');
        String newMessage = logLine.substring(posicao + 1);
        return newMessage.trim();
    }

    public static String logLevel(String logLine) {
        int posicao = logLine.indexOf(']');
        String newMessage = logLine.substring(1, posicao);
        return newMessage.toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
