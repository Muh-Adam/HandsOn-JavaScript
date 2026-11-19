package notifikasi.multiplatform.service;

import java.util.Objects;
import notifikasi.multiplatform.notifikasi.Notifier;

public final class NotificationService {
    private final Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = Objects.requireNonNull(notifier, "notifier tidak boleh null");
    }

    public void sendNotification(String message) {
        notifier.send(Objects.requireNonNull(message, "message tidak boleh null"));
    }
}