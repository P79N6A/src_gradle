package com.monitor.cloudmessage.a.a;

import android.os.Debug;
import android.text.TextUtils;
import com.bytedance.tailor.Tailor;
import com.monitor.cloudmessage.a.a;
import com.ss.android.ugc.aweme.utils.fd;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class g extends a implements com.monitor.cloudmessage.d.a.a {

    /* renamed from: a  reason: collision with root package name */
    private File f27319a;

    public final String a() {
        return "heap_oom";
    }

    public final List<String> b() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f27319a != null) {
            arrayList.add(this.f27319a.getAbsolutePath());
        }
        return arrayList;
    }

    public final boolean d(com.monitor.cloudmessage.entity.a aVar) throws Exception {
        JSONObject jSONObject = new JSONObject(aVar.f27359a);
        if (a(jSONObject, aVar)) {
            return true;
        }
        boolean optBoolean = jSONObject.optBoolean("isTryToCatch", false);
        String f2 = com.monitor.cloudmessage.a.f();
        if (optBoolean) {
            try {
                Debug.dumpHprofData(f2);
            } catch (Exception unused) {
            }
        }
        String str = null;
        File file = new File(f2);
        if (TextUtils.isEmpty(f2)) {
            str = "本地未设置dumpFileName";
        }
        if (!file.exists()) {
            str = "dumpFile不存在";
        }
        if (!TextUtils.isEmpty(str)) {
            a(str, aVar);
            return true;
        }
        this.f27319a = file;
        com.monitor.cloudmessage.d.b.a aVar2 = new com.monitor.cloudmessage.d.b.a("log_heap_oom", 0, false, aVar.f27362d, this, null);
        aVar2.f27346d = true;
        com.monitor.cloudmessage.d.a.a(aVar2);
        return true;
    }

    public final boolean c(com.monitor.cloudmessage.entity.a aVar) throws Exception {
        String str;
        String absolutePath = com.ss.android.f.a.a().getAbsolutePath();
        com.monitor.cloudmessage.a.c(absolutePath + "/dump.xzip");
        String str2 = absolutePath + "/.dump.hprof";
        String str3 = absolutePath + "/.mini.hprof";
        if (new File(str2).exists() && Tailor.isHprofValid(str2)) {
            Tailor.tailorHprof(str2, str3);
        }
        File file = new File(str3);
        if (file.exists()) {
            new File(str2).delete();
        }
        ArrayList arrayList = new ArrayList(3);
        StringBuilder sb = new StringBuilder();
        sb.append(absolutePath);
        if (file.exists()) {
            str = "/.mini.hprof";
        } else {
            str = "/.dump.hprof";
        }
        sb.append(str);
        arrayList.add(sb.toString());
        arrayList.add(absolutePath + "/.maps");
        arrayList.add(absolutePath + "/.fds");
        arrayList.add(absolutePath + "/.threads");
        fd.a(absolutePath, "dump.xzip", (List<String>) arrayList);
        return d(aVar);
    }
}
