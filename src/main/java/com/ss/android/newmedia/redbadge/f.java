package com.ss.android.newmedia.redbadge;

import android.content.ComponentName;
import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.redbadge.a.a;
import com.ss.android.newmedia.redbadge.a.b;
import com.ss.android.newmedia.redbadge.a.c;
import com.ss.android.newmedia.redbadge.a.e;
import com.ss.android.newmedia.redbadge.a.g;
import com.ss.android.newmedia.redbadge.a.h;
import com.ss.android.newmedia.redbadge.a.i;
import com.ss.android.newmedia.redbadge.a.j;
import com.ss.android.newmedia.redbadge.a.k;
import com.ss.android.newmedia.redbadge.a.l;
import com.ss.android.newmedia.redbadge.a.m;
import com.ss.android.newmedia.redbadge.a.n;
import com.ss.android.newmedia.redbadge.a.o;
import com.ss.android.newmedia.redbadge.a.p;
import java.util.LinkedList;
import java.util.List;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30345a;

    /* renamed from: b  reason: collision with root package name */
    private static final List<Class<? extends a>> f30346b;

    /* renamed from: e  reason: collision with root package name */
    private static volatile f f30347e;

    /* renamed from: c  reason: collision with root package name */
    private a f30348c;

    /* renamed from: d  reason: collision with root package name */
    private ComponentName f30349d;

    private f() {
    }

    static {
        LinkedList linkedList = new LinkedList();
        f30346b = linkedList;
        linkedList.add(a.class);
        f30346b.add(b.class);
        f30346b.add(g.class);
        f30346b.add(h.class);
        f30346b.add(l.class);
        f30346b.add(n.class);
        f30346b.add(c.class);
        f30346b.add(com.ss.android.newmedia.redbadge.a.f.class);
        f30346b.add(i.class);
        f30346b.add(m.class);
        f30346b.add(o.class);
        f30346b.add(p.class);
        f30346b.add(j.class);
        f30346b.add(e.class);
        f30346b.add(k.class);
    }

    public static synchronized f a() {
        synchronized (f.class) {
            if (PatchProxy.isSupport(new Object[0], null, f30345a, true, 18765, new Class[0], f.class)) {
                f fVar = (f) PatchProxy.accessDispatch(new Object[0], null, f30345a, true, 18765, new Class[0], f.class);
                return fVar;
            }
            if (f30347e == null) {
                synchronized (f.class) {
                    if (f30347e == null) {
                        f30347e = new f();
                    }
                }
            }
            f fVar2 = f30347e;
            return fVar2;
        }
    }

    public final boolean a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, this, f30345a, false, 18768, new Class[]{Context.class}, Boolean.TYPE)) {
            return a(context2, 0);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, this, f30345a, false, 18768, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b7, code lost:
        if (r9.f30348c != null) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c1, code lost:
        if (android.os.Build.MANUFACTURER.equalsIgnoreCase("OPPO") == false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c3, code lost:
        r9.f30348c = new com.ss.android.newmedia.redbadge.a.i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d4, code lost:
        if (android.os.Build.MANUFACTURER.equalsIgnoreCase("VIVO") == false) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d6, code lost:
        r9.f30348c = new com.ss.android.newmedia.redbadge.a.m();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e6, code lost:
        if (android.os.Build.MANUFACTURER.equalsIgnoreCase("Xiaomi") == false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e8, code lost:
        r9.f30348c = new com.ss.android.newmedia.redbadge.a.n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f8, code lost:
        if (android.os.Build.MANUFACTURER.equalsIgnoreCase("ZUK") == false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fa, code lost:
        r9.f30348c = new com.ss.android.newmedia.redbadge.a.p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x010a, code lost:
        if (android.os.Build.MANUFACTURER.equalsIgnoreCase("ZTE") == false) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010c, code lost:
        r9.f30348c = new com.ss.android.newmedia.redbadge.a.o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x011c, code lost:
        if (android.os.Build.MANUFACTURER.equalsIgnoreCase("SONY") == false) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011e, code lost:
        r9.f30348c = new com.ss.android.newmedia.redbadge.a.l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012e, code lost:
        if (android.os.Build.MANUFACTURER.equalsIgnoreCase("Samsung") == false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0130, code lost:
        r9.f30348c = new com.ss.android.newmedia.redbadge.a.j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0138, code lost:
        r9.f30348c = new com.ss.android.newmedia.redbadge.a.d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(android.content.Context r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f30345a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 18770(0x4952, float:2.6302E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0037
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f30345a
            r3 = 0
            r4 = 18770(0x4952, float:2.6302E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0037:
            if (r10 != 0) goto L_0x003a
            return r8
        L_0x003a:
            android.content.pm.PackageManager r0 = r10.getPackageManager()     // Catch:{ Exception -> 0x0143 }
            java.lang.String r1 = r10.getPackageName()     // Catch:{ Exception -> 0x0143 }
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r1)     // Catch:{ Exception -> 0x0143 }
            if (r0 != 0) goto L_0x0049
            return r8
        L_0x0049:
            android.content.ComponentName r0 = r0.getComponent()     // Catch:{ Exception -> 0x0143 }
            r9.f30349d = r0     // Catch:{ Exception -> 0x0143 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ Exception -> 0x0143 }
            java.lang.String r1 = "android.intent.action.MAIN"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0143 }
            java.lang.String r1 = "android.intent.category.HOME"
            r0.addCategory(r1)     // Catch:{ Exception -> 0x0143 }
            android.content.pm.PackageManager r1 = r10.getPackageManager()     // Catch:{ Exception -> 0x0143 }
            r2 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r0 = r1.resolveActivity(r0, r2)     // Catch:{ Exception -> 0x0143 }
            if (r0 == 0) goto L_0x0142
            android.content.pm.ActivityInfo r1 = r0.activityInfo     // Catch:{ Exception -> 0x0143 }
            if (r1 == 0) goto L_0x0142
            android.content.pm.ActivityInfo r1 = r0.activityInfo     // Catch:{ Exception -> 0x0143 }
            java.lang.String r1 = r1.name     // Catch:{ Exception -> 0x0143 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0143 }
            if (r1 != 0) goto L_0x0142
            android.content.pm.ActivityInfo r1 = r0.activityInfo     // Catch:{ Exception -> 0x0143 }
            java.lang.String r1 = r1.name     // Catch:{ Exception -> 0x0143 }
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ Exception -> 0x0143 }
            java.lang.String r2 = "resolver"
            boolean r1 = r1.contains(r2)     // Catch:{ Exception -> 0x0143 }
            if (r1 == 0) goto L_0x0087
            goto L_0x0142
        L_0x0087:
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch:{ Exception -> 0x0143 }
            java.lang.String r0 = r0.packageName     // Catch:{ Exception -> 0x0143 }
            java.util.List<java.lang.Class<? extends com.ss.android.newmedia.redbadge.a>> r1 = f30346b     // Catch:{ Exception -> 0x0143 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0143 }
        L_0x0091:
            boolean r2 = r1.hasNext()     // Catch:{ Exception -> 0x0143 }
            if (r2 == 0) goto L_0x00b5
            java.lang.Object r2 = r1.next()     // Catch:{ Exception -> 0x0143 }
            java.lang.Class r2 = (java.lang.Class) r2     // Catch:{ Exception -> 0x0143 }
            r3 = 0
            java.lang.Object r2 = r2.newInstance()     // Catch:{ Throwable -> 0x00a5 }
            com.ss.android.newmedia.redbadge.a r2 = (com.ss.android.newmedia.redbadge.a) r2     // Catch:{ Throwable -> 0x00a5 }
            goto L_0x00a6
        L_0x00a5:
            r2 = r3
        L_0x00a6:
            if (r2 == 0) goto L_0x0091
            java.util.List r3 = r2.a()     // Catch:{ Exception -> 0x0143 }
            boolean r3 = r3.contains(r0)     // Catch:{ Exception -> 0x0143 }
            if (r3 == 0) goto L_0x0091
            r9.f30348c = r2     // Catch:{ Exception -> 0x0143 }
            r8 = 1
        L_0x00b5:
            com.ss.android.newmedia.redbadge.a r0 = r9.f30348c     // Catch:{ Exception -> 0x0140 }
            if (r0 != 0) goto L_0x0140
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x0140 }
            java.lang.String r1 = "OPPO"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0140 }
            if (r0 == 0) goto L_0x00cc
            com.ss.android.newmedia.redbadge.a.i r0 = new com.ss.android.newmedia.redbadge.a.i     // Catch:{ Exception -> 0x0140 }
            r0.<init>()     // Catch:{ Exception -> 0x0140 }
            r9.f30348c = r0     // Catch:{ Exception -> 0x0140 }
            goto L_0x0144
        L_0x00cc:
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x0140 }
            java.lang.String r1 = "VIVO"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0140 }
            if (r0 == 0) goto L_0x00de
            com.ss.android.newmedia.redbadge.a.m r0 = new com.ss.android.newmedia.redbadge.a.m     // Catch:{ Exception -> 0x0140 }
            r0.<init>()     // Catch:{ Exception -> 0x0140 }
            r9.f30348c = r0     // Catch:{ Exception -> 0x0140 }
            goto L_0x0144
        L_0x00de:
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x0140 }
            java.lang.String r1 = "Xiaomi"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0140 }
            if (r0 == 0) goto L_0x00f0
            com.ss.android.newmedia.redbadge.a.n r0 = new com.ss.android.newmedia.redbadge.a.n     // Catch:{ Exception -> 0x0140 }
            r0.<init>()     // Catch:{ Exception -> 0x0140 }
            r9.f30348c = r0     // Catch:{ Exception -> 0x0140 }
            goto L_0x0144
        L_0x00f0:
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x0140 }
            java.lang.String r1 = "ZUK"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0140 }
            if (r0 == 0) goto L_0x0102
            com.ss.android.newmedia.redbadge.a.p r0 = new com.ss.android.newmedia.redbadge.a.p     // Catch:{ Exception -> 0x0140 }
            r0.<init>()     // Catch:{ Exception -> 0x0140 }
            r9.f30348c = r0     // Catch:{ Exception -> 0x0140 }
            goto L_0x0144
        L_0x0102:
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x0140 }
            java.lang.String r1 = "ZTE"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0140 }
            if (r0 == 0) goto L_0x0114
            com.ss.android.newmedia.redbadge.a.o r0 = new com.ss.android.newmedia.redbadge.a.o     // Catch:{ Exception -> 0x0140 }
            r0.<init>()     // Catch:{ Exception -> 0x0140 }
            r9.f30348c = r0     // Catch:{ Exception -> 0x0140 }
            goto L_0x0144
        L_0x0114:
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x0140 }
            java.lang.String r1 = "SONY"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0140 }
            if (r0 == 0) goto L_0x0126
            com.ss.android.newmedia.redbadge.a.l r0 = new com.ss.android.newmedia.redbadge.a.l     // Catch:{ Exception -> 0x0140 }
            r0.<init>()     // Catch:{ Exception -> 0x0140 }
            r9.f30348c = r0     // Catch:{ Exception -> 0x0140 }
            goto L_0x0144
        L_0x0126:
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x0140 }
            java.lang.String r1 = "Samsung"
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x0140 }
            if (r0 == 0) goto L_0x0138
            com.ss.android.newmedia.redbadge.a.j r0 = new com.ss.android.newmedia.redbadge.a.j     // Catch:{ Exception -> 0x0140 }
            r0.<init>()     // Catch:{ Exception -> 0x0140 }
            r9.f30348c = r0     // Catch:{ Exception -> 0x0140 }
            goto L_0x0144
        L_0x0138:
            com.ss.android.newmedia.redbadge.a.d r0 = new com.ss.android.newmedia.redbadge.a.d     // Catch:{ Exception -> 0x0140 }
            r0.<init>()     // Catch:{ Exception -> 0x0140 }
            r9.f30348c = r0     // Catch:{ Exception -> 0x0140 }
            goto L_0x0144
        L_0x0140:
            r7 = r8
            goto L_0x0144
        L_0x0142:
            return r8
        L_0x0143:
            r7 = 0
        L_0x0144:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.newmedia.redbadge.f.b(android.content.Context):boolean");
    }

    public final void b(Context context, int i) throws e {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, this, f30345a, false, 18767, new Class[]{Context.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, this, f30345a, false, 18767, new Class[]{Context.class, Integer.TYPE}, Void.TYPE);
        } else if (this.f30348c != null || b(context)) {
            try {
                this.f30348c.a(context, this.f30349d, i);
            } catch (Exception e2) {
                throw new e("Unable to execute badge", e2);
            }
        } else {
            throw new e("No default launcher available");
        }
    }

    public final boolean a(Context context, int i) {
        if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(i)}, this, f30345a, false, 18766, new Class[]{Context.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(i)}, this, f30345a, false, 18766, new Class[]{Context.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        try {
            b(context, i);
            return true;
        } catch (e unused) {
            Logger.debug();
            return false;
        }
    }
}
