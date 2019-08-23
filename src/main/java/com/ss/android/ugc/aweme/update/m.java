package com.ss.android.ugc.aweme.update;

import a.i;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.NotificationCompat;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.common.utility.persistent.SharedPrefsEditorCompat;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.AppContext;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.downloadlib.h;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.ss.android.ugc.aweme.feedback.s;
import com.ss.android.ugc.aweme.legoImp.task.CancelNotificationForUpdateTask;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.utils.p;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class m {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4275a;

    /* renamed from: f  reason: collision with root package name */
    public static m f4276f;
    String A = "";
    boolean B;
    boolean C;
    boolean D;
    String E = "";
    String F = "";
    String G = "";
    String H = "";
    boolean I;
    int J = 2;
    long K = -1;
    int L;
    String M = "";
    int N;
    int O;
    volatile boolean P;
    public final a Q;
    public c R;
    public e S;
    int T;
    volatile boolean U;
    final a V;
    c W;
    a X;
    com.ss.android.download.api.c.e Y;
    final b Z = new b();
    private int aa = 1;
    private boolean ab;
    private NotificationCompat.Builder ac;

    /* renamed from: b  reason: collision with root package name */
    protected int f4277b;

    /* renamed from: c  reason: collision with root package name */
    protected long f4278c;

    /* renamed from: d  reason: collision with root package name */
    protected int f4279d;

    /* renamed from: e  reason: collision with root package name */
    protected long f4280e;
    public NotificationManager g;
    final AppContext h;
    public final Context i;
    final String j;
    final Handler k;
    String l;
    String m;
    String n;
    String o;
    String p;
    boolean q;
    String r = "";
    int s;
    int t;
    int u;
    String v = "";
    String w = "";
    String x = "";
    long y;
    String z = "";

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75264a;

        /* renamed from: c  reason: collision with root package name */
        private CountDownLatch f75266c;

        /* renamed from: d  reason: collision with root package name */
        private AtomicBoolean f75267d;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f75264a, false, 87474, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f75264a, false, 87474, new Class[0], Void.TYPE);
            } else if (this.f75266c != null) {
                this.f75266c.countDown();
                Logger.debug();
            }
        }

        public final void b() {
            long j;
            if (PatchProxy.isSupport(new Object[0], this, f75264a, false, 87475, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f75264a, false, 87475, new Class[0], Void.TYPE);
                return;
            }
            this.f75267d.getAndSet(true);
            if (this.f75266c == null) {
                j = 0;
            } else {
                j = this.f75266c.getCount();
            }
            for (int i = 0; ((long) i) < j; i++) {
                this.f75266c.countDown();
            }
            Logger.debug();
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f75264a, false, 87476, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f75264a, false, 87476, new Class[0], Void.TYPE);
                return;
            }
            Thread.currentThread().setName("DownloadCountDownLatchThread");
            try {
                this.f75266c.await();
                if (!this.f75267d.get()) {
                    com.ss.android.download.api.c.e a2 = h.a(m.this.i).f29059c.a(m.this.H);
                    if (a2 != null && !StringUtils.isEmpty(a2.f28495e)) {
                        File file = new File(a2.f28495e);
                        if (a2.f28492b == 8 && file.exists()) {
                            h.a(m.this.i).f29059c.a(m.this.i, a2.f28491a, 268435456);
                        }
                    }
                    m.this.g.cancel(C0906R.id.cu6);
                    m.this.g.cancel(C0906R.id.cu7);
                    m.this.g.cancel(C0906R.id.cu4);
                    m.this.w();
                }
            } catch (InterruptedException unused) {
            }
        }

        private a(CountDownLatch countDownLatch) {
            this.f75267d = new AtomicBoolean(false);
            this.f75266c = countDownLatch;
        }

        /* synthetic */ a(m mVar, CountDownLatch countDownLatch, byte b2) {
            this(countDownLatch);
        }
    }

    class b implements com.ss.android.download.api.b.a.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75268a;

        /* renamed from: b  reason: collision with root package name */
        public long f75269b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f75270c;

        public final void a(long j) {
            this.f75269b = j;
        }

        b() {
        }

        public final void a(com.ss.android.download.api.c.e eVar, int i, long j, long j2, long j3) {
            final com.ss.android.download.api.c.e eVar2 = eVar;
            long j4 = j;
            long j5 = j2;
            long j6 = j3;
            if (PatchProxy.isSupport(new Object[]{eVar2, Integer.valueOf(i), new Long(j4), new Long(j5), new Long(j6)}, this, f75268a, false, 87477, new Class[]{com.ss.android.download.api.c.e.class, Integer.TYPE, Long.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar2, Integer.valueOf(i), new Long(j4), new Long(j5), new Long(j6)}, this, f75268a, false, 87477, new Class[]{com.ss.android.download.api.c.e.class, Integer.TYPE, Long.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE);
                return;
            }
            final int i2 = i;
            m.this.k.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f75272a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f75272a, false, 87478, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f75272a, false, 87478, new Class[0], Void.TYPE);
                    } else if (eVar2 != null && eVar2.f28491a == b.this.f75269b) {
                        try {
                            m.this.Y = eVar2;
                            if (i2 == 3 && !b.this.f75270c) {
                                b.this.f75270c = true;
                                Logger.debug();
                                m.this.u();
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
    }

    public class c extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75276a;

        /* renamed from: b  reason: collision with root package name */
        volatile boolean f75277b;

        /* renamed from: c  reason: collision with root package name */
        b f75278c = new b(m.this, m.this.i);

        /* renamed from: e  reason: collision with root package name */
        private volatile boolean f75280e;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f75276a, false, 87479, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f75276a, false, 87479, new Class[0], Void.TYPE);
                return;
            }
            this.f75277b = true;
            this.f75278c.a();
        }

        /* JADX WARNING: Removed duplicated region for block: B:46:0x0143 A[Catch:{ Exception -> 0x017c }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x0150 A[Catch:{ Exception -> 0x017c }] */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x015b A[Catch:{ Exception -> 0x017c }] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x019b A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0200  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x021b  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r18 = this;
                r8 = r18
                r9 = 0
                java.lang.Object[] r1 = new java.lang.Object[r9]
                com.meituan.robust.ChangeQuickRedirect r3 = f75276a
                java.lang.Class[] r6 = new java.lang.Class[r9]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 87480(0x155b8, float:1.22586E-40)
                r2 = r18
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r0 == 0) goto L_0x0029
                java.lang.Object[] r1 = new java.lang.Object[r9]
                com.meituan.robust.ChangeQuickRedirect r3 = f75276a
                r4 = 0
                r5 = 87480(0x155b8, float:1.22586E-40)
                java.lang.Class[] r6 = new java.lang.Class[r9]
                java.lang.Class r7 = java.lang.Void.TYPE
                r2 = r18
                com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                return
            L_0x0029:
                boolean r0 = r8.f75280e
                if (r0 != 0) goto L_0x0035
                com.ss.android.ugc.aweme.update.m r0 = com.ss.android.ugc.aweme.update.m.this
                android.os.Handler r0 = r0.k
                r1 = 3
                r0.sendEmptyMessage(r1)
            L_0x0035:
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                r0 = 0
                r2 = 1
                com.ss.android.ugc.aweme.update.m r3 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ Exception -> 0x017e }
                boolean r3 = r3.r()     // Catch:{ Exception -> 0x017e }
                if (r3 != 0) goto L_0x0049
                java.lang.String r0 = "checkUpdate = false"
            L_0x0046:
                r4 = 0
                goto L_0x0184
            L_0x0049:
                com.ss.android.ugc.aweme.update.m r3 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ Exception -> 0x017e }
                boolean r3 = r3.h()     // Catch:{ Exception -> 0x017e }
                if (r3 != 0) goto L_0x0054
                java.lang.String r0 = "isRealCurrentVersionOut = false"
                goto L_0x0046
            L_0x0054:
                java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x017e }
                com.ss.android.ugc.aweme.update.m r4 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ Exception -> 0x017e }
                java.lang.String r4 = r4.l     // Catch:{ Exception -> 0x017e }
                r3.<init>(r4)     // Catch:{ Exception -> 0x017e }
                boolean r4 = r3.isDirectory()     // Catch:{ Exception -> 0x017e }
                if (r4 != 0) goto L_0x007c
                boolean r3 = r3.mkdirs()     // Catch:{ Exception -> 0x017e }
                if (r3 != 0) goto L_0x007c
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017e }
                java.lang.String r3 = "can not mkdir files dir: "
                r0.<init>(r3)     // Catch:{ Exception -> 0x017e }
                com.ss.android.ugc.aweme.update.m r3 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ Exception -> 0x017e }
                java.lang.String r3 = r3.l     // Catch:{ Exception -> 0x017e }
                r0.append(r3)     // Catch:{ Exception -> 0x017e }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x017e }
                goto L_0x0046
            L_0x007c:
                java.lang.Exception[] r3 = new java.lang.Exception[r2]     // Catch:{ Exception -> 0x017e }
                boolean r4 = r8.f75280e     // Catch:{ Exception -> 0x017e }
                if (r4 == 0) goto L_0x00dc
                com.ss.android.ugc.aweme.update.b r4 = r8.f75278c     // Catch:{ Exception -> 0x017e }
                com.ss.android.ugc.aweme.update.m r5 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ Exception -> 0x017e }
                java.lang.String r5 = r5.r     // Catch:{ Exception -> 0x017e }
                com.ss.android.ugc.aweme.update.m r6 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ Exception -> 0x017e }
                java.lang.String r6 = r6.p     // Catch:{ Exception -> 0x017e }
                boolean r7 = r8.f75280e     // Catch:{ Exception -> 0x017e }
                boolean r4 = r4.a(r5, r6, r7, r3)     // Catch:{ Exception -> 0x017e }
                java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x017e }
                com.ss.android.ugc.aweme.update.m r6 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ Exception -> 0x017e }
                java.lang.String r6 = r6.o     // Catch:{ Exception -> 0x017e }
                r5.<init>(r6)     // Catch:{ Exception -> 0x017e }
                r5.delete()     // Catch:{ Exception -> 0x017e }
                if (r4 == 0) goto L_0x013a
                java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x017e }
                com.ss.android.ugc.aweme.update.m r6 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ Exception -> 0x017e }
                java.lang.String r6 = r6.p     // Catch:{ Exception -> 0x017e }
                r4.<init>(r6)     // Catch:{ Exception -> 0x017e }
                boolean r6 = r4.isFile()     // Catch:{ Exception -> 0x017e }
                if (r6 != 0) goto L_0x00c5
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017e }
                r0.<init>()     // Catch:{ Exception -> 0x017e }
                com.ss.android.ugc.aweme.update.m r3 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ Exception -> 0x017e }
                java.lang.String r3 = r3.p     // Catch:{ Exception -> 0x017e }
                r0.append(r3)     // Catch:{ Exception -> 0x017e }
                java.lang.String r3 = " is not a file."
                r0.append(r3)     // Catch:{ Exception -> 0x017e }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x017e }
                goto L_0x0046
            L_0x00c5:
                boolean r4 = r4.renameTo(r5)     // Catch:{ Exception -> 0x017e }
                if (r4 == 0) goto L_0x0137
                java.lang.String r5 = com.bytedance.common.utility.DigestUtils.md5Hex((java.io.File) r5)     // Catch:{ Exception -> 0x017c }
                com.ss.android.ugc.aweme.update.m r6 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ Exception -> 0x017c }
                java.lang.String r6 = r6.o     // Catch:{ Exception -> 0x017c }
                byte[] r6 = com.bytedance.common.utility.SignUtils.getApkSignature(r6)     // Catch:{ Exception -> 0x017c }
                java.lang.String r6 = com.bytedance.common.utility.DigestUtils.md5Hex((byte[]) r6)     // Catch:{ Exception -> 0x017c }
                goto L_0x013d
            L_0x00dc:
                com.ss.android.ugc.aweme.update.b r4 = r8.f75278c     // Catch:{ Exception -> 0x017e }
                com.ss.android.ugc.aweme.update.m r5 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ Exception -> 0x017e }
                java.lang.String r5 = r5.r     // Catch:{ Exception -> 0x017e }
                com.ss.android.ugc.aweme.update.m r6 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ Exception -> 0x017e }
                java.lang.String r6 = r6.n     // Catch:{ Exception -> 0x017e }
                boolean r7 = r8.f75280e     // Catch:{ Exception -> 0x017e }
                boolean r4 = r4.a(r5, r6, r7, r3)     // Catch:{ Exception -> 0x017e }
                java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x017e }
                com.ss.android.ugc.aweme.update.m r6 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ Exception -> 0x017e }
                java.lang.String r6 = r6.m     // Catch:{ Exception -> 0x017e }
                r5.<init>(r6)     // Catch:{ Exception -> 0x017e }
                r5.delete()     // Catch:{ Exception -> 0x017e }
                if (r4 == 0) goto L_0x013a
                java.io.File r4 = new java.io.File     // Catch:{ Exception -> 0x017e }
                com.ss.android.ugc.aweme.update.m r6 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ Exception -> 0x017e }
                java.lang.String r6 = r6.n     // Catch:{ Exception -> 0x017e }
                r4.<init>(r6)     // Catch:{ Exception -> 0x017e }
                boolean r6 = r4.isFile()     // Catch:{ Exception -> 0x017e }
                if (r6 != 0) goto L_0x0120
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017e }
                r0.<init>()     // Catch:{ Exception -> 0x017e }
                com.ss.android.ugc.aweme.update.m r3 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ Exception -> 0x017e }
                java.lang.String r3 = r3.n     // Catch:{ Exception -> 0x017e }
                r0.append(r3)     // Catch:{ Exception -> 0x017e }
                java.lang.String r3 = " is not a file."
                r0.append(r3)     // Catch:{ Exception -> 0x017e }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x017e }
                goto L_0x0046
            L_0x0120:
                boolean r4 = r4.renameTo(r5)     // Catch:{ Exception -> 0x017e }
                if (r4 == 0) goto L_0x0137
                java.lang.String r5 = com.bytedance.common.utility.DigestUtils.md5Hex((java.io.File) r5)     // Catch:{ Exception -> 0x017c }
                com.ss.android.ugc.aweme.update.m r6 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ Exception -> 0x017c }
                java.lang.String r6 = r6.m     // Catch:{ Exception -> 0x017c }
                byte[] r6 = com.bytedance.common.utility.SignUtils.getApkSignature(r6)     // Catch:{ Exception -> 0x017c }
                java.lang.String r6 = com.bytedance.common.utility.DigestUtils.md5Hex((byte[]) r6)     // Catch:{ Exception -> 0x017c }
                goto L_0x013d
            L_0x0137:
                r5 = r0
                r6 = r5
                goto L_0x013d
            L_0x013a:
                r5 = r0
                r6 = r5
                r4 = 0
            L_0x013d:
                boolean r7 = com.bytedance.common.utility.StringUtils.isEmpty(r5)     // Catch:{ Exception -> 0x017c }
                if (r7 != 0) goto L_0x014a
                com.ss.android.ugc.aweme.update.m r7 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ Exception -> 0x017c }
                java.lang.String r10 = "md5"
                r7.a((org.json.JSONObject) r1, (java.lang.String) r10, (java.lang.Object) r5)     // Catch:{ Exception -> 0x017c }
            L_0x014a:
                boolean r5 = com.bytedance.common.utility.StringUtils.isEmpty(r6)     // Catch:{ Exception -> 0x017c }
                if (r5 != 0) goto L_0x0157
                com.ss.android.ugc.aweme.update.m r5 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ Exception -> 0x017c }
                java.lang.String r7 = "sig_hash"
                r5.a((org.json.JSONObject) r1, (java.lang.String) r7, (java.lang.Object) r6)     // Catch:{ Exception -> 0x017c }
            L_0x0157:
                r5 = r3[r9]     // Catch:{ Exception -> 0x017c }
                if (r5 == 0) goto L_0x0184
                com.ss.android.ugc.aweme.update.m r5 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ Exception -> 0x017c }
                android.content.Context r5 = r5.i     // Catch:{ Exception -> 0x017c }
                r6 = r3[r9]     // Catch:{ Exception -> 0x017c }
                int r5 = com.ss.android.ugc.aweme.utils.p.a((android.content.Context) r5, (java.lang.Throwable) r6)     // Catch:{ Exception -> 0x017c }
                r6 = 18
                if (r6 == r5) goto L_0x0175
                com.ss.android.ugc.aweme.update.m r3 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ Exception -> 0x017c }
                java.lang.String r6 = "errorCode"
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x017c }
                r3.a((org.json.JSONObject) r1, (java.lang.String) r6, (java.lang.Object) r5)     // Catch:{ Exception -> 0x017c }
                goto L_0x0184
            L_0x0175:
                r0 = r3[r9]     // Catch:{ Exception -> 0x017c }
                java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x017c }
                goto L_0x0184
            L_0x017c:
                r0 = move-exception
                goto L_0x0180
            L_0x017e:
                r0 = move-exception
                r4 = 0
            L_0x0180:
                java.lang.String r0 = r0.getMessage()
            L_0x0184:
                if (r4 == 0) goto L_0x0196
                java.io.File r3 = new java.io.File
                com.ss.android.ugc.aweme.update.m r5 = com.ss.android.ugc.aweme.update.m.this
                java.lang.String r5 = r5.m
                r3.<init>(r5)
                boolean r3 = r3.isFile()
                if (r3 != 0) goto L_0x0196
                r4 = 0
            L_0x0196:
                com.ss.android.ugc.aweme.update.m r3 = com.ss.android.ugc.aweme.update.m.this
                com.ss.android.ugc.aweme.update.a r3 = r3.Q
                monitor-enter(r3)
                boolean r5 = r8.f75280e     // Catch:{ all -> 0x0307 }
                if (r5 == 0) goto L_0x01a4
                com.ss.android.ugc.aweme.update.m r5 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ all -> 0x0307 }
                r5.U = r9     // Catch:{ all -> 0x0307 }
                goto L_0x01c8
            L_0x01a4:
                com.ss.android.ugc.aweme.update.m r5 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ all -> 0x0307 }
                r5.P = r9     // Catch:{ all -> 0x0307 }
                if (r4 == 0) goto L_0x01b2
                com.ss.android.ugc.aweme.update.m r5 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ all -> 0x0307 }
                android.os.Handler r5 = r5.k     // Catch:{ all -> 0x0307 }
                r5.sendEmptyMessage(r2)     // Catch:{ all -> 0x0307 }
                goto L_0x01c8
            L_0x01b2:
                boolean r5 = r8.f75277b     // Catch:{ all -> 0x0307 }
                if (r5 == 0) goto L_0x01c0
                com.ss.android.ugc.aweme.update.m r5 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ all -> 0x0307 }
                android.os.Handler r5 = r5.k     // Catch:{ all -> 0x0307 }
                r6 = 13
                r5.sendEmptyMessage(r6)     // Catch:{ all -> 0x0307 }
                goto L_0x01c8
            L_0x01c0:
                com.ss.android.ugc.aweme.update.m r5 = com.ss.android.ugc.aweme.update.m.this     // Catch:{ all -> 0x0307 }
                android.os.Handler r5 = r5.k     // Catch:{ all -> 0x0307 }
                r6 = 4
                r5.sendEmptyMessage(r6)     // Catch:{ all -> 0x0307 }
            L_0x01c8:
                monitor-exit(r3)     // Catch:{ all -> 0x0307 }
                com.ss.android.ugc.aweme.update.m r3 = com.ss.android.ugc.aweme.update.m.this
                java.lang.String r5 = "errorMsg"
                r3.a((org.json.JSONObject) r1, (java.lang.String) r5, (java.lang.Object) r0)
                com.ss.android.ugc.aweme.update.m r0 = com.ss.android.ugc.aweme.update.m.this
                java.lang.String r3 = "remote_ip"
                com.ss.android.ugc.aweme.update.m r5 = com.ss.android.ugc.aweme.update.m.this
                java.lang.String r5 = r5.r
                java.lang.String r5 = com.ss.android.ugc.aweme.update.c.a(r5)
                r0.a((org.json.JSONObject) r1, (java.lang.String) r3, (java.lang.Object) r5)
                com.ss.android.ugc.aweme.update.m r0 = com.ss.android.ugc.aweme.update.m.this
                java.lang.String r3 = "client_ip"
                com.ss.android.ugc.aweme.update.m r5 = com.ss.android.ugc.aweme.update.m.this
                android.content.Context r5 = r5.i
                java.lang.Object[] r10 = new java.lang.Object[r2]
                r10[r9] = r5
                r11 = 0
                com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.update.c.f75209a
                r13 = 1
                r14 = 87358(0x1553e, float:1.22415E-40)
                java.lang.Class[] r15 = new java.lang.Class[r2]
                java.lang.Class<android.content.Context> r6 = android.content.Context.class
                r15[r9] = r6
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                boolean r6 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
                if (r6 == 0) goto L_0x021b
                java.lang.Object[] r10 = new java.lang.Object[r2]
                r10[r9] = r5
                r11 = 0
                com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.update.c.f75209a
                r13 = 1
                r14 = 87358(0x1553e, float:1.22415E-40)
                java.lang.Class[] r15 = new java.lang.Class[r2]
                java.lang.Class<android.content.Context> r5 = android.content.Context.class
                r15[r9] = r5
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                java.lang.String r5 = (java.lang.String) r5
                goto L_0x02b5
            L_0x021b:
                if (r5 != 0) goto L_0x0221
                java.lang.String r5 = ""
                goto L_0x02b5
            L_0x0221:
                android.content.Context r5 = r5.getApplicationContext()
                java.lang.String r6 = "wifi"
                java.lang.Object r5 = r5.getSystemService(r6)
                android.net.wifi.WifiManager r5 = (android.net.wifi.WifiManager) r5
                if (r5 == 0) goto L_0x02b1
                boolean r6 = r5.isWifiEnabled()
                if (r6 == 0) goto L_0x02b1
                java.lang.String r6 = ""
                android.net.wifi.WifiInfo r5 = r5.getConnectionInfo()
                if (r5 == 0) goto L_0x02af
                int r5 = r5.getIpAddress()
                java.lang.Object[] r10 = new java.lang.Object[r2]
                java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                r10[r9] = r6
                r11 = 0
                com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.update.c.f75209a
                r13 = 1
                r14 = 87359(0x1553f, float:1.22416E-40)
                java.lang.Class[] r15 = new java.lang.Class[r2]
                java.lang.Class r6 = java.lang.Integer.TYPE
                r15[r9] = r6
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                boolean r6 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)
                if (r6 == 0) goto L_0x027c
                java.lang.Object[] r10 = new java.lang.Object[r2]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r10[r9] = r5
                r11 = 0
                com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.update.c.f75209a
                r13 = 1
                r14 = 87359(0x1553f, float:1.22416E-40)
                java.lang.Class[] r15 = new java.lang.Class[r2]
                java.lang.Class r5 = java.lang.Integer.TYPE
                r15[r9] = r5
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                java.lang.Object r5 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                java.lang.String r5 = (java.lang.String) r5
                goto L_0x02b5
            L_0x027c:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r7 = r5 & 255(0xff, float:3.57E-43)
                r6.append(r7)
                java.lang.String r7 = "."
                r6.append(r7)
                int r7 = r5 >> 8
                r7 = r7 & 255(0xff, float:3.57E-43)
                r6.append(r7)
                java.lang.String r7 = "."
                r6.append(r7)
                int r7 = r5 >> 16
                r7 = r7 & 255(0xff, float:3.57E-43)
                r6.append(r7)
                java.lang.String r7 = "."
                r6.append(r7)
                int r5 = r5 >> 24
                r5 = r5 & 255(0xff, float:3.57E-43)
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                goto L_0x02b5
            L_0x02af:
                r5 = r6
                goto L_0x02b5
            L_0x02b1:
                java.lang.String r5 = com.ss.android.ugc.aweme.update.c.a()
            L_0x02b5:
                r0.a((org.json.JSONObject) r1, (java.lang.String) r3, (java.lang.Object) r5)
                com.ss.android.ugc.aweme.update.m r0 = com.ss.android.ugc.aweme.update.m.this
                java.lang.String r3 = "url"
                com.ss.android.ugc.aweme.update.m r5 = com.ss.android.ugc.aweme.update.m.this
                java.lang.String r5 = r5.r
                r0.a((org.json.JSONObject) r1, (java.lang.String) r3, (java.lang.Object) r5)
                com.ss.android.ugc.aweme.update.m r0 = com.ss.android.ugc.aweme.update.m.this
                java.lang.String r3 = "pre"
                boolean r5 = r8.f75280e
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r0.a((org.json.JSONObject) r1, (java.lang.String) r3, (java.lang.Object) r5)
                com.ss.android.ugc.aweme.update.m r0 = com.ss.android.ugc.aweme.update.m.this
                java.lang.String r3 = "cancled"
                boolean r5 = r8.f75277b
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r0.a((org.json.JSONObject) r1, (java.lang.String) r3, (java.lang.Object) r5)
                com.ss.android.ugc.aweme.update.m r0 = com.ss.android.ugc.aweme.update.m.this
                java.lang.String r3 = "success"
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                r0.a((org.json.JSONObject) r1, (java.lang.String) r3, (java.lang.Object) r5)
                com.ss.android.ugc.aweme.update.m r0 = com.ss.android.ugc.aweme.update.m.this
                android.content.Context r10 = r0.i
                java.lang.String r11 = "app_update"
                java.lang.String r12 = "download"
                r13 = 0
                r15 = 0
                r17 = r1
                com.ss.android.common.lib.a.a(r10, r11, r12, r13, r15, r17)
                if (r4 != 0) goto L_0x0300
                boolean r0 = r8.f75277b
                if (r0 != 0) goto L_0x0300
                r9 = 1
            L_0x0300:
                java.lang.String r0 = "service_apk_download_info"
                r2 = r2 ^ r9
                com.ss.android.ugc.aweme.base.n.a((java.lang.String) r0, (int) r2, (org.json.JSONObject) r1)
                return
            L_0x0307:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x0307 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.update.m.c.run():void");
        }

        c(boolean z) {
            this.f75280e = z;
        }
    }

    static class d extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75281a;

        /* renamed from: b  reason: collision with root package name */
        private WeakReference<m> f75282b;

        public final void handleMessage(Message message) {
            Message message2 = message;
            if (PatchProxy.isSupport(new Object[]{message2}, this, f75281a, false, 87481, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message2}, this, f75281a, false, 87481, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            m mVar = (m) this.f75282b.get();
            if (mVar != null) {
                if (PatchProxy.isSupport(new Object[]{message2}, mVar, m.f4275a, false, 87413, new Class[]{Message.class}, Void.TYPE)) {
                    m mVar2 = mVar;
                    PatchProxy.accessDispatch(new Object[]{message2}, mVar2, m.f4275a, false, 87413, new Class[]{Message.class}, Void.TYPE);
                    return;
                }
                switch (message2.what) {
                    case 1:
                        if (mVar.X == null) {
                            mVar.g.cancel(C0906R.id.cu6);
                            mVar.g.cancel(C0906R.id.cu7);
                            mVar.g.cancel(C0906R.id.cu4);
                            mVar.w();
                            return;
                        }
                        Logger.debug();
                        mVar.u();
                        return;
                    case 2:
                        mVar.g.cancel(C0906R.id.cu5);
                        mVar.g.cancel(C0906R.id.cu4);
                        if (PatchProxy.isSupport(new Object[0], mVar, m.f4275a, false, 87462, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], mVar, m.f4275a, false, 87462, new Class[0], Void.TYPE);
                            break;
                        } else {
                            if (mVar.h()) {
                                String stringAppName = mVar.h.getStringAppName();
                                String format = String.format(mVar.i.getString(C0906R.string.cbt), new Object[]{stringAppName, mVar.e()});
                                String format2 = String.format(mVar.i.getString(C0906R.string.cbs), new Object[]{mVar.e()});
                                Intent intent = new Intent(mVar.i, UpdateActivity.class);
                                intent.putExtra("from_update_avail", true);
                                intent.addFlags(536870912);
                                PendingIntent activity = PendingIntent.getActivity(mVar.i, 0, intent, 0);
                                NotificationCompat.Builder builder = new NotificationCompat.Builder(mVar.i, "update_notification");
                                builder.setSmallIcon(2130840575).setTicker(format).setWhen(System.currentTimeMillis()).setContentTitle(stringAppName).setContentText(format2).setContentIntent(activity).setAutoCancel(true);
                                mVar.g.notify(C0906R.id.cu7, builder.build());
                            }
                            return;
                        }
                    case 3:
                        mVar.g.cancel(C0906R.id.cu6);
                        mVar.g.cancel(C0906R.id.cu4);
                        mVar.g.cancel(C0906R.id.cu5);
                        mVar.g.cancel(C0906R.id.cu7);
                        mVar.g.notify(C0906R.id.cu6, mVar.a(0));
                        return;
                    case 4:
                        mVar.g.cancel(C0906R.id.cu6);
                        mVar.g.cancel(C0906R.id.cu5);
                        mVar.g.cancel(C0906R.id.cu7);
                        if (PatchProxy.isSupport(new Object[0], mVar, m.f4275a, false, 87461, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], mVar, m.f4275a, false, 87461, new Class[0], Void.TYPE);
                            break;
                        } else {
                            if (mVar.h()) {
                                String stringAppName2 = mVar.h.getStringAppName();
                                String string = mVar.i.getString(C0906R.string.cbr);
                                PendingIntent activity2 = PendingIntent.getActivity(mVar.i, 0, new Intent(), 0);
                                NotificationCompat.Builder builder2 = new NotificationCompat.Builder(mVar.i, "update_notification");
                                builder2.setSmallIcon(17301624).setTicker(string).setWhen(System.currentTimeMillis());
                                builder2.setContentTitle(stringAppName2).setContentText(string).setContentIntent(activity2).setAutoCancel(true);
                                mVar.g.notify(C0906R.id.cu4, builder2.build());
                            }
                            return;
                        }
                    case 5:
                        int i = message2.arg1;
                        if (i < 0) {
                            i = 0;
                        }
                        if (i > 99) {
                            i = 99;
                        }
                        mVar.g.notify(C0906R.id.cu6, mVar.a(i));
                        return;
                    case 6:
                        if (PatchProxy.isSupport(new Object[0], mVar, m.f4275a, false, 87470, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], mVar, m.f4275a, false, 87470, new Class[0], Void.TYPE);
                            break;
                        } else {
                            com.ss.android.ugc.aweme.aj.b.b().a(mVar.i, "last_check_update_time", System.currentTimeMillis());
                            mVar.k.postDelayed(new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f75262a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f75262a, false, 87473, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f75262a, false, 87473, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    Activity f2 = AwemeAppData.p().f();
                                    if (f2 != null && (f2 instanceof AbsActivity)) {
                                        AbsActivity absActivity = (AbsActivity) f2;
                                        if (absActivity.isActive()) {
                                            m.a().a((Context) absActivity);
                                        }
                                    }
                                }
                            }, (long) (m.a().l() * PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE));
                            return;
                        }
                    case com.ss.android.ugc.aweme.commercialize.loft.model.e.l /*?: ONE_ARG  (7 int)*/:
                        Logger.debug();
                        mVar.u();
                        return;
                    case 10:
                        mVar.g.cancel(C0906R.id.cu5);
                        break;
                    case 11:
                        mVar.g.cancel(C0906R.id.cu7);
                        return;
                    case SearchNilInfo.HIT_TYPE_SENSITIVE /*12*/:
                        mVar.g.cancel(C0906R.id.cu4);
                        return;
                    case 13:
                        mVar.g.cancel(C0906R.id.cu6);
                        Logger.debug();
                        mVar.u();
                        return;
                }
            }
        }

        d(Looper looper, m mVar) {
            super(looper);
            this.f75282b = new WeakReference<>(mVar);
        }
    }

    public class e extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f75283a;

        /* renamed from: b  reason: collision with root package name */
        volatile boolean f75284b;

        public final void a() {
            this.f75284b = true;
        }

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f75283a, false, 87482, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f75283a, false, 87482, new Class[0], Void.TYPE);
                return;
            }
            while (true) {
                try {
                    Thread.sleep(1500);
                } catch (Exception unused) {
                }
                synchronized (m.this.Q) {
                    if (!this.f75284b) {
                        if (m.this.P) {
                            long j = m.this.Q.f75201a;
                            long j2 = m.this.Q.f75202b;
                            int i = 1;
                            if (j2 > 0) {
                                i = (int) ((j * 100) / j2);
                                if (i > 99) {
                                    i = 99;
                                }
                            }
                            Message obtainMessage = m.this.k.obtainMessage(5);
                            obtainMessage.arg1 = i;
                            m.this.k.sendMessage(obtainMessage);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        e() {
        }
    }

    public static m a() {
        return f4276f;
    }

    public final void a(JSONObject jSONObject, String str, Object obj) {
        if (PatchProxy.isSupport(new Object[]{jSONObject, str, obj}, this, f4275a, false, 87451, new Class[]{JSONObject.class, String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, str, obj}, this, f4275a, false, 87451, new Class[]{JSONObject.class, String.class, Object.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str) && obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception unused) {
            }
        }
    }

    public final synchronized boolean g() {
        return this.P;
    }

    private synchronized boolean B() {
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87423, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87423, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!this.q) {
            H();
            this.q = true;
        }
        return this.I;
    }

    private synchronized int C() {
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87424, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87424, new Class[0], Integer.TYPE)).intValue();
        }
        if (!this.q) {
            H();
            this.q = true;
        }
        return this.J;
    }

    private synchronized long D() {
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87425, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87425, new Class[0], Long.TYPE)).longValue();
        }
        if (!this.q) {
            H();
            this.q = true;
        }
        return this.K;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87414, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87414, new Class[0], Void.TYPE);
            return;
        }
        this.k.sendEmptyMessage(11);
    }

    public final synchronized int d() {
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87417, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87417, new Class[0], Integer.TYPE)).intValue();
        }
        if (!this.q) {
            H();
            this.q = true;
        }
        return this.t;
    }

    public final synchronized String f() {
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87419, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87419, new Class[0], String.class);
        }
        if (!this.q) {
            H();
            this.q = true;
        }
        return this.x;
    }

    public final synchronized boolean i() {
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87426, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87426, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!this.q) {
            H();
            this.q = true;
        }
        return this.B;
    }

    public final synchronized String j() {
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87427, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87427, new Class[0], String.class);
        }
        if (!this.q) {
            H();
            this.q = true;
        }
        return this.z;
    }

    public final synchronized String k() {
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87428, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87428, new Class[0], String.class);
        }
        if (!this.q) {
            H();
            this.q = true;
        }
        return this.A;
    }

    public final synchronized boolean n() {
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87432, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87432, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!this.q) {
            H();
            this.q = true;
        }
        return this.D;
    }

    public final synchronized String o() {
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87433, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87433, new Class[0], String.class);
        }
        if (!this.q) {
            H();
            this.q = true;
        }
        return this.E;
    }

    public final void u() {
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87447, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87447, new Class[0], Void.TYPE);
            return;
        }
        if (this.X != null) {
            this.X.a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean A() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0048 }
            com.meituan.robust.ChangeQuickRedirect r3 = f4275a     // Catch:{ all -> 0x0048 }
            r4 = 0
            r5 = 87420(0x1557c, float:1.22502E-40)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x0048 }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0048 }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x002e
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0048 }
            com.meituan.robust.ChangeQuickRedirect r4 = f4275a     // Catch:{ all -> 0x0048 }
            r5 = 0
            r6 = 87420(0x1557c, float:1.22502E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x0048 }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0048 }
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0048 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0048 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0048 }
            monitor-exit(r9)
            return r0
        L_0x002e:
            boolean r1 = r9.q     // Catch:{ all -> 0x0048 }
            r2 = 1
            if (r1 != 0) goto L_0x0038
            r9.H()     // Catch:{ all -> 0x0048 }
            r9.q = r2     // Catch:{ all -> 0x0048 }
        L_0x0038:
            int r1 = r9.t     // Catch:{ all -> 0x0048 }
            int r3 = r9.u     // Catch:{ all -> 0x0048 }
            if (r1 > r3) goto L_0x0046
            int r1 = r9.s     // Catch:{ all -> 0x0048 }
            int r3 = r9.t     // Catch:{ all -> 0x0048 }
            if (r1 >= r3) goto L_0x0046
            monitor-exit(r9)
            return r2
        L_0x0046:
            monitor-exit(r9)
            return r0
        L_0x0048:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.update.m.A():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void E() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x004b }
            com.meituan.robust.ChangeQuickRedirect r3 = f4275a     // Catch:{ all -> 0x004b }
            r4 = 0
            r5 = 87438(0x1558e, float:1.22527E-40)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x004b }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x004b }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x0027
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x004b }
            com.meituan.robust.ChangeQuickRedirect r4 = f4275a     // Catch:{ all -> 0x004b }
            r5 = 0
            r6 = 87438(0x1558e, float:1.22527E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x004b }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x004b }
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x004b }
            monitor-exit(r9)
            return
        L_0x0027:
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x0049 }
            java.lang.String r1 = r9.n     // Catch:{ Throwable -> 0x0049 }
            r0.<init>(r1)     // Catch:{ Throwable -> 0x0049 }
            boolean r1 = r0.exists()     // Catch:{ Throwable -> 0x0049 }
            if (r1 == 0) goto L_0x0037
            r0.delete()     // Catch:{ Throwable -> 0x0049 }
        L_0x0037:
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x0049 }
            java.lang.String r1 = r9.m     // Catch:{ Throwable -> 0x0049 }
            r0.<init>(r1)     // Catch:{ Throwable -> 0x0049 }
            boolean r1 = r0.exists()     // Catch:{ Throwable -> 0x0049 }
            if (r1 == 0) goto L_0x0047
            r0.delete()     // Catch:{ Throwable -> 0x0049 }
        L_0x0047:
            monitor-exit(r9)
            return
        L_0x0049:
            monitor-exit(r9)
            return
        L_0x004b:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.update.m.E():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void F() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x004b }
            com.meituan.robust.ChangeQuickRedirect r3 = f4275a     // Catch:{ all -> 0x004b }
            r4 = 0
            r5 = 87439(0x1558f, float:1.22528E-40)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x004b }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x004b }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x0027
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x004b }
            com.meituan.robust.ChangeQuickRedirect r4 = f4275a     // Catch:{ all -> 0x004b }
            r5 = 0
            r6 = 87439(0x1558f, float:1.22528E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x004b }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x004b }
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x004b }
            monitor-exit(r9)
            return
        L_0x0027:
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x0049 }
            java.lang.String r1 = r9.p     // Catch:{ Throwable -> 0x0049 }
            r0.<init>(r1)     // Catch:{ Throwable -> 0x0049 }
            boolean r1 = r0.exists()     // Catch:{ Throwable -> 0x0049 }
            if (r1 == 0) goto L_0x0037
            r0.delete()     // Catch:{ Throwable -> 0x0049 }
        L_0x0037:
            java.io.File r0 = new java.io.File     // Catch:{ Throwable -> 0x0049 }
            java.lang.String r1 = r9.o     // Catch:{ Throwable -> 0x0049 }
            r0.<init>(r1)     // Catch:{ Throwable -> 0x0049 }
            boolean r1 = r0.exists()     // Catch:{ Throwable -> 0x0049 }
            if (r1 == 0) goto L_0x0047
            r0.delete()     // Catch:{ Throwable -> 0x0049 }
        L_0x0047:
            monitor-exit(r9)
            return
        L_0x0049:
            monitor-exit(r9)
            return
        L_0x004b:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.update.m.F():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        r9.W = new com.ss.android.ugc.aweme.update.m.c(r9, true);
        r9.W.start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void G() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f4275a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 87450(0x1559a, float:1.22544E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f4275a
            r5 = 0
            r6 = 87450(0x1559a, float:1.22544E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            monitor-enter(r9)
            boolean r0 = r9.q     // Catch:{ all -> 0x0065 }
            r1 = 1
            if (r0 != 0) goto L_0x0030
            r9.H()     // Catch:{ all -> 0x0065 }
            r9.q = r1     // Catch:{ all -> 0x0065 }
        L_0x0030:
            boolean r0 = r9.U     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0036
            monitor-exit(r9)     // Catch:{ all -> 0x0065 }
            return
        L_0x0036:
            com.ss.android.ugc.aweme.update.a r0 = r9.V     // Catch:{ all -> 0x0065 }
            r2 = 0
            r0.f75201a = r2     // Catch:{ all -> 0x0065 }
            com.ss.android.ugc.aweme.update.a r0 = r9.V     // Catch:{ all -> 0x0065 }
            r0.f75202b = r2     // Catch:{ all -> 0x0065 }
            r9.U = r1     // Catch:{ all -> 0x0065 }
            r9.F()     // Catch:{ all -> 0x0065 }
            int r0 = r9.N     // Catch:{ all -> 0x0065 }
            int r2 = r9.u     // Catch:{ all -> 0x0065 }
            if (r0 == r2) goto L_0x0057
            int r0 = r9.u     // Catch:{ all -> 0x0065 }
            r9.N = r0     // Catch:{ all -> 0x0065 }
            int r0 = r9.N     // Catch:{ all -> 0x0065 }
            r2 = -1
            java.lang.String r3 = ""
            r9.a(r0, r2, r3, r1)     // Catch:{ all -> 0x0065 }
        L_0x0057:
            monitor-exit(r9)     // Catch:{ all -> 0x0065 }
            com.ss.android.ugc.aweme.update.m$c r0 = new com.ss.android.ugc.aweme.update.m$c
            r0.<init>(r1)
            r9.W = r0
            com.ss.android.ugc.aweme.update.m$c r0 = r9.W
            r0.start()
            return
        L_0x0065:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0065 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.update.m.G():void");
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87415, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87415, new Class[0], Void.TYPE);
            return;
        }
        this.k.sendEmptyMessage(10);
    }

    public final synchronized String e() {
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87418, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87418, new Class[0], String.class);
        }
        if (!this.q) {
            H();
            this.q = true;
        }
        if (!TextUtils.isEmpty(this.w)) {
            return this.w;
        }
        return this.v;
    }

    public final synchronized boolean h() {
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87421, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87421, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!this.q) {
            H();
            this.q = true;
        }
        if (this.s < this.u) {
            return true;
        }
        return false;
    }

    public final synchronized int l() {
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87429, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87429, new Class[0], Integer.TYPE)).intValue();
        }
        if (!this.q) {
            H();
            this.q = true;
        }
        return Math.min(Math.max(this.L, 0), 60);
    }

    public final void s() {
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87443, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87443, new Class[0], Void.TYPE);
            return;
        }
        synchronized (this) {
            if (!this.q) {
                H();
                this.q = true;
            }
            if (!this.P) {
                i.a((Callable<TResult>) new n<TResult>(this), (Executor) com.ss.android.ugc.aweme.thread.h.c());
            }
        }
    }

    public final void t() {
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87445, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87445, new Class[0], Void.TYPE);
            return;
        }
        if (this.X == null) {
            this.X = new a(this, new CountDownLatch(2), (byte) 0);
            new ThreadPlus(this.X, "DownloadCountDownLatchThread", true).start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        r9.R = new com.ss.android.ugc.aweme.update.m.c(r9, false);
        r9.R.start();
        r9.S = new com.ss.android.ugc.aweme.update.m.e(r9);
        r9.S.start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0070, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f4275a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 87449(0x15599, float:1.22542E-40)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f4275a
            r5 = 0
            r6 = 87449(0x15599, float:1.22542E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            monitor-enter(r9)
            boolean r1 = r9.q     // Catch:{ all -> 0x0071 }
            r2 = 1
            if (r1 != 0) goto L_0x0030
            r9.H()     // Catch:{ all -> 0x0071 }
            r9.q = r2     // Catch:{ all -> 0x0071 }
        L_0x0030:
            boolean r1 = r9.P     // Catch:{ all -> 0x0071 }
            if (r1 == 0) goto L_0x0036
            monitor-exit(r9)     // Catch:{ all -> 0x0071 }
            return
        L_0x0036:
            com.ss.android.ugc.aweme.update.a r1 = r9.Q     // Catch:{ all -> 0x0071 }
            r3 = 0
            r1.f75201a = r3     // Catch:{ all -> 0x0071 }
            com.ss.android.ugc.aweme.update.a r1 = r9.Q     // Catch:{ all -> 0x0071 }
            r1.f75202b = r3     // Catch:{ all -> 0x0071 }
            r9.P = r2     // Catch:{ all -> 0x0071 }
            r9.E()     // Catch:{ all -> 0x0071 }
            int r1 = r9.N     // Catch:{ all -> 0x0071 }
            int r2 = r9.u     // Catch:{ all -> 0x0071 }
            if (r1 == r2) goto L_0x0057
            int r1 = r9.u     // Catch:{ all -> 0x0071 }
            r9.N = r1     // Catch:{ all -> 0x0071 }
            int r1 = r9.N     // Catch:{ all -> 0x0071 }
            r2 = -1
            java.lang.String r3 = ""
            r9.a(r1, r2, r3, r0)     // Catch:{ all -> 0x0071 }
        L_0x0057:
            monitor-exit(r9)     // Catch:{ all -> 0x0071 }
            com.ss.android.ugc.aweme.update.m$c r1 = new com.ss.android.ugc.aweme.update.m$c
            r1.<init>(r0)
            r9.R = r1
            com.ss.android.ugc.aweme.update.m$c r0 = r9.R
            r0.start()
            com.ss.android.ugc.aweme.update.m$e r0 = new com.ss.android.ugc.aweme.update.m$e
            r0.<init>()
            r9.S = r0
            com.ss.android.ugc.aweme.update.m$e r0 = r9.S
            r0.start()
            return
        L_0x0071:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0071 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.update.m.v():void");
    }

    public final boolean x() {
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87464, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87464, new Class[0], Boolean.TYPE)).booleanValue();
        }
        String channel = this.h.getChannel();
        for (String equalsIgnoreCase : k.f75234a) {
            if (equalsIgnoreCase.equalsIgnoreCase(channel)) {
                return false;
            }
        }
        if (this.aa == 1) {
            return true;
        }
        return false;
    }

    public final j y() {
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87469, new Class[0], j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87469, new Class[0], j.class);
        } else if (this.aa == -1 || this.aa == 0) {
            return j.f75233b;
        } else {
            if (this.aa == 2) {
                try {
                    return (j) Class.forName("MMUpdateChecker").newInstance();
                } catch (Throwable unused) {
                }
            }
            return new g();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object z() throws Exception {
        try {
            if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87444, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87444, new Class[0], Void.TYPE);
            } else {
                com.ss.android.ugc.aweme.framework.a.a.a(6, "EvilsoulM", "doUpdate start");
                if (r()) {
                    this.k.sendEmptyMessage(6);
                } else {
                    this.k.sendEmptyMessage(7);
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final synchronized boolean m() {
        boolean z2;
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87430, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87430, new Class[0], Boolean.TYPE)).booleanValue();
        }
        boolean z3 = true;
        if (!this.q) {
            H();
            this.q = true;
        }
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87431, new Class[0], Boolean.TYPE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87431, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            com.ss.android.download.api.c.e a2 = h.a(this.i).f29059c.a(this.H);
            if (a2 != null && !StringUtils.isEmpty(a2.f28495e)) {
                File file = new File(a2.f28495e);
                if (a2.f28492b == 8 && file.exists()) {
                    if (!StringUtils.isEmpty(this.G) || !ToolUtils.isInstalledApp(this.i, this.G)) {
                        z2 = z3;
                    } else {
                        z2 = false;
                    }
                }
            }
            z3 = false;
            if (!StringUtils.isEmpty(this.G)) {
            }
            z2 = z3;
        }
        if (z2) {
            return false;
        }
        return this.C;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008a, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean p() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x008b }
            com.meituan.robust.ChangeQuickRedirect r3 = f4275a     // Catch:{ all -> 0x008b }
            r4 = 0
            r5 = 87436(0x1558c, float:1.22524E-40)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x008b }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x008b }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x008b }
            if (r1 == 0) goto L_0x002e
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x008b }
            com.meituan.robust.ChangeQuickRedirect r4 = f4275a     // Catch:{ all -> 0x008b }
            r5 = 0
            r6 = 87436(0x1558c, float:1.22524E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x008b }
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x008b }
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x008b }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x008b }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x008b }
            monitor-exit(r9)
            return r0
        L_0x002e:
            boolean r1 = r9.q     // Catch:{ all -> 0x008b }
            r2 = 1
            if (r1 != 0) goto L_0x0038
            r9.H()     // Catch:{ all -> 0x008b }
            r9.q = r2     // Catch:{ all -> 0x008b }
        L_0x0038:
            int r1 = r9.N     // Catch:{ all -> 0x008b }
            int r3 = r9.u     // Catch:{ all -> 0x008b }
            if (r1 == r3) goto L_0x0040
            monitor-exit(r9)
            return r0
        L_0x0040:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x008b }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x008b }
            java.lang.String r5 = r9.m     // Catch:{ all -> 0x008b }
            r1.<init>(r5)     // Catch:{ all -> 0x008b }
            boolean r5 = r1.exists()     // Catch:{ all -> 0x008b }
            if (r5 == 0) goto L_0x0067
            boolean r5 = r1.isFile()     // Catch:{ all -> 0x008b }
            if (r5 == 0) goto L_0x0067
            long r5 = r1.lastModified()     // Catch:{ all -> 0x008b }
            r1 = 0
            long r5 = r3 - r5
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0067
            monitor-exit(r9)
            return r0
        L_0x0067:
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x008b }
            java.lang.String r5 = r9.o     // Catch:{ all -> 0x008b }
            r1.<init>(r5)     // Catch:{ all -> 0x008b }
            boolean r5 = r1.exists()     // Catch:{ all -> 0x008b }
            if (r5 == 0) goto L_0x0089
            boolean r5 = r1.isFile()     // Catch:{ all -> 0x008b }
            if (r5 == 0) goto L_0x0089
            long r5 = r1.lastModified()     // Catch:{ all -> 0x008b }
            r1 = 0
            long r3 = r3 - r5
            r5 = 604800000(0x240c8400, double:2.988109026E-315)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x0089
            monitor-exit(r9)
            return r2
        L_0x0089:
            monitor-exit(r9)
            return r0
        L_0x008b:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.update.m.p():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0087, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006c A[Catch:{ Throwable -> 0x0088 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.io.File q() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x008a }
            com.meituan.robust.ChangeQuickRedirect r3 = f4275a     // Catch:{ all -> 0x008a }
            r4 = 0
            r5 = 87437(0x1558d, float:1.22525E-40)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x008a }
            java.lang.Class<java.io.File> r7 = java.io.File.class
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x008a }
            if (r1 == 0) goto L_0x002a
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x008a }
            com.meituan.robust.ChangeQuickRedirect r4 = f4275a     // Catch:{ all -> 0x008a }
            r5 = 0
            r6 = 87437(0x1558d, float:1.22525E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x008a }
            java.lang.Class<java.io.File> r8 = java.io.File.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x008a }
            java.io.File r0 = (java.io.File) r0     // Catch:{ all -> 0x008a }
            monitor-exit(r9)
            return r0
        L_0x002a:
            boolean r0 = r9.q     // Catch:{ all -> 0x008a }
            if (r0 != 0) goto L_0x0034
            r9.H()     // Catch:{ all -> 0x008a }
            r0 = 1
            r9.q = r0     // Catch:{ all -> 0x008a }
        L_0x0034:
            r0 = 0
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0088 }
            java.io.File r3 = new java.io.File     // Catch:{ Throwable -> 0x0088 }
            java.lang.String r4 = r9.m     // Catch:{ Throwable -> 0x0088 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0088 }
            boolean r4 = r3.exists()     // Catch:{ Throwable -> 0x0088 }
            if (r4 == 0) goto L_0x005e
            int r4 = r9.N     // Catch:{ Throwable -> 0x0088 }
            int r5 = r9.u     // Catch:{ Throwable -> 0x0088 }
            if (r4 != r5) goto L_0x005b
            long r4 = r3.lastModified()     // Catch:{ Throwable -> 0x0088 }
            r6 = 0
            long r4 = r1 - r4
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x005b
            goto L_0x005f
        L_0x005b:
            r3.delete()     // Catch:{ Throwable -> 0x0088 }
        L_0x005e:
            r3 = r0
        L_0x005f:
            java.io.File r4 = new java.io.File     // Catch:{ Throwable -> 0x0088 }
            java.lang.String r5 = r9.o     // Catch:{ Throwable -> 0x0088 }
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0088 }
            boolean r5 = r4.exists()     // Catch:{ Throwable -> 0x0088 }
            if (r5 == 0) goto L_0x0086
            int r5 = r9.N     // Catch:{ Throwable -> 0x0088 }
            int r6 = r9.u     // Catch:{ Throwable -> 0x0088 }
            if (r5 != r6) goto L_0x0083
            long r5 = r4.lastModified()     // Catch:{ Throwable -> 0x0088 }
            r7 = 0
            long r1 = r1 - r5
            r5 = 604800000(0x240c8400, double:2.988109026E-315)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x0083
            if (r3 != 0) goto L_0x0086
            r3 = r4
            goto L_0x0086
        L_0x0083:
            r4.delete()     // Catch:{ Throwable -> 0x0088 }
        L_0x0086:
            monitor-exit(r9)
            return r3
        L_0x0088:
            monitor-exit(r9)
            return r0
        L_0x008a:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.update.m.q():java.io.File");
    }

    public final void w() {
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87460, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87460, new Class[0], Void.TYPE);
            return;
        }
        File file = new File(this.m);
        if (file.exists() && file.isFile()) {
            String stringAppName = this.h.getStringAppName();
            String format = String.format(this.i.getString(C0906R.string.cbw), new Object[]{stringAppName, e()});
            String format2 = String.format(this.i.getString(C0906R.string.cbv), new Object[]{e()});
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(1);
            intent.setDataAndType(p.a(this.i, file), "application/vnd.android.package-archive");
            PendingIntent activity = PendingIntent.getActivity(this.i, 0, intent, 0);
            NotificationCompat.Builder builder = new NotificationCompat.Builder(this.i, "update_notification");
            builder.setSmallIcon(2130840575);
            builder.setTicker(format);
            builder.setWhen(System.currentTimeMillis());
            builder.setContentTitle(stringAppName).setContentText(format2);
            builder.setContentIntent(activity);
            builder.setAutoCancel(true);
            this.g.notify(C0906R.id.cu5, builder.build());
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.addFlags(1);
                intent2.setDataAndType(p.a(this.i, file), "application/vnd.android.package-archive");
                intent2.addFlags(268435456);
                this.i.startActivity(intent2);
            } catch (Exception unused) {
            }
        }
    }

    private void H() {
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87457, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87457, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.s = this.h.getUpdateVersionCode();
        }
        if (this.s <= 0) {
            this.s = 1;
        }
        SharedPreferences a2 = com.ss.android.ugc.aweme.q.c.a(this.i, "update_info", 0);
        this.t = a2.getInt("tip_version_code", 0);
        this.u = a2.getInt("real_version_code", 0);
        this.v = a2.getString("tip_version_name", "");
        this.w = a2.getString("real_version_name", "");
        this.x = a2.getString("whats_new", "");
        this.y = a2.getLong("last_check_time", 0);
        this.A = a2.getString(PushConstants.TITLE, "");
        this.r = a2.getString("download_url", "");
        this.B = a2.getBoolean("force_update", false);
        this.z = a2.getString("already_download_tips", "");
        this.I = a2.getBoolean("pre_download", false);
        this.J = a2.getInt("interval_since_notify_update", 2);
        this.K = a2.getLong("pre_download_max_wait_seconds", -1);
        this.L = a2.getInt("latency", 0);
        this.M = a2.getString("download_etag", "");
        this.N = a2.getInt("download_version", 0);
        this.O = a2.getInt("download_size", -1);
        this.T = a2.getInt("pre_download_size", -1);
        this.C = a2.getBoolean("bind_download_data", false);
        this.D = a2.getBoolean("hint_checked", false);
        this.E = a2.getString("hint_text", "");
        this.F = a2.getString("name", "");
        this.G = a2.getString("package", "");
        this.H = a2.getString("download_url", "");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0356, code lost:
        r0 = th;
     */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x021d A[SYNTHETIC, Splitter:B:113:0x021d] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0371 A[Catch:{ all -> 0x0395 }] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x037b A[Catch:{ all -> 0x0395 }] */
    @com.ss.android.ugc.thermometer.annotation.MeasureFunction
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean r() {
        /*
            r31 = this;
            r8 = r31
            r9 = 0
            java.lang.Object[] r1 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r3 = f4275a
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 87442(0x15592, float:1.22532E-40)
            r2 = r31
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r1 = new java.lang.Object[r9]
            com.meituan.robust.ChangeQuickRedirect r3 = f4275a
            r4 = 0
            r5 = 87442(0x15592, float:1.22532E-40)
            java.lang.Class[] r6 = new java.lang.Class[r9]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r31
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0030:
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            com.ss.android.ugc.aweme.update.d r0 = com.ss.android.ugc.aweme.update.d.a()     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            boolean r0 = r0.f75212b     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            r10 = 6
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "EvilsoulM"
            java.lang.String r1 = "inHouse update check version"
            com.ss.android.ugc.aweme.framework.a.a.a(r10, r0, r1)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            java.lang.String r0 = "https://aweme-beta.bytedance.net/beta_check/v1"
            java.lang.String r0 = r8.b((java.lang.String) r0)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            goto L_0x0059
        L_0x004c:
            java.lang.String r0 = "EvilsoulM"
            java.lang.String r1 = "origin update check version"
            com.ss.android.ugc.aweme.framework.a.a.a(r10, r0, r1)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            java.lang.String r0 = "https://aweme.snssdk.com/check_version/v6/"
            java.lang.String r0 = r8.b((java.lang.String) r0)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
        L_0x0059:
            java.lang.String r1 = "request"
            r8.a((org.json.JSONObject) r7, (java.lang.String) r1, (java.lang.Object) r0)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            r1 = 8192(0x2000, float:1.14794E-41)
            java.lang.String r0 = com.ss.android.common.util.NetworkUtils.executeGet(r1, r0)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            if (r1 == 0) goto L_0x007a
            android.content.Context r10 = r8.i
            java.lang.String r11 = "app_update"
            java.lang.String r12 = "check"
            r13 = 0
            r15 = 0
            r17 = r7
            com.ss.android.common.lib.a.a(r10, r11, r12, r13, r15, r17)
            return r9
        L_0x007a:
            java.lang.String r1 = "EvilsoulM"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            java.lang.String r3 = "responseStr is "
            r2.<init>(r3)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            r2.append(r0)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            com.ss.android.ugc.aweme.framework.a.a.a(r10, r1, r2)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            java.lang.String r1 = "response"
            r8.a((org.json.JSONObject) r7, (java.lang.String) r1, (java.lang.Object) r0)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            r1.<init>(r0)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            java.lang.String r0 = "success"
            java.lang.String r2 = "message"
            java.lang.String r2 = r1.getString(r2)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            boolean r0 = android.text.TextUtils.equals(r0, r2)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            if (r0 != 0) goto L_0x00b5
            android.content.Context r10 = r8.i
            java.lang.String r11 = "app_update"
            java.lang.String r12 = "check"
            r13 = 0
            r15 = 0
            r17 = r7
            com.ss.android.common.lib.a.a(r10, r11, r12, r13, r15, r17)
            return r9
        L_0x00b5:
            java.lang.String r0 = "data"
            org.json.JSONObject r0 = r1.getJSONObject(r0)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            java.lang.String r1 = "tip_version_code"
            r2 = -1
            int r1 = r0.optInt(r1, r2)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            r14 = 1
            if (r1 > 0) goto L_0x0127
            monitor-enter(r31)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            boolean r0 = r8.q     // Catch:{ all -> 0x0124 }
            if (r0 != 0) goto L_0x00cf
            r31.H()     // Catch:{ all -> 0x0124 }
            r8.q = r14     // Catch:{ all -> 0x0124 }
        L_0x00cf:
            monitor-exit(r31)     // Catch:{ all -> 0x0124 }
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            com.meituan.robust.ChangeQuickRedirect r3 = f4275a     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            r4 = 0
            r5 = 87440(0x15590, float:1.2253E-40)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            r2 = r31
            r15 = r7
            r7 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x0120, all -> 0x011c }
            if (r0 == 0) goto L_0x00ff
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x0120, all -> 0x011c }
            com.meituan.robust.ChangeQuickRedirect r3 = f4275a     // Catch:{ Throwable -> 0x0120, all -> 0x011c }
            r4 = 0
            r5 = 87440(0x15590, float:1.2253E-40)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ Throwable -> 0x0120, all -> 0x011c }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ Throwable -> 0x0120, all -> 0x011c }
            r2 = r31
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Throwable -> 0x0120, all -> 0x011c }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ Throwable -> 0x0120, all -> 0x011c }
            boolean r0 = r0.booleanValue()     // Catch:{ Throwable -> 0x0120, all -> 0x011c }
            goto L_0x010a
        L_0x00ff:
            java.lang.String r0 = r8.r     // Catch:{ Throwable -> 0x0120, all -> 0x011c }
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x0120, all -> 0x011c }
            if (r0 != 0) goto L_0x0109
            r0 = 1
            goto L_0x010a
        L_0x0109:
            r0 = 0
        L_0x010a:
            android.content.Context r9 = r8.i
            java.lang.String r10 = "app_update"
            java.lang.String r11 = "check"
            r12 = 0
            r1 = 0
            r7 = r15
            r14 = r1
            r16 = r7
            com.ss.android.common.lib.a.a(r9, r10, r11, r12, r14, r16)
            return r0
        L_0x011c:
            r0 = move-exception
            r2 = r15
            goto L_0x0396
        L_0x0120:
            r0 = move-exception
            r2 = r15
            goto L_0x0367
        L_0x0124:
            r0 = move-exception
            monitor-exit(r31)     // Catch:{ all -> 0x0124 }
            throw r0     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
        L_0x0127:
            java.lang.String r2 = "tip_version_name"
            java.lang.String r2 = r0.optString(r2)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            java.lang.String r3 = "real_version_name"
            java.lang.String r3 = r0.optString(r3)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            java.lang.String r4 = "real_version_code"
            int r4 = r0.optInt(r4)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            java.lang.String r5 = "download_url"
            java.lang.String r5 = r0.getString(r5)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            java.lang.String r6 = "whats_new"
            java.lang.String r11 = ""
            java.lang.String r6 = r0.optString(r6, r11)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            java.lang.String r11 = "title"
            java.lang.String r12 = ""
            java.lang.String r11 = r0.optString(r11, r12)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            java.lang.String r12 = "force_update"
            int r12 = r0.optInt(r12, r9)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            if (r12 != r14) goto L_0x0159
            r12 = 1
            goto L_0x015a
        L_0x0159:
            r12 = 0
        L_0x015a:
            java.lang.String r13 = "already_download_tips"
            java.lang.String r15 = ""
            java.lang.String r13 = r0.optString(r13, r15)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            java.lang.String r15 = "pre_download"
            int r15 = r0.optInt(r15, r9)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            if (r15 != r14) goto L_0x016c
            r15 = 1
            goto L_0x016d
        L_0x016c:
            r15 = 0
        L_0x016d:
            java.lang.String r10 = "interval_since_notify_update"
            r14 = 2
            int r10 = r0.optInt(r10, r14)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            java.lang.String r14 = "pre_download_max_wait_seconds"
            r18 = r10
            r9 = -1
            long r9 = r0.optLong(r14, r9)     // Catch:{ Throwable -> 0x0365, all -> 0x0362 }
            java.lang.String r14 = "latency"
            r19 = r7
            r7 = 0
            int r14 = r0.optInt(r14, r7)     // Catch:{ Throwable -> 0x035e, all -> 0x035a }
            java.lang.String r7 = ""
            java.lang.String r16 = ""
            java.lang.String r17 = ""
            java.lang.String r20 = ""
            r21 = r7
            java.lang.String r7 = "bind_download_data"
            boolean r7 = r0.has(r7)     // Catch:{ Exception -> 0x0208 }
            r22 = r7
            java.lang.String r7 = "bind_download_data"
            org.json.JSONObject r0 = r0.optJSONObject(r7)     // Catch:{ Exception -> 0x0203 }
            if (r0 == 0) goto L_0x01f4
            java.lang.String r7 = "hint_checked"
            r23 = r14
            r14 = 1
            int r7 = r0.optInt(r7, r14)     // Catch:{ Exception -> 0x0205 }
            if (r7 != r14) goto L_0x01ae
            r14 = 1
            goto L_0x01af
        L_0x01ae:
            r14 = 0
        L_0x01af:
            java.lang.String r7 = "hint_text"
            r24 = r14
            java.lang.String r14 = ""
            java.lang.String r7 = r0.optString(r7, r14)     // Catch:{ Exception -> 0x01f1 }
            java.lang.String r14 = "name"
            r25 = r7
            java.lang.String r7 = ""
            java.lang.String r7 = r0.optString(r14, r7)     // Catch:{ Exception -> 0x01ea }
            java.lang.String r14 = "package"
            r26 = r7
            java.lang.String r7 = ""
            java.lang.String r7 = r0.optString(r14, r7)     // Catch:{ Exception -> 0x01e1 }
            java.lang.String r14 = "download_url"
            java.lang.String r0 = r0.optString(r14)     // Catch:{ Exception -> 0x01dc }
            r20 = r0
            r17 = r7
            r21 = r25
            r16 = r26
            goto L_0x01f8
        L_0x01dc:
            r17 = r7
            goto L_0x01e1
        L_0x01df:
            r26 = r7
        L_0x01e1:
            r7 = r22
            r21 = r25
            r16 = r26
            goto L_0x020d
        L_0x01e8:
            r25 = r7
        L_0x01ea:
            r7 = r22
            r21 = r25
            goto L_0x020d
        L_0x01ef:
            r24 = r14
        L_0x01f1:
            r7 = r22
            goto L_0x020d
        L_0x01f4:
            r23 = r14
            r24 = 1
        L_0x01f8:
            r27 = r16
            r28 = r17
            r29 = r20
            r30 = r21
            r7 = r22
            goto L_0x0215
        L_0x0203:
            r23 = r14
        L_0x0205:
            r7 = r22
            goto L_0x020b
        L_0x0208:
            r23 = r14
            r7 = 0
        L_0x020b:
            r24 = 1
        L_0x020d:
            r27 = r16
            r28 = r17
            r29 = r20
            r30 = r21
        L_0x0215:
            r0 = r24
            java.net.URL r14 = new java.net.URL     // Catch:{ Throwable -> 0x035e, all -> 0x035a }
            r14.<init>(r5)     // Catch:{ Throwable -> 0x035e, all -> 0x035a }
            monitor-enter(r31)     // Catch:{ Throwable -> 0x035e, all -> 0x035a }
            boolean r14 = r8.q     // Catch:{ all -> 0x0351 }
            if (r14 != 0) goto L_0x0228
            r31.H()     // Catch:{ all -> 0x0351 }
            r14 = 1
            r8.q = r14     // Catch:{ all -> 0x0351 }
            goto L_0x0229
        L_0x0228:
            r14 = 1
        L_0x0229:
            r8.t = r1     // Catch:{ all -> 0x0351 }
            r8.u = r4     // Catch:{ all -> 0x0351 }
            r8.v = r2     // Catch:{ all -> 0x0351 }
            r8.w = r3     // Catch:{ all -> 0x0351 }
            r8.r = r5     // Catch:{ all -> 0x0351 }
            r8.x = r6     // Catch:{ all -> 0x0351 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0351 }
            r8.y = r1     // Catch:{ all -> 0x0351 }
            r8.A = r11     // Catch:{ all -> 0x0351 }
            r8.B = r12     // Catch:{ all -> 0x0351 }
            r8.z = r13     // Catch:{ all -> 0x0351 }
            r8.I = r15     // Catch:{ all -> 0x0351 }
            r1 = r18
            r8.J = r1     // Catch:{ all -> 0x0351 }
            r8.K = r9     // Catch:{ all -> 0x0351 }
            r1 = r23
            r8.L = r1     // Catch:{ all -> 0x0351 }
            r8.C = r7     // Catch:{ all -> 0x0351 }
            r8.D = r0     // Catch:{ all -> 0x0351 }
            r0 = r30
            r8.E = r0     // Catch:{ all -> 0x0351 }
            r0 = r27
            r8.F = r0     // Catch:{ all -> 0x0351 }
            r0 = r28
            r8.G = r0     // Catch:{ all -> 0x0351 }
            r0 = r29
            r8.H = r0     // Catch:{ all -> 0x0351 }
            java.lang.String r0 = "EvilsoulM"
            java.lang.String r1 = "before saveData"
            r2 = 6
            com.ss.android.ugc.aweme.framework.a.a.a(r2, r0, r1)     // Catch:{ all -> 0x0351 }
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x0351 }
            com.meituan.robust.ChangeQuickRedirect r3 = f4275a     // Catch:{ all -> 0x0351 }
            r4 = 0
            r5 = 87454(0x1559e, float:1.22549E-40)
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ all -> 0x0351 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0351 }
            r1 = r0
            r2 = r31
            r15 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x034e }
            if (r0 == 0) goto L_0x0296
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x034e }
            com.meituan.robust.ChangeQuickRedirect r3 = f4275a     // Catch:{ all -> 0x034e }
            r4 = 0
            r5 = 87454(0x1559e, float:1.22549E-40)
            java.lang.Class[] r6 = new java.lang.Class[r1]     // Catch:{ all -> 0x034e }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x034e }
            r1 = r0
            r2 = r31
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x034e }
            goto L_0x0332
        L_0x0296:
            android.content.Context r0 = r8.i     // Catch:{ all -> 0x034e }
            java.lang.String r1 = "update_info"
            r2 = 0
            android.content.SharedPreferences r0 = com.ss.android.ugc.aweme.q.c.a(r0, r1, r2)     // Catch:{ all -> 0x034e }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x034e }
            java.lang.String r1 = "tip_version_code"
            int r2 = r8.t     // Catch:{ all -> 0x034e }
            r0.putInt(r1, r2)     // Catch:{ all -> 0x034e }
            java.lang.String r1 = "real_version_code"
            int r2 = r8.u     // Catch:{ all -> 0x034e }
            r0.putInt(r1, r2)     // Catch:{ all -> 0x034e }
            java.lang.String r1 = "tip_version_name"
            java.lang.String r2 = r8.v     // Catch:{ all -> 0x034e }
            r0.putString(r1, r2)     // Catch:{ all -> 0x034e }
            java.lang.String r1 = "real_version_name"
            java.lang.String r2 = r8.w     // Catch:{ all -> 0x034e }
            r0.putString(r1, r2)     // Catch:{ all -> 0x034e }
            java.lang.String r1 = "title"
            java.lang.String r2 = r8.A     // Catch:{ all -> 0x034e }
            r0.putString(r1, r2)     // Catch:{ all -> 0x034e }
            java.lang.String r1 = "download_url"
            java.lang.String r2 = r8.r     // Catch:{ all -> 0x034e }
            r0.putString(r1, r2)     // Catch:{ all -> 0x034e }
            java.lang.String r1 = "whats_new"
            java.lang.String r2 = r8.x     // Catch:{ all -> 0x034e }
            r0.putString(r1, r2)     // Catch:{ all -> 0x034e }
            java.lang.String r1 = "last_check_time"
            long r2 = r8.y     // Catch:{ all -> 0x034e }
            r0.putLong(r1, r2)     // Catch:{ all -> 0x034e }
            java.lang.String r1 = "force_update"
            boolean r2 = r8.B     // Catch:{ all -> 0x034e }
            r0.putBoolean(r1, r2)     // Catch:{ all -> 0x034e }
            java.lang.String r1 = "already_download_tips"
            java.lang.String r2 = r8.z     // Catch:{ all -> 0x034e }
            r0.putString(r1, r2)     // Catch:{ all -> 0x034e }
            java.lang.String r1 = "pre_download"
            boolean r2 = r8.I     // Catch:{ all -> 0x034e }
            r0.putBoolean(r1, r2)     // Catch:{ all -> 0x034e }
            java.lang.String r1 = "interval_since_notify_update"
            int r2 = r8.J     // Catch:{ all -> 0x034e }
            r0.putInt(r1, r2)     // Catch:{ all -> 0x034e }
            java.lang.String r1 = "pre_download_max_wait_seconds"
            long r2 = r8.K     // Catch:{ all -> 0x034e }
            r0.putLong(r1, r2)     // Catch:{ all -> 0x034e }
            java.lang.String r1 = "latency"
            int r2 = r8.L     // Catch:{ all -> 0x034e }
            r0.putInt(r1, r2)     // Catch:{ all -> 0x034e }
            java.lang.String r1 = "bind_download_data"
            boolean r2 = r8.C     // Catch:{ all -> 0x034e }
            r0.putBoolean(r1, r2)     // Catch:{ all -> 0x034e }
            java.lang.String r1 = "hint_checked"
            boolean r2 = r8.D     // Catch:{ all -> 0x034e }
            r0.putBoolean(r1, r2)     // Catch:{ all -> 0x034e }
            java.lang.String r1 = "hint_text"
            java.lang.String r2 = r8.E     // Catch:{ all -> 0x034e }
            r0.putString(r1, r2)     // Catch:{ all -> 0x034e }
            java.lang.String r1 = "name"
            java.lang.String r2 = r8.F     // Catch:{ all -> 0x034e }
            r0.putString(r1, r2)     // Catch:{ all -> 0x034e }
            java.lang.String r1 = "package"
            java.lang.String r2 = r8.G     // Catch:{ all -> 0x034e }
            r0.putString(r1, r2)     // Catch:{ all -> 0x034e }
            java.lang.String r1 = "download_url"
            java.lang.String r2 = r8.H     // Catch:{ all -> 0x034e }
            r0.putString(r1, r2)     // Catch:{ all -> 0x034e }
            com.bytedance.common.utility.persistent.SharedPrefsEditorCompat.apply(r0)     // Catch:{ all -> 0x034e }
        L_0x0332:
            java.lang.String r0 = "EvilsoulM"
            java.lang.String r1 = "after saveData"
            r2 = 6
            com.ss.android.ugc.aweme.framework.a.a.a(r2, r0, r1)     // Catch:{ all -> 0x034e }
            monitor-exit(r31)     // Catch:{ all -> 0x034e }
            android.content.Context r9 = r8.i
            java.lang.String r10 = "app_update"
            java.lang.String r11 = "check"
            r12 = 0
            r0 = 0
            r2 = r15
            r3 = 1
            r14 = r0
            r16 = r2
            com.ss.android.common.lib.a.a(r9, r10, r11, r12, r14, r16)
            return r3
        L_0x034e:
            r0 = move-exception
            r2 = r15
            goto L_0x0354
        L_0x0351:
            r0 = move-exception
            r2 = r19
        L_0x0354:
            monitor-exit(r31)     // Catch:{ all -> 0x0358 }
            throw r0     // Catch:{ Throwable -> 0x0356 }
        L_0x0356:
            r0 = move-exception
            goto L_0x0367
        L_0x0358:
            r0 = move-exception
            goto L_0x0354
        L_0x035a:
            r0 = move-exception
            r2 = r19
            goto L_0x0396
        L_0x035e:
            r0 = move-exception
            r2 = r19
            goto L_0x0367
        L_0x0362:
            r0 = move-exception
            r2 = r7
            goto L_0x0396
        L_0x0365:
            r0 = move-exception
            r2 = r7
        L_0x0367:
            android.content.Context r1 = r8.i     // Catch:{ all -> 0x0395 }
            int r1 = com.ss.android.ugc.aweme.utils.p.a((android.content.Context) r1, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0395 }
            r3 = 18
            if (r3 == r1) goto L_0x037b
            java.lang.String r0 = "errorCode"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0395 }
            r8.a((org.json.JSONObject) r2, (java.lang.String) r0, (java.lang.Object) r1)     // Catch:{ all -> 0x0395 }
            goto L_0x0384
        L_0x037b:
            java.lang.String r1 = "errorMsg"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0395 }
            r8.a((org.json.JSONObject) r2, (java.lang.String) r1, (java.lang.Object) r0)     // Catch:{ all -> 0x0395 }
        L_0x0384:
            android.content.Context r10 = r8.i
            java.lang.String r11 = "app_update"
            java.lang.String r12 = "check"
            r13 = 0
            r15 = 0
            r17 = r2
            com.ss.android.common.lib.a.a(r10, r11, r12, r13, r15, r17)
            r1 = 0
            return r1
        L_0x0395:
            r0 = move-exception
        L_0x0396:
            android.content.Context r9 = r8.i
            r12 = 0
            r14 = 0
            java.lang.String r10 = "app_update"
            java.lang.String r11 = "check"
            r16 = r2
            com.ss.android.common.lib.a.a(r9, r10, r11, r12, r14, r16)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.update.m.r():boolean");
    }

    public final void a(a aVar) {
        synchronized (this.Q) {
            aVar.f75201a = this.Q.f75201a;
            aVar.f75202b = this.Q.f75202b;
        }
    }

    private SharedPreferences c(Context context) {
        Context context2 = context;
        if (!PatchProxy.isSupport(new Object[]{context2}, this, f4275a, false, 87466, new Class[]{Context.class}, SharedPreferences.class)) {
            return com.ss.android.ugc.aweme.q.c.a(context2, "app_setting", 0);
        }
        return (SharedPreferences) PatchProxy.accessDispatch(new Object[]{context2}, this, f4275a, false, 87466, new Class[]{Context.class}, SharedPreferences.class);
    }

    public static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f4275a, true, 87411, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f4275a, true, 87411, new Class[]{String.class}, String.class);
        } else if (str2 == null || str.length() == 0) {
            return "";
        } else {
            String[] split = str2.split("\\\\n");
            StringBuilder sb = new StringBuilder();
            for (String trim : split) {
                sb.append(trim.trim());
                sb.append("\n");
            }
            return sb.toString();
        }
    }

    private String b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f4275a, false, 87441, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f4275a, false, 87441, new Class[]{String.class}, String.class);
        }
        com.ss.android.common.util.i iVar = new com.ss.android.common.util.i(str);
        if (this.h.getUpdateVersionCode() > 0) {
            iVar.a("update_version_code", String.valueOf(this.h.getUpdateVersionCode()));
        }
        if (this.h.getManifestVersionCode() > 0) {
            iVar.a("manifest_version_code", String.valueOf(this.h.getManifestVersionCode()));
        }
        return iVar.a();
    }

    public final void b(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f4275a, false, 87468, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f4275a, false, 87468, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.ab = false;
        m a2 = a();
        if (a2.A()) {
            long currentTimeMillis = System.currentTimeMillis();
            int d2 = a2.d();
            if (a2.B()) {
                if (d2 != this.f4277b) {
                    this.f4277b = d2;
                    this.f4279d = a2.C();
                    this.f4280e = a2.D();
                    this.f4278c = currentTimeMillis;
                    SharedPreferences.Editor edit = c(context).edit();
                    edit.putInt("pre_download_version", this.f4277b);
                    edit.putInt("pre_download_delay_days", this.f4279d);
                    edit.putLong("pre_download_delay_second", this.f4280e);
                    edit.putLong("pre_download_start_time", this.f4278c);
                    SharedPrefsEditorCompat.apply(edit);
                }
                if (a2.q() == null && NetworkUtils.isWifi(context)) {
                    a2.G();
                }
            }
            if (this.f4280e == -1) {
                long j2 = ((long) (this.f4279d * 24 * 3600)) * 1000;
                if (a2.B() && currentTimeMillis - this.f4278c < j2) {
                    return;
                }
            } else if (a2.B() && currentTimeMillis - this.f4278c < this.f4280e * 1000) {
                return;
            }
            if (a2.i()) {
                SharedPrefsEditorCompat.apply(c(context).edit());
                a2.a(context, true);
                this.ab = true;
            }
        }
    }

    public m(AppContext appContext) {
        this.i = appContext.getContext().getApplicationContext();
        this.h = appContext;
        this.j = appContext.getAppName();
        if (PatchProxy.isSupport(new Object[0], this, f4275a, false, 87412, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4275a, false, 87412, new Class[0], Void.TYPE);
        } else {
            this.g = (NotificationManager) this.i.getSystemService("notification");
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("update_notification", AwemeAppData.p().c().getStringAppName(), 2);
                notificationChannel.setSound(null, null);
                notificationChannel.enableLights(false);
                notificationChannel.enableVibration(false);
                this.g.createNotificationChannel(notificationChannel);
            }
        }
        this.k = new d(Looper.getMainLooper(), this);
        this.l = Environment.getExternalStorageDirectory().getPath() + "/Android/data/" + this.i.getPackageName() + "/files";
        StringBuilder sb = new StringBuilder();
        sb.append(this.l);
        sb.append("/install_dmt.apk");
        this.m = sb.toString();
        this.n = this.l + "/install_dmt.apk.part";
        this.o = this.l + "/predownload.apk";
        this.p = this.l + "/predownload.apk.part";
        this.Q = new a();
        this.Q.f75201a = 0;
        this.Q.f75202b = 0;
        this.V = new a();
        this.V.f75201a = 0;
        this.V.f75202b = 0;
        s sVar = (s) com.ss.android.ugc.aweme.aj.b.b().a(this.i, "update_params", s.class);
        if (sVar != null) {
            this.aa = sVar.f47213a;
            this.f4277b = sVar.f47214b;
            this.f4278c = (long) sVar.f47215c;
            this.f4279d = sVar.f47216d;
            this.f4280e = sVar.f47217e;
        }
        com.ss.android.ugc.aweme.lego.a.i.a().a(new CancelNotificationForUpdateTask(this.g)).a();
    }

    /* access modifiers changed from: package-private */
    public Notification a(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f4275a, false, 87463, new Class[]{Integer.TYPE}, Notification.class)) {
            return (Notification) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f4275a, false, 87463, new Class[]{Integer.TYPE}, Notification.class);
        }
        String stringAppName = this.h.getStringAppName();
        String format = String.format(this.i.getString(C0906R.string.cbu), new Object[]{stringAppName, e()});
        String str = i3 + "%";
        Intent intent = new Intent(this.i, UpdateActivity.class);
        intent.addFlags(536870912);
        PendingIntent activity = PendingIntent.getActivity(this.i, 0, intent, 0);
        if (i3 != 0 && this.ac != null) {
            return f.a(this.i, this.ac, format, str, i3);
        }
        this.ac = new NotificationCompat.Builder(this.i, "update_notification");
        return f.a(this.i, this.ac, 17301633, null, stringAppName, format, str, i2, activity);
    }

    public final void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f4275a, false, 87467, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f4275a, false, 87467, new Class[]{Context.class}, Void.TYPE);
        } else if (!this.ab) {
            m a2 = a();
            if (a2.A()) {
                long currentTimeMillis = System.currentTimeMillis();
                int d2 = a2.d();
                if (a2.B()) {
                    if (d2 != this.f4277b) {
                        this.f4277b = d2;
                        this.f4279d = a2.C();
                        this.f4280e = a2.D();
                        this.f4278c = currentTimeMillis;
                        SharedPreferences.Editor edit = c(context).edit();
                        edit.putInt("pre_download_version", this.f4277b);
                        edit.putInt("pre_download_delay_days", this.f4279d);
                        edit.putLong("pre_download_delay_second", this.f4280e);
                        edit.putLong("pre_download_start_time", this.f4278c);
                        SharedPrefsEditorCompat.apply(edit);
                    }
                    Logger.debug();
                    if (a2.q() == null && NetworkUtils.isWifi(context)) {
                        a2.G();
                        Logger.debug();
                    }
                }
                if (this.f4280e == -1) {
                    long j2 = ((long) (this.f4279d * 24 * 3600)) * 1000;
                    if (a2.B() && currentTimeMillis - this.f4278c < j2) {
                        Logger.debug();
                        return;
                    }
                } else if (a2.B() && currentTimeMillis - this.f4278c < this.f4280e * 1000) {
                    Logger.debug();
                    return;
                }
                SharedPrefsEditorCompat.apply(c(context).edit());
                a2.a(context, true);
            }
        }
    }

    private void a(Context context, boolean z2) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, (byte) 1}, this, f4275a, false, 87459, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, (byte) 1}, this, f4275a, false, 87459, new Class[]{Context.class, Boolean.TYPE}, Void.TYPE);
        } else if (h()) {
            if (com.ss.android.ugc.aweme.framework.core.a.b().a() == null || !(com.ss.android.ugc.aweme.framework.core.a.b().a() instanceof MainActivity)) {
                return;
            }
            l lVar = new l(context2, true);
            if ((context2 instanceof Activity) && !((Activity) context2).isFinishing()) {
                lVar.show();
            }
            com.ss.android.common.lib.a.a(this.i, "update", "show");
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(int i2, String str, boolean z2) {
        int i3 = i2;
        String str2 = str;
        synchronized (this) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str2, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f4275a, false, 87456, new Class[]{Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str2, Byte.valueOf(z2)}, this, f4275a, false, 87456, new Class[]{Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (z2) {
                this.T = i3;
            } else {
                this.O = i3;
            }
            this.M = str2;
            SharedPreferences.Editor edit = com.ss.android.ugc.aweme.q.c.a(this.i, "update_info", 0).edit();
            if (z2) {
                edit.putInt("pre_download_size", this.T);
            } else {
                edit.putInt("download_size", this.O);
            }
            edit.putString("download_etag", this.M);
            SharedPrefsEditorCompat.apply(edit);
        }
    }

    private synchronized void a(int i2, int i3, String str, boolean z2) {
        String str2 = str;
        synchronized (this) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), -1, str2, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f4275a, false, 87455, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), -1, str2, Byte.valueOf(z2)}, this, f4275a, false, 87455, new Class[]{Integer.TYPE, Integer.TYPE, String.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
            this.N = i2;
            if (z2) {
                this.T = -1;
            } else {
                this.O = -1;
            }
            this.M = str2;
            SharedPreferences.Editor edit = com.ss.android.ugc.aweme.q.c.a(this.i, "update_info", 0).edit();
            edit.putInt("download_version", this.N);
            if (z2) {
                edit.putInt("pre_download_size", this.T);
            } else {
                edit.putInt("download_size", this.O);
            }
            edit.putString("download_etag", this.M);
            SharedPrefsEditorCompat.apply(edit);
        }
    }
}
