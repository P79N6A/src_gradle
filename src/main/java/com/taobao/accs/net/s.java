package com.taobao.accs.net;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.Message;
import com.taobao.accs.ut.a.c;
import com.taobao.accs.ut.a.d;
import com.taobao.accs.ut.monitor.SessionMonitor;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.accs.utl.b;
import com.taobao.accs.utl.e;
import com.taobao.accs.utl.h;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.android.spdy.RequestPriority;
import org.android.spdy.SessionCb;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdyByteArray;
import org.android.spdy.SpdyDataProvider;
import org.android.spdy.SpdyRequest;
import org.android.spdy.SpdySession;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.android.spdy.Spdycb;
import org.android.spdy.SuperviseConnectInfo;
import org.android.spdy.SuperviseData;

public class s extends b implements SessionCb, Spdycb {
    private Object A = new Object();
    /* access modifiers changed from: private */
    public long B;
    /* access modifiers changed from: private */
    public long C;
    private long D;
    private long E;
    private int F = -1;
    private String G = null;
    /* access modifiers changed from: private */
    public SessionMonitor H;
    private c I;
    /* access modifiers changed from: private */
    public boolean J = false;
    /* access modifiers changed from: private */
    public String K = "";
    /* access modifiers changed from: private */
    public boolean L = false;
    /* access modifiers changed from: private */
    public g M = new g(m());
    /* access modifiers changed from: private */
    public String N;
    protected ScheduledFuture<?> n;
    protected String o;
    protected int p;
    protected String q;
    protected int r;
    /* access modifiers changed from: private */
    public int s = 3;
    /* access modifiers changed from: private */
    public LinkedList<Message> t = new LinkedList<>();
    private a u;
    /* access modifiers changed from: private */
    public boolean v = true;
    private String w;
    private String x;
    private SpdyAgent y = null;
    /* access modifiers changed from: private */
    public SpdySession z = null;

    class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public int f79032a = 0;

        /* renamed from: b  reason: collision with root package name */
        long f79033b;

        /* renamed from: d  reason: collision with root package name */
        private final String f79035d = getName();

