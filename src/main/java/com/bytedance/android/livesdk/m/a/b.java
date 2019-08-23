package com.bytedance.android.livesdk.m.a;

import android.content.Context;
import android.hardware.Camera;
import com.bytedance.android.livesdk.m.b.a;
import com.bytedance.android.livesdk.m.c.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Field;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16323a;

    /* renamed from: b  reason: collision with root package name */
    private static a f16324b;

    private static Camera b() {
        if (PatchProxy.isSupport(new Object[0], null, f16323a, true, 12648, new Class[0], Camera.class)) {
            return (Camera) PatchProxy.accessDispatch(new Object[0], null, f16323a, true, 12648, new Class[0], Camera.class);
        }
        try {
            return a(1);
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f16323a, true, 12646, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f16323a, true, 12646, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Camera b2 = b();
        if (b2 == null) {
            return false;
        }
        Field field = null;
        try {
            field = b2.getClass().getDeclaredField("mHasPermission");
        } catch (NoSuchFieldException unused) {
        }
        if (field == null) {
            b2.release();
            return true;
        }
        try {
            field.setAccessible(true);
            return field.getBoolean(b2);
        } catch (IllegalAccessException unused2) {
            return true;
        } finally {
            b2.release();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A[SYNTHETIC, Splitter:B:21:0x0066] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.hardware.Camera a(int r15) {
        /*
            r15 = 1
            java.lang.Object[] r0 = new java.lang.Object[r15]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r7 = 0
            r0[r7] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f16323a
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r7] = r1
            java.lang.Class<android.hardware.Camera> r6 = android.hardware.Camera.class
            r1 = 0
            r3 = 1
            r4 = 12647(0x3167, float:1.7722E-41)
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003b
            java.lang.Object[] r8 = new java.lang.Object[r15]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r8[r7] = r0
            r9 = 0
            com.meituan.robust.ChangeQuickRedirect r10 = f16323a
            r11 = 1
            r12 = 12647(0x3167, float:1.7722E-41)
            java.lang.Class[] r13 = new java.lang.Class[r15]
            java.lang.Class r15 = java.lang.Integer.TYPE
            r13[r7] = r15
            java.lang.Class<android.hardware.Camera> r14 = android.hardware.Camera.class
            java.lang.Object r15 = com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)
            android.hardware.Camera r15 = (android.hardware.Camera) r15
            return r15
        L_0x003b:
            int r0 = android.hardware.Camera.getNumberOfCameras()
        L_0x003f:
            r1 = 0
            if (r7 >= r0) goto L_0x0069
            android.hardware.Camera$CameraInfo r2 = new android.hardware.Camera$CameraInfo
            r2.<init>()
            android.hardware.Camera.getCameraInfo(r7, r2)
            int r2 = r2.facing
            if (r2 == r15) goto L_0x0054
            if (r0 != r15) goto L_0x0051
            goto L_0x0054
        L_0x0051:
            int r7 = r7 + 1
            goto L_0x003f
        L_0x0054:
            android.hardware.Camera r15 = android.hardware.Camera.open(r7)     // Catch:{ RuntimeException -> 0x0063 }
            if (r15 == 0) goto L_0x0061
            android.hardware.Camera$Parameters r0 = r15.getParameters()     // Catch:{ RuntimeException -> 0x0064 }
            r15.setParameters(r0)     // Catch:{ RuntimeException -> 0x0064 }
        L_0x0061:
            r1 = r15
            goto L_0x0069
        L_0x0063:
            r15 = r1
        L_0x0064:
            if (r15 == 0) goto L_0x0069
            r15.release()     // Catch:{ Exception -> 0x0069 }
        L_0x0069:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.m.a.b.a(int):android.hardware.Camera");
    }

    public final boolean a(Context context, String str) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{context, str}, this, f16323a, false, 12644, new Class[]{Context.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context, str}, this, f16323a, false, 12644, new Class[]{Context.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        if (PatchProxy.isSupport(new Object[]{context}, null, f16323a, true, 12645, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, f16323a, true, 12645, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        if (f16324b == null) {
            z = a();
        } else if (!e.c().b() || !f16324b.a()) {
            return false;
        }
        return z;
    }
}
