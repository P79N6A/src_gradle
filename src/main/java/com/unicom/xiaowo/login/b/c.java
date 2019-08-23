package com.unicom.xiaowo.login.b;

import android.content.Context;
import android.text.TextUtils;
import com.unicom.xiaowo.login.c.k;
import org.json.JSONObject;

public final class c implements k {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ int f81421a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ String f81422b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Context f81423c;

    c(int i, String str, Context context) {
        this.f81421a = i;
        this.f81422b = str;
        this.f81423c = context;
    }

    public final void a(int i, String str) {
        d a2;
        String str2;
        if (i == 1) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (TextUtils.isEmpty(jSONObject.optString("access_token"))) {
                    d.a().a(str);
                } else if (this.f81421a == 1) {
                    jSONObject.put("mobile", this.f81422b);
                    d.a().a("登录成功", jSONObject.toString());
                } else {
                    d.a().a("获取token成功", jSONObject.toString());
                }
            } catch (Exception unused) {
                a2 = d.a();
                str2 = "数据解析异常";
            }
        } else {
            a2 = d.a();
            str2 = "网络请求失败";
            a2.a(str2);
        }
    }
}
