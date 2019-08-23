package com.ss.avframework.opengl;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.AndroidRuntimeException;
import com.ss.avframework.utils.ThreadUtils;

public class GLThread extends HandlerThread {
    private Handler.Callback mCallback;
    private Handler mHandler;

    public synchronized Handler getHandler() {
        if (this.mHandler == null) {
            this.mHandler = new Handler(getLooper(), this.mCallback);
        }
        return this.mHandler;
    }

    public void run() {
        if (GlUtil.nativeAttachThreadToOpenGl()) {
            super.run();
            GlUtil.nativeDetachThreadToOpenGl();
            return;
        }
        throw new AndroidRuntimeException("OpenGl thread created failed.");
    }

    public GLThread(String str) {
        super(str);
    }

    public GLThread(Handler.Callback callback) {
        super("GlThread");
        this.mCallback = callback;
    }

    public void PostAndWait(Runnable runnable) {
        ThreadUtils.invokeAtFrontUninterruptibly(getHandler(), runnable);
    }

    public void post(Message message) {
        getHandler().sendMessage(message);
    }

    public boolean post(int i) {
        return getHandler().sendEmptyMessage(i);
    }

    public boolean post(int i, Object obj) {
        return getHandler().sendMessage(this.mHandler.obtainMessage(i, obj));
    }

    public boolean post(int i, int i2, int i3, Object obj) {
        return getHandler().sendMessage(this.mHandler.obtainMessage(i, i2, i3, obj));
    }
}
