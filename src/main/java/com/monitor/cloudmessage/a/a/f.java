package com.monitor.cloudmessage.a.a;

import android.text.TextUtils;
import com.monitor.cloudmessage.a.a;
import com.monitor.cloudmessage.e.b;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public final class f extends a implements com.monitor.cloudmessage.d.a.a {

    /* renamed from: a  reason: collision with root package name */
    private File f27318a;

    public final String a() {
        return "new_file";
    }

    public final List<String> b() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f27318a != null) {
            arrayList.add(this.f27318a.getAbsolutePath());
        }
        return arrayList;
    }

    public final boolean c(com.monitor.cloudmessage.entity.a aVar) throws Exception {
        File file;
        JSONObject jSONObject = new JSONObject(aVar.f27359a);
        if (a(jSONObject, aVar)) {
            return true;
        }
        String b2 = b.b(jSONObject.optString("rootNode"), jSONObject.optString("relativeFilename"));
        String str = null;
        if (TextUtils.isEmpty(b2)) {
            file = null;
            str = "文件名为空";
        } else {
            file = new File(b2);
            if (!file.exists()) {
                str = "文件/目录不存在";
            } else if (file.isDirectory()) {
                str = "文件回捞仅支持回捞单文件";
            } else if (!file.canRead() || !file.canWrite()) {
                str = "该文件没有读/写权限";
            }
        }
        if (!TextUtils.isEmpty(str)) {
            a(str, aVar);
            return true;
        }
        this.f27318a = file;
        com.monitor.cloudmessage.d.b.a aVar2 = new com.monitor.cloudmessage.d.b.a(jSONObject.optString("fileContentType", "unknown"), 0, false, aVar.f27362d, this, null);
        aVar2.f27346d = true;
        com.monitor.cloudmessage.d.a.a(aVar2);
        return true;
    }
}
