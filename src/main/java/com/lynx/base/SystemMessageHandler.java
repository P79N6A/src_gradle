package com.lynx.base;

import android.os.Handler;
import android.os.Message;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SystemMessageHandler extends Handler {
    private boolean mIsRunning;
    private Method mMessageMethodSetAsynchronous;
    private long mMessagePumpDelegateNative;

    private native void nativeRunWork(long j);

    @DoNotStrip
    @CalledByNative
    private void stop() {
        this.mIsRunning = false;
    }

    @DoNotStrip
    @CalledByNative
    private void scheduleWork() {
        sendMessage(obtainAsyncMessage(1));
    }

    @DoNotStrip
    @CalledByNative
    public static SystemMessageHandler create(long j) {
        return new SystemMessageHandler(j);
    }

    @DoNotStrip
    private SystemMessageHandler(long j) {
        this.mMessagePumpDelegateNative = j;
        try {
            this.mMessageMethodSetAsynchronous = Class.forName("android.os.Message").getMethod("setAsynchronous", new Class[]{Boolean.TYPE});
        } catch (ClassNotFoundException | NoSuchMethodException | RuntimeException unused) {
        }
        this.mIsRunning = true;
    }

    @DoNotStrip
    public void handleMessage(Message message) {
        if (this.mIsRunning) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                nativeRunWork(this.mMessagePumpDelegateNative);
            }
        }
    }

    @DoNotStrip
    private Message obtainAsyncMessage(int i) {
        Message obtain = Message.obtain();
        obtain.what = i;
        if (this.mMessageMethodSetAsynchronous != null) {
            try {
                this.mMessageMethodSetAsynchronous.invoke(obtain, new Object[]{Boolean.TRUE});
            } catch (IllegalAccessException unused) {
                this.mMessageMethodSetAsynchronous = null;
            } catch (IllegalArgumentException unused2) {
                this.mMessageMethodSetAsynchronous = null;
            } catch (InvocationTargetException unused3) {
                this.mMessageMethodSetAsynchronous = null;
            } catch (RuntimeException unused4) {
                this.mMessageMethodSetAsynchronous = null;
            }
        }
        return obtain;
    }
}
