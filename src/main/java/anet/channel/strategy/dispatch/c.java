package anet.channel.strategy.dispatch;

import android.util.Base64InputStream;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.flow.FlowStat;
import anet.channel.flow.NetworkAnalysis;
import anet.channel.statist.AmdcStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HostnameVerifier;

public class c {

    /* renamed from: a  reason: collision with root package name */
    static AtomicInteger f1373a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    static HostnameVerifier f1374b = new d();

    /* renamed from: c  reason: collision with root package name */
    static Random f1375c = new Random();

    c() {
    }

    static List<IConnStrategy> a(String str) {
        List<IConnStrategy> list = Collections.EMPTY_LIST;
        if (!NetworkStatusHelper.isProxy()) {
            list = StrategyCenter.getInstance().getConnStrategyListByHost(DispatchConstants.getAmdcServerDomain());
            ListIterator<IConnStrategy> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                if (!listIterator.next().getProtocol().protocol.equalsIgnoreCase(str)) {
                    listIterator.remove();
                }
            }
        }
        return list;
    }

    public static void a(Map map) {
        IConnStrategy iConnStrategy;
        String str;
        boolean z;
        String str2;
        if (map != null) {
            String schemeByHost = StrategyCenter.getInstance().getSchemeByHost(DispatchConstants.getAmdcServerDomain(), "http");
            List<IConnStrategy> a2 = a(schemeByHost);
            for (int i = 0; i < 3; i++) {
                HashMap hashMap = new HashMap(map);
                if (i != 2) {
                    if (!a2.isEmpty()) {
                        iConnStrategy = a2.remove(0);
                    } else {
                        iConnStrategy = null;
                    }
                    if (iConnStrategy != null) {
                        str = a(schemeByHost, iConnStrategy.getIp(), iConnStrategy.getPort(), (Map<String, String>) hashMap, i);
                    } else {
                        str = a(schemeByHost, (String) null, 0, (Map<String, String>) hashMap, i);
                    }
                } else {
                    String[] amdcServerFixIp = DispatchConstants.getAmdcServerFixIp();
                    if (amdcServerFixIp == null || amdcServerFixIp.length <= 0) {
                        str2 = a(schemeByHost, (String) null, 0, (Map<String, String>) hashMap, i);
                    } else {
                        str2 = a(schemeByHost, amdcServerFixIp[f1375c.nextInt(amdcServerFixIp.length)], 0, (Map<String, String>) hashMap, i);
                    }
                    String str3 = str2;
                    iConnStrategy = null;
                    str = str3;
                }
                int a3 = a(str, (Map) hashMap, i);
                if (iConnStrategy != null) {
                    ConnEvent connEvent = new ConnEvent();
                    if (a3 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    connEvent.isSuccess = z;
                    StrategyCenter.getInstance().notifyConnEvent(DispatchConstants.getAmdcServerDomain(), iConnStrategy, connEvent);
                }
                if (a3 == 0 || a3 == 2) {
                    break;
                }
            }
        }
    }

    static String a(InputStream inputStream, boolean z) {
        FilterInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        if (z) {
            try {
                bufferedInputStream = new GZIPInputStream(bufferedInputStream);
            } catch (IOException e2) {
                e = e2;
                try {
                    ALog.e("awcn.DispatchCore", "", null, e, new Object[0]);
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused) {
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    try {
                        bufferedInputStream.close();
                    } catch (IOException unused2) {
                    }
                    throw th;
                }
            }
        }
        FilterInputStream base64InputStream = new Base64InputStream(bufferedInputStream, 0);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = base64InputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            String str = new String(byteArrayOutputStream.toByteArray(), "utf-8");
            try {
                base64InputStream.close();
            } catch (IOException unused3) {
            }
            return str;
        } catch (IOException e3) {
            e = e3;
            bufferedInputStream = base64InputStream;
            ALog.e("awcn.DispatchCore", "", null, e, new Object[0]);
            bufferedInputStream.close();
            return null;
        } catch (Throwable th2) {
            th = th2;
            bufferedInputStream = base64InputStream;
            bufferedInputStream.close();
            throw th;
        }
    }

    static void a(String str, long j, long j2) {
        try {
            FlowStat flowStat = new FlowStat();
            flowStat.refer = "amdc";
            flowStat.protocoltype = "http";
            flowStat.req_identifier = str;
            flowStat.upstream = j;
            flowStat.downstream = j2;
            NetworkAnalysis.getInstance().commitFlow(flowStat);
        } catch (Exception e2) {
            ALog.e("awcn.DispatchCore", "commit flow info failed!", null, e2, new Object[0]);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:104|105|(2:107|108)|111) */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        anet.channel.strategy.dispatch.HttpDispatcher.getInstance().a(new anet.channel.strategy.dispatch.DispatchEvent(0, null));
        anet.channel.util.ALog.e("awcn.DispatchCore", "resolve amdc anser failed", r3, new java.lang.Object[0]);
        a("-1004", "resolve answer failed", r7, r2, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0260, code lost:
        if (r10 != null) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        r10.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0266, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0267, code lost:
        anet.channel.util.ALog.e("awcn.DispatchCore", "http disconnect failed", null, r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0272, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0279, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x027a, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x027c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x027d, code lost:
        r1 = r0;
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x028d, code lost:
        r1 = r0.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        r5.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02a6, code lost:
        anet.channel.util.ALog.e("awcn.DispatchCore", "http disconnect failed", null, r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r10.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02bc, code lost:
        anet.channel.util.ALog.e("awcn.DispatchCore", "http disconnect failed", null, r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:104:0x0243 */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x027c A[ExcHandler: all (r0v8 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x028d A[Catch:{ all -> 0x02b2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02a1 A[SYNTHETIC, Splitter:B:128:0x02a1] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02b7 A[SYNTHETIC, Splitter:B:136:0x02b7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.String r18, java.util.Map r19, int r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "AMDC"
            r3.<init>(r4)
            java.util.concurrent.atomic.AtomicInteger r4 = f1373a
            int r4 = r4.incrementAndGet()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "awcn.DispatchCore"
            java.lang.String r5 = "send amdc request"
            r6 = 4
            java.lang.Object[] r7 = new java.lang.Object[r6]
            java.lang.String r8 = "url"
            r9 = 0
            r7[r9] = r8
            r8 = 1
            r7[r8] = r0
            java.lang.String r10 = "\nhost"
            r11 = 2
            r7[r11] = r10
            java.lang.String r10 = "domain"
            java.lang.Object r10 = r1.get(r10)
            java.lang.String r10 = r10.toString()
            r12 = 3
            r7[r12] = r10
            anet.channel.util.ALog.i(r4, r5, r3, r7)
            java.lang.String r4 = "Env"
            java.lang.Object r4 = r1.remove(r4)
            anet.channel.entity.ENV r4 = (anet.channel.entity.ENV) r4
            r5 = 0
            java.net.URL r7 = new java.net.URL     // Catch:{ Throwable -> 0x0280, all -> 0x027c }
            r7.<init>(r0)     // Catch:{ Throwable -> 0x0280, all -> 0x027c }
            java.net.URLConnection r10 = r7.openConnection()     // Catch:{ Throwable -> 0x0279, all -> 0x027c }
            java.net.HttpURLConnection r10 = (java.net.HttpURLConnection) r10     // Catch:{ Throwable -> 0x0279, all -> 0x027c }
            r13 = 20000(0x4e20, float:2.8026E-41)
            r10.setConnectTimeout(r13)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            r10.setReadTimeout(r13)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            java.lang.String r13 = "POST"
            r10.setRequestMethod(r13)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            r10.setDoOutput(r8)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            r10.setDoInput(r8)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            java.lang.String r13 = "Connection"
            java.lang.String r14 = "close"
            r10.addRequestProperty(r13, r14)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            java.lang.String r13 = "Accept-Encoding"
            java.lang.String r14 = "gzip"
            r10.addRequestProperty(r13, r14)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            r10.setInstanceFollowRedirects(r9)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            java.lang.String r13 = r7.getProtocol()     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            java.lang.String r14 = "https"
            boolean r13 = r13.equals(r14)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            if (r13 == 0) goto L_0x008e
            r13 = r10
            javax.net.ssl.HttpsURLConnection r13 = (javax.net.ssl.HttpsURLConnection) r13     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            javax.net.ssl.HostnameVerifier r14 = f1374b     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            r13.setHostnameVerifier(r14)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
        L_0x008e:
            java.io.OutputStream r13 = r10.getOutputStream()     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            java.lang.String r14 = "utf-8"
            java.lang.String r1 = anet.channel.strategy.utils.c.a(r1, r14)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            byte[] r1 = r1.getBytes()     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            r13.write(r1)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            int r13 = r10.getResponseCode()     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            boolean r14 = anet.channel.util.ALog.isPrintLog(r8)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            if (r14 == 0) goto L_0x00c8
            java.lang.String r14 = "awcn.DispatchCore"
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            java.lang.String r12 = "amdc response. code: "
            r15.<init>(r12)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            r15.append(r13)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            java.lang.String r12 = r15.toString()     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            java.lang.Object[] r15 = new java.lang.Object[r11]     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            java.lang.String r16 = "\nheaders"
            r15[r9] = r16     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            java.util.Map r16 = r10.getHeaderFields()     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            r15[r8] = r16     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            anet.channel.util.ALog.d(r14, r12, r3, r15)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
        L_0x00c8:
            r12 = 200(0xc8, float:2.8E-43)
            if (r13 == r12) goto L_0x00f1
            r0 = 302(0x12e, float:4.23E-43)
            if (r13 == r0) goto L_0x00d6
            r0 = 307(0x133, float:4.3E-43)
            if (r13 != r0) goto L_0x00d5
            goto L_0x00d6
        L_0x00d5:
            r11 = 1
        L_0x00d6:
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            java.lang.String r1 = "response code not 200"
            a((java.lang.String) r0, (java.lang.String) r1, (java.net.URL) r7, (int) r2, (int) r11)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            if (r10 == 0) goto L_0x00f0
            r10.disconnect()     // Catch:{ Exception -> 0x00e5 }
            goto L_0x00f0
        L_0x00e5:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = "awcn.DispatchCore"
            java.lang.String r2 = "http disconnect failed"
            java.lang.Object[] r3 = new java.lang.Object[r9]
            anet.channel.util.ALog.e(r0, r2, r5, r1, r3)
        L_0x00f0:
            return r11
        L_0x00f1:
            java.lang.String r12 = "x-am-code"
            java.lang.String r12 = r10.getHeaderField(r12)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            java.lang.String r13 = "1000"
            boolean r13 = r13.equals(r12)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            if (r13 != 0) goto L_0x0134
            java.lang.String r0 = "1007"
            boolean r0 = r0.equals(r12)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            if (r0 != 0) goto L_0x0111
            java.lang.String r0 = "1008"
            boolean r0 = r0.equals(r12)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            if (r0 == 0) goto L_0x0110
            goto L_0x0111
        L_0x0110:
            r11 = 1
        L_0x0111:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            java.lang.String r1 = "return code: "
            r0.<init>(r1)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            r0.append(r12)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            a((java.lang.String) r12, (java.lang.String) r0, (java.net.URL) r7, (int) r2, (int) r11)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            if (r10 == 0) goto L_0x0133
            r10.disconnect()     // Catch:{ Exception -> 0x0128 }
            goto L_0x0133
        L_0x0128:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = "awcn.DispatchCore"
            java.lang.String r2 = "http disconnect failed"
            java.lang.Object[] r3 = new java.lang.Object[r9]
            anet.channel.util.ALog.e(r0, r2, r5, r1, r3)
        L_0x0133:
            return r11
        L_0x0134:
            java.lang.String r13 = "x-am-sign"
            java.lang.String r13 = r10.getHeaderField(r13)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            boolean r14 = android.text.TextUtils.isEmpty(r13)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            if (r14 == 0) goto L_0x0159
            java.lang.String r0 = "-1001"
            java.lang.String r1 = "response sign is empty"
            a((java.lang.String) r0, (java.lang.String) r1, (java.net.URL) r7, (int) r2, (int) r8)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            if (r10 == 0) goto L_0x0158
            r10.disconnect()     // Catch:{ Exception -> 0x014d }
            goto L_0x0158
        L_0x014d:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = "awcn.DispatchCore"
            java.lang.String r2 = "http disconnect failed"
            java.lang.Object[] r3 = new java.lang.Object[r9]
            anet.channel.util.ALog.e(r0, r2, r5, r1, r3)
        L_0x0158:
            return r8
        L_0x0159:
            java.io.InputStream r14 = r10.getInputStream()     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            java.lang.String r15 = "gzip"
            java.lang.String r6 = r10.getContentEncoding()     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            boolean r6 = r15.equalsIgnoreCase(r6)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            java.lang.String r6 = a(r14, r6)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            boolean r14 = anet.channel.util.ALog.isPrintLog(r8)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            if (r14 == 0) goto L_0x0180
            java.lang.String r14 = "awcn.DispatchCore"
            java.lang.String r15 = "amdc response body"
            java.lang.Object[] r5 = new java.lang.Object[r11]     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            java.lang.String r16 = "\nbody"
            r5[r9] = r16     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            r5[r8] = r6     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            anet.channel.util.ALog.d(r14, r15, r3, r5)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
        L_0x0180:
            int r1 = r1.length     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            long r14 = (long) r1     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            int r1 = r10.getContentLength()     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            r17 = r12
            long r11 = (long) r1     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            a((java.lang.String) r0, (long) r14, (long) r11)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            if (r0 == 0) goto L_0x01ac
            java.lang.String r0 = "-1002"
            java.lang.String r1 = "read answer error"
            a((java.lang.String) r0, (java.lang.String) r1, (java.net.URL) r7, (int) r2, (int) r8)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            if (r10 == 0) goto L_0x01ab
            r10.disconnect()     // Catch:{ Exception -> 0x019f }
            goto L_0x01ab
        L_0x019f:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = "awcn.DispatchCore"
            java.lang.String r2 = "http disconnect failed"
            java.lang.Object[] r3 = new java.lang.Object[r9]
            r4 = 0
            anet.channel.util.ALog.e(r0, r2, r4, r1, r3)
        L_0x01ab:
            return r8
        L_0x01ac:
            anet.channel.strategy.dispatch.IAmdcSign r0 = anet.channel.strategy.dispatch.a.b()     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            if (r0 == 0) goto L_0x01b7
            java.lang.String r5 = r0.sign(r6)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            goto L_0x01b8
        L_0x01b7:
            r5 = 0
        L_0x01b8:
            boolean r0 = r5.equalsIgnoreCase(r13)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            if (r0 != 0) goto L_0x01f0
            java.lang.String r0 = "awcn.DispatchCore"
            java.lang.String r1 = "check ret sign failed"
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            java.lang.String r6 = "retSign"
            r4[r9] = r6     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            r4[r8] = r13     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            java.lang.String r6 = "checkSign"
            r11 = 2
            r4[r11] = r6     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            r6 = 3
            r4[r6] = r5     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            anet.channel.util.ALog.e(r0, r1, r3, r4)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            java.lang.String r0 = "-1003"
            java.lang.String r1 = "check sign failed"
            a((java.lang.String) r0, (java.lang.String) r1, (java.net.URL) r7, (int) r2, (int) r8)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            if (r10 == 0) goto L_0x01ef
            r10.disconnect()     // Catch:{ Exception -> 0x01e3 }
            goto L_0x01ef
        L_0x01e3:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = "awcn.DispatchCore"
            java.lang.String r2 = "http disconnect failed"
            java.lang.Object[] r3 = new java.lang.Object[r9]
            r4 = 0
            anet.channel.util.ALog.e(r0, r2, r4, r1, r3)
        L_0x01ef:
            return r8
        L_0x01f0:
            org.json.JSONTokener r0 = new org.json.JSONTokener     // Catch:{ JSONException -> 0x0243 }
            r0.<init>(r6)     // Catch:{ JSONException -> 0x0243 }
            java.lang.Object r0 = r0.nextValue()     // Catch:{ JSONException -> 0x0243 }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x0243 }
            anet.channel.entity.ENV r1 = anet.channel.GlobalAppRuntimeInfo.getEnv()     // Catch:{ JSONException -> 0x0243 }
            if (r1 == r4) goto L_0x021d
            java.lang.String r0 = "awcn.DispatchCore"
            java.lang.String r1 = "env change, do not notify result"
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ JSONException -> 0x0243 }
            anet.channel.util.ALog.w(r0, r1, r3, r4)     // Catch:{ JSONException -> 0x0243 }
            if (r10 == 0) goto L_0x021c
            r10.disconnect()     // Catch:{ Exception -> 0x0210 }
            goto L_0x021c
        L_0x0210:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = "awcn.DispatchCore"
            java.lang.String r2 = "http disconnect failed"
            java.lang.Object[] r3 = new java.lang.Object[r9]
            r4 = 0
            anet.channel.util.ALog.e(r0, r2, r4, r1, r3)
        L_0x021c:
            return r9
        L_0x021d:
            anet.channel.strategy.dispatch.HttpDispatcher r1 = anet.channel.strategy.dispatch.HttpDispatcher.getInstance()     // Catch:{ JSONException -> 0x0243 }
            anet.channel.strategy.dispatch.DispatchEvent r4 = new anet.channel.strategy.dispatch.DispatchEvent     // Catch:{ JSONException -> 0x0243 }
            r4.<init>(r8, r0)     // Catch:{ JSONException -> 0x0243 }
            r1.a(r4)     // Catch:{ JSONException -> 0x0243 }
            java.lang.String r0 = "request success"
            r1 = r17
            a((java.lang.String) r1, (java.lang.String) r0, (java.net.URL) r7, (int) r2, (int) r9)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            if (r10 == 0) goto L_0x0242
            r10.disconnect()     // Catch:{ Exception -> 0x0236 }
            goto L_0x0242
        L_0x0236:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = "awcn.DispatchCore"
            java.lang.String r2 = "http disconnect failed"
            java.lang.Object[] r3 = new java.lang.Object[r9]
            r4 = 0
            anet.channel.util.ALog.e(r0, r2, r4, r1, r3)
        L_0x0242:
            return r9
        L_0x0243:
            anet.channel.strategy.dispatch.HttpDispatcher r0 = anet.channel.strategy.dispatch.HttpDispatcher.getInstance()     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            anet.channel.strategy.dispatch.DispatchEvent r1 = new anet.channel.strategy.dispatch.DispatchEvent     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            r4 = 0
            r1.<init>(r9, r4)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            r0.a(r1)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            java.lang.String r0 = "awcn.DispatchCore"
            java.lang.String r1 = "resolve amdc anser failed"
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            anet.channel.util.ALog.e(r0, r1, r3, r4)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            java.lang.String r0 = "-1004"
            java.lang.String r1 = "resolve answer failed"
            a((java.lang.String) r0, (java.lang.String) r1, (java.net.URL) r7, (int) r2, (int) r8)     // Catch:{ Throwable -> 0x0276, all -> 0x0273 }
            if (r10 == 0) goto L_0x0272
            r10.disconnect()     // Catch:{ Exception -> 0x0266 }
            goto L_0x0272
        L_0x0266:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = "awcn.DispatchCore"
            java.lang.String r2 = "http disconnect failed"
            java.lang.Object[] r3 = new java.lang.Object[r9]
            r4 = 0
            anet.channel.util.ALog.e(r0, r2, r4, r1, r3)
        L_0x0272:
            return r8
        L_0x0273:
            r0 = move-exception
            r1 = r0
            goto L_0x02b5
        L_0x0276:
            r0 = move-exception
            r5 = r10
            goto L_0x0283
        L_0x0279:
            r0 = move-exception
            r5 = 0
            goto L_0x0283
        L_0x027c:
            r0 = move-exception
            r1 = r0
            r10 = 0
            goto L_0x02b5
        L_0x0280:
            r0 = move-exception
            r5 = 0
            r7 = 0
        L_0x0283:
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x02b2 }
            boolean r4 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x02b2 }
            if (r4 == 0) goto L_0x0291
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x02b2 }
        L_0x0291:
            java.lang.String r4 = "-1000"
            a((java.lang.String) r4, (java.lang.String) r1, (java.net.URL) r7, (int) r2, (int) r8)     // Catch:{ all -> 0x02b2 }
            java.lang.String r1 = "awcn.DispatchCore"
            java.lang.String r2 = "amdc request fail"
            java.lang.Object[] r4 = new java.lang.Object[r9]     // Catch:{ all -> 0x02b2 }
            anet.channel.util.ALog.e(r1, r2, r3, r0, r4)     // Catch:{ all -> 0x02b2 }
            if (r5 == 0) goto L_0x02b1
            r5.disconnect()     // Catch:{ Exception -> 0x02a5 }
            goto L_0x02b1
        L_0x02a5:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = "awcn.DispatchCore"
            java.lang.String r2 = "http disconnect failed"
            java.lang.Object[] r3 = new java.lang.Object[r9]
            r4 = 0
            anet.channel.util.ALog.e(r0, r2, r4, r1, r3)
        L_0x02b1:
            return r8
        L_0x02b2:
            r0 = move-exception
            r1 = r0
            r10 = r5
        L_0x02b5:
            if (r10 == 0) goto L_0x02c7
            r10.disconnect()     // Catch:{ Exception -> 0x02bb }
            goto L_0x02c7
        L_0x02bb:
            r0 = move-exception
            r2 = r0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r3 = "awcn.DispatchCore"
            java.lang.String r4 = "http disconnect failed"
            r5 = 0
            anet.channel.util.ALog.e(r3, r4, r5, r2, r0)
        L_0x02c7:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.strategy.dispatch.c.a(java.lang.String, java.util.Map, int):int");
    }

    private static String a(String str, String str2, int i, Map<String, String> map, int i2) {
        StringBuilder sb = new StringBuilder(64);
        if (i2 == 2 && "https".equalsIgnoreCase(str) && f1375c.nextBoolean()) {
            str = "http";
        }
        sb.append(str);
        sb.append("://");
        if (str2 != null) {
            if (anet.channel.util.c.a() && anet.channel.strategy.utils.c.a(str2)) {
                try {
                    str2 = anet.channel.util.c.a(str2);
                } catch (Exception unused) {
                }
            }
            if (anet.channel.strategy.utils.c.b(str2)) {
                sb.append('[');
                sb.append(str2);
                sb.append(']');
            } else {
                sb.append(str2);
            }
            if (i == 0) {
                if ("https".equalsIgnoreCase(str)) {
                    i = 443;
                } else {
                    i = 80;
                }
            }
            sb.append(":");
            sb.append(i);
        } else {
            sb.append(DispatchConstants.getAmdcServerDomain());
        }
        sb.append("/amdc/mobileDispatch");
        TreeMap treeMap = new TreeMap();
        treeMap.put("appkey", map.remove("appkey"));
        treeMap.put(NotifyType.VIBRATE, map.remove(NotifyType.VIBRATE));
        treeMap.put("deviceId", map.remove("deviceId"));
        treeMap.put("platform", map.remove("platform"));
        sb.append('?');
        sb.append(anet.channel.strategy.utils.c.a(treeMap, "utf-8"));
        return sb.toString();
    }

    static void a(String str, String str2, URL url, int i, int i2) {
        if ((i2 != 1 || i == 2) && GlobalAppRuntimeInfo.isTargetProcess()) {
            try {
                AmdcStatistic amdcStatistic = new AmdcStatistic();
                amdcStatistic.errorCode = str;
                amdcStatistic.errorMsg = str2;
                if (url != null) {
                    amdcStatistic.host = url.getHost();
                    amdcStatistic.url = url.toString();
                }
                amdcStatistic.retryTimes = i;
                AppMonitor.getInstance().commitStat(amdcStatistic);
            } catch (Exception unused) {
            }
        }
    }
}
