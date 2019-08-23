package anetwork.channel.unified;

import anetwork.channel.entity.g;
import anetwork.channel.interceptor.Callback;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

public class j {

    /* renamed from: a  reason: collision with root package name */
    public final g f1591a;

    /* renamed from: b  reason: collision with root package name */
    public Callback f1592b;

    /* renamed from: c  reason: collision with root package name */
    public final String f1593c;

    /* renamed from: d  reason: collision with root package name */
    public volatile AtomicBoolean f1594d = new AtomicBoolean();

    /* renamed from: e  reason: collision with root package name */
    public volatile IUnifiedTask f1595e = null;

    /* renamed from: f  reason: collision with root package name */
    public volatile Future f1596f = null;

    public void a() {
        Future future = this.f1596f;
        if (future != null) {
            future.cancel(true);
            this.f1596f = null;
        }
    }

    public void b() {
        if (this.f1595e != null) {
            this.f1595e.cancel();
            this.f1595e = null;
        }
    }

    public j(g gVar, Callback callback) {
        this.f1591a = gVar;
        this.f1593c = gVar.f1551e;
        this.f1592b = callback;
    }
}
