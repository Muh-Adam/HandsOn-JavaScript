package notifikasi.multiplatform.notifikasi;

public final class TelegramNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Mengirim Telegram: " + message);
    }
}