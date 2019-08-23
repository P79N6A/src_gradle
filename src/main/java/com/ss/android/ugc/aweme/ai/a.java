package com.ss.android.ugc.aweme.ai;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.ActivityCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.ac.b;
import com.ss.android.ugc.aweme.port.in.ad;
import com.ss.android.ugc.aweme.utils.bi;
import com.ss.android.ugc.aweme.utils.permission.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0014\"\u00020\u000bH\u0016¢\u0006\u0002\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u00182\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0016¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/servicimpl/PermissionServiceImpl;", "Lcom/ss/android/ugc/aweme/port/in/IPermissionService;", "()V", "checkAudioPermission", "", "context", "Landroid/content/Context;", "checkCameraPermission", "checkExternalStoragePermission", "checkSelfPermission", "permission", "", "openSettingActivity", "", "requestPermissions", "activity", "Landroid/support/v4/app/FragmentActivity;", "requestListener", "Lcom/ss/android/ugc/aweme/port/in/IPermissionService$IPermissionRequestListener;", "permissions", "", "(Landroid/support/v4/app/FragmentActivity;Lcom/ss/android/ugc/aweme/port/in/IPermissionService$IPermissionRequestListener;[Ljava/lang/String;)V", "shouldShowRequestPermissionRationale", "", "Landroid/app/Activity;", "systemSupportsRuntimePermission", "tools.dmt-integration_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a implements ad {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33286a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012,\u0010\u0002\u001a(\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "", "permissions", "", "", "kotlin.jvm.PlatformType", "grantResults", "", "onRequestPermissionResult", "([Ljava/lang/String;[I)V"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.ai.a$a  reason: collision with other inner class name */
    static final class C0421a implements b.C0400b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33287a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ad.a f33288b;

        C0421a(ad.a aVar) {
            this.f33288b = aVar;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Object[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Object[]} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.String[] r20, int[] r21) {
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
                com.meituan.robust.ChangeQuickRedirect r5 = f33287a
                java.lang.Class[] r8 = new java.lang.Class[r2]
                java.lang.Class<java.lang.String[]> r4 = java.lang.String[].class
                r8[r10] = r4
                java.lang.Class<int[]> r4 = int[].class
                r8[r11] = r4
                java.lang.Class r9 = java.lang.Void.TYPE
                r6 = 0
                r7 = 71649(0x117e1, float:1.00402E-40)
                r4 = r19
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r3 == 0) goto L_0x0047
                java.lang.Object[] r12 = new java.lang.Object[r2]
                r12[r10] = r0
                r12[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r14 = f33287a
                r15 = 0
                r16 = 71649(0x117e1, float:1.00402E-40)
                java.lang.Class[] r0 = new java.lang.Class[r2]
                java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
                r0[r10] = r1
                java.lang.Class<int[]> r1 = int[].class
                r0[r11] = r1
                java.lang.Class r18 = java.lang.Void.TYPE
                r13 = r19
                r17 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                return
            L_0x0047:
                r2 = r19
                com.ss.android.ugc.aweme.port.in.ad$a r3 = r2.f33288b
                r3.a(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ai.a.C0421a.a(java.lang.String[], int[]):void");
        }
    }

    public final boolean a() {
        if (!PatchProxy.isSupport(new Object[0], this, f33286a, false, 71641, new Class[0], Boolean.TYPE)) {
            return f.a();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33286a, false, 71641, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void d(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f33286a, false, 71647, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f33286a, false, 71647, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        bi.a(context);
    }

    public final int a(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f33286a, false, 71643, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, this, f33286a, false, 71643, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        return f.a(context);
    }

    public final int b(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f33286a, false, 71644, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, this, f33286a, false, 71644, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        return f.b(context);
    }

    public final int c(@NotNull Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f33286a, false, 71645, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, this, f33286a, false, 71645, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        return f.c(context);
    }

    public final int a(@NotNull Context context, @NotNull String str) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2}, this, f33286a, false, 71646, new Class[]{Context.class, String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2, str2}, this, f33286a, false, 71646, new Class[]{Context.class, String.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(str2, "permission");
        return ActivityCompat.checkSelfPermission(context, str);
    }

    public final boolean a(@NotNull Activity activity, @NotNull String str) {
        Activity activity2 = activity;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{activity2, str2}, this, f33286a, false, 71642, new Class[]{Activity.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{activity2, str2}, this, f33286a, false, 71642, new Class[]{Activity.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
        Intrinsics.checkParameterIsNotNull(str2, "permission");
        return ActivityCompat.shouldShowRequestPermissionRationale(activity, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@org.jetbrains.annotations.NotNull android.support.v4.app.FragmentActivity r22, @org.jetbrains.annotations.NotNull com.ss.android.ugc.aweme.port.in.ad.a r23, @org.jetbrains.annotations.NotNull java.lang.String... r24) {
        /*
            r21 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r11 = 0
            r4[r11] = r0
            r12 = 1
            r4[r12] = r1
            r13 = 2
            r4[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r6 = f33286a
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.support.v4.app.FragmentActivity> r5 = android.support.v4.app.FragmentActivity.class
            r9[r11] = r5
            java.lang.Class<com.ss.android.ugc.aweme.port.in.ad$a> r5 = com.ss.android.ugc.aweme.port.in.ad.a.class
            r9[r12] = r5
            java.lang.Class<java.lang.String[]> r5 = java.lang.String[].class
            r9[r13] = r5
            java.lang.Class r10 = java.lang.Void.TYPE
            r7 = 0
            r8 = 71648(0x117e0, float:1.004E-40)
            r5 = r21
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x0057
            java.lang.Object[] r14 = new java.lang.Object[r3]
            r14[r11] = r0
            r14[r12] = r1
            r14[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r16 = f33286a
            r17 = 0
            r18 = 71648(0x117e0, float:1.004E-40)
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.support.v4.app.FragmentActivity> r1 = android.support.v4.app.FragmentActivity.class
            r0[r11] = r1
            java.lang.Class<com.ss.android.ugc.aweme.port.in.ad$a> r1 = com.ss.android.ugc.aweme.port.in.ad.a.class
            r0[r12] = r1
            java.lang.Class<java.lang.String[]> r1 = java.lang.String[].class
            r0[r13] = r1
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r21
            r19 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
            return
        L_0x0057:
            java.lang.String r3 = "activity"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r3)
            java.lang.String r3 = "requestListener"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r3)
            java.lang.String r3 = "permissions"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r3)
            android.app.Activity r0 = (android.app.Activity) r0
            com.ss.android.ugc.aweme.ai.a$a r3 = new com.ss.android.ugc.aweme.ai.a$a
            r3.<init>(r1)
            com.ss.android.ugc.aweme.ac.b$b r3 = (com.ss.android.ugc.aweme.ac.b.C0400b) r3
            com.ss.android.ugc.aweme.ac.b.a(r0, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ai.a.a(android.support.v4.app.FragmentActivity, com.ss.android.ugc.aweme.port.in.ad$a, java.lang.String[]):void");
    }
}
