package com.mapbox.mapboxsdk.http;

import android.support.annotation.Keep;
import com.mapbox.mapboxsdk.d;
import java.util.concurrent.locks.ReentrantLock;

@Keep
public class NativeHttpRequest implements d {
    private final c httpRequest = d.e().a();
    private final ReentrantLock lock = new ReentrantLock();
    @Keep
    private long nativePtr;

    @Keep
    private native void nativeOnFailure(int i, String str);

    @Keep
    private native void nativeOnResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr);

    public void cancel() {
        this.httpRequest.a();
        this.lock.lock();
        this.nativePtr = 0;
        this.lock.unlock();
    }

    private void executeLocalRequest(String str) {
        new e(new f(this)).execute(new String[]{str});
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$executeLocalRequest$0$NativeHttpRequest(byte[] bArr) {
        if (bArr != null) {
            this.lock.lock();
            if (this.nativePtr != 0) {
                nativeOnResponse(200, null, null, null, null, null, null, bArr);
            }
            this.lock.unlock();
        }
    }

    public void handleFailure(int i, String str) {
        this.lock.lock();
        if (this.nativePtr != 0) {
            nativeOnFailure(i, str);
        }
        this.lock.unlock();
    }

    @Keep
    private NativeHttpRequest(long j, String str, String str2, String str3) {
        this.nativePtr = j;
        if (str.startsWith("local://")) {
            executeLocalRequest(str);
        } else {
            this.httpRequest.a(this, str, str2, str3);
        }
    }

    public void onResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, byte[] bArr) {
        this.lock.lock();
        if (this.nativePtr != 0) {
            nativeOnResponse(i, str, str2, str3, str4, str5, str6, bArr);
        }
        this.lock.unlock();
    }
}
