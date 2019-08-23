package com.ss.ttvideoengine.net;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.Error;

public class DNSParser extends BaseDNS implements DNSCompletionListener {
    private static int DNS_COUNT = 2;
    public static int DNS_TYPE_HTTP = 1;
    public static int DNS_TYPE_LOCAL;
    public static ChangeQuickRedirect changeQuickRedirect;
    private BaseDNS mCurrentDNS;
    private int mIndex;

    public void onCancelled() {
    }

    public void onRetry(Error error) {
    }

    public void cancel() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91557, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91557, new Class[0], Void.TYPE);
        } else if (!this.mCancelled) {
            this.mCancelled = true;
            if (this.mCurrentDNS != null) {
                this.mCurrentDNS.cancel();
            }
        }
    }

    public int getType() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91555, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91555, new Class[0], Integer.TYPE)).intValue();
        } else if (!TTVideoEngine.isHttpDnsFirst()) {
            return this.mIndex;
        } else {
            if (this.mIndex == 0) {
                return DNS_TYPE_HTTP;
            }
            return DNS_TYPE_LOCAL;
        }
    }

    public void start() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 91556, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 91556, new Class[0], Void.TYPE);
        } else if (!this.mCancelled && this.mIndex < DNS_COUNT) {
            if (this.mIndex == 0) {
                if (TTVideoEngine.isHttpDnsFirst()) {
                    this.mCurrentDNS = new HTTPDNS(this.mHostname, this.mNetClient);
                } else {
                    this.mCurrentDNS = new LocalDNS(this.mHostname);
                }
            } else if (TTVideoEngine.isHttpDnsFirst()) {
                this.mCurrentDNS = new LocalDNS(this.mHostname);
            } else {
                this.mCurrentDNS = new HTTPDNS(this.mHostname, this.mNetClient);
            }
            this.mCurrentDNS.setCompletionListener(this);
            this.mCurrentDNS.start();
        }
    }

    public DNSParser(String str, TTVNetClient tTVNetClient) {
        super(str, tTVNetClient);
    }

    public void onCompletion(String str, Error error) {
        if (PatchProxy.isSupport(new Object[]{str, error}, this, changeQuickRedirect, false, 91558, new Class[]{String.class, Error.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, error}, this, changeQuickRedirect, false, 91558, new Class[]{String.class, Error.class}, Void.TYPE);
        } else if (this.mCancelled) {
            notifyCancelled();
        } else if (error == null) {
            notifySuccess(str);
        } else if (this.mIndex == DNS_COUNT - 1) {
            notifyError(error);
        } else {
            notifyRetry(error);
            this.mIndex++;
            start();
        }
    }
}
