package anet.channel.request;

import anet.channel.util.ALog;
import java.util.concurrent.Future;

public class b implements Cancelable {
    public static final b NULL = new b(null, null);

    /* renamed from: a  reason: collision with root package name */
    private final Future<?> f1274a;

    /* renamed from: b  reason: collision with root package name */
    private final String f1275b;

    public void cancel() {
        if (this.f1274a != null) {
            ALog.i("awcn.FutureCancelable", "cancel request", this.f1275b, new Object[0]);
            this.f1274a.cancel(true);
        }
    }

    public b(Future<?> future, String str) {
        this.f1274a = future;
        this.f1275b = str;
    }
}
