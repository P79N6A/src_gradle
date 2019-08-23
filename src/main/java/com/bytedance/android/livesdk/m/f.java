package com.bytedance.android.livesdk.m;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import com.bytedance.android.livesdk.m.b;
import com.bytedance.android.livesdk.m.c.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.Iterator;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16363a;

    /* renamed from: b  reason: collision with root package name */
    private b f16364b;

    public static abstract class a implements com.bytedance.android.livesdk.m.b.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f16365a;

        public abstract String a(Activity activity, String... strArr);

        public abstract String b(Activity activity, String... strArr);

        public String a(Activity activity) {
            Activity activity2 = activity;
            if (!PatchProxy.isSupport(new Object[]{activity2}, this, f16365a, false, 12625, new Class[]{Activity.class}, String.class)) {
                return activity2.getString(C0906R.string.dg_);
            }
            return (String) PatchProxy.accessDispatch(new Object[]{activity2}, this, f16365a, false, 12625, new Class[]{Activity.class}, String.class);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.app.Activity r17, com.bytedance.android.livesdk.m.b.c r18, java.lang.String[] r19, java.lang.String[] r20) {
            /*
                r16 = this;
                r7 = r16
                r8 = r17
                r9 = r18
                r10 = r19
                r11 = 4
                java.lang.Object[] r0 = new java.lang.Object[r11]
                r12 = 0
                r0[r12] = r8
                r13 = 1
                r0[r13] = r9
                r14 = 2
                r0[r14] = r10
                r15 = 3
                r0[r15] = r20
                com.meituan.robust.ChangeQuickRedirect r2 = f16365a
                java.lang.Class[] r5 = new java.lang.Class[r11]
                java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
                r5[r12] = r1
                java.lang.Class<com.bytedance.android.livesdk.m.b.c> r1 = com.bytedance.android.livesdk.m.b.c.class
                r5[r13] = r1
                java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                r5[r14] = r1
                java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                r5[r15] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 12627(0x3153, float:1.7694E-41)
                r1 = r16
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0061
                java.lang.Object[] r0 = new java.lang.Object[r11]
                r0[r12] = r8
                r0[r13] = r9
                r0[r14] = r10
                r0[r15] = r20
                com.meituan.robust.ChangeQuickRedirect r2 = f16365a
                r3 = 0
                r4 = 12627(0x3153, float:1.7694E-41)
                java.lang.Class[] r5 = new java.lang.Class[r11]
                java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
                r5[r12] = r1
                java.lang.Class<com.bytedance.android.livesdk.m.b.c> r1 = com.bytedance.android.livesdk.m.b.c.class
                r5[r13] = r1
                java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                r5[r14] = r1
                java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                r5[r15] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r16
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0061:
                com.bytedance.android.live.uikit.dialog.b$a r0 = new com.bytedance.android.live.uikit.dialog.b$a
                r0.<init>(r8)
                java.lang.String r1 = r7.b(r8, r10)
                com.bytedance.android.live.uikit.dialog.b$a r0 = r0.a((java.lang.CharSequence) r1)
                java.lang.String r1 = r7.a(r8, r10)
                com.bytedance.android.live.uikit.dialog.b$a r0 = r0.b((java.lang.CharSequence) r1)
                java.lang.String r1 = r16.a(r17)
                com.bytedance.android.livesdk.m.g r2 = new com.bytedance.android.livesdk.m.g
                r2.<init>(r7, r9)
                com.bytedance.android.live.uikit.dialog.b$a r10 = r0.a((java.lang.CharSequence) r1, (android.content.DialogInterface.OnClickListener) r2)
                java.lang.Object[] r0 = new java.lang.Object[r13]
                r0[r12] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f16365a
                r3 = 0
                r4 = 12626(0x3152, float:1.7693E-41)
                java.lang.Class[] r5 = new java.lang.Class[r13]
                java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
                r5[r12] = r1
                java.lang.Class<java.lang.String> r6 = java.lang.String.class
                r1 = r16
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x00b6
                java.lang.Object[] r0 = new java.lang.Object[r13]
                r0[r12] = r8
                com.meituan.robust.ChangeQuickRedirect r2 = f16365a
                r3 = 0
                r4 = 12626(0x3152, float:1.7693E-41)
                java.lang.Class[] r5 = new java.lang.Class[r13]
                java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
                r5[r12] = r1
                java.lang.Class<java.lang.String> r6 = java.lang.String.class
                r1 = r16
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                java.lang.String r0 = (java.lang.String) r0
                goto L_0x00bd
            L_0x00b6:
                r0 = 2131563151(0x7f0d128f, float:1.875175E38)
                java.lang.String r0 = r8.getString(r0)
            L_0x00bd:
                android.content.DialogInterface$OnClickListener r1 = com.bytedance.android.livesdk.m.h.f16378b
                com.bytedance.android.live.uikit.dialog.b$a r0 = r10.b((java.lang.CharSequence) r0, (android.content.DialogInterface.OnClickListener) r1)
                android.content.DialogInterface$OnKeyListener r1 = com.bytedance.android.livesdk.m.i.f16380b
                com.bytedance.android.live.uikit.dialog.a$a r2 = r0.f8551b
                r2.s = r1
                com.bytedance.android.live.uikit.dialog.b$a r0 = r0.a((boolean) r12)
                com.bytedance.android.livesdk.m.j r1 = new com.bytedance.android.livesdk.m.j
                r1.<init>(r7, r9)
                com.bytedance.android.live.uikit.dialog.b$a r0 = r0.a((android.content.DialogInterface.OnCancelListener) r1)
                r0.b()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.m.f.a.a(android.app.Activity, com.bytedance.android.livesdk.m.b.c, java.lang.String[], java.lang.String[]):void");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f16366a;

        /* renamed from: b  reason: collision with root package name */
        Activity f16367b;

        /* renamed from: c  reason: collision with root package name */
        com.bytedance.android.livesdk.m.b.b f16368c = new c();

        /* renamed from: d  reason: collision with root package name */
        com.bytedance.android.livesdk.m.b.b f16369d = new d();

        /* renamed from: e  reason: collision with root package name */
        Runnable f16370e = k.f16385b;

        /* renamed from: f  reason: collision with root package name */
        Runnable f16371f = l.f16387b;

        public final b a(Runnable runnable) {
            this.f16370e = runnable;
            return this;
        }

        public final b b(Runnable runnable) {
            this.f16371f = runnable;
            return this;
        }

        public b(Activity activity) {
            this.f16367b = activity;
        }

        public final void a(com.bytedance.android.livesdk.m.b.d dVar, String... strArr) {
            if (PatchProxy.isSupport(new Object[]{dVar, strArr}, this, f16366a, false, 12632, new Class[]{com.bytedance.android.livesdk.m.b.d.class, String[].class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{dVar, strArr}, this, f16366a, false, 12632, new Class[]{com.bytedance.android.livesdk.m.b.d.class, String[].class}, Void.TYPE);
            } else if (this.f16367b != null && !this.f16367b.isFinishing()) {
                try {
                    new f(this.f16367b, (byte) 0).a(dVar, this.f16370e, this.f16368c, this.f16369d, this.f16371f, strArr);
                } catch (Exception unused) {
                }
            }
        }
    }

    public static class c implements com.bytedance.android.livesdk.m.b.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f16372a;

        public final void a(Activity activity, com.bytedance.android.livesdk.m.b.c cVar, String[] strArr, String[] strArr2) {
            if (PatchProxy.isSupport(new Object[]{activity, cVar, strArr, strArr2}, this, f16372a, false, 12636, new Class[]{Activity.class, com.bytedance.android.livesdk.m.b.c.class, String[].class, String[].class}, Void.TYPE)) {
                Object[] objArr = {activity, cVar, strArr, strArr2};
                PatchProxy.accessDispatch(objArr, this, f16372a, false, 12636, new Class[]{Activity.class, com.bytedance.android.livesdk.m.b.c.class, String[].class, String[].class}, Void.TYPE);
                return;
            }
            cVar.a();
        }
    }

    public static class d extends a {

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f16373b;

        public final String a(Activity activity) {
            Activity activity2 = activity;
            if (!PatchProxy.isSupport(new Object[]{activity2}, this, f16373b, false, 12639, new Class[]{Activity.class}, String.class)) {
                return activity2.getString(C0906R.string.djm);
            }
            return (String) PatchProxy.accessDispatch(new Object[]{activity2}, this, f16373b, false, 12639, new Class[]{Activity.class}, String.class);
        }

        public final String b(Activity activity, String... strArr) {
            Activity activity2 = activity;
            if (!PatchProxy.isSupport(new Object[]{activity2, strArr}, this, f16373b, false, 12637, new Class[]{Activity.class, String[].class}, String.class)) {
                return activity2.getString(C0906R.string.dh3);
            }
            return (String) PatchProxy.accessDispatch(new Object[]{activity2, strArr}, this, f16373b, false, 12637, new Class[]{Activity.class, String[].class}, String.class);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String a(android.app.Activity r20, java.lang.String... r21) {
            /*
                r19 = this;
                r0 = r20
                r1 = r21
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r10 = 0
                r3[r10] = r0
                r11 = 1
                r3[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r5 = f16373b
                java.lang.Class[] r8 = new java.lang.Class[r2]
                java.lang.Class<android.app.Activity> r4 = android.app.Activity.class
                r8[r10] = r4
                java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
                r8[r11] = r4
                java.lang.Class<java.lang.String> r9 = java.lang.String.class
                r6 = 0
                r7 = 12638(0x315e, float:1.771E-41)
                r4 = r19
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r3 == 0) goto L_0x0048
                java.lang.Object[] r12 = new java.lang.Object[r2]
                r12[r10] = r0
                r12[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r14 = f16373b
                r15 = 0
                r16 = 12638(0x315e, float:1.771E-41)
                java.lang.Class[] r0 = new java.lang.Class[r2]
                java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
                r0[r10] = r1
                java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                r0[r11] = r1
                java.lang.Class<java.lang.String> r18 = java.lang.String.class
                r13 = r19
                r17 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                java.lang.String r0 = (java.lang.String) r0
                return r0
            L_0x0048:
                r3 = 2131564190(0x7f0d169e, float:1.8753858E38)
                java.lang.Object[] r4 = new java.lang.Object[r11]
                java.lang.Object[] r12 = new java.lang.Object[r2]
                r12[r10] = r0
                r12[r11] = r1
                r13 = 0
                com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.livesdk.m.d.f16358a
                r15 = 1
                r16 = 12610(0x3142, float:1.767E-41)
                java.lang.Class[] r5 = new java.lang.Class[r2]
                java.lang.Class<android.content.Context> r6 = android.content.Context.class
                r5[r10] = r6
                java.lang.Class<java.lang.String[]> r6 = java.lang.String[].class
                r5[r11] = r6
                java.lang.Class<java.lang.String> r18 = java.lang.String.class
                r17 = r5
                boolean r5 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
                if (r5 == 0) goto L_0x008e
                java.lang.Object[] r12 = new java.lang.Object[r2]
                r12[r10] = r0
                r12[r11] = r1
                r13 = 0
                com.meituan.robust.ChangeQuickRedirect r14 = com.bytedance.android.livesdk.m.d.f16358a
                r15 = 1
                r16 = 12610(0x3142, float:1.767E-41)
                java.lang.Class[] r1 = new java.lang.Class[r2]
                java.lang.Class<android.content.Context> r2 = android.content.Context.class
                r1[r10] = r2
                java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
                r1[r11] = r2
                java.lang.Class<java.lang.String> r18 = java.lang.String.class
                r17 = r1
                java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                java.lang.String r1 = (java.lang.String) r1
                goto L_0x00e5
            L_0x008e:
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                int r5 = r1.length
                r6 = 0
            L_0x0095:
                if (r6 >= r5) goto L_0x00b5
                r7 = r1[r6]
                java.util.Map<java.lang.String, java.lang.Integer> r8 = com.bytedance.android.livesdk.m.d.f16359b
                boolean r8 = r8.containsKey(r7)
                if (r8 == 0) goto L_0x00b2
                java.util.Map<java.lang.String, java.lang.Integer> r8 = com.bytedance.android.livesdk.m.d.f16359b
                java.lang.Object r7 = r8.get(r7)
                java.lang.Integer r7 = (java.lang.Integer) r7
                boolean r8 = r2.contains(r7)
                if (r8 != 0) goto L_0x00b2
                r2.add(r7)
            L_0x00b2:
                int r6 = r6 + 1
                goto L_0x0095
            L_0x00b5:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.util.Iterator r2 = r2.iterator()
            L_0x00be:
                boolean r5 = r2.hasNext()
                if (r5 == 0) goto L_0x00e1
                java.lang.Object r5 = r2.next()
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r6 = r1.length()
                if (r6 <= 0) goto L_0x00d5
                java.lang.String r6 = ", "
                r1.append(r6)
            L_0x00d5:
                int r5 = r5.intValue()
                java.lang.String r5 = r0.getString(r5)
                r1.append(r5)
                goto L_0x00be
            L_0x00e1:
                java.lang.String r1 = r1.toString()
            L_0x00e5:
                r4[r10] = r1
                java.lang.String r0 = r0.getString(r3, r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.m.f.d.a(android.app.Activity, java.lang.String[]):java.lang.String");
        }
    }

    public static b a(Activity activity) {
        Activity activity2 = activity;
        if (!PatchProxy.isSupport(new Object[]{activity2}, null, f16363a, true, 12624, new Class[]{Activity.class}, b.class)) {
            return new b(activity2);
        }
        return (b) PatchProxy.accessDispatch(new Object[]{activity2}, null, f16363a, true, 12624, new Class[]{Activity.class}, b.class);
    }

    private f(Activity activity) {
        b bVar;
        if (PatchProxy.isSupport(new Object[]{activity}, this, f16363a, false, 12623, new Class[]{Activity.class}, b.class)) {
            bVar = (b) PatchProxy.accessDispatch(new Object[]{activity}, this, f16363a, false, 12623, new Class[]{Activity.class}, b.class);
        } else {
            FragmentManager fragmentManager = activity.getFragmentManager();
            b bVar2 = (b) fragmentManager.findFragmentByTag("PermissionsRequest");
            if (bVar2 == null) {
                bVar2 = new b();
                fragmentManager.beginTransaction().add(bVar2, "PermissionsRequest").commitAllowingStateLoss();
                fragmentManager.executePendingTransactions();
            }
            bVar = bVar2;
        }
        this.f16364b = bVar;
    }

    /* synthetic */ f(Activity activity, byte b2) {
        this(activity);
    }

    public final void a(com.bytedance.android.livesdk.m.b.d dVar, Runnable runnable, com.bytedance.android.livesdk.m.b.b bVar, com.bytedance.android.livesdk.m.b.b bVar2, Runnable runnable2, String... strArr) {
        if (PatchProxy.isSupport(new Object[]{dVar, runnable, bVar, bVar2, runnable2, strArr}, this, f16363a, false, 12622, new Class[]{com.bytedance.android.livesdk.m.b.d.class, Runnable.class, com.bytedance.android.livesdk.m.b.b.class, com.bytedance.android.livesdk.m.b.b.class, Runnable.class, String[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar, runnable, bVar, bVar2, runnable2, strArr}, this, f16363a, false, 12622, new Class[]{com.bytedance.android.livesdk.m.b.d.class, Runnable.class, com.bytedance.android.livesdk.m.b.b.class, com.bytedance.android.livesdk.m.b.b.class, Runnable.class, String[].class}, Void.TYPE);
            return;
        }
        b bVar3 = this.f16364b;
        if (PatchProxy.isSupport(new Object[]{dVar, runnable, bVar, bVar2, runnable2, strArr}, bVar3, b.f16331a, false, 12579, new Class[]{com.bytedance.android.livesdk.m.b.d.class, Runnable.class, com.bytedance.android.livesdk.m.b.b.class, com.bytedance.android.livesdk.m.b.b.class, Runnable.class, String[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar, runnable, bVar, bVar2, runnable2, strArr}, bVar3, b.f16331a, false, 12579, new Class[]{com.bytedance.android.livesdk.m.b.d.class, Runnable.class, com.bytedance.android.livesdk.m.b.b.class, com.bytedance.android.livesdk.m.b.b.class, Runnable.class, String[].class}, Void.TYPE);
            return;
        }
        b.a aVar = new b.a(strArr, runnable, dVar, bVar, runnable2, bVar2);
        String[] a2 = d.a(bVar3.getActivity(), aVar.f16341b);
        if (a2.length == 0) {
            aVar.a(false);
            return;
        }
        aVar.f16342c = a2;
        if (PatchProxy.isSupport(new Object[0], aVar, b.a.f16340a, false, 12600, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], aVar, b.a.f16340a, false, 12600, new Class[0], Void.TYPE);
        } else {
            aVar.f16344e.run();
            e a3 = e.a();
            String[] strArr2 = aVar.f16341b;
            String[] strArr3 = aVar.f16342c;
            if (PatchProxy.isSupport(new Object[]{strArr2, strArr3}, a3, e.f16360a, false, 12618, new Class[]{String[].class, String[].class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{strArr2, strArr3}, a3, e.f16360a, false, 12618, new Class[]{String[].class, String[].class}, Void.TYPE);
            } else {
                for (String a4 : strArr3) {
                    Iterator it2 = a3.a(a4).iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                }
            }
        }
        if (Build.VERSION.SDK_INT < 23 || e.c().a()) {
            bVar3.a(aVar);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{aVar}, bVar3, b.f16331a, false, 12580, new Class[]{b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, bVar3, b.f16331a, false, 12580, new Class[]{b.a.class}, Void.TYPE);
            return;
        }
        b.AnonymousClass1 r0 = new com.bytedance.android.livesdk.m.b.c(aVar) {

            /* renamed from: a */
            public static ChangeQuickRedirect f16334a;

            /* renamed from: b */
            final /* synthetic */ a f16335b;

            public final void b(
/*
Method generation error in method: com.bytedance.android.livesdk.m.b.1.b():void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.livesdk.m.b.1.b():void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
            
*/

            public final void a(
/*
Method generation error in method: com.bytedance.android.livesdk.m.b.1.a():void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.bytedance.android.livesdk.m.b.1.a():void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
            
*/
        };
        Activity activity = bVar3.getActivity();
        if (PatchProxy.isSupport(new Object[]{activity, r0}, aVar, b.a.f16340a, false, 12603, new Class[]{Activity.class, com.bytedance.android.livesdk.m.b.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, r0}, aVar, b.a.f16340a, false, 12603, new Class[]{Activity.class, com.bytedance.android.livesdk.m.b.c.class}, Void.TYPE);
            return;
        }
        aVar.f16343d.a(activity, r0, aVar.f16341b, aVar.f16342c);
    }
}
