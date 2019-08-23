package com.ss.android.ugc.aweme.newfollow.f;

import android.app.Activity;
import android.content.Context;
import android.view.TextureView;
import com.bytedance.common.utility.NetworkUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.ag.j;
import com.ss.android.ugc.aweme.feed.d;
import com.ss.android.ugc.aweme.feed.listener.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.newfollow.b;
import com.ss.android.ugc.aweme.newfollow.util.n;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.shortvideo.f.f;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.video.a.a;
import com.ss.android.ugc.aweme.video.e;
import com.ss.android.ugc.aweme.video.o;
import com.ss.android.ugc.playerkit.videoview.i;

public final class k implements c, b.a, a, i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57151a;

    /* renamed from: b  reason: collision with root package name */
    public b.C0650b f57152b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.newfollow.util.i f57153c;

    /* renamed from: d  reason: collision with root package name */
    public Aweme f57154d;

    /* renamed from: e  reason: collision with root package name */
    public d f57155e;

    /* renamed from: f  reason: collision with root package name */
    public String f57156f;
    public boolean g;
    public String h;
    public com.ss.android.ugc.aweme.feed.b.a i = new com.ss.android.ugc.aweme.feed.b.a();
    public int j = 2;
    public boolean k;
    private boolean l;
    private String m;

    public final void a() {
    }

    public final void a(float f2) {
    }

    public final void b(e eVar) {
    }

    public final void c(boolean z) {
    }

    public final o f() {
        if (this.f57153c != null) {
            return this.f57153c.f57422c;
        }
        return null;
    }

    private void i() {
        if (PatchProxy.isSupport(new Object[0], this, f57151a, false, 61330, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57151a, false, 61330, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.newfollow.util.d c2 = com.ss.android.ugc.aweme.newfollow.util.e.a().c(this.m);
        if (c2 != null) {
            c2.a();
        }
    }

    public com.ss.android.ugc.aweme.newfollow.util.d b() {
        if (!PatchProxy.isSupport(new Object[0], this, f57151a, false, 61319, new Class[0], com.ss.android.ugc.aweme.newfollow.util.d.class)) {
            return com.ss.android.ugc.aweme.newfollow.util.e.a().c(this.m);
        }
        return (com.ss.android.ugc.aweme.newfollow.util.d) PatchProxy.accessDispatch(new Object[0], this, f57151a, false, 61319, new Class[0], com.ss.android.ugc.aweme.newfollow.util.d.class);
    }

    public Aweme c() {
        if (PatchProxy.isSupport(new Object[0], this, f57151a, false, 61320, new Class[0], Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[0], this, f57151a, false, 61320, new Class[0], Aweme.class);
        } else if (this.f57154d.getAwemeType() == 13) {
            return this.f57154d.getForwardItem();
        } else {
            return this.f57154d;
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f57151a, false, 61322, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57151a, false, 61322, new Class[0], Void.TYPE);
            return;
        }
        if ((!this.f57152b.e() || this.g) && this.f57153c != null) {
            this.f57153c.e();
        }
        this.l = true;
    }

    private void k() {
        if (PatchProxy.isSupport(new Object[0], this, f57151a, false, 61339, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57151a, false, 61339, new Class[0], Void.TYPE);
            return;
        }
        if (!m() || com.ss.android.ugc.aweme.framework.d.a.a(GlobalContext.getContext()) || this.f57153c.a(false) || !com.ss.android.ugc.aweme.freeflowcard.b.a().j) {
            this.f57153c.f();
        } else {
            this.f57153c.g();
        }
        this.i.f45077a = 2;
        if (b() != null) {
            b().f57412c = 2;
        }
    }

    private void l() {
        if (PatchProxy.isSupport(new Object[0], this, f57151a, false, 61340, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57151a, false, 61340, new Class[0], Void.TYPE);
            return;
        }
        if (!m() || com.ss.android.ugc.aweme.framework.d.a.a(GlobalContext.getContext()) || this.f57153c.a(false) || !com.ss.android.ugc.aweme.freeflowcard.b.a().j) {
            this.f57153c.i();
        } else {
            this.f57153c.j();
        }
        this.i.f45077a = 4;
        if (b() != null) {
            b().f57412c = 4;
        }
    }

    private boolean m() {
        if (PatchProxy.isSupport(new Object[0], this, f57151a, false, 61345, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f57151a, false, 61345, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.k && AbTestManager.a().d().followToastType == 1 && AbTestManager.a().d().newFlowStrategy == 0) {
            return true;
        } else {
            return false;
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f57151a, false, 61341, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57151a, false, 61341, new Class[0], Void.TYPE);
            return;
        }
        Aweme c2 = c();
        if (c2 != null && c2.getMusic() != null) {
            h a2 = h.a();
            Activity d2 = this.f57152b.d();
            a2.a(d2, j.a("aweme://music/detail/" + c2.getMusic().getMid()).a("aweme_id", c2.getAid()).a());
            com.ss.android.ugc.aweme.newfollow.g.a.d(this.f57154d, this.f57156f, this.h);
        }
    }

    private void j() {
        if (PatchProxy.isSupport(new Object[0], this, f57151a, false, 61338, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57151a, false, 61338, new Class[0], Void.TYPE);
            return;
        }
        switch (this.j) {
            case 0:
            case 4:
                if (NetworkUtils.isNetworkAvailable(GlobalContext.getContext())) {
                    l();
                    break;
                } else {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) this.f57152b.d(), (int) C0906R.string.bgf).a();
                    return;
                }
            case 1:
                break;
            case 2:
                this.f57152b.a(true);
                if (!NetworkUtils.isNetworkAvailable(GlobalContext.getContext())) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) this.f57152b.d(), (int) C0906R.string.bgf).a();
                    return;
                } else {
                    k();
                    return;
                }
            case 3:
                this.f57152b.a(true);
                break;
        }
        this.f57153c.e();
        this.i.f45077a = 3;
        this.f57152b.a(1);
        if (b() != null) {
            b().f57412c = 3;
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f57151a, false, 61321, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57151a, false, 61321, new Class[0], Void.TYPE);
            return;
        }
        if (this.f57153c != null) {
            if (!this.l && b() != null && (b().f57412c == 3 || b().f57412c == 0)) {
                this.f57152b.a(1);
                this.i.f45077a = 3;
                b.C0650b bVar = this.f57152b;
                f fVar = new f(12, this.f57153c.c(), this.f57153c.d());
                bVar.a(fVar);
                return;
            } else if (!m() || com.ss.android.ugc.aweme.framework.d.a.a(GlobalContext.getContext()) || this.f57153c.a(false) || !com.ss.android.ugc.aweme.freeflowcard.b.a().j) {
                this.f57153c.i();
            } else {
                this.f57153c.j();
            }
        }
        this.l = false;
    }

    public final void h() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f57151a, false, 61343, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57151a, false, 61343, new Class[0], Void.TYPE);
            return;
        }
        if (this.i.f45077a == 3) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        this.j = i2;
        if (this.j == 0) {
            com.ss.android.ugc.aweme.newfollow.g.a.a(this.f57154d);
        } else {
            com.ss.android.ugc.aweme.newfollow.g.a.a(this.f57154d, a(true), true);
        }
        if (this.j == 0) {
            if (PatchProxy.isSupport(new Object[0], this, f57151a, false, 61344, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f57151a, false, 61344, new Class[0], Void.TYPE);
            } else if (!NetworkUtils.isNetworkAvailable(GlobalContext.getContext())) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this.f57152b.d(), (int) C0906R.string.bgf).a();
            } else {
                if (m()) {
                    this.f57153c.j();
                } else {
                    this.f57153c.i();
                }
                this.i.f45077a = 4;
                if (b() != null) {
                    b().f57412c = 4;
                }
            }
        } else {
            j();
        }
    }

    public final String a(boolean z) {
        return this.f57156f;
    }

    public final void a(com.ss.android.ugc.aweme.video.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f57151a, false, 61325, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f57151a, false, 61325, new Class[]{com.ss.android.ugc.aweme.video.b.a.class}, Void.TYPE);
            return;
        }
        this.i.f45077a = 2;
        this.f57152b.a(new f(0, aVar.f76012c));
        this.f57152b.b();
        this.f57152b.a(0);
    }

    public final void b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f57151a, false, 61328, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f57151a, false, 61328, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f57152b.a(false);
        this.i.f45077a = 2;
        this.f57152b.b();
        this.f57152b.a(0);
        if (this.j == 4) {
            b.C0650b bVar = this.f57152b;
            f fVar = new f(11, this.f57153c.c(), this.f57153c.d());
            bVar.a(fVar);
        } else {
            this.f57152b.a(new f(3));
        }
        i();
    }

    public final void e(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f57151a, false, 61333, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f57151a, false, 61333, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f57152b.a(new f(7));
    }

    public final void a(com.ss.android.ugc.aweme.video.b.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f57151a, false, 61335, new Class[]{com.ss.android.ugc.aweme.video.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f57151a, false, 61335, new Class[]{com.ss.android.ugc.aweme.video.b.b.class}, Void.TYPE);
            return;
        }
        this.f57152b.a(false);
        this.i.f45077a = 2;
        this.f57152b.a(new f(5));
        i();
        if (b() != null) {
            com.ss.android.ugc.aweme.newfollow.util.d b2 = b();
            String str = this.f57156f;
            if (PatchProxy.isSupport(new Object[]{str, (byte) 1}, b2, com.ss.android.ugc.aweme.newfollow.util.d.f57410a, false, 61899, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
                com.ss.android.ugc.aweme.newfollow.util.d dVar = b2;
                PatchProxy.accessDispatch(new Object[]{str, (byte) 1}, dVar, com.ss.android.ugc.aweme.newfollow.util.d.f57410a, false, 61899, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            } else if (!b2.h) {
                b2.h = true;
                com.ss.android.ugc.aweme.newfollow.g.a.a(b2.f57411b, str, "", "", true, "");
            }
        }
    }

    public final void b(boolean z) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f57151a, false, 61334, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f57151a, false, 61334, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f57152b.a(new f(8, z, 0));
        b.C0650b bVar = this.f57152b;
        if (z) {
            i2 = 2;
        }
        bVar.a(i2);
    }

    public final void c(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f57151a, false, 61329, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f57151a, false, 61329, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.i.f45077a = 3;
        this.f57152b.a(1);
        this.f57152b.c();
        if (this.j == 3) {
            b.C0650b bVar = this.f57152b;
            f fVar = new f(12, this.f57153c.c(), this.f57153c.d());
            bVar.a(fVar);
        } else {
            this.f57152b.a(new f(4));
        }
        if (PatchProxy.isSupport(new Object[0], this, f57151a, false, 61331, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f57151a, false, 61331, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.newfollow.util.d c2 = com.ss.android.ugc.aweme.newfollow.util.e.a().c(this.m);
        if (c2 != null) {
            String str2 = this.f57156f;
            if (PatchProxy.isSupport(new Object[]{(byte) 1, str2}, c2, com.ss.android.ugc.aweme.newfollow.util.d.f57410a, false, 61893, new Class[]{Boolean.TYPE, String.class}, Void.TYPE)) {
                com.ss.android.ugc.aweme.newfollow.util.d dVar = c2;
                PatchProxy.accessDispatch(new Object[]{(byte) 1, str2}, dVar, com.ss.android.ugc.aweme.newfollow.util.d.f57410a, false, 61893, new Class[]{Boolean.TYPE, String.class}, Void.TYPE);
            } else if (c2.g != -1) {
                Aweme aweme = c2.f57411b;
                long currentTimeMillis = System.currentTimeMillis() - c2.g;
                if (PatchProxy.isSupport(new Object[]{aweme, new Long(currentTimeMillis), (byte) 1, str2}, null, com.ss.android.ugc.aweme.newfollow.g.a.f57157a, true, 61363, new Class[]{Aweme.class, Long.TYPE, Boolean.TYPE, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aweme, new Long(currentTimeMillis), (byte) 1, str2}, null, com.ss.android.ugc.aweme.newfollow.g.a.f57157a, true, 61363, new Class[]{Aweme.class, Long.TYPE, Boolean.TYPE, String.class}, Void.TYPE);
                } else {
                    com.ss.android.ugc.aweme.newfollow.g.a.a(aweme, currentTimeMillis, true, str2, "", "");
                }
                c2.g = -1;
            }
        }
    }

    public final void d(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f57151a, false, 61332, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f57151a, false, 61332, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f57152b.a(new f(6));
        bg.a(new com.ss.android.ugc.aweme.newfollow.c.b(2, this.f57154d));
        Aweme aweme = this.f57154d;
        String str2 = this.f57156f;
        if (PatchProxy.isSupport(new Object[]{aweme, str2}, null, com.ss.android.ugc.aweme.newfollow.g.a.f57157a, true, 61360, new Class[]{Aweme.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, str2}, null, com.ss.android.ugc.aweme.newfollow.g.a.f57157a, true, 61360, new Class[]{Aweme.class, String.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.newfollow.g.a.a(aweme, "", str2);
    }

    public final void a(e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f57151a, false, 61326, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f57151a, false, 61326, new Class[]{e.class}, Void.TYPE);
            return;
        }
        this.f57152b.a(new f(1));
        this.f57152b.c();
        this.f57152b.a(1);
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f57151a, false, 61327, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f57151a, false, 61327, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.i.f45077a = 1;
        this.f57152b.a(new f(2));
        this.f57152b.a(2);
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f57151a, false, 61336, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f57151a, false, 61336, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f57152b.isActive()) {
            j();
        }
        Aweme c2 = c();
        if (!(c2 == null || c2.getVideo() == null)) {
            n.a(i2, i3, (TextureView) this.f57152b.a().a(), ((float) c2.getVideo().getHeight()) / ((float) c2.getVideo().getWidth()));
            this.f57152b.a(i2, i3);
        }
    }

    public final void b(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f57151a, false, 61337, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f57151a, false, 61337, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Aweme c2 = c();
        if (!(c2 == null || c2.getVideo() == null)) {
            n.a(i2, i3, (TextureView) this.f57152b.a().a(), ((float) c2.getVideo().getHeight()) / ((float) c2.getVideo().getWidth()));
            this.f57152b.a(i2, i3, ((float) c2.getVideo().getHeight()) / ((float) c2.getVideo().getWidth()));
        }
    }

    public k(Aweme aweme, b.C0650b bVar, String str, String str2) {
        this.f57152b = bVar;
        this.f57154d = aweme;
        this.m = str2;
        if (this.f57154d != null) {
            this.f57156f = str;
            this.f57155e = new d(this.f57156f, 0, null, this);
            this.f57155e.a(bVar.d(), null);
            if (PatchProxy.isSupport(new Object[0], this, f57151a, false, 61318, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f57151a, false, 61318, new Class[0], Void.TYPE);
                return;
            }
            this.f57152b.a().a((i) this);
            this.f57153c = new com.ss.android.ugc.aweme.newfollow.util.i(this.f57152b.a(), (a) this, this.f57155e, com.ss.android.ugc.aweme.longvideo.j.f53965a);
            com.ss.android.ugc.aweme.newfollow.util.d b2 = b();
            if (b2 == null || b2.i == null) {
                this.f57153c.f57422c = com.ss.android.ugc.aweme.newfollow.util.j.a().b();
                this.f57152b.a(true);
            } else {
                this.f57153c.f57422c = b2.i;
            }
            this.f57153c.a(this.f57154d);
            this.f57153c.f57424e = this.k;
        }
    }
}
