import java.util.Locale;

public class LoweCaseFormatter implements MessageFormatter{


    @Override
    public void formatMessage(String message) {
        System.out.println(message.toLowerCase(Locale.of("YZAAT")));
    }
}

