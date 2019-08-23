package com.unicom.xiaowo.login.b;

import android.content.Context;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.unicom.xiaowo.login.a.a;
import com.unicom.xiaowo.login.c.k;
import com.unicom.xiaowo.login.d.h;
import java.net.URLDecoder;
import org.json.JSONObject;

public final class b implements k {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ int f81418a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Context f81419b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ a f81420c;

    b(a aVar, int i, Context context) {
        this.f81420c = aVar;
        this.f81418a = i;
        this.f81419b = context;
    }

    public final void a(int i, String str) {
        d a2;
        if (i == 1) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("code");
                String optString2 = jSONObject.optString("msg");
                String optString3 = jSONObject.optString("data");
                if (PushConstants.PUSH_TYPE_NOTIFY.equals(optString)) {
                    String decode = URLDecoder.decode(a.b(optString3, h.f81462a), "UTF-8");
                    "data:".concat(String.valueOf(decode));
                    if (this.f81418a == 1) {
                        JSONObject jSONObject2 = new JSONObject(decode);
                        String optString4 = jSONObject2.optString("mobile");
                        this.f81420c.a(this.f81419b, jSONObject2.optString("accessCode"), optString4, this.f81418a);
                        return;
                    }
                    d.a().a("获取accessCode成功", decode);
                    return;
                }
                d.a().b(optString2, optString3);
            } catch (Exception unused) {
                a2 = d.a();
                str = "数据解析异常";
            }
        } else {
            if (TextUtils.isEmpty(str)) {
                a2 = d.a();
                str = "网络请求失败";
            } else {
                a2 = d.a();
            }
            a2.a(str);
        }
    }
}
