package core.logger;

public class MailLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Maille gönderildi: " + message);
    }
}
