package com.ss.android.socialbase.downloader.d;

import android.app.AlarmManager;
import android.os.Handler;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.socialbase.downloader.constants.j;
import com.ss.android.socialbase.downloader.depend.m;
import com.ss.android.socialbase.downloader.depend.r;
import com.ss.android.socialbase.downloader.downloader.d;
import com.ss.android.socialbase.downloader.downloader.e;
import com.ss.android.socialbase.downloader.downloader.f;
import com.ss.android.socialbase.downloader.downloader.g;
import com.ss.android.socialbase.downloader.downloader.i;
import com.ss.android.socialbase.downloader.downloader.p;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.model.b;
import com.ss.android.socialbase.downloader.network.IDownloadHttpConnection;
import com.tencent.bugly.CrashModule;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SSLHandshakeException;

public class c implements e, Runnable {

    /* renamed from: d  reason: collision with root package name */
    private static final String f30864d = "c";
    private volatile int A = 5;
    private boolean B = false;
    private boolean C = false;
    private String D;

    /* renamed from: a  reason: collision with root package name */
    public final DownloadTask f30865a;

    /* renamed from: b  reason: collision with root package name */
    DownloadInfo f30866b;

    /* renamed from: c  reason: collision with root package name */
    public final e f30867c;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f30868e;

    /* renamed from: f  reason: collision with root package name */
    private AtomicInteger f30869f;
    private final ArrayList<b> g = new ArrayList<>();
    private d h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private final AtomicBoolean n;
    private volatile j o = j.RUN_STATUS_NONE;
    private final i p;
    private final g q;
    private final f r;
    private p s;
    private AlarmManager t;
    private volatile BaseException u;
    private g v;
    private IDownloadHttpConnection w;
    private com.ss.android.socialbase.downloader.network.c x;
    private r y;
    private m z;

    class a extends Throwable {
        private String errorMsg;

        public final String getErrorMsg() {
            return this.errorMsg;
        }

        public final void setErrorMsg(String str) {
            this.errorMsg = str;
        }

        public a(String str) {
            super(str);
            this.errorMsg = str;
        }
    }

    public final void a() {
        this.o = j.RUN_STATUS_PAUSE;
        if (this.h != null) {
            this.h.a();
        } else {
            k();
            this.o = j.RUN_STATUS_PAUSE;
            h();
        }
        try {
            Iterator it2 = ((ArrayList) this.g.clone()).iterator();
            while (it2.hasNext()) {
                b bVar = (b) it2.next();
                if (bVar != null) {
                    bVar.a();
                }
            }
        } catch (Throwable unused) {
        }
    }

    private boolean a(int i2, String str, String str2) {
        if (i2 == 412) {
            return true;
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !str.equals(str2) && (this.l || this.k)) {
            return true;
        }
        if ((i2 == 201 || i2 == 416) && this.f30866b.getCurBytes() > 0) {
            return true;
        }
        return false;
    }

    public final boolean a(BaseException baseException) {
        if (com.ss.android.socialbase.downloader.e.d.b(baseException)) {
            if (this.i && !this.f30868e) {
                com.ss.android.socialbase.downloader.e.d.a(this.f30866b);
                this.f30868e = true;
            }
            return true;
        } else if (((this.f30869f == null || this.f30869f.get() <= 0) && !this.f30866b.hasOtherBackupUrl() && (baseException.getCause() == null || !(baseException.getCause() instanceof SSLHandshakeException) || !this.f30866b.canReplaceHttpForRetry())) || (baseException instanceof com.ss.android.socialbase.downloader.exception.f)) {
            return false;
        } else {
            return true;
        }
    }

