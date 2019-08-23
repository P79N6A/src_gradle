package com.bytedance.android.livesdk.m;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.support.v4.util.SparseArrayCompat;
import android.text.TextUtils;
import com.bytedance.android.livesdk.m.b.c;
import com.bytedance.android.livesdk.m.b.d;
import com.bytedance.android.livesdk.m.c.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class b extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16331a;

    /* renamed from: b  reason: collision with root package name */
    SparseArrayCompat<a> f16332b = new SparseArrayCompat<>();

    /* renamed from: c  reason: collision with root package name */
    SparseArrayCompat<a> f16333c = new SparseArrayCompat<>();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f16340a;

        /* renamed from: b  reason: collision with root package name */
        public String[] f16341b;

        /* renamed from: c  reason: collision with root package name */
        public String[] f16342c = new String[0];

        /* renamed from: d  reason: collision with root package name */
        com.bytedance.android.livesdk.m.b.b f16343d;

        /* renamed from: e  reason: collision with root package name */
        Runnable f16344e;

        /* renamed from: f  reason: collision with root package name */
        Runnable f16345f;
        private d g;
        private com.bytedance.android.livesdk.m.b.b h;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f16340a, false, 12602, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f16340a, false, 12602, new Class[0], Void.TYPE);
                return;
            }
            this.g.b(this.f16341b);
            e.a().a(this.f16341b, this.f16342c);
        }

        public final void a(boolean z) {
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f16340a, false, 12601, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f16340a, false, 12601, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            this.g.a(this.f16341b);
            e.a().a(this.f16341b);
            if (z) {
                this.f16345f.run();
                e.a().b(this.f16341b, this.f16342c);
            }
        }

        public final void a(Activity activity, c cVar) {
            if (PatchProxy.isSupport(new Object[]{activity, cVar}, this, f16340a, false, 12604, new Class[]{Activity.class, c.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{activity, cVar}, this, f16340a, false, 12604, new Class[]{Activity.class, c.class}, Void.TYPE);
                return;
            }
            this.h.a(activity, cVar, this.f16341b, this.f16342c);
        }

        a(String[] strArr, Runnable runnable, d dVar, com.bytedance.android.livesdk.m.b.b bVar, Runnable runnable2, com.bytedance.android.livesdk.m.b.b bVar2) {
            this.f16341b = strArr;
            this.f16344e = runnable;
            this.f16345f = runnable2;
            this.g = dVar;
            this.f16343d = bVar;
            this.h = bVar2;
        }
    }

    static Intent a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f16331a, true, 12590, new Class[]{Context.class}, Intent.class)) {
            return e.c().a(context2);
        }
        return (Intent) PatchProxy.accessDispatch(new Object[]{context2}, null, f16331a, true, 12590, new Class[]{Context.class}, Intent.class);
    }

    private static Intent c(Context context) {
        if (!PatchProxy.isSupport(new Object[]{context}, null, f16331a, true, 12592, new Class[]{Context.class}, Intent.class)) {
            return new Intent("android.settings.APPLICATION_SETTINGS");
        }
        return (Intent) PatchProxy.accessDispatch(new Object[]{context}, null, f16331a, true, 12592, new Class[]{Context.class}, Intent.class);
    }

    private static Intent b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f16331a, true, 12591, new Class[]{Context.class}, Intent.class)) {
            return (Intent) PatchProxy.accessDispatch(new Object[]{context}, null, f16331a, true, 12591, new Class[]{Context.class}, Intent.class);
        }
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + context.getPackageName()));
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar) {
        final a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f16331a, false, 12584, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f16331a, false, 12584, new Class[]{a.class}, Void.TYPE);
            return;
        }
        aVar2.a(getActivity(), new c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f16337a;

            public final void b() {
                if (PatchProxy.isSupport(new Object[0], this, f16337a, false, 12597, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f16337a, false, 12597, new Class[0], Void.TYPE);
                    return;
                }
                aVar2.a();
            }

            public final void a() {
                int i;
                if (PatchProxy.isSupport(new Object[0], this, f16337a, false, 12596, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f16337a, false, 12596, new Class[0], Void.TYPE);
                    return;
                }
                b bVar = b.this;
                a aVar = aVar2;
                if (PatchProxy.isSupport(new Object[]{aVar}, bVar, b.f16331a, false, 12585, new Class[]{a.class}, Void.TYPE)) {
                    Object[] objArr = {aVar};
                    b bVar2 = bVar;
                    PatchProxy.accessDispatch(objArr, bVar2, b.f16331a, false, 12585, new Class[]{a.class}, Void.TYPE);
                    return;
                }
                if (PatchProxy.isSupport(new Object[0], aVar, a.f16340a, false, 12599, new Class[0], Integer.TYPE)) {
                    i = ((Integer) PatchProxy.accessDispatch(new Object[0], aVar, a.f16340a, false, 12599, new Class[0], Integer.TYPE)).intValue();
                } else {
                    i = (a.a(aVar.f16341b) & -65536) >>> 16;
                }
                if (PatchProxy.isSupport(new Object[]{aVar, Integer.valueOf(i)}, bVar, b.f16331a, false, 12586, new Class[]{a.class, Integer.TYPE}, Void.TYPE)) {
                    Object[] objArr2 = {aVar, Integer.valueOf(i)};
                    Object[] objArr3 = objArr2;
                    b bVar3 = bVar;
                    PatchProxy.accessDispatch(objArr3, bVar3, b.f16331a, false, 12586, new Class[]{a.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                try {
                    if (b.a((Context) bVar.getActivity(), b.a((Context) bVar.getActivity()))) {
                        bVar.startActivityForResult(b.a((Context) bVar.getActivity()), i);
                        bVar.f16333c.put(i, aVar);
                        return;
                    }
                    bVar.a(aVar, i);
                } catch (Exception unused) {
                    bVar.a(aVar, i);
                }
            }
        });
    }

    static boolean a(Context context, Intent intent) {
        Context context2 = context;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{context2, intent2}, null, f16331a, true, 12593, new Class[]{Context.class, Intent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, intent2}, null, f16331a, true, 12593, new Class[]{Context.class, Intent.class}, Boolean.TYPE)).booleanValue();
        }
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent2, 65536);
        if (resolveActivity == null || resolveActivity.activityInfo == null || resolveActivity.activityInfo.name.toLowerCase().contains("resolver")) {
            return false;
        }
        String str = resolveActivity.activityInfo.permission;
        if (TextUtils.isEmpty(str) || context2.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    private void b(a aVar, int i) {
        if (PatchProxy.isSupport(new Object[]{aVar, Integer.valueOf(i)}, this, f16331a, false, 12588, new Class[]{a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Integer.valueOf(i)}, this, f16331a, false, 12588, new Class[]{a.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            startActivityForResult(c(getActivity()), i);
            this.f16333c.put(i, aVar);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar, int i) {
        if (PatchProxy.isSupport(new Object[]{aVar, Integer.valueOf(i)}, this, f16331a, false, 12587, new Class[]{a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Integer.valueOf(i)}, this, f16331a, false, 12587, new Class[]{a.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        try {
            if (a((Context) getActivity(), b(getActivity()))) {
                startActivityForResult(b(getActivity()), i);
                this.f16333c.put(i, aVar);
                return;
            }
            b(aVar, i);
        } catch (Exception unused) {
            b(aVar, i);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f16331a, false, 12589, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, f16331a, false, 12589, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        super.onActivityResult(i, i2, intent);
        a aVar = (a) this.f16333c.get(i);
        this.f16333c.remove(i);
        if (aVar != null && d.a((Context) getActivity(), aVar.f16341b)) {
            aVar.a(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onRequestPermissionsResult(int r24, @android.support.annotation.NonNull java.lang.String[] r25, @android.support.annotation.NonNull int[] r26) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = 3
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            r12 = 0
            r0[r12] = r1
            r13 = 1
            r0[r13] = r9
            r14 = 2
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f16331a
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r13] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 12582(0x3126, float:1.7631E-41)
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005c
            java.lang.Object[] r0 = new java.lang.Object[r11]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)
            r0[r12] = r1
            r0[r13] = r9
            r0[r14] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f16331a
            r3 = 0
            r4 = 12582(0x3126, float:1.7631E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r12] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r13] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x005c:
            super.onRequestPermissionsResult(r24, r25, r26)
            android.support.v4.util.SparseArrayCompat<com.bytedance.android.livesdk.m.b$a> r0 = r7.f16332b
            java.lang.Object r0 = r0.get(r8)
            r15 = r0
            com.bytedance.android.livesdk.m.b$a r15 = (com.bytedance.android.livesdk.m.b.a) r15
            android.support.v4.util.SparseArrayCompat<com.bytedance.android.livesdk.m.b$a> r0 = r7.f16332b
            r0.remove(r8)
            if (r15 == 0) goto L_0x016c
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r9
            r0[r13] = r10
            r0[r14] = r15
            com.meituan.robust.ChangeQuickRedirect r2 = f16331a
            r3 = 0
            r4 = 12583(0x3127, float:1.7633E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r12] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r13] = r1
            java.lang.Class<com.bytedance.android.livesdk.m.b$a> r1 = com.bytedance.android.livesdk.m.b.a.class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00b7
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r12] = r9
            r0[r13] = r10
            r0[r14] = r15
            com.meituan.robust.ChangeQuickRedirect r2 = f16331a
            r3 = 0
            r4 = 12583(0x3127, float:1.7633E-41)
            java.lang.Class[] r5 = new java.lang.Class[r11]
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r5[r12] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r13] = r1
            java.lang.Class<com.bytedance.android.livesdk.m.b$a> r1 = com.bytedance.android.livesdk.m.b.a.class
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x00b7:
            android.app.Activity r0 = r23.getActivity()
            boolean r0 = com.bytedance.android.livesdk.m.d.a(r0, r9, r10)
            if (r0 == 0) goto L_0x00c5
            r15.a(r13)
            return
        L_0x00c5:
            android.app.Activity r0 = r23.getActivity()
            java.lang.Object[] r1 = new java.lang.Object[r14]
            r1[r12] = r0
            r1[r13] = r9
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.bytedance.android.livesdk.m.d.f16358a
            r19 = 1
            r20 = 12613(0x3145, float:1.7675E-41)
            java.lang.Class[] r2 = new java.lang.Class[r14]
            java.lang.Class<android.app.Activity> r3 = android.app.Activity.class
            r2[r12] = r3
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r2[r13] = r3
            java.lang.Class r22 = java.lang.Boolean.TYPE
            r16 = r1
            r21 = r2
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r1 == 0) goto L_0x0116
            java.lang.Object[] r1 = new java.lang.Object[r14]
            r1[r12] = r0
            r1[r13] = r9
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.bytedance.android.livesdk.m.d.f16358a
            r19 = 1
            r20 = 12613(0x3145, float:1.7675E-41)
            java.lang.Class[] r0 = new java.lang.Class[r14]
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            r0[r12] = r2
            java.lang.Class<java.lang.String[]> r2 = java.lang.String[].class
            r0[r13] = r2
            java.lang.Class r22 = java.lang.Boolean.TYPE
            r16 = r1
            r21 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r12 = r0.booleanValue()
            goto L_0x011d
        L_0x0116:
            if (r9 != 0) goto L_0x0119
            goto L_0x011d
        L_0x0119:
            boolean r12 = com.bytedance.android.livesdk.m.c.a((android.app.Activity) r0, (java.lang.String[]) r9)
        L_0x011d:
            if (r12 == 0) goto L_0x0123
            r15.a()
            return
        L_0x0123:
            android.app.Activity r0 = r23.getActivity()
            android.app.Activity r1 = r23.getActivity()
            android.content.Intent r1 = a((android.content.Context) r1)
            boolean r0 = a((android.content.Context) r0, (android.content.Intent) r1)
            if (r0 != 0) goto L_0x015d
            android.app.Activity r0 = r23.getActivity()
            android.app.Activity r1 = r23.getActivity()
            android.content.Intent r1 = b(r1)
            boolean r0 = a((android.content.Context) r0, (android.content.Intent) r1)
            if (r0 != 0) goto L_0x015d
            android.app.Activity r0 = r23.getActivity()
            android.app.Activity r1 = r23.getActivity()
            android.content.Intent r1 = c(r1)
            boolean r0 = a((android.content.Context) r0, (android.content.Intent) r1)
            if (r0 != 0) goto L_0x015d
            r15.a()
            return
        L_0x015d:
            android.app.Activity r0 = r23.getActivity()
            java.lang.String[] r1 = r15.f16341b
            java.lang.String[] r0 = com.bytedance.android.livesdk.m.d.a((android.app.Activity) r0, (java.lang.String[]) r1)
            r15.f16342c = r0
            r7.a((com.bytedance.android.livesdk.m.b.a) r15)
        L_0x016c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.m.b.onRequestPermissionsResult(int, java.lang.String[], int[]):void");
    }
}
