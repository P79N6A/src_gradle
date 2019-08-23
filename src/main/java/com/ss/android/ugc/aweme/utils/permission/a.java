package com.ss.android.ugc.aweme.utils.permission;

import android.app.Activity;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.utils.permission.PermissionViewModel;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75928a;

    /* renamed from: com.ss.android.ugc.aweme.utils.permission.a$a  reason: collision with other inner class name */
    public interface C0792a {
        void a();

        void b();
    }

    public static boolean a(int[] iArr) {
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<java.lang.String> b(android.content.Context r19, java.lang.String... r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f75928a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r10] = r4
            java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
            r8[r11] = r4
            java.lang.Class<java.util.List> r9 = java.util.List.class
            r4 = 0
            r6 = 1
            r7 = 88764(0x15abc, float:1.24385E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0048
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f75928a
            r15 = 1
            r16 = 88764(0x15abc, float:1.24385E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r10] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r11] = r1
            java.lang.Class<java.util.List> r18 = java.util.List.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0048:
            if (r0 != 0) goto L_0x004c
            r0 = 0
            return r0
        L_0x004c:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r1.length
        L_0x0052:
            if (r10 >= r3) goto L_0x0063
            r4 = r1[r10]
            int r5 = android.support.v4.content.ContextCompat.checkSelfPermission(r0, r4)
            r6 = -1
            if (r5 != r6) goto L_0x0060
            r2.add(r4)
        L_0x0060:
            int r10 = r10 + 1
            goto L_0x0052
        L_0x0063:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.permission.a.b(android.content.Context, java.lang.String[]):java.util.List");
    }

    public static boolean a(Activity activity, String str) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2, str}, null, f75928a, true, 88766, new Class[]{Activity.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str}, null, f75928a, true, 88766, new Class[]{Activity.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        return a((Context) activity2, new String[]{str});
    }

    public static boolean a(Context context, String[] strArr) {
        if (PatchProxy.isSupport(new Object[]{context, strArr}, null, f75928a, true, 88767, new Class[]{Context.class, String[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, strArr}, null, f75928a, true, 88767, new Class[]{Context.class, String[].class}, Boolean.TYPE)).booleanValue();
        }
        List<String> b2 = b(context, strArr);
        if (b2 == null || b2.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void a(Activity activity, String str, C0792a aVar) {
        Activity activity2 = activity;
        String str2 = str;
        C0792a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{activity2, str2, aVar2}, null, f75928a, true, 88759, new Class[]{Activity.class, String.class, C0792a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, str2, aVar2}, null, f75928a, true, 88759, new Class[]{Activity.class, String.class, C0792a.class}, Void.TYPE);
            return;
        }
        a(activity2, (int) PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST, str2, aVar2);
    }

    public static void a(Activity activity, int i, String str, C0792a aVar) {
        Activity activity2 = activity;
        C0792a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{activity2, Integer.valueOf(i), str, aVar2}, null, f75928a, true, 88760, new Class[]{Activity.class, Integer.TYPE, String.class, C0792a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, Integer.valueOf(i), str, aVar2}, null, f75928a, true, 88760, new Class[]{Activity.class, Integer.TYPE, String.class, C0792a.class}, Void.TYPE);
            return;
        }
        a(activity2, i, new String[]{str}, aVar2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.app.Activity r23, int r24, java.lang.String[] r25, com.ss.android.ugc.aweme.utils.permission.a.C0792a r26) {
        /*
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = 4
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r12 = 0
            r5[r12] = r0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r24)
            r13 = 1
            r5[r13] = r6
            r14 = 2
            r5[r14] = r2
            r15 = 3
            r5[r15] = r3
            com.meituan.robust.ChangeQuickRedirect r7 = f75928a
            java.lang.Class[] r10 = new java.lang.Class[r4]
            java.lang.Class<android.app.Activity> r6 = android.app.Activity.class
            r10[r12] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r10[r13] = r6
            java.lang.Class<java.lang.String[]> r6 = java.lang.String[].class
            r10[r14] = r6
            java.lang.Class<com.ss.android.ugc.aweme.utils.permission.a$a> r6 = com.ss.android.ugc.aweme.utils.permission.a.C0792a.class
            r10[r15] = r6
            java.lang.Class r11 = java.lang.Void.TYPE
            r6 = 0
            r8 = 1
            r9 = 88761(0x15ab9, float:1.2438E-40)
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r5, r6, r7, r8, r9, r10, r11)
            if (r5 == 0) goto L_0x006f
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r12] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            r5[r13] = r0
            r5[r14] = r2
            r5[r15] = r3
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = f75928a
            r19 = 1
            r20 = 88761(0x15ab9, float:1.2438E-40)
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r0[r12] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r13] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r14] = r1
            java.lang.Class<com.ss.android.ugc.aweme.utils.permission.a$a> r1 = com.ss.android.ugc.aweme.utils.permission.a.C0792a.class
            r0[r15] = r1
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r5
            r21 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            return
        L_0x006f:
            if (r0 != 0) goto L_0x0072
            return
        L_0x0072:
            r4 = r0
            android.support.v4.app.FragmentActivity r4 = (android.support.v4.app.FragmentActivity) r4
            android.arch.lifecycle.ViewModelProvider r4 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r4)
            java.lang.Class<com.ss.android.ugc.aweme.utils.permission.PermissionViewModel> r5 = com.ss.android.ugc.aweme.utils.permission.PermissionViewModel.class
            android.arch.lifecycle.ViewModel r4 = r4.get(r5)
            com.ss.android.ugc.aweme.utils.permission.PermissionViewModel r4 = (com.ss.android.ugc.aweme.utils.permission.PermissionViewModel) r4
            com.ss.android.ugc.aweme.utils.permission.PermissionViewModel$a r5 = new com.ss.android.ugc.aweme.utils.permission.PermissionViewModel$a
            r5.<init>()
            r5.f75926a = r3
            r5.f75927b = r1
            r4.f75925a = r5
            java.util.List r2 = b(r0, r2)
            if (r2 == 0) goto L_0x00a8
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x00a8
            int r3 = r2.size()
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            java.lang.String[] r2 = (java.lang.String[]) r2
            android.support.v4.app.ActivityCompat.requestPermissions(r0, r2, r1)
            return
        L_0x00a8:
            if (r3 == 0) goto L_0x00ad
            r26.a()
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.permission.a.a(android.app.Activity, int, java.lang.String[], com.ss.android.ugc.aweme.utils.permission.a$a):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(android.app.Activity r23, int r24, java.lang.String[] r25, com.ss.android.ugc.aweme.utils.permission.a.C0792a r26) {
        /*
            r0 = r23
            r1 = r25
            r2 = r26
            r3 = 4
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1001(0x3e9, float:1.403E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            r13 = 1
            r4[r13] = r5
            r14 = 2
            r4[r14] = r1
            r15 = 3
            r4[r15] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f75928a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
            r9[r11] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r9[r13] = r5
            java.lang.Class<java.lang.String[]> r5 = java.lang.String[].class
            r9[r14] = r5
            java.lang.Class<com.ss.android.ugc.aweme.utils.permission.a$a> r5 = com.ss.android.ugc.aweme.utils.permission.a.C0792a.class
            r9[r15] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = 0
            r7 = 1
            r8 = 88763(0x15abb, float:1.24383E-40)
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x006f
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r11] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            r4[r13] = r0
            r4[r14] = r1
            r4[r15] = r2
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = f75928a
            r19 = 1
            r20 = 88763(0x15abb, float:1.24383E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            r0[r11] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r0[r13] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r14] = r1
            java.lang.Class<com.ss.android.ugc.aweme.utils.permission.a$a> r1 = com.ss.android.ugc.aweme.utils.permission.a.C0792a.class
            r0[r15] = r1
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r4
            r21 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            return
        L_0x006f:
            if (r0 != 0) goto L_0x0072
            return
        L_0x0072:
            java.util.List r3 = b(r0, r1)
            if (r3 == 0) goto L_0x0087
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0087
            com.ss.android.ugc.aweme.utils.permission.a$1 r3 = new com.ss.android.ugc.aweme.utils.permission.a$1
            r3.<init>(r2)
            com.ss.android.ugc.aweme.ac.b.a(r0, r1, r3)
            return
        L_0x0087:
            r26.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.permission.a.b(android.app.Activity, int, java.lang.String[], com.ss.android.ugc.aweme.utils.permission.a$a):void");
    }

    public static void a(Activity activity, int i, String[] strArr, int[] iArr) {
        if (PatchProxy.isSupport(new Object[]{activity, Integer.valueOf(i), strArr, iArr}, null, f75928a, true, 88765, new Class[]{Activity.class, Integer.TYPE, String[].class, int[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, Integer.valueOf(i), strArr, iArr}, null, f75928a, true, 88765, new Class[]{Activity.class, Integer.TYPE, String[].class, int[].class}, Void.TYPE);
            return;
        }
        PermissionViewModel.a aVar = ((PermissionViewModel) ViewModelProviders.of((FragmentActivity) activity).get(PermissionViewModel.class)).f75925a;
        if (!(aVar == null || aVar.f75927b == -1 || i != aVar.f75927b || aVar.f75926a == null)) {
            if (a(iArr)) {
                aVar.f75926a.a();
                return;
            }
            aVar.f75926a.b();
        }
    }
}
