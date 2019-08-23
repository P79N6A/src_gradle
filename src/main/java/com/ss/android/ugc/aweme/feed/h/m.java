package com.ss.android.ugc.aweme.feed.h;

import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.feed.ae;
import com.ss.android.ugc.aweme.feed.ag;
import com.ss.android.ugc.aweme.feed.f.ao;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord;
import com.ss.android.ugc.aweme.player.a.a;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;

public class m extends b<g> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45509a;

    /* renamed from: b  reason: collision with root package name */
    public x f45510b;
    public boolean g;
    private boolean h;
    private boolean i;
    private String j = "";
    private String k;
    private ae l;

    private static String b(int i2) {
        if (i2 == 4) {
            return "load_more";
        }
        switch (i2) {
            case 1:
                return "refresh";
            case 2:
                return "load_latest";
            default:
                return "";
        }
    }

    private static String c(int i2) {
        switch (i2) {
            case 0:
                return "homepage_hot";
            case 1:
                return "homepage_follow";
            case 2:
                return "homepage_fresh";
            default:
                return "";
        }
    }

    public m() {
    }

    private void e() {
        if (PatchProxy.isSupport(new Object[0], this, f45509a, false, 42044, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45509a, false, 42044, new Class[0], Void.TYPE);
            return;
        }
        if (this.h) {
            this.h = false;
            ((g) this.f2978e).f45485b = false;
        }
        c();
    }

    public void c() {
        if (PatchProxy.isSupport(new Object[0], this, f45509a, false, 42045, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45509a, false, 42045, new Class[0], Void.TYPE);
            return;
        }
        bg.a(new com.ss.android.ugc.aweme.feed.f.ae());
    }

    public final boolean d() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f45509a, false, 42050, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f45509a, false, 42050, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f2978e != null && ((g) this.f2978e).isHasMore()) {
            z = true;
        }
        return z;
    }

    @MeasureFunction
    public void b() {
        HotSearchGuideWord hotSearchGuideWord;
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f45509a, false, 42046, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f45509a, false, 42046, new Class[0], Void.TYPE);
            return;
        }
        ag i2 = ag.i();
        if (PatchProxy.isSupport(new Object[0], i2, ag.f3141a, false, 40173, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], i2, ag.f3141a, false, 40173, new Class[0], Void.TYPE);
        } else if (i2.s > 0) {
            i2.h();
        } else {
            i2.s = SystemClock.uptimeMillis();
        }
        if (this.l != null) {
            this.l.a(1, this.j, this.k, (g) i());
            ae aeVar = this.l;
            String str = this.j;
            String str2 = this.k;
            g gVar = (g) i();
            if (PatchProxy.isSupport(new Object[]{1, str, str2, gVar}, aeVar, ae.f44985a, false, 40145, new Class[]{Integer.TYPE, String.class, String.class, g.class}, Void.TYPE)) {
                ae aeVar2 = aeVar;
                PatchProxy.accessDispatch(new Object[]{1, str, str2, gVar}, aeVar2, ae.f44985a, false, 40145, new Class[]{Integer.TYPE, String.class, String.class, g.class}, Void.TYPE);
            } else {
                aeVar.a(1, str, str2, gVar, null);
            }
        }
        e();
        if (this.f45510b != null) {
            x xVar = this.f45510b;
            if (!this.i || this.g) {
                z = true;
            } else {
                z = false;
            }
            xVar.d(z);
        }
        this.i = false;
        this.g = false;
        super.b();
        if (!(i() == null || ((g) i()).getData() == null)) {
            a a2 = a.a();
            String requestId = ((FeedItemList) ((g) i()).getData()).getRequestId();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (PatchProxy.isSupport(new Object[]{requestId, new Long(elapsedRealtime)}, a2, a.f59057a, false, 64198, new Class[]{String.class, Long.TYPE}, Void.TYPE)) {
                a aVar = a2;
                PatchProxy.accessDispatch(new Object[]{requestId, new Long(elapsedRealtime)}, aVar, a.f59057a, false, 64198, new Class[]{String.class, Long.TYPE}, Void.TYPE);
            } else if (requestId != null) {
                a2.f59058b.put(requestId, Long.valueOf(elapsedRealtime));
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f45509a, false, 42047, new Class[0], HotSearchGuideWord.class)) {
            hotSearchGuideWord = (HotSearchGuideWord) PatchProxy.accessDispatch(new Object[0], this, f45509a, false, 42047, new Class[0], HotSearchGuideWord.class);
        } else if (i() == null || ((g) i()).f45486c == null) {
            hotSearchGuideWord = null;
        } else {
            hotSearchGuideWord = ((g) i()).f45486c.hotSearchGuideWord;
        }
        bg.a(new ao(hotSearchGuideWord));
        ag i3 = ag.i();
        if (PatchProxy.isSupport(new Object[0], i3, ag.f3141a, false, 40174, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], i3, ag.f3141a, false, 40174, new Class[0], Void.TYPE);
        } else if (i3.t > 0) {
            i3.h();
        } else {
            i3.t = SystemClock.uptimeMillis();
        }
    }

    public final void a(boolean z) {
        ((g) this.f2978e).f45485b = z;
        this.h = z;
    }

    public m(Fragment fragment) {
        this.l = new ae(fragment);
        this.i = false;
    }

    public final void a(Exception exc) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{exc}, this, f45509a, false, 42043, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f45509a, false, 42043, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        if (this.l != null) {
            this.l.a(0, this.j, this.k, null);
            this.l.a(0, this.j, this.k, null, exc);
        }
        e();
        if (this.f45510b != null) {
            x xVar = this.f45510b;
            if (this.i && !this.g) {
                z = false;
            }
            xVar.d(z);
        }
        this.i = false;
        this.g = false;
        super.a(exc);
        com.ss.android.ugc.aweme.lego.a.i.e();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.Object... r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f45509a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r5 = 0
            r6 = 42041(0xa439, float:5.8912E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x003d
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f45509a
            r13 = 0
            r14 = 42041(0xa439, float:5.8912E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Boolean.TYPE
            r11 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003d:
            r1 = 4
            r2 = r17
            boolean r0 = r2.a(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.h.m.a(java.lang.Object[]):boolean");
    }

    public final boolean a(int i2, Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), objArr}, this, f45509a, false, 42042, new Class[]{Integer.TYPE, Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), objArr}, this, f45509a, false, 42042, new Class[]{Integer.TYPE, Object[].class}, Boolean.TYPE)).booleanValue();
        }
        if (4 == i2 && objArr != null && objArr.length >= 2 && 1 == objArr[0].intValue() && objArr[1].intValue() == 0) {
            n.a("feed_auto_refresh", c.a().a("stackTrace", Log.getStackTraceString(new Exception())).b());
        }
        if (this.l != null) {
            this.j = b(objArr[0].intValue());
            this.k = c(objArr[1].intValue());
            this.l.a(this.j, this.k);
        }
        if (this.f45510b != null) {
            this.f45510b.d(this.g);
        }
        this.i = super.a(objArr);
        return this.i;
    }
}
