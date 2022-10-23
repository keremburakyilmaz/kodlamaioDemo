package core.logger;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Veritabanına kaydedildi: " + message);
    }
}
