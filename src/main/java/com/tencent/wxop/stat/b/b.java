package com.tencent.wxop.stat.b;

import android.content.Context;
import com.google.a.a.a.a.a.a;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.tencent.wxop.stat.g;
import com.tencent.wxop.stat.h;
import java.util.Map;
import java.util.Properties;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends e {

    /* renamed from: a  reason: collision with root package name */
    public c f79863a = new c();

    /* renamed from: b  reason: collision with root package name */
    public long f79864b = -1;

    public b(Context context, int i, String str, h hVar) {
        super(context, i, hVar);
        this.f79863a.f79865a = str;
    }

    public final a a() {
        return a.CUSTOM;
    }

    public final boolean a(JSONObject jSONObject) {
        Object obj;
        String str;
        jSONObject.put(NotificationStyle.EXPANDABLE_IMAGE_URL, this.f79863a.f79865a);
        if (this.f79864b > 0) {
            jSONObject.put("du", this.f79864b);
        }
        if (this.f79863a.f79866b == null) {
            if (this.f79863a.f79865a != null) {
                Properties properties = g.f79892a.get(this.f79863a.f79865a);
                if (properties != null && properties.size() > 0) {
                    if (this.f79863a.f79867c == null || this.f79863a.f79867c.length() == 0) {
                        this.f79863a.f79867c = new JSONObject(properties);
                    } else {
                        for (Map.Entry entry : properties.entrySet()) {
                            try {
                                this.f79863a.f79867c.put(entry.getKey().toString(), entry.getValue());
                            } catch (JSONException e2) {
                                a.b(e2);
                            }
                        }
                    }
                }
            }
            str = "kv";
            obj = this.f79863a.f79867c;
        } else {
            str = "ar";
            obj = this.f79863a.f79866b;
        }
        jSONObject.put(str, obj);
        return true;
    }
}
