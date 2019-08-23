package com.ss.ttvideoengine.net;

import android.os.Handler;
import android.os.Message;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ttvideoengine.utils.Error;
import java.lang.ref.WeakReference;

public class BaseDNS {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected boolean mCancelled;
    protected Handler mHandler = new MyHandler(this);
    protected String mHostname;
    protected DNSCompletionListener mListener;
    protected TTVNetClient mNetClient;

    static class MyHandler extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final WeakReference<BaseDNS> mDNSRef;

        public MyHandler(BaseDNS baseDNS) {
            this.mDNSRef = new WeakReference<>(baseDNS);
        }

        public void handleMessage(Message message) {
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{message2}, this, changeQuickRedirect, false, 91554, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, changeQuickRedirect, false, 91554, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            BaseDNS baseDNS = (BaseDNS) this.mDNSRef.get();
            if (baseDNS != null) {
                DNSCompletionListener dNSCompletionListener = baseDNS.mListener;
                if (dNSCompletionListener != null && !baseDNS.mCancelled) {
                    switch (message2.what) {
                        case 0:
                            dNSCompletionListener.onCancelled();
                            return;
                        case 1:
                            baseDNS.close();
                            dNSCompletionListener.onRetry((Error) message2.obj);
                            return;
                        case 2:
                            baseDNS.close();
                            dNSCompletionListener.onCompletion(null, (Error) message2.obj);
                            return;
                        case 3:
                            baseDNS.close();
                            dNSCompletionListener.onCompletion((String) message2.obj, null);
                            break;
                    }
                }
            }
        }
    }

    public void cancel() {
    }

    public void close() {
    }

    public void start() {
    }

    public void notifyCancelled() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91552, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91552, new Class[0], Void.TYPE);
            return;
        }
        this.mHandler.sendEmptyMessage(0);
    }

    public void setCompletionListener(DNSCompletionListener dNSCompletionListener) {
        this.mListener = dNSCompletionListener;
    }

    public BaseDNS(String str) {
        this.mHostname = str;
    }

    public void notifyError(Error error) {
        if (PatchProxy.isSupport(new Object[]{error}, this, changeQuickRedirect, false, 91551, new Class[]{Error.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{error}, this, changeQuickRedirect, false, 91551, new Class[]{Error.class}, Void.TYPE);
            return;
        }
        this.mHandler.sendMessage(this.mHandler.obtainMessage(2, error));
    }

    public void notifyRetry(Error error) {
        if (PatchProxy.isSupport(new Object[]{error}, this, changeQuickRedirect, false, 91550, new Class[]{Error.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{error}, this, changeQuickRedirect, false, 91550, new Class[]{Error.class}, Void.TYPE);
            return;
        }
        this.mHandler.sendMessage(this.mHandler.obtainMessage(1, error));
    }

    public void notifySuccess(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, changeQuickRedirect, false, 91553, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, changeQuickRedirect, false, 91553, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.mHandler.sendMessage(this.mHandler.obtainMessage(3, str));
    }

    public BaseDNS(String str, TTVNetClient tTVNetClient) {
        this.mHostname = str;
        this.mNetClient = tTVNetClient == null ? new TTHTTPNetwork() : tTVNetClient;
    }
}