    public final void a(BaseException baseException, boolean z2) {
        this.o = j.RUN_STATUS_ALL_CHUNK_RETRY_WITH_RESET;
        this.u = baseException;
        try {
            Iterator it2 = ((ArrayList) this.g.clone()).iterator();
            while (it2.hasNext()) {
                b bVar = (b) it2.next();
                if (bVar != null) {
                    bVar.b();
                }
            }
        } catch (Throwable unused) {
        }
        boolean z3 = false;
        if (z2) {
            z3 = c(baseException);
        }
        if (!z3) {
            q();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e0, code lost:
        if (c(r9) == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e4, code lost:
        return com.ss.android.socialbase.downloader.exception.g.RETURN;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x012b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ss.android.socialbase.downloader.exception.g a(com.ss.android.socialbase.downloader.exception.BaseException r9, long r10) {
        /*
            r8 = this;
            r8.u = r9
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r8.f30866b
            long r10 = -r10
            r0.increaseCurBytes(r10)
            com.ss.android.socialbase.downloader.downloader.i r10 = r8.p
            com.ss.android.socialbase.downloader.model.DownloadInfo r11 = r8.f30866b
            r10.a((com.ss.android.socialbase.downloader.model.DownloadInfo) r11)
            boolean r10 = r8.l()
            if (r10 == 0) goto L_0x0018
            com.ss.android.socialbase.downloader.exception.g r9 = com.ss.android.socialbase.downloader.exception.g.RETURN
            return r9
        L_0x0018:
            int r10 = r9.getErrorCode()
            r11 = 1047(0x417, float:1.467E-42)
            r0 = 1
            r1 = 0
            if (r10 != r11) goto L_0x0051
            com.ss.android.socialbase.downloader.depend.r r10 = r8.y
            if (r10 != 0) goto L_0x002f
            boolean r10 = r8.c(r9)
            if (r10 == 0) goto L_0x007d
            com.ss.android.socialbase.downloader.exception.g r9 = com.ss.android.socialbase.downloader.exception.g.RETURN
            return r9
        L_0x002f:
            com.ss.android.socialbase.downloader.d.c$1 r10 = new com.ss.android.socialbase.downloader.d.c$1
            r10.<init>()
            com.ss.android.socialbase.downloader.depend.r r11 = r8.y
            boolean r11 = r11.a(r10)
            if (r11 == 0) goto L_0x007d
            boolean r10 = r10.a()
            if (r10 != 0) goto L_0x004e
            com.ss.android.socialbase.downloader.downloader.e r9 = r8.f30867c
            r9.d()
            com.ss.android.socialbase.downloader.constants.j r9 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_WAITING_ASYNC_HANDLER
            r8.o = r9
            com.ss.android.socialbase.downloader.exception.g r9 = com.ss.android.socialbase.downloader.exception.g.RETURN
            return r9
        L_0x004e:
            r10 = 1
            goto L_0x00e5
        L_0x0051:
            int r10 = r9.getErrorCode()
            r11 = 1006(0x3ee, float:1.41E-42)
            if (r10 == r11) goto L_0x007f
            int r10 = r9.getErrorCode()
            r11 = 1023(0x3ff, float:1.434E-42)
            if (r10 != r11) goto L_0x0074
            java.lang.String r10 = r9.getErrorMessage()
            if (r10 == 0) goto L_0x0074
            java.lang.String r10 = r9.getErrorMessage()
            java.lang.String r11 = "ENOSPC"
            boolean r10 = r10.contains(r11)
            if (r10 == 0) goto L_0x0074
            goto L_0x007f
        L_0x0074:
            boolean r10 = r8.c(r9)
            if (r10 == 0) goto L_0x007d
            com.ss.android.socialbase.downloader.exception.g r9 = com.ss.android.socialbase.downloader.exception.g.RETURN
            return r9
        L_0x007d:
            r10 = 0
            goto L_0x00e5
        L_0x007f:
            com.ss.android.socialbase.downloader.depend.m r10 = r8.z
            if (r10 != 0) goto L_0x0089
            r8.b(r9)
            com.ss.android.socialbase.downloader.exception.g r9 = com.ss.android.socialbase.downloader.exception.g.RETURN
            return r9
        L_0x0089:
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r10.<init>(r1)
            com.ss.android.socialbase.downloader.d.c$2 r7 = new com.ss.android.socialbase.downloader.d.c$2
            r7.<init>(r10)
            boolean r11 = r9 instanceof com.ss.android.socialbase.downloader.exception.d
            r2 = -1
            if (r11 == 0) goto L_0x00a7
            r11 = r9
            com.ss.android.socialbase.downloader.exception.d r11 = (com.ss.android.socialbase.downloader.exception.d) r11
            long r2 = r11.getAvaliableSpaceBytes()
            long r4 = r11.getRequiredSpaceBytes()
            r5 = r4
            r3 = r2
            goto L_0x00a9
        L_0x00a7:
            r5 = r2
            r3 = r5
        L_0x00a9:
            monitor-enter(r8)
            com.ss.android.socialbase.downloader.depend.m r2 = r8.z     // Catch:{ all -> 0x012e }
            boolean r11 = r2.a(r3, r5, r7)     // Catch:{ all -> 0x012e }
            if (r11 == 0) goto L_0x00d0
            r8.o()     // Catch:{ all -> 0x012e }
            boolean r10 = r10.get()     // Catch:{ all -> 0x012e }
            if (r10 != 0) goto L_0x00ce
            com.ss.android.socialbase.downloader.constants.j r9 = r8.o     // Catch:{ all -> 0x012e }
            com.ss.android.socialbase.downloader.constants.j r10 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_WAITING_ASYNC_HANDLER     // Catch:{ all -> 0x012e }
            if (r9 == r10) goto L_0x00ca
            com.ss.android.socialbase.downloader.constants.j r9 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_WAITING_ASYNC_HANDLER     // Catch:{ all -> 0x012e }
            r8.o = r9     // Catch:{ all -> 0x012e }
            com.ss.android.socialbase.downloader.downloader.e r9 = r8.f30867c     // Catch:{ all -> 0x012e }
            r9.d()     // Catch:{ all -> 0x012e }
        L_0x00ca:
            com.ss.android.socialbase.downloader.exception.g r9 = com.ss.android.socialbase.downloader.exception.g.RETURN     // Catch:{ all -> 0x012e }
            monitor-exit(r8)     // Catch:{ all -> 0x012e }
            return r9
        L_0x00ce:
            r10 = 1
            goto L_0x00db
        L_0x00d0:
            com.ss.android.socialbase.downloader.constants.j r10 = r8.o     // Catch:{ all -> 0x012e }
            com.ss.android.socialbase.downloader.constants.j r11 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_WAITING_ASYNC_HANDLER     // Catch:{ all -> 0x012e }
            if (r10 != r11) goto L_0x00da
            com.ss.android.socialbase.downloader.exception.g r9 = com.ss.android.socialbase.downloader.exception.g.RETURN     // Catch:{ all -> 0x012e }
            monitor-exit(r8)     // Catch:{ all -> 0x012e }
            return r9
        L_0x00da:
            r10 = 0
        L_0x00db:
            monitor-exit(r8)     // Catch:{ all -> 0x012e }
            boolean r11 = r8.c(r9)
            if (r11 == 0) goto L_0x00e5
            com.ss.android.socialbase.downloader.exception.g r9 = com.ss.android.socialbase.downloader.exception.g.RETURN
            return r9
        L_0x00e5:
            if (r10 != 0) goto L_0x0115
            com.ss.android.socialbase.downloader.constants.j r10 = r8.o
            com.ss.android.socialbase.downloader.constants.j r11 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_RETRY_DELAY
            if (r10 == r11) goto L_0x0115
            android.app.AlarmManager r10 = r8.t
            if (r10 == 0) goto L_0x0115
            com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r8.f30866b
            boolean r10 = r10.isNeedRetryDelay()
            if (r10 == 0) goto L_0x0115
            com.ss.android.socialbase.downloader.downloader.p r10 = r8.s
            com.ss.android.socialbase.downloader.model.DownloadInfo r11 = r8.f30866b
            int r11 = r11.getCurRetryTime()
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r8.f30866b
            int r2 = r2.getRetryCount()
            long r10 = r10.a(r11, r2)
            r2 = 0
            int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0115
            com.ss.android.socialbase.downloader.constants.j r10 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_RETRY_DELAY
            r8.o = r10
        L_0x0115:
            com.ss.android.socialbase.downloader.downloader.e r10 = r8.f30867c
            com.ss.android.socialbase.downloader.constants.j r11 = r8.o
            com.ss.android.socialbase.downloader.constants.j r2 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_RETRY_DELAY
            if (r11 != r2) goto L_0x011e
            goto L_0x011f
        L_0x011e:
            r0 = 0
        L_0x011f:
            r10.a((com.ss.android.socialbase.downloader.exception.BaseException) r9, (boolean) r0)
            com.ss.android.socialbase.downloader.constants.j r9 = r8.o
            com.ss.android.socialbase.downloader.constants.j r10 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_RETRY_DELAY
            if (r9 != r10) goto L_0x012b
            com.ss.android.socialbase.downloader.exception.g r9 = com.ss.android.socialbase.downloader.exception.g.RETURN
            return r9
        L_0x012b:
            com.ss.android.socialbase.downloader.exception.g r9 = com.ss.android.socialbase.downloader.exception.g.CONTINUE
            return r9
        L_0x012e:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x012e }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.d.c.a(com.ss.android.socialbase.downloader.exception.BaseException, long):com.ss.android.socialbase.downloader.exception.g");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0144, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x013d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00f8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.ss.android.socialbase.downloader.model.b a(int r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r11.f30866b     // Catch:{ all -> 0x0145 }
            int r0 = r0.getChunkCount()     // Catch:{ all -> 0x0145 }
            r1 = 2
            r2 = 0
            if (r0 >= r1) goto L_0x000d
            monitor-exit(r11)
            return r2
        L_0x000d:
            com.ss.android.socialbase.downloader.downloader.i r0 = r11.p     // Catch:{ all -> 0x0145 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r11.f30866b     // Catch:{ all -> 0x0145 }
            int r1 = r1.getId()     // Catch:{ all -> 0x0145 }
            java.util.List r0 = r0.c((int) r1)     // Catch:{ all -> 0x0145 }
            if (r0 == 0) goto L_0x0143
            boolean r1 = r0.isEmpty()     // Catch:{ all -> 0x0145 }
            if (r1 == 0) goto L_0x0023
            goto L_0x0143
        L_0x0023:
            r1 = 0
            r3 = 0
        L_0x0025:
            int r4 = r0.size()     // Catch:{ all -> 0x0145 }
            if (r3 >= r4) goto L_0x0141
            java.lang.Object r4 = r0.get(r3)     // Catch:{ all -> 0x0145 }
            com.ss.android.socialbase.downloader.model.b r4 = (com.ss.android.socialbase.downloader.model.b) r4     // Catch:{ all -> 0x0145 }
            if (r4 == 0) goto L_0x013d
            boolean r5 = r4.b()     // Catch:{ all -> 0x0145 }
            if (r5 == 0) goto L_0x0138
            r5 = 1
            long r6 = r4.b(r5)     // Catch:{ all -> 0x0145 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0145 }
            java.lang.String r9 = "reuseChunk retainLen:"
            r8.<init>(r9)     // Catch:{ all -> 0x0145 }
            r8.append(r6)     // Catch:{ all -> 0x0145 }
            java.lang.String r9 = " chunkIndex:"
            r8.append(r9)     // Catch:{ all -> 0x0145 }
            r8.append(r12)     // Catch:{ all -> 0x0145 }
            boolean r8 = r4.d()     // Catch:{ all -> 0x0145 }
            if (r8 != 0) goto L_0x008c
            long r8 = com.ss.android.socialbase.downloader.constants.e.f30852a     // Catch:{ all -> 0x0145 }
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x008c
            com.ss.android.socialbase.downloader.model.DownloadInfo r6 = r11.f30866b     // Catch:{ all -> 0x0145 }
            boolean r6 = r6.isNeedReuseChunkRunnable()     // Catch:{ all -> 0x0145 }
            if (r6 == 0) goto L_0x008c
            com.ss.android.socialbase.downloader.model.DownloadInfo r6 = r11.f30866b     // Catch:{ all -> 0x0145 }
            int r6 = r6.getChunkCount()     // Catch:{ all -> 0x0145 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r11.f30866b     // Catch:{ all -> 0x0145 }
            long r7 = r7.getTotalBytes()     // Catch:{ all -> 0x0145 }
            java.util.List r6 = r4.a(r6, r7)     // Catch:{ all -> 0x0145 }
            if (r6 == 0) goto L_0x0092
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0145 }
        L_0x007a:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0145 }
            if (r7 == 0) goto L_0x0092
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0145 }
            com.ss.android.socialbase.downloader.model.b r7 = (com.ss.android.socialbase.downloader.model.b) r7     // Catch:{ all -> 0x0145 }
            com.ss.android.socialbase.downloader.downloader.i r8 = r11.p     // Catch:{ all -> 0x0145 }
            r8.b((com.ss.android.socialbase.downloader.model.b) r7)     // Catch:{ all -> 0x0145 }
            goto L_0x007a
        L_0x008c:
            boolean r6 = r4.d()     // Catch:{ all -> 0x0145 }
            if (r6 == 0) goto L_0x0094
        L_0x0092:
            r6 = 1
            goto L_0x0095
        L_0x0094:
            r6 = 0
        L_0x0095:
            if (r6 == 0) goto L_0x0138
            boolean r6 = r4.d()     // Catch:{ all -> 0x0145 }
            if (r6 == 0) goto L_0x0138
            r6 = 1
        L_0x009e:
            java.util.List<com.ss.android.socialbase.downloader.model.b> r7 = r4.g     // Catch:{ all -> 0x0145 }
            int r7 = r7.size()     // Catch:{ all -> 0x0145 }
            if (r6 >= r7) goto L_0x00f8
            java.util.List<com.ss.android.socialbase.downloader.model.b> r7 = r4.g     // Catch:{ all -> 0x0145 }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ all -> 0x0145 }
            com.ss.android.socialbase.downloader.model.b r7 = (com.ss.android.socialbase.downloader.model.b) r7     // Catch:{ all -> 0x0145 }
            if (r7 == 0) goto L_0x00f5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0145 }
            java.lang.String r9 = "check can checkUnCompletedChunk -- chunkIndex:"
            r8.<init>(r9)     // Catch:{ all -> 0x0145 }
            int r9 = r7.f31057e     // Catch:{ all -> 0x0145 }
            r8.append(r9)     // Catch:{ all -> 0x0145 }
            java.lang.String r9 = " currentOffset:"
            r8.append(r9)     // Catch:{ all -> 0x0145 }
            long r9 = r7.i()     // Catch:{ all -> 0x0145 }
            r8.append(r9)     // Catch:{ all -> 0x0145 }
            java.lang.String r9 = "  startOffset:"
            r8.append(r9)     // Catch:{ all -> 0x0145 }
            long r9 = r7.f31054b     // Catch:{ all -> 0x0145 }
            r8.append(r9)     // Catch:{ all -> 0x0145 }
            java.lang.String r9 = " contentLen:"
            r8.append(r9)     // Catch:{ all -> 0x0145 }
            long r9 = r7.f31056d     // Catch:{ all -> 0x0145 }
            r8.append(r9)     // Catch:{ all -> 0x0145 }
            int r8 = r7.f31057e     // Catch:{ all -> 0x0145 }
            if (r8 < 0) goto L_0x00f9
            boolean r8 = r7.f()     // Catch:{ all -> 0x0145 }
            if (r8 != 0) goto L_0x00f5
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.k     // Catch:{ all -> 0x0145 }
            if (r8 != 0) goto L_0x00ec
            r8 = 0
            goto L_0x00f2
        L_0x00ec:
            java.util.concurrent.atomic.AtomicBoolean r8 = r7.k     // Catch:{ all -> 0x0145 }
            boolean r8 = r8.get()     // Catch:{ all -> 0x0145 }
        L_0x00f2:
            if (r8 != 0) goto L_0x00f5
            goto L_0x00f9
        L_0x00f5:
            int r6 = r6 + 1
            goto L_0x009e
        L_0x00f8:
            r7 = r2
        L_0x00f9:
            if (r7 == 0) goto L_0x0139
            long r8 = r4.i()     // Catch:{ all -> 0x0145 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0145 }
            java.lang.String r10 = "unComplete chunk "
            r6.<init>(r10)     // Catch:{ all -> 0x0145 }
            int r4 = r4.f31057e     // Catch:{ all -> 0x0145 }
            r6.append(r4)     // Catch:{ all -> 0x0145 }
            java.lang.String r4 = " curOffset:"
            r6.append(r4)     // Catch:{ all -> 0x0145 }
            r6.append(r8)     // Catch:{ all -> 0x0145 }
            java.lang.String r4 = " reuseChunk chunkIndex:"
            r6.append(r4)     // Catch:{ all -> 0x0145 }
            r6.append(r12)     // Catch:{ all -> 0x0145 }
            java.lang.String r4 = " for subChunk:"
            r6.append(r4)     // Catch:{ all -> 0x0145 }
            int r4 = r7.f31057e     // Catch:{ all -> 0x0145 }
            r6.append(r4)     // Catch:{ all -> 0x0145 }
            com.ss.android.socialbase.downloader.downloader.i r4 = r11.p     // Catch:{ all -> 0x0145 }
            int r6 = r7.f31053a     // Catch:{ all -> 0x0145 }
            int r8 = r7.f31057e     // Catch:{ all -> 0x0145 }
            int r9 = r7.a()     // Catch:{ all -> 0x0145 }
            r4.a((int) r6, (int) r8, (int) r9, (int) r12)     // Catch:{ all -> 0x0145 }
            r7.f31057e = r12     // Catch:{ all -> 0x0145 }
            r7.a((boolean) r5)     // Catch:{ all -> 0x0145 }
            goto L_0x0139
        L_0x0138:
            r7 = r2
        L_0x0139:
            if (r7 == 0) goto L_0x013d
            monitor-exit(r11)
            return r7
        L_0x013d:
            int r3 = r3 + 1
            goto L_0x0025
        L_0x0141:
            monitor-exit(r11)
            return r2
        L_0x0143:
            monitor-exit(r11)
            return r2
        L_0x0145:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.d.c.a(int):com.ss.android.socialbase.downloader.model.b");
    }

    private void k() {
        i();
        j();
    }

    public final boolean d() {
        return this.n.get();
    }

    public final int e() {
        return this.f30866b.getId();
    }

    private void i() {
        if (this.x != null) {
            this.x.b();
            this.x = null;
        }
    }

    private void j() {
        if (this.w != null) {
            this.w.end();
            this.w = null;
        }
    }

    private boolean l() {
        if (this.o == j.RUN_STATUS_CANCELED || this.o == j.RUN_STATUS_PAUSE) {
            return true;
        }
        return false;
    }

    private void f() {
        if (this.f30866b != null) {
            int retryCount = this.f30866b.getRetryCount() - this.f30866b.getCurRetryTime();
            if (retryCount < 0) {
                retryCount = 0;
            }
            if (this.f30869f == null) {
                this.f30869f = new AtomicInteger(retryCount);
            } else {
                this.f30869f.set(retryCount);
            }
        }
    }

    private void h() {
        boolean z2;
        boolean z3;
        try {
            z3 = m();
            z2 = false;
        } catch (Exception e2) {
            if (e2 instanceof BaseException) {
                this.f30867c.a((BaseException) e2);
            } else {
                this.f30867c.a(new BaseException(1046, (Throwable) e2));
            }
            z3 = true;
            z2 = true;
        }
        if (z3 || z2) {
            this.n.set(false);
        } else {
            this.B = true;
        }
    }

    private void q() {
        try {
            this.p.d(this.f30866b.getId());
            com.ss.android.socialbase.downloader.e.d.a(this.f30866b);
            this.j = false;
            this.f30866b.resetDataForEtagEndure("");
            this.p.a(this.f30866b);
        } catch (Throwable unused) {
        }
    }

    public final void b() {
        this.o = j.RUN_STATUS_CANCELED;
        if (this.h != null) {
            this.h.b();
        } else {
            k();
            this.o = j.RUN_STATUS_CANCELED;
            h();
        }
        try {
            Iterator it2 = ((ArrayList) this.g.clone()).iterator();
            while (it2.hasNext()) {
                b bVar = (b) it2.next();
                if (bVar != null) {
                    bVar.b();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        if (!l() && this.f30866b.getStatus() != -2) {
            return false;
        }
        if (!l()) {
            if (this.f30866b.getStatus() == -2) {
                this.o = j.RUN_STATUS_PAUSE;
            } else if (this.f30866b.getStatus() == -4) {
                this.o = j.RUN_STATUS_CANCELED;
            }
        }
        return true;
    }

    private boolean n() {
        if (this.f30866b.getChunkCount() > 1) {
            List<b> c2 = this.p.c(this.f30866b.getId());
            if (c2 == null || c2.size() <= 1) {
                return false;
            }
            for (b next : c2) {
                if (next != null) {
                    if (!next.f()) {
                    }
                }
                return false;
            }
            return true;
        } else if (this.f30866b.getCurBytes() <= 0 || this.f30866b.getCurBytes() != this.f30866b.getTotalBytes()) {
            return false;
        } else {
            return true;
        }
    }

    private boolean o() {
        if (this.f30866b.isChunked()) {
            this.f30866b.setTotalBytes(this.f30866b.getCurBytes());
        }
        if (this.f30866b.getCurBytes() > 0 && (this.f30866b.isIgnoreDataVerify() || (this.f30866b.getTotalBytes() > 0 && this.f30866b.getCurBytes() == this.f30866b.getTotalBytes()))) {
            return true;
        }
        this.f30866b.setByteInvalidRetryStatus(com.ss.android.socialbase.downloader.constants.b.BYTE_INVALID_RETRY_STATUS_RESTART);
        this.f30866b.reset();
        this.p.a(this.f30866b);
        this.p.d(this.f30866b.getId());
        com.ss.android.socialbase.downloader.e.d.a(this.f30866b);
        return false;
    }

    private void p() throws a, BaseException {
        int id = this.f30866b.getId();
        int a2 = com.ss.android.socialbase.downloader.downloader.b.a(this.f30866b);
        if (!this.f30866b.isDownloaded()) {
            DownloadInfo b2 = this.p.b(a2);
            if (b2 != null) {
                com.ss.android.socialbase.downloader.impls.a m2 = com.ss.android.socialbase.downloader.downloader.b.m();
                if (m2 != null && b2.getId() != id && b2.equalsTask(this.f30866b)) {
                    if (!m2.a(b2.getId())) {
                        List<b> c2 = this.p.c(a2);
                        com.ss.android.socialbase.downloader.e.d.a(this.f30866b);
                        this.p.f(a2);
                        if (b2 != null && b2.isBreakpointAvailable()) {
                            this.f30866b.copyFromCacheData(b2, false);
                            this.p.a(this.f30866b);
                            if (c2 != null) {
                                for (b next : c2) {
                                    next.f31053a = id;
                                    this.p.a(next);
                                }
                            }
                            throw new a("retry task because id generator changed");
                        }
                        return;
                    }
                    this.p.f(id);
                    throw new BaseException(1025, "another same task is downloading");
                }
                return;
            }
            return;
        }
        throw new BaseException(1009, "file has downloaded");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r7 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r7.f30865a     // Catch:{ Throwable -> 0x002d, all -> 0x002b }
            com.ss.android.socialbase.downloader.depend.s r0 = r0.getInterceptor()     // Catch:{ Throwable -> 0x002d, all -> 0x002b }
            if (r0 == 0) goto L_0x002d
            boolean r0 = r0.a()     // Catch:{ Throwable -> 0x002d, all -> 0x002b }
            if (r0 == 0) goto L_0x002d
            com.ss.android.socialbase.downloader.downloader.e r0 = r7.f30867c
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r0.f30922b
            r2 = -7
            r1.setStatus(r2)
            com.ss.android.socialbase.downloader.downloader.i r1 = r0.f30923c     // Catch:{ SQLiteException -> 0x0026 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r0.f30922b     // Catch:{ SQLiteException -> 0x0026 }
            int r3 = r3.getId()     // Catch:{ SQLiteException -> 0x0026 }
            r1.i(r3)     // Catch:{ SQLiteException -> 0x0026 }
        L_0x0026:
            r1 = 0
            r0.a((int) r2, (com.ss.android.socialbase.downloader.exception.BaseException) r1)
            return
        L_0x002b:
            r0 = move-exception
            throw r0
        L_0x002d:
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f30866b
            int r0 = r0.getStatus()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x005f
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r7.f30866b
            boolean r3 = r3.canSkipStatusHandler()
            if (r3 != 0) goto L_0x005f
            r3 = -2
            if (r0 == r3) goto L_0x005d
            r3 = -4
            if (r0 == r3) goto L_0x005d
            com.ss.android.socialbase.downloader.exception.BaseException r3 = new com.ss.android.socialbase.downloader.exception.BaseException
            r4 = 1000(0x3e8, float:1.401E-42)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "The download Task can't start, because its status is not prepare:"
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r3.<init>((int) r4, (java.lang.String) r0)
            r7.b(r3)
        L_0x005d:
            r0 = 0
            goto L_0x0060
        L_0x005f:
            r0 = 1
        L_0x0060:
            if (r0 != 0) goto L_0x0081
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r7.f30865a
            com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend r0 = r0.getMonitorDepend()
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r7.f30866b
            com.ss.android.socialbase.downloader.exception.BaseException r3 = new com.ss.android.socialbase.downloader.exception.BaseException
            r4 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r5 = "task status is invalid"
            r3.<init>((int) r4, (java.lang.String) r5)
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r7.f30866b
            if (r4 == 0) goto L_0x007d
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r7.f30866b
            int r1 = r1.getStatus()
        L_0x007d:
            com.ss.android.socialbase.downloader.c.a.a((com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend) r0, (com.ss.android.socialbase.downloader.model.DownloadInfo) r2, (com.ss.android.socialbase.downloader.exception.BaseException) r3, (int) r1)
            return
        L_0x0081:
            r7.g()
            boolean r0 = r7.B
            if (r0 == 0) goto L_0x0129
            int r0 = r7.A
            if (r0 <= 0) goto L_0x0092
            int r0 = r7.A
            int r0 = r0 - r2
            r7.A = r0
            goto L_0x0081
        L_0x0092:
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f30866b
            long r0 = r0.getCurBytes()
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r7.f30866b
            long r3 = r3.getTotalBytes()
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00c8
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f30866b
            r0.getErrorBytesLog()
            com.ss.android.socialbase.downloader.downloader.e r0 = r7.f30867c
            com.ss.android.socialbase.downloader.exception.f r1 = new com.ss.android.socialbase.downloader.exception.f
            r2 = 1027(0x403, float:1.439E-42)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "current bytes is not equals to total bytes, bytes invalid retry status is : "
            r3.<init>(r4)
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r7.f30866b
            com.ss.android.socialbase.downloader.constants.b r4 = r4.getByteInvalidRetryStatus()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            r0.a((com.ss.android.socialbase.downloader.exception.BaseException) r1)
            return
        L_0x00c8:
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f30866b
            long r0 = r0.getCurBytes()
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x00fa
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f30866b
            r0.getErrorBytesLog()
            com.ss.android.socialbase.downloader.downloader.e r0 = r7.f30867c
            com.ss.android.socialbase.downloader.exception.f r1 = new com.ss.android.socialbase.downloader.exception.f
            r2 = 1026(0x402, float:1.438E-42)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "curBytes is 0, bytes invalid retry status is : "
            r3.<init>(r4)
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r7.f30866b
            com.ss.android.socialbase.downloader.constants.b r4 = r4.getByteInvalidRetryStatus()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            r0.a((com.ss.android.socialbase.downloader.exception.BaseException) r1)
            return
        L_0x00fa:
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f30866b
            long r0 = r0.getTotalBytes()
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0081
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.f30866b
            r0.getErrorBytesLog()
            com.ss.android.socialbase.downloader.downloader.e r0 = r7.f30867c
            com.ss.android.socialbase.downloader.exception.f r1 = new com.ss.android.socialbase.downloader.exception.f
            r2 = 1044(0x414, float:1.463E-42)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "TotalBytes is 0, bytes invalid retry status is : "
            r3.<init>(r4)
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r7.f30866b
            com.ss.android.socialbase.downloader.constants.b r4 = r4.getByteInvalidRetryStatus()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r2, r3)
            r0.a((com.ss.android.socialbase.downloader.exception.BaseException) r1)
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.d.c.run():void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|(4:7|(4:15|(2:17|(1:19)(2:20|21))|22|(2:24|25)(2:26|(2:28|29)))(1:12)|13|(0))|30|31|40|48|(2:50|(1:52)(3:53|(1:55)|56))|57|(2:59|60)(3:61|62|(10:71|72|73|74|(1:76)|369|(8:82|83|84|85|86|(2:88|(6:90|(2:92|(1:94)(3:363|95|96))(2:97|(3:364|287|288))|99|(2:101|(1:103)(3:367|104|105))|106|(4:108|(9:110|(1:112)(1:113)|114|(5:(1:(1:120))(1:121)|123|(1:125)(1:126)|127|(1:129))|122|123|(0)(0)|127|(0))|130|(4:132|133|134|135)(12:136|137|(8:139|(1:141)(1:(2:145|(1:147)))|149|(2:153|154)|159|(1:161)(4:162|163|164|165)|166|(4:168|169|170|171)(12:172|173|(4:175|176|177|(6:179|(2:181|(1:183)(3:359|184|185))|186|187|188|189)(3:357|195|196))(1:203)|204|(2:207|(2:212|(7:216|(2:219|(1:(1:222)(1:223))(4:224|(1:226)(1:227)|228|(1:230)))|232|233|(1:235)|236|(4:238|239|240|241)(1:(4:(1:244)(1:245)|246|247|(2:249|(4:251|252|253|254)(7:255|256|(2:258|(1:260)(2:261|(1:263)(1:264)))|280|281|349|350))(2:265|(4:267|268|269|270)(7:271|272|(2:274|(1:276)(2:277|278))(1:279)|280|281|349|350)))(3:282|283|284))))(1:211))|217|(0)|232|233|(0)|236|(0)(0)))|148|149|151|153|154|159|(0)(0)|166|(0)(0)))(3:368|285|286))(3:362|289|290))(3:361|291|292)|77|78)|360|80|81)(4:65|(1:67)(1:68)|69|70))) */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x029f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        r1.f30866b.setHeadConnectionException(com.ss.android.socialbase.downloader.e.d.c(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x03a8, code lost:
        if (r5 <= 0) goto L_0x03aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x04b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x04b9, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x04c1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x04c2, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x04c7, code lost:
        if (r1.o != com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_PAUSE) goto L_0x04c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x04c9, code lost:
        b(new com.ss.android.socialbase.downloader.exception.BaseException(1045, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x04d4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x04d5, code lost:
        r4 = r0;
        new java.lang.StringBuilder("retry throwable for ").append(r4.getErrorMsg());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x04e8, code lost:
        if (r1.o != com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_PAUSE) goto L_0x04ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x04ed, code lost:
        if (r1.f30869f == null) goto L_0x0508;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x04f7, code lost:
        r1.f30866b.updateCurRetryTime(r1.f30869f.decrementAndGet());
        r1.f30866b.setStatus(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x050a, code lost:
        if (r1.f30869f != null) goto L_0x050c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0512, code lost:
        if (r1.f30866b.canRetryWithBackUpUrl() != false) goto L_0x0514;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0514, code lost:
        r1.f30866b.setStatus(5);
        r1.f30869f.set(r1.f30866b.getRetryCount());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:?, code lost:
        k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:?, code lost:
        b(new com.ss.android.socialbase.downloader.exception.BaseException(1018, java.lang.String.format("retry for Throwable, but retry Time %s all used, last error is %s", new java.lang.Object[]{java.lang.String.valueOf(r1.f30866b.getRetryCount()), r4.getErrorMsg()})));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0550, code lost:
        b(new com.ss.android.socialbase.downloader.exception.BaseException(1043, "retry for Throwable, but retain retry time is NULL, last error is" + r4.getErrorMsg()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x056e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x056f, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0575, code lost:
        if (r1.o != com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_PAUSE) goto L_0x0577;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x057d, code lost:
        if (r4.getErrorCode() == 1025) goto L_0x05b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0585, code lost:
        if (r4.getErrorCode() == 1009) goto L_0x0587;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x058c, code lost:
        if (a(r4) != false) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0592, code lost:
        if (com.ss.android.socialbase.downloader.e.d.a(r4) != false) goto L_0x0594;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0594, code lost:
        q();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x059f, code lost:
        if (a(r4, 0) == com.ss.android.socialbase.downloader.exception.g.RETURN) goto L_0x05a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:?, code lost:
        k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x05a4, code lost:
        h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x05a7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:?, code lost:
        b(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x05b0, code lost:
        r1.o = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_END_RIGHT_NOW;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:?, code lost:
        k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x05b7, code lost:
        h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x05ba, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:164:0x02bd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:201:0x033c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0070 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x0130 */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01f3 A[Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01f5 A[Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x01fc A[Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x02ae A[Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02b7 A[SYNTHETIC, Splitter:B:162:0x02b7] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02cd A[SYNTHETIC, Splitter:B:168:0x02cd] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02d4 A[SYNTHETIC, Splitter:B:172:0x02d4] */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x035d A[Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x03b1 A[Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x03d4 A[SYNTHETIC, Splitter:B:238:0x03d4] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0069 A[SYNTHETIC, Splitter:B:28:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x04b8 A[ExcHandler: BaseException (r0v5 'e' com.ss.android.socialbase.downloader.exception.BaseException A[CUSTOM_DECLARE]), Splitter:B:246:0x03e2] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x04c1 A[ExcHandler: Throwable (r0v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:83:0x013c] */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x04d4 A[Catch:{ all -> 0x04bd, all -> 0x05c3 }, ExcHandler: a (r0v2 'e' com.ss.android.socialbase.downloader.d.c$a A[CUSTOM_DECLARE, Catch:{ all -> 0x04bd, all -> 0x05c3 }]), Splitter:B:83:0x013c] */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0577 A[Catch:{ all -> 0x04bd, all -> 0x05c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g() {
        /*
            r20 = this;
            r1 = r20
            com.ss.android.socialbase.downloader.constants.j r2 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_NONE     // Catch:{ all -> 0x05c3 }
            r1.o = r2     // Catch:{ all -> 0x05c3 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f30866b     // Catch:{ all -> 0x05c3 }
            r2.updateStartDownloadTime()     // Catch:{ all -> 0x05c3 }
            r2 = 0
            r3 = 1
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f30866b     // Catch:{ a -> 0x009e, Throwable -> 0x0074 }
            int r4 = r4.getId()     // Catch:{ a -> 0x009e, Throwable -> 0x0074 }
            com.ss.android.socialbase.downloader.downloader.i r5 = r1.p     // Catch:{ a -> 0x009e, Throwable -> 0x0074 }
            if (r5 == 0) goto L_0x0070
            com.ss.android.socialbase.downloader.downloader.i r5 = r1.p     // Catch:{ a -> 0x009e, Throwable -> 0x0074 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r5.b((int) r4)     // Catch:{ a -> 0x009e, Throwable -> 0x0074 }
            if (r5 == 0) goto L_0x0025
            boolean r6 = r5.isNewTask()     // Catch:{ a -> 0x009e, Throwable -> 0x0074 }
            if (r6 != 0) goto L_0x0027
        L_0x0025:
            if (r5 != 0) goto L_0x002e
        L_0x0027:
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f30866b     // Catch:{ a -> 0x009e, Throwable -> 0x0074 }
            r4.reset()     // Catch:{ a -> 0x009e, Throwable -> 0x0074 }
        L_0x002c:
            r4 = 1
            goto L_0x0067
        L_0x002e:
            com.ss.android.socialbase.downloader.model.DownloadInfo r6 = r1.f30866b     // Catch:{ a -> 0x009e, Throwable -> 0x0074 }
            java.lang.String r6 = r6.getSavePath()     // Catch:{ a -> 0x009e, Throwable -> 0x0074 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r1.f30866b     // Catch:{ a -> 0x009e, Throwable -> 0x0074 }
            java.lang.String r7 = r7.getMd5()     // Catch:{ a -> 0x009e, Throwable -> 0x0074 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r8 = r1.f30866b     // Catch:{ a -> 0x009e, Throwable -> 0x0074 }
            r8.copyFromCacheData(r5, r3)     // Catch:{ a -> 0x009e, Throwable -> 0x0074 }
            java.lang.String r8 = r5.getSavePath()     // Catch:{ a -> 0x009e, Throwable -> 0x0074 }
            boolean r6 = r6.equals(r8)     // Catch:{ a -> 0x009e, Throwable -> 0x0074 }
            if (r6 == 0) goto L_0x005a
            boolean r6 = com.ss.android.socialbase.downloader.e.d.a((com.ss.android.socialbase.downloader.model.DownloadInfo) r5, (boolean) r2, (java.lang.String) r7)     // Catch:{ a -> 0x009e, Throwable -> 0x0074 }
            if (r6 != 0) goto L_0x0050
            goto L_0x005a
        L_0x0050:
            com.ss.android.socialbase.downloader.exception.a r4 = new com.ss.android.socialbase.downloader.exception.a     // Catch:{ a -> 0x009e, Throwable -> 0x0074 }
            java.lang.String r5 = r5.getName()     // Catch:{ a -> 0x009e, Throwable -> 0x0074 }
            r4.<init>(r5)     // Catch:{ a -> 0x009e, Throwable -> 0x0074 }
            throw r4     // Catch:{ a -> 0x009e, Throwable -> 0x0074 }
        L_0x005a:
            int r5 = com.ss.android.socialbase.downloader.downloader.b.a((com.ss.android.socialbase.downloader.model.DownloadInfo) r5)     // Catch:{ a -> 0x009e, Throwable -> 0x0074 }
            if (r5 == r4) goto L_0x0066
            com.ss.android.socialbase.downloader.downloader.i r5 = r1.p     // Catch:{ SQLiteException -> 0x002c }
            r5.f(r4)     // Catch:{ SQLiteException -> 0x002c }
            goto L_0x002c
        L_0x0066:
            r4 = 0
        L_0x0067:
            if (r4 == 0) goto L_0x0070
            com.ss.android.socialbase.downloader.downloader.i r4 = r1.p     // Catch:{ SQLiteException -> 0x0070 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r1.f30866b     // Catch:{ SQLiteException -> 0x0070 }
            r4.a((com.ss.android.socialbase.downloader.model.DownloadInfo) r5)     // Catch:{ SQLiteException -> 0x0070 }
        L_0x0070:
            r20.f()     // Catch:{ a -> 0x009e, Throwable -> 0x0074 }
            goto L_0x009c
        L_0x0074:
            r0 = move-exception
            r4 = r0
            com.ss.android.socialbase.downloader.model.DownloadTask r5 = r1.f30865a     // Catch:{ a -> 0x00a1 }
            if (r5 == 0) goto L_0x009c
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r1.f30866b     // Catch:{ a -> 0x00a1 }
            if (r5 == 0) goto L_0x009c
            com.ss.android.socialbase.downloader.model.DownloadTask r5 = r1.f30865a     // Catch:{ a -> 0x00a1 }
            com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend r5 = r5.getMonitorDepend()     // Catch:{ a -> 0x00a1 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r6 = r1.f30866b     // Catch:{ a -> 0x00a1 }
            com.ss.android.socialbase.downloader.exception.BaseException r7 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ a -> 0x00a1 }
            r8 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r9 = "checkTaskCache"
            java.lang.String r4 = com.ss.android.socialbase.downloader.e.d.b((java.lang.Throwable) r4, (java.lang.String) r9)     // Catch:{ a -> 0x00a1 }
            r7.<init>((int) r8, (java.lang.String) r4)     // Catch:{ a -> 0x00a1 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f30866b     // Catch:{ a -> 0x00a1 }
            int r4 = r4.getStatus()     // Catch:{ a -> 0x00a1 }
            com.ss.android.socialbase.downloader.c.a.a((com.ss.android.socialbase.downloader.depend.IDownloadMonitorDepend) r5, (com.ss.android.socialbase.downloader.model.DownloadInfo) r6, (com.ss.android.socialbase.downloader.exception.BaseException) r7, (int) r4)     // Catch:{ a -> 0x00a1 }
        L_0x009c:
            r4 = 0
            goto L_0x00b8
        L_0x009e:
            r0 = move-exception
            r4 = r0
            throw r4     // Catch:{ a -> 0x00a1 }
        L_0x00a1:
            r0 = move-exception
            r4 = r0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x05c3 }
            java.lang.String r6 = "file exist "
            r5.<init>(r6)     // Catch:{ all -> 0x05c3 }
            java.lang.String r6 = r4.getExistTargetFileName()     // Catch:{ all -> 0x05c3 }
            r5.append(r6)     // Catch:{ all -> 0x05c3 }
            java.lang.String r4 = r4.getExistTargetFileName()     // Catch:{ all -> 0x05c3 }
            r1.D = r4     // Catch:{ all -> 0x05c3 }
            r4 = 1
        L_0x00b8:
            boolean r5 = r1.B     // Catch:{ all -> 0x05c3 }
            r6 = 2
            if (r5 != 0) goto L_0x00e8
            com.ss.android.socialbase.downloader.downloader.e r5 = r1.f30867c     // Catch:{ all -> 0x05c3 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r5.f30922b     // Catch:{ all -> 0x05c3 }
            boolean r7 = r7.canSkipStatusHandler()     // Catch:{ all -> 0x05c3 }
            if (r7 == 0) goto L_0x00cd
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r5.f30922b     // Catch:{ all -> 0x05c3 }
            r5.changeSkipStatus()     // Catch:{ all -> 0x05c3 }
            goto L_0x00e8
        L_0x00cd:
            com.ss.android.socialbase.downloader.downloader.i r7 = r5.f30923c     // Catch:{ all -> 0x05c3 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r8 = r5.f30922b     // Catch:{ all -> 0x05c3 }
            int r8 = r8.getId()     // Catch:{ all -> 0x05c3 }
            r7.a((int) r8)     // Catch:{ all -> 0x05c3 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r5.f30922b     // Catch:{ all -> 0x05c3 }
            boolean r7 = r7.isFirstDownload()     // Catch:{ all -> 0x05c3 }
            r8 = 0
            if (r7 == 0) goto L_0x00e5
            r7 = 6
            r5.a((int) r7, (com.ss.android.socialbase.downloader.exception.BaseException) r8)     // Catch:{ all -> 0x05c3 }
        L_0x00e5:
            r5.a((int) r6, (com.ss.android.socialbase.downloader.exception.BaseException) r8)     // Catch:{ all -> 0x05c3 }
        L_0x00e8:
            r1.B = r2     // Catch:{ all -> 0x05c3 }
            boolean r5 = r20.c()     // Catch:{ all -> 0x05c3 }
            if (r5 == 0) goto L_0x00f4
            r20.h()
            return
        L_0x00f4:
            java.lang.String r5 = r1.D     // Catch:{ all -> 0x05c3 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x05c3 }
            if (r5 != 0) goto L_0x0119
            if (r4 == 0) goto L_0x0119
            java.lang.String r2 = r1.D     // Catch:{ all -> 0x05c3 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r1.f30866b     // Catch:{ all -> 0x05c3 }
            java.lang.String r3 = r3.getTargetFilePath()     // Catch:{ all -> 0x05c3 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x05c3 }
            if (r2 == 0) goto L_0x0111
            com.ss.android.socialbase.downloader.constants.j r2 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_END_RIGHT_NOW     // Catch:{ all -> 0x05c3 }
            r1.o = r2     // Catch:{ all -> 0x05c3 }
            goto L_0x0115
        L_0x0111:
            com.ss.android.socialbase.downloader.constants.j r2 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_END_FOR_FILE_EXIST     // Catch:{ all -> 0x05c3 }
            r1.o = r2     // Catch:{ all -> 0x05c3 }
        L_0x0115:
            r20.h()
            return
        L_0x0119:
            com.ss.android.socialbase.downloader.network.a r4 = com.ss.android.socialbase.downloader.network.a.a()     // Catch:{ all -> 0x05c3 }
            java.util.concurrent.atomic.AtomicInteger r5 = r4.f31070a     // Catch:{ Throwable -> 0x0130 }
            int r5 = r5.getAndIncrement()     // Catch:{ Throwable -> 0x0130 }
            if (r5 != 0) goto L_0x0130
            com.ss.android.socialbase.downloader.network.a$a r5 = r4.f31071b     // Catch:{ Throwable -> 0x0130 }
            r5.sendEmptyMessage(r3)     // Catch:{ Throwable -> 0x0130 }
            long r7 = android.os.SystemClock.uptimeMillis()     // Catch:{ Throwable -> 0x0130 }
            r4.f31072c = r7     // Catch:{ Throwable -> 0x0130 }
        L_0x0130:
            boolean r4 = r20.c()     // Catch:{ all -> 0x05c3 }
            if (r4 == 0) goto L_0x013a
            r20.h()
            return
        L_0x013a:
            r4 = 0
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r1.f30866b     // Catch:{ BaseException -> 0x056e, a -> 0x04d4, Throwable -> 0x04c1 }
            java.lang.String r7 = r7.getSavePath()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r7 != 0) goto L_0x04ae
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            java.lang.String r7 = r7.getName()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r7 != 0) goto L_0x04a4
            java.io.File r7 = new java.io.File     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r8 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            java.lang.String r8 = r8.getSavePath()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r7.<init>(r8)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            boolean r8 = r7.exists()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r8 != 0) goto L_0x0176
            boolean r7 = r7.mkdirs()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r7 == 0) goto L_0x016c
            goto L_0x017c
        L_0x016c:
            com.ss.android.socialbase.downloader.exception.BaseException r7 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r8 = 1030(0x406, float:1.443E-42)
            java.lang.String r9 = "download savePath directory can not created"
            r7.<init>((int) r8, (java.lang.String) r9)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            throw r7     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
        L_0x0176:
            boolean r7 = r7.isDirectory()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r7 == 0) goto L_0x049a
        L_0x017c:
            r20.p()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            boolean r7 = r7.isOnlyWifi()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r7 == 0) goto L_0x01a8
            android.content.Context r7 = com.ss.android.socialbase.downloader.downloader.b.q()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            java.lang.String r8 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r7 = com.ss.android.socialbase.downloader.e.d.a((android.content.Context) r7, (java.lang.String) r8)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r7 == 0) goto L_0x0194
            goto L_0x01a8
        L_0x0194:
            com.ss.android.socialbase.downloader.exception.f r7 = new com.ss.android.socialbase.downloader.exception.f     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r8 = 1019(0x3fb, float:1.428E-42)
            java.lang.String r9 = "download task need permission:%s"
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            java.lang.String r11 = "android.permission.ACCESS_NETWORK_STATE"
            r10[r2] = r11     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            java.lang.String r9 = java.lang.String.format(r9, r10)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r7.<init>(r8, r9)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            throw r7     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
        L_0x01a8:
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            boolean r7 = r7.isDownloadWithWifiValid()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r7 == 0) goto L_0x0494
            com.ss.android.socialbase.downloader.downloader.i r7 = r1.p     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r8 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            int r8 = r8.getId()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            java.util.List r7 = r7.c((int) r8)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r8 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r8 == 0) goto L_0x020c
            com.ss.android.socialbase.downloader.model.DownloadInfo r8 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            int r8 = r8.getChunkCount()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r8 <= r3) goto L_0x01ca
            r9 = 1
            goto L_0x01cb
        L_0x01ca:
            r9 = 0
        L_0x01cb:
            com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            boolean r10 = r10.isBreakpointAvailable()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r10 == 0) goto L_0x01e9
            if (r9 == 0) goto L_0x01e2
            if (r7 == 0) goto L_0x01e9
            int r9 = r7.size()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r8 != r9) goto L_0x01e9
            long r8 = com.ss.android.socialbase.downloader.e.d.b((java.util.List<com.ss.android.socialbase.downloader.model.b>) r7)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            goto L_0x01ea
        L_0x01e2:
            com.ss.android.socialbase.downloader.model.DownloadInfo r8 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            long r8 = r8.getCurBytes()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            goto L_0x01ea
        L_0x01e9:
            r8 = r4
        L_0x01ea:
            com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r10.setCurBytes(r8)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto L_0x01f5
            r8 = 1
            goto L_0x01f6
        L_0x01f5:
            r8 = 0
        L_0x01f6:
            r1.j = r8     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            boolean r8 = r1.j     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r8 != 0) goto L_0x020c
            com.ss.android.socialbase.downloader.downloader.i r8 = r1.p     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r9 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            int r9 = r9.getId()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r8.d(r9)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r8 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.e.d.a((com.ss.android.socialbase.downloader.model.DownloadInfo) r8)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
        L_0x020c:
            com.ss.android.socialbase.downloader.model.DownloadInfo r8 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            java.lang.String r8 = r8.getConnectionUrl()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            boolean r9 = r20.c()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r9 == 0) goto L_0x021f
            r20.k()     // Catch:{ all -> 0x05c3 }
            r20.h()
            return
        L_0x021f:
            boolean r9 = r1.j     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r9 == 0) goto L_0x0243
            com.ss.android.socialbase.downloader.model.DownloadInfo r9 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            int r9 = r9.getChunkCount()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r9 != r3) goto L_0x0232
            com.ss.android.socialbase.downloader.model.DownloadInfo r9 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            long r9 = r9.getCurBytes()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            goto L_0x0244
        L_0x0232:
            if (r7 == 0) goto L_0x0243
            int r9 = r7.size()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r9 <= r3) goto L_0x0243
            long r9 = r1.a((java.util.List<com.ss.android.socialbase.downloader.model.b>) r7)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r11 < 0) goto L_0x0243
            goto L_0x0244
        L_0x0243:
            r9 = r4
        L_0x0244:
            com.ss.android.socialbase.downloader.model.b$a r11 = new com.ss.android.socialbase.downloader.model.b$a     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r12 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            int r12 = r12.getId()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r11.<init>(r12)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r12 = -1
            com.ss.android.socialbase.downloader.model.b$a r11 = r11.a((int) r12)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.model.b$a r11 = r11.a((long) r4)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.model.b$a r11 = r11.e(r9)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.model.b$a r11 = r11.b(r9)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.model.b$a r11 = r11.c(r4)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r12 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            long r12 = r12.getTotalBytes()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r14 = 0
            long r12 = r12 - r9
            com.ss.android.socialbase.downloader.model.b$a r11 = r11.d(r12)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.model.b r11 = r11.a()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r12 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            java.util.List r13 = r12.getExtraHeaders()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r12 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            java.lang.String r14 = r12.geteTag()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            long r15 = r11.h()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            long r4 = r11.f31055c     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r17 = r4
            java.util.List r4 = com.ss.android.socialbase.downloader.e.d.a(r13, r14, r15, r17)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            boolean r5 = r1.C     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r5 != 0) goto L_0x02aa
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            boolean r5 = r5.isHeadConnectionAvailable()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r5 == 0) goto L_0x02aa
            com.ss.android.socialbase.downloader.network.c r5 = com.ss.android.socialbase.downloader.downloader.b.a((java.lang.String) r8, (java.util.List<com.ss.android.socialbase.downloader.model.HttpHeader>) r4)     // Catch:{ Throwable -> 0x029f, BaseException -> 0x04b8, a -> 0x04d4 }
            r1.x = r5     // Catch:{ Throwable -> 0x029f, BaseException -> 0x04b8, a -> 0x04d4 }
            goto L_0x02aa
        L_0x029f:
            r0 = move-exception
            r5 = r0
            com.ss.android.socialbase.downloader.model.DownloadInfo r12 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            java.lang.String r5 = com.ss.android.socialbase.downloader.e.d.c((java.lang.Throwable) r5)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r12.setHeadConnectionException(r5)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
        L_0x02aa:
            com.ss.android.socialbase.downloader.network.c r5 = r1.x     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r5 != 0) goto L_0x02b7
            r1.a((java.lang.String) r8, (java.util.List<com.ss.android.socialbase.downloader.model.HttpHeader>) r4)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.network.IDownloadHttpConnection r5 = r1.w     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r1.a((com.ss.android.socialbase.downloader.network.c) r5, (long) r9)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            goto L_0x02c7
        L_0x02b7:
            com.ss.android.socialbase.downloader.network.c r5 = r1.x     // Catch:{ Throwable -> 0x02bd, BaseException -> 0x04b8, a -> 0x04d4 }
            r1.a((com.ss.android.socialbase.downloader.network.c) r5, (long) r9)     // Catch:{ Throwable -> 0x02bd, BaseException -> 0x04b8, a -> 0x04d4 }
            goto L_0x02c7
        L_0x02bd:
            r1.C = r3     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r1.a((java.lang.String) r8, (java.util.List<com.ss.android.socialbase.downloader.model.HttpHeader>) r4)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.network.IDownloadHttpConnection r5 = r1.w     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r1.a((com.ss.android.socialbase.downloader.network.c) r5, (long) r9)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
        L_0x02c7:
            boolean r5 = r20.c()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r5 == 0) goto L_0x02d4
            r20.k()     // Catch:{ all -> 0x05c3 }
            r20.h()
            return
        L_0x02d4:
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            long r9 = r5.getTotalBytes()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            java.lang.String r5 = r5.getTempPath()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r12 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            java.lang.String r12 = r12.getTempName()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            boolean r13 = com.ss.android.socialbase.downloader.e.d.a((long) r9)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r13 != 0) goto L_0x033d
            com.ss.android.socialbase.downloader.model.c r13 = com.ss.android.socialbase.downloader.e.d.a((java.lang.String) r5, (java.lang.String) r12)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            java.io.File r14 = new java.io.File     // Catch:{ all -> 0x0337 }
            r14.<init>(r5, r12)     // Catch:{ all -> 0x0337 }
            long r14 = r14.length()     // Catch:{ all -> 0x0337 }
            r12 = 0
            long r14 = r9 - r14
            r19 = r7
            long r6 = com.ss.android.socialbase.downloader.e.d.a((java.lang.String) r5)     // Catch:{ all -> 0x0337 }
            int r5 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r5 < 0) goto L_0x0331
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r1.f30866b     // Catch:{ all -> 0x0337 }
            boolean r5 = r5.isForceIgnoreRecommendSize()     // Catch:{ all -> 0x0337 }
            if (r5 != 0) goto L_0x031e
            r5 = 2147483648(0x80000000, double:1.0609978955E-314)
            int r7 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x0318
            goto L_0x031e
        L_0x0318:
            com.ss.android.socialbase.downloader.exception.e r4 = new com.ss.android.socialbase.downloader.exception.e     // Catch:{ all -> 0x0337 }
            r4.<init>(r5, r14)     // Catch:{ all -> 0x0337 }
            throw r4     // Catch:{ all -> 0x0337 }
        L_0x031e:
            java.io.RandomAccessFile r5 = r13.f31067c     // Catch:{ IOException -> 0x0327 }
            r5.setLength(r9)     // Catch:{ IOException -> 0x0327 }
            r13.a()     // Catch:{ Exception -> 0x033f }
            goto L_0x033f
        L_0x0327:
            r0 = move-exception
            r4 = r0
            com.ss.android.socialbase.downloader.exception.BaseException r5 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ all -> 0x0337 }
            r6 = 1040(0x410, float:1.457E-42)
            r5.<init>((int) r6, (java.lang.Throwable) r4)     // Catch:{ all -> 0x0337 }
            throw r5     // Catch:{ all -> 0x0337 }
        L_0x0331:
            com.ss.android.socialbase.downloader.exception.d r4 = new com.ss.android.socialbase.downloader.exception.d     // Catch:{ all -> 0x0337 }
            r4.<init>(r6, r14)     // Catch:{ all -> 0x0337 }
            throw r4     // Catch:{ all -> 0x0337 }
        L_0x0337:
            r0 = move-exception
            r4 = r0
            r13.a()     // Catch:{ Exception -> 0x033c }
        L_0x033c:
            throw r4     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
        L_0x033d:
            r19 = r7
        L_0x033f:
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r5 == 0) goto L_0x035a
            boolean r5 = r1.j     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r5 == 0) goto L_0x0350
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            int r5 = r5.getChunkCount()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r5 > r3) goto L_0x0350
            goto L_0x035a
        L_0x0350:
            boolean r5 = r1.k     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r5 == 0) goto L_0x035a
            boolean r5 = r1.m     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r5 != 0) goto L_0x035a
            r5 = 1
            goto L_0x035b
        L_0x035a:
            r5 = 0
        L_0x035b:
            if (r5 == 0) goto L_0x03aa
            boolean r5 = r1.j     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r5 == 0) goto L_0x036f
            if (r19 == 0) goto L_0x0368
            int r5 = r19.size()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            goto L_0x03a8
        L_0x0368:
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            int r5 = r5.getChunkCount()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            goto L_0x03a8
        L_0x036f:
            com.ss.android.socialbase.downloader.downloader.g r5 = r1.v     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r5 == 0) goto L_0x037a
            com.ss.android.socialbase.downloader.downloader.g r5 = r1.v     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            int r5 = r5.a(r9)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            goto L_0x0380
        L_0x037a:
            com.ss.android.socialbase.downloader.downloader.g r5 = r1.q     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            int r5 = r5.a(r9)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
        L_0x0380:
            com.ss.android.socialbase.downloader.network.e r6 = com.ss.android.socialbase.downloader.network.e.a()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.network.f r6 = r6.b()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            java.lang.String r7 = "NetworkQuality is : %s"
            java.lang.Object[] r12 = new java.lang.Object[r3]     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            java.lang.String r13 = r6.name()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r12[r2] = r13     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            java.lang.String.format(r7, r12)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r7 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            java.lang.String r12 = r6.name()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r7.setNetworkQuality(r12)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.downloader.f r7 = r1.r     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r7 == 0) goto L_0x03a8
            com.ss.android.socialbase.downloader.downloader.f r7 = r1.r     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            int r5 = r7.a(r5, r6)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
        L_0x03a8:
            if (r5 > 0) goto L_0x03ab
        L_0x03aa:
            r5 = 1
        L_0x03ab:
            boolean r6 = com.ss.android.socialbase.downloader.b.a.a()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r6 == 0) goto L_0x03ce
            java.lang.String r6 = "chunk count : %s for %s contentLen:%s"
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            java.lang.String r12 = java.lang.String.valueOf(r5)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r7[r2] = r12     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r12 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            java.lang.String r12 = r12.getName()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r7[r3] = r12     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            java.lang.String r12 = java.lang.String.valueOf(r9)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r13 = 2
            r7[r13] = r12     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            java.lang.String.format(r6, r7)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
        L_0x03ce:
            boolean r6 = r20.c()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r6 == 0) goto L_0x03db
            r20.k()     // Catch:{ all -> 0x05c3 }
            r20.h()
            return
        L_0x03db:
            if (r5 <= 0) goto L_0x048a
            if (r5 != r3) goto L_0x03e1
            r6 = 1
            goto L_0x03e2
        L_0x03e1:
            r6 = 0
        L_0x03e2:
            r1.i = r6     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            boolean r6 = r1.i     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r6 == 0) goto L_0x044f
            r1.a((java.lang.String) r8, (java.util.List<com.ss.android.socialbase.downloader.model.HttpHeader>) r4)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            boolean r4 = r20.c()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r4 == 0) goto L_0x03f8
            r20.k()     // Catch:{ all -> 0x05c3 }
            r20.h()
            return
        L_0x03f8:
            com.ss.android.socialbase.downloader.network.IDownloadHttpConnection r4 = r1.w     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            long r5 = r5.getTotalBytes()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            long r7 = r11.i()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r9 = 0
            long r5 = r5 - r7
            r11.f31056d = r5     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r5.setChunkCount(r3)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.downloader.i r5 = r1.p     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r6 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            int r6 = r6.getId()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r5.a((int) r6, (int) r3)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.downloader.d r5 = new com.ss.android.socialbase.downloader.downloader.d     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r6 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r5.<init>(r6, r4, r11, r1)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r1.h = r5     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.downloader.d r4 = r1.h     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r4 == 0) goto L_0x0485
            com.ss.android.socialbase.downloader.constants.j r4 = r1.o     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.constants.j r5 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_CANCELED     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r4 != r5) goto L_0x0437
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r5 = -4
            r4.setStatus(r5)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.downloader.d r4 = r1.h     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r4.b()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            goto L_0x0485
        L_0x0437:
            com.ss.android.socialbase.downloader.constants.j r4 = r1.o     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.constants.j r5 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_PAUSE     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r4 != r5) goto L_0x0449
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r5 = -2
            r4.setStatus(r5)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            com.ss.android.socialbase.downloader.downloader.d r4 = r1.h     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r4.a()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            goto L_0x0485
        L_0x0449:
            com.ss.android.socialbase.downloader.downloader.d r4 = r1.h     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r4.c()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            goto L_0x0485
        L_0x044f:
            r20.j()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            boolean r4 = r20.c()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r4 == 0) goto L_0x045f
            r20.k()     // Catch:{ all -> 0x05c3 }
            r20.h()
            return
        L_0x045f:
            boolean r4 = r1.j     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r4 == 0) goto L_0x0482
            int r4 = r19.size()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            if (r4 != r5) goto L_0x0475
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f30866b     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            long r4 = r4.getTotalBytes()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r6 = r19
            r1.a((java.util.List<com.ss.android.socialbase.downloader.model.b>) r6, (long) r4)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            goto L_0x0485
        L_0x0475:
            com.ss.android.socialbase.downloader.exception.BaseException r4 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r5 = 1033(0x409, float:1.448E-42)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r6.<init>()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r4.<init>((int) r5, (java.lang.Throwable) r6)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            throw r4     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
        L_0x0482:
            r1.a((long) r9, (int) r5)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
        L_0x0485:
            r20.k()     // Catch:{ all -> 0x05c3 }
            goto L_0x05bb
        L_0x048a:
            com.ss.android.socialbase.downloader.exception.BaseException r4 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r5 = 1032(0x408, float:1.446E-42)
            java.lang.String r6 = "chunkCount is 0"
            r4.<init>((int) r5, (java.lang.String) r6)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            throw r4     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
        L_0x0494:
            com.ss.android.socialbase.downloader.exception.c r4 = new com.ss.android.socialbase.downloader.exception.c     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r4.<init>()     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            throw r4     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
        L_0x049a:
            com.ss.android.socialbase.downloader.exception.BaseException r4 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r5 = 1031(0x407, float:1.445E-42)
            java.lang.String r6 = "download savePath is not a directory"
            r4.<init>((int) r5, (java.lang.String) r6)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            throw r4     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
        L_0x04a4:
            com.ss.android.socialbase.downloader.exception.BaseException r4 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r5 = 1029(0x405, float:1.442E-42)
            java.lang.String r6 = "download name can not be empty"
            r4.<init>((int) r5, (java.lang.String) r6)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            throw r4     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
        L_0x04ae:
            com.ss.android.socialbase.downloader.exception.BaseException r4 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            r5 = 1028(0x404, float:1.44E-42)
            java.lang.String r6 = "download savePath can not be empty"
            r4.<init>((int) r5, (java.lang.String) r6)     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
            throw r4     // Catch:{ BaseException -> 0x04b8, a -> 0x04d4, Throwable -> 0x04c1 }
        L_0x04b8:
            r0 = move-exception
            r4 = r0
            r8 = 2
            goto L_0x0571
        L_0x04bd:
            r0 = move-exception
            r2 = r0
            goto L_0x05bf
        L_0x04c1:
            r0 = move-exception
            r2 = r0
            com.ss.android.socialbase.downloader.constants.j r3 = r1.o     // Catch:{ all -> 0x04bd }
            com.ss.android.socialbase.downloader.constants.j r4 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_PAUSE     // Catch:{ all -> 0x04bd }
            if (r3 == r4) goto L_0x0485
            com.ss.android.socialbase.downloader.exception.BaseException r3 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ all -> 0x04bd }
            r4 = 1045(0x415, float:1.464E-42)
            r3.<init>((int) r4, (java.lang.Throwable) r2)     // Catch:{ all -> 0x04bd }
            r1.b(r3)     // Catch:{ all -> 0x04bd }
            goto L_0x0485
        L_0x04d4:
            r0 = move-exception
            r4 = r0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x04bd }
            java.lang.String r6 = "retry throwable for "
            r5.<init>(r6)     // Catch:{ all -> 0x04bd }
            java.lang.String r6 = r4.getErrorMsg()     // Catch:{ all -> 0x04bd }
            r5.append(r6)     // Catch:{ all -> 0x04bd }
            com.ss.android.socialbase.downloader.constants.j r5 = r1.o     // Catch:{ all -> 0x04bd }
            com.ss.android.socialbase.downloader.constants.j r6 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_PAUSE     // Catch:{ all -> 0x04bd }
            if (r5 == r6) goto L_0x0485
            java.util.concurrent.atomic.AtomicInteger r5 = r1.f30869f     // Catch:{ all -> 0x04bd }
            r6 = 5
            if (r5 == 0) goto L_0x0508
            java.util.concurrent.atomic.AtomicInteger r5 = r1.f30869f     // Catch:{ all -> 0x04bd }
            int r5 = r5.get()     // Catch:{ all -> 0x04bd }
            if (r5 <= 0) goto L_0x0508
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f30866b     // Catch:{ all -> 0x04bd }
            java.util.concurrent.atomic.AtomicInteger r5 = r1.f30869f     // Catch:{ all -> 0x04bd }
            int r5 = r5.decrementAndGet()     // Catch:{ all -> 0x04bd }
            r4.updateCurRetryTime(r5)     // Catch:{ all -> 0x04bd }
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f30866b     // Catch:{ all -> 0x04bd }
            r4.setStatus(r6)     // Catch:{ all -> 0x04bd }
            goto L_0x0524
        L_0x0508:
            java.util.concurrent.atomic.AtomicInteger r5 = r1.f30869f     // Catch:{ all -> 0x04bd }
            if (r5 == 0) goto L_0x0550
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r1.f30866b     // Catch:{ all -> 0x04bd }
            boolean r5 = r5.canRetryWithBackUpUrl()     // Catch:{ all -> 0x04bd }
            if (r5 == 0) goto L_0x0529
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f30866b     // Catch:{ all -> 0x04bd }
            r4.setStatus(r6)     // Catch:{ all -> 0x04bd }
            java.util.concurrent.atomic.AtomicInteger r4 = r1.f30869f     // Catch:{ all -> 0x04bd }
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r1.f30866b     // Catch:{ all -> 0x04bd }
            int r5 = r5.getRetryCount()     // Catch:{ all -> 0x04bd }
            r4.set(r5)     // Catch:{ all -> 0x04bd }
        L_0x0524:
            r20.k()     // Catch:{ all -> 0x05c3 }
            goto L_0x05a8
        L_0x0529:
            com.ss.android.socialbase.downloader.exception.BaseException r5 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ all -> 0x04bd }
            r6 = 1018(0x3fa, float:1.427E-42)
            java.lang.String r7 = "retry for Throwable, but retry Time %s all used, last error is %s"
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x04bd }
            com.ss.android.socialbase.downloader.model.DownloadInfo r9 = r1.f30866b     // Catch:{ all -> 0x04bd }
            int r9 = r9.getRetryCount()     // Catch:{ all -> 0x04bd }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x04bd }
            r8[r2] = r9     // Catch:{ all -> 0x04bd }
            java.lang.String r2 = r4.getErrorMsg()     // Catch:{ all -> 0x04bd }
            r8[r3] = r2     // Catch:{ all -> 0x04bd }
            java.lang.String r2 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x04bd }
            r5.<init>((int) r6, (java.lang.String) r2)     // Catch:{ all -> 0x04bd }
            r1.b(r5)     // Catch:{ all -> 0x04bd }
            goto L_0x0485
        L_0x0550:
            com.ss.android.socialbase.downloader.exception.BaseException r2 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ all -> 0x04bd }
            r3 = 1043(0x413, float:1.462E-42)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x04bd }
            java.lang.String r6 = "retry for Throwable, but retain retry time is NULL, last error is"
            r5.<init>(r6)     // Catch:{ all -> 0x04bd }
            java.lang.String r4 = r4.getErrorMsg()     // Catch:{ all -> 0x04bd }
            r5.append(r4)     // Catch:{ all -> 0x04bd }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x04bd }
            r2.<init>((int) r3, (java.lang.String) r4)     // Catch:{ all -> 0x04bd }
            r1.b(r2)     // Catch:{ all -> 0x04bd }
            goto L_0x0485
        L_0x056e:
            r0 = move-exception
            r8 = 2
            r4 = r0
        L_0x0571:
            com.ss.android.socialbase.downloader.constants.j r5 = r1.o     // Catch:{ all -> 0x04bd }
            com.ss.android.socialbase.downloader.constants.j r6 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_PAUSE     // Catch:{ all -> 0x04bd }
            if (r5 == r6) goto L_0x0485
            int r5 = r4.getErrorCode()     // Catch:{ all -> 0x04bd }
            r6 = 1025(0x401, float:1.436E-42)
            if (r5 == r6) goto L_0x05b0
            int r5 = r4.getErrorCode()     // Catch:{ all -> 0x04bd }
            r6 = 1009(0x3f1, float:1.414E-42)
            if (r5 != r6) goto L_0x0588
            goto L_0x05b0
        L_0x0588:
            boolean r5 = r1.a((com.ss.android.socialbase.downloader.exception.BaseException) r4)     // Catch:{ all -> 0x04bd }
            if (r5 == 0) goto L_0x05ab
            boolean r5 = com.ss.android.socialbase.downloader.e.d.a((com.ss.android.socialbase.downloader.exception.BaseException) r4)     // Catch:{ all -> 0x04bd }
            if (r5 == 0) goto L_0x0597
            r20.q()     // Catch:{ all -> 0x04bd }
        L_0x0597:
            r5 = 0
            com.ss.android.socialbase.downloader.exception.g r4 = r1.a((com.ss.android.socialbase.downloader.exception.BaseException) r4, (long) r5)     // Catch:{ all -> 0x04bd }
            com.ss.android.socialbase.downloader.exception.g r5 = com.ss.android.socialbase.downloader.exception.g.RETURN     // Catch:{ all -> 0x04bd }
            if (r4 != r5) goto L_0x0524
            r20.k()     // Catch:{ all -> 0x05c3 }
            r20.h()
            return
        L_0x05a8:
            r6 = 2
            goto L_0x0130
        L_0x05ab:
            r1.b(r4)     // Catch:{ all -> 0x04bd }
            goto L_0x0485
        L_0x05b0:
            com.ss.android.socialbase.downloader.constants.j r2 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_END_RIGHT_NOW     // Catch:{ all -> 0x04bd }
            r1.o = r2     // Catch:{ all -> 0x04bd }
            r20.k()     // Catch:{ all -> 0x05c3 }
            r20.h()
            return
        L_0x05bb:
            r20.h()
            return
        L_0x05bf:
            r20.k()     // Catch:{ all -> 0x05c3 }
            throw r2     // Catch:{ all -> 0x05c3 }
        L_0x05c3:
            r0 = move-exception
            r2 = r0
            r20.h()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.d.c.g():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x01e1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m() {
        /*
            r15 = this;
            com.ss.android.socialbase.downloader.network.a r0 = com.ss.android.socialbase.downloader.network.a.a()
            r0.b()
            com.ss.android.socialbase.downloader.constants.j r0 = r15.o
            com.ss.android.socialbase.downloader.constants.j r1 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_ERROR
            r2 = 1
            if (r0 != r1) goto L_0x0017
            com.ss.android.socialbase.downloader.downloader.e r0 = r15.f30867c
            com.ss.android.socialbase.downloader.exception.BaseException r1 = r15.u
            r0.a((com.ss.android.socialbase.downloader.exception.BaseException) r1)
            goto L_0x0401
        L_0x0017:
            com.ss.android.socialbase.downloader.constants.j r0 = r15.o
            com.ss.android.socialbase.downloader.constants.j r1 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_CANCELED
            if (r0 != r1) goto L_0x0024
            com.ss.android.socialbase.downloader.downloader.e r0 = r15.f30867c
            r0.b()
            goto L_0x0401
        L_0x0024:
            com.ss.android.socialbase.downloader.constants.j r0 = r15.o
            com.ss.android.socialbase.downloader.constants.j r1 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_PAUSE
            if (r0 != r1) goto L_0x0031
            com.ss.android.socialbase.downloader.downloader.e r0 = r15.f30867c
            r0.c()
            goto L_0x0401
        L_0x0031:
            com.ss.android.socialbase.downloader.constants.j r0 = r15.o
            com.ss.android.socialbase.downloader.constants.j r1 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_END_RIGHT_NOW
            r3 = -3
            r4 = 0
            if (r0 != r1) goto L_0x005c
            com.ss.android.socialbase.downloader.downloader.e r0 = r15.f30867c
            r0.a((int) r3, (com.ss.android.socialbase.downloader.exception.BaseException) r4)
            com.ss.android.socialbase.downloader.downloader.i r1 = r0.f30923c
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r0.f30922b
            int r3 = r3.getId()
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r0.f30922b
            long r4 = r4.getTotalBytes()
            r1.c(r3, r4)
            com.ss.android.socialbase.downloader.downloader.i r1 = r0.f30923c
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r0.f30922b
            int r0 = r0.getId()
            r1.d(r0)
            goto L_0x0401
        L_0x005c:
            com.ss.android.socialbase.downloader.constants.j r0 = r15.o
            com.ss.android.socialbase.downloader.constants.j r1 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_END_FOR_FILE_EXIST
            r5 = 3
            r6 = 4
            r7 = 1037(0x40d, float:1.453E-42)
            r8 = 2
            r9 = 0
            if (r0 != r1) goto L_0x0104
            com.ss.android.socialbase.downloader.downloader.e r0 = r15.f30867c     // Catch:{ BaseException -> 0x00fc }
            java.lang.String r1 = r15.D     // Catch:{ BaseException -> 0x00fc }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ BaseException -> 0x00fc }
            java.lang.String r11 = "onCompleteForFileExist existTargetFileName is "
            r10.<init>(r11)     // Catch:{ BaseException -> 0x00fc }
            r10.append(r1)     // Catch:{ BaseException -> 0x00fc }
            java.lang.String r11 = " but curName is "
            r10.append(r11)     // Catch:{ BaseException -> 0x00fc }
            com.ss.android.socialbase.downloader.model.DownloadInfo r11 = r0.f30922b     // Catch:{ BaseException -> 0x00fc }
            java.lang.String r11 = r11.getName()     // Catch:{ BaseException -> 0x00fc }
            r10.append(r11)     // Catch:{ BaseException -> 0x00fc }
            com.ss.android.socialbase.downloader.downloader.i r10 = r0.f30923c     // Catch:{ BaseException -> 0x00fc }
            com.ss.android.socialbase.downloader.model.DownloadInfo r11 = r0.f30922b     // Catch:{ BaseException -> 0x00fc }
            r10.a((com.ss.android.socialbase.downloader.model.DownloadInfo) r11)     // Catch:{ BaseException -> 0x00fc }
            com.ss.android.socialbase.downloader.model.DownloadInfo r10 = r0.f30922b     // Catch:{ BaseException -> 0x00fc }
            if (r10 == 0) goto L_0x00f7
            boolean r11 = android.text.TextUtils.isEmpty(r1)     // Catch:{ BaseException -> 0x00fc }
            if (r11 != 0) goto L_0x00f7
            java.lang.String r11 = r10.getName()     // Catch:{ BaseException -> 0x00fc }
            boolean r11 = r1.equals(r11)     // Catch:{ BaseException -> 0x00fc }
            if (r11 == 0) goto L_0x00a0
            goto L_0x00f7
        L_0x00a0:
            java.io.File r11 = new java.io.File     // Catch:{ BaseException -> 0x00fc }
            java.lang.String r12 = r10.getSavePath()     // Catch:{ BaseException -> 0x00fc }
            r11.<init>(r12, r1)     // Catch:{ BaseException -> 0x00fc }
            java.io.File r12 = new java.io.File     // Catch:{ BaseException -> 0x00fc }
            java.lang.String r13 = r10.getSavePath()     // Catch:{ BaseException -> 0x00fc }
            java.lang.String r14 = r10.getName()     // Catch:{ BaseException -> 0x00fc }
            r12.<init>(r13, r14)     // Catch:{ BaseException -> 0x00fc }
            boolean r13 = r12.exists()     // Catch:{ BaseException -> 0x00fc }
            if (r13 == 0) goto L_0x00cb
            boolean r13 = r12.delete()     // Catch:{ BaseException -> 0x00fc }
            if (r13 == 0) goto L_0x00c3
            goto L_0x00cb
        L_0x00c3:
            com.ss.android.socialbase.downloader.exception.BaseException r0 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x00fc }
            java.lang.String r1 = "targetPath file exists but can't delete"
            r0.<init>((int) r7, (java.lang.String) r1)     // Catch:{ BaseException -> 0x00fc }
            throw r0     // Catch:{ BaseException -> 0x00fc }
        L_0x00cb:
            boolean r7 = com.ss.android.socialbase.downloader.e.d.a((java.io.File) r11, (java.io.File) r12)     // Catch:{ BaseException -> 0x00fc }
            r7 = r7 ^ r2
            if (r7 != 0) goto L_0x00d3
            goto L_0x00f7
        L_0x00d3:
            com.ss.android.socialbase.downloader.exception.BaseException r0 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x00fc }
            r3 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r4 = "Can't copy the exist file(%s/%s) to the target file(%s/%s)"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ BaseException -> 0x00fc }
            java.lang.String r7 = r10.getSavePath()     // Catch:{ BaseException -> 0x00fc }
            r6[r9] = r7     // Catch:{ BaseException -> 0x00fc }
            r6[r2] = r1     // Catch:{ BaseException -> 0x00fc }
            java.lang.String r1 = r10.getSavePath()     // Catch:{ BaseException -> 0x00fc }
            r6[r8] = r1     // Catch:{ BaseException -> 0x00fc }
            java.lang.String r1 = r10.getName()     // Catch:{ BaseException -> 0x00fc }
            r6[r5] = r1     // Catch:{ BaseException -> 0x00fc }
            java.lang.String r1 = java.lang.String.format(r4, r6)     // Catch:{ BaseException -> 0x00fc }
            r0.<init>((int) r3, (java.lang.String) r1)     // Catch:{ BaseException -> 0x00fc }
            throw r0     // Catch:{ BaseException -> 0x00fc }
        L_0x00f7:
            r0.a((int) r3, (com.ss.android.socialbase.downloader.exception.BaseException) r4)     // Catch:{ BaseException -> 0x00fc }
            goto L_0x0401
        L_0x00fc:
            r0 = move-exception
            com.ss.android.socialbase.downloader.downloader.e r1 = r15.f30867c
            r1.a((com.ss.android.socialbase.downloader.exception.BaseException) r0)
            goto L_0x0401
        L_0x0104:
            com.ss.android.socialbase.downloader.constants.j r0 = r15.o
            com.ss.android.socialbase.downloader.constants.j r1 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_ALL_CHUNK_RETRY_WITH_RESET
            if (r0 != r1) goto L_0x0112
            com.ss.android.socialbase.downloader.downloader.e r0 = r15.f30867c
            com.ss.android.socialbase.downloader.exception.BaseException r1 = r15.u
            r0.a((com.ss.android.socialbase.downloader.exception.BaseException) r1, (boolean) r9)
            return r9
        L_0x0112:
            com.ss.android.socialbase.downloader.constants.j r0 = r15.o
            com.ss.android.socialbase.downloader.constants.j r1 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_WAITING_ASYNC_HANDLER
            if (r0 != r1) goto L_0x0119
            return r2
        L_0x0119:
            com.ss.android.socialbase.downloader.constants.j r0 = r15.o
            com.ss.android.socialbase.downloader.constants.j r1 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_RETRY_DELAY
            if (r0 != r1) goto L_0x0200
            boolean r0 = r15.n()
            if (r0 != 0) goto L_0x0200
            com.ss.android.socialbase.downloader.downloader.p r0 = r15.s
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r15.f30866b
            int r1 = r1.getCurRetryTime()
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r15.f30866b
            int r3 = r3.getRetryCount()
            long r0 = r0.a(r1, r3)
            r3 = 1073741824(0x40000000, float:2.0)
            android.content.Intent r4 = new android.content.Intent     // Catch:{ Throwable -> 0x0190 }
            java.lang.String r5 = "com.ss.android.downloader.action.DOWNLOAD_WAKEUP"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0190 }
            java.lang.String r5 = "extra_download_id"
            com.ss.android.socialbase.downloader.model.DownloadInfo r6 = r15.f30866b     // Catch:{ Throwable -> 0x0190 }
            int r6 = r6.getId()     // Catch:{ Throwable -> 0x0190 }
            r4.putExtra(r5, r6)     // Catch:{ Throwable -> 0x0190 }
            android.content.Context r5 = com.ss.android.socialbase.downloader.downloader.b.q()     // Catch:{ Throwable -> 0x0190 }
            java.lang.Class<com.ss.android.socialbase.downloader.impls.DownloadHandleService> r6 = com.ss.android.socialbase.downloader.impls.DownloadHandleService.class
            r4.setClass(r5, r6)     // Catch:{ Throwable -> 0x0190 }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0190 }
            r6 = 19
            if (r5 < r6) goto L_0x0174
            android.app.AlarmManager r5 = r15.t     // Catch:{ Throwable -> 0x0190 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Throwable -> 0x0190 }
            r10 = 0
            long r6 = r6 + r0
            android.content.Context r10 = com.ss.android.socialbase.downloader.downloader.b.q()     // Catch:{ Throwable -> 0x0190 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r11 = r15.f30866b     // Catch:{ Throwable -> 0x0190 }
            int r11 = r11.getId()     // Catch:{ Throwable -> 0x0190 }
            android.app.PendingIntent r4 = android.app.PendingIntent.getService(r10, r11, r4, r3)     // Catch:{ Throwable -> 0x0190 }
            r5.setExact(r8, r6, r4)     // Catch:{ Throwable -> 0x0190 }
            goto L_0x01ce
        L_0x0174:
            android.app.AlarmManager r5 = r15.t     // Catch:{ Throwable -> 0x0190 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Throwable -> 0x0190 }
            r10 = 0
            long r6 = r6 + r0
            android.content.Context r10 = com.ss.android.socialbase.downloader.downloader.b.q()     // Catch:{ Throwable -> 0x0190 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r11 = r15.f30866b     // Catch:{ Throwable -> 0x0190 }
            int r11 = r11.getId()     // Catch:{ Throwable -> 0x0190 }
            android.app.PendingIntent r4 = android.app.PendingIntent.getService(r10, r11, r4, r3)     // Catch:{ Throwable -> 0x0190 }
            r5.set(r8, r6, r4)     // Catch:{ Throwable -> 0x0190 }
            goto L_0x01ce
        L_0x018e:
            r0 = move-exception
            goto L_0x01ed
        L_0x0190:
            r4 = move-exception
            boolean r4 = r4 instanceof java.lang.NoSuchMethodError     // Catch:{ all -> 0x018e }
            if (r4 == 0) goto L_0x01cb
            android.content.Intent r4 = new android.content.Intent     // Catch:{ Throwable -> 0x01cb }
            java.lang.String r5 = "com.ss.android.downloader.action.DOWNLOAD_WAKEUP"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x01cb }
            android.content.Context r5 = com.ss.android.socialbase.downloader.downloader.b.q()     // Catch:{ Throwable -> 0x01cb }
            java.lang.Class<com.ss.android.socialbase.downloader.impls.DownloadHandleService> r6 = com.ss.android.socialbase.downloader.impls.DownloadHandleService.class
            r4.setClass(r5, r6)     // Catch:{ Throwable -> 0x01cb }
            java.lang.String r5 = "extra_download_id"
            com.ss.android.socialbase.downloader.model.DownloadInfo r6 = r15.f30866b     // Catch:{ Throwable -> 0x01cb }
            int r6 = r6.getId()     // Catch:{ Throwable -> 0x01cb }
            r4.putExtra(r5, r6)     // Catch:{ Throwable -> 0x01cb }
            android.app.AlarmManager r5 = r15.t     // Catch:{ Throwable -> 0x01cb }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Throwable -> 0x01cb }
            r10 = 0
            long r6 = r6 + r0
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.b.q()     // Catch:{ Throwable -> 0x01cb }
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r15.f30866b     // Catch:{ Throwable -> 0x01cb }
            int r1 = r1.getId()     // Catch:{ Throwable -> 0x01cb }
            android.app.PendingIntent r0 = android.app.PendingIntent.getService(r0, r1, r4, r3)     // Catch:{ Throwable -> 0x01cb }
            r5.set(r8, r6, r0)     // Catch:{ Throwable -> 0x01cb }
            r0 = 1
            goto L_0x01cc
        L_0x01cb:
            r0 = 0
        L_0x01cc:
            if (r0 == 0) goto L_0x01e1
        L_0x01ce:
            com.ss.android.socialbase.downloader.constants.j r0 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_RETRY_DELAY
            r15.o = r0
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r15.f30866b
            com.ss.android.socialbase.downloader.constants.i r1 = com.ss.android.socialbase.downloader.constants.i.DELAY_RETRY_WAITING
            r0.setRetryDelayStatus(r1)
            com.ss.android.socialbase.downloader.downloader.i r0 = r15.p
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r15.f30866b
            r0.a((com.ss.android.socialbase.downloader.model.DownloadInfo) r1)
            goto L_0x01e5
        L_0x01e1:
            com.ss.android.socialbase.downloader.constants.j r0 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_NONE
            r15.o = r0
        L_0x01e5:
            com.ss.android.socialbase.downloader.constants.j r0 = r15.o
            com.ss.android.socialbase.downloader.constants.j r1 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_RETRY_DELAY
            if (r0 != r1) goto L_0x01ec
            return r2
        L_0x01ec:
            return r9
        L_0x01ed:
            com.ss.android.socialbase.downloader.constants.j r1 = com.ss.android.socialbase.downloader.constants.j.RUN_STATUS_RETRY_DELAY
            r15.o = r1
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r15.f30866b
            com.ss.android.socialbase.downloader.constants.i r2 = com.ss.android.socialbase.downloader.constants.i.DELAY_RETRY_WAITING
            r1.setRetryDelayStatus(r2)
            com.ss.android.socialbase.downloader.downloader.i r1 = r15.p
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r15.f30866b
            r1.a((com.ss.android.socialbase.downloader.model.DownloadInfo) r2)
            throw r0
        L_0x0200:
            boolean r0 = r15.o()     // Catch:{ Throwable -> 0x03f0 }
            if (r0 != 0) goto L_0x0207
            return r9
        L_0x0207:
            com.ss.android.socialbase.downloader.downloader.e r0 = r15.f30867c     // Catch:{ Throwable -> 0x03f0 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r0.f30922b     // Catch:{ Throwable -> 0x03f0 }
            r1.setFirstDownload(r9)     // Catch:{ Throwable -> 0x03f0 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r0.f30922b     // Catch:{ Throwable -> 0x03f0 }
            boolean r1 = r1.isIgnoreDataVerify()     // Catch:{ Throwable -> 0x03f0 }
            if (r1 != 0) goto L_0x024b
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r0.f30922b     // Catch:{ Throwable -> 0x03f0 }
            long r10 = r1.getCurBytes()     // Catch:{ Throwable -> 0x03f0 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r0.f30922b     // Catch:{ Throwable -> 0x03f0 }
            long r12 = r1.getTotalBytes()     // Catch:{ Throwable -> 0x03f0 }
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 == 0) goto L_0x024b
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r0.f30922b     // Catch:{ Throwable -> 0x03f0 }
            r1.getErrorBytesLog()     // Catch:{ Throwable -> 0x03f0 }
            com.ss.android.socialbase.downloader.exception.f r1 = new com.ss.android.socialbase.downloader.exception.f     // Catch:{ Throwable -> 0x03f0 }
            r3 = 1027(0x403, float:1.439E-42)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x03f0 }
            java.lang.String r5 = "current bytes is not equals to total bytes, bytes changed with process : "
            r4.<init>(r5)     // Catch:{ Throwable -> 0x03f0 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r0.f30922b     // Catch:{ Throwable -> 0x03f0 }
            com.ss.android.socialbase.downloader.constants.b r5 = r5.getByteInvalidRetryStatus()     // Catch:{ Throwable -> 0x03f0 }
            r4.append(r5)     // Catch:{ Throwable -> 0x03f0 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x03f0 }
            r1.<init>(r3, r4)     // Catch:{ Throwable -> 0x03f0 }
            r0.a((com.ss.android.socialbase.downloader.exception.BaseException) r1)     // Catch:{ Throwable -> 0x03f0 }
            goto L_0x0401
        L_0x024b:
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r0.f30922b     // Catch:{ Throwable -> 0x03f0 }
            long r10 = r1.getCurBytes()     // Catch:{ Throwable -> 0x03f0 }
            r12 = 0
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 > 0) goto L_0x027c
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r0.f30922b     // Catch:{ Throwable -> 0x03f0 }
            r1.getErrorBytesLog()     // Catch:{ Throwable -> 0x03f0 }
            com.ss.android.socialbase.downloader.exception.f r1 = new com.ss.android.socialbase.downloader.exception.f     // Catch:{ Throwable -> 0x03f0 }
            r3 = 1026(0x402, float:1.438E-42)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x03f0 }
            java.lang.String r5 = "curBytes is 0, bytes changed with process : "
            r4.<init>(r5)     // Catch:{ Throwable -> 0x03f0 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r0.f30922b     // Catch:{ Throwable -> 0x03f0 }
            com.ss.android.socialbase.downloader.constants.b r5 = r5.getByteInvalidRetryStatus()     // Catch:{ Throwable -> 0x03f0 }
            r4.append(r5)     // Catch:{ Throwable -> 0x03f0 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x03f0 }
            r1.<init>(r3, r4)     // Catch:{ Throwable -> 0x03f0 }
            r0.a((com.ss.android.socialbase.downloader.exception.BaseException) r1)     // Catch:{ Throwable -> 0x03f0 }
            goto L_0x0401
        L_0x027c:
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r0.f30922b     // Catch:{ Throwable -> 0x03f0 }
            boolean r1 = r1.isIgnoreDataVerify()     // Catch:{ Throwable -> 0x03f0 }
            if (r1 != 0) goto L_0x02b3
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r0.f30922b     // Catch:{ Throwable -> 0x03f0 }
            long r10 = r1.getTotalBytes()     // Catch:{ Throwable -> 0x03f0 }
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r1 > 0) goto L_0x02b3
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r0.f30922b     // Catch:{ Throwable -> 0x03f0 }
            r1.getErrorBytesLog()     // Catch:{ Throwable -> 0x03f0 }
            com.ss.android.socialbase.downloader.exception.f r1 = new com.ss.android.socialbase.downloader.exception.f     // Catch:{ Throwable -> 0x03f0 }
            r3 = 1044(0x414, float:1.463E-42)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x03f0 }
            java.lang.String r5 = "TotalBytes is 0, bytes changed with process : "
            r4.<init>(r5)     // Catch:{ Throwable -> 0x03f0 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r5 = r0.f30922b     // Catch:{ Throwable -> 0x03f0 }
            com.ss.android.socialbase.downloader.constants.b r5 = r5.getByteInvalidRetryStatus()     // Catch:{ Throwable -> 0x03f0 }
            r4.append(r5)     // Catch:{ Throwable -> 0x03f0 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x03f0 }
            r1.<init>(r3, r4)     // Catch:{ Throwable -> 0x03f0 }
            r0.a((com.ss.android.socialbase.downloader.exception.BaseException) r1)     // Catch:{ Throwable -> 0x03f0 }
            goto L_0x0401
        L_0x02b3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x03f0 }
            r1.<init>()     // Catch:{ Throwable -> 0x03f0 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r3 = r0.f30922b     // Catch:{ Throwable -> 0x03f0 }
            java.lang.String r3 = r3.getName()     // Catch:{ Throwable -> 0x03f0 }
            r1.append(r3)     // Catch:{ Throwable -> 0x03f0 }
            java.lang.String r3 = " onCompleted start save file as target name"
            r1.append(r3)     // Catch:{ Throwable -> 0x03f0 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r1 = r0.f30922b     // Catch:{ Throwable -> 0x03f0 }
            com.ss.android.socialbase.downloader.downloader.e$2 r3 = new com.ss.android.socialbase.downloader.downloader.e$2     // Catch:{ Throwable -> 0x03f0 }
            r3.<init>()     // Catch:{ Throwable -> 0x03f0 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x03f0 }
            java.lang.String r10 = "saveFileAsTargetName targetName is "
            r0.<init>(r10)     // Catch:{ Throwable -> 0x03f0 }
            java.lang.String r10 = r1.getTargetFilePath()     // Catch:{ Throwable -> 0x03f0 }
            r0.append(r10)     // Catch:{ Throwable -> 0x03f0 }
            r0 = 1038(0x40e, float:1.455E-42)
            java.io.File r10 = new java.io.File     // Catch:{ Throwable -> 0x03d2 }
            java.lang.String r11 = r1.getTempPath()     // Catch:{ Throwable -> 0x03d2 }
            java.lang.String r12 = r1.getTempName()     // Catch:{ Throwable -> 0x03d2 }
            r10.<init>(r11, r12)     // Catch:{ Throwable -> 0x03d2 }
            java.io.File r11 = new java.io.File     // Catch:{ Throwable -> 0x03d2 }
            java.lang.String r12 = r1.getSavePath()     // Catch:{ Throwable -> 0x03d2 }
            java.lang.String r13 = r1.getName()     // Catch:{ Throwable -> 0x03d2 }
            r11.<init>(r12, r13)     // Catch:{ Throwable -> 0x03d2 }
            android.content.Context r12 = com.ss.android.socialbase.downloader.downloader.b.q()     // Catch:{ Throwable -> 0x03d2 }
            com.ss.android.socialbase.downloader.downloader.Downloader r12 = com.ss.android.socialbase.downloader.downloader.Downloader.getInstance(r12)     // Catch:{ Throwable -> 0x03d2 }
            int r13 = r1.getId()     // Catch:{ Throwable -> 0x03d2 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r12 = r12.getDownloadInfo(r13)     // Catch:{ Throwable -> 0x03d2 }
            boolean r13 = r10.exists()     // Catch:{ Throwable -> 0x03d2 }
            if (r13 != 0) goto L_0x0338
            boolean r7 = r11.exists()     // Catch:{ Throwable -> 0x03d2 }
            if (r7 == 0) goto L_0x032c
            com.ss.android.socialbase.downloader.constants.h r7 = r1.checkMd5Valid()     // Catch:{ Throwable -> 0x03d2 }
            com.ss.android.socialbase.downloader.constants.h r13 = com.ss.android.socialbase.downloader.constants.h.VALID     // Catch:{ Throwable -> 0x03d2 }
            if (r7 != r13) goto L_0x0320
            r3.a()     // Catch:{ Throwable -> 0x03d2 }
            goto L_0x0401
        L_0x0320:
            if (r12 == 0) goto L_0x0388
            boolean r7 = r12.isSaveTempFile()     // Catch:{ Throwable -> 0x03d2 }
            if (r7 == 0) goto L_0x0388
            r12.registerTempFileSaveCallback(r3)     // Catch:{ Throwable -> 0x03d2 }
            goto L_0x0388
        L_0x032c:
            if (r12 == 0) goto L_0x0388
            boolean r7 = r12.isSaveTempFile()     // Catch:{ Throwable -> 0x03d2 }
            if (r7 == 0) goto L_0x0388
            r12.registerTempFileSaveCallback(r3)     // Catch:{ Throwable -> 0x03d2 }
            goto L_0x0388
        L_0x0338:
            boolean r13 = r11.exists()     // Catch:{ Throwable -> 0x03d2 }
            if (r13 == 0) goto L_0x0388
            com.ss.android.socialbase.downloader.constants.h r13 = r1.checkMd5Valid()     // Catch:{ Throwable -> 0x03d2 }
            com.ss.android.socialbase.downloader.constants.h r14 = com.ss.android.socialbase.downloader.constants.h.VALID     // Catch:{ Throwable -> 0x03d2 }
            if (r13 != r14) goto L_0x034b
            r3.a()     // Catch:{ Throwable -> 0x03d2 }
            goto L_0x0401
        L_0x034b:
            if (r12 == 0) goto L_0x0357
            boolean r14 = r12.isSaveTempFile()     // Catch:{ Throwable -> 0x03d2 }
            if (r14 == 0) goto L_0x0357
            r12.registerTempFileSaveCallback(r3)     // Catch:{ Throwable -> 0x03d2 }
            goto L_0x0388
        L_0x0357:
            if (r12 == 0) goto L_0x035c
            r12.setIsSaveTempFile(r2)     // Catch:{ Throwable -> 0x03d2 }
        L_0x035c:
            boolean r14 = r11.delete()     // Catch:{ Throwable -> 0x03d2 }
            if (r14 != 0) goto L_0x0388
            com.ss.android.socialbase.downloader.exception.BaseException r1 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ Throwable -> 0x03d2 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x03d2 }
            java.lang.String r5 = "delete targetPath file existed with md5 check invalid status:"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x03d2 }
            java.lang.String r5 = r13.name()     // Catch:{ Throwable -> 0x03d2 }
            r4.append(r5)     // Catch:{ Throwable -> 0x03d2 }
            java.lang.String r5 = " failed!"
            r4.append(r5)     // Catch:{ Throwable -> 0x03d2 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x03d2 }
            r1.<init>((int) r7, (java.lang.String) r4)     // Catch:{ Throwable -> 0x03d2 }
            r3.a(r1)     // Catch:{ Throwable -> 0x03d2 }
            if (r12 == 0) goto L_0x0401
            r12.handleTempSaveCallback(r9, r1)     // Catch:{ Throwable -> 0x03d2 }
            goto L_0x0401
        L_0x0388:
            if (r12 == 0) goto L_0x038d
            r12.setIsSaveTempFile(r2)     // Catch:{ Throwable -> 0x03d2 }
        L_0x038d:
            boolean r7 = com.ss.android.socialbase.downloader.e.d.b((java.io.File) r10, (java.io.File) r11)     // Catch:{ BaseException -> 0x0394 }
            r7 = r7 ^ r2
            r10 = r4
            goto L_0x0397
        L_0x0394:
            r7 = move-exception
            r10 = r7
            r7 = 0
        L_0x0397:
            if (r7 == 0) goto L_0x03c9
            if (r10 != 0) goto L_0x03c0
            com.ss.android.socialbase.downloader.exception.BaseException r10 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ Throwable -> 0x03d2 }
            java.lang.String r4 = "Can't save the temp downloaded file(%s/%s) to the target file(%s/%s)"
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x03d2 }
            java.lang.String r7 = r1.getTempPath()     // Catch:{ Throwable -> 0x03d2 }
            r6[r9] = r7     // Catch:{ Throwable -> 0x03d2 }
            java.lang.String r7 = r1.getTempName()     // Catch:{ Throwable -> 0x03d2 }
            r6[r2] = r7     // Catch:{ Throwable -> 0x03d2 }
            java.lang.String r7 = r1.getSavePath()     // Catch:{ Throwable -> 0x03d2 }
            r6[r8] = r7     // Catch:{ Throwable -> 0x03d2 }
            java.lang.String r1 = r1.getName()     // Catch:{ Throwable -> 0x03d2 }
            r6[r5] = r1     // Catch:{ Throwable -> 0x03d2 }
            java.lang.String r1 = java.lang.String.format(r4, r6)     // Catch:{ Throwable -> 0x03d2 }
            r10.<init>((int) r0, (java.lang.String) r1)     // Catch:{ Throwable -> 0x03d2 }
        L_0x03c0:
            r3.a(r10)     // Catch:{ Throwable -> 0x03d2 }
            if (r12 == 0) goto L_0x0401
            r12.handleTempSaveCallback(r9, r10)     // Catch:{ Throwable -> 0x03d2 }
            goto L_0x0401
        L_0x03c9:
            r3.a()     // Catch:{ Throwable -> 0x03d2 }
            if (r12 == 0) goto L_0x0401
            r12.handleTempSaveCallback(r2, r4)     // Catch:{ Throwable -> 0x03d2 }
            goto L_0x0401
        L_0x03d2:
            r1 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x03f0 }
            java.lang.String r5 = "saveFileAsTargetName throwable "
            r4.<init>(r5)     // Catch:{ Throwable -> 0x03f0 }
            java.lang.String r5 = r1.getMessage()     // Catch:{ Throwable -> 0x03f0 }
            r4.append(r5)     // Catch:{ Throwable -> 0x03f0 }
            com.ss.android.socialbase.downloader.exception.BaseException r4 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ Throwable -> 0x03f0 }
            java.lang.String r5 = "saveFileAsTargetName"
            java.lang.String r1 = com.ss.android.socialbase.downloader.e.d.b((java.lang.Throwable) r1, (java.lang.String) r5)     // Catch:{ Throwable -> 0x03f0 }
            r4.<init>((int) r0, (java.lang.String) r1)     // Catch:{ Throwable -> 0x03f0 }
            r3.a(r4)     // Catch:{ Throwable -> 0x03f0 }
            goto L_0x0401
        L_0x03f0:
            r0 = move-exception
            com.ss.android.socialbase.downloader.exception.BaseException r1 = new com.ss.android.socialbase.downloader.exception.BaseException
            r3 = 1008(0x3f0, float:1.413E-42)
            java.lang.String r4 = "doTaskStatusHandle onComplete"
            java.lang.String r0 = com.ss.android.socialbase.downloader.e.d.b((java.lang.Throwable) r0, (java.lang.String) r4)
            r1.<init>((int) r3, (java.lang.String) r0)
            r15.b(r1)
        L_0x0401:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.d.c.m():boolean");
    }

    public final boolean a(long j2) {
        return this.f30867c.a(j2);
    }

    public final void a(b bVar) {
        if (!this.i) {
            synchronized (this) {
                this.g.remove(bVar);
            }
        }
    }

    public final void a(com.ss.android.socialbase.downloader.network.c cVar) {
        if (cVar != null) {
            try {
                int a2 = cVar.a();
                this.f30866b.setHttpStatusCode(a2);
                this.f30866b.setHttpStatusMessage(com.ss.android.socialbase.downloader.e.b.a(a2));
            } catch (Throwable unused) {
            }
        }
    }

    private long a(List<b> list) {
        if (!this.j || list == null || list.isEmpty()) {
            return -1;
        }
        long j2 = -1;
        for (b next : list) {
            if (next != null && ((next.i() <= next.f31055c || next.f31055c == 0) && (j2 == -1 || j2 > next.i()))) {
                j2 = next.i();
            }
        }
        return j2;
    }

    public final void b(BaseException baseException) {
        new StringBuilder("onError:").append(baseException.getMessage());
        this.o = j.RUN_STATUS_ERROR;
        this.u = baseException;
        try {
            Iterator it2 = ((ArrayList) this.g.clone()).iterator();
            while (it2.hasNext()) {
                b bVar = (b) it2.next();
                if (bVar != null) {
                    bVar.b();
                }
            }
        } catch (Throwable unused) {
        }
    }

    private boolean c(BaseException baseException) {
        boolean z2 = true;
        if (this.f30869f != null) {
            if (this.f30869f.get() <= 0) {
                if (this.f30866b.canRetryWithBackUpUrl()) {
                    this.f30869f.set(this.f30866b.getRetryCount());
                } else if (baseException == null || baseException.getCause() == null || !(baseException.getCause() instanceof SSLHandshakeException) || !this.f30866b.canReplaceHttpForRetry()) {
                    b(new BaseException(baseException.getErrorCode(), String.format("retry for exception, but current retry time : %s , retry Time %s all used, last error is %s", new Object[]{String.valueOf(this.f30869f), String.valueOf(this.f30866b.getRetryCount()), baseException.getErrorMessage()})));
                    return true;
                } else {
                    this.f30869f.set(this.f30866b.getRetryCount());
                    this.f30866b.setHttpsToHttpRetryUsed(true);
                }
                z2 = false;
            }
            if (this.o != j.RUN_STATUS_RETRY_DELAY && z2) {
                this.f30866b.updateCurRetryTime(this.f30869f.decrementAndGet());
            }
            return false;
        }
        b(new BaseException(1043, "retry for exception, but retain retry time is null, last error is :" + baseException.getErrorMessage()));
        return true;
    }

    private void a(String str, String str2) throws a {
        this.p.d(this.f30866b.getId());
        com.ss.android.socialbase.downloader.e.d.a(this.f30866b);
        this.j = false;
        this.f30866b.resetDataForEtagEndure(str);
        this.p.a(this.f30866b);
        throw new a(str2);
    }

    public c(DownloadTask downloadTask, Handler handler) {
        this.f30865a = downloadTask;
        if (downloadTask != null) {
            this.f30866b = downloadTask.getDownloadInfo();
            this.v = downloadTask.getChunkStrategy();
            this.y = downloadTask.getForbiddenHandler();
            this.z = downloadTask.getDiskSpaceHandler();
            if (downloadTask.getRetryDelayTimeCalculator() != null) {
                this.s = downloadTask.getRetryDelayTimeCalculator();
            } else {
                this.s = com.ss.android.socialbase.downloader.downloader.b.p();
            }
        }
        f();
        this.p = com.ss.android.socialbase.downloader.downloader.b.i();
        this.q = com.ss.android.socialbase.downloader.downloader.b.n();
        this.r = com.ss.android.socialbase.downloader.downloader.b.o();
        this.f30867c = new e(downloadTask, handler);
        this.t = com.ss.android.socialbase.downloader.downloader.b.d();
        this.n = new AtomicBoolean(true);
    }

    private void a(long j2, int i2) throws BaseException {
        long j3;
        long j4 = j2;
        int i3 = i2;
        long j5 = j4 / ((long) i3);
        int id = this.f30866b.getId();
        ArrayList arrayList = new ArrayList();
        long j6 = 0;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 == i3 - 1) {
                j3 = 0;
            } else {
                j3 = (j6 + j5) - 1;
            }
            b a2 = new b.a(id).a(i4).a(j6).e(j6).b(j6).c(j3).a();
            arrayList.add(a2);
            this.p.a(a2);
            j6 += j5;
        }
        this.f30866b.setChunkCount(i3);
        this.p.a(id, i3);
        a((List<b>) arrayList, j4);
    }

    private void a(com.ss.android.socialbase.downloader.network.c cVar, long j2) throws BaseException, a {
        if (cVar != null) {
            try {
                int a2 = cVar.a();
                this.k = com.ss.android.socialbase.downloader.e.d.a(a2);
                this.l = com.ss.android.socialbase.downloader.e.d.b(a2);
                String str = this.f30866b.geteTag();
                String a3 = cVar.a("Etag");
                if (a(a2, str, a3)) {
                    if (cVar instanceof IDownloadHttpConnection) {
                        if (!TextUtils.isEmpty(str) && str.equals(a3)) {
                            a3 = "";
                        }
                        a(a3, "eTag of server file changed");
                    } else {
                        throw new com.ss.android.socialbase.downloader.exception.b(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR, a2, "");
                    }
                }
                if (!this.k) {
                    if (!this.l) {
                        if (a2 == 403) {
                            throw new BaseException(1047, "response code error : 403");
                        }
                        throw new com.ss.android.socialbase.downloader.exception.b(CrashModule.MODULE_ID, a2, "response code error : " + a2);
                    }
                }
                if (this.l && j2 > 0) {
                    if (cVar instanceof IDownloadHttpConnection) {
                        a("", "http head request not support");
                    } else {
                        throw new BaseException((int) CrashModule.MODULE_ID, "isResponseFromBegin but firstOffset > 0");
                    }
                }
                long a4 = com.ss.android.socialbase.downloader.e.d.a(cVar);
                String str2 = "";
                if (TextUtils.isEmpty(this.f30866b.getName())) {
                    str2 = com.ss.android.socialbase.downloader.e.d.a(cVar, this.f30866b.getUrl());
                }
                this.m = com.ss.android.socialbase.downloader.e.d.a(a4);
                if (!this.m && a4 == 0) {
                    if (!(cVar instanceof IDownloadHttpConnection)) {
                        throw new BaseException((int) CrashModule.MODULE_ID, "");
                    }
                }
                if (!this.m) {
                    a4 += j2;
                }
                if (!c()) {
                    this.f30867c.a(a4, a3, str2);
                }
            } catch (BaseException e2) {
                throw e2;
            } catch (a e3) {
                throw e3;
            } catch (Throwable th) {
                com.ss.android.socialbase.downloader.e.d.a(th, "HandleFirstConnection");
            }
        }
    }

    private void a(String str, List<HttpHeader> list) throws BaseException, a {
        if (this.w == null) {
            try {
                this.w = com.ss.android.socialbase.downloader.downloader.b.a(this.f30866b.isNeedDefaultHttpServiceBackUp(), this.f30866b.getMaxBytes(), str, list);
            } catch (BaseException e2) {
                throw e2;
            } catch (Throwable th) {
                a((com.ss.android.socialbase.downloader.network.c) this.w);
                throw th;
            }
            a((com.ss.android.socialbase.downloader.network.c) this.w);
            if (this.w == null) {
                throw new BaseException(1022, (Throwable) new IOException("download can't continue, firstConnection is null"));
            }
        }
    }

    private void a(List<b> list, long j2) throws BaseException {
        long j3;
        for (b next : list) {
            if (next != null) {
                if (next.f31055c == 0) {
                    j3 = j2 - next.i();
                } else {
                    j3 = (next.f31055c - next.i()) + 1;
                }
                if (j3 > 0) {
                    next.f31056d = j3;
                    if (!this.f30866b.isNeedReuseFirstConnection() || this.w == null || this.f30866b.isHeadConnectionAvailable()) {
                        this.g.add(new b(next, this.f30865a, this));
                    } else if (next.f31057e == 0) {
                        this.g.add(new b(next, this.f30865a, this.w, this));
                    } else if (next.f31057e > 0) {
                        this.g.add(new b(next, this.f30865a, this));
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList(this.g.size());
        Iterator<b> it2 = this.g.iterator();
        while (it2.hasNext()) {
            b next2 = it2.next();
            if (this.o == j.RUN_STATUS_CANCELED) {
                next2.b();
            } else if (this.o == j.RUN_STATUS_PAUSE) {
                next2.a();
            } else {
                arrayList.add(Executors.callable(next2));
            }
        }
        if (!c()) {
            try {
                ExecutorService f2 = com.ss.android.socialbase.downloader.downloader.b.f();
                if (f2 != null) {
                    f2.invokeAll(arrayList);
                }
            } catch (InterruptedException e2) {
                throw new BaseException(1020, (Throwable) e2);
            }
        }
    }
}
