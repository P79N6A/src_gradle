package com.meizu.cloud.pushsdk.a;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import com.meizu.cloud.pushsdk.c.f.e;
import com.meizu.cloud.pushsdk.util.MzSystemUtils;
import com.taobao.android.dexposed.ClassUtils;
import java.util.HashMap;
import java.util.Map;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f26849a = "c";

    /* renamed from: b  reason: collision with root package name */
    private HashMap<String, String> f26850b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, String> f26851c;

    /* renamed from: d  reason: collision with root package name */
    private HashMap<String, Object> f26852d;

    /* renamed from: e  reason: collision with root package name */
    private HashMap<String, Object> f26853e;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public Context f26854a;

        public a a(Context context) {
            this.f26854a = context;
            return this;
        }

        public c a() {
            return new c(this);
        }
    }

    private c(a aVar) {
        this.f26850b = new HashMap<>();
        this.f26851c = new HashMap<>();
        this.f26852d = new HashMap<>();
        this.f26853e = new HashMap<>();
        e();
        if (aVar.f26854a != null) {
            a(aVar.f26854a);
        }
        DebugLogger.i(f26849a, "Subject created successfully.");
    }

    private void a(String str, Object obj) {
        if ((!TextUtils.isEmpty(str) && obj != null) || ((obj instanceof String) && !((String) obj).isEmpty())) {
            this.f26852d.put(str, obj);
        }
    }

    private void a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f26850b.put(str, str2);
        }
    }

    private void b(String str, Object obj) {
        if ((!TextUtils.isEmpty(str) && obj != null) || ((obj instanceof String) && !((String) obj).isEmpty())) {
            this.f26853e.put(str, obj);
        }
    }

    private void b(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f26851c.put(str, str2);
        }
    }

    private void c(Context context) {
        a(b.r, (Object) context.getPackageName());
        a(b.s, (Object) MzSystemUtils.getAppVersionName(context));
        a(b.t, (Object) Integer.valueOf(MzSystemUtils.getAppVersionCode(context)));
        a(b.u, (Object) MzSystemUtils.getInstalledPackage(context));
        a(b.p, (Object) Integer.valueOf(TextUtils.isEmpty(MzSystemUtils.findReceiver(context, "com.meizu.ups.push.intent.MESSAGE", context.getPackageName())) ^ true ? 1 : 0));
    }

    private void d(Context context) {
        Location c2 = e.c(context);
        if (c2 == null) {
            DebugLogger.e(f26849a, "Location information not available.");
            return;
        }
        b(b.B, (Object) Double.valueOf(c2.getLongitude()));
        b(b.C, (Object) Double.valueOf(c2.getAltitude()));
        b(b.D, (Object) Double.valueOf(c2.getLatitude()));
    }

    private void e() {
        b(b.g, Build.BRAND);
        b(b.h, Build.MODEL);
        b(b.j, Build.VERSION.RELEASE);
        b(b.k, Build.DISPLAY);
        b(b.m, MzSystemUtils.getCurrentLanguage());
    }

    private void e(Context context) {
        a(b.f26844b, MzSystemUtils.getDeviceId(context));
        a(b.f26845c, MzSystemUtils.getSubscriberId(context, MzSystemUtils.getSubId(context, 0)));
        a(b.f26846d, MzSystemUtils.getSubscriberId(context, MzSystemUtils.getSubId(context, 1)));
        a(b.f26847e, MzSystemUtils.getLineNumber(context));
        b(b.n, MzSystemUtils.getOperator(context));
    }

    private void f(Context context) {
        b(b.i, com.meizu.cloud.pushsdk.base.c.b(context));
        b(b.z, (Object) MzSystemUtils.getNetWorkType(context));
        b(b.A, (Object) MzSystemUtils.getBSSID(context));
    }

    public Map<String, String> a() {
        return this.f26850b;
    }

    public void a(int i, int i2) {
        this.f26851c.put(b.l, Integer.toString(i) + ClassUtils.PACKAGE_SEPARATOR + Integer.toString(i2));
    }

    public void a(Context context) {
        d(context);
        e(context);
        b(context);
        f(context);
        c(context);
    }

    public Map<String, String> b() {
        return this.f26851c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0041  */
    @android.annotation.TargetApi(19)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "window"
            java.lang.Object r5 = r5.getSystemService(r0)     // Catch:{ Exception -> 0x002b }
            android.view.WindowManager r5 = (android.view.WindowManager) r5     // Catch:{ Exception -> 0x002b }
            android.view.Display r5 = r5.getDefaultDisplay()     // Catch:{ Exception -> 0x002b }
            android.graphics.Point r0 = new android.graphics.Point     // Catch:{ Exception -> 0x002c }
            r0.<init>()     // Catch:{ Exception -> 0x002c }
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x002c }
            r2 = 0
            java.lang.Class<android.graphics.Point> r3 = android.graphics.Point.class
            r1[r2] = r3     // Catch:{ Exception -> 0x002c }
            java.lang.Class<android.view.Display> r2 = android.view.Display.class
            java.lang.String r3 = "getSize"
            r2.getMethod(r3, r1)     // Catch:{ Exception -> 0x002c }
            r5.getSize(r0)     // Catch:{ Exception -> 0x002c }
            int r1 = r0.x     // Catch:{ Exception -> 0x002c }
            int r0 = r0.y     // Catch:{ Exception -> 0x002c }
            r4.a((int) r1, (int) r0)     // Catch:{ Exception -> 0x002c }
            return
        L_0x002b:
            r5 = 0
        L_0x002c:
            java.lang.String r0 = f26849a
            java.lang.String r1 = "Display.getSize isn't available on older devices."
            com.meizu.cloud.pushinternal.DebugLogger.e(r0, r1)
            if (r5 == 0) goto L_0x0041
            int r0 = r5.getWidth()
            int r5 = r5.getHeight()
            r4.a((int) r0, (int) r5)
            return
        L_0x0041:
            java.lang.String r5 = f26849a
            java.lang.String r0 = "error get display"
            com.meizu.cloud.pushinternal.DebugLogger.e(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.a.c.b(android.content.Context):void");
    }

    public Map<String, Object> c() {
        return this.f26852d;
    }

    public Map<String, Object> d() {
        return this.f26853e;
    }
}
