package com.ss.android.download;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.download.b.c;
import com.ss.android.download.b.d;
import java.io.File;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@TargetApi(3)
public class DownloadService extends Service {

    /* renamed from: a  reason: collision with root package name */
    s f28409a;

    /* renamed from: b  reason: collision with root package name */
    public a f28410b;

    /* renamed from: c  reason: collision with root package name */
    public f f28411c;
    @SuppressLint({"UseSparseArrays"})

    /* renamed from: d  reason: collision with root package name */
    public final Map<Long, d> f28412d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final ExecutorService f28413e;

    /* renamed from: f  reason: collision with root package name */
    public i f28414f;
    public HandlerThread g;
    Handler h;
    volatile int i;
    private AlarmManager j;
    private r k;
    private Handler.Callback l;

    class a extends ContentObserver {
        public final void onChange(boolean z) {
            DownloadService.this.a();
        }

        public a() {
            super(new Handler());
        }
    }

    public DownloadService() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());
        if (Build.VERSION.SDK_INT >= 9) {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        this.f28413e = threadPoolExecutor;
        this.l = new Handler.Callback() {
            @TargetApi(5)
            public final boolean handleMessage(Message message) {
                boolean b2;
                Process.setThreadPriority(10);
                int i = message.arg1;
                synchronized (DownloadService.this.f28412d) {
                    b2 = DownloadService.this.b();
                }
                if (message.what == 2) {
                    for (Map.Entry<Thread, StackTraceElement[]> key : Thread.getAllStackTraces().entrySet()) {
                        ((Thread) key.getKey()).getName().startsWith("pool");
                    }
                    f fVar = DownloadService.this.f28411c;
                    synchronized (fVar.f28552c) {
                        for (int i2 = 0; i2 < fVar.f28552c.f28520a; i2++) {
                            SystemClock.elapsedRealtime();
                        }
                    }
                }
                if (b2) {
                    DownloadService downloadService = DownloadService.this;
                    downloadService.h.removeMessages(2);
                    downloadService.h.sendMessageDelayed(downloadService.h.obtainMessage(2, downloadService.i, -1), 300000);
                } else if (DownloadService.this.stopSelfResult(i)) {
                    if (DownloadService.this.f28410b != null) {
                        DownloadService.this.getContentResolver().unregisterContentObserver(DownloadService.this.f28410b);
                    }
                    if (DownloadService.this.f28414f != null) {
                        DownloadService.this.f28414f.a();
                    }
                    if (DownloadService.this.g != null) {
                        DownloadService.this.g.quit();
                    }
                    if (DownloadService.this.f28413e != null) {
                        DownloadService.this.f28413e.shutdown();
                    }
                }
                return true;
            }
        };
    }

    public final void a() {
        this.h.removeMessages(1);
        this.h.obtainMessage(1, this.i, -1).sendToTarget();
    }

    @TargetApi(5)
    public void onDestroy() {
        try {
            if (this.f28410b != null) {
                getContentResolver().unregisterContentObserver(this.f28410b);
            }
            if (this.f28414f != null) {
                this.f28414f.a();
            }
            if (this.g != null) {
                this.g.quit();
            }
            if (this.f28413e != null) {
                this.f28413e.shutdown();
            }
        } catch (Exception unused) {
        }
        super.onDestroy();
    }

    @TargetApi(3)
    public void onCreate() {
        super.onCreate();
        if (!k.a(getApplicationContext())) {
            stopSelf();
        } else if (!k.a()) {
            stopSelf();
        } else {
            if (this.f28409a == null) {
                this.f28409a = o.a((Context) this);
            }
            this.j = (AlarmManager) getSystemService("alarm");
            this.k = new r(this);
            this.g = new HandlerThread("SsDownloadManager-UpdateThread");
            this.g.start();
            this.h = new Handler(this.g.getLooper(), this.l);
            this.f28414f = new i(this);
            this.f28411c = f.a((Context) this);
            this.f28411c.a();
            this.f28410b = new a();
            getContentResolver().registerContentObserver(c.a.f28513a, true, this.f28410b);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0118, code lost:
        if (r5 != null) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x011e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011f, code lost:
        if (r5 != null) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0125, code lost:
        r13 = Long.MAX_VALUE;
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012b, code lost:
        if (r5 != null) goto L_0x011a;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011e A[ExcHandler: all (r0v8 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0026] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r18 = this;
            r1 = r18
            com.ss.android.download.s r0 = r1.f28409a
            long r2 = r0.a()
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Map<java.lang.Long, com.ss.android.download.d> r4 = r1.f28412d
            java.util.Set r4 = r4.keySet()
            r0.<init>(r4)
            android.content.Context r4 = r18.getApplicationContext()
            com.ss.android.download.h r4 = com.ss.android.download.h.a((android.content.Context) r4)
            android.net.Uri r6 = com.ss.android.download.b.c.a.f28513a
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r4
            android.database.Cursor r5 = r5.a((android.net.Uri) r6, (java.lang.String[]) r7, (java.lang.String) r8, (java.lang.String[]) r9, (java.lang.String) r10)
            com.ss.android.download.d$b r11 = new com.ss.android.download.d$b     // Catch:{ Exception -> 0x0125, all -> 0x011e }
            r11.<init>(r4, r5)     // Catch:{ Exception -> 0x0125, all -> 0x011e }
            java.lang.String r12 = "_id"
            int r12 = r5.getColumnIndexOrThrow(r12)     // Catch:{ Exception -> 0x0125, all -> 0x011e }
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r15 = 0
        L_0x0037:
            boolean r16 = r5.moveToNext()     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            if (r16 == 0) goto L_0x0118
            long r16 = r5.getLong(r12)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.Long r10 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r0.remove(r10)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.util.Map<java.lang.Long, com.ss.android.download.d> r10 = r1.f28412d     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.Long r8 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.Object r8 = r10.get(r8)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.download.d r8 = (com.ss.android.download.d) r8     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            if (r8 == 0) goto L_0x005a
            r11.a((com.ss.android.download.d) r8)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            goto L_0x006f
        L_0x005a:
            com.ss.android.download.s r8 = r1.f28409a     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.download.r r9 = r1.k     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.download.f r10 = r1.f28411c     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.download.d r8 = r11.a(r1, r8, r9, r10)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.util.Map<java.lang.Long, com.ss.android.download.d> r9 = r1.f28412d     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            long r6 = r8.f28523a     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r9.put(r6, r8)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
        L_0x006f:
            boolean r6 = r8.w     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r7 = 0
            if (r6 == 0) goto L_0x00af
            java.lang.String r6 = r8.x     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            if (r6 != 0) goto L_0x0089
            android.content.ContentResolver r6 = r18.getContentResolver()     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.String r9 = r8.x     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r6.delete(r9, r7, r7)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
        L_0x0089:
            java.util.Map<java.lang.Long, com.ss.android.download.d> r6 = r1.f28412d     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            long r9 = r8.f28523a     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r6.remove(r9)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.String r6 = r8.f28527e     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            a((java.lang.String) r6)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            android.net.Uri r6 = r8.c()     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r4.a(r6, r7, r7)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.download.f r6 = r1.f28411c     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r6.a((com.ss.android.download.d) r8)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.download.f r6 = r1.f28411c     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.String r7 = com.ss.android.download.f.b((com.ss.android.download.d) r8)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r6.a((java.lang.String) r7)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            goto L_0x00ef
        L_0x00af:
            java.lang.String r6 = r8.f28527e     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.String r9 = r8.f28527e     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            if (r9 == 0) goto L_0x00e0
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r9.<init>(r6)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            int r6 = r8.j     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r10 = 200(0xc8, float:2.8E-43)
            if (r6 != r10) goto L_0x00e0
            boolean r6 = r9.exists()     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            if (r6 != 0) goto L_0x00e0
            java.lang.String r6 = com.ss.android.download.f.b((com.ss.android.download.d) r8)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            android.content.Context r9 = r8.F     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.download.f r9 = com.ss.android.download.f.a((android.content.Context) r9)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r9.a((java.lang.String) r6)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            android.content.Context r6 = r8.F     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.download.h r6 = com.ss.android.download.h.a((android.content.Context) r6)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            android.net.Uri r9 = r8.c()     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r6.a(r9, r7, r7)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
        L_0x00e0:
            java.util.concurrent.ExecutorService r6 = r1.f28413e     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            boolean r6 = r8.a((java.util.concurrent.ExecutorService) r6)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.download.i r7 = r1.f28414f     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            boolean r7 = r8.a((com.ss.android.download.i) r7)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r6 = r6 | r15
            r6 = r6 | r7
            r15 = r6
        L_0x00ef:
            int r6 = r8.j     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            boolean r6 = com.ss.android.download.b.c.a.c(r6)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            if (r6 == 0) goto L_0x00fd
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0111
        L_0x00fd:
            int r6 = r8.j     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r7 = 194(0xc2, float:2.72E-43)
            if (r6 == r7) goto L_0x0106
        L_0x0103:
            r6 = 0
            goto L_0x0111
        L_0x0106:
            long r6 = r8.a((long) r2)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 > 0) goto L_0x010f
            goto L_0x0103
        L_0x010f:
            r8 = 0
            long r6 = r6 - r2
        L_0x0111:
            long r6 = java.lang.Math.min(r6, r13)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r13 = r6
            goto L_0x0037
        L_0x0118:
            if (r5 == 0) goto L_0x012e
        L_0x011a:
            r5.close()     // Catch:{ Exception -> 0x012e }
            goto L_0x012e
        L_0x011e:
            r0 = move-exception
            if (r5 == 0) goto L_0x0124
            r5.close()     // Catch:{ Exception -> 0x0124 }
        L_0x0124:
            throw r0
        L_0x0125:
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r15 = 0
        L_0x012b:
            if (r5 == 0) goto L_0x012e
            goto L_0x011a
        L_0x012e:
            java.util.Iterator r0 = r0.iterator()
        L_0x0132:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x017a
            java.lang.Object r4 = r0.next()
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            java.util.Map<java.lang.Long, com.ss.android.download.d> r6 = r1.f28412d
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r4 = r6.get(r4)
            com.ss.android.download.d r4 = (com.ss.android.download.d) r4
            int r5 = r4.j
            r6 = 192(0xc0, float:2.69E-43)
            if (r5 != r6) goto L_0x0158
            r5 = 490(0x1ea, float:6.87E-43)
            r4.j = r5
        L_0x0158:
            int r5 = r4.g
            if (r5 == 0) goto L_0x0165
            java.lang.String r5 = r4.f28527e
            if (r5 == 0) goto L_0x0165
            java.lang.String r5 = r4.f28527e
            a((java.lang.String) r5)
        L_0x0165:
            com.ss.android.download.f r5 = r1.f28411c
            java.lang.String r6 = com.ss.android.download.f.b((com.ss.android.download.d) r4)
            r5.a((java.lang.String) r6)
            java.util.Map<java.lang.Long, com.ss.android.download.d> r5 = r1.f28412d
            long r6 = r4.f28523a
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r5.remove(r4)
            goto L_0x0132
        L_0x017a:
            com.ss.android.download.f r0 = r1.f28411c
            java.util.Map<java.lang.Long, com.ss.android.download.d> r4 = r1.f28412d
            java.util.Collection r4 = r4.values()
            r0.a((java.util.Collection<com.ss.android.download.d>) r4)
            r4 = 0
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x01be
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x01be
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r4 = "android.ss.intent.action.DOWNLOAD_WAKEUP"
            r0.<init>(r4)
            java.lang.Class<com.ss.android.download.DownloadHandlerService> r4 = com.ss.android.download.DownloadHandlerService.class
            r0.setClass(r1, r4)
            r10 = 1
            com.ss.android.download.m r4 = com.ss.android.download.k.f28596b
            if (r4 == 0) goto L_0x01ac
            com.ss.android.download.m r4 = com.ss.android.download.k.f28596b
            boolean r4 = r4.d()
            goto L_0x01ad
        L_0x01ac:
            r4 = 0
        L_0x01ad:
            if (r4 == 0) goto L_0x01b0
            r10 = 0
        L_0x01b0:
            android.app.AlarmManager r4 = r1.j     // Catch:{ Exception -> 0x01be }
            r5 = 0
            long r2 = r2 + r13
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = 0
            android.app.PendingIntent r0 = android.app.PendingIntent.getService(r1, r6, r0, r5)     // Catch:{ Exception -> 0x01be }
            com.bytedance.common.util.KitKatV19Compat.setAlarmTime(r4, r10, r2, r0)     // Catch:{ Exception -> 0x01be }
        L_0x01be:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.download.DownloadService.b():boolean");
    }

    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Cannot bind to Download Manager Service");
    }

    public static void a(Context context) {
        try {
            context.startService(new Intent(context, DownloadService.class));
        } catch (Exception unused) {
        }
    }

    private static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    @TargetApi(5)
    public int onStartCommand(Intent intent, int i2, int i3) {
        int onStartCommand = super.onStartCommand(intent, i2, i3);
        if (!k.a(getApplicationContext())) {
            stopSelf();
            return onStartCommand;
        } else if (!k.a()) {
            stopSelf();
            return onStartCommand;
        } else {
            this.i = i3;
            a();
            return onStartCommand;
        }
    }

    /* access modifiers changed from: protected */
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str;
        String str2;
        String str3;
        d dVar = new d(printWriter, "  ");
        synchronized (this.f28412d) {
            ArrayList<Long> arrayList = new ArrayList<>(this.f28412d.keySet());
            Collections.sort(arrayList);
            for (Long l2 : arrayList) {
                d dVar2 = this.f28412d.get(l2);
                dVar.println("DownloadInfo:");
                dVar.f28515b.append(dVar.f28514a);
                dVar.f28516c = null;
                dVar.a("mId", Long.valueOf(dVar2.f28523a));
                dVar.a("mLastMod", Long.valueOf(dVar2.m));
                dVar.a("mPackage", dVar2.n);
                dVar.println();
                dVar.a("mUri", dVar2.f28524b);
                dVar.println();
                dVar.a("mMimeType", dVar2.f28528f);
                if (dVar2.p != null) {
                    str = "yes";
                } else {
                    str = "no";
                }
                dVar.a("mCookies", str);
                if (dVar2.r != null) {
                    str2 = "yes";
                } else {
                    str2 = "no";
                }
                dVar.a("mReferer", str2);
                dVar.a("mUserAgent", dVar2.q);
                dVar.println();
                dVar.a("mFileName", dVar2.f28527e);
                dVar.a("mDestination", Integer.valueOf(dVar2.g));
                dVar.println();
                int i2 = dVar2.j;
                if (i2 == 190) {
                    str3 = "PENDING";
                } else if (i2 == 400) {
                    str3 = "BAD_REQUEST";
                } else if (i2 != 406) {
                    switch (i2) {
                        case 192:
                            str3 = "RUNNING";
                            break;
                        case 193:
                            str3 = "PAUSED_BY_APP";
                            break;
                        case 194:
                            str3 = "WAITING_TO_RETRY";
                            break;
                        case 195:
                            str3 = "WAITING_FOR_NETWORK";
                            break;
                        case 196:
                            str3 = "QUEUED_FOR_WIFI";
                            break;
                        default:
                            switch (i2) {
                                case 198:
                                    str3 = "INSUFFICIENT_SPACE_ERROR";
                                    break;
                                case 199:
                                    str3 = "DEVICE_NOT_FOUND_ERROR";
                                    break;
                                case 200:
                                    str3 = "SUCCESS";
                                    break;
                                default:
                                    switch (i2) {
                                        case 411:
                                            str3 = "LENGTH_REQUIRED";
                                            break;
                                        case 412:
                                            str3 = "PRECONDITION_FAILED";
                                            break;
                                        default:
                                            switch (i2) {
                                                case 488:
                                                    str3 = "FILE_ALREADY_EXISTS_ERROR";
                                                    break;
                                                case 489:
                                                    str3 = "CANNOT_RESUME";
                                                    break;
                                                case 490:
                                                    str3 = "CANCELED";
                                                    break;
                                                case 491:
                                                    str3 = "UNKNOWN_ERROR";
                                                    break;
                                                case 492:
                                                    str3 = "FILE_ERROR";
                                                    break;
                                                case 493:
                                                    str3 = "UNHANDLED_REDIRECT";
                                                    break;
                                                case 494:
                                                    str3 = "UNHANDLED_HTTP_CODE";
                                                    break;
                                                case 495:
                                                    str3 = "HTTP_DATA_ERROR";
                                                    break;
                                                case 496:
                                                    str3 = "HTTP_EXCEPTION";
                                                    break;
                                                case 497:
                                                    str3 = "TOO_MANY_REDIRECTS";
                                                    break;
                                                case 498:
                                                    str3 = "BLOCKED";
                                                    break;
                                                default:
                                                    str3 = Integer.toString(i2);
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    str3 = "NOT_ACCEPTABLE";
                }
                dVar.a("mStatus", str3);
                dVar.a("mCurrentBytes", Long.valueOf(dVar2.t));
                dVar.a("mTotalBytes", Long.valueOf(dVar2.s));
                dVar.println();
                dVar.a("mNumFailed", Integer.valueOf(dVar2.k));
                dVar.a("mRetryAfter", Integer.valueOf(dVar2.l));
                dVar.a("mETag", dVar2.u);
                dVar.println();
                dVar.a("mAllowedNetworkTypes", Integer.valueOf(dVar2.y));
                dVar.a("mAllowRoaming", Boolean.valueOf(dVar2.z));
                dVar.println();
                dVar.f28515b.delete(0, dVar.f28514a.length());
                dVar.f28516c = null;
            }
        }
    }
}
