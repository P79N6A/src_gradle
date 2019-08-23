package com.ss.android.ugc.aweme.utils.permission;

import android.content.Context;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75941a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f75942b = "f";

    /* renamed from: c  reason: collision with root package name */
    private static final c f75943c;

    static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75944a;

        public int a(Context context) {
            return 0;
        }

        public int c(Context context) {
            return 0;
        }

        public int d(Context context) {
            return 0;
        }

        a() {
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void a(android.hardware.Camera r18) {
            /*
                r17 = this;
                r1 = r18
                r0 = 1
                java.lang.Object[] r2 = new java.lang.Object[r0]
                r9 = 0
                r2[r9] = r1
                com.meituan.robust.ChangeQuickRedirect r4 = f75944a
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class<android.hardware.Camera> r3 = android.hardware.Camera.class
                r7[r9] = r3
                java.lang.Class r8 = java.lang.Void.TYPE
                r5 = 0
                r6 = 88796(0x15adc, float:1.2443E-40)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0036
                java.lang.Object[] r10 = new java.lang.Object[r0]
                r10[r9] = r1
                com.meituan.robust.ChangeQuickRedirect r12 = f75944a
                r13 = 0
                r14 = 88796(0x15adc, float:1.2443E-40)
                java.lang.Class[] r15 = new java.lang.Class[r0]
                java.lang.Class<android.hardware.Camera> r0 = android.hardware.Camera.class
                r15[r9] = r0
                java.lang.Class r16 = java.lang.Void.TYPE
                r11 = r17
                com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                return
            L_0x0036:
                r0 = 0
                r1.setPreviewTexture(r0)     // Catch:{ IOException | RuntimeException -> 0x0047, all -> 0x0042 }
                r18.stopPreview()     // Catch:{ IOException | RuntimeException -> 0x0047, all -> 0x0042 }
                r18.release()     // Catch:{ Exception -> 0x0041 }
                return
            L_0x0041:
                return
            L_0x0042:
                r0 = move-exception
                r18.release()     // Catch:{ Exception -> 0x0046 }
            L_0x0046:
                throw r0
            L_0x0047:
                r18.release()     // Catch:{ Exception -> 0x004b }
                return
            L_0x004b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.permission.f.a.a(android.hardware.Camera):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x0097  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int b(android.content.Context r11) {
            /*
                r10 = this;
                r8 = 1
                java.lang.Object[] r1 = new java.lang.Object[r8]
                r9 = 0
                r1[r9] = r11
                com.meituan.robust.ChangeQuickRedirect r3 = f75944a
                java.lang.Class[] r6 = new java.lang.Class[r8]
                java.lang.Class<android.content.Context> r2 = android.content.Context.class
                r6[r9] = r2
                java.lang.Class r7 = java.lang.Integer.TYPE
                r4 = 0
                r5 = 88795(0x15adb, float:1.24428E-40)
                r2 = r10
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0039
                java.lang.Object[] r1 = new java.lang.Object[r8]
                r1[r9] = r11
                com.meituan.robust.ChangeQuickRedirect r3 = f75944a
                r4 = 0
                r5 = 88795(0x15adb, float:1.24428E-40)
                java.lang.Class[] r6 = new java.lang.Class[r8]
                java.lang.Class<android.content.Context> r0 = android.content.Context.class
                r6[r9] = r0
                java.lang.Class r7 = java.lang.Integer.TYPE
                r2 = r10
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                return r0
            L_0x0039:
                r1 = -1
                r2 = 0
                int r0 = android.hardware.Camera.getNumberOfCameras()
                if (r0 <= 0) goto L_0x009b
                android.hardware.Camera$CameraInfo r0 = new android.hardware.Camera$CameraInfo     // Catch:{ RuntimeException -> 0x0066 }
                r0.<init>()     // Catch:{ RuntimeException -> 0x0066 }
                android.hardware.Camera.getCameraInfo(r9, r0)     // Catch:{ RuntimeException -> 0x0066 }
                android.hardware.Camera r3 = android.hardware.Camera.open(r9)     // Catch:{ RuntimeException -> 0x0066 }
                if (r3 == 0) goto L_0x005d
                android.hardware.Camera$Parameters r0 = r3.getParameters()     // Catch:{ RuntimeException -> 0x005a, all -> 0x0057 }
                r3.setParameters(r0)     // Catch:{ RuntimeException -> 0x005a, all -> 0x0057 }
                goto L_0x005d
            L_0x0057:
                r0 = move-exception
                r2 = r3
                goto L_0x0095
            L_0x005a:
                r0 = move-exception
                r2 = r3
                goto L_0x0067
            L_0x005d:
                if (r3 == 0) goto L_0x0062
                r10.a((android.hardware.Camera) r3)
            L_0x0062:
                r1 = 0
                goto L_0x009b
            L_0x0064:
                r0 = move-exception
                goto L_0x0095
            L_0x0066:
                r0 = move-exception
            L_0x0067:
                java.lang.String r3 = "aweme_open_camera_error_rate"
                r4 = -1001(0xfffffffffffffc17, float:NaN)
                com.ss.android.ugc.aweme.app.d.c r5 = new com.ss.android.ugc.aweme.app.d.c     // Catch:{ all -> 0x0064 }
                r5.<init>()     // Catch:{ all -> 0x0064 }
                java.lang.String r6 = "errorDesc"
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0064 }
                java.lang.String r8 = "Camera permission denied. "
                r7.<init>(r8)     // Catch:{ all -> 0x0064 }
                java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch:{ all -> 0x0064 }
                r7.append(r0)     // Catch:{ all -> 0x0064 }
                java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0064 }
                com.ss.android.ugc.aweme.app.d.c r0 = r5.a((java.lang.String) r6, (java.lang.String) r0)     // Catch:{ all -> 0x0064 }
                org.json.JSONObject r0 = r0.b()     // Catch:{ all -> 0x0064 }
                com.ss.android.ugc.aweme.base.n.a((java.lang.String) r3, (int) r4, (org.json.JSONObject) r0)     // Catch:{ all -> 0x0064 }
                if (r2 == 0) goto L_0x009b
                r10.a((android.hardware.Camera) r2)
                goto L_0x009b
            L_0x0095:
                if (r2 == 0) goto L_0x009a
                r10.a((android.hardware.Camera) r2)
            L_0x009a:
                throw r0
            L_0x009b:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.permission.f.a.b(android.content.Context):int");
        }
    }

    public static class b extends a {

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f75945b;

        public final int a(Context context) {
            Context context2 = context;
            if (!PatchProxy.isSupport(new Object[]{context2}, this, f75945b, false, 88798, new Class[]{Context.class}, Integer.TYPE)) {
                return ContextCompat.checkSelfPermission(context2, "android.permission.RECORD_AUDIO");
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, this, f75945b, false, 88798, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }

        public final int b(Context context) {
            Context context2 = context;
            if (!PatchProxy.isSupport(new Object[]{context2}, this, f75945b, false, 88797, new Class[]{Context.class}, Integer.TYPE)) {
                return ContextCompat.checkSelfPermission(context2, "android.permission.CAMERA");
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, this, f75945b, false, 88797, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }

        public final int c(Context context) {
            Context context2 = context;
            if (!PatchProxy.isSupport(new Object[]{context2}, this, f75945b, false, 88799, new Class[]{Context.class}, Integer.TYPE)) {
                return ContextCompat.checkSelfPermission(context2, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, this, f75945b, false, 88799, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }

        public final int d(Context context) {
            Context context2 = context;
            if (!PatchProxy.isSupport(new Object[]{context2}, this, f75945b, false, 88800, new Class[]{Context.class}, Integer.TYPE)) {
                return ContextCompat.checkSelfPermission(context2, "android.permission.READ_PHONE_STATE");
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, this, f75945b, false, 88800, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
    }

    public interface c {
        int a(Context context);

        int b(Context context);

        int c(Context context);

        int d(Context context);
    }

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    static {
        if (a()) {
            f75943c = new b();
        } else {
            f75943c = new a();
        }
    }

    public static int a(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f75941a, true, 88789, new Class[]{Context.class}, Integer.TYPE)) {
            return f75943c.b(context2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, null, f75941a, true, 88789, new Class[]{Context.class}, Integer.TYPE)).intValue();
    }

    public static int b(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f75941a, true, 88790, new Class[]{Context.class}, Integer.TYPE)) {
            return f75943c.a(context2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, null, f75941a, true, 88790, new Class[]{Context.class}, Integer.TYPE)).intValue();
    }

    public static int c(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f75941a, true, 88791, new Class[]{Context.class}, Integer.TYPE)) {
            return f75943c.c(context2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, null, f75941a, true, 88791, new Class[]{Context.class}, Integer.TYPE)).intValue();
    }

    public static int d(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, null, f75941a, true, 88792, new Class[]{Context.class}, Integer.TYPE)) {
            return f75943c.d(context2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{context2}, null, f75941a, true, 88792, new Class[]{Context.class}, Integer.TYPE)).intValue();
    }
}
