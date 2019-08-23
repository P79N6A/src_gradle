package com.monitor.cloudmessage.a.a;

import com.monitor.cloudmessage.a.a;
import com.monitor.cloudmessage.b.b.a.g;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class p extends a implements com.monitor.cloudmessage.d.a.a {

    /* renamed from: a  reason: collision with root package name */
    private File f27334a;

    public final String a() {
        return "stat";
    }

    public final List<String> b() {
        ArrayList arrayList = new ArrayList();
        if (this.f27334a != null) {
            arrayList.add(this.f27334a.getAbsolutePath());
        }
        return arrayList;
    }

    public final boolean c(com.monitor.cloudmessage.entity.a aVar) throws Exception {
        JSONObject jSONObject = new JSONObject(aVar.f27359a);
        String optString = jSONObject.optString("type", "system_info");
        if (a(jSONObject, aVar)) {
            return true;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (optString.equals("all")) {
            new com.monitor.cloudmessage.b.a.a.a();
            jSONObject2.put("all", com.monitor.cloudmessage.b.a.a.a.a());
        } else if (!optString.equals("stack_info") && optString.equals("system_info")) {
            new com.monitor.cloudmessage.b.a.a.a();
            jSONObject2.put("system_info", com.monitor.cloudmessage.b.a.a.a.a());
        }
        com.monitor.cloudmessage.a.a();
        File a2 = g.a(com.monitor.cloudmessage.a.b(), jSONObject2);
        if (a2 == null) {
            a("系统信息文件生成失败", aVar);
            return true;
        }
        this.f27334a = a2;
        com.monitor.cloudmessage.d.b.a aVar2 = new com.monitor.cloudmessage.d.b.a("json", 0, false, aVar.f27362d, this, null);
        com.monitor.cloudmessage.d.a.a(aVar2);
        return true;
    }
}
