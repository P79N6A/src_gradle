package anetwork.channel.entity;

import android.os.RemoteException;
import anet.channel.bytes.ByteArray;
import anetwork.channel.aidl.DefaultProgressEvent;
import anetwork.channel.aidl.ParcelableNetworkListener;
import anetwork.channel.aidl.adapter.ParcelableInputStreamImpl;

public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f1539a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ByteArray f1540b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f1541c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ ParcelableNetworkListener f1542d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ c f1543e;

    public void run() {
        if (!this.f1543e.f1533d) {
            try {
                this.f1542d.onDataReceived(new DefaultProgressEvent(this.f1539a, this.f1540b.getDataLength(), this.f1541c, this.f1540b.getBuffer()));
            } catch (RemoteException unused) {
            }
        } else {
            try {
                if (this.f1543e.f1532c == null) {
                    ParcelableInputStreamImpl unused2 = this.f1543e.f1532c = new ParcelableInputStreamImpl();
                    this.f1543e.f1532c.init(this.f1543e.f1534e, this.f1541c);
                    this.f1543e.f1532c.write(this.f1540b);
                    this.f1542d.onInputStreamGet(this.f1543e.f1532c);
                } else {
                    this.f1543e.f1532c.write(this.f1540b);
                }
            } catch (Exception unused3) {
                if (this.f1543e.f1532c != null) {
                    try {
                        this.f1543e.f1532c.close();
                    } catch (RemoteException unused4) {
                    }
                }
            }
        }
    }

    e(c cVar, int i, ByteArray byteArray, int i2, ParcelableNetworkListener parcelableNetworkListener) {
        this.f1543e = cVar;
        this.f1539a = i;
        this.f1540b = byteArray;
        this.f1541c = i2;
        this.f1542d = parcelableNetworkListener;
    }
}
