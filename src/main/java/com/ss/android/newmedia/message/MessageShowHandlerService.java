package com.ss.android.newmedia.message;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;

public abstract class MessageShowHandlerService extends MessageReceiverService {

    /* renamed from: b  reason: collision with root package name */
    protected static WeakHandler f30230b = new WeakHandler(Looper.getMainLooper(), new WeakHandler.IHandler() {
        public final void handleMsg(Message message) {
        }
    });
}
