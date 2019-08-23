package com.mapbox.mapboxsdk.maps;

import com.mapbox.mapboxsdk.b;
import com.mapbox.mapboxsdk.log.Logger;
import com.mapbox.mapboxsdk.maps.MapView;
import com.mapbox.mapboxsdk.maps.NativeMapView;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class j implements NativeMapView.a {

    /* renamed from: a  reason: collision with root package name */
    final List<MapView.h> f26652a = new CopyOnWriteArrayList();

    /* renamed from: b  reason: collision with root package name */
    final List<MapView.g> f26653b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    final List<MapView.m> f26654c = new CopyOnWriteArrayList();

    /* renamed from: d  reason: collision with root package name */
    final List<MapView.i> f26655d = new CopyOnWriteArrayList();

    /* renamed from: e  reason: collision with root package name */
    final List<MapView.k> f26656e = new CopyOnWriteArrayList();

    /* renamed from: f  reason: collision with root package name */
    final List<MapView.j> f26657f = new CopyOnWriteArrayList();
    private final List<Object> g = new CopyOnWriteArrayList();
    private final List<Object> h = new CopyOnWriteArrayList();
    private final List<Object> i = new CopyOnWriteArrayList();
    private final List<Object> j = new CopyOnWriteArrayList();
    private final List<Object> k = new CopyOnWriteArrayList();
    private final List<Object> l = new CopyOnWriteArrayList();
    private final List<Object> m = new CopyOnWriteArrayList();

    public final void a() {
        try {
            if (!this.f26652a.isEmpty()) {
                for (MapView.h g2 : this.f26652a) {
                    g2.g();
                }
            }
        } catch (RuntimeException e2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onCameraIsChanging", e2);
            b.a((Exception) e2);
        }
    }

    public final void b() {
        try {
            if (!this.f26654c.isEmpty()) {
                for (MapView.m e2 : this.f26654c) {
                    e2.e();
                }
            }
        } catch (RuntimeException e3) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onWillStartLoadingMap", e3);
            b.a((Exception) e3);
        }
    }

    public final void c() {
        try {
            if (!this.f26655d.isEmpty()) {
                for (MapView.i f2 : this.f26655d) {
                    f2.f();
                }
            }
        } catch (RuntimeException e2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onDidFinishLoadingMap", e2);
            b.a((Exception) e2);
        }
    }

    public final void d() {
        try {
            if (!this.i.isEmpty()) {
                Iterator<Object> it2 = this.i.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        } catch (RuntimeException e2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onWillStartRenderingFrame", e2);
            b.a((Exception) e2);
        }
    }

    public final void e() {
        try {
            if (!this.j.isEmpty()) {
                Iterator<Object> it2 = this.j.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        } catch (RuntimeException e2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onWillStartRenderingMap", e2);
            b.a((Exception) e2);
        }
    }

    public final void f() {
        try {
            if (!this.l.isEmpty()) {
                Iterator<Object> it2 = this.l.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        } catch (Throwable th) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onDidBecomeIdle", th);
            throw th;
        }
    }

    public final void g() {
        try {
            if (!this.f26657f.isEmpty()) {
                for (MapView.j a2 : this.f26657f) {
                    a2.a();
                }
            }
        } catch (RuntimeException e2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onDidFinishLoadingStyle", e2);
            b.a((Exception) e2);
        }
    }

    j() {
    }

    /* access modifiers changed from: package-private */
    public final void h() {
        this.g.clear();
        this.f26652a.clear();
        this.f26653b.clear();
        this.f26654c.clear();
        this.f26655d.clear();
        this.h.clear();
        this.i.clear();
        this.f26656e.clear();
        this.j.clear();
        this.k.clear();
        this.l.clear();
        this.f26657f.clear();
        this.m.clear();
    }

    public final void a(String str) {
        try {
            if (!this.h.isEmpty()) {
                Iterator<Object> it2 = this.h.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        } catch (RuntimeException e2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onDidFailLoadingMap", e2);
            b.a((Exception) e2);
        }
    }

    public final void b(String str) {
        try {
            if (!this.m.isEmpty()) {
                Iterator<Object> it2 = this.m.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        } catch (RuntimeException e2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onSourceChanged", e2);
            b.a((Exception) e2);
        }
    }

    public final void c(boolean z) {
        try {
            if (!this.f26656e.isEmpty()) {
                for (MapView.k b2 : this.f26656e) {
                    b2.b();
                }
            }
        } catch (RuntimeException e2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onDidFinishRenderingFrame", e2);
            b.a((Exception) e2);
        }
    }

    public final void d(boolean z) {
        try {
            if (!this.k.isEmpty()) {
                Iterator<Object> it2 = this.k.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        } catch (RuntimeException e2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onDidFinishRenderingMap", e2);
            b.a((Exception) e2);
        }
    }

    public final void a(boolean z) {
        try {
            if (!this.g.isEmpty()) {
                Iterator<Object> it2 = this.g.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
            }
        } catch (RuntimeException e2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onCameraWillChange", e2);
            b.a((Exception) e2);
        }
    }

    public final void b(boolean z) {
        try {
            if (!this.f26653b.isEmpty()) {
                for (MapView.g h2 : this.f26653b) {
                    h2.h();
                }
            }
        } catch (RuntimeException e2) {
            Logger.e("Mbgl-MapChangeReceiver", "Exception in onCameraDidChange", e2);
            b.a((Exception) e2);
        }
    }
}
