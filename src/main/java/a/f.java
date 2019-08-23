package a;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

public final class f implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1045a = new Object();

    /* renamed from: b  reason: collision with root package name */
    final List<e> f1046b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public ScheduledFuture<?> f1047c;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledExecutorService f1048d = c.b();

    /* renamed from: e  reason: collision with root package name */
    private boolean f1049e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f1050f;

    private void e() {
        if (this.f1047c != null) {
            this.f1047c.cancel(true);
            this.f1047c = null;
        }
    }

    public final boolean a() {
        boolean z;
        synchronized (this.f1045a) {
            d();
            z = this.f1049e;
        }
        return z;
    }

    public final d b() {
        d dVar;
        synchronized (this.f1045a) {
            d();
            dVar = new d(this);
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public void d() {
        if (this.f1050f) {
            throw new IllegalStateException("Object already closed");
        }
    }

    public final void c() {
        synchronized (this.f1045a) {
            d();
            if (!this.f1049e) {
                e();
                this.f1049e = true;
                ArrayList arrayList = new ArrayList(this.f1046b);
                a(arrayList);
            }
        }
    }

    public final void close() {
        synchronized (this.f1045a) {
            if (!this.f1050f) {
                e();
                for (e close : this.f1046b) {
                    close.close();
                }
                this.f1046b.clear();
                this.f1050f = true;
            }
        }
    }

    public final String toString() {
        return String.format(Locale.US, "%s@%s[cancellationRequested=%s]", new Object[]{getClass().getName(), Integer.toHexString(hashCode()), Boolean.toString(a())});
    }

    private static void a(List<e> list) {
        for (e a2 : list) {
            a2.a();
        }
    }
}
