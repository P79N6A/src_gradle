package com.bytedance.apm.impl;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.apm.c;
import com.bytedance.apm.f.e;
import com.bytedance.apm.k.i;
import com.bytedance.frameworks.core.apm.a.a.a;
import com.bytedance.frameworks.core.apm.b;
import com.bytedance.services.apm.api.IMonitorLogManager;
import com.bytedance.services.apm.api.f;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class MonitorLogManagerImpl implements IMonitorLogManager {
    @Nullable
    private static a<? extends e> getLogStoreByType(String str) {
        if (TextUtils.equals(str, "api_all")) {
            return b.a().a(com.bytedance.apm.f.a.class);
        }
        return b.a().a(e.class);
    }

    public void deleteLegacyLogByIds(String str, String str2) {
        a<? extends e> logStoreByType = getLogStoreByType(str);
        if (logStoreByType != null) {
            logStoreByType.a(str2);
        }
    }

    private static String packLog(JSONArray jSONArray, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", jSONArray);
            JSONObject f2 = c.f();
            if (f2 != null) {
                JSONObject a2 = com.bytedance.apm.i.b.a(new JSONObject(f2.toString()), com.bytedance.frameworks.core.apm.a.a().a(j));
                a2.put("debug_fetch", 1);
                jSONObject.put("header", a2);
                return jSONObject.toString();
            }
        } catch (Exception unused) {
        }
        return "";
    }

    public void getLegacyLog(long j, long j2, String str, f fVar) {
        if (fVar != null && !TextUtils.isEmpty(str)) {
            a<? extends e> logStoreByType = getLogStoreByType(str);
            if (logStoreByType == null) {
                fVar.a("", "");
                return;
            }
            List a2 = logStoreByType.a(j, j2, str, "0,100");
            if (i.a(a2)) {
                fVar.a("", "");
                return;
            }
            Iterator it2 = a2.iterator();
            JSONArray jSONArray = new JSONArray();
            LinkedList linkedList = new LinkedList();
            long j3 = -1;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                try {
                    e eVar = (e) it2.next();
                    if (j3 != -1) {
                        if (eVar.j != j3) {
                            break;
                        }
                    } else {
                        j3 = eVar.j;
                    }
                    jSONArray.put(eVar.i);
                    linkedList.add(Long.valueOf(eVar.f1988f));
                } catch (Exception unused) {
                }
            }
            fVar.a(packLog(jSONArray, j3), i.a(linkedList, ","));
        }
    }
}
