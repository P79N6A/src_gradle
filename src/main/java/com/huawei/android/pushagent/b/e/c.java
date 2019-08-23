package com.huawei.android.pushagent.b.e;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushagent.utils.a.h;
import java.io.File;
import org.json.JSONObject;

public class c {

    static class a {

        /* renamed from: a  reason: collision with root package name */
        String f25096a;

        /* renamed from: b  reason: collision with root package name */
        int f25097b;

        /* renamed from: c  reason: collision with root package name */
        String f25098c;

        /* renamed from: d  reason: collision with root package name */
        Object f25099d;

        private a() {
            this.f25096a = "";
            this.f25097b = -1;
            this.f25098c = "";
        }
    }

    private static a a(String str) {
        a aVar = new a();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("file")) {
                aVar.f25096a = jSONObject.getString("file");
                e.a("PushLogAC2815", "ModifyStruct mFileName is " + aVar.f25096a);
            }
            if (jSONObject.has("type")) {
                aVar.f25097b = jSONObject.getInt("type");
                e.a("PushLogAC2815", "ModifyStruct mModifyType is " + aVar.f25097b);
            }
            if (jSONObject.has("name")) {
                aVar.f25098c = jSONObject.getString("name");
                e.a("PushLogAC2815", "ModifyStruct mName is " + aVar.f25098c);
            }
            if (jSONObject.has("val")) {
                aVar.f25099d = jSONObject.get("val");
                e.a("PushLogAC2815", "ModifyStruct mVal is " + aVar.f25099d);
            }
            return aVar;
        } catch (Exception e2) {
            e.c("PushLogAC2815", e2.toString(), e2);
            return null;
        }
    }

    public static synchronized void a(Context context, String str) {
        synchronized (c.class) {
            e.a("PushLogAC2815", "enter ModifyConfigs modify jsonStr is : " + str);
            a a2 = a(str);
            if (a2 == null) {
                e.d("PushLogAC2815", "enter ModifyConfigs struct is null !");
            } else if (TextUtils.isEmpty(a2.f25096a)) {
                e.d("PushLogAC2815", "enter ModifyConfigs struct failed to create sharepreference file!");
            } else {
                switch (a2.f25097b) {
                    case 1:
                        if (TextUtils.isEmpty(a2.f25098c)) {
                            e.d("PushLogAC2815", "enter ModifyConfigs saveString failed! mName or mVal is null");
                            return;
                        } else if (new h(context, a2.f25096a).a(a2.f25098c, a2.f25099d)) {
                            e.a("PushLogAC2815", "enter ModifyConfigs saveString sucessfully! filename is " + a2.f25096a + ",itemName is " + a2.f25098c + ",itemValue is " + a2.f25099d);
                            return;
                        } else {
                            e.d("PushLogAC2815", "enter ModifyConfigs saveString failed!");
                            return;
                        }
                    case 2:
                        if (TextUtils.isEmpty(a2.f25098c)) {
                            e.d("PushLogAC2815", "enter ModifyConfigs removeKey failed! mName is null");
                            return;
                        }
                        File cacheDir = context.getCacheDir();
                        File file = new File(cacheDir.getParent() + File.separator + "shared_prefs" + File.separator + a2.f25096a + ".xml");
                        if (!file.isFile() || !file.exists()) {
                            e.d("PushLogAC2815", "the file is not exist! file path is" + file);
                            return;
                        } else if (new h(context, a2.f25096a).f(a2.f25098c)) {
                            e.a("PushLogAC2815", "enter ModifyConfigs removeKey sucessfully! the fileName is " + a2.f25096a + ",the key is " + a2.f25098c);
                            return;
                        } else {
                            e.d("PushLogAC2815", "enter ModifyConfigs removeKey failed, maybe the key is not exist!");
                            return;
                        }
                    case 3:
                        File cacheDir2 = context.getCacheDir();
                        File file2 = new File(cacheDir2.getParent() + File.separator + "shared_prefs" + File.separator + a2.f25096a + ".xml");
                        if (!file2.isFile() || !file2.exists()) {
                            e.d("PushLogAC2815", "the file is not exist! file path is" + r4);
                            return;
                        } else if (file2.delete()) {
                            e.a("PushLogAC2815", "delete success! file path is " + r4);
                            return;
                        } else {
                            e.d("PushLogAC2815", "delete failed! file path is " + r4);
                            return;
                        }
                    default:
                        e.d("PushLogAC2815", "the modifyType:" + a2.f25097b + " is not supported! ");
                        return;
                }
            }
        }
    }
}
