package com.mapbox.mapboxsdk.maps;

import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import com.mapbox.mapboxsdk.maps.o;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class f implements o.d, o.e, o.f, o.g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f26636a = true;

    /* renamed from: b  reason: collision with root package name */
    int f26637b;

    /* renamed from: c  reason: collision with root package name */
    final CopyOnWriteArrayList<o.g> f26638c = new CopyOnWriteArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    final CopyOnWriteArrayList<o.e> f26639d = new CopyOnWriteArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    final CopyOnWriteArrayList<o.f> f26640e = new CopyOnWriteArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    final CopyOnWriteArrayList<o.d> f26641f = new CopyOnWriteArrayList<>();
    public o.g g;
    public o.e h;
    public o.f i;
    public o.d j;
    private final a k = new a(this);

    static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<f> f26642a;

        a(f fVar) {
            this.f26642a = new WeakReference<>(fVar);
        }

        /* access modifiers changed from: package-private */
        public final void a(int i) {
            boolean z;
            f fVar = (f) this.f26642a.get();
            if (fVar != null) {
                if (i == 0) {
                    if (fVar.f26636a || (!hasMessages(3) && !hasMessages(2))) {
                        z = false;
                    } else {
                        z = true;
                    }
                    removeMessages(3);
                    removeMessages(2);
                    if (z) {
                        return;
                    }
                }
                Message message = new Message();
                message.what = i;
                sendMessage(message);
            }
        }

        public final void handleMessage(Message message) {
            f fVar = (f) this.f26642a.get();
            if (fVar != null) {
                switch (message.what) {
                    case 0:
                        if (fVar.f26636a) {
                            fVar.f26636a = false;
                            if (fVar.g != null) {
                                fVar.g.a(fVar.f26637b);
                            }
                            if (!fVar.f26638c.isEmpty()) {
                                Iterator<o.g> it2 = fVar.f26638c.iterator();
                                while (it2.hasNext()) {
                                    it2.next().a(fVar.f26637b);
                                }
                            }
                        }
                        return;
                    case 1:
                        if (fVar.i != null && !fVar.f26636a) {
                            fVar.i.m_();
                        }
                        if (!fVar.f26640e.isEmpty() && !fVar.f26636a) {
                            Iterator<o.f> it3 = fVar.f26640e.iterator();
                            while (it3.hasNext()) {
                                it3.next().m_();
                            }
                        }
                        return;
                    case 2:
                        if (fVar.h != null && !fVar.f26636a) {
                            fVar.h.b();
                        }
                        if (!fVar.f26639d.isEmpty() && !fVar.f26636a) {
                            Iterator<o.e> it4 = fVar.f26639d.iterator();
                            while (it4.hasNext()) {
                                it4.next().b();
                            }
                        }
                        return;
                    case 3:
                        if (!fVar.f26636a) {
                            fVar.f26636a = true;
                            if (fVar.j != null) {
                                fVar.j.a();
                            }
                            if (!fVar.f26641f.isEmpty()) {
                                Iterator<o.d> it5 = fVar.f26641f.iterator();
                                while (it5.hasNext()) {
                                    it5.next().a();
                                }
                                break;
                            }
                        }
                        break;
                }
            }
        }
    }

    public final void a() {
        this.k.a(3);
    }

    public final void b() {
        this.k.a(2);
    }

    public final void m_() {
        this.k.a(1);
    }

    f() {
    }

    public final void a(int i2) {
        this.f26637b = i2;
        this.k.a(0);
    }

    /* access modifiers changed from: package-private */
    public final void b(@NonNull o.d dVar) {
        if (this.f26641f.contains(dVar)) {
            this.f26641f.remove(dVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(@NonNull o.d dVar) {
        this.f26641f.add(dVar);
    }

    /* access modifiers changed from: package-private */
    public final void b(o.f fVar) {
        if (this.f26640e.contains(fVar)) {
            this.f26640e.remove(fVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(o.f fVar) {
        this.f26640e.add(fVar);
    }
}
