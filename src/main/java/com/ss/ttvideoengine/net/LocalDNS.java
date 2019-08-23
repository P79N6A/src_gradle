package com.ss.ttvideoengine.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ttvideoengine.utils.Error;
import java.lang.ref.WeakReference;
import java.net.Inet6Address;
import java.net.InetAddress;

public class LocalDNS extends BaseDNS {
    public static ChangeQuickRedirect changeQuickRedirect;
    public InetAddress mAddress;
    public boolean mRet;
    private Thread mThread;

    static class MyRunnable implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final WeakReference<LocalDNS> mLocalDNSRef;

        public void run() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91568, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91568, new Class[0], Void.TYPE);
                return;
            }
            LocalDNS localDNS = (LocalDNS) this.mLocalDNSRef.get();
            if (localDNS != null && !localDNS.mRet) {
                localDNS.cancel();
                localDNS.notifyError(new Error("kTTVideoErrorDomainLocalDNS", -10000));
            }
        }

        public MyRunnable(LocalDNS localDNS) {
            this.mLocalDNSRef = new WeakReference<>(localDNS);
        }
    }

    public void cancel() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91565, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91565, new Class[0], Void.TYPE);
        } else if (!this.mCancelled) {
            this.mCancelled = true;
            if (this.mThread != null) {
                try {
                    this.mThread.interrupt();
                    this.mThread = null;
                } catch (Exception unused) {
                }
            }
        }
    }

    public void close() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91566, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91566, new Class[0], Void.TYPE);
            return;
        }
        super.close();
        if (this.mThread != null) {
            try {
                this.mThread = null;
            } catch (Exception unused) {
            }
        }
    }

    public void start() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91564, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91564, new Class[0], Void.TYPE);
            return;
        }
        try {
            this.mThread = new Thread(new Runnable() {
                public static ChangeQuickRedirect changeQuickRedirect;

                public void run() {
                    if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91567, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91567, new Class[0], Void.TYPE);
                        return;
                    }
                    try {
                        LocalDNS.this.mAddress = InetAddress.getByName(LocalDNS.this.mHostname);
                        LocalDNS.this.mRet = true;
                        if (LocalDNS.this.mAddress == null) {
                            LocalDNS.this.notifyError(new Error("kTTVideoErrorDomainLocalDNS", -9998));
                            return;
                        }
                        String hostAddress = LocalDNS.this.mAddress.getHostAddress();
                        if (LocalDNS.this.mAddress instanceof Inet6Address) {
                            hostAddress = String.format("[%s]", new Object[]{hostAddress});
                        }
                        LocalDNS.this.notifySuccess(hostAddress);
                    } catch (Throwable th) {
                        LocalDNS.this.mRet = true;
                        LocalDNS.this.notifyError(new Error("kTTVideoErrorDomainLocalDNS", 0, th.getMessage()));
                    }
                }
            });
            this.mThread.start();
        } catch (Exception e2) {
            notifyError(new Error("kTTVideoErrorDomainLocalDNS", 0, e2.getMessage()));
        }
        this.mHandler.postDelayed(new MyRunnable(this), 10000);
    }

    public LocalDNS(String str) {
        super(str);
    }
}
