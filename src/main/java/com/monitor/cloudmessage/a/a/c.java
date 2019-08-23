package com.monitor.cloudmessage.a.a;

import android.text.TextUtils;
import com.monitor.cloudmessage.a.a;
import com.monitor.cloudmessage.e.b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class c extends a implements com.monitor.cloudmessage.d.a.a {

    /* renamed from: a  reason: collision with root package name */
    private File f27315a;

    public final String a() {
        return "new_diskdir";
    }

    public final List<String> b() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f27315a != null) {
            arrayList.add(this.f27315a.getAbsolutePath());
        }
        return arrayList;
    }

    public final boolean c(com.monitor.cloudmessage.entity.a aVar) throws Exception {
        File file;
        JSONObject jSONObject = new JSONObject(aVar.f27359a);
        if (a(jSONObject, aVar)) {
            return true;
        }
        String b2 = b.b(jSONObject.optString("rootNode"), jSONObject.optString("relativeDirName"));
        String str = null;
        if (TextUtils.isEmpty(b2)) {
            str = "目录名为空";
            file = null;
        } else {
            file = new File(b2);
            if (!file.exists()) {
                str = "文件/目录不存在";
            }
        }
        if (!TextUtils.isEmpty(str)) {
            a(str, aVar);
            return true;
        }
        com.monitor.cloudmessage.a.a();
        File a2 = com.monitor.cloudmessage.b.b.a.b.a(com.monitor.cloudmessage.a.b(), file, b2.replace('/', '_'));
        if (a2 == null) {
            a("目录树生成失败", aVar);
            return true;
        }
        this.f27315a = a2;
        com.monitor.cloudmessage.d.b.a aVar2 = new com.monitor.cloudmessage.d.b.a("log_dir_tree", 0, false, aVar.f27362d, this, null);
        com.monitor.cloudmessage.d.a.a(aVar2);
        return true;
    }
}
