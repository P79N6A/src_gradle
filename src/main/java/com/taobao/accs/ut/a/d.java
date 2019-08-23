package com.taobao.accs.ut.a;

import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UTMini;
import java.util.HashMap;
import java.util.Map;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public String f79061a;

    /* renamed from: b  reason: collision with root package name */
    public String f79062b;

    /* renamed from: c  reason: collision with root package name */
    public String f79063c;

    /* renamed from: d  reason: collision with root package name */
    public String f79064d;

    /* renamed from: e  reason: collision with root package name */
    public String f79065e;

    /* renamed from: f  reason: collision with root package name */
    public String f79066f;
    public String g;
    public boolean h;
    public String i;
    private final String j = "receiveMessage";
    private boolean k;

    public void a() {
        String str;
        String str2;
        String str3;
        if (!this.k) {
            this.k = true;
            HashMap hashMap = new HashMap();
            try {
                str2 = this.f79061a;
                str = "221";
                try {
                    hashMap.put("device_id", this.f79061a);
                    hashMap.put("data_id", this.f79062b);
                    hashMap.put("receive_date", this.f79063c);
                    hashMap.put("to_bz_date", this.f79064d);
                    hashMap.put("service_id", this.f79065e);
                    hashMap.put("data_length", this.f79066f);
                    hashMap.put("msg_type", this.g);
                    if (this.h) {
                        str3 = "y";
                    } else {
                        str3 = "n";
                    }
                    hashMap.put("repeat", str3);
                    hashMap.put("user_id", this.i);
                    UTMini.getInstance().commitEvent(66001, "receiveMessage", (Object) str2, (Object) null, (Object) str, (Map<String, String>) hashMap);
                } catch (Throwable th) {
                    th = th;
                    ALog.d("ReceiveMessage", UTMini.getCommitInfo(66001, str2, (String) null, str, (Map<String, String>) hashMap) + " " + th.toString(), new Object[0]);
                }
            } catch (Throwable th2) {
                th = th2;
                str2 = null;
                str = null;
                ALog.d("ReceiveMessage", UTMini.getCommitInfo(66001, str2, (String) null, str, (Map<String, String>) hashMap) + " " + th.toString(), new Object[0]);
            }
        }
    }
}
