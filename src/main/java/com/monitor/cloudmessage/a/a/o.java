package com.monitor.cloudmessage.a.a;

import com.monitor.cloudmessage.a.a;
import com.monitor.cloudmessage.b.b.a.f;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class o extends a implements com.monitor.cloudmessage.d.a.a {

    /* renamed from: a  reason: collision with root package name */
    private File f27333a;

    public final String a() {
        return "sp";
    }

    public final List<String> b() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f27333a != null) {
            arrayList.add(this.f27333a.getAbsolutePath());
        }
        return arrayList;
    }

    public final boolean c(com.monitor.cloudmessage.entity.a aVar) throws Exception {
        JSONObject jSONObject = new JSONObject(aVar.f27359a);
        if (a(jSONObject, aVar)) {
            return true;
        }
        com.monitor.cloudmessage.a.a();
        File a2 = f.a(com.monitor.cloudmessage.a.b());
        if (a2 == null) {
            a("sp文件拷贝失败", aVar);
            return true;
        }
        this.f27333a = a2;
        com.monitor.cloudmessage.d.b.a aVar2 = new com.monitor.cloudmessage.d.b.a(jSONObject.optString("fileContentType", "default_sp_file_type"), 0, false, aVar.f27362d, this, null);
        aVar2.f27346d = false;
        com.monitor.cloudmessage.d.a.a(aVar2);
        return true;
    }
}
