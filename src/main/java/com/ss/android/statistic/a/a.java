package com.ss.android.statistic.a;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.statistic.b;
import com.ss.android.statistic.c;
import java.util.Map;
import org.json.JSONObject;

public final class a extends b {
    public final void a(@NonNull com.ss.android.statistic.a aVar) {
    }

    @NonNull
    public final String a() {
        return b.f31111d;
    }

    public final void a(@NonNull c cVar) {
        String str;
        long j;
        JSONObject jSONObject;
        String str2 = cVar.f31116a;
        Map<String, Object> map = cVar.f31118c;
        if (!TextUtils.isEmpty(str2)) {
            if (!cVar.a()) {
                if (cVar.b()) {
                    JSONObject jSONObject2 = new JSONObject();
                    if (map != null) {
                        try {
                            for (Map.Entry next : map.entrySet()) {
                                if (next != null && (next.getValue() instanceof String) && (next.getKey() instanceof String)) {
                                    jSONObject2.put((String) next.getKey(), next.getValue());
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    AppLogNewUtils.onEventV3(cVar.f31116a, jSONObject2);
                }
            } else if (map == null) {
                AppLog.onEvent(null, str2);
            } else {
                String str3 = (String) map.get(b.s);
                Object obj = map.get(b.p);
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                Object obj2 = map.get(b.t);
                long j2 = 0;
                if (obj2 instanceof Long) {
                    j = ((Long) obj2).longValue();
                } else {
                    j = 0;
                }
                Object obj3 = map.get(b.u);
                if (obj3 instanceof Long) {
                    j2 = ((Long) obj3).longValue();
                }
                Object obj4 = map.get(b.v);
                if (obj4 instanceof JSONObject) {
                    jSONObject = (JSONObject) obj4;
                } else {
                    jSONObject = null;
                }
                AppLog.onEvent((Context) null, str3, str2, str, j, j2, jSONObject);
            }
        }
    }

    public final void a(@NonNull Context context, @NonNull com.ss.android.statistic.a aVar) {
        AppLog.setAppId(aVar.h);
        AppLog.setChannel(aVar.f2559d);
        AppLog.init(context, aVar.j, aVar.i);
    }
}
