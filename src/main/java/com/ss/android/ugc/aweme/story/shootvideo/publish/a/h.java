package com.ss.android.ugc.aweme.story.shootvideo.publish.a;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.a;
import com.ss.android.ugc.aweme.port.in.ah;
import com.ss.android.ugc.aweme.port.in.s;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73649a;

    /* renamed from: d  reason: collision with root package name */
    private static h f73650d;

    /* renamed from: b  reason: collision with root package name */
    protected s.a f73651b;

    /* renamed from: c  reason: collision with root package name */
    public int f73652c;

    /* renamed from: e  reason: collision with root package name */
    private s.c f73653e;

    private h() {
        e();
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f73649a, false, 85441, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73649a, false, 85441, new Class[0], Void.TYPE);
            return;
        }
        this.f73653e = a.B.b();
        this.f73653e.a((s.d) new s.d() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f73654a;

            public final void a(s.e eVar) {
                boolean z;
                boolean z2 = true;
                if (PatchProxy.isSupport(new Object[]{eVar}, this, f73654a, false, 85445, new Class[]{s.e.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{eVar}, this, f73654a, false, 85445, new Class[]{s.e.class}, Void.TYPE);
                    return;
                }
                a.o.i().a(Integer.valueOf(eVar.a()));
                a.o.j().a(Integer.valueOf(eVar.b()));
                ah.a<Boolean> k = a.o.k();
                if (eVar.c() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                k.a(Boolean.valueOf(z));
                ah.a<Boolean> l = a.o.l();
                if (eVar.d() != 0) {
                    z2 = false;
                }
                l.a(Boolean.valueOf(z2));
                a.o.m().a(Integer.valueOf(eVar.e()));
            }
        });
    }

    public static h a() {
        if (PatchProxy.isSupport(new Object[0], null, f73649a, true, 85440, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], null, f73649a, true, 85440, new Class[0], h.class);
        }
        if (f73650d == null) {
            synchronized (h.class) {
                if (f73650d == null) {
                    f73650d = new h();
                }
            }
        }
        return f73650d;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f73649a, false, 85442, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73649a, false, 85442, new Class[0], Void.TYPE);
        } else if (!com.ss.android.g.a.a() && a.x.c() && !TextUtils.isEmpty(a.x.d())) {
            if (this.f73653e == null) {
                e();
            }
            this.f73653e.a(new Object[0]);
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f73649a, false, 85443, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f73649a, false, 85443, new Class[0], Void.TYPE);
        } else if (a.A.a()) {
            this.f73652c = ((Integer) a.o.m().a()).intValue();
            if (this.f73652c <= 1) {
                this.f73652c++;
                if (this.f73651b == null) {
                    this.f73651b = a.B.c();
                }
                this.f73651b.a((s.b) new s.b() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f73656a;

                    public final void b() {
                    }

                    public final void a() {
                        if (PatchProxy.isSupport(new Object[0], this, f73656a, false, 85446, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f73656a, false, 85446, new Class[0], Void.TYPE);
                            return;
                        }
                        a.o.m().a(Integer.valueOf(h.this.f73652c));
                    }
                });
                this.f73651b.a("sync_toast", Integer.valueOf(this.f73652c));
            }
        }
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f73649a, false, 85444, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f73649a, false, 85444, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!((Boolean) a.o.l().a()).booleanValue()) {
            return false;
        } else {
            if (!((Boolean) a.o.n().a()).booleanValue()) {
                return a.B.d();
            }
            return true;
        }
    }
}
