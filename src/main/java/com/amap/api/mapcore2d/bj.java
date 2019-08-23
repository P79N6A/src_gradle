package com.amap.api.mapcore2d;

import com.amap.api.maps2d.AMapException;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public abstract class bj<T, V> extends ev {

    /* renamed from: a  reason: collision with root package name */
    protected T f5748a;

    /* renamed from: b  reason: collision with root package name */
    private int f5749b;

    /* renamed from: f  reason: collision with root package name */
    private int f5750f;

    /* access modifiers changed from: protected */
    public abstract V a(byte[] bArr) throws AMapException;

    /* access modifiers changed from: protected */
    public V c() {
        return null;
    }

    public bj() {
        this.f5749b = 1;
        this.f5749b = 1;
        this.f5750f = 2;
    }

    public V a() throws AMapException {
        if (this.f5748a != null) {
            return d();
        }
        return null;
    }

    private V d() throws AMapException {
        try {
            return b(b());
        } catch (AMapException e2) {
            c();
            throw new AMapException(e2.getErrorMessage());
        } catch (Throwable th) {
            cm.a(th, "ProtocalHandler", "GetDataMayThrow");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public byte[] b() throws AMapException {
        int i = 0;
        while (i < this.f5749b) {
            try {
                return eu.a(false).c(this);
            } catch (co e2) {
                i++;
                if (i < this.f5749b) {
                    try {
                        Thread.sleep((long) (this.f5750f * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
                        cm.a(e2, "ProtocalHandler", "getData");
                    } catch (InterruptedException unused) {
                        throw new AMapException(e2.getMessage());
                    }
                } else {
                    throw new AMapException(e2.a());
                }
            }
        }
        return null;
    }

    public bj(T t) {
        this();
        this.f5748a = t;
    }

    private V b(byte[] bArr) throws AMapException {
        return a(bArr);
    }
}
