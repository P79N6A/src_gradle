package com.huawei.android.pushagent.plugin.b;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.android.pushagent.utils.a.e;
import org.json.JSONArray;

public class b extends a {

    /* renamed from: b  reason: collision with root package name */
    private String f25142b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f25143c = "";

    public b() {
    }

    public b(String str, String str2, String str3) {
        this.f25142b = str;
        this.f25141a = str2;
        this.f25143c = str3;
    }

    public int a() {
        return com.huawei.android.pushagent.plugin.a.b.TAG.a();
    }

    public String a(Context context) {
        if (TextUtils.isEmpty(this.f25142b)) {
            e.b("PushLogSC2815", "tag is null");
            return null;
        }
        JSONArray b2 = com.huawei.android.pushagent.utils.a.b.b(this.f25142b);
        if (b2 == null) {
            return null;
        }
        return b2.toString();
    }

    public String b() {
        return this.f25143c;
    }

    public int d() {
        return a();
    }
}
