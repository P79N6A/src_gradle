package com.monitor.cloudmessage.a.a;

import com.monitor.cloudmessage.a.a;
import com.monitor.cloudmessage.b.b.a.d;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class i extends a implements com.monitor.cloudmessage.d.a.a {

    /* renamed from: a  reason: collision with root package name */
    private File f27328a;

    public final String a() {
        return "network";
    }

    public final List<String> b() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f27328a != null) {
            arrayList.add(this.f27328a.getAbsolutePath());
        }
        return arrayList;
    }

    public final boolean c(com.monitor.cloudmessage.entity.a aVar) throws Exception {
        if (a(new JSONObject(aVar.f27359a), aVar)) {
            return true;
        }
        com.monitor.cloudmessage.a.a();
        File a2 = d.a(com.monitor.cloudmessage.a.b(), new JSONObject(aVar.f27359a));
        if (a2 == null) {
            a("网络信息文件生成失败", aVar);
            return true;
        }
        this.f27328a = a2;
        com.monitor.cloudmessage.d.b.a aVar2 = new com.monitor.cloudmessage.d.b.a("json", 0, false, aVar.f27362d, this, null);
        com.monitor.cloudmessage.d.a.a(aVar2);
        return true;
    }
}
