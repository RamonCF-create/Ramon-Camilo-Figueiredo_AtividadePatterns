package adapter_Estrutural;

public class LegacyLogger {

    public void log(String level, String text) {
        System.out.println("[" + level + "] " + text);
    }

}