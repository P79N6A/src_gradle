package anetwork.channel.entity;

import android.os.RemoteException;
import anet.channel.bytes.ByteArray;
import anet.channel.util.ALog;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.aidl.ParcelableNetworkListener;
import anetwork.channel.aidl.adapter.ParcelableInputStreamImpl;
import anetwork.channel.interceptor.Callback;
import java.util.List;
import java.util.Map;

public class c implements Callback {

    /* renamed from: a  reason: collision with root package name */
    private ParcelableNetworkListener f1530a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public String f1531b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public ParcelableInputStreamImpl f1532c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f1533d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public g f1534e;

    public void a(String str) {
        this.f1531b = str;
    }

    private void a(Runnable runnable) {
        int i;
        if (this.f1534e.c()) {
            runnable.run();
            return;
        }
        if (this.f1531b != null) {
            i = this.f1531b.hashCode();
        } else {
            i = hashCode();
        }
        a.a(i, runnable);
    }

    public void onFinish(DefaultFinishEvent defaultFinishEvent) {
        if (ALog.isPrintLog(2)) {
            ALog.i("anet.Repeater", "[onFinish] ", this.f1531b, new Object[0]);
        }
        if (this.f1530a != null) {
            a((Runnable) new f(this, defaultFinishEvent, this.f1530a));
        }
        this.f1530a = null;
    }

    public c(ParcelableNetworkListener parcelableNetworkListener, g gVar) {
        this.f1530a = parcelableNetworkListener;
        this.f1534e = gVar;
        if (parcelableNetworkListener != null) {
            try {
                if ((parcelableNetworkListener.getListenerState() & 8) != 0) {
                    this.f1533d = true;
                }
            } catch (RemoteException unused) {
            }
        }
    }

    public void onResponseCode(int i, Map<String, List<String>> map) {
        if (ALog.isPrintLog(2)) {
            ALog.i("anet.Repeater", "[onResponseCode]", this.f1531b, new Object[0]);
        }
        if (this.f1530a != null) {
            a((Runnable) new d(this, this.f1530a, i, map));
        }
    }

    public void onDataReceiveSize(int i, int i2, ByteArray byteArray) {
        if (this.f1530a != null) {
            e eVar = new e(this, i, byteArray, i2, this.f1530a);
            a((Runnable) eVar);
        }
    }
}
