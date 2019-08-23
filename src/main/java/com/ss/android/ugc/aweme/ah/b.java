package com.ss.android.ugc.aweme.ah;

import a.i;
import android.content.Context;
import android.database.ContentObserver;
import android.graphics.Point;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33274a;

    /* renamed from: b  reason: collision with root package name */
    static final String[] f33275b = {"_data", "datetaken"};

    /* renamed from: c  reason: collision with root package name */
    static final String[] f33276c = {"_data", "datetaken", "width", "height"};
    private static final String[] k = {"screenshot", "screen_shot", "screen-shot", "screen shot", "screencapture", "screen_capture", "screen-capture", "screen capture", "screencap", "screen_cap", "screen-cap", "screen cap"};
    private static Point l;

    /* renamed from: d  reason: collision with root package name */
    final List<String> f33277d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    Context f33278e;

    /* renamed from: f  reason: collision with root package name */
    public C0420b f33279f;
    long g;
    a h;
    a i;
    final Handler j = new Handler(Looper.getMainLooper());

    class a extends ContentObserver {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f33280a;

        /* renamed from: c  reason: collision with root package name */
        private Uri f33282c;

        /* renamed from: d  reason: collision with root package name */
        private long f33283d;

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
            if (r9.isClosed() == false) goto L_0x01ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x006d, code lost:
            if (r9.isClosed() == false) goto L_0x01ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0190, code lost:
            if (r9.isClosed() == false) goto L_0x01ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x01aa, code lost:
            if (r9.isClosed() == false) goto L_0x01ac;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x01ac, code lost:
            r9.close();
         */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x01a6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object a() throws java.lang.Exception {
            /*
                r21 = this;
                r1 = r21
                com.ss.android.ugc.aweme.ah.b r0 = com.ss.android.ugc.aweme.ah.b.this
                android.net.Uri r9 = r1.f33282c
                r10 = 1
                java.lang.Object[] r2 = new java.lang.Object[r10]
                r11 = 0
                r2[r11] = r9
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.ah.b.f33274a
                java.lang.Class[] r7 = new java.lang.Class[r10]
                java.lang.Class<android.net.Uri> r3 = android.net.Uri.class
                r7[r11] = r3
                java.lang.Class r8 = java.lang.Void.TYPE
                r5 = 0
                r6 = 71008(0x11560, float:9.9503E-41)
                r3 = r0
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x003a
                java.lang.Object[] r2 = new java.lang.Object[r10]
                r2[r11] = r9
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.ah.b.f33274a
                r5 = 0
                r6 = 71008(0x11560, float:9.9503E-41)
                java.lang.Class[] r7 = new java.lang.Class[r10]
                java.lang.Class<android.net.Uri> r3 = android.net.Uri.class
                r7[r11] = r3
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            L_0x0037:
                r2 = 0
                goto L_0x01b1
            L_0x003a:
                android.content.Context r2 = r0.f33278e     // Catch:{ Exception -> 0x01a3, all -> 0x0195 }
                android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ Exception -> 0x01a3, all -> 0x0195 }
                int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01a3, all -> 0x0195 }
                r8 = 16
                if (r3 >= r8) goto L_0x0049
                java.lang.String[] r3 = com.ss.android.ugc.aweme.ah.b.f33275b     // Catch:{ Exception -> 0x01a3, all -> 0x0195 }
                goto L_0x004b
            L_0x0049:
                java.lang.String[] r3 = com.ss.android.ugc.aweme.ah.b.f33276c     // Catch:{ Exception -> 0x01a3, all -> 0x0195 }
            L_0x004b:
                r4 = r3
                r5 = 0
                r6 = 0
                java.lang.String r7 = "date_added desc limit 1"
                r3 = r9
                android.database.Cursor r9 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x01a3, all -> 0x0195 }
                if (r9 != 0) goto L_0x0061
                if (r9 == 0) goto L_0x0037
                boolean r0 = r9.isClosed()
                if (r0 != 0) goto L_0x0037
                goto L_0x01ac
            L_0x0061:
                boolean r2 = r9.moveToFirst()     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                if (r2 != 0) goto L_0x0071
                if (r9 == 0) goto L_0x0037
                boolean r0 = r9.isClosed()
                if (r0 != 0) goto L_0x0037
                goto L_0x01ac
            L_0x0071:
                java.lang.String r2 = "_data"
                int r2 = r9.getColumnIndex(r2)     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                java.lang.String r3 = "datetaken"
                int r3 = r9.getColumnIndex(r3)     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r4 = -1
                int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                if (r5 < r8) goto L_0x008f
                java.lang.String r4 = "width"
                int r4 = r9.getColumnIndex(r4)     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                java.lang.String r5 = "height"
                int r5 = r9.getColumnIndex(r5)     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                goto L_0x0090
            L_0x008f:
                r5 = 0
            L_0x0090:
                java.lang.String r13 = r9.getString(r2)     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                long r14 = r9.getLong(r3)     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                if (r4 < 0) goto L_0x00a9
                if (r5 < 0) goto L_0x00a9
                int r2 = r9.getInt(r4)     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                int r3 = r9.getInt(r5)     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r16 = r2
                r17 = r3
                goto L_0x00f8
            L_0x00a9:
                java.lang.Object[] r2 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r2[r11] = r13     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.ah.b.f33274a     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r5 = 0
                r6 = 71009(0x11561, float:9.9505E-41)
                java.lang.Class[] r7 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                r7[r11] = r3     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                java.lang.Class<android.graphics.Point> r8 = android.graphics.Point.class
                r3 = r0
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                if (r2 == 0) goto L_0x00dc
                java.lang.Object[] r2 = new java.lang.Object[r10]     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r2[r11] = r13     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.ah.b.f33274a     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r5 = 0
                r6 = 71009(0x11561, float:9.9505E-41)
                java.lang.Class[] r7 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                r7[r11] = r3     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                java.lang.Class<android.graphics.Point> r8 = android.graphics.Point.class
                r3 = r0
                java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                android.graphics.Point r2 = (android.graphics.Point) r2     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                goto L_0x00f0
            L_0x00dc:
                android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r2.<init>()     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r2.inJustDecodeBounds = r10     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                android.graphics.BitmapFactory.decodeFile(r13, r2)     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                android.graphics.Point r3 = new android.graphics.Point     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                int r4 = r2.outWidth     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                int r2 = r2.outHeight     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r3.<init>(r4, r2)     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r2 = r3
            L_0x00f0:
                int r3 = r2.x     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                int r2 = r2.y     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r17 = r2
                r16 = r3
            L_0x00f8:
                r8 = 4
                java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r2[r11] = r13     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                java.lang.Long r3 = new java.lang.Long     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r3.<init>(r14)     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r2[r10] = r3     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r18 = 2
                r2[r18] = r3     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r17)     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r19 = 3
                r2[r19] = r3     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.ah.b.f33274a     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r5 = 0
                r6 = 71010(0x11562, float:9.9506E-41)
                java.lang.Class[] r7 = new java.lang.Class[r8]     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                r7[r11] = r3     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r7[r10] = r3     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r7[r18] = r3     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r7[r19] = r3     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                java.lang.Class r20 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r3 = r0
                r12 = 4
                r8 = r20
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                if (r2 == 0) goto L_0x016e
                java.lang.Object[] r2 = new java.lang.Object[r12]     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r2[r11] = r13     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                java.lang.Long r3 = new java.lang.Long     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r3.<init>(r14)     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r2[r10] = r3     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r16)     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r2[r18] = r3     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                java.lang.Integer r3 = java.lang.Integer.valueOf(r17)     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r2[r19] = r3     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.ah.b.f33274a     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r5 = 0
                r6 = 71010(0x11562, float:9.9506E-41)
                java.lang.Class[] r7 = new java.lang.Class[r12]     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                r7[r11] = r3     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r7[r10] = r3     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r7[r18] = r3     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r7[r19] = r3     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r3 = r0
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                goto L_0x018a
            L_0x016e:
                r2 = r0
                r3 = r13
                r4 = r14
                r6 = r16
                r7 = r17
                boolean r2 = r2.a(r3, r4, r6, r7)     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                if (r2 == 0) goto L_0x018a
                com.ss.android.ugc.aweme.ah.b$b r2 = r0.f33279f     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                if (r2 == 0) goto L_0x018a
                boolean r2 = r0.a(r13)     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                if (r2 != 0) goto L_0x018a
                com.ss.android.ugc.aweme.ah.b$b r0 = r0.f33279f     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
                r0.a(r13)     // Catch:{ Exception -> 0x01a4, all -> 0x0193 }
            L_0x018a:
                if (r9 == 0) goto L_0x0037
                boolean r0 = r9.isClosed()
                if (r0 != 0) goto L_0x0037
                goto L_0x01ac
            L_0x0193:
                r0 = move-exception
                goto L_0x0197
            L_0x0195:
                r0 = move-exception
                r9 = 0
            L_0x0197:
                if (r9 == 0) goto L_0x01a2
                boolean r2 = r9.isClosed()
                if (r2 != 0) goto L_0x01a2
                r9.close()
            L_0x01a2:
                throw r0
            L_0x01a3:
                r9 = 0
            L_0x01a4:
                if (r9 == 0) goto L_0x0037
                boolean r0 = r9.isClosed()
                if (r0 != 0) goto L_0x0037
            L_0x01ac:
                r9.close()
                goto L_0x0037
            L_0x01b1:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ah.b.a.a():java.lang.Object");
        }

        public final void onChange(boolean z) {
            boolean z2 = true;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f33280a, false, 71014, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f33280a, false, 71014, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            super.onChange(z);
            if (!AwemeAppData.p().as) {
                if (PatchProxy.isSupport(new Object[0], this, f33280a, false, 71015, new Class[0], Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33280a, false, 71015, new Class[0], Boolean.TYPE)).booleanValue();
                } else {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime - this.f33283d < 1000) {
                        this.f33283d = elapsedRealtime;
                    } else {
                        this.f33283d = elapsedRealtime;
                        z2 = false;
                    }
                }
                if (!z2) {
                    i.a((Callable<TResult>) new c<TResult>(this));
                }
            }
        }

        a(Uri uri, Handler handler) {
            super(handler);
            this.f33282c = uri;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ah.b$b  reason: collision with other inner class name */
    public interface C0420b {
        void a(String str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:11|12|13|14|15) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0076 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.Point a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f33274a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<android.graphics.Point> r7 = android.graphics.Point.class
            r4 = 0
            r5 = 71013(0x11565, float:9.951E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f33274a
            r5 = 0
            r6 = 71013(0x11565, float:9.951E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<android.graphics.Point> r8 = android.graphics.Point.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            android.graphics.Point r0 = (android.graphics.Point) r0
            return r0
        L_0x0028:
            r1 = 0
            android.graphics.Point r2 = new android.graphics.Point     // Catch:{ Exception -> 0x0082 }
            r2.<init>()     // Catch:{ Exception -> 0x0082 }
            android.content.Context r1 = r9.f33278e     // Catch:{ Exception -> 0x0083 }
            java.lang.String r3 = "window"
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch:{ Exception -> 0x0083 }
            android.view.WindowManager r1 = (android.view.WindowManager) r1     // Catch:{ Exception -> 0x0083 }
            android.view.Display r1 = r1.getDefaultDisplay()     // Catch:{ Exception -> 0x0083 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0083 }
            r4 = 17
            if (r3 < r4) goto L_0x0046
            r1.getRealSize(r2)     // Catch:{ Exception -> 0x0083 }
            goto L_0x0083
        L_0x0046:
            java.lang.Class<android.view.Display> r3 = android.view.Display.class
            java.lang.String r4 = "getRawWidth"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x0076 }
            java.lang.reflect.Method r3 = r3.getMethod(r4, r5)     // Catch:{ Exception -> 0x0076 }
            java.lang.Class<android.view.Display> r4 = android.view.Display.class
            java.lang.String r5 = "getRawHeight"
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x0076 }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch:{ Exception -> 0x0076 }
            java.lang.Object[] r5 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0076 }
            java.lang.Object r3 = r3.invoke(r1, r5)     // Catch:{ Exception -> 0x0076 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ Exception -> 0x0076 }
            int r3 = r3.intValue()     // Catch:{ Exception -> 0x0076 }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0076 }
            java.lang.Object r0 = r4.invoke(r1, r0)     // Catch:{ Exception -> 0x0076 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0076 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x0076 }
            r2.set(r3, r0)     // Catch:{ Exception -> 0x0076 }
            goto L_0x0083
        L_0x0076:
            int r0 = r1.getWidth()     // Catch:{ Exception -> 0x0083 }
            int r1 = r1.getHeight()     // Catch:{ Exception -> 0x0083 }
            r2.set(r0, r1)     // Catch:{ Exception -> 0x0083 }
            goto L_0x0083
        L_0x0082:
            r2 = r1
        L_0x0083:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ah.b.a():android.graphics.Point");
    }

    b(Context context) {
        if (context != null) {
            this.f33278e = context;
            if (l == null) {
                l = a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("The context must not be null.");
    }

    /* access modifiers changed from: package-private */
    public boolean a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f33274a, false, 71012, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f33274a, false, 71012, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f33277d.contains(str)) {
            return true;
        } else {
            if (this.f33277d.size() >= 20) {
                for (int i2 = 0; i2 < 5; i2++) {
                    this.f33277d.remove(0);
                }
            }
            this.f33277d.add(str);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a(String str, long j2, int i2, int i3) {
        long j3 = j2;
        int i4 = i2;
        int i5 = i3;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j3), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f33274a, false, 71011, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, new Long(j3), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f33274a, false, 71011, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (j3 < this.g || System.currentTimeMillis() - j3 > 20000) {
            return false;
        } else {
            if ((l != null && ((i4 > l.x || i5 > l.y) && (i5 > l.x || i4 > l.y))) || TextUtils.isEmpty(str)) {
                return false;
            }
            String lowerCase = str.toLowerCase();
            for (String contains : k) {
                if (lowerCase.contains(contains)) {
                    return true;
                }
            }
            return false;
        }
    }
}
