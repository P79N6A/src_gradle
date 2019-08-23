package com.umeng.message;

import android.annotation.TargetApi;
import com.umeng.message.entity.UNotificationItem;
import java.util.LinkedList;

public class MessageNotificationQueue {

    /* renamed from: b  reason: collision with root package name */
    private static MessageNotificationQueue f81053b;

    /* renamed from: a  reason: collision with root package name */
    private LinkedList<UNotificationItem> f81054a = new LinkedList<>();

    public LinkedList<UNotificationItem> getQueue() {
        return this.f81054a;
    }

    public int size() {
        return this.f81054a.size();
    }

    private MessageNotificationQueue() {
    }

    @TargetApi(9)
    public UNotificationItem pollFirst() {
        return this.f81054a.pollFirst();
    }

    public static synchronized MessageNotificationQueue getInstance() {
        MessageNotificationQueue messageNotificationQueue;
        synchronized (MessageNotificationQueue.class) {
            if (f81053b == null) {
                f81053b = new MessageNotificationQueue();
            }
            messageNotificationQueue = f81053b;
        }
        return messageNotificationQueue;
    }

    public void addLast(UNotificationItem uNotificationItem) {
        this.f81054a.addLast(uNotificationItem);
    }

    public void remove(UNotificationItem uNotificationItem) {
        this.f81054a.remove(uNotificationItem);
    }
}
