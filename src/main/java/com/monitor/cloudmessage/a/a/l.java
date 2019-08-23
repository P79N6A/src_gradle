package com.monitor.cloudmessage.a.a;

import com.monitor.cloudmessage.a.a;
import com.monitor.cloudmessage.b.b.a.e;
import com.monitor.cloudmessage.d.b.b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class l extends a implements com.monitor.cloudmessage.d.a.a {

    /* renamed from: a  reason: collision with root package name */
    private File f27330a;

    public final String a() {
        return "permission";
    }

    public final List<String> b() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f27330a != null) {
            arrayList.add(this.f27330a.getAbsolutePath());
        }
        return arrayList;
    }

    public final boolean c(com.monitor.cloudmessage.entity.a aVar) throws Exception {
        if (a(new JSONObject(aVar.f27359a), aVar)) {
            return true;
        }
        com.monitor.cloudmessage.a.a();
        File a2 = e.a(com.monitor.cloudmessage.a.b());
        if (a2 == null) {
            b bVar = new b(0, false, aVar.f27362d, null);
            bVar.l = 3;
            bVar.m = "网络信息文件生成失败";
            com.monitor.cloudmessage.d.a.a(bVar);
            return true;
        }
        this.f27330a = a2;
        com.monitor.cloudmessage.d.b.a aVar2 = new com.monitor.cloudmessage.d.b.a("txt", 0, false, aVar.f27362d, this, null);
        com.monitor.cloudmessage.d.a.a(aVar2);
        return true;
    }
}
