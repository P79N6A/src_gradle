package anet.channel.session;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.Config;
import anet.channel.DataFrameCb;
import anet.channel.IAuth;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.SessionInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.bytes.a;
import anet.channel.heartbeat.HeartbeatManager;
import anet.channel.heartbeat.IHeartbeat;
import anet.channel.heartbeat.b;
import anet.channel.request.Request;
import anet.channel.security.ISecurity;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpHelper;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.List;
import java.util.Map;
import org.android.spdy.SessionCb;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdyByteArray;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdySession;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.android.spdy.SuperviseConnectInfo;
import org.android.spdy.SuperviseData;
import org.json.JSONException;
import org.json.JSONObject;

public class TnetSpdySession extends Session implements SessionCb {
    protected long A;
    protected int B = -1;
    protected DataFrameCb C;
    protected IHeartbeat D;
    protected IAuth E;
    protected String F;
    protected ISecurity G;
    /* access modifiers changed from: private */
    public int H;
    protected SpdyAgent w;
    protected SpdySession x;
    protected volatile boolean y;
    protected long z;

    class a extends a {

        /* renamed from: b  reason: collision with root package name */
        private Request f1286b;

        /* renamed from: c  reason: collision with root package name */
        private RequestCb f1287c;

        /* renamed from: d  reason: collision with root package name */
        private int f1288d;

        /* renamed from: e  reason: collision with root package name */
        private long f1289e;

        public a(Request request, RequestCb requestCb) {
            this.f1286b = request;
            this.f1287c = requestCb;
        }

        private void a(SuperviseData superviseData, int i, String str) {
            try {
                this.f1286b.f1262a.rspEnd = System.currentTimeMillis();
                if (!this.f1286b.f1262a.isDone.get()) {
                    if (i > 0) {
                        this.f1286b.f1262a.ret = 1;
                    }
                    this.f1286b.f1262a.statusCode = i;
                    this.f1286b.f1262a.msg = str;
                    if (superviseData != null) {
                        this.f1286b.f1262a.rspEnd = superviseData.responseEnd;
                        this.f1286b.f1262a.sendBeforeTime = superviseData.sendStart - superviseData.requestStart;
                        this.f1286b.f1262a.sendDataTime = superviseData.sendEnd - this.f1286b.f1262a.sendStart;
                        this.f1286b.f1262a.firstDataTime = superviseData.responseStart - superviseData.sendEnd;
                        this.f1286b.f1262a.recDataTime = superviseData.responseEnd - superviseData.responseStart;
                        this.f1286b.f1262a.sendDataSize = (long) (superviseData.bodySize + superviseData.compressSize);
                        this.f1286b.f1262a.recDataSize = this.f1289e + ((long) superviseData.recvUncompressSize);
                        this.f1286b.f1262a.reqHeadInflateSize = (long) superviseData.uncompressSize;
                        this.f1286b.f1262a.reqHeadDeflateSize = (long) superviseData.compressSize;
                        this.f1286b.f1262a.reqBodyInflateSize = (long) superviseData.bodySize;
                        this.f1286b.f1262a.reqBodyDeflateSize = (long) superviseData.bodySize;
                        this.f1286b.f1262a.rspHeadDeflateSize = (long) superviseData.recvCompressSize;
                        this.f1286b.f1262a.rspHeadInflateSize = (long) superviseData.recvUncompressSize;
                        this.f1286b.f1262a.rspBodyDeflateSize = (long) superviseData.recvBodySize;
                        this.f1286b.f1262a.rspBodyInflateSize = this.f1289e;
                        if (this.f1286b.f1262a.contentLength == 0) {
                            this.f1286b.f1262a.contentLength = (long) superviseData.originContentLength;
                        }
                        TnetSpdySession.this.q.recvSizeCount += (long) (superviseData.recvBodySize + superviseData.recvCompressSize);
                        TnetSpdySession.this.q.sendSizeCount += (long) (superviseData.bodySize + superviseData.compressSize);
                    }
                }
            } catch (Exception unused) {
            }
        }

        public void spdyOnStreamResponse(SpdySession spdySession, long j, Map<String, List<String>> map, Object obj) {
            this.f1286b.f1262a.firstDataTime = System.currentTimeMillis() - this.f1286b.f1262a.sendStart;
            this.f1288d = HttpHelper.parseStatusCode(map);
            int unused = TnetSpdySession.this.H = 0;
            ALog.i("awcn.TnetSpdySession", "", this.f1286b.getSeq(), "statusCode", Integer.valueOf(this.f1288d));
            ALog.i("awcn.TnetSpdySession", "", this.f1286b.getSeq(), "response headers", map);
            if (this.f1287c != null) {
                this.f1287c.onResponseCode(this.f1288d, HttpHelper.cloneMap(map));
            }
            TnetSpdySession.this.handleCallbacks(16, null);
            this.f1286b.f1262a.contentEncoding = HttpHelper.getSingleHeaderFieldByKey(map, "Content-Encoding");
            this.f1286b.f1262a.contentType = HttpHelper.getSingleHeaderFieldByKey(map, "Content-Type");
            this.f1286b.f1262a.contentLength = (long) HttpHelper.parseContentLength(map);
            this.f1286b.f1262a.serverRT = HttpHelper.parseServerRT(map);
            TnetSpdySession.this.handleResponseCode(this.f1286b, this.f1288d);
            TnetSpdySession.this.handleResponseHeaders(this.f1286b, map);
            if (TnetSpdySession.this.D != null) {
                TnetSpdySession.this.D.reSchedule();
            }
        }

