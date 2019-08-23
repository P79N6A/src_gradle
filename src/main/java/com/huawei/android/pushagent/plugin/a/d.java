package com.huawei.android.pushagent.plugin.a;

import com.huawei.android.pushagent.utils.a.b;
import com.huawei.android.pushagent.utils.a.e;
import org.json.JSONObject;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private int f25130a = -1;

    /* renamed from: b  reason: collision with root package name */
    private String f25131b;

    public int a() {
        return this.f25130a;
    }

    public void a(String str) {
        JSONObject a2 = b.a(str);
        if (a2 == null) {
            e.a("PushLogSC2815", "enter ReportRsp.loadFromString, json is null");
            return;
        }
        this.f25130a = a2.optInt("resultcode", -1);
        this.f25131b = a2.optString("info");
    }

    public String b() {
        return this.f25131b;
    }

    public String toString() {
        return "resultCode:" + this.f25130a + ";errorInfo:" + this.f25131b;
    }
}
