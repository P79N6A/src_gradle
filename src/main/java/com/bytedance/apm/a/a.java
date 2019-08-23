package com.bytedance.apm.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.a.c.b;
import com.bytedance.apm.c;
import com.bytedance.apm.k.e;
import com.bytedance.apm.k.t;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public final class a implements com.bytedance.services.slardar.config.a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile Context f1874a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile d f1875b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f1876c;

    public final void onReady() {
    }

    private static String a(List<String> list) {
        String str;
        File file = new File(list.get(0));
        String parent = file.getParent();
        String name = file.getName();
        if (TextUtils.isEmpty(name)) {
            str = "";
        } else {
            if (name.lastIndexOf(ClassUtils.PACKAGE_SEPARATOR) == -1) {
                str = name + ".zip";
            } else {
                str = name.substring(0, r4) + ".zip";
            }
        }
        File file2 = new File(parent, str);
        if (file2.exists()) {
            file2.delete();
        }
        try {
            e.a(list, file2.getAbsolutePath());
            return file2.getAbsolutePath();
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onRefresh(JSONObject jSONObject, boolean z) {
        f1876c = jSONObject.optBoolean("enable_active_upload_alog", false);
    }

    public static void a(String str, long j, long j2, String str2, c cVar) {
        List<String> list;
        String str3;
        boolean z;
        if (f1874a != null && !TextUtils.isEmpty(str) && new File(str).exists()) {
            if (cVar != null) {
                cVar.a();
            }
            if (f1875b != null) {
                list = f1875b.a(f1874a, str, j, j2);
            } else {
                list = null;
            }
            if (list != null && list.size() > 0) {
                com.bytedance.apm.a.a.a aVar = new com.bytedance.apm.a.a.a();
                JSONObject f2 = c.f();
                if (f2 != null) {
                    aVar.f18873b = f2.optString("aid");
                    aVar.f18872a = f2.optString("device_id");
                }
                if (b.a(f1874a).contains(":")) {
                    str3 = b.a(f1874a);
                } else {
                    str3 = "main";
                }
                aVar.f18874c = str3;
                aVar.f18875d = list;
                aVar.f18876e = f2;
                if (TextUtils.isEmpty(aVar.f18873b) || TextUtils.isEmpty(aVar.f18872a) || TextUtils.isEmpty(aVar.f18874c) || aVar.f18875d == null || aVar.f18875d.size() == 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    String a2 = a(aVar.f18875d);
                    if (TextUtils.isEmpty(a2)) {
                        com.bytedance.apm.a.b.a.a(aVar.f18873b, aVar.f18872a, aVar.f18874c, aVar.f18875d, str2, aVar.f18876e);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(a2);
                        com.bytedance.apm.a.b.a.a(aVar.f18873b, aVar.f18872a, aVar.f18874c, arrayList, str2, aVar.f18876e);
                        new File(a2).delete();
                    }
                    String a3 = t.a("http://amfr.snssdk.com/file_report/upload", c.e());
                    try {
                        for (String file : aVar.f18875d) {
                            com.bytedance.framwork.core.monitor.b.a(a3, new File(file), (Map<String, String>) null, "UTF-8", true);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }
}
