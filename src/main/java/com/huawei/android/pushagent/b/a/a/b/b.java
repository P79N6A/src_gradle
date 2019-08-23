package com.huawei.android.pushagent.b.a.a.b;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.android.pushagent.PushService;
import com.huawei.android.pushagent.a.b.j;
import com.huawei.android.pushagent.a.e;
import com.huawei.android.pushagent.b.a.a;
import com.huawei.android.pushagent.b.b.c;
import com.huawei.android.pushagent.utils.a.h;
import java.net.Socket;
import java.util.Iterator;
import java.util.Set;

public class b extends com.huawei.android.pushagent.b.a.a.b {

    /* renamed from: e  reason: collision with root package name */
    public long f25030e = 7200000;

    /* renamed from: f  reason: collision with root package name */
    private boolean f25031f;
    private long g = this.f25030e;
    private long h = this.f25030e;
    private int i;
    private String j = "";
    private String k = "";
    private String l;

    public b(Context context) {
        super(context);
    }

    private void a(e eVar, String str) {
        boolean z = false;
        if (!TextUtils.isEmpty(str)) {
            try {
                Set keySet = eVar.S().keySet();
                if (keySet.size() > 0) {
                    Iterator it2 = keySet.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String str2 = (String) it2.next();
                        if (str2.contains(str)) {
                            String str3 = (String) eVar.S().get(str2);
                            com.huawei.android.pushagent.utils.a.e.a("PushLogAC2815", "apnName is:" + str2 + ",apnHeartBeat is:" + str3);
                            String[] split = str3.split("_");
                            this.g = Long.parseLong(split[0]) * 1000;
                            this.h = Long.parseLong(split[1]) * 1000;
                            z = true;
                            break;
                        }
                    }
                }
            } catch (Exception e2) {
                com.huawei.android.pushagent.utils.a.e.c("PushLogAC2815", e2.toString(), e2);
            }
        }
        if (!z) {
            this.g = eVar.i() * 1000;
            this.h = eVar.j() * 1000;
        }
        com.huawei.android.pushagent.utils.a.e.a("PushLogAC2815", "after all, minHeartBeat is :" + this.g + ",maxHeartBeat is:" + this.h);
    }

    private String j() {
        String str = "";
        try {
            if (a.e() != null) {
                Socket c2 = a.e().c();
                if (c2 != null) {
                    str = c2.getLocalAddress().getHostAddress();
                }
            }
        } catch (Exception e2) {
            com.huawei.android.pushagent.utils.a.e.a("PushLogAC2815", e2.toString());
        }
        return str == null ? "" : str;
    }

    private Long k() {
        String a2 = c.a(this.f25027c, "cloudpush_fixHeatBeat", "");
        try {
            long parseLong = Long.parseLong(a2.trim()) * 1000;
            com.huawei.android.pushagent.utils.a.e.a("PushLogAC2815", "get heart beat from config, value:" + parseLong + " so neednot ajust");
            return Long.valueOf(parseLong);
        } catch (NumberFormatException unused) {
            if ((2 == this.f25028d && 5 != this.f25028d) || 1 != com.huawei.android.pushagent.utils.a.b.a(this.f25027c)) {
                return null;
            }
            com.huawei.android.pushagent.utils.a.e.a("PushLogAC2815", "in wifi and in charging, cannot ajust heartBeat");
            return 60000L;
        } catch (Exception e2) {
            com.huawei.android.pushagent.utils.a.e.c("PushLogAC2815", "get cloudpush_fixHeatBeat:" + a2 + " cause:" + e2.toString(), e2);
            if (2 == this.f25028d) {
            }
            com.huawei.android.pushagent.utils.a.e.a("PushLogAC2815", "in wifi and in charging, cannot ajust heartBeat");
            return 60000L;
        }
    }

    private boolean l() {
        int a2 = com.huawei.android.pushagent.utils.a.b.a(this.f25027c);
        String h2 = com.huawei.android.pushagent.utils.a.h(this.f25027c);
        String j2 = com.huawei.android.pushagent.utils.a.j(this.f25027c);
        if (1 == a2) {
            j2 = "wifi";
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("HasFindHeartBeat_" + h2 + "_" + a2 + "_" + j2, Boolean.valueOf(this.f25031f));
        contentValues.put("HearBeatInterval_" + h2 + "_" + a2 + "_" + j2, Long.valueOf(this.f25030e));
        StringBuilder sb = new StringBuilder("ClientIP_");
        sb.append(h2);
        sb.append("_");
        sb.append(a2);
        contentValues.put(sb.toString(), this.l);
        if (this.f25031f) {
            String a3 = com.huawei.android.pushagent.utils.a.a(System.currentTimeMillis() + com.huawei.android.pushagent.b.b.a.a(this.f25027c).ad(), "yyyy-MM-dd HH:mm:ss SSS");
            com.huawei.android.pushagent.utils.a.e.a("PushLogAC2815", "when find best heart beat,save the valid end time " + a3 + " to xml.");
            contentValues.put("HeartBeatValid", a3);
        }
        return new h(this.f25027c, c()).a(contentValues);
    }

    public long b(boolean z) {
        if (-1 == com.huawei.android.pushagent.utils.a.b.a(this.f25027c)) {
            com.huawei.android.pushagent.utils.a.e.b("PushLogAC2815", "no network, use no network heartbeat");
            return com.huawei.android.pushagent.b.b.a.a(this.f25027c).p() * 1000;
        }
        Long k2 = k();
        if (k2 != null) {
            return k2.longValue();
        }
        if (h()) {
            f();
        }
        long j2 = this.f25030e;
        if (!this.f25031f) {
            j2 = z ? this.f25030e : this.f25030e + 30000;
            if (j2 <= this.g) {
                j2 = this.g;
            } else if (j2 >= this.h) {
                j2 = this.h;
            }
        }
        return j2;
    }

    public boolean b(long j2) {
        return true;
    }

    public String c() {
        return "PushHearBeat";
    }

    public void c(boolean z) {
        com.huawei.android.pushagent.utils.a.e.a("PushLogAC2815", "enter adjustHeartBeat:(findHeartBeat:" + this.f25031f + " RspTimeOut:" + z + " beatInterval:" + this.f25030e + " range:[" + this.g + "," + this.h + "],isHearBeatTimeReq:" + this.f25026b + " batteryStatus:" + this.f25028d + ")");
        if (k() == null && !this.f25031f) {
            if (!this.f25026b) {
                com.huawei.android.pushagent.utils.a.e.a("PushLogAC2815", "It is not hearBeatTimeReq");
                return;
            }
            a(false);
            this.f25030e = b(z);
            if (z || this.f25030e <= this.g || this.f25030e >= this.h) {
                this.f25031f = true;
                com.huawei.android.pushagent.utils.a.e.b("PushLogAC2815", "after all the best heartBeat Interval:" + this.f25030e + "ms");
            } else {
                com.huawei.android.pushagent.utils.a.e.a("PushLogAC2815", "set current heartBeatInterval " + this.f25030e + "ms");
            }
            l();
        }
    }

    public void g() {
        try {
            com.huawei.android.pushagent.utils.a.a.b(PushService.a().getContext(), new Intent("com.huawei.android.push.intent.HEARTBEAT_RSP_TIMEOUT").putExtra("timer_reason", "timeOutWaitPushSrvRsp").putExtra("connect_mode", a.C0287a.ConnectEntity_Push.ordinal()).setPackage(this.f25027c.getPackageName()), com.huawei.android.pushagent.b.b.a.a(this.f25027c).Q());
            a(System.currentTimeMillis());
            j jVar = new j();
            double b2 = (double) b(false);
            Double.isNaN(b2);
            jVar.a((byte) ((int) Math.ceil((b2 * 1.0d) / 60000.0d)));
            a.e().a((com.huawei.android.pushagent.a.b) jVar);
        } catch (Exception e2) {
            com.huawei.android.pushagent.utils.a.e.c("PushLogAC2815", "call pushChannel.send cause Exception:" + e2.toString(), e2);
        }
    }

    /* access modifiers changed from: protected */
    public boolean h() {
        int a2 = com.huawei.android.pushagent.utils.a.b.a(this.f25027c);
        String h2 = com.huawei.android.pushagent.utils.a.h(this.f25027c);
        switch (a2) {
            case 0:
                return a2 != this.i || !h2.equals(this.j) || !com.huawei.android.pushagent.utils.a.j(this.f25027c).equals(this.k);
            case 1:
                return a2 != this.i || !h2.equals(this.j) || !j().equals(this.l);
            default:
                com.huawei.android.pushagent.utils.a.e.a("PushLogAC2815", "isEnvChange:netType:" + a2 + false);
                return false;
        }
    }

    /* renamed from: i */
    public b f() {
        try {
            if (a.e() == null) {
                com.huawei.android.pushagent.utils.a.e.a("PushLogAC2815", "system is in start, wait net for heartBeat");
                return null;
            }
            this.l = j();
            ContentValues a2 = new h(this.f25027c, c()).a();
            if (a2 != null) {
                String asString = a2.getAsString("HeartBeatValid");
                com.huawei.android.pushagent.utils.a.e.a("PushLogAC2815", "hear beat valid from xml is " + asString);
                if (!TextUtils.isEmpty(asString) && (System.currentTimeMillis() >= com.huawei.android.pushagent.utils.a.a(asString) || System.currentTimeMillis() + com.huawei.android.pushagent.b.b.a.a(this.f25027c).ad() < com.huawei.android.pushagent.utils.a.a(asString))) {
                    PushService.a(new Intent("com.huawei.android.push.intent.HEARTBEAT_VALID_ARRIVED"));
                }
            } else {
                com.huawei.android.pushagent.utils.a.e.a("PushLogAC2815", "PushHearBeat preferences is null");
            }
            this.i = com.huawei.android.pushagent.utils.a.b.a(this.f25027c);
            this.j = com.huawei.android.pushagent.utils.a.h(this.f25027c);
            com.huawei.android.pushagent.b.b.a a3 = com.huawei.android.pushagent.b.b.a.a(this.f25027c);
            this.g = a3.i() * 1000;
            this.h = a3.j() * 1000;
            int i2 = 0;
            this.f25031f = false;
            com.huawei.android.pushagent.utils.a.e.a("PushLogAC2815", "in loadHeartBeat netType:" + this.i + " mccMnc:" + this.j);
            ContentValues a4 = new h(this.f25027c, c()).a();
            switch (this.i) {
                case -1:
                    this.f25030e = a3.p() * 1000;
                    return this;
                case 0:
                    this.k = com.huawei.android.pushagent.utils.a.j(this.f25027c);
                    com.huawei.android.pushagent.utils.a.e.a("PushLogAC2815", "in loadHeartBeat apnName:" + this.k);
                    a(a3, this.k);
                    break;
                case 1:
                    this.g = a3.g() * 1000;
                    this.h = a3.h() * 1000;
                    this.k = "wifi";
                    this.f25030e = this.g;
                    if (a4 != null) {
                        String asString2 = a4.getAsString("ClientIP_" + this.j + "_" + this.i);
                        if (this.l == null || !this.l.equals(asString2)) {
                            com.huawei.android.pushagent.utils.a.e.a("PushLogAC2815", "curIP:" + this.l + " oldIP:" + asString2 + ", there are diff, so need find heartBeat again");
                            return this;
                        }
                    }
                    break;
                default:
                    com.huawei.android.pushagent.utils.a.e.d("PushLogAC2815", "unKnow net type");
                    return this;
            }
            this.f25030e = this.g;
            if (a4 != null) {
                if (a4.containsKey("HasFindHeartBeat_" + this.j + "_" + this.i + "_" + this.k)) {
                    if (a4.containsKey("HearBeatInterval_" + this.j + "_" + this.i + "_" + this.k)) {
                        this.f25031f = a4.getAsBoolean("HasFindHeartBeat_" + this.j + "_" + this.i + "_" + this.k).booleanValue();
                        Integer asInteger = a4.getAsInteger("HearBeatInterval_" + this.j + "_" + this.i + "_" + this.k);
                        if (asInteger != null) {
                            i2 = asInteger.intValue();
                        }
                        long j2 = (long) i2;
                        if (j2 >= 180000) {
                            this.f25030e = j2;
                        }
                    }
                }
                com.huawei.android.pushagent.utils.a.e.a("PushLogAC2815", "have no this heartbeat config, use default");
            }
            return this;
        } catch (Exception e2) {
            com.huawei.android.pushagent.utils.a.e.c("PushLogAC2815", "call loadHeartBeat cause:" + e2.toString(), e2);
            return this;
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("HasFindHeartBeat");
        stringBuffer.append("=");
        stringBuffer.append(this.f25031f);
        stringBuffer.append(" ");
        stringBuffer.append("HearBeatInterval");
        stringBuffer.append("=");
        stringBuffer.append(this.f25030e);
        stringBuffer.append(" ");
        stringBuffer.append("minHeartBeat");
        stringBuffer.append("=");
        stringBuffer.append(this.g);
        stringBuffer.append(" ");
        stringBuffer.append("maxHeartBeat");
        stringBuffer.append("=");
        stringBuffer.append(this.h);
        return stringBuffer.toString();
    }
}
