package com.ss.android.ugc.aweme.shortvideo.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.shortvideo.bi;

@SuppressLint({"CI_StaticFieldLeak"})
public final class aa {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71067a;
    private static aa m = new aa();

    /* renamed from: b  reason: collision with root package name */
    public Context f71068b;

    /* renamed from: c  reason: collision with root package name */
    Handler f71069c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    public TextView f71070d;

    /* renamed from: e  reason: collision with root package name */
    public volatile long f71071e = 2500;

    /* renamed from: f  reason: collision with root package name */
    public Thread f71072f;
    public volatile long g;
    @SuppressLint({"KeepMissing"})
    public volatile long h;
    public volatile long i;
    public volatile long j;
    public int k = 0;
    volatile boolean l = false;

    public static aa a() {
        return m;
    }

    public final void c() {
        if (this.f71070d != null) {
            this.f71070d = null;
        }
    }

    private aa() {
        if (a.a()) {
            this.f71071e = 800;
            this.l = true;
            return;
        }
        this.f71071e = 2500;
        this.l = false;
    }

    public static long d() {
        if (PatchProxy.isSupport(new Object[0], null, f71067a, true, 80991, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], null, f71067a, true, 80991, new Class[0], Long.TYPE)).longValue();
        }
        try {
            return Runtime.getRuntime().maxMemory();
        } catch (Exception unused) {
            return 0;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f71067a, false, 80988, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f71067a, false, 80988, new Class[0], Void.TYPE);
            return;
        }
        bi a2 = bi.a();
        a2.a("dalvikPss", Long.valueOf(this.g));
        a2.a("nativePss", Long.valueOf(this.h));
        a2.a("otherPss", Long.valueOf(this.j));
        a2.a("totalPss", Long.valueOf(this.i));
        n.a("av_video_memory", a2.b());
    }

    public final void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f71067a, false, 80986, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f71067a, false, 80986, new Class[]{Context.class}, Void.TYPE);
        } else if (context != null) {
            this.f71068b = context;
            if (this.f71072f == null) {
                this.f71072f = new Thread(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f71073a;

                    /* JADX WARNING: Can't wrap try/catch for region: R(6:13|(1:15)(1:(4:17|18|19|(1:21)(2:22|(1:24))))|25|26|6|5) */
                    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0113 */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void run() {
                        /*
                            r12 = this;
                            r0 = 0
                            java.lang.Object[] r1 = new java.lang.Object[r0]
                            com.meituan.robust.ChangeQuickRedirect r3 = f71073a
                            java.lang.Class[] r6 = new java.lang.Class[r0]
                            java.lang.Class r7 = java.lang.Void.TYPE
                            r4 = 0
                            r5 = 80992(0x13c60, float:1.13494E-40)
                            r2 = r12
                            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                            if (r1 == 0) goto L_0x0025
                            java.lang.Object[] r2 = new java.lang.Object[r0]
                            com.meituan.robust.ChangeQuickRedirect r4 = f71073a
                            r5 = 0
                            r6 = 80992(0x13c60, float:1.13494E-40)
                            java.lang.Class[] r7 = new java.lang.Class[r0]
                            java.lang.Class r8 = java.lang.Void.TYPE
                            r3 = r12
                            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                            return
                        L_0x0025:
                            r1 = 3
                            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x0123 }
                            boolean r2 = r2.isInterrupted()     // Catch:{ Exception -> 0x0123 }
                            if (r2 == 0) goto L_0x0040
                            com.ss.android.ugc.aweme.shortvideo.util.aa r2 = com.ss.android.ugc.aweme.shortvideo.util.aa.this     // Catch:{ Exception -> 0x0123 }
                            int r2 = r2.k     // Catch:{ Exception -> 0x0123 }
                            if (r2 <= r1) goto L_0x003b
                            com.ss.android.ugc.aweme.shortvideo.util.aa r2 = com.ss.android.ugc.aweme.shortvideo.util.aa.this     // Catch:{ Exception -> 0x0123 }
                            r2.b()     // Catch:{ Exception -> 0x0123 }
                        L_0x003b:
                            com.ss.android.ugc.aweme.shortvideo.util.aa r2 = com.ss.android.ugc.aweme.shortvideo.util.aa.this     // Catch:{ Exception -> 0x0123 }
                            r2.k = r0     // Catch:{ Exception -> 0x0123 }
                            return
                        L_0x0040:
                            com.ss.android.ugc.aweme.shortvideo.util.aa r2 = com.ss.android.ugc.aweme.shortvideo.util.aa.this     // Catch:{ Exception -> 0x0123 }
                            com.ss.android.ugc.aweme.shortvideo.util.aa r3 = com.ss.android.ugc.aweme.shortvideo.util.aa.this     // Catch:{ Exception -> 0x0123 }
                            android.content.Context r10 = r3.f71068b     // Catch:{ Exception -> 0x0123 }
                            r11 = 1
                            java.lang.Object[] r3 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0123 }
                            r3[r0] = r10     // Catch:{ Exception -> 0x0123 }
                            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.shortvideo.util.aa.f71067a     // Catch:{ Exception -> 0x0123 }
                            r6 = 0
                            r7 = 80989(0x13c5d, float:1.1349E-40)
                            java.lang.Class[] r8 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x0123 }
                            java.lang.Class<android.content.Context> r4 = android.content.Context.class
                            r8[r0] = r4     // Catch:{ Exception -> 0x0123 }
                            java.lang.Class r9 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0123 }
                            r4 = r2
                            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0123 }
                            if (r3 == 0) goto L_0x0078
                            java.lang.Object[] r3 = new java.lang.Object[r11]     // Catch:{ Exception -> 0x0123 }
                            r3[r0] = r10     // Catch:{ Exception -> 0x0123 }
                            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.shortvideo.util.aa.f71067a     // Catch:{ Exception -> 0x0123 }
                            r6 = 0
                            r7 = 80989(0x13c5d, float:1.1349E-40)
                            java.lang.Class[] r8 = new java.lang.Class[r11]     // Catch:{ Exception -> 0x0123 }
                            java.lang.Class<android.content.Context> r4 = android.content.Context.class
                            r8[r0] = r4     // Catch:{ Exception -> 0x0123 }
                            java.lang.Class r9 = java.lang.Void.TYPE     // Catch:{ Exception -> 0x0123 }
                            r4 = r2
                            com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x0123 }
                            goto L_0x0113
                        L_0x0078:
                            if (r10 != 0) goto L_0x007c
                            goto L_0x0113
                        L_0x007c:
                            java.lang.String r3 = "activity"
                            java.lang.Object r3 = r10.getSystemService(r3)     // Catch:{ Exception -> 0x0113 }
                            android.app.ActivityManager r3 = (android.app.ActivityManager) r3     // Catch:{ Exception -> 0x0113 }
                            if (r3 != 0) goto L_0x0088
                            goto L_0x0113
                        L_0x0088:
                            int[] r4 = new int[r11]     // Catch:{ Exception -> 0x0113 }
                            int r5 = android.os.Process.myPid()     // Catch:{ Exception -> 0x0113 }
                            r4[r0] = r5     // Catch:{ Exception -> 0x0113 }
                            android.os.Debug$MemoryInfo[] r3 = r3.getProcessMemoryInfo(r4)     // Catch:{ Exception -> 0x0113 }
                            r4 = r3[r0]     // Catch:{ Exception -> 0x0113 }
                            int r4 = r4.dalvikPss     // Catch:{ Exception -> 0x0113 }
                            long r4 = (long) r4     // Catch:{ Exception -> 0x0113 }
                            r2.g = r4     // Catch:{ Exception -> 0x0113 }
                            r4 = r3[r0]     // Catch:{ Exception -> 0x0113 }
                            int r4 = r4.nativePss     // Catch:{ Exception -> 0x0113 }
                            long r4 = (long) r4     // Catch:{ Exception -> 0x0113 }
                            r2.h = r4     // Catch:{ Exception -> 0x0113 }
                            r4 = r3[r0]     // Catch:{ Exception -> 0x0113 }
                            int r4 = r4.otherPss     // Catch:{ Exception -> 0x0113 }
                            long r4 = (long) r4     // Catch:{ Exception -> 0x0113 }
                            r2.j = r4     // Catch:{ Exception -> 0x0113 }
                            r4 = r3[r0]     // Catch:{ Exception -> 0x0113 }
                            int r4 = r4.getTotalPss()     // Catch:{ Exception -> 0x0113 }
                            long r4 = (long) r4     // Catch:{ Exception -> 0x0113 }
                            r2.i = r4     // Catch:{ Exception -> 0x0113 }
                            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0113 }
                            java.lang.String r5 = "dalvikPss="
                            r4.<init>(r5)     // Catch:{ Exception -> 0x0113 }
                            r5 = r3[r0]     // Catch:{ Exception -> 0x0113 }
                            int r5 = r5.dalvikPss     // Catch:{ Exception -> 0x0113 }
                            int r5 = r5 / 1000
                            r4.append(r5)     // Catch:{ Exception -> 0x0113 }
                            java.lang.String r5 = " nativePss="
                            r4.append(r5)     // Catch:{ Exception -> 0x0113 }
                            r5 = r3[r0]     // Catch:{ Exception -> 0x0113 }
                            int r5 = r5.nativePss     // Catch:{ Exception -> 0x0113 }
                            int r5 = r5 / 1000
                            r4.append(r5)     // Catch:{ Exception -> 0x0113 }
                            java.lang.String r5 = " otherPss="
                            r4.append(r5)     // Catch:{ Exception -> 0x0113 }
                            r5 = r3[r0]     // Catch:{ Exception -> 0x0113 }
                            int r5 = r5.otherPss     // Catch:{ Exception -> 0x0113 }
                            int r5 = r5 / 1000
                            r4.append(r5)     // Catch:{ Exception -> 0x0113 }
                            java.lang.String r5 = " totalPss="
                            r4.append(r5)     // Catch:{ Exception -> 0x0113 }
                            r5 = r3[r0]     // Catch:{ Exception -> 0x0113 }
                            int r5 = r5.getTotalPss()     // Catch:{ Exception -> 0x0113 }
                            int r5 = r5 / 1000
                            r4.append(r5)     // Catch:{ Exception -> 0x0113 }
                            java.lang.String r5 = " MaxMemory="
                            r4.append(r5)     // Catch:{ Exception -> 0x0113 }
                            long r5 = com.ss.android.ugc.aweme.shortvideo.util.aa.d()     // Catch:{ Exception -> 0x0113 }
                            r7 = 1000000(0xf4240, double:4.940656E-318)
                            long r5 = r5 / r7
                            r4.append(r5)     // Catch:{ Exception -> 0x0113 }
                            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0113 }
                            com.ss.android.ugc.aweme.shortvideo.util.ai.d(r4)     // Catch:{ Exception -> 0x0113 }
                            boolean r4 = r2.l     // Catch:{ Exception -> 0x0113 }
                            if (r4 == 0) goto L_0x0113
                            android.os.Handler r4 = r2.f71069c     // Catch:{ Exception -> 0x0113 }
                            com.ss.android.ugc.aweme.shortvideo.util.aa$2 r5 = new com.ss.android.ugc.aweme.shortvideo.util.aa$2     // Catch:{ Exception -> 0x0113 }
                            r5.<init>(r3)     // Catch:{ Exception -> 0x0113 }
                            r4.post(r5)     // Catch:{ Exception -> 0x0113 }
                        L_0x0113:
                            com.ss.android.ugc.aweme.shortvideo.util.aa r2 = com.ss.android.ugc.aweme.shortvideo.util.aa.this     // Catch:{ Exception -> 0x0123 }
                            long r2 = r2.f71071e     // Catch:{ Exception -> 0x0123 }
                            java.lang.Thread.sleep(r2)     // Catch:{ Exception -> 0x0123 }
                            com.ss.android.ugc.aweme.shortvideo.util.aa r2 = com.ss.android.ugc.aweme.shortvideo.util.aa.this     // Catch:{ Exception -> 0x0123 }
                            int r3 = r2.k     // Catch:{ Exception -> 0x0123 }
                            int r3 = r3 + r11
                            r2.k = r3     // Catch:{ Exception -> 0x0123 }
                            goto L_0x0025
                        L_0x0123:
                            com.ss.android.ugc.aweme.shortvideo.util.aa r2 = com.ss.android.ugc.aweme.shortvideo.util.aa.this
                            int r2 = r2.k
                            if (r2 <= r1) goto L_0x012f
                            com.ss.android.ugc.aweme.shortvideo.util.aa r1 = com.ss.android.ugc.aweme.shortvideo.util.aa.this
                            r1.b()
                        L_0x012f:
                            com.ss.android.ugc.aweme.shortvideo.util.aa r1 = com.ss.android.ugc.aweme.shortvideo.util.aa.this
                            r1.k = r0
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.util.aa.AnonymousClass1.run():void");
                    }
                });
                this.f71072f.start();
            }
        }
    }

    public final void a(Activity activity, ViewGroup viewGroup) {
        if (PatchProxy.isSupport(new Object[]{activity, viewGroup}, this, f71067a, false, 80990, new Class[]{Activity.class, ViewGroup.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity, viewGroup}, this, f71067a, false, 80990, new Class[]{Activity.class, ViewGroup.class}, Void.TYPE);
        } else if (activity != null && !activity.isFinishing() && viewGroup != null && this.l) {
            this.f71070d = new TextView(activity);
            this.f71070d.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            this.f71070d.setClickable(false);
            this.f71070d.setTextSize(15.0f);
            if (com.ss.android.g.a.b()) {
                this.f71070d.setTextColor(Color.parseColor("#ff000000"));
            } else {
                this.f71070d.setTextColor(Color.parseColor("#ffffffff"));
            }
            viewGroup.addView(this.f71070d);
        }
    }
}
