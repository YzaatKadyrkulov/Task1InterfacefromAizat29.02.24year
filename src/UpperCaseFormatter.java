import java.util.Locale;

public class UpperCaseFormatter implements MessageFormatter{
    @Override
    public void formatMessage(String message) {
        System.out.println(message.toUpperCase(Locale.of("yzaat")));
    }
}