        /* JADX WARNING: Can't wrap try/catch for region: R(3:8|9|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:207:0x04d0, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:?, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:212:0x04d4, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:220:0x04f2, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:224:?, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:225:0x04f6, code lost:
            com.taobao.accs.utl.ALog.e(r1.f79035d, " run finally error", r0, new java.lang.Object[0]);
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [B:184:0x0458, B:190:0x0477, B:216:0x04e7] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0046 */
        /* JADX WARNING: Removed duplicated region for block: B:117:0x034e A[Catch:{ all -> 0x0445, all -> 0x0422, all -> 0x036a, all -> 0x034a, all -> 0x00e7, Throwable -> 0x0426 }] */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x03ab A[SYNTHETIC, Splitter:B:140:0x03ab] */
        /* JADX WARNING: Removed duplicated region for block: B:169:0x0429 A[Catch:{ all -> 0x0445, all -> 0x0422, all -> 0x036a, all -> 0x034a, all -> 0x00e7, Throwable -> 0x0426 }] */
        /* JADX WARNING: Removed duplicated region for block: B:184:0x0458 A[SYNTHETIC, Splitter:B:184:0x0458] */
        /* JADX WARNING: Removed duplicated region for block: B:214:0x04d7 A[Catch:{ all -> 0x04f2, all -> 0x04d0, Throwable -> 0x04d4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x02d3 A[SYNTHETIC, Splitter:B:90:0x02d3] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r22 = this;
                r1 = r22
                java.lang.String r2 = r1.f79035d
                java.lang.String r3 = "NetworkThread run"
                r4 = 0
                java.lang.Object[] r5 = new java.lang.Object[r4]
                com.taobao.accs.utl.ALog.i(r2, r3, r5)
                r1.f79032a = r4
                r2 = 0
            L_0x000f:
                com.taobao.accs.net.s r3 = com.taobao.accs.net.s.this
                boolean r3 = r3.v
                if (r3 == 0) goto L_0x0504
                java.lang.String r3 = r1.f79035d
                java.lang.String r5 = "ready to get message"
                java.lang.Object[] r6 = new java.lang.Object[r4]
                com.taobao.accs.utl.ALog.d(r3, r5, r6)
                com.taobao.accs.net.s r3 = com.taobao.accs.net.s.this
                java.util.LinkedList r3 = r3.t
                monitor-enter(r3)
                com.taobao.accs.net.s r5 = com.taobao.accs.net.s.this     // Catch:{ all -> 0x0500 }
                java.util.LinkedList r5 = r5.t     // Catch:{ all -> 0x0500 }
                int r5 = r5.size()     // Catch:{ all -> 0x0500 }
                if (r5 != 0) goto L_0x0049
                java.lang.String r5 = r1.f79035d     // Catch:{ InterruptedException -> 0x0046 }
                java.lang.String r6 = "no message, wait"
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ InterruptedException -> 0x0046 }
                com.taobao.accs.utl.ALog.d(r5, r6, r7)     // Catch:{ InterruptedException -> 0x0046 }
                com.taobao.accs.net.s r5 = com.taobao.accs.net.s.this     // Catch:{ InterruptedException -> 0x0046 }
                java.util.LinkedList r5 = r5.t     // Catch:{ InterruptedException -> 0x0046 }
                r5.wait()     // Catch:{ InterruptedException -> 0x0046 }
                goto L_0x0049
            L_0x0046:
                monitor-exit(r3)     // Catch:{ all -> 0x0500 }
                goto L_0x0504
            L_0x0049:
                java.lang.String r5 = r1.f79035d     // Catch:{ all -> 0x0500 }
                java.lang.String r6 = "try get message"
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x0500 }
                com.taobao.accs.utl.ALog.d(r5, r6, r7)     // Catch:{ all -> 0x0500 }
                com.taobao.accs.net.s r5 = com.taobao.accs.net.s.this     // Catch:{ all -> 0x0500 }
                java.util.LinkedList r5 = r5.t     // Catch:{ all -> 0x0500 }
                int r5 = r5.size()     // Catch:{ all -> 0x0500 }
                if (r5 == 0) goto L_0x0077
                com.taobao.accs.net.s r2 = com.taobao.accs.net.s.this     // Catch:{ all -> 0x0500 }
                java.util.LinkedList r2 = r2.t     // Catch:{ all -> 0x0500 }
                java.lang.Object r2 = r2.getFirst()     // Catch:{ all -> 0x0500 }
                com.taobao.accs.data.Message r2 = (com.taobao.accs.data.Message) r2     // Catch:{ all -> 0x0500 }
                com.taobao.accs.ut.monitor.NetPerformanceMonitor r5 = r2.e()     // Catch:{ all -> 0x0500 }
                if (r5 == 0) goto L_0x0077
                com.taobao.accs.ut.monitor.NetPerformanceMonitor r5 = r2.e()     // Catch:{ all -> 0x0500 }
                r5.onTakeFromQueue()     // Catch:{ all -> 0x0500 }
            L_0x0077:
                monitor-exit(r3)     // Catch:{ all -> 0x0500 }
                com.taobao.accs.net.s r3 = com.taobao.accs.net.s.this
                boolean r3 = r3.v
                if (r3 == 0) goto L_0x0504
                if (r2 == 0) goto L_0x000f
                java.lang.String r3 = r1.f79035d
                java.lang.String r5 = "sendMessage not null"
                java.lang.Object[] r6 = new java.lang.Object[r4]
                com.taobao.accs.utl.ALog.d(r3, r5, r6)
                r3 = 201(0xc9, float:2.82E-43)
                r5 = 100
                r7 = 1
                int r8 = r2.a()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r9 = r1.f79035d     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r10 = "sendMessage"
                r11 = 4
                java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r13 = "type"
                r12[r4] = r13     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r13 = com.taobao.accs.data.Message.c.b(r8)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r12[r7] = r13     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r13 = "status"
                r14 = 2
                r12[r14] = r13     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.net.s r13 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                int r13 = r13.s     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r15 = 3
                r12[r15] = r13     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.utl.ALog.i(r9, r10, r12)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                if (r8 != r14) goto L_0x01af
                com.taobao.accs.net.s r8 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                int r8 = r8.f78991c     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                if (r8 != r7) goto L_0x00eb
                java.lang.String r8 = r1.f79035d     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r9 = "sendMessage INAPP ping, skip"
                java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.utl.ALog.d(r8, r9, r10)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r3 = r1.f79035d     // Catch:{ Throwable -> 0x0426 }
                java.lang.String r5 = "send succ, remove it"
                java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0426 }
                com.taobao.accs.utl.ALog.d(r3, r5, r6)     // Catch:{ Throwable -> 0x0426 }
                com.taobao.accs.net.s r3 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x0426 }
                java.util.LinkedList r3 = r3.t     // Catch:{ Throwable -> 0x0426 }
                monitor-enter(r3)     // Catch:{ Throwable -> 0x0426 }
                com.taobao.accs.net.s r5 = com.taobao.accs.net.s.this     // Catch:{ all -> 0x00e7 }
                java.util.LinkedList r5 = r5.t     // Catch:{ all -> 0x00e7 }
                r5.remove(r2)     // Catch:{ all -> 0x00e7 }
                monitor-exit(r3)     // Catch:{ all -> 0x00e7 }
                goto L_0x000f
            L_0x00e7:
                r0 = move-exception
                r5 = r0
                monitor-exit(r3)     // Catch:{ all -> 0x00e7 }
                throw r5     // Catch:{ Throwable -> 0x0426 }
            L_0x00eb:
                long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.net.s r10 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                long r12 = r10.B     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r10 = 0
                long r8 = r8 - r12
                com.taobao.accs.net.s r10 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                android.content.Context r10 = r10.f78992d     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.net.f r10 = com.taobao.accs.net.f.a((android.content.Context) r10)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                int r10 = r10.b()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                int r10 = r10 - r7
                int r10 = r10 * 1000
                long r12 = (long) r10     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                int r10 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r10 >= 0) goto L_0x0115
                boolean r8 = r2.f78929d     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                if (r8 == 0) goto L_0x0110
                goto L_0x0115
            L_0x0110:
                r1.a(r4)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                goto L_0x02cb
            L_0x0115:
                java.lang.String r8 = r1.f79035d     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r9 = "sendMessage"
                java.lang.Object[] r10 = new java.lang.Object[r11]     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r11 = "force"
                r10[r4] = r11     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                boolean r11 = r2.f78929d     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r10[r7] = r11     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r11 = "last ping"
                r10[r14] = r11     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                long r11 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.net.s r13 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                long r13 = r13.B     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r16 = 0
                long r11 = r11 - r13
                java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r10[r15] = r11     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.utl.ALog.d(r8, r9, r10)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r1.a(r7)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.net.s r8 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                org.android.spdy.SpdySession r8 = r8.z     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                if (r8 == 0) goto L_0x02b3
                com.taobao.accs.net.s r8 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                int r8 = r8.s     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                if (r8 != r7) goto L_0x02b3
                long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.net.s r10 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                long r10 = r10.B     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r12 = 0
                long r8 = r8 - r10
                com.taobao.accs.net.s r10 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                android.content.Context r10 = r10.f78992d     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.net.f r10 = com.taobao.accs.net.f.a((android.content.Context) r10)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                int r10 = r10.b()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                int r10 = r10 - r7
                int r10 = r10 * 1000
                long r10 = (long) r10     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r12 < 0) goto L_0x02cb
                java.lang.String r8 = r1.f79035d     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r9 = "sendMessage onSendPing"
                java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.utl.ALog.i(r8, r9, r10)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.net.s r8 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.data.d r8 = r8.f78993e     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r8.a()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.net.s r8 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                org.android.spdy.SpdySession r8 = r8.z     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r8.submitPing()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.net.s r8 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.ut.monitor.SessionMonitor r8 = r8.H     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r8.onSendPing()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.net.s r8 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                long unused = r8.B = r9     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.net.s r8 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                long r9 = java.lang.System.nanoTime()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                long unused = r8.C = r9     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.net.s r8 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r8.f()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                goto L_0x02cb
            L_0x01af:
                if (r8 != r7) goto L_0x02b5
                r1.a(r7)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.net.s r8 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                int r8 = r8.s     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                if (r8 != r7) goto L_0x02b3
                com.taobao.accs.net.s r8 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                org.android.spdy.SpdySession r8 = r8.z     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                if (r8 == 0) goto L_0x02b3
                com.taobao.accs.net.s r8 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                android.content.Context r8 = r8.f78992d     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.net.s r9 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                int r9 = r9.f78991c     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                byte[] r8 = r2.a((android.content.Context) r8, (int) r9)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r2.a((long) r9)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                int r9 = r8.length     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r10 = 16384(0x4000, float:2.2959E-41)
                if (r9 <= r10) goto L_0x01f0
                java.lang.Integer r9 = r2.t     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                int r9 = r9.intValue()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r10 = 102(0x66, float:1.43E-43)
                if (r9 == r10) goto L_0x01f0
                com.taobao.accs.net.s r8 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.data.d r8 = r8.f78993e     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r9 = -4
                r8.a((com.taobao.accs.data.Message) r2, (int) r9)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                goto L_0x02cb
            L_0x01f0:
                boolean r9 = r2.f78928c     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                if (r9 == 0) goto L_0x01fe
                com.taobao.accs.data.Message$a r9 = r2.d()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                int r9 = r9.a()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                int r9 = -r9
                goto L_0x0206
            L_0x01fe:
                com.taobao.accs.data.Message$a r9 = r2.d()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                int r9 = r9.a()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
            L_0x0206:
                com.taobao.accs.net.s r10 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                org.android.spdy.SpdySession r16 = r10.z     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r18 = 200(0xc8, float:2.8E-43)
                r19 = 0
                if (r8 != 0) goto L_0x0215
                r20 = 0
                goto L_0x0218
            L_0x0215:
                int r10 = r8.length     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r20 = r10
            L_0x0218:
                r17 = r9
                r21 = r8
                r16.sendCustomControlFrame(r17, r18, r19, r20, r21)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r10 = r1.f79035d     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r12 = "send data"
                r13 = 6
                java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r16 = "length"
                r13[r4] = r16     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                if (r8 != 0) goto L_0x022e
                r6 = 0
                goto L_0x022f
            L_0x022e:
                int r6 = r8.length     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
            L_0x022f:
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r13[r7] = r6     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r6 = "dataId"
                r13[r14] = r6     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r6 = r2.b()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r13[r15] = r6     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r6 = "utdid"
                r13[r11] = r6     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r6 = 5
                com.taobao.accs.net.s r11 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r11 = r11.j     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r13[r6] = r11     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.utl.ALog.e(r10, r12, r13)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.net.s r6 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.data.d r6 = r6.f78993e     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r6.a((com.taobao.accs.data.Message) r2)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                boolean r6 = r2.f78928c     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                if (r6 == 0) goto L_0x0276
                java.lang.String r6 = r1.f79035d     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r10 = "sendCFrame end ack"
                java.lang.Object[] r11 = new java.lang.Object[r14]     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r12 = "dataId"
                r11[r4] = r12     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.Integer r12 = java.lang.Integer.valueOf(r9)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r11[r7] = r12     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.utl.ALog.e(r6, r10, r11)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.net.s r6 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.util.LinkedHashMap r6 = r6.l     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r6.put(r9, r2)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
            L_0x0276:
                com.taobao.accs.ut.monitor.NetPerformanceMonitor r6 = r2.e()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                if (r6 == 0) goto L_0x0283
                com.taobao.accs.ut.monitor.NetPerformanceMonitor r6 = r2.e()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r6.onSendData()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
            L_0x0283:
                com.taobao.accs.net.s r6 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r9 = r2.b()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.net.s r10 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.AccsClientConfig r10 = r10.i     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                boolean r10 = r10.isQuickReconnect()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                int r11 = r2.S     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                long r11 = (long) r11     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r6.a((java.lang.String) r9, (boolean) r10, (long) r11)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.net.s r6 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.data.d r6 = r6.f78993e     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.ut.monitor.TrafficsMonitor$a r15 = new com.taobao.accs.ut.monitor.TrafficsMonitor$a     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r10 = r2.H     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                boolean r11 = anet.channel.GlobalAppRuntimeInfo.isAppBackground()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.net.s r9 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r12 = r9.m()     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                int r8 = r8.length     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                long r13 = (long) r8     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r9 = r15
                r9.<init>(r10, r11, r12, r13)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r6.a((com.taobao.accs.ut.monitor.TrafficsMonitor.a) r15)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                goto L_0x02cb
            L_0x02b3:
                r6 = 0
                goto L_0x02cc
            L_0x02b5:
                r1.a(r4)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r6 = r1.f79035d     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r9 = "skip msg"
                java.lang.Object[] r10 = new java.lang.Object[r14]     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.String r11 = "type"
                r10[r4] = r11     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                r10[r7] = r8     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
                com.taobao.accs.utl.ALog.e(r6, r9, r10)     // Catch:{ Throwable -> 0x037b, all -> 0x0376 }
            L_0x02cb:
                r6 = 1
            L_0x02cc:
                com.taobao.accs.net.s r8 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x0372, all -> 0x036e }
                r8.q()     // Catch:{ Throwable -> 0x0372, all -> 0x036e }
                if (r6 != 0) goto L_0x034e
                com.taobao.accs.net.s r6 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x0426 }
                r6.l()     // Catch:{ Throwable -> 0x0426 }
                com.taobao.accs.net.s r6 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x0426 }
                com.taobao.accs.ut.monitor.SessionMonitor r6 = r6.H     // Catch:{ Throwable -> 0x0426 }
                if (r6 == 0) goto L_0x02eb
                com.taobao.accs.net.s r6 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x0426 }
                com.taobao.accs.ut.monitor.SessionMonitor r6 = r6.H     // Catch:{ Throwable -> 0x0426 }
                java.lang.String r8 = "send fail"
                r6.setCloseReason(r8)     // Catch:{ Throwable -> 0x0426 }
            L_0x02eb:
                com.taobao.accs.net.s r6 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x0426 }
                java.util.LinkedList r6 = r6.t     // Catch:{ Throwable -> 0x0426 }
                monitor-enter(r6)     // Catch:{ Throwable -> 0x0426 }
                com.taobao.accs.net.s r8 = com.taobao.accs.net.s.this     // Catch:{ all -> 0x034a }
                java.util.LinkedList r8 = r8.t     // Catch:{ all -> 0x034a }
                int r8 = r8.size()     // Catch:{ all -> 0x034a }
                int r8 = r8 - r7
            L_0x02fd:
                if (r8 < 0) goto L_0x0335
                com.taobao.accs.net.s r7 = com.taobao.accs.net.s.this     // Catch:{ all -> 0x034a }
                java.util.LinkedList r7 = r7.t     // Catch:{ all -> 0x034a }
                java.lang.Object r7 = r7.get(r8)     // Catch:{ all -> 0x034a }
                com.taobao.accs.data.Message r7 = (com.taobao.accs.data.Message) r7     // Catch:{ all -> 0x034a }
                if (r7 == 0) goto L_0x0332
                java.lang.Integer r9 = r7.t     // Catch:{ all -> 0x034a }
                if (r9 == 0) goto L_0x0332
                java.lang.Integer r9 = r7.t     // Catch:{ all -> 0x034a }
                int r9 = r9.intValue()     // Catch:{ all -> 0x034a }
                if (r9 == r5) goto L_0x0321
                java.lang.Integer r9 = r7.t     // Catch:{ all -> 0x034a }
                int r9 = r9.intValue()     // Catch:{ all -> 0x034a }
                if (r9 != r3) goto L_0x0332
            L_0x0321:
                com.taobao.accs.net.s r9 = com.taobao.accs.net.s.this     // Catch:{ all -> 0x034a }
                com.taobao.accs.data.d r9 = r9.f78993e     // Catch:{ all -> 0x034a }
                r10 = -1
                r9.a((com.taobao.accs.data.Message) r7, (int) r10)     // Catch:{ all -> 0x034a }
                com.taobao.accs.net.s r7 = com.taobao.accs.net.s.this     // Catch:{ all -> 0x034a }
                java.util.LinkedList r7 = r7.t     // Catch:{ all -> 0x034a }
                r7.remove(r8)     // Catch:{ all -> 0x034a }
            L_0x0332:
                int r8 = r8 + -1
                goto L_0x02fd
            L_0x0335:
                java.lang.String r3 = r1.f79035d     // Catch:{ all -> 0x034a }
                java.lang.String r5 = "network disconnected, wait"
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x034a }
                com.taobao.accs.utl.ALog.e(r3, r5, r7)     // Catch:{ all -> 0x034a }
                com.taobao.accs.net.s r3 = com.taobao.accs.net.s.this     // Catch:{ all -> 0x034a }
                java.util.LinkedList r3 = r3.t     // Catch:{ all -> 0x034a }
                r3.wait()     // Catch:{ all -> 0x034a }
                monitor-exit(r6)     // Catch:{ all -> 0x034a }
                goto L_0x000f
            L_0x034a:
                r0 = move-exception
                r3 = r0
                monitor-exit(r6)     // Catch:{ all -> 0x034a }
                throw r3     // Catch:{ Throwable -> 0x0426 }
            L_0x034e:
                java.lang.String r3 = r1.f79035d     // Catch:{ Throwable -> 0x0426 }
                java.lang.String r5 = "send succ, remove it"
                java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0426 }
                com.taobao.accs.utl.ALog.d(r3, r5, r6)     // Catch:{ Throwable -> 0x0426 }
                com.taobao.accs.net.s r3 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x0426 }
                java.util.LinkedList r3 = r3.t     // Catch:{ Throwable -> 0x0426 }
                monitor-enter(r3)     // Catch:{ Throwable -> 0x0426 }
                com.taobao.accs.net.s r5 = com.taobao.accs.net.s.this     // Catch:{ all -> 0x036a }
                java.util.LinkedList r5 = r5.t     // Catch:{ all -> 0x036a }
                r5.remove(r2)     // Catch:{ all -> 0x036a }
                monitor-exit(r3)     // Catch:{ all -> 0x036a }
                goto L_0x000f
            L_0x036a:
                r0 = move-exception
                r5 = r0
                monitor-exit(r3)     // Catch:{ all -> 0x036a }
                throw r5     // Catch:{ Throwable -> 0x0426 }
            L_0x036e:
                r0 = move-exception
                r8 = r6
                goto L_0x0455
            L_0x0372:
                r0 = move-exception
                r8 = r6
                r6 = r0
                goto L_0x037e
            L_0x0376:
                r0 = move-exception
                r6 = r0
                r8 = 1
                goto L_0x0456
            L_0x037b:
                r0 = move-exception
                r6 = r0
                r8 = 1
            L_0x037e:
                java.lang.String r9 = "accs"
                java.lang.String r10 = "send_fail"
                java.lang.String r11 = r2.H     // Catch:{ all -> 0x0454 }
                java.lang.String r12 = "1"
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0454 }
                r13.<init>()     // Catch:{ all -> 0x0454 }
                com.taobao.accs.net.s r14 = com.taobao.accs.net.s.this     // Catch:{ all -> 0x0454 }
                int r14 = r14.f78991c     // Catch:{ all -> 0x0454 }
                r13.append(r14)     // Catch:{ all -> 0x0454 }
                java.lang.String r14 = r6.toString()     // Catch:{ all -> 0x0454 }
                r13.append(r14)     // Catch:{ all -> 0x0454 }
                java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x0454 }
                com.taobao.accs.utl.b.a(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0454 }
                java.lang.String r9 = r1.f79035d     // Catch:{ all -> 0x0454 }
                java.lang.String r10 = "service connection run"
                java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ all -> 0x0454 }
                com.taobao.accs.utl.ALog.e(r9, r10, r6, r11)     // Catch:{ all -> 0x0454 }
                if (r8 != 0) goto L_0x0429
                com.taobao.accs.net.s r6 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x0426 }
                r6.l()     // Catch:{ Throwable -> 0x0426 }
                com.taobao.accs.net.s r6 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x0426 }
                com.taobao.accs.ut.monitor.SessionMonitor r6 = r6.H     // Catch:{ Throwable -> 0x0426 }
                if (r6 == 0) goto L_0x03c3
                com.taobao.accs.net.s r6 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x0426 }
                com.taobao.accs.ut.monitor.SessionMonitor r6 = r6.H     // Catch:{ Throwable -> 0x0426 }
                java.lang.String r8 = "send fail"
                r6.setCloseReason(r8)     // Catch:{ Throwable -> 0x0426 }
            L_0x03c3:
                com.taobao.accs.net.s r6 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x0426 }
                java.util.LinkedList r6 = r6.t     // Catch:{ Throwable -> 0x0426 }
                monitor-enter(r6)     // Catch:{ Throwable -> 0x0426 }
                com.taobao.accs.net.s r8 = com.taobao.accs.net.s.this     // Catch:{ all -> 0x0422 }
                java.util.LinkedList r8 = r8.t     // Catch:{ all -> 0x0422 }
                int r8 = r8.size()     // Catch:{ all -> 0x0422 }
                int r8 = r8 - r7
            L_0x03d5:
                if (r8 < 0) goto L_0x040d
                com.taobao.accs.net.s r7 = com.taobao.accs.net.s.this     // Catch:{ all -> 0x0422 }
                java.util.LinkedList r7 = r7.t     // Catch:{ all -> 0x0422 }
                java.lang.Object r7 = r7.get(r8)     // Catch:{ all -> 0x0422 }
                com.taobao.accs.data.Message r7 = (com.taobao.accs.data.Message) r7     // Catch:{ all -> 0x0422 }
                if (r7 == 0) goto L_0x040a
                java.lang.Integer r9 = r7.t     // Catch:{ all -> 0x0422 }
                if (r9 == 0) goto L_0x040a
                java.lang.Integer r9 = r7.t     // Catch:{ all -> 0x0422 }
                int r9 = r9.intValue()     // Catch:{ all -> 0x0422 }
                if (r9 == r5) goto L_0x03f9
                java.lang.Integer r9 = r7.t     // Catch:{ all -> 0x0422 }
                int r9 = r9.intValue()     // Catch:{ all -> 0x0422 }
                if (r9 != r3) goto L_0x040a
            L_0x03f9:
                com.taobao.accs.net.s r9 = com.taobao.accs.net.s.this     // Catch:{ all -> 0x0422 }
                com.taobao.accs.data.d r9 = r9.f78993e     // Catch:{ all -> 0x0422 }
                r10 = -1
                r9.a((com.taobao.accs.data.Message) r7, (int) r10)     // Catch:{ all -> 0x0422 }
                com.taobao.accs.net.s r7 = com.taobao.accs.net.s.this     // Catch:{ all -> 0x0422 }
                java.util.LinkedList r7 = r7.t     // Catch:{ all -> 0x0422 }
                r7.remove(r8)     // Catch:{ all -> 0x0422 }
            L_0x040a:
                int r8 = r8 + -1
                goto L_0x03d5
            L_0x040d:
                java.lang.String r3 = r1.f79035d     // Catch:{ all -> 0x0422 }
                java.lang.String r5 = "network disconnected, wait"
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x0422 }
                com.taobao.accs.utl.ALog.e(r3, r5, r7)     // Catch:{ all -> 0x0422 }
                com.taobao.accs.net.s r3 = com.taobao.accs.net.s.this     // Catch:{ all -> 0x0422 }
                java.util.LinkedList r3 = r3.t     // Catch:{ all -> 0x0422 }
                r3.wait()     // Catch:{ all -> 0x0422 }
                monitor-exit(r6)     // Catch:{ all -> 0x0422 }
                goto L_0x000f
            L_0x0422:
                r0 = move-exception
                r3 = r0
                monitor-exit(r6)     // Catch:{ all -> 0x0422 }
                throw r3     // Catch:{ Throwable -> 0x0426 }
            L_0x0426:
                r0 = move-exception
                r3 = r0
                goto L_0x0449
            L_0x0429:
                java.lang.String r3 = r1.f79035d     // Catch:{ Throwable -> 0x0426 }
                java.lang.String r5 = "send succ, remove it"
                java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0426 }
                com.taobao.accs.utl.ALog.d(r3, r5, r6)     // Catch:{ Throwable -> 0x0426 }
                com.taobao.accs.net.s r3 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x0426 }
                java.util.LinkedList r3 = r3.t     // Catch:{ Throwable -> 0x0426 }
                monitor-enter(r3)     // Catch:{ Throwable -> 0x0426 }
                com.taobao.accs.net.s r5 = com.taobao.accs.net.s.this     // Catch:{ all -> 0x0445 }
                java.util.LinkedList r5 = r5.t     // Catch:{ all -> 0x0445 }
                r5.remove(r2)     // Catch:{ all -> 0x0445 }
                monitor-exit(r3)     // Catch:{ all -> 0x0445 }
                goto L_0x000f
            L_0x0445:
                r0 = move-exception
                r5 = r0
                monitor-exit(r3)     // Catch:{ all -> 0x0445 }
                throw r5     // Catch:{ Throwable -> 0x0426 }
            L_0x0449:
                java.lang.String r5 = r1.f79035d
                java.lang.String r6 = " run finally error"
                java.lang.Object[] r7 = new java.lang.Object[r4]
                com.taobao.accs.utl.ALog.e(r5, r6, r3, r7)
                goto L_0x000f
            L_0x0454:
                r0 = move-exception
            L_0x0455:
                r6 = r0
            L_0x0456:
                if (r8 != 0) goto L_0x04d7
                com.taobao.accs.net.s r2 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x04d4 }
                r2.l()     // Catch:{ Throwable -> 0x04d4 }
                com.taobao.accs.net.s r2 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x04d4 }
                com.taobao.accs.ut.monitor.SessionMonitor r2 = r2.H     // Catch:{ Throwable -> 0x04d4 }
                if (r2 == 0) goto L_0x0470
                com.taobao.accs.net.s r2 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x04d4 }
                com.taobao.accs.ut.monitor.SessionMonitor r2 = r2.H     // Catch:{ Throwable -> 0x04d4 }
                java.lang.String r8 = "send fail"
                r2.setCloseReason(r8)     // Catch:{ Throwable -> 0x04d4 }
            L_0x0470:
                com.taobao.accs.net.s r2 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x04d4 }
                java.util.LinkedList r2 = r2.t     // Catch:{ Throwable -> 0x04d4 }
                monitor-enter(r2)     // Catch:{ Throwable -> 0x04d4 }
                com.taobao.accs.net.s r8 = com.taobao.accs.net.s.this     // Catch:{ all -> 0x04d0 }
                java.util.LinkedList r8 = r8.t     // Catch:{ all -> 0x04d0 }
                int r8 = r8.size()     // Catch:{ all -> 0x04d0 }
                int r8 = r8 - r7
            L_0x0482:
                if (r8 < 0) goto L_0x04bc
                com.taobao.accs.net.s r7 = com.taobao.accs.net.s.this     // Catch:{ all -> 0x04d0 }
                java.util.LinkedList r7 = r7.t     // Catch:{ all -> 0x04d0 }
                java.lang.Object r7 = r7.get(r8)     // Catch:{ all -> 0x04d0 }
                com.taobao.accs.data.Message r7 = (com.taobao.accs.data.Message) r7     // Catch:{ all -> 0x04d0 }
                if (r7 == 0) goto L_0x04b8
                java.lang.Integer r9 = r7.t     // Catch:{ all -> 0x04d0 }
                if (r9 == 0) goto L_0x04b8
                java.lang.Integer r9 = r7.t     // Catch:{ all -> 0x04d0 }
                int r9 = r9.intValue()     // Catch:{ all -> 0x04d0 }
                if (r9 == r5) goto L_0x04a6
                java.lang.Integer r9 = r7.t     // Catch:{ all -> 0x04d0 }
                int r9 = r9.intValue()     // Catch:{ all -> 0x04d0 }
                if (r9 != r3) goto L_0x04b8
            L_0x04a6:
                com.taobao.accs.net.s r9 = com.taobao.accs.net.s.this     // Catch:{ all -> 0x04d0 }
                com.taobao.accs.data.d r9 = r9.f78993e     // Catch:{ all -> 0x04d0 }
                r10 = -1
                r9.a((com.taobao.accs.data.Message) r7, (int) r10)     // Catch:{ all -> 0x04d0 }
                com.taobao.accs.net.s r7 = com.taobao.accs.net.s.this     // Catch:{ all -> 0x04d0 }
                java.util.LinkedList r7 = r7.t     // Catch:{ all -> 0x04d0 }
                r7.remove(r8)     // Catch:{ all -> 0x04d0 }
                goto L_0x04b9
            L_0x04b8:
                r10 = -1
            L_0x04b9:
                int r8 = r8 + -1
                goto L_0x0482
            L_0x04bc:
                java.lang.String r3 = r1.f79035d     // Catch:{ all -> 0x04d0 }
                java.lang.String r5 = "network disconnected, wait"
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x04d0 }
                com.taobao.accs.utl.ALog.e(r3, r5, r7)     // Catch:{ all -> 0x04d0 }
                com.taobao.accs.net.s r3 = com.taobao.accs.net.s.this     // Catch:{ all -> 0x04d0 }
                java.util.LinkedList r3 = r3.t     // Catch:{ all -> 0x04d0 }
                r3.wait()     // Catch:{ all -> 0x04d0 }
                monitor-exit(r2)     // Catch:{ all -> 0x04d0 }
                goto L_0x04ff
            L_0x04d0:
                r0 = move-exception
                r3 = r0
                monitor-exit(r2)     // Catch:{ all -> 0x04d0 }
                throw r3     // Catch:{ Throwable -> 0x04d4 }
            L_0x04d4:
                r0 = move-exception
                r2 = r0
                goto L_0x04f6
            L_0x04d7:
                java.lang.String r3 = r1.f79035d     // Catch:{ Throwable -> 0x04d4 }
                java.lang.String r5 = "send succ, remove it"
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x04d4 }
                com.taobao.accs.utl.ALog.d(r3, r5, r7)     // Catch:{ Throwable -> 0x04d4 }
                com.taobao.accs.net.s r3 = com.taobao.accs.net.s.this     // Catch:{ Throwable -> 0x04d4 }
                java.util.LinkedList r3 = r3.t     // Catch:{ Throwable -> 0x04d4 }
                monitor-enter(r3)     // Catch:{ Throwable -> 0x04d4 }
                com.taobao.accs.net.s r5 = com.taobao.accs.net.s.this     // Catch:{ all -> 0x04f2 }
                java.util.LinkedList r5 = r5.t     // Catch:{ all -> 0x04f2 }
                r5.remove(r2)     // Catch:{ all -> 0x04f2 }
                monitor-exit(r3)     // Catch:{ all -> 0x04f2 }
                goto L_0x04ff
            L_0x04f2:
                r0 = move-exception
                r2 = r0
                monitor-exit(r3)     // Catch:{ all -> 0x04f2 }
                throw r2     // Catch:{ Throwable -> 0x04d4 }
            L_0x04f6:
                java.lang.String r3 = r1.f79035d
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.String r5 = " run finally error"
                com.taobao.accs.utl.ALog.e(r3, r5, r2, r4)
            L_0x04ff:
                throw r6
            L_0x0500:
                r0 = move-exception
                r2 = r0
                monitor-exit(r3)     // Catch:{ all -> 0x0500 }
                throw r2
            L_0x0504:
                com.taobao.accs.net.s r2 = com.taobao.accs.net.s.this
                r2.l()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.net.s.a.run():void");
        }

        private void a(boolean z) {
            if (s.this.s != 1) {
                ALog.d(s.this.d(), "tryConnect", "force", Boolean.valueOf(z));
                if (!UtilityImpl.k(s.this.f78992d)) {
                    ALog.e(this.f79035d, "Network not available", new Object[0]);
                    return;
                }
                if (z) {
                    this.f79032a = 0;
                }
                ALog.i(this.f79035d, "tryConnect", "force", Boolean.valueOf(z), "failTimes", Integer.valueOf(this.f79032a));
                if (s.this.s != 1 && this.f79032a >= 4) {
                    boolean unused = s.this.J = true;
                    ALog.e(this.f79035d, "tryConnect fail", "maxTimes", 4);
                } else if (s.this.s != 1) {
                    if (s.this.f78991c == 1 && this.f79032a == 0) {
                        ALog.i(this.f79035d, "tryConnect in app, no sleep", new Object[0]);
                    } else {
                        ALog.i(this.f79035d, "tryConnect, need sleep", new Object[0]);
                        try {
                            sleep(5000);
                        } catch (InterruptedException unused2) {
                        }
                    }
                    String unused3 = s.this.K = "";
                    if (this.f79032a == 3) {
                        s.this.M.b(s.this.m());
                    }
                    s.this.d((String) null);
                    s.this.H.setRetryTimes(this.f79032a);
                    if (s.this.s != 1) {
                        this.f79032a++;
                        ALog.e(this.f79035d, "try connect fail, ready for reconnect", new Object[0]);
                        a(false);
                        return;
                    }
                    this.f79033b = System.currentTimeMillis();
                }
            } else if (s.this.s == 1 && System.currentTimeMillis() - this.f79033b > 5000) {
                this.f79032a = 0;
            }
        }

        public a(String str) {
            super(str);
        }
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        return false;
    }

    public boolean n() {
        return this.v;
    }

    public void a(boolean z2, boolean z3) {
        String d2 = d();
        ALog.d(d2, "try ping, force:" + z2, new Object[0]);
        if (this.f78991c == 1) {
            ALog.d(d(), "INAPP, skip", new Object[0]);
        } else {
            b(Message.a(z2, (int) (z3 ? Math.random() * 10.0d * 1000.0d : 0.0d)), z2);
        }
    }

    public boolean a(String str) {
        boolean z2;
        synchronized (this.t) {
            z2 = true;
            int size = this.t.size() - 1;
            while (true) {
                if (size < 0) {
                    z2 = false;
                    break;
                }
                Message message = this.t.get(size);
                if (message != null && message.a() == 1 && message.O != null && message.O.equals(str)) {
                    this.t.remove(size);
                    break;
                }
                size--;
            }
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    public String d() {
        return "SilenceConn_" + this.m;
    }

    public void e() {
        super.e();
        this.v = false;
        ThreadPoolExecutorFactory.getScheduledExecutor().execute(new u(this));
        ALog.e(d(), "shut down", new Object[0]);
    }

    public void l() {
        ALog.e(d(), " force close!", new Object[0]);
        try {
            this.z.closeSession();
            this.H.setCloseType(1);
        } catch (Exception unused) {
        }
        c(3);
    }

    public String m() {
        String channelHost = this.i.getChannelHost();
        ALog.i(d(), "getChannelHost", "host", channelHost);
        if (channelHost == null) {
            return "";
        }
        return channelHost;
    }

    private int o() {
        boolean k = k();
        int i = 0;
        if (AccsClientConfig.mEnv != 2) {
            int channelPubKey = this.i.getChannelPubKey();
            if (channelPubKey > 0) {
                ALog.i(d(), "getPublicKeyType use custom pub key", "pubKey", Integer.valueOf(channelPubKey));
                return channelPubKey;
            } else if (k) {
                i = 4;
            } else {
                i = 3;
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    public synchronized void q() {
        if (this.f78991c != 1) {
            this.B = System.currentTimeMillis();
            this.C = System.nanoTime();
            f.a(this.f78992d).a();
        }
    }

    public void a() {
        this.v = true;
        ALog.d(d(), "start", new Object[0]);
        a(this.f78992d);
        if (this.u == null) {
            ALog.i(d(), "start thread", new Object[0]);
            this.u = new a("NetworkThread_" + this.m);
            this.u.setPriority(2);
            this.u.start();
        }
        a(false, false);
    }

    public void b() {
        this.J = false;
        this.f78994f = 0;
    }

    public c c() {
        boolean z2;
        if (this.I == null) {
            this.I = new c();
        }
        this.I.f79056b = this.f78991c;
        this.I.f79058d = this.t.size();
        this.I.i = UtilityImpl.k(this.f78992d);
        this.I.f79060f = this.K;
        this.I.f79055a = this.s;
        c cVar = this.I;
        int i = 0;
        if (this.H == null || !this.H.getRet()) {
            z2 = false;
        } else {
            z2 = true;
        }
        cVar.f79057c = z2;
        this.I.j = n();
        c cVar2 = this.I;
        if (this.f78993e != null) {
            i = this.f78993e.d();
        }
        cVar2.f79059e = i;
        this.I.g = this.x;
        return this.I;
    }

    private void p() {
        if (this.z == null) {
            c(3);
            return;
        }
        try {
            String encode = URLEncoder.encode(UtilityImpl.l(this.f78992d));
            String a2 = UtilityImpl.a(this.f78992d, i(), this.i.getAppSecret(), UtilityImpl.l(this.f78992d), this.m);
            String c2 = c(this.w);
            ALog.e(d(), "auth", PushConstants.WEB_URL, c2);
            this.x = c2;
            if (!a(encode, i(), a2)) {
                ALog.e(d(), "auth param error!", new Object[0]);
                d(-6);
                return;
            }
            new URL(c2);
            SpdyRequest spdyRequest = new SpdyRequest(new URL(c2), "GET", RequestPriority.DEFAULT_PRIORITY, 80000, 40000);
            spdyRequest.setDomain(m());
            this.z.submitRequest(spdyRequest, new SpdyDataProvider((byte[]) null), m(), this);
        } catch (Throwable th) {
            ALog.e(d(), "auth exception ", th, new Object[0]);
            d(-7);
        }
    }

    private void r() {
        String str;
        try {
            SpdyAgent.enableDebug = true;
            this.y = SpdyAgent.getInstance(this.f78992d, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
            if (SpdyAgent.checkLoadSucc()) {
                e.a();
                if (!k()) {
                    this.y.setAccsSslCallback(new w(this));
                }
                if (!h.a(false)) {
                    if (this.f78991c == 0) {
                        str = "service";
                    } else {
                        str = "inapp";
                    }
                    ALog.d(d(), "into--[setTnetLogPath]", new Object[0]);
                    String c2 = UtilityImpl.c(this.f78992d, str);
                    String d2 = d();
                    ALog.d(d2, "config tnet log path:" + c2, new Object[0]);
                    if (!TextUtils.isEmpty(c2)) {
                        this.y.configLogFile(c2, 5242880, 5);
                    }
                }
                return;
            }
            ALog.e(d(), "initClient", new Object[0]);
            e.b();
        } catch (Throwable th) {
            ALog.e(d(), "initClient", th, new Object[0]);
        }
    }

    public byte[] getSSLMeta(SpdySession spdySession) {
        return UtilityImpl.a(this.f78992d, this.m, this.f78990b, spdySession.getDomain());
    }

    public String b(String str) {
        return "https://" + this.i.getChannelHost();
    }

    private void d(int i) {
        int i2;
        String str;
        this.k = null;
        l();
        if (this.u != null) {
            i2 = this.u.f79032a;
        } else {
            i2 = 0;
        }
        SessionMonitor sessionMonitor = this.H;
        sessionMonitor.setCloseReason("code not 200 is" + i);
        this.L = true;
        if (this.f78991c == 0) {
            str = "service";
        } else {
            str = "inapp";
        }
        UTMini instance = UTMini.getInstance();
        instance.commitEvent(66001, "CONNECTED NO 200 " + str, (Object) Integer.valueOf(i), (Object) Integer.valueOf(i2), (Object) 221, this.x, this.K);
        b.a("accs", "auth", "", i, "");
    }

    /* access modifiers changed from: private */
    public void a(Message message) {
        if (message.t != null && this.t.size() != 0) {
            for (int size = this.t.size() - 1; size >= 0; size--) {
                Message message2 = this.t.get(size);
                if (!(message2 == null || message2.t == null || !message2.f().equals(message.f()))) {
                    switch (message.t.intValue()) {
                        case 1:
                        case 2:
                            if (message2.t.intValue() == 1 || message2.t.intValue() == 2) {
                                this.t.remove(size);
                                break;
                            }
                        case 3:
                        case 4:
                            if (message2.t.intValue() == 3 || message2.t.intValue() == 4) {
                                this.t.remove(size);
                                break;
                            }
                        case 5:
                        case 6:
                            if (message2.t.intValue() == 5 || message2.t.intValue() == 6) {
                                this.t.remove(size);
                                break;
                            }
                    }
                    ALog.d(d(), "clearRepeatControlCommand message:" + message2.t + "/" + message2.f(), new Object[0]);
                }
            }
            if (this.f78993e != null) {
                this.f78993e.b(message);
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0048 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0093 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x009f */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0097 A[SYNTHETIC, Splitter:B:41:0x0097] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void c(int r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.lang.String r0 = r9.d()     // Catch:{ all -> 0x00bc }
            java.lang.String r1 = "notifyStatus start"
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x00bc }
            java.lang.String r4 = "status"
            r5 = 0
            r3[r5] = r4     // Catch:{ all -> 0x00bc }
            java.lang.String r4 = r9.a((int) r10)     // Catch:{ all -> 0x00bc }
            r6 = 1
            r3[r6] = r4     // Catch:{ all -> 0x00bc }
            com.taobao.accs.utl.ALog.e(r0, r1, r3)     // Catch:{ all -> 0x00bc }
            int r0 = r9.s     // Catch:{ all -> 0x00bc }
            if (r10 != r0) goto L_0x002a
            java.lang.String r10 = r9.d()     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "ignore notifyStatus"
            java.lang.Object[] r1 = new java.lang.Object[r5]     // Catch:{ all -> 0x00bc }
            com.taobao.accs.utl.ALog.i(r10, r0, r1)     // Catch:{ all -> 0x00bc }
            monitor-exit(r9)
            return
        L_0x002a:
            r9.s = r10     // Catch:{ all -> 0x00bc }
            switch(r10) {
                case 1: goto L_0x0073;
                case 2: goto L_0x0056;
                case 3: goto L_0x0031;
                case 4: goto L_0x00a5;
                default: goto L_0x002f;
            }     // Catch:{ all -> 0x00bc }
        L_0x002f:
            goto L_0x00a5
        L_0x0031:
            r9.q()     // Catch:{ all -> 0x00bc }
            android.content.Context r0 = r9.f78992d     // Catch:{ all -> 0x00bc }
            com.taobao.accs.net.f r0 = com.taobao.accs.net.f.a((android.content.Context) r0)     // Catch:{ all -> 0x00bc }
            r0.d()     // Catch:{ all -> 0x00bc }
            java.lang.Object r0 = r9.A     // Catch:{ all -> 0x00bc }
            monitor-enter(r0)     // Catch:{ all -> 0x00bc }
            java.lang.Object r1 = r9.A     // Catch:{ Exception -> 0x0048 }
            r1.notifyAll()     // Catch:{ Exception -> 0x0048 }
            goto L_0x0048
        L_0x0046:
            r10 = move-exception
            goto L_0x0054
        L_0x0048:
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            com.taobao.accs.data.d r0 = r9.f78993e     // Catch:{ all -> 0x00bc }
            r1 = -10
            r0.a((int) r1)     // Catch:{ all -> 0x00bc }
            r9.a((boolean) r5, (boolean) r6)     // Catch:{ all -> 0x00bc }
            goto L_0x00a5
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0046 }
            throw r10     // Catch:{ all -> 0x00bc }
        L_0x0056:
            java.util.concurrent.ScheduledFuture<?> r0 = r9.n     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x005f
            java.util.concurrent.ScheduledFuture<?> r0 = r9.n     // Catch:{ all -> 0x00bc }
            r0.cancel(r6)     // Catch:{ all -> 0x00bc }
        L_0x005f:
            java.lang.String r0 = r9.N     // Catch:{ all -> 0x00bc }
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = com.taobao.accs.common.ThreadPoolExecutorFactory.getScheduledExecutor()     // Catch:{ all -> 0x00bc }
            com.taobao.accs.net.v r3 = new com.taobao.accs.net.v     // Catch:{ all -> 0x00bc }
            r3.<init>(r9, r0)     // Catch:{ all -> 0x00bc }
            r7 = 120000(0x1d4c0, double:5.9288E-319)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00bc }
            r1.schedule(r3, r7, r0)     // Catch:{ all -> 0x00bc }
            goto L_0x00a5
        L_0x0073:
            android.content.Context r0 = r9.f78992d     // Catch:{ all -> 0x00bc }
            com.taobao.accs.net.f r0 = com.taobao.accs.net.f.a((android.content.Context) r0)     // Catch:{ all -> 0x00bc }
            r0.f()     // Catch:{ all -> 0x00bc }
            r9.q()     // Catch:{ all -> 0x00bc }
            java.util.concurrent.ScheduledFuture<?> r0 = r9.n     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x0088
            java.util.concurrent.ScheduledFuture<?> r0 = r9.n     // Catch:{ all -> 0x00bc }
            r0.cancel(r6)     // Catch:{ all -> 0x00bc }
        L_0x0088:
            java.lang.Object r0 = r9.A     // Catch:{ all -> 0x00bc }
            monitor-enter(r0)     // Catch:{ all -> 0x00bc }
            java.lang.Object r1 = r9.A     // Catch:{ Exception -> 0x0093 }
            r1.notifyAll()     // Catch:{ Exception -> 0x0093 }
            goto L_0x0093
        L_0x0091:
            r10 = move-exception
            goto L_0x00a3
        L_0x0093:
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            java.util.LinkedList<com.taobao.accs.data.Message> r0 = r9.t     // Catch:{ all -> 0x00bc }
            monitor-enter(r0)     // Catch:{ all -> 0x00bc }
            java.util.LinkedList<com.taobao.accs.data.Message> r1 = r9.t     // Catch:{ Exception -> 0x009f }
            r1.notifyAll()     // Catch:{ Exception -> 0x009f }
            goto L_0x009f
        L_0x009d:
            r10 = move-exception
            goto L_0x00a1
        L_0x009f:
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            goto L_0x00a5
        L_0x00a1:
            monitor-exit(r0)     // Catch:{ all -> 0x009d }
            throw r10     // Catch:{ all -> 0x00bc }
        L_0x00a3:
            monitor-exit(r0)     // Catch:{ all -> 0x0091 }
            throw r10     // Catch:{ all -> 0x00bc }
        L_0x00a5:
            java.lang.String r0 = r9.d()     // Catch:{ all -> 0x00bc }
            java.lang.String r1 = "notifyStatus end"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00bc }
            java.lang.String r3 = "status"
            r2[r5] = r3     // Catch:{ all -> 0x00bc }
            java.lang.String r10 = r9.a((int) r10)     // Catch:{ all -> 0x00bc }
            r2[r6] = r10     // Catch:{ all -> 0x00bc }
            com.taobao.accs.utl.ALog.i(r0, r1, r2)     // Catch:{ all -> 0x00bc }
            monitor-exit(r9)
            return
        L_0x00bc:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.net.s.c(int):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x0265 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(java.lang.String r18) {
        /*
            r17 = this;
            r10 = r17
            r0 = r18
            int r1 = r10.s
            r2 = 2
            if (r1 == r2) goto L_0x026c
            int r1 = r10.s
            r3 = 1
            if (r1 != r3) goto L_0x0010
            goto L_0x026c
        L_0x0010:
            com.taobao.accs.net.g r1 = r10.M
            if (r1 != 0) goto L_0x001f
            com.taobao.accs.net.g r1 = new com.taobao.accs.net.g
            java.lang.String r4 = r17.m()
            r1.<init>(r4)
            r10.M = r1
        L_0x001f:
            com.taobao.accs.net.g r1 = r10.M
            java.lang.String r4 = r17.m()
            java.util.List r1 = r1.a((java.lang.String) r4)
            r4 = 0
            r6 = 443(0x1bb, float:6.21E-43)
            r11 = 0
            r7 = 3
            r8 = 4
            r13 = 0
            if (r1 == 0) goto L_0x00d2
            int r9 = r1.size()
            if (r9 <= 0) goto L_0x00d2
            java.util.Iterator r0 = r1.iterator()
        L_0x003e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0070
            java.lang.Object r1 = r0.next()
            anet.channel.strategy.IConnStrategy r1 = (anet.channel.strategy.IConnStrategy) r1
            if (r1 == 0) goto L_0x003e
            java.lang.String r9 = r17.d()
            java.lang.String r14 = "connect"
            java.lang.Object[] r15 = new java.lang.Object[r8]
            java.lang.String r16 = "ip"
            r15[r13] = r16
            java.lang.String r16 = r1.getIp()
            r15[r3] = r16
            java.lang.String r16 = "port"
            r15[r2] = r16
            int r1 = r1.getPort()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r15[r7] = r1
            com.taobao.accs.utl.ALog.e(r9, r14, r15)
            goto L_0x003e
        L_0x0070:
            boolean r0 = r10.L
            if (r0 == 0) goto L_0x007b
            com.taobao.accs.net.g r0 = r10.M
            r0.b()
            r10.L = r13
        L_0x007b:
            com.taobao.accs.net.g r0 = r10.M
            anet.channel.strategy.IConnStrategy r0 = r0.a()
            if (r0 != 0) goto L_0x0088
            java.lang.String r1 = r17.m()
            goto L_0x008c
        L_0x0088:
            java.lang.String r1 = r0.getIp()
        L_0x008c:
            r10.o = r1
            if (r0 != 0) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            int r6 = r0.getPort()
        L_0x0095:
            r10.p = r6
            java.lang.String r0 = "accs"
            java.lang.String r1 = "dns"
            java.lang.String r6 = "httpdns"
            com.taobao.accs.utl.b.a(r0, r1, r6, r4)
            java.lang.String r0 = r17.d()
            java.lang.String r1 = "connect from amdc succ"
            r4 = 6
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "ip"
            r4[r13] = r5
            java.lang.String r5 = r10.o
            r4[r3] = r5
            java.lang.String r5 = "port"
            r4[r2] = r5
            int r5 = r10.p
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r7] = r5
            java.lang.String r5 = "originPos"
            r4[r8] = r5
            r5 = 5
            com.taobao.accs.net.g r6 = r10.M
            int r6 = r6.c()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4[r5] = r6
            com.taobao.accs.utl.ALog.e(r0, r1, r4)
            goto L_0x0100
        L_0x00d2:
            if (r0 == 0) goto L_0x00d7
            r10.o = r0
            goto L_0x00dd
        L_0x00d7:
            java.lang.String r0 = r17.m()
            r10.o = r0
        L_0x00dd:
            long r0 = java.lang.System.currentTimeMillis()
            r14 = 2
            long r0 = r0 % r14
            int r9 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x00ea
            r6 = 80
        L_0x00ea:
            r10.p = r6
            java.lang.String r0 = "accs"
            java.lang.String r1 = "dns"
            java.lang.String r6 = "localdns"
            com.taobao.accs.utl.b.a(r0, r1, r6, r4)
            java.lang.String r0 = r17.d()
            java.lang.String r1 = "connect get ip from amdc fail!!"
            java.lang.Object[] r4 = new java.lang.Object[r13]
            com.taobao.accs.utl.ALog.i(r0, r1, r4)
        L_0x0100:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "https://"
            r0.<init>(r1)
            java.lang.String r1 = r10.o
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            int r1 = r10.p
            r0.append(r1)
            java.lang.String r1 = "/accs/"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.w = r0
            java.lang.String r0 = r17.d()
            java.lang.String r1 = "connect"
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = "URL"
            r4[r13] = r5
            java.lang.String r5 = r10.w
            r4[r3] = r5
            com.taobao.accs.utl.ALog.e(r0, r1, r4)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r10.N = r0
            com.taobao.accs.ut.monitor.SessionMonitor r0 = r10.H
            if (r0 == 0) goto L_0x014b
            anet.channel.appmonitor.IAppMonitor r0 = anet.channel.appmonitor.AppMonitor.getInstance()
            com.taobao.accs.ut.monitor.SessionMonitor r1 = r10.H
            r0.commitStat(r1)
        L_0x014b:
            com.taobao.accs.ut.monitor.SessionMonitor r0 = new com.taobao.accs.ut.monitor.SessionMonitor
            r0.<init>()
            r10.H = r0
            com.taobao.accs.ut.monitor.SessionMonitor r0 = r10.H
            int r1 = r10.f78991c
            if (r1 != 0) goto L_0x015b
            java.lang.String r1 = "service"
            goto L_0x015d
        L_0x015b:
            java.lang.String r1 = "inapp"
        L_0x015d:
            r0.setConnectType(r1)
            org.android.spdy.SpdyAgent r0 = r10.y
            if (r0 == 0) goto L_0x026b
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x026b }
            r10.D = r0     // Catch:{ Exception -> 0x026b }
            long r0 = java.lang.System.nanoTime()     // Catch:{ Exception -> 0x026b }
            r10.E = r0     // Catch:{ Exception -> 0x026b }
            android.content.Context r0 = r10.f78992d     // Catch:{ Exception -> 0x026b }
            java.lang.String r0 = com.taobao.accs.utl.UtilityImpl.a((android.content.Context) r0)     // Catch:{ Exception -> 0x026b }
            r10.q = r0     // Catch:{ Exception -> 0x026b }
            android.content.Context r0 = r10.f78992d     // Catch:{ Exception -> 0x026b }
            int r0 = com.taobao.accs.utl.UtilityImpl.b((android.content.Context) r0)     // Catch:{ Exception -> 0x026b }
            r10.r = r0     // Catch:{ Exception -> 0x026b }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x026b }
            r10.B = r0     // Catch:{ Exception -> 0x026b }
            com.taobao.accs.ut.monitor.SessionMonitor r0 = r10.H     // Catch:{ Exception -> 0x026b }
            r0.onStartConnect()     // Catch:{ Exception -> 0x026b }
            r10.c((int) r2)     // Catch:{ Exception -> 0x026b }
            java.lang.Object r14 = r10.A     // Catch:{ Exception -> 0x026b }
            monitor-enter(r14)     // Catch:{ Exception -> 0x026b }
            java.lang.String r0 = r10.q     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            if (r0 != 0) goto L_0x0209
            int r0 = r10.r     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            if (r0 < 0) goto L_0x0209
            boolean r0 = r10.J     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            if (r0 == 0) goto L_0x0209
            java.lang.String r0 = r17.d()     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.String r1 = "connect"
            java.lang.Object[] r4 = new java.lang.Object[r8]     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.String r5 = "proxy"
            r4[r13] = r5     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.String r5 = r10.q     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            r4[r3] = r5     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.String r3 = "port"
            r4[r2] = r3     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            int r2 = r10.r     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            r4[r7] = r2     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            com.taobao.accs.utl.ALog.e(r0, r1, r4)     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            org.android.spdy.SessionInfo r0 = new org.android.spdy.SessionInfo     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.String r2 = r10.o     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            int r3 = r10.p     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            r1.<init>()     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.String r4 = r17.m()     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            r1.append(r4)     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.String r4 = "_"
            r1.append(r4)     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.String r4 = r10.f78990b     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            r1.append(r4)     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.String r4 = r1.toString()     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.String r5 = r10.q     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            int r6 = r10.r     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.String r7 = r10.N     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            r9 = 4226(0x1082, float:5.922E-42)
            r1 = r0
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            r1.<init>()     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.String r2 = r10.q     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            r1.append(r2)     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.String r2 = ":"
            r1.append(r2)     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            int r2 = r10.r     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            r1.append(r2)     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.String r1 = r1.toString()     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            r10.K = r1     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            goto L_0x0244
        L_0x0209:
            java.lang.String r0 = r17.d()     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.String r1 = "connect normal"
            java.lang.Object[] r2 = new java.lang.Object[r13]     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            com.taobao.accs.utl.ALog.e(r0, r1, r2)     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            org.android.spdy.SessionInfo r0 = new org.android.spdy.SessionInfo     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.String r2 = r10.o     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            int r3 = r10.p     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            r1.<init>()     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.String r4 = r17.m()     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            r1.append(r4)     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.String r4 = "_"
            r1.append(r4)     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.String r4 = r10.f78990b     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            r1.append(r4)     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.String r4 = r1.toString()     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            r5 = 0
            r6 = 0
            java.lang.String r7 = r10.N     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            r9 = 4226(0x1082, float:5.922E-42)
            r1 = r0
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.String r1 = ""
            r10.K = r1     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
        L_0x0244:
            int r1 = r17.o()     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            r0.setPubKeySeqNum(r1)     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            r1 = 40000(0x9c40, float:5.6052E-41)
            r0.setConnectionTimeoutMs(r1)     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            org.android.spdy.SpdyAgent r1 = r10.y     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            org.android.spdy.SpdySession r0 = r1.createSession(r0)     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            r10.z = r0     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            com.taobao.accs.ut.monitor.SessionMonitor r0 = r10.H     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            r0.connection_stop_date = r11     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            java.lang.Object r0 = r10.A     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            r0.wait()     // Catch:{ InterruptedException -> 0x0267, Exception -> 0x0265 }
            goto L_0x0267
        L_0x0263:
            r0 = move-exception
            goto L_0x0269
        L_0x0265:
            r10.J = r13     // Catch:{ all -> 0x0263 }
        L_0x0267:
            monitor-exit(r14)     // Catch:{ all -> 0x0263 }
            goto L_0x026b
        L_0x0269:
            monitor-exit(r14)     // Catch:{ all -> 0x0263 }
            throw r0     // Catch:{ Exception -> 0x026b }
        L_0x026b:
            return
        L_0x026c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.net.s.d(java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public void a(Context context) {
        if (!this.g) {
            super.a(context);
            GlobalAppRuntimeInfo.setBackground(false);
            this.g = true;
            ALog.i(d(), "init awcn success!", new Object[0]);
        }
    }

    public int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        return UtilityImpl.a(this.f78992d, this.m, this.f78990b, spdySession.getDomain(), bArr);
    }

    public void bioPingRecvCallback(SpdySession spdySession, int i) {
        String d2 = d();
        ALog.w(d2, "bioPingRecvCallback uniId:" + i, new Object[0]);
    }

    public void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        String str;
        SuperviseConnectInfo superviseConnectInfo2 = superviseConnectInfo;
        this.F = superviseConnectInfo2.connectTime;
        int i = superviseConnectInfo2.handshakeTime;
        ALog.e(d(), "spdySessionConnectCB", "sessionConnectInterval", Integer.valueOf(this.F), "sslTime", Integer.valueOf(i), "reuse", Integer.valueOf(superviseConnectInfo2.sessionTicketReused));
        p();
        this.H.setRet(true);
        this.H.onConnectStop();
        this.H.tcp_time = (long) this.F;
        this.H.ssl_time = (long) i;
        if (this.f78991c == 0) {
            str = "service";
        } else {
            str = "inapp";
        }
        UTMini instance = UTMini.getInstance();
        instance.commitEvent(66001, "CONNECTED " + str + " " + superviseConnectInfo2.sessionTicketReused, (Object) String.valueOf(this.F), (Object) String.valueOf(i), (Object) 221, String.valueOf(superviseConnectInfo2.sessionTicketReused), this.x, this.K);
        b.a("accs", "connect", "");
    }

    /* access modifiers changed from: protected */
    public void a(Message message, boolean z2) {
        if (!this.v || message == null) {
            String d2 = d();
            ALog.e(d2, "not running or msg null! " + this.v, new Object[0]);
            return;
        }
        try {
            if (ThreadPoolExecutorFactory.getScheduledExecutor().getQueue().size() <= 1000) {
                ScheduledFuture<?> schedule = ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new t(this, message, z2), message.Q, TimeUnit.MILLISECONDS);
                if (message.a() == 1 && message.O != null) {
                    if (message.c()) {
                        a(message.O);
                    }
                    this.f78993e.f78944a.put(message.O, schedule);
                }
                if (message.e() != null) {
                    message.e().setDeviceId(UtilityImpl.l(this.f78992d));
                    message.e().setConnType(this.f78991c);
                    message.e().onEnterQueueData();
                }
                return;
            }
            throw new RejectedExecutionException("accs");
        } catch (RejectedExecutionException unused) {
            this.f78993e.a(message, 70008);
            String d3 = d();
            ALog.e(d3, "send queue full count:" + ThreadPoolExecutorFactory.getScheduledExecutor().getQueue().size(), new Object[0]);
        } catch (Throwable th) {
            this.f78993e.a(message, -8);
            ALog.e(d(), "send error", th, new Object[0]);
        }
    }

