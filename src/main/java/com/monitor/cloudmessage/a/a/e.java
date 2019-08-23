package com.monitor.cloudmessage.a.a;

import android.text.TextUtils;
import com.monitor.cloudmessage.a.a;
import com.monitor.cloudmessage.e.b;
import java.io.File;
import org.json.JSONObject;

public final class e extends a {
    public final String a() {
        return "data_clear";
    }

    public final boolean c(com.monitor.cloudmessage.entity.a aVar) throws Exception {
        File file;
        boolean z;
        com.monitor.cloudmessage.entity.a aVar2 = aVar;
        JSONObject jSONObject = new JSONObject(aVar2.f27359a);
        if (a(jSONObject, aVar2)) {
            return true;
        }
        String b2 = b.b(jSONObject.optString("rootNode"), jSONObject.optString("relativeDirName"));
        String str = null;
        if (TextUtils.isEmpty(b2)) {
            file = null;
            str = "目录名为空";
        } else {
            file = new File(b2);
            if (!file.exists()) {
                str = "文件/目录不存在";
            }
        }
        if (!TextUtils.isEmpty(str)) {
            a(str, aVar2);
            return true;
        }
        switch (jSONObject.optInt("deleteStrategy", 0)) {
            case 0:
                if (!file.isDirectory()) {
                    z = file.delete();
                    break;
                } else {
                    z = b.a(file.getAbsolutePath());
                    break;
                }
            case 1:
                long optLong = jSONObject.optLong("expiration_time", -1);
                if (optLong >= 0) {
                    if (!file.isDirectory()) {
                        if (file.lastModified() < optLong * 1000) {
                            z = file.delete();
                            break;
                        }
                    } else {
                        boolean z2 = true;
                        for (File lastModified : file.listFiles()) {
                            if (lastModified.lastModified() < optLong * 1000) {
                                if (!z2 || !file.delete()) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                            }
                        }
                        z = z2;
                        break;
                    }
                } else {
                    a("数据清理过期时间为空", aVar2);
                }
                z = true;
                break;
            default:
                a("数据清理策略不合法", aVar2);
                return true;
        }
        if (!z) {
            a("数据删除失败(部分文件执行delete操作失败)", aVar2);
        } else {
            b(aVar);
        }
        return true;
    }
}
