package com.bytedance.scene.group;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class d {

    /* renamed from: d  reason: collision with root package name */
    public static final HashMap<com.bytedance.scene.e, com.bytedance.scene.b.b> f22112d = new HashMap<>();
    private static final Runnable h = new Runnable() {
        public final void run() {
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public c f22113a;

    /* renamed from: b  reason: collision with root package name */
    public ViewGroup f22114b;

    /* renamed from: c  reason: collision with root package name */
    public b f22115c = new b();

    /* renamed from: e  reason: collision with root package name */
    public boolean f22116e = false;

    /* renamed from: f  reason: collision with root package name */
    public List<C0229d> f22117f = new ArrayList();
    private Handler g = new Handler(Looper.getMainLooper());
    private boolean i = false;

    class a extends c {

        /* renamed from: a  reason: collision with root package name */
        final int f22119a;

        /* renamed from: b  reason: collision with root package name */
        final String f22120b;

        /* renamed from: c  reason: collision with root package name */
        final com.bytedance.scene.animation.b f22121c;

        /* access modifiers changed from: protected */
        public final void a() {
            super.a();
        }

        private a(int i, com.bytedance.scene.e eVar, String str, com.bytedance.scene.animation.b bVar) {
            super(eVar, i, str, d.a(l.RESUMED, d.this.f22113a.f22098f), true, false, false);
            this.f22119a = i;
            this.f22120b = str;
            this.f22121c = bVar;
        }

        /* synthetic */ a(d dVar, int i, com.bytedance.scene.e eVar, String str, com.bytedance.scene.animation.b bVar, byte b2) {
            this(i, eVar, str, bVar);
        }
    }

    class b extends c {

        /* renamed from: b  reason: collision with root package name */
        private final com.bytedance.scene.animation.b f22124b;

        /* access modifiers changed from: protected */
        public final void a() {
            super.a();
            if (this.i.f22094b != null) {
            }
        }

        private b(com.bytedance.scene.e eVar, com.bytedance.scene.animation.b bVar) {
            super(eVar, -1, null, d.a(l.STOPPED, d.this.f22113a.f22098f), false, true, false);
            this.f22124b = bVar;
        }

        /* synthetic */ b(d dVar, com.bytedance.scene.e eVar, com.bytedance.scene.animation.b bVar, byte b2) {
            this(eVar, bVar);
        }
    }

    class c extends C0229d {

        /* renamed from: e  reason: collision with root package name */
        final int f22125e;

        /* renamed from: f  reason: collision with root package name */
        final String f22126f;
        final l g;

        /* access modifiers changed from: protected */
        public void a() {
        }

        /* access modifiers changed from: protected */
        public void b() {
        }

        /* access modifiers changed from: package-private */
        public final void a(@NonNull Runnable runnable) {
            boolean z;
            com.bytedance.scene.b.b bVar = d.f22112d.get(this.i);
            if (bVar != null) {
                bVar.b();
            }
            if (this.i.f22098f == l.NONE) {
                b bVar2 = d.this.f22115c;
                int i = this.f22125e;
                com.bytedance.scene.e eVar = this.i;
                String str = this.f22126f;
                a aVar = new a();
                aVar.f22105a = i;
                aVar.f22106b = eVar;
                aVar.f22107c = str;
                bVar2.f22111a.add(aVar);
            }
            if (this.i.f22098f != this.g) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                b();
            }
            d.a(d.this.f22113a, this.i, this.g, true, null);
            if (this.k) {
                d.this.f22115c.a(this.i).f22108d = false;
            }
            if (this.l) {
                d.this.f22115c.a(this.i).f22108d = true;
            }
            if (this.m) {
                b bVar3 = d.this.f22115c;
                bVar3.f22111a.remove(d.this.f22115c.a(this.i));
            }
            if (z) {
                a();
            }
            runnable.run();
        }

        c(com.bytedance.scene.e eVar, int i, String str, l lVar, boolean z, boolean z2, boolean z3) {
            super(eVar, lVar, z, z2, z3);
            if (!z || !z2) {
                this.f22125e = i;
                this.f22126f = str;
                this.g = lVar;
                return;
            }
            throw new IllegalArgumentException("cant forceShow with forceHide");
        }
    }

    /* renamed from: com.bytedance.scene.group.d$d  reason: collision with other inner class name */
    abstract class C0229d {
        final com.bytedance.scene.e i;
        final l j;
        final boolean k;
        final boolean l;
        final boolean m;

        /* access modifiers changed from: package-private */
        public abstract void a(@NonNull Runnable runnable);

        C0229d(com.bytedance.scene.e eVar, l lVar, boolean z, boolean z2, boolean z3) {
            this.i = eVar;
            this.j = lVar;
            this.k = z;
            this.l = z2;
            this.m = z3;
        }
    }

    public class e extends c {

        /* renamed from: a  reason: collision with root package name */
        public final View f22127a;

        /* renamed from: b  reason: collision with root package name */
        public final ViewGroup f22128b;

        /* renamed from: c  reason: collision with root package name */
        public int f22129c;
        private final com.bytedance.scene.animation.b o;
        private final boolean p;
        private boolean q;

        /* access modifiers changed from: protected */
        public final void b() {
            super.b();
            if (this.p) {
            }
        }

        /* access modifiers changed from: protected */
        public final void a() {
            super.a();
            if (this.q) {
                this.f22129c = this.f22127a.getVisibility();
                this.f22127a.setVisibility(0);
            }
        }

        private e(com.bytedance.scene.e eVar, com.bytedance.scene.animation.b bVar) {
            super(eVar, -1, null, l.NONE, false, false, true);
            boolean z;
            this.o = bVar;
            if (eVar.f22094b == null || eVar.f22094b.getParent() == null) {
                z = false;
            } else {
                z = true;
            }
            this.p = z;
            if (this.p) {
                this.f22127a = eVar.f22094b;
                this.f22128b = (ViewGroup) this.f22127a.getParent();
                return;
            }
            this.f22127a = null;
            this.f22128b = null;
        }

        public /* synthetic */ e(d dVar, com.bytedance.scene.e eVar, com.bytedance.scene.animation.b bVar, byte b2) {
            this(eVar, bVar);
        }
    }

    class f extends c {

        /* renamed from: b  reason: collision with root package name */
        private final com.bytedance.scene.animation.b f22132b;

        /* access modifiers changed from: protected */
        public final void a() {
            super.a();
            if (this.i.f22094b != null) {
            }
        }

        private f(com.bytedance.scene.e eVar, com.bytedance.scene.animation.b bVar) {
            super(eVar, -1, null, d.a(l.RESUMED, d.this.f22113a.f22098f), true, false, false);
            this.f22132b = bVar;
        }

        /* synthetic */ f(d dVar, com.bytedance.scene.e eVar, com.bytedance.scene.animation.b bVar, byte b2) {
            this(eVar, bVar);
        }
    }

    private List<a> b() {
        return this.f22115c.b();
    }

    d() {
    }

    public final List<com.bytedance.scene.e> a() {
        return this.f22115c.a();
    }

    public static void a(C0229d dVar) {
        dVar.a(h);
    }

    public final int b(com.bytedance.scene.e eVar) {
        return this.f22115c.a(eVar).f22105a;
    }

    public final a a(com.bytedance.scene.e eVar) {
        return this.f22115c.a(eVar);
    }

    public final a a(String str) {
        return this.f22115c.a(str);
    }

    /* access modifiers changed from: package-private */
    public final void b(l lVar) {
        List<a> b2 = b();
        for (int i2 = 0; i2 <= b2.size() - 1; i2++) {
            a aVar = b2.get(i2);
            if (!aVar.f22108d) {
                a(this.f22113a, aVar.f22106b, lVar, false, null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(l lVar) {
        List<com.bytedance.scene.e> a2 = a();
        for (int i2 = 0; i2 <= a2.size() - 1; i2++) {
            a(this.f22113a, a2.get(i2), lVar, false, null);
        }
    }

    public static l a(l lVar, l lVar2) {
        if (lVar.value < lVar2.value) {
            return lVar;
        }
        return lVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(@android.support.annotation.NonNull com.bytedance.scene.group.c r5, @android.support.annotation.NonNull com.bytedance.scene.e r6, @android.support.annotation.NonNull com.bytedance.scene.l r7, boolean r8, @android.support.annotation.Nullable java.lang.Runnable r9) {
        /*
        L_0x0000:
            com.bytedance.scene.l r0 = r6.f22098f
            if (r0 != r7) goto L_0x000a
            if (r9 == 0) goto L_0x0009
            r9.run()
        L_0x0009:
            return
        L_0x000a:
            int r1 = r0.value
            int r2 = r7.value
            r3 = 8
            if (r1 >= r2) goto L_0x0072
            int[] r1 = com.bytedance.scene.group.d.AnonymousClass2.f22118a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x0033;
                case 2: goto L_0x0025;
                case 3: goto L_0x001e;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0071
        L_0x001e:
            r6.h()
            a(r5, r6, r7, r8, r9)
            goto L_0x0071
        L_0x0025:
            android.view.View r0 = r6.f22094b
            r1 = 0
            r0.setVisibility(r1)
            r6.g()
            a(r5, r6, r7, r8, r9)
            goto L_0x00a8
        L_0x0033:
            android.app.Activity r0 = r5.f22093a
            r6.a((android.app.Activity) r0)
            r6.a((com.bytedance.scene.e) r5)
            com.bytedance.scene.group.d r0 = r5.j
            com.bytedance.scene.group.a r0 = r0.a((com.bytedance.scene.e) r6)
            android.os.Bundle r1 = r0.g
            r6.a((android.os.Bundle) r1)
            com.bytedance.scene.group.d r2 = r5.j
            int r2 = r2.b((com.bytedance.scene.e) r6)
            android.view.ViewGroup r2 = r5.b((int) r2)
            r6.a((android.os.Bundle) r1, (android.view.ViewGroup) r2)
            if (r8 != 0) goto L_0x005d
            android.view.View r4 = r6.f22094b
            android.view.ViewParent r4 = r4.getParent()
            if (r4 != 0) goto L_0x0067
        L_0x005d:
            android.view.View r4 = r6.f22094b
            r2.addView(r4)
            android.view.View r2 = r6.f22094b
            r2.setVisibility(r3)
        L_0x0067:
            r6.b(r1)
            r1 = 0
            r0.g = r1
            a(r5, r6, r7, r8, r9)
            goto L_0x00a8
        L_0x0071:
            return
        L_0x0072:
            int[] r1 = com.bytedance.scene.group.d.AnonymousClass2.f22118a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 2: goto L_0x0093;
                case 3: goto L_0x0085;
                case 4: goto L_0x007e;
                default: goto L_0x007d;
            }
        L_0x007d:
            goto L_0x00a8
        L_0x007e:
            r6.i()
            a(r5, r6, r7, r8, r9)
            return
        L_0x0085:
            r6.j()
            if (r8 == 0) goto L_0x008f
            android.view.View r0 = r6.f22094b
            r0.setVisibility(r3)
        L_0x008f:
            a(r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x00a9 }
            return
        L_0x0093:
            android.view.View r0 = r6.f22094b
            r6.k()
            if (r8 == 0) goto L_0x009d
            com.bytedance.scene.b.k.a((android.view.View) r0)
        L_0x009d:
            r6.l()
            r6.m()
            r6.n()
            goto L_0x0000
        L_0x00a8:
            return
        L_0x00a9:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.scene.group.d.a(com.bytedance.scene.group.c, com.bytedance.scene.e, com.bytedance.scene.l, boolean, java.lang.Runnable):void");
    }
}