        public void spdyDataChunkRecvCB(SpdySession spdySession, boolean z, long j, SpdyByteArray spdyByteArray, Object obj) {
            if (ALog.isPrintLog(1)) {
                ALog.d("awcn.TnetSpdySession", "spdyDataChunkRecvCB", this.f1286b.getSeq(), "len", Integer.valueOf(spdyByteArray.getDataLength()), "fin", Boolean.valueOf(z));
            }
            this.f1289e += (long) spdyByteArray.getDataLength();
            this.f1286b.f1262a.recDataSize += (long) spdyByteArray.getDataLength();
            if (TnetSpdySession.this.D != null) {
                TnetSpdySession.this.D.reSchedule();
            }
            if (this.f1287c != null) {
                ByteArray a2 = a.C0000a.f1176a.a(spdyByteArray.getByteArray(), spdyByteArray.getDataLength());
                spdyByteArray.recycle();
                this.f1287c.onDataReceive(a2, z);
            }
            TnetSpdySession.this.handleCallbacks(32, null);
        }

        public void spdyStreamCloseCallback(SpdySession spdySession, long j, int i, Object obj, SuperviseData superviseData) {
            if (ALog.isPrintLog(1)) {
                ALog.d("awcn.TnetSpdySession", "spdyStreamCloseCallback", this.f1286b.getSeq(), "streamId", Long.valueOf(j), "errorCode", Integer.valueOf(i));
            }
            String str = "SUCCESS";
            if (i != 0) {
                this.f1288d = -304;
                str = ErrorConstant.formatMsg(-304, String.valueOf(i));
                if (i != -2005) {
                    AppMonitor.getInstance().commitStat(new ExceptionStatistic(-300, str, this.f1286b.f1262a, null));
                }
                ALog.e("awcn.TnetSpdySession", "spdyStreamCloseCallback error", this.f1286b.getSeq(), "session", TnetSpdySession.this.p, "status code", Integer.valueOf(i), "URL", this.f1286b.getHttpUrl().simpleUrlString());
            }
            this.f1286b.f1262a.tnetErrorCode = i;
            a(superviseData, this.f1288d, str);
            if (this.f1287c != null) {
                this.f1287c.onFinish(this.f1288d, str, this.f1286b.f1262a);
            }
            if (i == -2004) {
                if (!TnetSpdySession.this.y) {
                    TnetSpdySession.this.ping(true);
                }
                if (TnetSpdySession.d(TnetSpdySession.this) >= 2) {
                    ConnEvent connEvent = new ConnEvent();
                    connEvent.isSuccess = false;
                    StrategyCenter.getInstance().notifyConnEvent(TnetSpdySession.this.f1127d, TnetSpdySession.this.k, connEvent);
                    TnetSpdySession.this.close(true);
                }
            }
        }
    }

    public void bioPingRecvCallback(SpdySession spdySession, int i) {
    }

    public void onDisconnect() {
        this.y = false;
    }

    public Runnable getRecvTimeOutRunnable() {
        return new h(this);
    }

