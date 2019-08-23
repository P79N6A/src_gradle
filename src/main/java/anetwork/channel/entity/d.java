package anetwork.channel.entity;

import android.os.RemoteException;
import anetwork.channel.aidl.ParcelableHeader;
import anetwork.channel.aidl.ParcelableNetworkListener;
import java.util.Map;

public class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ParcelableNetworkListener f1535a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f1536b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Map f1537c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ c f1538d;

    public void run() {
        try {
            this.f1535a.onResponseCode(this.f1536b, new ParcelableHeader(this.f1536b, this.f1537c));
        } catch (RemoteException unused) {
        }
    }

    d(c cVar, ParcelableNetworkListener parcelableNetworkListener, int i, Map map) {
        this.f1538d = cVar;
        this.f1535a = parcelableNetworkListener;
        this.f1536b = i;
        this.f1537c = map;
    }
}
