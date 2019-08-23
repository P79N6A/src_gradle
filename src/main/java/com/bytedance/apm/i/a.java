package com.bytedance.apm.i;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.apm.a.b.b;
import com.bytedance.frameworks.core.b.c;
import com.bytedance.services.apm.api.d;
import com.bytedance.services.apm.api.e;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f19009a;

    public final void a(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull List<String> list, @NonNull String str4, @Nullable JSONObject jSONObject, @Nullable d dVar) {
        com.bytedance.frameworks.core.b.a.a();
        final String str5 = str;
        final String str6 = str2;
        final String str7 = str3;
        final List<String> list2 = list;
        final String str8 = str4;
        final JSONObject jSONObject2 = jSONObject;
        final d dVar2 = dVar;
        AnonymousClass1 r0 = new c() {
            public final void run() {
                String str;
                int i;
                a aVar = a.this;
                String str2 = str5;
                String str3 = str6;
                String str4 = str7;
                List<String> list = list2;
                String str5 = str8;
                JSONObject jSONObject = jSONObject2;
                d dVar = dVar2;
                try {
                    if (aVar.f19009a) {
                        str = "http://mon.byteoversea.com/monitor/collect/c/logcollect";
                    } else {
                        str = "http://mon.snssdk.com/monitor/collect/c/logcollect";
                    }
                    b bVar = new b(str, "UTF-8", false);
                    bVar.a("aid", str2);
                    bVar.a("device_id", str3);
                    bVar.a("os", "Android");
                    bVar.a("process_name", "main");
                    for (String file : list) {
                        File file2 = new File(file);
                        if (file2.exists()) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("logtype", str4);
                            hashMap.put("scene", str5);
                            hashMap.put("env", "params.txt");
                            bVar.a(file2.getName(), file2, hashMap);
                        }
                    }
                    bVar.a(jSONObject);
                    try {
                        i = new JSONObject(bVar.a()).optInt("errno", -1);
                    } catch (JSONException unused) {
                        i = -1;
                    }
                    if (dVar != null && i == 200) {
                        dVar.a();
                    }
                } catch (IOException e2) {
                    if (dVar != null) {
                        e2.getMessage();
                    }
                }
            }
        };
        com.bytedance.frameworks.core.b.a.a(r0);
    }
}
