package anetwork.channel.aidl.adapter;

public class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ byte f1484a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Object f1485b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ParcelableNetworkListenerWrapper f1486c;

    public void run() {
        this.f1486c.dispatchCallback(this.f1484a, this.f1485b);
    }

    c(ParcelableNetworkListenerWrapper parcelableNetworkListenerWrapper, byte b2, Object obj) {
        this.f1486c = parcelableNetworkListenerWrapper;
        this.f1484a = b2;
        this.f1485b = obj;
    }
}
