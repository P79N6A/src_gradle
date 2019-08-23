package com.huawei.android.pushagent.a;

import android.content.Context;
import com.huawei.android.pushagent.utils.a.c;
import java.util.HashMap;

public class e extends c {
    public e(Context context) {
        super(context, "PushRouteInfo");
    }

    public e(Context context, String str) {
        this(context);
        this.f25165c = c(str);
    }

    private HashMap b(String str, String str2) {
        HashMap hashMap = new HashMap();
        for (String str3 : this.f25165c.keySet()) {
            if (str3.matches(str + "\\d{1,3}")) {
                hashMap.put(Long.valueOf(a(str3, 1)), Long.valueOf(a(str3.replace(str, str2), 2147483647L)));
            }
        }
        return hashMap;
    }

    public long A() {
        return a("push4StartInt", 1800);
    }

    public long B() {
        return a("pollingInterval", 1800);
    }

    public String C() {
        return a("pollingIp", "");
    }

    public int D() {
        return a("pollingPort", -1);
    }

    public int E() {
        return a("pollingId", -1);
    }

    public long F() {
        return a("tokenRegTimeOut", 30);
    }

    public long G() {
        return a("firstQueryTRSDayTimes", 6);
    }

    public long H() {
        return a("firstQueryTRSHourTimes", 2);
    }

    public long I() {
        return a("maxQueryTRSDayTimes", 1);
    }

    public HashMap J() {
        return b("flowcInterval", "flowcVlomes");
    }

    public long K() {
        return a("wifiFirstQueryTRSDayTimes", 18);
    }

    public long L() {
        return a("wifiFirstQueryTRSHourTimes", 6);
    }

    public long M() {
        return a("wifiMaxQueryTRSDayTimes", 3);
    }

    public long N() {
        return a("cloneCheckItval", 600);
    }

    public long O() {
        return a("updateFilesItval", 300);
    }

    public long P() {
        return a("stopServiceItval", 5);
    }

    public long Q() {
        return a("heartBeatRspTimeOut", 10) * 1000;
    }

    public HashMap R() {
        return b("wifiFlowcInterval", "wifiFlowcVlomes");
    }

    public HashMap S() {
        HashMap hashMap = new HashMap();
        for (String str : this.f25165c.keySet()) {
            if (str.startsWith("apn_")) {
                hashMap.put(str, (String) this.f25165c.get(str));
            }
        }
        return hashMap;
    }

    public int T() {
        return a("grpNum", 0);
    }

    public String U() {
        return a("publicKey", "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDiCa5gkvCb+/dHAcgN1WMm0ItA\rY1njDoy6bPCE+oHZI439lmjP14PH7n2xtKsuybPbzPAGwuXq4doRz+wB8JiOUjNQ\rVI88zNzDDhdV3pxQlFgk61VojWtVBH2H45qMPMbMs4HdVs0Qcida2IhXOi6eAyRK\rp3PApI7e/ta1FHYKiwIDAQAB");
    }

    public boolean V() {
        return W();
    }

    public boolean W() {
        return !"".equals(c()) && -1 != d() && a() == 0;
    }

    public boolean X() {
        return !"".equals(C()) && -1 != D() && a() == 0;
    }

    public long Y() {
        return a("ConnRange", 600) * 1000;
    }

    public int Z() {
        return a("MaxConnTimes", 3);
    }

    public int a() {
        return a("result", -1);
    }

    public void a(long j) {
        a("wifiMinHeartbeat", (Object) Long.valueOf(j));
    }

    public boolean a(e eVar) {
        com.huawei.android.pushagent.utils.a.e.a("PushLogSC2815", "wifiMinHeartbeat=" + g() + ",wifiMaxHeartbeat=" + h() + ",3gMinHeartbeat=" + i() + ",3gMaxHeartbeat=" + j());
        return g() == eVar.g() && h() == eVar.h() && i() == eVar.i() && j() == eVar.j();
    }

    /* access modifiers changed from: protected */
    public boolean a(String str) {
        String b2 = b();
        com.huawei.android.pushagent.utils.a.e.a("PushLogSC2815", "old belongId = " + b2 + ", current belongId = " + str);
        return b2.equals(str);
    }

    public long aa() {
        return a("ReConnInterval", 300) * 1000;
    }

    public long ab() {
        return a("KeepConnTime", 300) * 1000;
    }

    public boolean ac() {
        return a("allowPry", 0) == 1;
    }

    public long ad() {
        return a("hbvalid", 1296000) * 1000;
    }

    public boolean ae() {
        return a("isMultiSimEnabled", 0) != 0;
    }

    public String b() {
        return a("belongId", "-1");
    }

    public void b(long j) {
        a("wifiMaxHeartbeat", (Object) Long.valueOf(j));
    }

    public String c() {
        return a("serverIp", "");
    }

    public void c(long j) {
        a("g3MinHeartbeat", (Object) Long.valueOf(j));
    }

    public int d() {
        return a("serverPort", -1);
    }

    public void d(long j) {
        a("g3MaxHeartbeat", (Object) Long.valueOf(j));
    }

    public long e() {
        return a("trsValid_min", 7200);
    }

    public long f() {
        return a("trsValid_max", 2592000);
    }

    public long g() {
        return a("wifiMinHeartbeat", 1800);
    }

    public long h() {
        return a("wifiMaxHeartbeat", 1800);
    }

    public long i() {
        return a("g3MinHeartbeat", 900);
    }

    public long j() {
        return a("g3MaxHeartbeat", 1800);
    }

    public long k() {
        return a("serverRec1_min", 1);
    }

    public long l() {
        return a("serverRec2_min", 30);
    }

    public long m() {
        return a("serverRec3_min", 300);
    }

    public long n() {
        return a("serverRec4_min", 1800);
    }

    public long o() {
        return a("serverRec5_min", 1800);
    }

    public long p() {
        return a("noNetHeartbeat", 7200);
    }

    public long q() {
        return a("connTrsItval", 300);
    }

    public long r() {
        return a("connTrsErrItval", 1800);
    }

    public long s() {
        return a("SrvMaxFail_times", 6);
    }

    public long t() {
        return a("maxQTRS_times", 6);
    }

    public long u() {
        return a("socketConnTimeOut", 30);
    }

    public long v() {
        return a("socketConnectReadOut", 20);
    }

    public long w() {
        return a("pushLeastRun_time", 30);
    }

    public long x() {
        return a("push1StartInt", 3);
    }

    public long y() {
        return a("push2StartInt", 30);
    }

    public long z() {
        return a("push3StartInt", 600);
    }
}
