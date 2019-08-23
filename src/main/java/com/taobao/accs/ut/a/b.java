package com.taobao.accs.ut.a;

import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;
import java.util.Map;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public String f79049a;

    /* renamed from: b  reason: collision with root package name */
    public String f79050b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f79051c;

    /* renamed from: d  reason: collision with root package name */
    public String f79052d;

    /* renamed from: e  reason: collision with root package name */
    public String f79053e;

    /* renamed from: f  reason: collision with root package name */
    private final String f79054f = "BindUser";
    private boolean g;

    public void a() {
        b("BindUser");
    }

    public void a(String str) {
        this.f79052d = str;
    }

    public void a(int i) {
        if (i == 200) {
            return;
        }
        if (i != 300) {
            switch (i) {
                case -4:
                    a("msg too large");
                    return;
                case -3:
                    a("service not available");
                    return;
                case -2:
                    a("param error");
                    return;
                case -1:
                    a("network fail");
                    return;
                default:
                    a(String.valueOf(i));
                    return;
            }
        } else {
            a("app not bind");
        }
    }

    private void b(String str) {
        String str2;
        String str3;
        String str4;
        if (!this.g) {
            this.g = true;
            HashMap hashMap = new HashMap();
            try {
                str3 = this.f79049a;
                str2 = "221";
                try {
                    hashMap.put("device_id", this.f79049a);
                    hashMap.put("bind_date", this.f79050b);
                    if (this.f79051c) {
                        str4 = "y";
                    } else {
                        str4 = "n";
                    }
                    hashMap.put("ret", str4);
                    hashMap.put("fail_reasons", this.f79052d);
                    hashMap.put("user_id", this.f79053e);
                    if (ALog.isPrintLog(ALog.Level.D)) {
                        ALog.d("accs.BindUserStatistic", UTMini.getCommitInfo(66001, str3, (String) null, str2, (Map<String, String>) hashMap), new Object[0]);
                    }
                    UTMini.getInstance().commitEvent(66001, str, (Object) str3, (Object) null, (Object) str2, (Map<String, String>) hashMap);
                } catch (Throwable th) {
                    th = th;
                    ALog.d("accs.BindUserStatistic", UTMini.getCommitInfo(66001, str3, (String) null, str2, (Map<String, String>) hashMap) + " " + th.toString(), new Object[0]);
                }
            } catch (Throwable th2) {
                th = th2;
                str3 = null;
                str2 = null;
                ALog.d("accs.BindUserStatistic", UTMini.getCommitInfo(66001, str3, (String) null, str2, (Map<String, String>) hashMap) + " " + th.toString(), new Object[0]);
            }
        }
    }
}
