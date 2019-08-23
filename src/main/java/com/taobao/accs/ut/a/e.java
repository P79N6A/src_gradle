package com.taobao.accs.ut.a;

import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;
import java.util.Map;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public String f79067a;

    /* renamed from: b  reason: collision with root package name */
    public String f79068b;

    /* renamed from: c  reason: collision with root package name */
    public String f79069c;

    /* renamed from: d  reason: collision with root package name */
    public String f79070d;

    /* renamed from: e  reason: collision with root package name */
    public String f79071e;

    /* renamed from: f  reason: collision with root package name */
    public String f79072f;
    private final String g = "sendAck";
    private boolean h;

    public void a() {
        String str;
        String str2;
        if (!this.h) {
            this.h = true;
            HashMap hashMap = new HashMap();
            try {
                str2 = this.f79067a;
                str = "221";
                try {
                    hashMap.put("device_id", this.f79067a);
                    hashMap.put("session_id", this.f79068b);
                    hashMap.put("data_id", this.f79069c);
                    hashMap.put("ack_date", this.f79070d);
                    hashMap.put("service_id", this.f79071e);
                    hashMap.put("fail_reasons", this.f79072f);
                    UTMini.getInstance().commitEvent(66001, "sendAck", (Object) str2, (Object) null, (Object) str, (Map<String, String>) hashMap);
                } catch (Throwable th) {
                    th = th;
                    ALog.d("accs.SendAckStatistic", UTMini.getCommitInfo(66001, str2, (String) null, str, (Map<String, String>) hashMap) + " " + th.toString(), new Object[0]);
                }
            } catch (Throwable th2) {
                th = th2;
                str2 = null;
                str = null;
                ALog.d("accs.SendAckStatistic", UTMini.getCommitInfo(66001, str2, (String) null, str, (Map<String, String>) hashMap) + " " + th.toString(), new Object[0]);
            }
        }
    }
}
