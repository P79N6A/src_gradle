package com.taobao.accs.ut.a;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;
import java.util.Map;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public int f79055a;

    /* renamed from: b  reason: collision with root package name */
    public int f79056b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f79057c;

    /* renamed from: d  reason: collision with root package name */
    public int f79058d;

    /* renamed from: e  reason: collision with root package name */
    public int f79059e;

    /* renamed from: f  reason: collision with root package name */
    public String f79060f;
    public String g;
    public long h;
    public boolean i;
    public boolean j;
    private long k;

    public void a() {
        String str;
        String str2;
        String str3;
        long currentTimeMillis = System.currentTimeMillis();
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.d("MonitorStatistic", "commitUT interval:" + (currentTimeMillis - this.k) + " interval1:" + (currentTimeMillis - this.h), new Object[0]);
        }
        if (currentTimeMillis - this.k > 1200000 && currentTimeMillis - this.h > 60000) {
            HashMap hashMap = new HashMap();
            try {
                str3 = String.valueOf(this.f79058d);
                try {
                    str2 = String.valueOf(this.f79059e);
                    str = "221";
                } catch (Throwable th) {
                    th = th;
                    str2 = null;
                    str = str2;
                    ALog.d("MonitorStatistic", UTMini.getCommitInfo(66001, str3, str2, str, (Map<String, String>) hashMap) + " " + th.toString(), new Object[0]);
                }
            } catch (Throwable th2) {
                th = th2;
                str3 = null;
                str2 = null;
                str = str2;
                ALog.d("MonitorStatistic", UTMini.getCommitInfo(66001, str3, str2, str, (Map<String, String>) hashMap) + " " + th.toString(), new Object[0]);
            }
            try {
                hashMap.put("connStatus", String.valueOf(this.f79055a));
                hashMap.put("connType", String.valueOf(this.f79056b));
                hashMap.put("tcpConnected", String.valueOf(this.f79057c));
                hashMap.put("proxy", String.valueOf(this.f79060f));
                hashMap.put("startServiceTime", String.valueOf(this.h));
                hashMap.put("commitTime", String.valueOf(currentTimeMillis));
                hashMap.put("networkAvailable", String.valueOf(this.i));
                hashMap.put("threadIsalive", String.valueOf(this.j));
                hashMap.put(PushConstants.WEB_URL, this.g);
                if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.d("MonitorStatistic", UTMini.getCommitInfo(66001, str3, str2, str, (Map<String, String>) hashMap), new Object[0]);
                }
                UTMini.getInstance().commitEvent(66001, "MONITOR", (Object) str3, (Object) str2, (Object) str, (Map<String, String>) hashMap);
                this.k = currentTimeMillis;
            } catch (Throwable th3) {
                th = th3;
                ALog.d("MonitorStatistic", UTMini.getCommitInfo(66001, str3, str2, str, (Map<String, String>) hashMap) + " " + th.toString(), new Object[0]);
            }
        }
    }
}
