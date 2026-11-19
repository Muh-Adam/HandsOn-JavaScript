package notifikasi.multiplatform.notifikasi;

public final class EmailNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Mengirim EMAIL: " + message);
    }
}