    public boolean isAvailable() {
        if (this.n == 4) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void b() {
        if (this.E != null) {
            this.E.auth(this, new i(this));
            return;
        }
        notifyStatus(4, null);
        this.q.ret = 1;
        if (this.D != null) {
            this.D.start(this);
        }
    }

    public void close() {
        ALog.e("awcn.TnetSpdySession", "force close!", this.p, "session", this);
        notifyStatus(7, null);
        try {
            if (this.D != null) {
                this.D.stop();
                this.D = null;
            }
            if (this.x != null) {
                this.x.closeSession();
            }
        } catch (Exception unused) {
        }
    }

    private void c() {
        SpdyAgent.enableDebug = false;
        this.w = SpdyAgent.getInstance(this.f1124a, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        if (this.G != null && !this.G.isSecOff()) {
            this.w.setAccsSslCallback(new j(this));
        }
        if (!AwcnConfig.isTnetHeaderCacheEnable()) {
            try {
                this.w.getClass().getDeclaredMethod("disableHeaderCache", new Class[0]).invoke(this.w, new Object[0]);
                ALog.i("awcn.TnetSpdySession", "tnet disableHeaderCache", null, new Object[0]);
            } catch (Exception e2) {
                ALog.e("awcn.TnetSpdySession", "tnet disableHeaderCache", null, e2, new Object[0]);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:6|7|8|(1:10)|11|(2:15|16)|17|18|(2:22|(1:24)(4:25|(1:27)(3:28|(1:30)(1:31)|32)|38|(2:40|41)(2:42|43)))|33|(1:35)(1:36)|37|38|(0)(0)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0030 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e5 A[Catch:{ Throwable -> 0x0164 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e6 A[Catch:{ Throwable -> 0x0164 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0126 A[Catch:{ Throwable -> 0x0164 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x013d A[Catch:{ Throwable -> 0x0164 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void connect() {
        /*
            r14 = this;
            int r0 = r14.n
            r10 = 1
            if (r0 == r10) goto L_0x0174
            int r0 = r14.n
            if (r0 == 0) goto L_0x0174
            int r0 = r14.n
            r1 = 4
            if (r0 != r1) goto L_0x0010
            goto L_0x0174
        L_0x0010:
            r11 = 0
            r12 = 2
            r13 = 0
            org.android.spdy.SpdyAgent r0 = r14.w     // Catch:{ Throwable -> 0x0164 }
            if (r0 != 0) goto L_0x001a
            r14.c()     // Catch:{ Throwable -> 0x0164 }
        L_0x001a:
            boolean r0 = anet.channel.util.c.a()     // Catch:{ Throwable -> 0x0164 }
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = r14.f1128e     // Catch:{ Throwable -> 0x0164 }
            boolean r0 = anet.channel.strategy.utils.c.a((java.lang.String) r0)     // Catch:{ Throwable -> 0x0164 }
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = r14.f1128e     // Catch:{ Exception -> 0x0030 }
            java.lang.String r0 = anet.channel.util.c.a((java.lang.String) r0)     // Catch:{ Exception -> 0x0030 }
            r14.f1129f = r0     // Catch:{ Exception -> 0x0030 }
        L_0x0030:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0164 }
            java.lang.String r7 = java.lang.String.valueOf(r2)     // Catch:{ Throwable -> 0x0164 }
            java.lang.String r0 = "awcn.TnetSpdySession"
            java.lang.String r2 = "connect"
            java.lang.String r3 = r14.p     // Catch:{ Throwable -> 0x0164 }
            r4 = 14
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0164 }
            java.lang.String r5 = "host"
            r4[r13] = r5     // Catch:{ Throwable -> 0x0164 }
            java.lang.String r5 = r14.f1126c     // Catch:{ Throwable -> 0x0164 }
            r4[r10] = r5     // Catch:{ Throwable -> 0x0164 }
            java.lang.String r5 = "ip"
            r4[r12] = r5     // Catch:{ Throwable -> 0x0164 }
            r5 = 3
            java.lang.String r6 = r14.f1129f     // Catch:{ Throwable -> 0x0164 }
            r4[r5] = r6     // Catch:{ Throwable -> 0x0164 }
            java.lang.String r5 = "port"
            r4[r1] = r5     // Catch:{ Throwable -> 0x0164 }
            r1 = 5
            int r5 = r14.g     // Catch:{ Throwable -> 0x0164 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Throwable -> 0x0164 }
            r4[r1] = r5     // Catch:{ Throwable -> 0x0164 }
            r1 = 6
            java.lang.String r5 = "sessionId"
            r4[r1] = r5     // Catch:{ Throwable -> 0x0164 }
            r1 = 7
            r4[r1] = r7     // Catch:{ Throwable -> 0x0164 }
            r1 = 8
            java.lang.String r5 = "SpdyProtocol,"
            r4[r1] = r5     // Catch:{ Throwable -> 0x0164 }
            r1 = 9
            anet.channel.entity.ConnType r5 = r14.j     // Catch:{ Throwable -> 0x0164 }
            r4[r1] = r5     // Catch:{ Throwable -> 0x0164 }
            r1 = 10
            java.lang.String r5 = "proxyIp,"
            r4[r1] = r5     // Catch:{ Throwable -> 0x0164 }
            r1 = 11
            java.lang.String r5 = r14.h     // Catch:{ Throwable -> 0x0164 }
            r4[r1] = r5     // Catch:{ Throwable -> 0x0164 }
            r1 = 12
            java.lang.String r5 = "proxyPort,"
            r4[r1] = r5     // Catch:{ Throwable -> 0x0164 }
            r1 = 13
            int r5 = r14.i     // Catch:{ Throwable -> 0x0164 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Throwable -> 0x0164 }
            r4[r1] = r5     // Catch:{ Throwable -> 0x0164 }
            anet.channel.util.ALog.e(r0, r2, r3, r4)     // Catch:{ Throwable -> 0x0164 }
            org.android.spdy.SessionInfo r0 = new org.android.spdy.SessionInfo     // Catch:{ Throwable -> 0x0164 }
            java.lang.String r2 = r14.f1129f     // Catch:{ Throwable -> 0x0164 }
            int r3 = r14.g     // Catch:{ Throwable -> 0x0164 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0164 }
            r1.<init>()     // Catch:{ Throwable -> 0x0164 }
            java.lang.String r4 = r14.f1126c     // Catch:{ Throwable -> 0x0164 }
            r1.append(r4)     // Catch:{ Throwable -> 0x0164 }
            java.lang.String r4 = "_"
            r1.append(r4)     // Catch:{ Throwable -> 0x0164 }
            java.lang.String r4 = r14.F     // Catch:{ Throwable -> 0x0164 }
            r1.append(r4)     // Catch:{ Throwable -> 0x0164 }
            java.lang.String r4 = r1.toString()     // Catch:{ Throwable -> 0x0164 }
            java.lang.String r5 = r14.h     // Catch:{ Throwable -> 0x0164 }
            int r6 = r14.i     // Catch:{ Throwable -> 0x0164 }
            anet.channel.entity.ConnType r1 = r14.j     // Catch:{ Throwable -> 0x0164 }
            int r9 = r1.getTnetConType()     // Catch:{ Throwable -> 0x0164 }
            r1 = r0
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x0164 }
            int r1 = r14.r     // Catch:{ Throwable -> 0x0164 }
            float r1 = (float) r1     // Catch:{ Throwable -> 0x0164 }
            float r2 = anet.channel.util.Utils.getNetworkTimeFactor()     // Catch:{ Throwable -> 0x0164 }
            float r1 = r1 * r2
            int r1 = (int) r1     // Catch:{ Throwable -> 0x0164 }
            r0.setConnectionTimeoutMs(r1)     // Catch:{ Throwable -> 0x0164 }
            anet.channel.entity.ConnType r1 = r14.j     // Catch:{ Throwable -> 0x0164 }
            boolean r1 = r1.isPublicKeyAuto()     // Catch:{ Throwable -> 0x0164 }
            if (r1 != 0) goto L_0x010a
            anet.channel.entity.ConnType r1 = r14.j     // Catch:{ Throwable -> 0x0164 }
            boolean r1 = r1.isQuic()     // Catch:{ Throwable -> 0x0164 }
            if (r1 != 0) goto L_0x010a
            anet.channel.entity.ConnType r1 = r14.j     // Catch:{ Throwable -> 0x0164 }
            boolean r1 = r1.isH2S()     // Catch:{ Throwable -> 0x0164 }
            if (r1 == 0) goto L_0x00e6
            goto L_0x010a
        L_0x00e6:
            int r1 = r14.B     // Catch:{ Throwable -> 0x0164 }
            if (r1 < 0) goto L_0x00f0
            int r1 = r14.B     // Catch:{ Throwable -> 0x0164 }
            r0.setPubKeySeqNum(r1)     // Catch:{ Throwable -> 0x0164 }
            goto L_0x0116
        L_0x00f0:
            anet.channel.entity.ConnType r1 = r14.j     // Catch:{ Throwable -> 0x0164 }
            anet.channel.security.ISecurity r2 = r14.G     // Catch:{ Throwable -> 0x0164 }
            if (r2 == 0) goto L_0x00fd
            anet.channel.security.ISecurity r2 = r14.G     // Catch:{ Throwable -> 0x0164 }
            boolean r2 = r2.isSecOff()     // Catch:{ Throwable -> 0x0164 }
            goto L_0x00fe
        L_0x00fd:
            r2 = 1
        L_0x00fe:
            int r1 = r1.getTnetPublicKey(r2)     // Catch:{ Throwable -> 0x0164 }
            r14.B = r1     // Catch:{ Throwable -> 0x0164 }
            int r1 = r14.B     // Catch:{ Throwable -> 0x0164 }
            r0.setPubKeySeqNum(r1)     // Catch:{ Throwable -> 0x0164 }
            goto L_0x0116
        L_0x010a:
            boolean r1 = r14.m     // Catch:{ Throwable -> 0x0164 }
            if (r1 == 0) goto L_0x0111
            java.lang.String r1 = r14.f1128e     // Catch:{ Throwable -> 0x0164 }
            goto L_0x0113
        L_0x0111:
            java.lang.String r1 = r14.f1127d     // Catch:{ Throwable -> 0x0164 }
        L_0x0113:
            r0.setCertHost(r1)     // Catch:{ Throwable -> 0x0164 }
        L_0x0116:
            org.android.spdy.SpdyAgent r1 = r14.w     // Catch:{ Throwable -> 0x0164 }
            org.android.spdy.SpdySession r0 = r1.createSession(r0)     // Catch:{ Throwable -> 0x0164 }
            r14.x = r0     // Catch:{ Throwable -> 0x0164 }
            org.android.spdy.SpdySession r0 = r14.x     // Catch:{ Throwable -> 0x0164 }
            int r0 = r0.getRefCount()     // Catch:{ Throwable -> 0x0164 }
            if (r0 <= r10) goto L_0x013d
            java.lang.String r0 = "awcn.TnetSpdySession"
            java.lang.String r1 = "get session ref count > 1!!!"
            java.lang.String r2 = r14.p     // Catch:{ Throwable -> 0x0164 }
            java.lang.Object[] r3 = new java.lang.Object[r13]     // Catch:{ Throwable -> 0x0164 }
            anet.channel.util.ALog.e(r0, r1, r2, r3)     // Catch:{ Throwable -> 0x0164 }
            anet.channel.entity.b r0 = new anet.channel.entity.b     // Catch:{ Throwable -> 0x0164 }
            r0.<init>(r10)     // Catch:{ Throwable -> 0x0164 }
            r14.notifyStatus(r13, r0)     // Catch:{ Throwable -> 0x0164 }
            r14.b()     // Catch:{ Throwable -> 0x0164 }
            return
        L_0x013d:
            r14.notifyStatus(r10, r11)     // Catch:{ Throwable -> 0x0164 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0164 }
            r14.z = r0     // Catch:{ Throwable -> 0x0164 }
            anet.channel.statist.SessionStatistic r0 = r14.q     // Catch:{ Throwable -> 0x0164 }
            java.lang.String r1 = r14.h     // Catch:{ Throwable -> 0x0164 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x0164 }
            r1 = r1 ^ r10
            r0.isProxy = r1     // Catch:{ Throwable -> 0x0164 }
            anet.channel.statist.SessionStatistic r0 = r14.q     // Catch:{ Throwable -> 0x0164 }
            java.lang.String r1 = "false"
            r0.isTunnel = r1     // Catch:{ Throwable -> 0x0164 }
            anet.channel.statist.SessionStatistic r0 = r14.q     // Catch:{ Throwable -> 0x0164 }
            boolean r1 = anet.channel.GlobalAppRuntimeInfo.isAppBackground()     // Catch:{ Throwable -> 0x0164 }
            r0.isBackground = r1     // Catch:{ Throwable -> 0x0164 }
            r0 = 0
            r14.A = r0     // Catch:{ Throwable -> 0x0164 }
            return
        L_0x0164:
            r0 = move-exception
            r14.notifyStatus(r12, r11)
            java.lang.String r1 = "awcn.TnetSpdySession"
            java.lang.String r2 = "connect exception "
            java.lang.String r3 = r14.p
            java.lang.Object[] r4 = new java.lang.Object[r13]
            anet.channel.util.ALog.e(r1, r2, r3, r0, r4)
            return
        L_0x0174:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.TnetSpdySession.connect():void");
    }

    public void setTnetPublicKey(int i) {
        this.B = i;
    }

    static /* synthetic */ int d(TnetSpdySession tnetSpdySession) {
        int i = tnetSpdySession.H + 1;
        tnetSpdySession.H = i;
        return i;
    }

    public void initConfig(Config config) {
        if (config != null) {
            this.F = config.getAppkey();
            this.G = config.getSecurity();
        }
    }

    public byte[] getSSLMeta(SpdySession spdySession) {
        String domain = spdySession.getDomain();
        byte[] bArr = null;
        if (TextUtils.isEmpty(domain)) {
            ALog.i("awcn.TnetSpdySession", "get sslticket host is null", null, new Object[0]);
            return null;
        }
        try {
            if (this.G != null) {
                ISecurity iSecurity = this.G;
                Context context = this.f1124a;
                bArr = iSecurity.getBytes(context, "accs_ssl_key2_" + domain);
            }
        } catch (Throwable th) {
            ALog.e("awcn.TnetSpdySession", "getSSLMeta", null, th, new Object[0]);
        }
        return bArr;
    }

    public void initSessionInfo(SessionInfo sessionInfo) {
        if (sessionInfo != null) {
            this.C = sessionInfo.dataFrameCb;
            this.E = sessionInfo.auth;
            if (sessionInfo.isKeepAlive) {
                this.q.isKL = 1;
                this.t = true;
                this.D = sessionInfo.heartbeat;
                if (this.D == null) {
                    this.D = HeartbeatManager.getDefaultHeartbeat();
                }
            }
        }
        if (AwcnConfig.isIdleSessionCloseEnable() && this.D == null) {
            this.D = new b();
        }
    }

    public void ping(boolean z2) {
        if (ALog.isPrintLog(1)) {
            ALog.d("awcn.TnetSpdySession", "ping", this.p, "host", this.f1126c, "thread", Thread.currentThread().getName());
        }
        if (z2) {
            try {
                if (this.x == null) {
                    if (this.q != null) {
                        this.q.closeReason = "session null";
                    }
                    ALog.e("awcn.TnetSpdySession", this.f1126c + " session null", this.p, new Object[0]);
                    close();
                } else if (this.n == 0 || this.n == 4) {
                    handleCallbacks(64, null);
                    this.y = true;
                    this.q.ppkgCount++;
                    this.x.submitPing();
                    if (ALog.isPrintLog(1)) {
                        ALog.d("awcn.TnetSpdySession", this.f1126c + " submit ping ms:" + (System.currentTimeMillis() - this.z) + " force:" + z2, this.p, new Object[0]);
                    }
                    setPingTimeout();
                    this.z = System.currentTimeMillis();
                    if (this.D != null) {
                        this.D.reSchedule();
                    }
                }
            } catch (SpdyErrorException e2) {
                if (e2.SpdyErrorGetCode() == -1104 || e2.SpdyErrorGetCode() == -1103) {
                    ALog.e("awcn.TnetSpdySession", "Send request on closed session!!!", this.p, new Object[0]);
                    notifyStatus(6, new anet.channel.entity.b(2));
                }
                ALog.e("awcn.TnetSpdySession", "ping", this.p, e2, new Object[0]);
            } catch (Exception e3) {
                ALog.e("awcn.TnetSpdySession", "ping", this.p, e3, new Object[0]);
            }
        }
    }

    public TnetSpdySession(Context context, anet.channel.entity.a aVar) {
        super(context, aVar);
    }

    public int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        String domain = spdySession.getDomain();
        int i = -1;
        if (TextUtils.isEmpty(domain)) {
            return -1;
        }
        int i2 = 0;
        try {
            if (this.G != null) {
                ISecurity iSecurity = this.G;
                Context context = this.f1124a;
                if (!iSecurity.saveBytes(context, "accs_ssl_key2_" + domain, bArr)) {
                    i2 = -1;
                }
                i = i2;
            }
        } catch (Throwable th) {
            ALog.e("awcn.TnetSpdySession", "putSSLMeta", null, th, new Object[0]);
        }
        return i;
    }

    public void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        this.q.connectionTime = (long) superviseConnectInfo.connectTime;
        this.q.sslTime = (long) superviseConnectInfo.handshakeTime;
        this.q.sslCalTime = (long) superviseConnectInfo.doHandshakeTime;
        this.q.netType = NetworkStatusHelper.getNetworkSubType();
        this.A = System.currentTimeMillis();
        notifyStatus(0, new anet.channel.entity.b(1));
        b();
        ALog.e("awcn.TnetSpdySession", "spdySessionConnectCB connect", this.p, "connectTime", Integer.valueOf(superviseConnectInfo.connectTime), "sslTime:", Integer.valueOf(superviseConnectInfo.handshakeTime));
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0111 A[Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0125 A[Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0174 A[Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01b1 A[Catch:{ SpdyErrorException -> 0x01cf, Exception -> 0x01cd }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01be A[Catch:{ SpdyErrorException -> 0x01cf, Exception -> 0x01cd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public anet.channel.request.Cancelable request(anet.channel.request.Request r21, anet.channel.RequestCb r22) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r22
            anet.channel.request.c r3 = anet.channel.request.c.NULL
            if (r0 == 0) goto L_0x000d
            anet.channel.statist.RequestStatistic r4 = r0.f1262a
            goto L_0x0015
        L_0x000d:
            anet.channel.statist.RequestStatistic r4 = new anet.channel.statist.RequestStatistic
            java.lang.String r5 = r1.f1127d
            r6 = 0
            r4.<init>(r5, r6)
        L_0x0015:
            anet.channel.entity.ConnType r5 = r1.j
            r4.setConnType(r5)
            long r5 = r4.start
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x002a
            long r5 = java.lang.System.currentTimeMillis()
            r4.reqStart = r5
            r4.start = r5
        L_0x002a:
            java.lang.String r5 = r1.f1129f
            int r6 = r1.g
            r4.setIPAndPort(r5, r6)
            anet.channel.strategy.IConnStrategy r5 = r1.k
            int r5 = r5.getIpSource()
            r4.ipRefer = r5
            anet.channel.strategy.IConnStrategy r5 = r1.k
            int r5 = r5.getIpType()
            r4.ipType = r5
            java.lang.String r5 = r1.l
            r4.unit = r5
            if (r0 == 0) goto L_0x021f
            if (r2 != 0) goto L_0x004b
            goto L_0x021f
        L_0x004b:
            r5 = 0
            r6 = 2
            org.android.spdy.SpdySession r7 = r1.x     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            if (r7 == 0) goto L_0x01d2
            int r7 = r1.n     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            if (r7 == 0) goto L_0x005a
            int r7 = r1.n     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            r8 = 4
            if (r7 != r8) goto L_0x01d2
        L_0x005a:
            boolean r7 = r1.m     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            if (r7 == 0) goto L_0x0065
            java.lang.String r7 = r1.f1128e     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            int r8 = r1.g     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            r0.setDnsOptimize(r7, r8)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
        L_0x0065:
            anet.channel.entity.ConnType r7 = r1.j     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            boolean r7 = r7.isSSL()     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            r0.setUrlScheme(r7)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.net.URL r9 = r21.getUrl()     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            boolean r7 = anet.channel.util.ALog.isPrintLog(r6)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            r19 = 1
            if (r7 == 0) goto L_0x00bf
            java.lang.String r7 = "awcn.TnetSpdySession"
            java.lang.String r8 = ""
            java.lang.String r10 = r21.getSeq()     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.lang.String r12 = "request URL"
            r11[r5] = r12     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.lang.String r12 = r9.toString()     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            r11[r19] = r12     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            anet.channel.util.ALog.i(r7, r8, r10, r11)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.lang.String r7 = "awcn.TnetSpdySession"
            java.lang.String r8 = ""
            java.lang.String r10 = r21.getSeq()     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.lang.String r12 = "request Method"
            r11[r5] = r12     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.lang.String r12 = r21.getMethod()     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            r11[r19] = r12     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            anet.channel.util.ALog.i(r7, r8, r10, r11)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.lang.String r7 = "awcn.TnetSpdySession"
            java.lang.String r8 = ""
            java.lang.String r10 = r21.getSeq()     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.lang.String r12 = "request headers"
            r11[r5] = r12     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.util.Map r12 = r21.getHeaders()     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            r11[r19] = r12     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            anet.channel.util.ALog.i(r7, r8, r10, r11)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
        L_0x00bf:
            java.lang.String r7 = r1.h     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            if (r7 != 0) goto L_0x00ed
            int r7 = r1.i     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            if (r7 > 0) goto L_0x00cc
            goto L_0x00ed
        L_0x00cc:
            org.android.spdy.SpdyRequest r7 = new org.android.spdy.SpdyRequest     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.lang.String r10 = r9.getHost()     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            int r11 = r9.getPort()     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.lang.String r12 = r1.h     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            int r13 = r1.i     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.lang.String r14 = r21.getMethod()     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            org.android.spdy.RequestPriority r15 = org.android.spdy.RequestPriority.DEFAULT_PRIORITY     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            r16 = -1
            int r17 = r21.getConnectTimeout()     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            r18 = 0
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            goto L_0x00fe
        L_0x00ed:
            org.android.spdy.SpdyRequest r7 = new org.android.spdy.SpdyRequest     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.lang.String r10 = r21.getMethod()     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            org.android.spdy.RequestPriority r11 = org.android.spdy.RequestPriority.DEFAULT_PRIORITY     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            r12 = -1
            int r13 = r21.getConnectTimeout()     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            r8 = r7
            r8.<init>((java.net.URL) r9, (java.lang.String) r10, (org.android.spdy.RequestPriority) r11, (int) r12, (int) r13)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
        L_0x00fe:
            int r8 = r21.getReadTimeout()     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            r7.setRequestRdTimeoutMs(r8)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.util.Map r8 = r21.getHeaders()     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.lang.String r9 = "Host"
            boolean r9 = r8.containsKey(r9)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            if (r9 != 0) goto L_0x0125
            r7.addHeaders(r8)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.lang.String r8 = ":host"
            boolean r9 = r1.m     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            if (r9 == 0) goto L_0x011d
            java.lang.String r9 = r1.f1128e     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            goto L_0x0121
        L_0x011d:
            java.lang.String r9 = r21.getHost()     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
        L_0x0121:
            r7.addHeader(r8, r9)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            goto L_0x0144
        L_0x0125:
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.util.Map r9 = r21.getHeaders()     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            r8.<init>(r9)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.lang.String r9 = "Host"
            java.lang.Object r9 = r8.remove(r9)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.lang.String r10 = ":host"
            boolean r11 = r1.m     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            if (r11 == 0) goto L_0x013e
            java.lang.String r9 = r1.f1128e     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
        L_0x013e:
            r8.put(r10, r9)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            r7.addHeaders(r8)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
        L_0x0144:
            byte[] r8 = r21.getBodyBytes()     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            org.android.spdy.SpdyDataProvider r9 = new org.android.spdy.SpdyDataProvider     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            r9.<init>((byte[]) r8)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            anet.channel.statist.RequestStatistic r8 = r0.f1262a     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            r8.sendStart = r10     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            anet.channel.statist.RequestStatistic r8 = r0.f1262a     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            anet.channel.statist.RequestStatistic r10 = r0.f1262a     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            long r10 = r10.sendStart     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            anet.channel.statist.RequestStatistic r12 = r0.f1262a     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            long r12 = r12.start     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            r14 = 0
            long r10 = r10 - r12
            r8.processTime = r10     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            org.android.spdy.SpdySession r8 = r1.x     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            anet.channel.session.TnetSpdySession$a r10 = new anet.channel.session.TnetSpdySession$a     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            r10.<init>(r0, r2)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            int r7 = r8.submitRequest(r7, r9, r1, r10)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            boolean r8 = anet.channel.util.ALog.isPrintLog(r19)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            if (r8 == 0) goto L_0x018b
            java.lang.String r8 = "awcn.TnetSpdySession"
            java.lang.String r9 = ""
            java.lang.String r10 = r21.getSeq()     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.lang.Object[] r11 = new java.lang.Object[r6]     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.lang.String r12 = "streamId"
            r11[r5] = r12     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r7)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            r11[r19] = r12     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            anet.channel.util.ALog.d(r8, r9, r10, r11)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
        L_0x018b:
            anet.channel.request.c r8 = new anet.channel.request.c     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            org.android.spdy.SpdySession r9 = r1.x     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            java.lang.String r10 = r21.getSeq()     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            r8.<init>(r9, r7, r10)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            anet.channel.statist.SessionStatistic r3 = r1.q     // Catch:{ SpdyErrorException -> 0x01cf, Exception -> 0x01cd }
            long r9 = r3.requestCount     // Catch:{ SpdyErrorException -> 0x01cf, Exception -> 0x01cd }
            r11 = 1
            long r9 = r9 + r11
            r3.requestCount = r9     // Catch:{ SpdyErrorException -> 0x01cf, Exception -> 0x01cd }
            anet.channel.statist.SessionStatistic r3 = r1.q     // Catch:{ SpdyErrorException -> 0x01cf, Exception -> 0x01cd }
            long r9 = r3.stdRCount     // Catch:{ SpdyErrorException -> 0x01cf, Exception -> 0x01cd }
            r7 = 0
            long r9 = r9 + r11
            r3.stdRCount = r9     // Catch:{ SpdyErrorException -> 0x01cf, Exception -> 0x01cd }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ SpdyErrorException -> 0x01cf, Exception -> 0x01cd }
            r1.z = r9     // Catch:{ SpdyErrorException -> 0x01cf, Exception -> 0x01cd }
            anet.channel.heartbeat.IHeartbeat r3 = r1.D     // Catch:{ SpdyErrorException -> 0x01cf, Exception -> 0x01cd }
            if (r3 == 0) goto L_0x01b6
            anet.channel.heartbeat.IHeartbeat r3 = r1.D     // Catch:{ SpdyErrorException -> 0x01cf, Exception -> 0x01cd }
            r3.reSchedule()     // Catch:{ SpdyErrorException -> 0x01cf, Exception -> 0x01cd }
        L_0x01b6:
            anet.channel.entity.ConnType r3 = r1.j     // Catch:{ SpdyErrorException -> 0x01cf, Exception -> 0x01cd }
            boolean r3 = r3.isQuic()     // Catch:{ SpdyErrorException -> 0x01cf, Exception -> 0x01cd }
            if (r3 == 0) goto L_0x01cb
            anet.channel.statist.RequestStatistic r0 = r0.f1262a     // Catch:{ SpdyErrorException -> 0x01cf, Exception -> 0x01cd }
            java.lang.String r3 = "QuicConnectionID"
            org.android.spdy.SpdySession r7 = r1.x     // Catch:{ SpdyErrorException -> 0x01cf, Exception -> 0x01cd }
            java.lang.String r7 = r7.getQuicConnectionID()     // Catch:{ SpdyErrorException -> 0x01cf, Exception -> 0x01cd }
            r0.putExtra(r3, r7)     // Catch:{ SpdyErrorException -> 0x01cf, Exception -> 0x01cd }
        L_0x01cb:
            r3 = r8
            goto L_0x021e
        L_0x01cd:
            r3 = r8
            goto L_0x01de
        L_0x01cf:
            r0 = move-exception
            r3 = r8
            goto L_0x01e9
        L_0x01d2:
            r7 = -301(0xfffffffffffffed3, float:NaN)
            java.lang.String r8 = anet.channel.util.ErrorConstant.getErrMsg(r7)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            anet.channel.statist.RequestStatistic r0 = r0.f1262a     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            r2.onFinish(r7, r8, r0)     // Catch:{ SpdyErrorException -> 0x01e8, Exception -> 0x01de }
            goto L_0x021e
        L_0x01de:
            r0 = -101(0xffffffffffffff9b, float:NaN)
            java.lang.String r5 = anet.channel.util.ErrorConstant.getErrMsg(r0)
            r2.onFinish(r0, r5, r4)
            goto L_0x021e
        L_0x01e8:
            r0 = move-exception
        L_0x01e9:
            int r7 = r0.SpdyErrorGetCode()
            r8 = -1104(0xfffffffffffffbb0, float:NaN)
            if (r7 == r8) goto L_0x01f9
            int r7 = r0.SpdyErrorGetCode()
            r8 = -1103(0xfffffffffffffbb1, float:NaN)
            if (r7 != r8) goto L_0x020d
        L_0x01f9:
            java.lang.String r7 = "awcn.TnetSpdySession"
            java.lang.String r8 = "Send request on closed session!!!"
            java.lang.String r9 = r1.p
            java.lang.Object[] r5 = new java.lang.Object[r5]
            anet.channel.util.ALog.e(r7, r8, r9, r5)
            r5 = 6
            anet.channel.entity.b r7 = new anet.channel.entity.b
            r7.<init>(r6)
            r1.notifyStatus(r5, r7)
        L_0x020d:
            int r0 = r0.SpdyErrorGetCode()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5 = -300(0xfffffffffffffed4, float:NaN)
            java.lang.String r0 = anet.channel.util.ErrorConstant.formatMsg(r5, r0)
            r2.onFinish(r5, r0, r4)
        L_0x021e:
            return r3
        L_0x021f:
            if (r2 == 0) goto L_0x022a
            r0 = -102(0xffffffffffffff9a, float:NaN)
            java.lang.String r5 = anet.channel.util.ErrorConstant.getErrMsg(r0)
            r2.onFinish(r0, r5, r4)
        L_0x022a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.TnetSpdySession.request(anet.channel.request.Request, anet.channel.RequestCb):anet.channel.request.Cancelable");
    }

    public void spdyPingRecvCallback(SpdySession spdySession, long j, Object obj) {
        if (ALog.isPrintLog(2)) {
            ALog.i("awcn.TnetSpdySession", "ping receive", this.p, "Host", this.f1126c, "id", Long.valueOf(j));
        }
        if (j >= 0) {
            this.y = false;
            this.H = 0;
            if (this.D != null) {
                this.D.reSchedule();
            }
            handleCallbacks(SearchJediMixFeedAdapter.f42517f, null);
        }
    }

    public void spdySessionFailedError(SpdySession spdySession, int i, Object obj) {
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e2) {
                ALog.e("awcn.TnetSpdySession", "[spdySessionFailedError]session clean up failed!", null, e2, new Object[0]);
            }
        }
        notifyStatus(2, new anet.channel.entity.b(256, i, "tnet connect fail"));
        ALog.e("awcn.TnetSpdySession", null, this.p, " errorId:", Integer.valueOf(i));
        this.q.errorCode = (long) i;
        this.q.ret = 0;
        this.q.netType = NetworkStatusHelper.getNetworkSubType();
        AppMonitor.getInstance().commitStat(this.q);
        AppMonitor.getInstance().commitAlarm(this.q.getAlarmObject());
    }

    public void sendCustomFrame(int i, byte[] bArr, int i2) {
        int i3;
        try {
            if (this.C != null) {
                ALog.e("awcn.TnetSpdySession", "sendCustomFrame", this.p, "dataId", Integer.valueOf(i), "type", Integer.valueOf(i2));
                if (this.n != 4 || this.x == null) {
                    ALog.e("awcn.TnetSpdySession", "sendCustomFrame", this.p, "sendCustomFrame con invalid mStatus:" + this.n);
                    a(i, -301, true, "session invalid");
                } else if (bArr == null || bArr.length <= 16384) {
                    SpdySession spdySession = this.x;
                    if (bArr == null) {
                        i3 = 0;
                    } else {
                        i3 = bArr.length;
                    }
                    spdySession.sendCustomControlFrame(i, i2, 0, i3, bArr);
                    this.q.requestCount++;
                    this.q.cfRCount++;
                    this.z = System.currentTimeMillis();
                    if (this.D != null) {
                        this.D.reSchedule();
                    }
                } else {
                    a(i, -303, false, null);
                }
            }
        } catch (SpdyErrorException e2) {
            ALog.e("awcn.TnetSpdySession", "sendCustomFrame error", this.p, e2, new Object[0]);
            a(i, -300, true, "SpdyErrorException: " + e2.toString());
        } catch (Exception e3) {
            ALog.e("awcn.TnetSpdySession", "sendCustomFrame error", this.p, e3, new Object[0]);
            a(i, -101, true, e3.toString());
        }
    }

    private void a(int i, int i2, boolean z2, String str) {
        if (this.C != null) {
            this.C.onException(i, i2, z2, str);
        }
    }

    public void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i, int i2) {
        ALog.e("awcn.TnetSpdySession", "spdyCustomControlFrameFailCallback", this.p, "dataId", Integer.valueOf(i));
        a(i, i2, true, "tnet error");
    }

    public void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i) {
        ALog.e("awcn.TnetSpdySession", "spdySessionCloseCallback", this.p, " errorCode:", Integer.valueOf(i));
        if (this.D != null) {
            this.D.stop();
            this.D = null;
        }
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e2) {
                ALog.e("awcn.TnetSpdySession", "session clean up failed!", null, e2, new Object[0]);
            }
        }
        notifyStatus(6, new anet.channel.entity.b(2));
        if (superviseConnectInfo != null) {
            this.q.requestCount = (long) superviseConnectInfo.reused_counter;
            this.q.liveTime = (long) superviseConnectInfo.keepalive_period_second;
            try {
                if (this.j.isQuic()) {
                    this.q.extra = new JSONObject();
                    this.q.extra.put("QuicConnectionID", this.x.getQuicConnectionID());
                    this.q.extra.put("retransmissionRate", superviseConnectInfo.retransmissionRate);
                    this.q.extra.put("lossRate", superviseConnectInfo.lossRate);
                    this.q.extra.put("tlpCount", superviseConnectInfo.tlpCount);
                    this.q.extra.put("rtoCount", superviseConnectInfo.rtoCount);
                }
            } catch (JSONException unused) {
            }
        }
        if (this.q.errorCode == 0) {
            this.q.errorCode = (long) i;
        }
        this.q.lastPingInterval = (int) (System.currentTimeMillis() - this.z);
        AppMonitor.getInstance().commitStat(this.q);
        AppMonitor.getInstance().commitAlarm(this.q.getAlarmObject());
    }

    public void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i, int i2, int i3, int i4, byte[] bArr) {
        ALog.e("awcn.TnetSpdySession", "[spdyCustomControlFrameRecvCallback]", this.p, "len", Integer.valueOf(i4), "frameCb", this.C);
        if (ALog.isPrintLog(1) && i4 < 512) {
            String str = "";
            for (int i5 = 0; i5 < bArr.length; i5++) {
                str = str + Integer.toHexString(bArr[i5] & 255) + " ";
            }
            ALog.e("awcn.TnetSpdySession", null, this.p, "str", str);
        }
        if (this.C != null) {
            this.C.onDataReceive(this, bArr, i, i2);
        } else {
            ALog.e("awcn.TnetSpdySession", "AccsFrameCb is null", this.p, new Object[0]);
            AppMonitor.getInstance().commitStat(new ExceptionStatistic(-105, null, "rt"));
        }
        this.q.inceptCount++;
        if (this.D != null) {
            this.D.reSchedule();
        }
    }
}
