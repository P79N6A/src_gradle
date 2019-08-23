package org.greenrobot.eventbus;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private j f84127a;

    /* renamed from: b  reason: collision with root package name */
    private j f84128b;

    k() {
    }

    /* access modifiers changed from: package-private */
    public final synchronized j a() {
        j jVar;
        jVar = this.f84127a;
        if (this.f84127a != null) {
            this.f84127a = this.f84127a.f84126c;
            if (this.f84127a == null) {
                this.f84128b = null;
            }
        }
        return jVar;
    }

    /* access modifiers changed from: package-private */
    public final synchronized j a(int i) throws InterruptedException {
        if (this.f84127a == null) {
            wait(1000);
        }
        return a();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(j jVar) {
        if (jVar != null) {
            if (this.f84128b != null) {
                this.f84128b.f84126c = jVar;
                this.f84128b = jVar;
            } else if (this.f84127a == null) {
                this.f84128b = jVar;
                this.f84127a = jVar;
            } else {
                throw new IllegalStateException("Head present, but no tail");
            }
            notifyAll();
        } else {
            throw new NullPointerException("null cannot be enqueued");
        }
    }
}
