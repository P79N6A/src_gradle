package com.mapbox.android.telemetry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.CertificatePinner;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<o, Map<String, List<String>>> f26110a = new HashMap<o, Map<String, List<String>>>() {
        {
            put(o.STAGING, bg.f26062a);
            put(o.COM, j.f26113a);
            put(o.CHINA, g.f26111a);
        }
    };

    f() {
    }

    /* access modifiers changed from: package-private */
    public final CertificatePinner a(o oVar, e eVar) {
        CertificatePinner.Builder builder = new CertificatePinner.Builder();
        Map map = f26110a.get(oVar);
        String str = (String) map.keySet().iterator().next();
        List<String> list = (List) map.get(str);
        if (list != null) {
            for (String str2 : list) {
                if (eVar.f26107a.contains(str2)) {
                    list.remove(str2);
                }
            }
            map.put(str, list);
        }
        for (Map.Entry entry : map.entrySet()) {
            for (String str3 : (List) entry.getValue()) {
                builder.add((String) entry.getKey(), String.format("sha256/%s", new Object[]{str3}));
            }
        }
        return builder.build();
    }
}
