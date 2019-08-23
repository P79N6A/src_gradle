package com.ss.android.ugc.aweme.story.player;

import android.view.Surface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.video.b.b;
import com.ss.android.ugc.aweme.video.e;
import java.util.ArrayList;
import java.util.List;

public final class c implements com.ss.android.ugc.aweme.video.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73261a;

    /* renamed from: b  reason: collision with root package name */
    public final com.ss.android.ugc.aweme.main.h.a.a f73262b;

    /* renamed from: c  reason: collision with root package name */
    public Surface f73263c;

    /* renamed from: d  reason: collision with root package name */
    public volatile long f73264d;

    /* renamed from: e  reason: collision with root package name */
    private List<com.ss.android.ugc.aweme.video.a.a> f73265e;

    /* renamed from: f  reason: collision with root package name */
    private int f73266f;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static c f73267a = new c((byte) 0);
    }

    public static c d() {
        return a.f73267a;
    }

    public final void a(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f73261a, false, 84848, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f73261a, false, 84848, new Class[]{e.class}, Void.TYPE);
            return;
        }
        synchronized (this) {
            this.f73265e.size();
            for (int i = 0; i < this.f73266f; i++) {
                if (this.f73265e.get(i) != null) {
                    this.f73265e.get(i).a(eVar);
                }
            }
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f73261a, false, 84849, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f73261a, false, 84849, new Class[]{String.class}, Void.TYPE);
            return;
        }
        synchronized (this) {
            this.f73265e.size();
            for (int i = 0; i < this.f73266f; i++) {
                if (this.f73265e.get(i) != null) {
                    this.f73265e.get(i).a(str);
                }
            }
        }
    }

    private c() {
        this.f73262b = (com.ss.android.ugc.aweme.main.h.a.a) ServiceManager.get().getService(com.ss.android.ugc.aweme.main.h.a.a.class);
        if (this.f73262b != null) {
            this.f73262b.a((com.ss.android.ugc.aweme.video.a.a) this);
        }
        this.f73265e = new ArrayList();
    }

    private boolean h() {
        if (PatchProxy.isSupport(new Object[0], this, f73261a, false, 84838, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f73261a, false, 84838, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f73262b == null || this.f73263c == null) {
            return false;
        } else {
            return true;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f73261a, false, 84834, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73261a, false, 84834, new Class[0], Void.TYPE);
        } else if (this.f73262b != null) {
            this.f73262b.d();
        }
    }

    public final Long b() {
        if (PatchProxy.isSupport(new Object[0], this, f73261a, false, 84836, new Class[0], Long.class)) {
            return (Long) PatchProxy.accessDispatch(new Object[0], this, f73261a, false, 84836, new Class[0], Long.class);
        } else if (this.f73262b != null) {
            return Long.valueOf(this.f73262b.b());
        } else {
            return 0L;
        }
    }

    public final long c() {
        if (PatchProxy.isSupport(new Object[0], this, f73261a, false, 84837, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f73261a, false, 84837, new Class[0], Long.TYPE)).longValue();
        } else if (this.f73262b != null) {
            return this.f73262b.a();
        } else {
            return 0;
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f73261a, false, 84841, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73261a, false, 84841, new Class[0], Void.TYPE);
        } else if (h()) {
            this.f73262b.c();
        }
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f73261a, false, 84845, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73261a, false, 84845, new Class[0], Void.TYPE);
        } else if (h()) {
            this.f73262b.e();
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f73261a, false, 84846, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73261a, false, 84846, new Class[0], Void.TYPE);
        } else if (h()) {
            this.f73262b.f();
        }
    }

    /* synthetic */ c(byte b2) {
        this();
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f73261a, false, 84856, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f73261a, false, 84856, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        synchronized (this) {
            this.f73265e.size();
            for (int i = 0; i < this.f73266f; i++) {
                if (this.f73265e.get(i) != null) {
                    this.f73265e.get(i).a(f2);
                }
            }
        }
    }

    public final void b(Video video) {
        if (PatchProxy.isSupport(new Object[]{video}, this, f73261a, false, 84839, new Class[]{Video.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{video}, this, f73261a, false, 84839, new Class[]{Video.class}, Void.TYPE);
        } else if (h()) {
            this.f73262b.a(this.f73263c, video);
        }
    }

    public final void c(Video video) {
        if (PatchProxy.isSupport(new Object[]{video}, this, f73261a, false, 84840, new Class[]{Video.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{video}, this, f73261a, false, 84840, new Class[]{Video.class}, Void.TYPE);
        } else if (h()) {
            this.f73262b.b(this.f73263c, video);
        }
    }

    public final void d(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f73261a, false, 84852, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f73261a, false, 84852, new Class[]{String.class}, Void.TYPE);
            return;
        }
        synchronized (this) {
            this.f73265e.size();
            for (int i = 0; i < this.f73266f; i++) {
                if (this.f73265e.get(i) != null) {
                    this.f73265e.get(i).d(str);
                }
            }
        }
    }

    public final void e(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f73261a, false, 84853, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f73261a, false, 84853, new Class[]{String.class}, Void.TYPE);
            return;
        }
        synchronized (this) {
            this.f73265e.size();
            for (int i = 0; i < this.f73266f; i++) {
                if (this.f73265e.get(i) != null) {
                    this.f73265e.get(i).e(str);
                }
            }
        }
    }

    public final void a(Video video) {
        if (PatchProxy.isSupport(new Object[]{video}, this, f73261a, false, 84833, new Class[]{Video.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{video}, this, f73261a, false, 84833, new Class[]{Video.class}, Void.TYPE);
            return;
        }
        if (this.f73262b != null) {
            this.f73262b.a(video);
        }
    }

    public final void b(com.ss.android.ugc.aweme.video.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f73261a, false, 84843, new Class[]{com.ss.android.ugc.aweme.video.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f73261a, false, 84843, new Class[]{com.ss.android.ugc.aweme.video.a.a.class}, Void.TYPE);
            return;
        }
        synchronized (this) {
            this.f73265e.remove(aVar);
            this.f73266f--;
        }
    }

    public final void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f73261a, false, 84851, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f73261a, false, 84851, new Class[]{String.class}, Void.TYPE);
            return;
        }
        synchronized (this) {
            this.f73265e.size();
            for (int i = 0; i < this.f73266f; i++) {
                if (this.f73265e.get(i) != null) {
                    this.f73265e.get(i).c(str);
                }
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.video.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f73261a, false, 84842, new Class[]{com.ss.android.ugc.aweme.video.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f73261a, false, 84842, new Class[]{com.ss.android.ugc.aweme.video.a.a.class}, Void.TYPE);
            return;
        }
        synchronized (this) {
            if (!this.f73265e.contains(aVar)) {
                this.f73265e.add(aVar);
                this.f73266f++;
            }
        }
    }

    public final void b(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f73261a, false, 84858, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f73261a, false, 84858, new Class[]{e.class}, Void.TYPE);
            return;
        }
        synchronized (this) {
            this.f73265e.size();
            for (int i = 0; i < this.f73266f; i++) {
                if (this.f73265e.get(i) != null) {
                    this.f73265e.get(i).b(eVar);
                }
            }
        }
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f73261a, false, 84855, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f73261a, false, 84855, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        synchronized (this) {
            this.f73265e.size();
            for (int i = 0; i < this.f73266f; i++) {
                if (this.f73265e.get(i) != null) {
                    this.f73265e.get(i).c(z);
                }
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.video.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f73261a, false, 84847, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f73261a, false, 84847, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE);
            return;
        }
        synchronized (this) {
            this.f73265e.size();
            for (int i = 0; i < this.f73266f; i++) {
                if (this.f73265e.get(i) != null) {
                    this.f73265e.get(i).a(aVar);
                }
            }
        }
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f73261a, false, 84850, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f73261a, false, 84850, new Class[]{String.class}, Void.TYPE);
            return;
        }
        synchronized (this) {
            this.f73265e.size();
            for (int i = 0; i < this.f73266f; i++) {
                if (this.f73265e.get(i) != null) {
                    this.f73265e.get(i).b(str);
                }
            }
        }
    }

    public final void a(b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f73261a, false, 84857, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f73261a, false, 84857, new Class[]{b.class}, Void.TYPE);
            return;
        }
        synchronized (this) {
            this.f73265e.size();
            for (int i = 0; i < this.f73266f; i++) {
                if (this.f73265e.get(i) != null) {
                    this.f73265e.get(i).a(bVar);
                }
            }
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f73261a, false, 84854, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f73261a, false, 84854, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        synchronized (this) {
            this.f73265e.size();
            for (int i = 0; i < this.f73266f; i++) {
                if (this.f73265e.get(i) != null) {
                    this.f73265e.get(i).b(z);
                }
            }
        }
    }
}
