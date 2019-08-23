package com.monitor.cloudmessage.a.a;

import com.monitor.cloudmessage.a.a;
import com.monitor.cloudmessage.d.b.b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class d extends a implements com.monitor.cloudmessage.d.a.a {

    /* renamed from: a  reason: collision with root package name */
    private File f27316a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f27317b;

    public final String a() {
        return "db";
    }

    public final List<String> b() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f27316a != null) {
            arrayList.add(this.f27316a.getAbsolutePath());
        }
        return arrayList;
    }

    public final boolean c(com.monitor.cloudmessage.entity.a aVar) throws Exception {
        JSONObject jSONObject = new JSONObject(aVar.f27359a);
        if (a(jSONObject, aVar)) {
            return true;
        }
        if (this.f27317b) {
            b bVar = new b(0, false, aVar.f27362d, null);
            bVar.l = 0;
            bVar.m = "数据库文件正在处理中";
            com.monitor.cloudmessage.d.a.a(bVar);
            return true;
        }
        this.f27317b = true;
        String optString = jSONObject.optString("db_name", "");
        com.monitor.cloudmessage.a.a();
        File a2 = com.monitor.cloudmessage.b.b.a.a.a(com.monitor.cloudmessage.a.b(), optString);
        this.f27317b = false;
        if (a2 == null) {
            a("Sqlite文件拷贝失败", aVar);
            return true;
        }
        this.f27316a = a2;
        com.monitor.cloudmessage.d.b.a aVar2 = new com.monitor.cloudmessage.d.b.a(jSONObject.optString("fileContentType", "default_db_file_type"), 0, false, aVar.f27362d, this, null);
        aVar2.f27346d = false;
        aVar2.f27348f = true;
        com.monitor.cloudmessage.d.a.a(aVar2);
        return true;
    }
}
