package a;

import java.io.Closeable;

public final class e implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final Object f1041a;

    /* renamed from: b  reason: collision with root package name */
    private f f1042b;

    /* renamed from: c  reason: collision with root package name */
    private Runnable f1043c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f1044d;

    /* access modifiers changed from: package-private */
    public final void a() {
        synchronized (this.f1041a) {
            if (!this.f1044d) {
                this.f1043c.run();
                close();
            } else {
                throw new IllegalStateException("Object already closed");
            }
        }
    }

    public final void close() {
        synchronized (this.f1041a) {
            if (!this.f1044d) {
                this.f1044d = true;
                f fVar = this.f1042b;
                synchronized (fVar.f1045a) {
                    fVar.d();
                    fVar.f1046b.remove(this);
                }
                this.f1042b = null;
                this.f1043c = null;
            }
        }
    }
}
