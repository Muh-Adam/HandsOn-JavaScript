package notifikasi.multiplatform.app;

import notifikasi.multiplatform.notifikasi.EmailNotifier;
import notifikasi.multiplatform.notifikasi.SmsNotifier;
import notifikasi.multiplatform.notifikasi.TelegramNotifier;
import notifikasi.multiplatform.notifikasi.WhatsAppNotifier;
import notifikasi.multiplatform.service.NotificationService;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        new NotificationService(new EmailNotifier()).sendNotification("Halo, ini email test!");
        new NotificationService(new SmsNotifier()).sendNotification("Ini SMS test!");
        new NotificationService(new WhatsAppNotifier()).sendNotification("Ini pesan WhatsApp test!");
        new NotificationService(new TelegramNotifier()).sendNotification("Ini pesan Telegram test!");
    }
}