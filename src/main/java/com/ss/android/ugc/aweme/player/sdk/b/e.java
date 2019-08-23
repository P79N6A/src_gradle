package com.ss.android.ugc.aweme.player.sdk.b;

import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.player.sdk.api.IPlayer;
import com.ss.android.ugc.aweme.player.sdk.api.b;
import com.ss.android.ugc.aweme.player.sdk.api.c;
import com.ss.android.ugc.aweme.player.sdk.api.d;
import com.ss.android.ugc.playerkit.a.a;
import com.ss.android.ugc.playerkit.c.c;
import com.ss.android.ugc.playerkit.session.Session;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.gl.TextureRenderer;
import com.ss.ttvideoengine.gl.VideoTextureRenderer;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59163a;
    private boolean A;
    private boolean B;
    private a C;
    private com.ss.android.ugc.aweme.player.sdk.api.a D;
    private String E;

    /* renamed from: b  reason: collision with root package name */
    public IPlayer f59164b;

    /* renamed from: c  reason: collision with root package name */
    public AtomicReference<IPlayer> f59165c;

    /* renamed from: d  reason: collision with root package name */
    public c.a f59166d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.playerkit.c.e f59167e;

    /* renamed from: f  reason: collision with root package name */
    public volatile Surface f59168f;
    public String g;
    public String h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public long o;
    public long p = -1;
    public IPlayer.c q;
    public com.ss.android.ugc.aweme.video.a.a r;
    public b s;
    com.ss.android.ugc.playerkit.c.b t;
    public long u;
    public VideoTextureRenderer v;
    public Surface w;
    public int x;
    public boolean y;
    private boolean z;

    public final void b(int i2) {
    }

    public final void n() {
    }

    public final void o() {
    }

    public final int l() {
        return this.l;
    }

    public final c.a q() {
        return this.f59166d;
    }

    public final void a(com.ss.android.ugc.playerkit.c.e eVar) {
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f59163a, false, 64345, new Class[]{com.ss.android.ugc.playerkit.c.e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f59163a, false, 64345, new Class[]{com.ss.android.ugc.playerkit.c.e.class}, Void.TYPE);
        } else if (eVar != null) {
            this.t = eVar.f77723f;
            this.h = eVar.m;
            this.m = 0;
            a(eVar, eVar.f77721d, eVar.f77722e);
        }
    }

    public final void a(com.ss.android.ugc.playerkit.c.e eVar, String str, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{eVar, str, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f59163a, false, 64346, new Class[]{com.ss.android.ugc.playerkit.c.e.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar, str, Byte.valueOf(z2)}, this, f59163a, false, 64346, new Class[]{com.ss.android.ugc.playerkit.c.e.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(eVar, str, z2, 0, false);
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f59163a, false, 64358, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f59163a, false, 64358, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (!TextUtils.isEmpty(str) && str.equals(this.g)) {
            if (PatchProxy.isSupport(new Object[0], this, f59163a, false, 64359, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f59163a, false, 64359, new Class[0], Void.TYPE);
                return;
            }
            if (this.n < 2 || this.n > 5 || this.z) {
                a(this.f59167e, this.g, true);
                this.z = false;
            } else if (!this.A || this.f59164b == null || !this.f59164b.f()) {
                this.n = 2;
                b();
            } else {
                a(this.f59167e, this.g, true, this.f59164b.l(), true);
            }
            if (this.r != null) {
                this.r.b(this.g);
            }
        }
    }

    public final boolean a(String str, String str2) {
        if (!PatchProxy.isSupport(new Object[]{str, str2}, this, f59163a, false, 64368, new Class[]{String.class, String.class}, Boolean.TYPE)) {
            return this.g != null && this.g.equals(str) && this.E != null && this.E.equals(str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f59163a, false, 64368, new Class[]{String.class, String.class}, Boolean.TYPE)).booleanValue();
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f59163a, false, 64370, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f59163a, false, 64370, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.y && this.v != null) {
            this.v.changeDisplaySize(i2, i3);
        }
    }

    public final void m() {
        this.g = "";
    }

    private void v() {
        this.i = false;
        this.z = false;
        this.j = false;
        this.k = false;
        this.l = 0;
        this.A = false;
        this.B = false;
    }

    private void x() {
        if (PatchProxy.isSupport(new Object[0], this, f59163a, false, 64350, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59163a, false, 64350, new Class[0], Void.TYPE);
            return;
        }
        if (this.v != null) {
            this.v.setSurface(null);
        }
        this.B = true;
        if (this.f59164b != null) {
            this.f59164b.e();
        }
        this.B = false;
        this.n = 0;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f59163a, false, 64355, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59163a, false, 64355, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.n == 6 || this.f59164b == null)) {
            d();
            this.f59164b.c();
            this.n = 6;
        }
    }

    public final boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f59163a, false, 64362, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f59163a, false, 64362, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f59164b != null) {
            return this.f59164b.j();
        } else {
            return false;
        }
    }

    public final long g() {
        if (PatchProxy.isSupport(new Object[0], this, f59163a, false, 64363, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f59163a, false, 64363, new Class[0], Long.TYPE)).longValue();
        } else if (this.B || this.f59164b == null) {
            return -1;
        } else {
            return this.f59164b.l();
        }
    }

    public final long h() {
        if (PatchProxy.isSupport(new Object[0], this, f59163a, false, 64364, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f59163a, false, 64364, new Class[0], Long.TYPE)).longValue();
        } else if (this.B || this.f59164b == null) {
            return -1;
        } else {
            return this.f59164b.m();
        }
    }

    public final boolean i() {
        if (PatchProxy.isSupport(new Object[0], this, f59163a, false, 64366, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f59163a, false, 64366, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f59164b != null) {
            return this.f59164b.k();
        } else {
            return false;
        }
    }

    public final boolean j() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f59163a, false, 64351, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f59163a, false, 64351, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f59164b != null && this.f59164b.g()) {
            z2 = true;
        }
        return z2;
    }

    public final String k() {
        if (PatchProxy.isSupport(new Object[0], this, f59163a, false, 64367, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f59163a, false, 64367, new Class[0], String.class);
        } else if (this.f59164b != null) {
            return this.f59164b.n();
        } else {
            return null;
        }
    }

    public final boolean r() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f59163a, false, 64371, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f59163a, false, 64371, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f59164b != null) {
            z2 = this.f59164b.h();
        }
        return z2;
    }

    public final IPlayer.e s() {
        if (PatchProxy.isSupport(new Object[0], this, f59163a, false, 64372, new Class[0], IPlayer.e.class)) {
            return (IPlayer.e) PatchProxy.accessDispatch(new Object[0], this, f59163a, false, 64372, new Class[0], IPlayer.e.class);
        }
        IPlayer iPlayer = this.f59165c.get();
        if (iPlayer != null) {
            return iPlayer.p();
        }
        return null;
    }

    public final IPlayer.d t() {
        if (PatchProxy.isSupport(new Object[0], this, f59163a, false, 64373, new Class[0], IPlayer.d.class)) {
            return (IPlayer.d) PatchProxy.accessDispatch(new Object[0], this, f59163a, false, 64373, new Class[0], IPlayer.d.class);
        }
        IPlayer iPlayer = this.f59165c.get();
        if (iPlayer != null) {
            return iPlayer.q();
        }
        return null;
    }

    public final String u() {
        if (PatchProxy.isSupport(new Object[0], this, f59163a, false, 64386, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f59163a, false, 64386, new Class[0], String.class);
        }
        IPlayer iPlayer = this.f59165c.get();
        if (iPlayer != null) {
            return iPlayer.o();
        }
        return null;
    }

    private void w() {
        if (PatchProxy.isSupport(new Object[0], this, f59163a, false, 64348, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59163a, false, 64348, new Class[0], Void.TYPE);
            return;
        }
        if (this.s != null) {
            this.f59164b = this.s.a(this.f59166d);
            this.f59165c.set(this.f59164b);
        }
        this.f59164b.a((IPlayer.b) new IPlayer.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59172a;

            public final boolean a(Surface surface) {
                if (PatchProxy.isSupport(new Object[]{surface}, this, f59172a, false, 64389, new Class[]{Surface.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{surface}, this, f59172a, false, 64389, new Class[]{Surface.class}, Boolean.TYPE)).booleanValue();
                } else if (!e.this.y || e.this.v == null || e.this.x != 1) {
                    e.this.y = false;
                    return false;
                } else {
                    e.this.v.setSurface(surface);
                    if (e.this.w == null) {
                        e.this.w = new Surface(e.this.v.getVideoTexture());
                    }
                    e.this.f59164b.b(e.this.w);
                    return true;
                }
            }
        });
        this.f59164b.a(this.C);
        this.f59164b.a((d) new d() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59174a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f59174a, false, 64390, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f59174a, false, 64390, new Class[0], Void.TYPE);
                    return;
                }
                if (e.this.r != null) {
                    e.this.r.c(true);
                }
            }

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f59174a, false, 64391, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f59174a, false, 64391, new Class[0], Void.TYPE);
                    return;
                }
                if (e.this.r != null) {
                    e.this.r.c(false);
                }
            }
        });
        this.q = new IPlayer.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59176a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f59176a, false, 64392, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f59176a, false, 64392, new Class[0], Void.TYPE);
                    return;
                }
                if (e.this.n == 1) {
                    e.this.n = 2;
                    e.this.k = true;
                    if (e.this.j) {
                        e.this.p = System.currentTimeMillis();
                        e.this.b();
                    }
                } else if (e.this.n == 5) {
                    e.this.d();
                }
            }

            public final void c() {
                if (PatchProxy.isSupport(new Object[0], this, f59176a, false, 64396, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f59176a, false, 64396, new Class[0], Void.TYPE);
                    return;
                }
                if (e.this.r != null) {
                    if (e.this.l == 0) {
                        e.this.r.d(e.this.g);
                    }
                    e.this.l++;
                    e.this.r.e(e.this.g);
                }
            }

            public final void b() {
                long j;
                if (PatchProxy.isSupport(new Object[0], this, f59176a, false, 64393, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f59176a, false, 64393, new Class[0], Void.TYPE);
                    return;
                }
                if (e.this.r != null) {
                    com.ss.android.ugc.aweme.player.sdk.c.b.a().a(e.this.h, "player_on_render");
                    if (e.this.f59164b != null) {
                        j = e.this.f59164b.m();
                    } else {
                        j = -1;
                    }
                    com.ss.android.ugc.playerkit.session.a.a().a(e.this.h);
                    e.this.r.a(new com.ss.android.ugc.aweme.video.b.a(e.this.g, e.this.i, j));
                    if (e.this.f59166d != c.a.EXO) {
                        e.this.r.a(new com.ss.android.ugc.aweme.video.b.b(e.this.g, e.this.i));
                    }
                }
                e eVar = e.this;
                if (PatchProxy.isSupport(new Object[0], eVar, e.f59163a, false, 64349, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], eVar, e.f59163a, false, 64349, new Class[0], Void.TYPE);
                } else if (eVar.s != null) {
                    if (eVar.o != -1) {
                        long currentTimeMillis = System.currentTimeMillis() - eVar.o;
                        if (currentTimeMillis > 0) {
                            eVar.s.a(eVar.t.getPrepareKey(), currentTimeMillis, eVar.f59166d, eVar.f59167e.b(), eVar.i);
                        }
                        eVar.o = -1;
                    }
                    if (eVar.p != -1) {
                        long currentTimeMillis2 = System.currentTimeMillis() - eVar.p;
                        if (currentTimeMillis2 > 0) {
                            eVar.s.b(eVar.t.getFirstFrameKey(), currentTimeMillis2, eVar.f59166d, eVar.f59167e.b(), eVar.i);
                        }
                        eVar.p = -1;
                    }
                }
                e.this.k = false;
            }

            public final void a(boolean z) {
                if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f59176a, false, 64394, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f59176a, false, 64394, new Class[]{Boolean.TYPE}, Void.TYPE);
                    return;
                }
                if (!z) {
                    e.this.k = false;
                    if (e.this.r != null) {
                        e.this.r.b(false);
                    }
                } else if (e.this.r != null && (!(e.this.f59164b == null || e.this.f59164b.l() == 0) || e.this.k)) {
                    e.this.r.b(true);
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:18:0x0083  */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x00b9  */
            /* JADX WARNING: Removed duplicated region for block: B:24:0x00c9  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x012c  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void a(int r14, int r15, java.lang.Object r16) {
                /*
                    r13 = this;
                    r7 = r13
                    r8 = r15
                    r9 = 3
                    java.lang.Object[] r0 = new java.lang.Object[r9]
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
                    r10 = 0
                    r0[r10] = r1
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
                    r11 = 1
                    r0[r11] = r1
                    r12 = 2
                    r0[r12] = r16
                    com.meituan.robust.ChangeQuickRedirect r2 = f59176a
                    java.lang.Class[] r5 = new java.lang.Class[r9]
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r5[r10] = r1
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r5[r11] = r1
                    java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                    r5[r12] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r3 = 0
                    r4 = 64395(0xfb8b, float:9.0237E-41)
                    r1 = r13
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x005e
                    java.lang.Object[] r0 = new java.lang.Object[r9]
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
                    r0[r10] = r1
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
                    r0[r11] = r1
                    r0[r12] = r16
                    com.meituan.robust.ChangeQuickRedirect r2 = f59176a
                    r3 = 0
                    r4 = 64395(0xfb8b, float:9.0237E-41)
                    java.lang.Class[] r5 = new java.lang.Class[r9]
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r5[r10] = r1
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r5[r11] = r1
                    java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                    r5[r12] = r1
                    java.lang.Class r6 = java.lang.Void.TYPE
                    r1 = r13
                    com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    return
                L_0x005e:
                    com.ss.android.ugc.aweme.player.sdk.b.e r0 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    com.ss.android.ugc.playerkit.c.c$a r0 = r0.f59166d
                    com.ss.android.ugc.playerkit.c.c$a r1 = com.ss.android.ugc.playerkit.c.c.a.Ijk
                    if (r0 == r1) goto L_0x0071
                    com.ss.android.ugc.aweme.player.sdk.b.e r0 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    boolean r0 = r0.j()
                    if (r0 == 0) goto L_0x006f
                    goto L_0x0071
                L_0x006f:
                    r6 = r14
                    goto L_0x0080
                L_0x0071:
                    r0 = -10000(0xffffffffffffd8f0, float:NaN)
                    r6 = r14
                    if (r6 != r0) goto L_0x0080
                    r0 = -1000(0xfffffffffffffc18, float:NaN)
                    if (r8 == r0) goto L_0x007e
                    r0 = -2000(0xfffffffffffff830, float:NaN)
                    if (r8 != r0) goto L_0x0080
                L_0x007e:
                    r9 = 1
                    goto L_0x0081
                L_0x0080:
                    r9 = 0
                L_0x0081:
                    if (r9 != 0) goto L_0x00a9
                    com.ss.android.ugc.aweme.player.sdk.c.b r0 = com.ss.android.ugc.aweme.player.sdk.c.b.a()
                    com.ss.android.ugc.aweme.player.sdk.b.e r1 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    java.lang.String r1 = r1.h
                    java.lang.String r2 = "player_on_failed"
                    r0.a(r1, r2)
                    com.ss.android.ugc.aweme.video.e r12 = new com.ss.android.ugc.aweme.video.e
                    com.ss.android.ugc.aweme.player.sdk.b.e r0 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    java.lang.String r1 = r0.g
                    com.ss.android.ugc.aweme.player.sdk.b.e r0 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    boolean r2 = r0.i
                    r0 = r12
                    r3 = r14
                    r4 = r15
                    r5 = r16
                    r0.<init>(r1, r2, r3, r4, r5)
                    com.ss.android.ugc.aweme.player.sdk.b.e r0 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    com.ss.android.ugc.aweme.video.a.a r0 = r0.r
                    r0.a((com.ss.android.ugc.aweme.video.e) r12)
                L_0x00a9:
                    java.lang.Thread r0 = java.lang.Thread.currentThread()
                    long r0 = r0.getId()
                    com.ss.android.ugc.aweme.player.sdk.b.e r2 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    long r2 = r2.u
                    int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r4 == 0) goto L_0x00c3
                    java.lang.Exception r0 = new java.lang.Exception
                    r0.<init>()
                    java.lang.String r1 = "onError thread not match"
                    com.bytedance.article.common.monitor.stack.ExceptionMonitor.ensureNotReachHere((java.lang.Throwable) r0, (java.lang.String) r1)
                L_0x00c3:
                    com.ss.android.ugc.aweme.player.sdk.b.e r0 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    com.ss.android.ugc.aweme.player.sdk.api.IPlayer r0 = r0.f59164b
                    if (r0 == 0) goto L_0x00e7
                    com.ss.android.ugc.aweme.player.sdk.b.e r0 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    com.ss.android.ugc.aweme.player.sdk.api.IPlayer r0 = r0.f59164b
                    r1 = 0
                    r0.a((android.view.Surface) r1)
                    com.ss.android.ugc.aweme.player.sdk.b.e r0 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    com.ss.android.ugc.aweme.player.sdk.api.IPlayer r0 = r0.f59164b
                    r0.d()
                    com.ss.android.ugc.aweme.player.sdk.b.e r0 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    r0.f59164b = r1
                    com.ss.android.ugc.aweme.player.sdk.b.e r0 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    java.util.concurrent.atomic.AtomicReference<com.ss.android.ugc.aweme.player.sdk.api.IPlayer> r0 = r0.f59165c
                    r0.set(r1)
                    com.ss.android.ugc.aweme.player.sdk.b.e r0 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    r0.n = r10
                L_0x00e7:
                    com.ss.android.ugc.aweme.player.sdk.b.e r0 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    r1 = -1
                    r0.o = r1
                    com.ss.android.ugc.aweme.player.sdk.b.e r0 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    r0.p = r1
                    if (r9 == 0) goto L_0x0145
                    com.ss.android.ugc.aweme.player.sdk.b.e r0 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    int r0 = r0.m
                    r1 = 10
                    if (r0 >= r1) goto L_0x0145
                    com.ss.android.ugc.aweme.player.sdk.b.e r0 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    int r1 = r0.m
                    int r1 = r1 + r11
                    r0.m = r1
                    com.ss.android.ugc.aweme.player.sdk.c.b r0 = com.ss.android.ugc.aweme.player.sdk.c.b.a()
                    com.ss.android.ugc.aweme.player.sdk.b.e r1 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    java.lang.String r1 = r1.h
                    java.lang.String r2 = "player_try_play"
                    r0.a(r1, r2)
                    com.ss.android.ugc.aweme.player.sdk.b.e r0 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    com.ss.android.ugc.playerkit.c.c$a r1 = com.ss.android.ugc.playerkit.c.c.a.Ijk
                    r0.f59166d = r1
                    com.ss.android.ugc.aweme.player.sdk.b.e r0 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    com.ss.android.ugc.aweme.player.sdk.b.e r1 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    com.ss.android.ugc.playerkit.c.e r1 = r1.f59167e
                    com.ss.android.ugc.aweme.player.sdk.b.e r2 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    java.lang.String r2 = r2.g
                    com.ss.android.ugc.aweme.player.sdk.b.e r3 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    boolean r3 = r3.j
                    r0.a(r1, r2, r3)
                    com.ss.android.ugc.aweme.player.sdk.b.e r0 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    com.ss.android.ugc.aweme.video.a.a r0 = r0.r
                    if (r0 == 0) goto L_0x0145
                    com.ss.android.ugc.aweme.player.sdk.b.e r0 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    com.ss.android.ugc.aweme.video.a.a r9 = r0.r
                    com.ss.android.ugc.aweme.video.e r10 = new com.ss.android.ugc.aweme.video.e
                    com.ss.android.ugc.aweme.player.sdk.b.e r0 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    java.lang.String r1 = r0.g
                    com.ss.android.ugc.aweme.player.sdk.b.e r0 = com.ss.android.ugc.aweme.player.sdk.b.e.this
                    boolean r2 = r0.i
                    r0 = r10
                    r3 = r14
                    r4 = r15
                    r5 = r16
                    r0.<init>(r1, r2, r3, r4, r5)
                    r9.b((com.ss.android.ugc.aweme.video.e) r10)
                L_0x0145:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.player.sdk.b.e.AnonymousClass5.a(int, int, java.lang.Object):void");
            }
        };
        this.f59164b.a(this.q);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f59163a, false, 64354, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59163a, false, 64354, new Class[0], Void.TYPE);
            return;
        }
        if (this.f59164b != null && this.n == 2 && this.f59168f != null && this.f59168f.isValid()) {
            this.f59164b.a(this.f59168f);
            this.f59164b.a();
            this.n = 3;
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f59163a, false, 64356, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59163a, false, 64356, new Class[0], Void.TYPE);
            return;
        }
        if (this.f59164b != null && this.n <= 5) {
            if (!(this.f59166d == c.a.Ijk || this.f59166d == c.a.IjkHardware) || this.f59164b.k()) {
                this.f59164b.b();
                if (this.r != null && this.n <= 5) {
                    this.r.c(this.g);
                }
            }
            if (this.n == 1) {
                this.z = true;
            }
            this.n = 5;
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f59163a, false, 64357, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59163a, false, 64357, new Class[0], Void.TYPE);
            return;
        }
        if (Thread.currentThread().getId() != this.u) {
            ExceptionMonitor.ensureNotReachHere((Throwable) new Exception(), "release thread not match");
        }
        c();
        if (this.v != null) {
            this.v.setOnErrorListener(null);
            this.v.release();
            this.v = null;
        }
        this.w = null;
        this.y = false;
        this.x = 0;
        if (this.f59164b != null) {
            this.B = true;
            this.f59164b.d();
            this.B = false;
            this.f59164b = null;
            this.f59165c.set(null);
            this.n = 7;
        }
    }

    public final void p() {
        float f2;
        if (PatchProxy.isSupport(new Object[0], this, f59163a, false, 64369, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59163a, false, 64369, new Class[0], Void.TYPE);
            return;
        }
        long g2 = g();
        if (h() == 0) {
            f2 = 0.0f;
        } else {
            f2 = (((float) g2) * 100.0f) / ((float) h());
        }
        if (this.r != null) {
            this.r.a(f2);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f59163a, false, 64352, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59163a, false, 64352, new Class[0], Void.TYPE);
            return;
        }
        this.j = true;
        if (this.n == 1 || this.n == 2 || this.n == 5 || this.n == 6 || this.n == 3) {
            if (this.n == 2) {
                b();
            }
            return;
        }
        a(this.f59167e, this.g, true);
    }

    public final void a(com.ss.android.ugc.aweme.player.sdk.api.a aVar) {
        this.D = aVar;
    }

    public final void a(b bVar) {
        this.s = bVar;
    }

    public final boolean b(com.ss.android.ugc.aweme.video.a.a aVar) {
        if (this.r == aVar) {
            return true;
        }
        return false;
    }

    public final void a(Surface surface) {
        boolean z2;
        if (this.f59168f != surface) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.A = z2;
        this.f59168f = surface;
    }

    public e(c.a aVar) {
        this.f59166d = aVar;
        this.f59165c = new AtomicReference<>(null);
    }

    public final void a(com.ss.android.ugc.aweme.video.a.a aVar) {
        this.r = aVar;
    }

    public final void a(a aVar) {
        this.C = aVar;
    }

    public final void b(Surface surface) {
        if (PatchProxy.isSupport(new Object[]{surface}, this, f59163a, false, 64353, new Class[]{Surface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{surface}, this, f59163a, false, 64353, new Class[]{Surface.class}, Void.TYPE);
            return;
        }
        if (this.f59164b != null) {
            this.f59164b.a(surface);
        }
    }

    public final float a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f59163a, false, 64365, new Class[]{Integer.TYPE}, Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f59163a, false, 64365, new Class[]{Integer.TYPE}, Float.TYPE)).floatValue();
        }
        IPlayer iPlayer = this.f59165c.get();
        if (this.B || iPlayer == null) {
            return -1.0f;
        }
        return iPlayer.a(i2);
    }

    public final void a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f59163a, false, 64360, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f59163a, false, 64360, new Class[]{Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.f59164b != null) {
            this.f59164b.a(f2);
        }
    }

    public final void a(float f2, float f3) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f59163a, false, 64361, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Float.valueOf(f3)}, this, f59163a, false, 64361, new Class[]{Float.TYPE, Float.TYPE}, Void.TYPE);
            return;
        }
        if (this.f59164b != null) {
            this.f59164b.a(f2, f3);
        }
    }

    private void a(com.ss.android.ugc.playerkit.c.e eVar, String str, boolean z2, long j2, boolean z3) {
        String str2;
        com.ss.android.ugc.playerkit.c.e eVar2 = eVar;
        String str3 = str;
        long j3 = j2;
        boolean z4 = false;
        if (PatchProxy.isSupport(new Object[]{eVar2, str3, Byte.valueOf(z2 ? (byte) 1 : 0), new Long(j3), Byte.valueOf(z3 ? (byte) 1 : 0)}, this, f59163a, false, 64347, new Class[]{com.ss.android.ugc.playerkit.c.e.class, String.class, Boolean.TYPE, Long.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2, str3, Byte.valueOf(z2), new Long(j3), Byte.valueOf(z3)}, this, f59163a, false, 64347, new Class[]{com.ss.android.ugc.playerkit.c.e.class, String.class, Boolean.TYPE, Long.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (eVar2 != null && eVar.a() != null && eVar.a().f77724a != null) {
            com.ss.android.ugc.lib.video.bitrate.regulator.a.c cVar = eVar.a().f77727d;
            if (cVar == null || TextUtils.isEmpty(cVar.getUrlKey())) {
                str2 = this.h;
            } else {
                str2 = cVar.getUrlKey();
            }
            if (this.n != 1 || !a(str3, str2)) {
                this.u = Thread.currentThread().getId();
                v();
                this.f59167e = eVar2;
                this.E = str2;
                this.o = System.currentTimeMillis();
                this.g = str3;
                this.i = eVar2.h;
                if (this.f59164b == null) {
                    w();
                } else {
                    if (z3) {
                        this.f59164b.a(j3);
                    }
                    x();
                }
                this.j = z2;
                this.k = false;
                this.l = 0;
                this.A = false;
                if (this.f59166d == c.a.IjkHardware || this.f59166d == c.a.Ijk) {
                    this.f59164b.i();
                }
                if (this.t.isLoop()) {
                    this.f59164b.a(true);
                }
                try {
                    if (eVar2.t && this.f59164b.b(eVar2.h) && (this.f59164b instanceof f)) {
                        z4 = true;
                    }
                    this.y = z4;
                    if (this.y && this.v == null) {
                        this.v = new VideoTextureRenderer();
                        this.v.setOnErrorListener(new TextureRenderer.OnEglErrorListener() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f59169a;

                            public final void onError(int i, String str) {
                                String str2 = str;
                                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2}, this, f59169a, false, 64388, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2}, this, f59169a, false, 64388, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
                                    return;
                                }
                                String str3 = "mVideoTextureRenderer onError errorLevel:" + i + ", errorInfo:" + str2;
                                if (PatchProxy.isSupport(new Object[]{"SimplifyPlayerImpl", str3}, null, com.ss.android.ugc.aweme.player.sdk.a.f59111a, true, 64219, new Class[]{String.class, String.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{"SimplifyPlayerImpl", str3}, null, com.ss.android.ugc.aweme.player.sdk.a.f59111a, true, 64219, new Class[]{String.class, String.class}, Void.TYPE);
                                }
                                if (e.this.y && e.this.v != null && e.this.x == 1) {
                                    e.this.y = false;
                                    e.this.v.release();
                                    e.this.v = null;
                                    e.this.w = null;
                                    e.this.x = -1;
                                    if (!(e.this.f59168f == null || !e.this.f59168f.isValid() || e.this.f59164b == null)) {
                                        e.this.f59164b.b(e.this.f59168f);
                                    }
                                }
                            }
                        });
                        this.v.setOnStateChangedListener(new TextureRenderer.OnStateChangeListener() {
                            public final void onStateChanged(int i) {
                                e.this.x = i;
                            }
                        });
                    }
                    if (this.v != null && this.y) {
                        TTVideoEngine tTVideoEngine = ((f) this.f59164b).f59181e;
                        if (tTVideoEngine != null) {
                            tTVideoEngine.setRenderer(this.v);
                        }
                    }
                    if (this.f59168f != null && this.f59168f.isValid()) {
                        this.f59164b.a(this.f59168f);
                    }
                    com.ss.android.ugc.aweme.player.sdk.c.b.a().a(this.h, "player_prepare_play");
                    String str4 = (String) eVar.a().f77724a;
                    HashMap hashMap = new HashMap();
                    hashMap.put("context", eVar2.f77720c);
                    hashMap.put("vr", Boolean.valueOf(eVar2.g));
                    hashMap.put("h265", Boolean.valueOf(eVar2.h));
                    hashMap.put("render_type", Integer.valueOf(eVar2.i));
                    hashMap.put("async_init", Boolean.valueOf(eVar2.r));
                    if (eVar2.s > 0) {
                        hashMap.put("init_start_time_ms", Integer.valueOf(eVar2.s));
                    }
                    if (eVar.a().f77727d != null) {
                        hashMap.put("bitrate", Integer.valueOf(eVar.a().f77727d.getBitRate()));
                        hashMap.put("ratio", Integer.valueOf(eVar.a().f77727d.getQualityType() / 10));
                    }
                    hashMap.put("frames_wait", Integer.valueOf(eVar2.k));
                    hashMap.put("key", eVar2.n);
                    hashMap.put("decoder_type", Integer.valueOf(eVar2.j));
                    this.f59164b.a(eVar2.m, this.D);
                    this.f59164b.a(str4, (Map<String, Object>) hashMap);
                    this.n = 1;
                    Session b2 = com.ss.android.ugc.playerkit.session.a.a().b(eVar2.m);
                    if (b2 != null) {
                        b2.h265 = eVar2.h;
                    }
                } catch (IOException e2) {
                    if (this.r != null) {
                        String str5 = this.g;
                        boolean z5 = this.i;
                        com.ss.android.ugc.aweme.video.e eVar3 = new com.ss.android.ugc.aweme.video.e(str5, z5, -123, -123, "prepare exception:" + e2.toString());
                        this.r.a(eVar3);
                    }
                    this.o = -1;
                }
            }
        }
    }
}
