package com.facebook.react.bridge.queue;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public class MessageQueueThreadHandler extends Handler {
    private final QueueThreadExceptionHandler mExceptionHandler;

    public void dispatchMessage(Message message) {
        try {
            super.dispatchMessage(message);
        } catch (Exception e2) {
            this.mExceptionHandler.handleException(e2);
        }
    }

    public MessageQueueThreadHandler(Looper looper, QueueThreadExceptionHandler queueThreadExceptionHandler) {
        super(looper);
        this.mExceptionHandler = queueThreadExceptionHandler;
    }
}
