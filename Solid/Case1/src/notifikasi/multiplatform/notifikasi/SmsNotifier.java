package notifikasi.multiplatform.notifikasi;

public final class SmsNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Mengirim SMS: " + message);
    }
}