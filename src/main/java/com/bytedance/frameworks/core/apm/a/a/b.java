package com.bytedance.frameworks.core.apm.a.a;

import android.content.ContentValues;
import com.bytedance.apm.f.a;
import com.bytedance.frameworks.core.apm.a.a;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends a<a> {
    public final String d() {
        return "t_apiall";
    }

    public final String[] e() {
        return new String[]{"_id", "type", "version_id", "data", "hit_rules"};
    }

    public final /* synthetic */ Object a(a.b bVar) {
        return b(bVar);
    }

    private static com.bytedance.apm.f.a b(a.b bVar) {
        long a2 = bVar.a("_id");
        String c2 = bVar.c("type");
        long a3 = bVar.a("version_id");
        String c3 = bVar.c("data");
        int b2 = bVar.b("hit_rules");
        try {
            JSONObject jSONObject = new JSONObject(c3);
            jSONObject.put("hit_rules", b2);
            com.bytedance.apm.f.a aVar = new com.bytedance.apm.f.a(a2, c2, a3, jSONObject);
            return aVar;
        } catch (JSONException unused) {
            com.bytedance.apm.f.a aVar2 = new com.bytedance.apm.f.a(a2, c2, a3, c3);
            return aVar2;
        }
    }

    public final /* synthetic */ ContentValues a(Object obj) {
        String str;
        com.bytedance.apm.f.a aVar = (com.bytedance.apm.f.a) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", aVar.g);
        contentValues.put("type2", aVar.h);
        contentValues.put("timestamp", Long.valueOf(aVar.k));
        contentValues.put("version_id", Long.valueOf(aVar.j));
        if (aVar.i == null) {
            str = "";
        } else {
            str = aVar.i.toString();
        }
        contentValues.put("data", str);
        contentValues.put("is_sampled", Integer.valueOf(aVar.l ? 1 : 0));
        contentValues.put("hit_rules", Integer.valueOf(aVar.f1986d));
        contentValues.put("front", Integer.valueOf(aVar.f1983a));
        contentValues.put("sid", Long.valueOf(aVar.f1985c));
        contentValues.put("network_type", Integer.valueOf(aVar.f1984b));
        contentValues.put("traffic_value", Long.valueOf(aVar.f1987e));
        return contentValues;
    }
}
