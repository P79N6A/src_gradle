package anet.channel.session;

import android.content.Context;
import anet.channel.AwcnConfig;
import anet.channel.Session;
import anet.channel.entity.ConnType;
import anet.channel.entity.a;
import anet.channel.request.Request;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.Utils;
import anet.channel.util.c;
import anet.channel.util.j;
import javax.net.ssl.SSLSocketFactory;

public class d extends Session {
    private SSLSocketFactory w;

    public Runnable getRecvTimeOutRunnable() {
        return null;
    }

    public void close() {
        notifyStatus(6, null);
    }

    public boolean isAvailable() {
        if (this.n == 4) {
            return true;
        }
        return false;
    }

    public void connect() {
        try {
            Request.Builder redirectEnable = new Request.Builder().setUrl(this.f1126c).setSeq(this.p).setConnectTimeout((int) (((float) this.r) * Utils.getNetworkTimeFactor())).setReadTimeout((int) (((float) this.s) * Utils.getNetworkTimeFactor())).setRedirectEnable(false);
            if (this.w != null) {
                redirectEnable.setSslSocketFactory(this.w);
            }
            if (this.m) {
                redirectEnable.addHeader("Host", this.f1128e);
            }
            if (c.a() && anet.channel.strategy.utils.c.a(this.f1128e)) {
                try {
                    this.f1129f = c.a(this.f1128e);
                } catch (Exception unused) {
                }
            }
            ALog.i("awcn.HttpSession", "HttpSession connect", null, "host", this.f1126c, "ip", this.f1129f, "port", Integer.valueOf(this.g));
            Request build = redirectEnable.build();
            build.setDnsOptimize(this.f1129f, this.g);
            ThreadPoolExecutorFactory.submitPriorityTask(new e(this, build), ThreadPoolExecutorFactory.Priority.LOW);
        } catch (Throwable th) {
            ALog.e("awcn.HttpSession", "HTTP connect fail.", null, th, new Object[0]);
        }
    }

    public void close(boolean z) {
        this.t = false;
        close();
    }

