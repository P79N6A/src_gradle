package com.taobao.accs.ut.a;

import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public String f79043a;

    /* renamed from: b  reason: collision with root package name */
    public String f79044b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f79045c;

    /* renamed from: d  reason: collision with root package name */
    public String f79046d;

    /* renamed from: e  reason: collision with root package name */
    private final String f79047e = "BindApp";

    /* renamed from: f  reason: collision with root package name */
    private boolean f79048f;

    public void a() {
        b("BindApp");
    }

    public void a(String str) {
        this.f79046d = str;
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
        if (!this.f79048f) {
            this.f79048f = true;
            HashMap hashMap = new HashMap();
            try {
                str3 = this.f79043a;
                str2 = "221";
                try {
                    hashMap.put("device_id", this.f79043a);
                    hashMap.put("bind_date", this.f79044b);
                    if (this.f79045c) {
                        str4 = "y";
                    } else {
                        str4 = "n";
                    }
                    hashMap.put("ret", str4);
                    hashMap.put("fail_reasons", this.f79046d);
                    hashMap.put("push_token", "");
                    UTMini.getInstance().commitEvent(66001, str, (Object) str3, (Object) null, (Object) str2, (Map<String, String>) hashMap);
                } catch (Throwable th) {
                    th = th;
                    ALog.d("BindAppStatistic", UTMini.getCommitInfo(66001, str3, (String) null, str2, (Map<String, String>) hashMap) + " " + th.toString(), new Object[0]);
                }
            } catch (Throwable th2) {
                th = th2;
                str3 = null;
                str2 = null;
                ALog.d("BindAppStatistic", UTMini.getCommitInfo(66001, str3, (String) null, str2, (Map<String, String>) hashMap) + " " + th.toString(), new Object[0]);
            }
        }
    }
}
