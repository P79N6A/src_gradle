package com.ss.android.downloadlib.core.download;

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
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.core.download.j;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@TargetApi(3)
public class DownloadService extends Service {

    /* renamed from: a  reason: collision with root package name */
    q f28918a;

    /* renamed from: b  reason: collision with root package name */
    public a f28919b;

    /* renamed from: c  reason: collision with root package name */
    public e f28920c;
    @SuppressLint({"UseSparseArrays"})

    /* renamed from: d  reason: collision with root package name */
    public final Map<Long, c> f28921d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final ExecutorService f28922e;

    /* renamed from: f  reason: collision with root package name */
    public h f28923f;
    public HandlerThread g;
    Handler h;
    volatile int i;
    private AlarmManager j;
    private p k;
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
        this.f28922e = threadPoolExecutor;
        this.l = new Handler.Callback() {
            @TargetApi(5)
            public final boolean handleMessage(Message message) {
                boolean b2;
                Process.setThreadPriority(10);
                int i = message.arg1;
                synchronized (DownloadService.this.f28921d) {
                    b2 = DownloadService.this.b();
                }
                if (message.what == 2) {
                    for (Map.Entry<Thread, StackTraceElement[]> key : Thread.getAllStackTraces().entrySet()) {
                        ((Thread) key.getKey()).getName().startsWith("pool");
                    }
                    e eVar = DownloadService.this.f28920c;
                    synchronized (eVar.f28983c) {
                        for (int i2 = 0; i2 < eVar.f28983c.f28892c; i2++) {
                            SystemClock.elapsedRealtime();
                        }
                    }
                }
                if (b2) {
                    DownloadService downloadService = DownloadService.this;
                    downloadService.h.removeMessages(2);
                    downloadService.h.sendMessageDelayed(downloadService.h.obtainMessage(2, downloadService.i, -1), 300000);
                } else if (DownloadService.this.stopSelfResult(i)) {
                    if (DownloadService.this.f28919b != null) {
                        DownloadService.this.getContentResolver().unregisterContentObserver(DownloadService.this.f28919b);
                    }
                    if (DownloadService.this.f28923f != null) {
                        DownloadService.this.f28923f.a();
                    }
                    if (DownloadService.this.g != null) {
                        DownloadService.this.g.quit();
                    }
                    if (DownloadService.this.f28922e != null) {
                        DownloadService.this.f28922e.shutdown();
                    }
                }
                return true;
            }
        };
    }

    public final void a() {
        if (this.h != null) {
            this.h.removeMessages(1);
            this.h.obtainMessage(1, this.i, -1).sendToTarget();
        }
    }

    @TargetApi(5)
    public void onDestroy() {
        try {
            if (this.f28919b != null) {
                getContentResolver().unregisterContentObserver(this.f28919b);
            }
            if (this.f28923f != null) {
                this.f28923f.a();
            }
            if (this.g != null) {
                this.g.quit();
            }
            if (this.f28922e != null) {
                this.f28922e.shutdown();
            }
        } catch (Exception unused) {
        }
        super.onDestroy();
    }

    @TargetApi(3)
    public void onCreate() {
        super.onCreate();
        try {
            if (this.f28918a == null) {
                this.f28918a = n.a((Context) this);
            }
            if (k.a() == null) {
                k.a((Context) this);
            }
            this.j = (AlarmManager) getSystemService("alarm");
            this.k = new p(this);
            this.g = new HandlerThread("SsDownloadManager-UpdateThread");
            this.g.start();
            this.h = new Handler(this.g.getLooper(), this.l);
            this.f28923f = new h(this);
            this.f28920c = e.a((Context) this);
            this.f28920c.a();
            this.f28919b = new a();
            getContentResolver().registerContentObserver(j.a.f29029a, true, this.f28919b);
        } catch (Exception unused) {
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
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011e A[ExcHandler: all (r0v7 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0026] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r18 = this;
            r1 = r18
            com.ss.android.downloadlib.core.download.q r0 = r1.f28918a
            long r2 = r0.a()
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Map<java.lang.Long, com.ss.android.downloadlib.core.download.c> r4 = r1.f28921d
            java.util.Set r4 = r4.keySet()
            r0.<init>(r4)
            android.content.Context r4 = r18.getApplicationContext()
            com.ss.android.downloadlib.core.download.g r4 = com.ss.android.downloadlib.core.download.g.a((android.content.Context) r4)
            android.net.Uri r6 = com.ss.android.downloadlib.core.download.j.a.f29029a
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r5 = r4
            android.database.Cursor r5 = r5.a((android.net.Uri) r6, (java.lang.String[]) r7, (java.lang.String) r8, (java.lang.String[]) r9, (java.lang.String) r10)
            com.ss.android.downloadlib.core.download.c$b r11 = new com.ss.android.downloadlib.core.download.c$b     // Catch:{ Exception -> 0x0125, all -> 0x011e }
            r11.<init>(r4, r5)     // Catch:{ Exception -> 0x0125, all -> 0x011e }
            java.lang.String r12 = "_id"
            int r12 = r5.getColumnIndexOrThrow(r12)     // Catch:{ Exception -> 0x0125, all -> 0x011e }
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r15 = 0
        L_0x0037:
            boolean r16 = r5.moveToNext()     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            if (r16 == 0) goto L_0x0118
            long r16 = r5.getLong(r12)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.Long r6 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r0.remove(r6)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.util.Map<java.lang.Long, com.ss.android.downloadlib.core.download.c> r6 = r1.f28921d     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.Long r9 = java.lang.Long.valueOf(r16)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.Object r6 = r6.get(r9)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.downloadlib.core.download.c r6 = (com.ss.android.downloadlib.core.download.c) r6     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            if (r6 == 0) goto L_0x005a
            r11.a((com.ss.android.downloadlib.core.download.c) r6)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            goto L_0x006f
        L_0x005a:
            com.ss.android.downloadlib.core.download.q r6 = r1.f28918a     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.downloadlib.core.download.p r9 = r1.k     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.downloadlib.core.download.e r10 = r1.f28920c     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.downloadlib.core.download.c r6 = r11.a(r1, r6, r9, r10)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.util.Map<java.lang.Long, com.ss.android.downloadlib.core.download.c> r9 = r1.f28921d     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            long r7 = r6.f28942a     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r9.put(r7, r6)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
        L_0x006f:
            boolean r7 = r6.w     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r8 = 0
            if (r7 == 0) goto L_0x00af
            java.lang.String r7 = r6.x     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            if (r7 != 0) goto L_0x0089
            android.content.ContentResolver r7 = r18.getContentResolver()     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.String r9 = r6.x     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r7.delete(r9, r8, r8)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
        L_0x0089:
            java.util.Map<java.lang.Long, com.ss.android.downloadlib.core.download.c> r7 = r1.f28921d     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            long r9 = r6.f28942a     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r7.remove(r9)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.String r7 = r6.f28946e     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            a((java.lang.String) r7)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            android.net.Uri r7 = r6.b()     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r4.a((android.net.Uri) r7, (java.lang.String) r8, (java.lang.String[]) r8)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.downloadlib.core.download.e r7 = r1.f28920c     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r7.a((com.ss.android.downloadlib.core.download.c) r6)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.downloadlib.core.download.e r7 = r1.f28920c     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.String r8 = com.ss.android.downloadlib.core.download.e.b((com.ss.android.downloadlib.core.download.c) r6)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r7.a((java.lang.String) r8)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            goto L_0x00ef
        L_0x00af:
            java.lang.String r7 = r6.f28946e     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            java.lang.String r9 = r6.f28946e     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            if (r9 == 0) goto L_0x00e0
            java.io.File r9 = new java.io.File     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r9.<init>(r7)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            int r7 = r6.j     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r10 = 200(0xc8, float:2.8E-43)
            if (r7 != r10) goto L_0x00e0
            boolean r7 = r9.exists()     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            if (r7 != 0) goto L_0x00e0
            java.lang.String r7 = com.ss.android.downloadlib.core.download.e.b((com.ss.android.downloadlib.core.download.c) r6)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            android.content.Context r9 = r6.G     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.downloadlib.core.download.e r9 = com.ss.android.downloadlib.core.download.e.a((android.content.Context) r9)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r9.a((java.lang.String) r7)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            android.content.Context r7 = r6.G     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.downloadlib.core.download.g r7 = com.ss.android.downloadlib.core.download.g.a((android.content.Context) r7)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            android.net.Uri r9 = r6.b()     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r7.a((android.net.Uri) r9, (java.lang.String) r8, (java.lang.String[]) r8)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
        L_0x00e0:
            java.util.concurrent.ExecutorService r7 = r1.f28922e     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            boolean r7 = r6.a((java.util.concurrent.ExecutorService) r7)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            com.ss.android.downloadlib.core.download.h r8 = r1.f28923f     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            boolean r8 = r6.a((com.ss.android.downloadlib.core.download.h) r8)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r7 = r7 | r15
            r7 = r7 | r8
            r15 = r7
        L_0x00ef:
            int r7 = r6.j     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            boolean r7 = com.ss.android.download.api.a.a.C0337a.c(r7)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            if (r7 == 0) goto L_0x00fd
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x0111
        L_0x00fd:
            int r7 = r6.j     // Catch:{ Exception -> 0x012b, all -> 0x011e }
            r8 = 194(0xc2, float:2.72E-43)
            if (r7 == r8) goto L_0x0106
        L_0x0103:
            r6 = 0
            goto L_0x0111
        L_0x0106:
            long r6 = r6.a((long) r2)     // Catch:{ Exception -> 0x012b, all -> 0x011e }
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
            java.util.Map<java.lang.Long, com.ss.android.downloadlib.core.download.c> r6 = r1.f28921d
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object r4 = r6.get(r4)
            com.ss.android.downloadlib.core.download.c r4 = (com.ss.android.downloadlib.core.download.c) r4
            int r5 = r4.j
            r6 = 192(0xc0, float:2.69E-43)
            if (r5 != r6) goto L_0x0158
            r5 = 490(0x1ea, float:6.87E-43)
            r4.j = r5
        L_0x0158:
            int r5 = r4.g
            if (r5 == 0) goto L_0x0165
            java.lang.String r5 = r4.f28946e
            if (r5 == 0) goto L_0x0165
            java.lang.String r5 = r4.f28946e
            a((java.lang.String) r5)
        L_0x0165:
            com.ss.android.downloadlib.core.download.e r5 = r1.f28920c
            java.lang.String r6 = com.ss.android.downloadlib.core.download.e.b((com.ss.android.downloadlib.core.download.c) r4)
            r5.a((java.lang.String) r6)
            java.util.Map<java.lang.Long, com.ss.android.downloadlib.core.download.c> r5 = r1.f28921d
            long r6 = r4.f28942a
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r5.remove(r4)
            goto L_0x0132
        L_0x017a:
            com.ss.android.downloadlib.core.download.e r0 = r1.f28920c
            java.util.Map<java.lang.Long, com.ss.android.downloadlib.core.download.c> r4 = r1.f28921d
            java.util.Collection r4 = r4.values()
            r0.a((java.util.Collection<com.ss.android.downloadlib.core.download.c>) r4)
            r4 = 0
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x01b2
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b2
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r4 = "android.ss.intent.action.DOWNLOAD_WAKEUP"
            r0.<init>(r4)
            java.lang.Class<com.ss.android.downloadlib.core.download.DownloadHandlerService> r4 = com.ss.android.downloadlib.core.download.DownloadHandlerService.class
            r0.setClass(r1, r4)
            android.app.AlarmManager r6 = r1.j     // Catch:{ Throwable -> 0x01b2 }
            r4 = 0
            long r8 = r2 + r13
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 0
            android.app.PendingIntent r10 = android.app.PendingIntent.getService(r1, r3, r0, r2)     // Catch:{ Throwable -> 0x01b2 }
            com.ss.android.downloadlib.c.e$a r5 = com.ss.android.downloadlib.c.e.f28888a     // Catch:{ Throwable -> 0x01b2 }
            r7 = 0
            r5.a(r6, r7, r8, r10)     // Catch:{ Throwable -> 0x01b2 }
        L_0x01b2:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.core.download.DownloadService.b():boolean");
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
        this.i = i3;
        a();
        return onStartCommand;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x018d A[SYNTHETIC, Splitter:B:72:0x018d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dump(java.io.FileDescriptor r6, java.io.PrintWriter r7, java.lang.String[] r8) {
        /*
            r5 = this;
            r6 = 0
            com.ss.android.downloadlib.c.d r8 = new com.ss.android.downloadlib.c.d     // Catch:{ Exception -> 0x0191, all -> 0x0188 }
            java.lang.String r0 = "  "
            r8.<init>(r7, r0)     // Catch:{ Exception -> 0x0191, all -> 0x0188 }
            java.util.Map<java.lang.Long, com.ss.android.downloadlib.core.download.c> r7 = r5.f28921d     // Catch:{ Exception -> 0x0186, all -> 0x0184 }
            monitor-enter(r7)     // Catch:{ Exception -> 0x0186, all -> 0x0184 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0181 }
            java.util.Map<java.lang.Long, com.ss.android.downloadlib.core.download.c> r1 = r5.f28921d     // Catch:{ all -> 0x0181 }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x0181 }
            r0.<init>(r1)     // Catch:{ all -> 0x0181 }
            java.util.Collections.sort(r0)     // Catch:{ all -> 0x0181 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0181 }
        L_0x001d:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0181 }
            if (r1 == 0) goto L_0x017b
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0181 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0181 }
            java.util.Map<java.lang.Long, com.ss.android.downloadlib.core.download.c> r2 = r5.f28921d     // Catch:{ all -> 0x0181 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x0181 }
            com.ss.android.downloadlib.core.download.c r1 = (com.ss.android.downloadlib.core.download.c) r1     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = "DownloadInfo:"
            r8.println(r2)     // Catch:{ all -> 0x0181 }
            java.lang.StringBuilder r2 = r8.f28883b     // Catch:{ all -> 0x0181 }
            java.lang.String r3 = r8.f28882a     // Catch:{ all -> 0x0181 }
            r2.append(r3)     // Catch:{ all -> 0x0181 }
            r8.f28884c = r6     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = "mId"
            long r3 = r1.f28942a     // Catch:{ all -> 0x0181 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0181 }
            r8.a(r2, r3)     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = "mLastMod"
            long r3 = r1.m     // Catch:{ all -> 0x0181 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0181 }
            r8.a(r2, r3)     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = "mPackage"
            java.lang.String r3 = r1.n     // Catch:{ all -> 0x0181 }
            r8.a(r2, r3)     // Catch:{ all -> 0x0181 }
            r8.println()     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = "mUri"
            java.lang.String r3 = r1.f28943b     // Catch:{ all -> 0x0181 }
            r8.a(r2, r3)     // Catch:{ all -> 0x0181 }
            r8.println()     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = "mMimeType"
            java.lang.String r3 = r1.f28947f     // Catch:{ all -> 0x0181 }
            r8.a(r2, r3)     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = "mCookies"
            java.lang.String r3 = r1.p     // Catch:{ all -> 0x0181 }
            if (r3 == 0) goto L_0x0079
            java.lang.String r3 = "yes"
            goto L_0x007b
        L_0x0079:
            java.lang.String r3 = "no"
        L_0x007b:
            r8.a(r2, r3)     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = "mReferer"
            java.lang.String r3 = r1.r     // Catch:{ all -> 0x0181 }
            if (r3 == 0) goto L_0x0087
            java.lang.String r3 = "yes"
            goto L_0x0089
        L_0x0087:
            java.lang.String r3 = "no"
        L_0x0089:
            r8.a(r2, r3)     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = "mUserAgent"
            java.lang.String r3 = r1.q     // Catch:{ all -> 0x0181 }
            r8.a(r2, r3)     // Catch:{ all -> 0x0181 }
            r8.println()     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = "mFileName"
            java.lang.String r3 = r1.f28946e     // Catch:{ all -> 0x0181 }
            r8.a(r2, r3)     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = "mDestination"
            int r3 = r1.g     // Catch:{ all -> 0x0181 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0181 }
            r8.a(r2, r3)     // Catch:{ all -> 0x0181 }
            r8.println()     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = "mStatus"
            int r3 = r1.j     // Catch:{ all -> 0x0181 }
            r4 = 190(0xbe, float:2.66E-43)
            if (r3 == r4) goto L_0x0114
            r4 = 400(0x190, float:5.6E-43)
            if (r3 == r4) goto L_0x0111
            r4 = 406(0x196, float:5.69E-43)
            if (r3 == r4) goto L_0x010e
            switch(r3) {
                case 192: goto L_0x010b;
                case 193: goto L_0x0108;
                case 194: goto L_0x0105;
                case 195: goto L_0x0102;
                case 196: goto L_0x00ff;
                default: goto L_0x00be;
            }     // Catch:{ all -> 0x0181 }
        L_0x00be:
            switch(r3) {
                case 198: goto L_0x00fc;
                case 199: goto L_0x00f9;
                case 200: goto L_0x00f6;
                default: goto L_0x00c1;
            }     // Catch:{ all -> 0x0181 }
        L_0x00c1:
            switch(r3) {
                case 411: goto L_0x00f3;
                case 412: goto L_0x00f0;
                default: goto L_0x00c4;
            }     // Catch:{ all -> 0x0181 }
        L_0x00c4:
            switch(r3) {
                case 488: goto L_0x00ed;
                case 489: goto L_0x00ea;
                case 490: goto L_0x00e7;
                case 491: goto L_0x00e4;
                case 492: goto L_0x00e1;
                case 493: goto L_0x00de;
                case 494: goto L_0x00db;
                case 495: goto L_0x00d8;
                case 496: goto L_0x00d5;
                case 497: goto L_0x00d2;
                case 498: goto L_0x00cf;
                case 499: goto L_0x00cc;
                default: goto L_0x00c7;
            }     // Catch:{ all -> 0x0181 }
        L_0x00c7:
            java.lang.String r3 = java.lang.Integer.toString(r3)     // Catch:{ all -> 0x0181 }
            goto L_0x0116
        L_0x00cc:
            java.lang.String r3 = "HTTPS_DATA_ERROR"
            goto L_0x0116
        L_0x00cf:
            java.lang.String r3 = "BLOCKED"
            goto L_0x0116
        L_0x00d2:
            java.lang.String r3 = "TOO_MANY_REDIRECTS"
            goto L_0x0116
        L_0x00d5:
            java.lang.String r3 = "HTTP_EXCEPTION"
            goto L_0x0116
        L_0x00d8:
            java.lang.String r3 = "HTTP_DATA_ERROR"
            goto L_0x0116
        L_0x00db:
            java.lang.String r3 = "UNHANDLED_HTTP_CODE"
            goto L_0x0116
        L_0x00de:
            java.lang.String r3 = "UNHANDLED_REDIRECT"
            goto L_0x0116
        L_0x00e1:
            java.lang.String r3 = "FILE_ERROR"
            goto L_0x0116
        L_0x00e4:
            java.lang.String r3 = "UNKNOWN_ERROR"
            goto L_0x0116
        L_0x00e7:
            java.lang.String r3 = "CANCELED"
            goto L_0x0116
        L_0x00ea:
            java.lang.String r3 = "CANNOT_RESUME"
            goto L_0x0116
        L_0x00ed:
            java.lang.String r3 = "FILE_ALREADY_EXISTS_ERROR"
            goto L_0x0116
        L_0x00f0:
            java.lang.String r3 = "PRECONDITION_FAILED"
            goto L_0x0116
        L_0x00f3:
            java.lang.String r3 = "LENGTH_REQUIRED"
            goto L_0x0116
        L_0x00f6:
            java.lang.String r3 = "SUCCESS"
            goto L_0x0116
        L_0x00f9:
            java.lang.String r3 = "DEVICE_NOT_FOUND_ERROR"
            goto L_0x0116
        L_0x00fc:
            java.lang.String r3 = "INSUFFICIENT_SPACE_ERROR"
            goto L_0x0116
        L_0x00ff:
            java.lang.String r3 = "QUEUED_FOR_WIFI"
            goto L_0x0116
        L_0x0102:
            java.lang.String r3 = "WAITING_FOR_NETWORK"
            goto L_0x0116
        L_0x0105:
            java.lang.String r3 = "WAITING_TO_RETRY"
            goto L_0x0116
        L_0x0108:
            java.lang.String r3 = "PAUSED_BY_APP"
            goto L_0x0116
        L_0x010b:
            java.lang.String r3 = "RUNNING"
            goto L_0x0116
        L_0x010e:
            java.lang.String r3 = "NOT_ACCEPTABLE"
            goto L_0x0116
        L_0x0111:
            java.lang.String r3 = "BAD_REQUEST"
            goto L_0x0116
        L_0x0114:
            java.lang.String r3 = "PENDING"
        L_0x0116:
            r8.a(r2, r3)     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = "mCurrentBytes"
            long r3 = r1.t     // Catch:{ all -> 0x0181 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0181 }
            r8.a(r2, r3)     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = "mTotalBytes"
            long r3 = r1.s     // Catch:{ all -> 0x0181 }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0181 }
            r8.a(r2, r3)     // Catch:{ all -> 0x0181 }
            r8.println()     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = "mNumFailed"
            int r3 = r1.k     // Catch:{ all -> 0x0181 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0181 }
            r8.a(r2, r3)     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = "mRetryAfter"
            int r3 = r1.l     // Catch:{ all -> 0x0181 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0181 }
            r8.a(r2, r3)     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = "mETag"
            java.lang.String r3 = r1.u     // Catch:{ all -> 0x0181 }
            r8.a(r2, r3)     // Catch:{ all -> 0x0181 }
            r8.println()     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = "mAllowedNetworkTypes"
            int r3 = r1.y     // Catch:{ all -> 0x0181 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0181 }
            r8.a(r2, r3)     // Catch:{ all -> 0x0181 }
            java.lang.String r2 = "mAllowRoaming"
            boolean r1 = r1.z     // Catch:{ all -> 0x0181 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0181 }
            r8.a(r2, r1)     // Catch:{ all -> 0x0181 }
            r8.println()     // Catch:{ all -> 0x0181 }
            java.lang.StringBuilder r1 = r8.f28883b     // Catch:{ all -> 0x0181 }
            r2 = 0
            java.lang.String r3 = r8.f28882a     // Catch:{ all -> 0x0181 }
            int r3 = r3.length()     // Catch:{ all -> 0x0181 }
            r1.delete(r2, r3)     // Catch:{ all -> 0x0181 }
            r8.f28884c = r6     // Catch:{ all -> 0x0181 }
            goto L_0x001d
        L_0x017b:
            monitor-exit(r7)     // Catch:{ all -> 0x0181 }
            r8.close()     // Catch:{ Exception -> 0x0180 }
            return
        L_0x0180:
            return
        L_0x0181:
            r6 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0181 }
            throw r6     // Catch:{ Exception -> 0x0186, all -> 0x0184 }
        L_0x0184:
            r6 = move-exception
            goto L_0x018b
        L_0x0186:
            r6 = r8
            goto L_0x0191
        L_0x0188:
            r7 = move-exception
            r8 = r6
            r6 = r7
        L_0x018b:
            if (r8 == 0) goto L_0x0190
            r8.close()     // Catch:{ Exception -> 0x0190 }
        L_0x0190:
            throw r6
        L_0x0191:
            if (r6 == 0) goto L_0x0198
            r6.close()     // Catch:{ Exception -> 0x0197 }
            goto L_0x0198
        L_0x0197:
            return
        L_0x0198:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.core.download.DownloadService.dump(java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }
}
