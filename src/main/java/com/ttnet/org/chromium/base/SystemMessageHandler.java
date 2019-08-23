package com.ttnet.org.chromium.base;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import com.ttnet.org.chromium.base.annotations.CalledByNative;
import com.ttnet.org.chromium.base.annotations.MainDex;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@MainDex
public class SystemMessageHandler extends Handler {
    private long mDelayedScheduledTimeTicks;
    private long mMessagePumpDelegateNative;
    private long mMessagePumpNative;

    static class MessageCompat {
        static final MessageWrapperImpl IMPL;

        static class LegacyMessageWrapperImpl implements MessageWrapperImpl {
            private Method mMessageMethodSetAsynchronous;

            LegacyMessageWrapperImpl() {
                try {
                    this.mMessageMethodSetAsynchronous = Class.forName("android.os.Message").getMethod("setAsynchronous", new Class[]{Boolean.TYPE});
                } catch (ClassNotFoundException e2) {
                    Log.e("cr.SysMessageHandler", "Failed to find android.os.Message class", e2);
                } catch (NoSuchMethodException e3) {
                    Log.e("cr.SysMessageHandler", "Failed to load Message.setAsynchronous method", e3);
                } catch (RuntimeException e4) {
                    Log.e("cr.SysMessageHandler", "Exception while loading Message.setAsynchronous method", e4);
                }
            }

            public void setAsynchronous(Message message, boolean z) {
                if (this.mMessageMethodSetAsynchronous != null) {
                    try {
                        this.mMessageMethodSetAsynchronous.invoke(message, new Object[]{Boolean.valueOf(z)});
                    } catch (IllegalAccessException unused) {
                        Log.e("cr.SysMessageHandler", "Illegal access to async message creation, disabling.", new Object[0]);
                        this.mMessageMethodSetAsynchronous = null;
                    } catch (IllegalArgumentException unused2) {
                        Log.e("cr.SysMessageHandler", "Illegal argument for async message creation, disabling.", new Object[0]);
                        this.mMessageMethodSetAsynchronous = null;
                    } catch (InvocationTargetException unused3) {
                        Log.e("cr.SysMessageHandler", "Invocation exception during async message creation, disabling.", new Object[0]);
                        this.mMessageMethodSetAsynchronous = null;
                    } catch (RuntimeException unused4) {
                        Log.e("cr.SysMessageHandler", "Runtime exception during async message creation, disabling.", new Object[0]);
                        this.mMessageMethodSetAsynchronous = null;
                    }
                }
            }
        }

        static class LollipopMr1MessageWrapperImpl implements MessageWrapperImpl {
            LollipopMr1MessageWrapperImpl() {
            }

            @SuppressLint({"NewApi"})
            public void setAsynchronous(Message message, boolean z) {
                message.setAsynchronous(z);
            }
        }

        interface MessageWrapperImpl {
            void setAsynchronous(Message message, boolean z);
        }

        private MessageCompat() {
        }

        static {
            if (Build.VERSION.SDK_INT >= 22) {
                IMPL = new LollipopMr1MessageWrapperImpl();
            } else {
                IMPL = new LegacyMessageWrapperImpl();
            }
        }

        public static void setAsynchronous(Message message, boolean z) {
            IMPL.setAsynchronous(message, z);
        }
    }

    private native void nativeDoRunLoopOnce(long j, long j2, long j3);

    @CalledByNative
    private void removeAllPendingMessages() {
        removeMessages(1);
        removeMessages(2);
    }

    @CalledByNative
    private void scheduleWork() {
        sendMessage(obtainAsyncMessage(1));
    }

    private Message obtainAsyncMessage(int i) {
        Message obtain = Message.obtain();
        obtain.what = i;
        MessageCompat.setAsynchronous(obtain, true);
        return obtain;
    }

    public void handleMessage(Message message) {
        if (message.what == 2) {
            this.mDelayedScheduledTimeTicks = 0;
        }
        nativeDoRunLoopOnce(this.mMessagePumpDelegateNative, this.mMessagePumpNative, this.mDelayedScheduledTimeTicks);
    }

    protected SystemMessageHandler(long j, long j2) {
        this.mMessagePumpDelegateNative = j;
        this.mMessagePumpNative = j2;
    }

    @CalledByNative
    private static SystemMessageHandler create(long j, long j2) {
        return new SystemMessageHandler(j, j2);
    }

    @CalledByNative
    private void scheduleDelayedWork(long j, long j2) {
        if (this.mDelayedScheduledTimeTicks != 0) {
            removeMessages(2);
        }
        this.mDelayedScheduledTimeTicks = j;
        sendMessageDelayed(obtainAsyncMessage(2), j2);
    }
}
