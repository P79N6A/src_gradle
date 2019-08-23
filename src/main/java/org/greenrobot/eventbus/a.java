package org.greenrobot.eventbus;

public final class a implements Runnable, l {

    /* renamed from: a  reason: collision with root package name */
    private final k f84080a = new k();

    /* renamed from: b  reason: collision with root package name */
    private final c f84081b;

    public final void run() {
        j a2 = this.f84080a.a();
        if (a2 != null) {
            this.f84081b.a(a2);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }

    a(c cVar) {
        this.f84081b = cVar;
    }

    public final void a(p pVar, Object obj) {
        this.f84080a.a(j.a(pVar, obj));
        this.f84081b.f84098c.execute(this);
    }
}
