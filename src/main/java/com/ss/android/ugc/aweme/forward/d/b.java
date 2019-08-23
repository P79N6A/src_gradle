package com.ss.android.ugc.aweme.forward.d;

import android.graphics.Rect;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.b.c;
import com.ss.android.ugc.aweme.newfollow.util.d;
import com.ss.android.ugc.aweme.newfollow.util.e;
import com.ss.android.ugc.aweme.newfollow.util.h;
import com.ss.android.ugc.aweme.newfollow.util.l;
import com.ss.android.ugc.aweme.newfollow.util.m;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.bo;

public class b implements WeakHandler.IHandler, c.a, h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3280a;

    /* renamed from: b  reason: collision with root package name */
    protected c.b f3281b;

    /* renamed from: c  reason: collision with root package name */
    protected Aweme f3282c;

    /* renamed from: d  reason: collision with root package name */
    protected l f3283d;

    /* renamed from: e  reason: collision with root package name */
    public String f3284e;

    /* renamed from: f  reason: collision with root package name */
    protected String f3285f;
    protected boolean g;
    protected boolean h;
    protected WeakHandler i;
    protected Runnable j = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48277a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f48277a, false, 45416, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f48277a, false, 45416, new Class[0], Void.TYPE);
                return;
            }
            if (b.this.f3281b.g()) {
                b.this.f3281b.j();
            }
        }
    };
    protected m k = new m() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48279a;

        public final Rect a() {
            if (!PatchProxy.isSupport(new Object[0], this, f48279a, false, 45417, new Class[0], Rect.class)) {
                return b.this.f3281b.i();
            }
            return (Rect) PatchProxy.accessDispatch(new Object[0], this, f48279a, false, 45417, new Class[0], Rect.class);
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f48279a, false, 45421, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f48279a, false, 45421, new Class[0], Void.TYPE);
                return;
            }
            b.this.b();
        }

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f48279a, false, 45422, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f48279a, false, 45422, new Class[0], Void.TYPE);
                return;
            }
            b.this.c();
        }

        public final void a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f48279a, false, 45420, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f48279a, false, 45420, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            b.this.a(i);
        }

        public final void b(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f48279a, false, 45419, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f48279a, false, 45419, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            b.this.b(i);
        }
    };

    public void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3280a, false, 45415, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3280a, false, 45415, new Class[]{Integer.TYPE}, Void.TYPE);
        }
    }

    public void d() {
        this.g = false;
    }

    public void g() {
    }

    public void handleMsg(Message message) {
    }

    private void l() {
        if (PatchProxy.isSupport(new Object[0], this, f3280a, false, 45404, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3280a, false, 45404, new Class[0], Void.TYPE);
        } else if (this.f3282c != null) {
            d j2 = j();
            if (j2 != null) {
                j2.b(this.f3284e);
            }
        }
    }

    private void m() {
        if (PatchProxy.isSupport(new Object[0], this, f3280a, false, 45407, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3280a, false, 45407, new Class[0], Void.TYPE);
        } else if (this.f3282c != null) {
            d j2 = j();
            if (j2 != null) {
                j2.a(this.f3284e);
            }
        }
    }

    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f3280a, false, 45401, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3280a, false, 45401, new Class[0], Void.TYPE);
            return;
        }
        this.g = true;
        if (!h()) {
            l();
        }
    }

    public void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3280a, false, 45413, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3280a, false, 45413, new Class[0], Void.TYPE);
            return;
        }
        this.i.removeCallbacks(this.j);
    }

    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3280a, false, 45414, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3280a, false, 45414, new Class[0], Void.TYPE);
            return;
        }
        m();
    }

    public void e() {
        if (PatchProxy.isSupport(new Object[0], this, f3280a, false, 45408, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3280a, false, 45408, new Class[0], Void.TYPE);
            return;
        }
        this.h = true;
        this.f3283d.a(this.k);
        j();
    }

    public void f() {
        if (PatchProxy.isSupport(new Object[0], this, f3280a, false, 45411, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3280a, false, 45411, new Class[0], Void.TYPE);
            return;
        }
        this.h = false;
        this.f3283d.b(this.k);
        l();
        this.f3283d.b(this.k);
        this.i.removeCallbacksAndMessages(null);
    }

    private d n() {
        bo boVar;
        if (PatchProxy.isSupport(new Object[0], this, f3280a, false, 45409, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], this, f3280a, false, 45409, new Class[0], d.class);
        } else if (this.f3282c == null) {
            return null;
        } else {
            if (this.f3281b.n().c(1)) {
                boVar = new bo(1);
            } else {
                boVar = new bo(16);
            }
            String a2 = d.a(this.f3281b.b().e(), this.f3282c.getAid());
            d dVar = new d(this.f3282c, boVar, a2);
            e.a().a(a2, dVar);
            return dVar;
        }
    }

    public final boolean h() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3280a, false, 45402, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3280a, false, 45402, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f3282c == null) {
            return false;
        } else {
            d j2 = j();
            if (j2 != null && j2.f57413d.c(16777216)) {
                z = true;
            }
            return z;
        }
    }

    public final boolean i() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f3280a, false, 45403, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f3280a, false, 45403, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f3282c == null) {
            return false;
        } else {
            d j2 = j();
            if (j2 != null && j2.f57413d.c(256)) {
                z = true;
            }
            return z;
        }
    }

    public final d j() {
        if (PatchProxy.isSupport(new Object[0], this, f3280a, false, 45405, new Class[0], d.class)) {
            return (d) PatchProxy.accessDispatch(new Object[0], this, f3280a, false, 45405, new Class[0], d.class);
        }
        d c2 = e.a().c(d.a(this.f3281b.b().e(), this.f3282c.getAid()));
        if (c2 == null) {
            c2 = n();
        }
        return c2;
    }

    public final void k() {
        if (PatchProxy.isSupport(new Object[0], this, f3280a, false, 45410, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3280a, false, 45410, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3282c != null) {
            e.a().b(d.a(this.f3281b.b().e(), this.f3282c.getAid()));
        }
    }

    public void a(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f3280a, false, 45399, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f3280a, false, 45399, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        if (this.f3281b.n().c(1) && AbTestManager.a().Q()) {
            this.i.postDelayed(this.j, j2);
        }
    }

    public void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f3280a, false, 45412, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f3280a, false, 45412, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f3280a, false, 45406, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3280a, false, 45406, new Class[0], Void.TYPE);
        } else if (!(this.f3282c == null || this.f3282c.getAuthor() == null || !this.f3282c.getAuthor().isLive())) {
            User author = this.f3282c.getAuthor();
            com.ss.android.ugc.aweme.story.live.b.b(this.f3281b.c(), 0, author.getRequestId(), author.getUid(), author.roomId, "homepage_follow");
        }
        m();
    }

    public b(c.b bVar, l lVar) {
        this.f3281b = bVar;
        this.f3283d = lVar;
        this.i = new WeakHandler(Looper.getMainLooper(), this);
    }

    public void a(Aweme aweme, String str, String str2) {
        Aweme aweme2 = aweme;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{aweme2, str3, str4}, this, f3280a, false, 45400, new Class[]{Aweme.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme2, str3, str4}, this, f3280a, false, 45400, new Class[]{Aweme.class, String.class, String.class}, Void.TYPE);
            return;
        }
        this.f3282c = aweme2;
        this.f3284e = str3;
        this.f3285f = str4;
        j();
    }
}
