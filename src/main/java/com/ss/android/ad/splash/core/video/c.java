package com.ss.android.ad.splash.core.video;

import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.support.annotation.NonNull;
import com.ss.android.ad.splash.core.e;
import com.ss.android.ad.splash.core.video.a.b;
import com.ss.android.ad.splash.core.video.a.c;
import com.ss.android.ad.splash.utils.l;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class c implements c.a, c.b, c.C0322c, c.d, c.e, c.f, l.a {
    private static boolean m;
    private static Map<Integer, Integer> n = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ad.splash.core.video.a.c f27751a;

    /* renamed from: b  reason: collision with root package name */
    public int f27752b;

    /* renamed from: c  reason: collision with root package name */
    long f27753c;

    /* renamed from: d  reason: collision with root package name */
    public Handler f27754d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f27755e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f27756f;
    private boolean g;
    private boolean h;
    private Handler i;
    private ArrayList<Runnable> j;
    private int k;
    private int l;
    private final Set<SurfaceTexture> o;
    private final Object p;
    private StringBuilder q;

    public final boolean a(com.ss.android.ad.splash.core.video.a.c cVar, int i2, int i3) {
        if (this.f27751a == cVar && this.i != null) {
            this.i.obtainMessage(304, i2, i3).sendToTarget();
        }
        return false;
    }

    private void g() {
        if (m) {
            a(this.l, false);
            m = false;
        }
    }

    public final void f() {
        if (this.i != null) {
            this.i.sendEmptyMessage(306);
        }
    }

    private void h() {
        if (this.f27754d != null) {
            this.f27754d.removeMessages(201);
        }
        synchronized (this.p) {
            if (this.q != null) {
                this.q = null;
            }
        }
    }

    public final void b() {
        this.f27754d.removeMessages(100);
        this.f27755e = true;
        this.f27754d.sendEmptyMessage(BaseLoginOrRegisterActivity.o);
    }

    public final void c() {
        this.f27752b = 203;
        if (this.f27751a != null) {
            if (this.j != null && !this.j.isEmpty()) {
                this.j.clear();
            }
            if (this.f27754d != null) {
                try {
                    h();
                    this.f27754d.removeCallbacksAndMessages(null);
                    this.h = true;
                    this.f27754d.sendEmptyMessage(103);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final void d() {
        int i2;
        if (!this.f27756f) {
            i2 = 209;
        } else {
            i2 = 206;
        }
        this.f27752b = i2;
        n.remove(Integer.valueOf(this.k));
        if (this.i != null) {
            this.i.obtainMessage(302).sendToTarget();
        }
        h();
    }

    public final void e() {
        this.f27752b = 205;
        if (this.f27755e) {
            this.f27754d.post(new Runnable() {
                public final void run() {
                    try {
                        c.this.f27751a.d();
                        c.this.f27752b = 207;
                        c.this.f27755e = false;
                    } catch (Exception unused) {
                    }
                }
            });
        } else {
            this.f27754d.sendMessage(this.f27754d.obtainMessage(100, -1, -1));
        }
        n.remove(Integer.valueOf(this.k));
        if (this.i != null) {
            this.i.sendEmptyMessage(305);
        }
    }

    public final void a() {
        if (this.f27751a == null) {
            this.f27751a = new b();
            this.f27751a.a((c.e) this);
            this.f27751a.a((c.b) this);
            this.f27751a.a((c.C0322c) this);
            this.f27751a.a((c.a) this);
            this.f27751a.a((c.f) this);
            this.f27751a.a((c.d) this);
            this.f27751a.b(this.f27756f);
            this.g = false;
        }
    }

    public c(Handler handler) {
        this(handler, (byte) 0);
    }

    private boolean a(@NonNull SurfaceTexture surfaceTexture) {
        boolean contains;
        synchronized (this.o) {
            contains = this.o.contains(surfaceTexture);
        }
        return contains;
    }

    private void b(Runnable runnable) {
        if (this.j == null) {
            this.j = new ArrayList<>();
        }
        this.j.add(runnable);
    }

    /* access modifiers changed from: package-private */
    public void a(Runnable runnable) {
        if (!this.h) {
            runnable.run();
        } else {
            b(runnable);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01dd, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0170, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0171, code lost:
        r18 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.os.Message r20) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            int r2 = r0.what
            java.lang.String r3 = ""
            com.ss.android.ad.splash.core.video.a.c r4 = r1.f27751a
            r7 = 1
            if (r4 == 0) goto L_0x0232
            int r4 = r0.what
            r8 = 10
            r9 = 1002(0x3ea, float:1.404E-42)
            r10 = 203(0xcb, float:2.84E-43)
            r11 = 201(0xc9, float:2.82E-43)
            r12 = 202(0xca, float:2.83E-43)
            r13 = 208(0xd0, float:2.91E-43)
            r14 = 205(0xcd, float:2.87E-43)
            r15 = 209(0xd1, float:2.93E-43)
            r5 = 207(0xcf, float:2.9E-43)
            r6 = 206(0xce, float:2.89E-43)
            switch(r4) {
                case 100: goto L_0x01f9;
                case 101: goto L_0x01cf;
                case 102: goto L_0x01b8;
                case 103: goto L_0x018f;
                case 104: goto L_0x0167;
                case 105: goto L_0x013d;
                case 106: goto L_0x0115;
                case 107: goto L_0x00e9;
                case 108: goto L_0x00bb;
                case 109: goto L_0x008d;
                case 110: goto L_0x0061;
                case 111: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x0232
        L_0x0028:
            java.lang.Object r0 = r0.obj     // Catch:{ Exception -> 0x0053 }
            android.graphics.SurfaceTexture r0 = (android.graphics.SurfaceTexture) r0     // Catch:{ Exception -> 0x0053 }
            java.util.Set<android.graphics.SurfaceTexture> r4 = r1.o     // Catch:{ Exception -> 0x0053 }
            monitor-enter(r4)     // Catch:{ Exception -> 0x0053 }
            boolean r5 = r1.a((android.graphics.SurfaceTexture) r0)     // Catch:{ all -> 0x0050 }
            if (r5 != 0) goto L_0x003f
            com.ss.android.ad.splash.core.video.a.c r5 = r1.f27751a     // Catch:{ all -> 0x0050 }
            android.view.Surface r6 = new android.view.Surface     // Catch:{ all -> 0x0050 }
            r6.<init>(r0)     // Catch:{ all -> 0x0050 }
            r5.a((android.view.Surface) r6)     // Catch:{ all -> 0x0050 }
        L_0x003f:
            monitor-exit(r4)     // Catch:{ all -> 0x0050 }
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f27751a     // Catch:{ Exception -> 0x0053 }
            r0.a((boolean) r7)     // Catch:{ Exception -> 0x0053 }
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f27751a     // Catch:{ Exception -> 0x0053 }
            android.content.Context r4 = com.ss.android.ad.splash.core.e.F()     // Catch:{ Exception -> 0x0053 }
            r0.a((android.content.Context) r4, (int) r8)     // Catch:{ Exception -> 0x0053 }
            goto L_0x0232
        L_0x0050:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0050 }
            throw r0     // Catch:{ Exception -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            java.lang.String r3 = r0.getMessage()
            r0.getMessage()
            goto L_0x0235
        L_0x0061:
            java.lang.Object r0 = r0.obj     // Catch:{ Exception -> 0x007f }
            android.view.SurfaceHolder r0 = (android.view.SurfaceHolder) r0     // Catch:{ Exception -> 0x007f }
            com.ss.android.ad.splash.core.video.a.c r4 = r1.f27751a     // Catch:{ Exception -> 0x007f }
            r4.a((android.view.SurfaceHolder) r0)     // Catch:{ Exception -> 0x007f }
            int r0 = r1.k     // Catch:{ Exception -> 0x007f }
            r4 = 2
            if (r0 != r4) goto L_0x0078
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f27751a     // Catch:{ Exception -> 0x007f }
            android.content.Context r4 = com.ss.android.ad.splash.core.e.F()     // Catch:{ Exception -> 0x007f }
            r0.a((android.content.Context) r4, (int) r8)     // Catch:{ Exception -> 0x007f }
        L_0x0078:
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f27751a     // Catch:{ Exception -> 0x007f }
            r0.a((boolean) r7)     // Catch:{ Exception -> 0x007f }
            goto L_0x0232
        L_0x007f:
            r0 = move-exception
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            java.lang.String r3 = r0.getMessage()
            r0.getMessage()
            goto L_0x0235
        L_0x008d:
            int r0 = r1.f27752b
            if (r0 == r6) goto L_0x009a
            int r0 = r1.f27752b
            if (r0 != r5) goto L_0x0096
            goto L_0x009a
        L_0x0096:
            r5 = 0
        L_0x0097:
            r16 = 0
            goto L_0x00b0
        L_0x009a:
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f27751a     // Catch:{ Exception -> 0x00a4 }
            long r14 = r0.e()     // Catch:{ Exception -> 0x00a4 }
            r16 = r14
            r5 = 0
            goto L_0x00b0
        L_0x00a4:
            r0 = move-exception
            r3 = 1011(0x3f3, float:1.417E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x0097
        L_0x00b0:
            r0 = 109(0x6d, float:1.53E-43)
            java.lang.Long r4 = java.lang.Long.valueOf(r16)
            r1.a((int) r0, (java.lang.Object) r4)
            goto L_0x0235
        L_0x00bb:
            int r0 = r1.f27752b
            if (r0 == r6) goto L_0x00c8
            int r0 = r1.f27752b
            if (r0 != r5) goto L_0x00c4
            goto L_0x00c8
        L_0x00c4:
            r5 = 0
        L_0x00c5:
            r16 = 0
            goto L_0x00de
        L_0x00c8:
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f27751a     // Catch:{ Exception -> 0x00d2 }
            long r14 = r0.f()     // Catch:{ Exception -> 0x00d2 }
            r16 = r14
            r5 = 0
            goto L_0x00de
        L_0x00d2:
            r0 = move-exception
            r3 = 1010(0x3f2, float:1.415E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x00c5
        L_0x00de:
            r0 = 108(0x6c, float:1.51E-43)
            java.lang.Long r4 = java.lang.Long.valueOf(r16)
            r1.a((int) r0, (java.lang.Object) r4)
            goto L_0x0235
        L_0x00e9:
            int r4 = r1.f27752b
            if (r4 == r11) goto L_0x00f1
            int r4 = r1.f27752b
            if (r4 != r10) goto L_0x0170
        L_0x00f1:
            java.lang.Object r0 = r0.obj     // Catch:{ Exception -> 0x0108 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0108 }
            if (r0 == 0) goto L_0x0104
            java.lang.String r4 = "/"
            boolean r4 = r0.startsWith(r4)     // Catch:{ Exception -> 0x0108 }
            if (r4 == 0) goto L_0x0104
            com.ss.android.ad.splash.core.video.a.c r4 = r1.f27751a     // Catch:{ Exception -> 0x0108 }
            r4.a((java.lang.String) r0)     // Catch:{ Exception -> 0x0108 }
        L_0x0104:
            r1.f27752b = r12     // Catch:{ Exception -> 0x0108 }
            goto L_0x0232
        L_0x0108:
            r0 = move-exception
            r3 = 1001(0x3e9, float:1.403E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x0235
        L_0x0115:
            int r4 = r1.f27752b
            if (r4 == r6) goto L_0x0121
            int r4 = r1.f27752b
            if (r4 == r5) goto L_0x0121
            int r4 = r1.f27752b
            if (r4 != r15) goto L_0x0170
        L_0x0121:
            com.ss.android.ad.splash.core.video.a.c r4 = r1.f27751a     // Catch:{ Exception -> 0x0130 }
            java.lang.Object r0 = r0.obj     // Catch:{ Exception -> 0x0130 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x0130 }
            long r5 = r0.longValue()     // Catch:{ Exception -> 0x0130 }
            r4.a((long) r5)     // Catch:{ Exception -> 0x0130 }
            goto L_0x0232
        L_0x0130:
            r0 = move-exception
            r3 = 1007(0x3ef, float:1.411E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x0235
        L_0x013d:
            int r0 = r1.f27752b
            if (r0 == r14) goto L_0x0151
            int r0 = r1.f27752b
            if (r0 == r6) goto L_0x0151
            int r0 = r1.f27752b
            if (r0 == r13) goto L_0x0151
            int r0 = r1.f27752b
            if (r0 == r5) goto L_0x0151
            int r0 = r1.f27752b
            if (r0 != r15) goto L_0x0170
        L_0x0151:
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f27751a     // Catch:{ Exception -> 0x015a }
            r0.c()     // Catch:{ Exception -> 0x015a }
            r1.f27752b = r13     // Catch:{ Exception -> 0x015a }
            goto L_0x0232
        L_0x015a:
            r0 = move-exception
            r3 = 1008(0x3f0, float:1.413E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x0235
        L_0x0167:
            int r0 = r1.f27752b
            if (r0 == r12) goto L_0x0175
            int r0 = r1.f27752b
            if (r0 != r13) goto L_0x0170
            goto L_0x0175
        L_0x0170:
            r5 = 0
        L_0x0171:
            r18 = 1
            goto L_0x0237
        L_0x0175:
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f27751a     // Catch:{ Exception -> 0x0182 }
            com.ss.android.ad.splash.core.video.a.b r0 = (com.ss.android.ad.splash.core.video.a.b) r0     // Catch:{ Exception -> 0x0182 }
            android.media.MediaPlayer r0 = r0.g     // Catch:{ Exception -> 0x0182 }
            r0.prepare()     // Catch:{ Exception -> 0x0182 }
            r1.f27752b = r14     // Catch:{ Exception -> 0x0182 }
            goto L_0x0232
        L_0x0182:
            r0 = move-exception
            r3 = 1003(0x3eb, float:1.406E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x0235
        L_0x018f:
            java.util.Set<android.graphics.SurfaceTexture> r4 = r1.o     // Catch:{ Exception -> 0x019e }
            monitor-enter(r4)     // Catch:{ Exception -> 0x019e }
            monitor-exit(r4)     // Catch:{ all -> 0x019b }
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f27751a     // Catch:{ Exception -> 0x019e }
            r0.g()     // Catch:{ Exception -> 0x019e }
            r4 = 0
            r5 = 0
            goto L_0x01aa
        L_0x019b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x019b }
            throw r0     // Catch:{ Exception -> 0x019e }
        L_0x019e:
            r0 = move-exception
            r3 = 1009(0x3f1, float:1.414E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            r4 = 0
        L_0x01aa:
            r1.h = r4
            r0 = 309(0x135, float:4.33E-43)
            r4 = 0
            r1.a((int) r0, (java.lang.Object) r4)
            r1.f27752b = r10
            r1.f27751a = r4
            goto L_0x0235
        L_0x01b8:
            r4 = 0
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f27751a     // Catch:{ Exception -> 0x01c2 }
            r0.h()     // Catch:{ Exception -> 0x01c2 }
            r1.f27752b = r11     // Catch:{ Exception -> 0x01c2 }
            goto L_0x0233
        L_0x01c2:
            r0 = move-exception
            r3 = 1006(0x3ee, float:1.41E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x0235
        L_0x01cf:
            r4 = 0
            int r0 = r1.f27752b
            if (r0 == r6) goto L_0x01df
            int r0 = r1.f27752b
            if (r0 == r5) goto L_0x01df
            int r0 = r1.f27752b
            if (r0 != r15) goto L_0x01dd
            goto L_0x01df
        L_0x01dd:
            r5 = r4
            goto L_0x0171
        L_0x01df:
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f27751a     // Catch:{ Exception -> 0x01ec }
            r0.d()     // Catch:{ Exception -> 0x01ec }
            r1.f27752b = r5     // Catch:{ Exception -> 0x01ec }
            r8 = 0
            r1.f27755e = r8     // Catch:{ Exception -> 0x01ea }
            goto L_0x0234
        L_0x01ea:
            r0 = move-exception
            goto L_0x01ee
        L_0x01ec:
            r0 = move-exception
            r8 = 0
        L_0x01ee:
            r3 = 1005(0x3ed, float:1.408E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x0235
        L_0x01f9:
            r4 = 0
            r8 = 0
            int r0 = r1.f27752b
            if (r0 == r14) goto L_0x020b
            int r0 = r1.f27752b
            if (r0 == r6) goto L_0x020b
            int r0 = r1.f27752b
            if (r0 == r5) goto L_0x020b
            int r0 = r1.f27752b
            if (r0 != r15) goto L_0x01dd
        L_0x020b:
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f27751a     // Catch:{ Exception -> 0x0226 }
            r0.b()     // Catch:{ Exception -> 0x0226 }
            r1.f27752b = r6     // Catch:{ Exception -> 0x0226 }
            long r5 = r1.f27753c     // Catch:{ Exception -> 0x0226 }
            r9 = 0
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0234
            com.ss.android.ad.splash.core.video.a.c r0 = r1.f27751a     // Catch:{ Exception -> 0x0226 }
            long r5 = r1.f27753c     // Catch:{ Exception -> 0x0226 }
            r0.a((long) r5)     // Catch:{ Exception -> 0x0226 }
            r5 = -1
            r1.f27753c = r5     // Catch:{ Exception -> 0x0226 }
            goto L_0x0234
        L_0x0226:
            r0 = move-exception
            r3 = 1004(0x3ec, float:1.407E-42)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = r0.getMessage()
            goto L_0x0235
        L_0x0232:
            r4 = 0
        L_0x0233:
            r8 = 0
        L_0x0234:
            r5 = r4
        L_0x0235:
            r18 = 0
        L_0x0237:
            if (r5 == 0) goto L_0x025a
            r0 = 310(0x136, float:4.34E-43)
            r1.a((int) r0, (java.lang.Object) r5)
            com.ss.android.ad.splash.b.b.a()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0259 }
            r0.<init>()     // Catch:{ Exception -> 0x0259 }
            java.lang.String r4 = "key_video_play_error_msg"
            r0.put(r4, r3)     // Catch:{ Exception -> 0x0259 }
            com.ss.android.ad.splash.b.a r3 = com.ss.android.ad.splash.b.a.a()     // Catch:{ Exception -> 0x0259 }
            java.lang.String r4 = "service_video_play_error"
            int r5 = r5.intValue()     // Catch:{ Exception -> 0x0259 }
            r3.a((java.lang.String) r4, (int) r5, (org.json.JSONObject) r0)     // Catch:{ Exception -> 0x0259 }
            goto L_0x025a
        L_0x0259:
        L_0x025a:
            if (r18 == 0) goto L_0x026f
            r0 = 200(0xc8, float:2.8E-43)
            r1.f27752b = r0
            boolean r0 = r1.g
            if (r0 != 0) goto L_0x026f
            r0 = 308(0x134, float:4.32E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.a((int) r0, (java.lang.Object) r2)
            r1.g = r7
        L_0x026f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ad.splash.core.video.c.a(android.os.Message):void");
    }

    private void a(int i2, Object obj) {
        if (i2 == 309) {
            g();
        }
        if (this.i != null) {
            this.i.obtainMessage(i2, obj).sendToTarget();
        }
    }

    private c(Handler handler, byte b2) {
        this.f27752b = 201;
        this.f27753c = -1;
        this.o = new HashSet();
        this.p = new Object();
        this.q = null;
        this.k = 0;
        this.i = handler;
        HandlerThread handlerThread = new HandlerThread("VideoManager");
        handlerThread.start();
        this.f27754d = new l(handlerThread.getLooper(), this);
        a();
    }

    private void a(int i2, boolean z) {
        AudioManager audioManager = (AudioManager) e.F().getSystemService("audio");
        if (audioManager != null) {
            audioManager.setStreamVolume(3, i2, 0);
        }
    }

    public final void a(com.ss.android.ad.splash.core.video.a.c cVar, int i2) {
        if (this.f27751a == cVar && this.i != null) {
            this.i.obtainMessage(301, Integer.valueOf(i2)).sendToTarget();
        }
    }

    public final boolean a(int i2, int i3) {
        this.f27752b = 200;
        Integer num = n.get(Integer.valueOf(this.k));
        if (num == null) {
            n.put(Integer.valueOf(this.k), 1);
        } else {
            n.put(Integer.valueOf(this.k), Integer.valueOf(num.intValue() + 1));
        }
        if (this.i != null) {
            this.i.obtainMessage(303, i2, i3).sendToTarget();
        }
        return false;
    }
}