    public void spdyRequestRecvCallback(SpdySession spdySession, long j, Object obj) {
        ALog.d(d(), "spdyRequestRecvCallback", new Object[0]);
    }

    public s(Context context, int i, String str) {
        super(context, i, str);
        r();
    }

    public void spdyPingRecvCallback(SpdySession spdySession, long j, Object obj) {
        String d2 = d();
        ALog.d(d2, "spdyPingRecvCallback uniId:" + j, new Object[0]);
        if (j >= 0) {
            this.f78993e.b();
            f.a(this.f78992d).e();
            f.a(this.f78992d).a();
            this.H.onPingCBReceive();
            if (this.H.ping_rec_times % 2 == 0) {
                UtilityImpl.a(this.f78992d, "service_end", System.currentTimeMillis());
            }
        }
    }

    public void spdySessionFailedError(SpdySession spdySession, int i, Object obj) {
        int i2;
        String str;
        int i3 = i;
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e2) {
                Exception exc = e2;
                ALog.e(d(), "session cleanUp has exception: " + exc, new Object[0]);
            }
        }
        if (this.u != null) {
            i2 = this.u.f79032a;
        } else {
            i2 = 0;
        }
        ALog.e(d(), "spdySessionFailedError", "retryTimes", Integer.valueOf(i2), "errorId", Integer.valueOf(i));
        this.J = false;
        this.L = true;
        c(3);
        this.H.setFailReason(i3);
        this.H.onConnectStop();
        if (this.f78991c == 0) {
            str = "service";
        } else {
            str = "inapp";
        }
        UTMini.getInstance().commitEvent(66001, "DISCONNECT " + str, (Object) Integer.valueOf(i), (Object) Integer.valueOf(i2), (Object) 221, this.x, this.K);
        b.a("accs", "connect", "retrytimes:" + i2, i3, "");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (android.text.TextUtils.isEmpty(r14) != false) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            r11 = this;
            android.content.Context r0 = r11.f78992d
            int r0 = com.taobao.accs.utl.k.b(r0)
            r1 = 2
            r2 = 1
            if (r0 != r1) goto L_0x000b
            return r2
        L_0x000b:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r3 = 0
            if (r0 != 0) goto L_0x001e
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x001e
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 == 0) goto L_0x00a9
        L_0x001e:
            r0 = 3
            r11.c((int) r0)
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x002a
        L_0x0028:
            r0 = 1
            goto L_0x0038
        L_0x002a:
            boolean r12 = android.text.TextUtils.isEmpty(r13)
            if (r12 == 0) goto L_0x0032
            r0 = 2
            goto L_0x0038
        L_0x0032:
            boolean r12 = android.text.TextUtils.isEmpty(r14)
            if (r12 == 0) goto L_0x0028
        L_0x0038:
            com.taobao.accs.ut.monitor.SessionMonitor r12 = r11.H
            r12.setFailReason(r0)
            com.taobao.accs.ut.monitor.SessionMonitor r12 = r11.H
            r12.onConnectStop()
            int r12 = r11.f78991c
            if (r12 != 0) goto L_0x0049
            java.lang.String r12 = "service"
            goto L_0x004b
        L_0x0049:
            java.lang.String r12 = "inapp"
        L_0x004b:
            com.taobao.accs.net.s$a r13 = r11.u
            if (r13 == 0) goto L_0x0054
            com.taobao.accs.net.s$a r13 = r11.u
            int r13 = r13.f79032a
            goto L_0x0055
        L_0x0054:
            r13 = 0
        L_0x0055:
            com.taobao.accs.utl.UTMini r4 = com.taobao.accs.utl.UTMini.getInstance()
            r5 = 66001(0x101d1, float:9.2487E-41)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r6 = "DISCONNECT "
            r14.<init>(r6)
            r14.append(r12)
            java.lang.String r6 = r14.toString()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            r12 = 221(0xdd, float:3.1E-43)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            java.lang.String[] r10 = new java.lang.String[r1]
            java.lang.String r12 = r11.x
            r10[r3] = r12
            java.lang.String r12 = r11.K
            r10[r2] = r12
            r4.commitEvent((int) r5, (java.lang.String) r6, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r9, (java.lang.String[]) r10)
            java.lang.String r12 = "accs"
            java.lang.String r14 = "connect"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "retrytimes:"
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = r1.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = ""
            com.taobao.accs.utl.b.a(r12, r14, r13, r0, r1)
            r2 = 0
        L_0x00a9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.net.s.a(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* access modifiers changed from: protected */
    public void a(String str, boolean z2, String str2) {
        try {
            c(4);
            l();
            this.H.setCloseReason(str2);
        } catch (Exception unused) {
        }
    }

    public void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i, int i2) {
        b(i);
    }

    public void spdyOnStreamResponse(SpdySession spdySession, long j, Map<String, List<String>> map, Object obj) {
        String str;
        this.B = System.currentTimeMillis();
        this.C = System.nanoTime();
        try {
            Map<String, String> a2 = UtilityImpl.a(map);
            ALog.d("SilenceConn_", "spdyOnStreamResponse", "header", map);
            int parseInt = Integer.parseInt(a2.get(":status"));
            ALog.e(d(), "spdyOnStreamResponse", "httpStatusCode", Integer.valueOf(parseInt));
            if (parseInt == 200) {
                c(1);
                String str2 = a2.get("x-at");
                if (!TextUtils.isEmpty(str2)) {
                    this.k = str2;
                }
                SessionMonitor sessionMonitor = this.H;
                long j2 = 0;
                if (this.H.connection_stop_date > 0) {
                    j2 = System.currentTimeMillis() - this.H.connection_stop_date;
                }
                sessionMonitor.auth_time = j2;
                if (this.f78991c == 0) {
                    str = "service";
                } else {
                    str = "inapp";
                }
                UTMini instance = UTMini.getInstance();
                instance.commitEvent(66001, "CONNECTED 200 " + str, (Object) this.x, (Object) this.K, (Object) 221, PushConstants.PUSH_TYPE_NOTIFY);
                b.a("accs", "auth", "");
            } else {
                d(parseInt);
            }
        } catch (Exception e2) {
            ALog.e(d(), e2.toString(), new Object[0]);
            l();
            this.H.setCloseReason("exception");
        }
        ALog.d(d(), "spdyOnStreamResponse", new Object[0]);
    }

    public void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i) {
        String str;
        SuperviseConnectInfo superviseConnectInfo2 = superviseConnectInfo;
        ALog.e(d(), "spdySessionCloseCallback", "errorCode", Integer.valueOf(i));
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e2) {
                Exception exc = e2;
                String d2 = d();
                ALog.e(d2, "session cleanUp has exception: " + exc, new Object[0]);
            }
        }
        c(3);
        this.H.onCloseConnect();
        if (this.H.getConCloseDate() > 0 && this.H.getConStopDate() > 0) {
            this.H.getConCloseDate();
            this.H.getConStopDate();
        }
        this.H.setCloseReason(this.H.getCloseReason() + "tnet error:" + i);
        if (superviseConnectInfo2 != null) {
            this.H.live_time = (long) superviseConnectInfo2.keepalive_period_second;
        }
        AppMonitor.getInstance().commitStat(this.H);
        for (Message next : this.f78993e.e()) {
            if (next.e() != null) {
                next.e().setFailReason("session close");
                AppMonitor.getInstance().commitStat(next.e());
            }
        }
        if (this.f78991c == 0) {
            str = "service";
        } else {
            str = "inapp";
        }
        String d3 = d();
        ALog.d(d3, "spdySessionCloseCallback, conKeepTime:" + this.H.live_time + " connectType:" + str, new Object[0]);
        UTMini instance = UTMini.getInstance();
        StringBuilder sb = new StringBuilder("DISCONNECT CLOSE ");
        sb.append(str);
        instance.commitEvent(66001, sb.toString(), (Object) Integer.valueOf(i), (Object) Long.valueOf(this.H.live_time), (Object) 221, this.x, this.K);
    }

    public void spdyDataChunkRecvCB(SpdySession spdySession, boolean z2, long j, SpdyByteArray spdyByteArray, Object obj) {
        ALog.d(d(), "spdyDataChunkRecvCB", new Object[0]);
    }

    public void spdyDataRecvCallback(SpdySession spdySession, boolean z2, long j, int i, Object obj) {
        ALog.d(d(), "spdyDataRecvCallback", new Object[0]);
    }

    public void spdyDataSendCallback(SpdySession spdySession, boolean z2, long j, int i, Object obj) {
        ALog.d(d(), "spdyDataSendCallback", new Object[0]);
    }

    public void spdyStreamCloseCallback(SpdySession spdySession, long j, int i, Object obj, SuperviseData superviseData) {
        ALog.d(d(), "spdyStreamCloseCallback", new Object[0]);
        if (i != 0) {
            ALog.e(d(), "spdyStreamCloseCallback", "statusCode", Integer.valueOf(i));
            d(i);
        }
    }

    public void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i, int i2, int i3, int i4, byte[] bArr) {
        String str;
        q();
        ALog.e(d(), "onFrame", "type", Integer.valueOf(i2), "len", Integer.valueOf(bArr.length));
        StringBuilder sb = new StringBuilder();
        if (ALog.isPrintLog(ALog.Level.D) && bArr.length < 512) {
            long currentTimeMillis = System.currentTimeMillis();
            for (byte b2 : bArr) {
                sb.append(Integer.toHexString(b2 & 255));
                sb.append(" ");
            }
            ALog.d(d(), sb + " log time:" + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
        }
        if (i2 == 200) {
            try {
                long currentTimeMillis2 = System.currentTimeMillis();
                this.f78993e.a(bArr);
                d g = this.f78993e.g();
                if (g != null) {
                    g.f79063c = String.valueOf(currentTimeMillis2);
                    if (this.f78991c == 0) {
                        str = "service";
                    } else {
                        str = "inapp";
                    }
                    g.g = str;
                    g.a();
                }
            } catch (Throwable th) {
                ALog.e(d(), "onDataReceive ", th, new Object[0]);
                UTMini.getInstance().commitEvent(66001, "SERVICE_DATA_RECEIVE", UtilityImpl.a(th));
            }
            ALog.d(d(), "try handle msg", new Object[0]);
            g();
        } else {
            ALog.e(d(), "drop frame", "len", Integer.valueOf(bArr.length));
        }
        ALog.d(d(), "spdyCustomControlFrameRecvCallback", new Object[0]);
    }
}