    public d(Context context, a aVar) {
        super(context, aVar);
        ConnType connType;
        if (this.k == null) {
            if (this.f1126c == null || !this.f1126c.startsWith("https")) {
                connType = ConnType.HTTP;
            } else {
                connType = ConnType.HTTPS;
            }
            this.j = connType;
            return;
        }
        if (AwcnConfig.isHttpsSniEnable() && this.j.equals(ConnType.HTTPS)) {
            this.w = new j(this.f1127d);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:9|10|(1:14)|15|(2:(1:18)|19)|(1:21)|22|(2:24|(2:28|29))|30|31|(1:33)(1:34)|35|36) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0073 */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0087 A[Catch:{ Throwable -> 0x00bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0099 A[Catch:{ Throwable -> 0x00bd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public anet.channel.request.Cancelable request(anet.channel.request.Request r9, anet.channel.RequestCb r10) {
        /*
            r8 = this;
            anet.channel.request.b r0 = anet.channel.request.b.NULL
            r1 = 0
            if (r9 == 0) goto L_0x0008
            anet.channel.statist.RequestStatistic r2 = r9.f1262a
            goto L_0x000f
        L_0x0008:
            anet.channel.statist.RequestStatistic r2 = new anet.channel.statist.RequestStatistic
            java.lang.String r3 = r8.f1127d
            r2.<init>(r3, r1)
        L_0x000f:
            anet.channel.entity.ConnType r3 = r8.j
            r2.setConnType(r3)
            long r3 = r2.start
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0024
            long r3 = java.lang.System.currentTimeMillis()
            r2.reqStart = r3
            r2.start = r3
        L_0x0024:
            if (r9 == 0) goto L_0x00ce
            if (r10 != 0) goto L_0x002a
            goto L_0x00ce
        L_0x002a:
            javax.net.ssl.SSLSocketFactory r3 = r9.getSslSocketFactory()     // Catch:{ Throwable -> 0x00bd }
            if (r3 != 0) goto L_0x003e
            javax.net.ssl.SSLSocketFactory r3 = r8.w     // Catch:{ Throwable -> 0x00bd }
            if (r3 == 0) goto L_0x003e
            anet.channel.request.Request$Builder r1 = r9.newBuilder()     // Catch:{ Throwable -> 0x00bd }
            javax.net.ssl.SSLSocketFactory r3 = r8.w     // Catch:{ Throwable -> 0x00bd }
            anet.channel.request.Request$Builder r1 = r1.setSslSocketFactory(r3)     // Catch:{ Throwable -> 0x00bd }
        L_0x003e:
            boolean r3 = r8.m     // Catch:{ Throwable -> 0x00bd }
            if (r3 == 0) goto L_0x004f
            if (r1 != 0) goto L_0x0048
            anet.channel.request.Request$Builder r1 = r9.newBuilder()     // Catch:{ Throwable -> 0x00bd }
        L_0x0048:
            java.lang.String r3 = "Host"
            java.lang.String r4 = r8.f1128e     // Catch:{ Throwable -> 0x00bd }
            r1.addHeader(r3, r4)     // Catch:{ Throwable -> 0x00bd }
        L_0x004f:
            if (r1 == 0) goto L_0x0055
            anet.channel.request.Request r9 = r1.build()     // Catch:{ Throwable -> 0x00bd }
        L_0x0055:
            java.lang.String r1 = r8.f1129f     // Catch:{ Throwable -> 0x00bd }
            if (r1 != 0) goto L_0x0073
            anet.channel.util.HttpUrl r1 = r9.getHttpUrl()     // Catch:{ Throwable -> 0x00bd }
            java.lang.String r1 = r1.host()     // Catch:{ Throwable -> 0x00bd }
            boolean r3 = anet.channel.util.c.a()     // Catch:{ Throwable -> 0x00bd }
            if (r3 == 0) goto L_0x0073
            boolean r3 = anet.channel.strategy.utils.c.a((java.lang.String) r1)     // Catch:{ Throwable -> 0x00bd }
            if (r3 == 0) goto L_0x0073
            java.lang.String r1 = anet.channel.util.c.a((java.lang.String) r1)     // Catch:{ Exception -> 0x0073 }
            r8.f1129f = r1     // Catch:{ Exception -> 0x0073 }
        L_0x0073:
            java.lang.String r1 = r8.f1129f     // Catch:{ Throwable -> 0x00bd }
            int r3 = r8.g     // Catch:{ Throwable -> 0x00bd }
            r9.setDnsOptimize(r1, r3)     // Catch:{ Throwable -> 0x00bd }
            anet.channel.entity.ConnType r1 = r8.j     // Catch:{ Throwable -> 0x00bd }
            boolean r1 = r1.isSSL()     // Catch:{ Throwable -> 0x00bd }
            r9.setUrlScheme(r1)     // Catch:{ Throwable -> 0x00bd }
            anet.channel.strategy.IConnStrategy r1 = r8.k     // Catch:{ Throwable -> 0x00bd }
            if (r1 == 0) goto L_0x0099
            anet.channel.statist.RequestStatistic r1 = r9.f1262a     // Catch:{ Throwable -> 0x00bd }
            anet.channel.strategy.IConnStrategy r3 = r8.k     // Catch:{ Throwable -> 0x00bd }
            int r3 = r3.getIpSource()     // Catch:{ Throwable -> 0x00bd }
            anet.channel.strategy.IConnStrategy r4 = r8.k     // Catch:{ Throwable -> 0x00bd }
            int r4 = r4.getIpType()     // Catch:{ Throwable -> 0x00bd }
            r1.setIpInfo(r3, r4)     // Catch:{ Throwable -> 0x00bd }
            goto L_0x009f
        L_0x0099:
            anet.channel.statist.RequestStatistic r1 = r9.f1262a     // Catch:{ Throwable -> 0x00bd }
            r3 = 1
            r1.setIpInfo(r3, r3)     // Catch:{ Throwable -> 0x00bd }
        L_0x009f:
            anet.channel.statist.RequestStatistic r1 = r9.f1262a     // Catch:{ Throwable -> 0x00bd }
            java.lang.String r3 = r8.l     // Catch:{ Throwable -> 0x00bd }
            r1.unit = r3     // Catch:{ Throwable -> 0x00bd }
            anet.channel.request.b r1 = new anet.channel.request.b     // Catch:{ Throwable -> 0x00bd }
            anet.channel.session.f r3 = new anet.channel.session.f     // Catch:{ Throwable -> 0x00bd }
            r3.<init>(r8, r9, r10, r2)     // Catch:{ Throwable -> 0x00bd }
            int r4 = anet.channel.util.h.a(r9)     // Catch:{ Throwable -> 0x00bd }
            java.util.concurrent.Future r3 = anet.channel.thread.ThreadPoolExecutorFactory.submitPriorityTask(r3, r4)     // Catch:{ Throwable -> 0x00bd }
            java.lang.String r9 = r9.getSeq()     // Catch:{ Throwable -> 0x00bd }
            r1.<init>(r3, r9)     // Catch:{ Throwable -> 0x00bd }
            r0 = r1
            goto L_0x00cd
        L_0x00bd:
            r9 = move-exception
            if (r10 == 0) goto L_0x00cd
            java.lang.String r9 = r9.toString()
            r1 = -101(0xffffffffffffff9b, float:NaN)
            java.lang.String r9 = anet.channel.util.ErrorConstant.formatMsg(r1, r9)
            r10.onFinish(r1, r9, r2)
        L_0x00cd:
            return r0
        L_0x00ce:
            if (r10 == 0) goto L_0x00d9
            r9 = -102(0xffffffffffffff9a, float:NaN)
            java.lang.String r1 = anet.channel.util.ErrorConstant.getErrMsg(r9)
            r10.onFinish(r9, r1, r2)
        L_0x00d9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.d.request(anet.channel.request.Request, anet.channel.RequestCb):anet.channel.request.Cancelable");
    }
}
