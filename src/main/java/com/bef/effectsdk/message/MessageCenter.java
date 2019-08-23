package com.bef.effectsdk.message;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Keep
public class MessageCenter {
    private static List<a> sInterceptors = new ArrayList();
    private static a sListener;
    private static HandlerThread sMessageCenterThread;
    private static Handler sMessageHandler;

    public interface a {
        void onMessageReceived(int i, int i2, int i3, String str);
    }

    static class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            MessageCenter.handleMessage(message);
        }
    }

    private static void installBuiltinInterceptor() {
    }

    public static synchronized void destroy() {
        synchronized (MessageCenter.class) {
            if (sMessageCenterThread != null) {
                sMessageCenterThread.quit();
                sMessageCenterThread = null;
            }
            if (sMessageHandler != null) {
                sMessageHandler.removeCallbacksAndMessages(null);
                sMessageHandler = null;
            }
            Iterator<a> it2 = sInterceptors.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
            sInterceptors.clear();
            sListener = null;
        }
    }

    public static synchronized void init() {
        synchronized (MessageCenter.class) {
            if (sMessageCenterThread == null || !sMessageCenterThread.isAlive()) {
                HandlerThread handlerThread = new HandlerThread("MessageCenter");
                sMessageCenterThread = handlerThread;
                handlerThread.start();
            }
            sMessageHandler = new b(sMessageCenterThread.getLooper());
            installBuiltinInterceptor();
        }
    }

    public static synchronized void setListener(a aVar) {
        synchronized (MessageCenter.class) {
            sListener = aVar;
        }
    }

    public static synchronized void handleMessage(Message message) {
        synchronized (MessageCenter.class) {
            Iterator<a> it2 = sInterceptors.iterator();
            while (it2.hasNext() && !it2.next().a()) {
            }
            if (sListener != null) {
                sListener.onMessageReceived(message.what, message.arg1, message.arg2, (String) message.obj);
            }
        }
    }

    @Keep
    private static synchronized void postMessage(int i, int i2, int i3, String str) {
        synchronized (MessageCenter.class) {
            if (sMessageHandler != null) {
                Message.obtain(sMessageHandler, i, i2, i3, str).sendToTarget();
            }
        }
    }
}
