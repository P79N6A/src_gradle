package com.bytedance.crash.upload;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.crash.c;
import com.bytedance.crash.d;
import com.bytedance.crash.event.b;
import com.bytedance.crash.event.c;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.framework.core.a;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public class CrashUploadService extends IntentService {
    public CrashUploadService() {
        super("CrashUploadService");
    }

    public void onDestroy() {
        super.onDestroy();
        String str = a.b().f3304b;
        if (TextUtils.isEmpty(str) || !str.startsWith("gray_") || !ToolUtils.isMainProcess(GlobalContext.getContext())) {
            System.exit(0);
            return;
        }
        throw new RuntimeException("Process killed, status is " + 0);
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(@Nullable Intent intent) {
        d dVar;
        if (intent != null) {
            c.f19429a = getApplicationContext();
            com.bytedance.crash.event.a aVar = null;
            if (intent.hasExtra("crash_type")) {
                dVar = (d) intent.getSerializableExtra("crash_type");
            } else {
                dVar = null;
            }
            String stringExtra = intent.getStringExtra("upload_url");
            String stringExtra2 = intent.getStringExtra("crash_json_value");
            String stringExtra3 = intent.getStringExtra("crash_info_file_path");
            String stringExtra4 = intent.getStringExtra("crash_dump_file_path");
            com.bytedance.crash.db.a.a().a((Context) getApplication());
            try {
                aVar = b.a(dVar, c.a.g, new JSONObject(stringExtra2));
            } catch (Exception unused) {
            }
            if (TextUtils.isEmpty(stringExtra2) || TextUtils.isEmpty(stringExtra) || com.bytedance.crash.db.a.a().a(stringExtra3)) {
                if (aVar != null) {
                    com.bytedance.crash.event.c.b(aVar.state(210));
                }
                return;
            }
            h a2 = a(stringExtra, stringExtra2, stringExtra4, dVar);
            if (a2.a()) {
                if (dVar == d.NATIVE) {
                    if (!com.bytedance.crash.i.d.a(new File(stringExtra3).getParentFile(), true)) {
                        com.bytedance.crash.db.a.a().a(com.bytedance.crash.db.a.a.a(stringExtra3));
                    }
                } else if (!TextUtils.isEmpty(stringExtra3) && !com.bytedance.crash.i.d.a(stringExtra3)) {
                    com.bytedance.crash.db.a.a().a(com.bytedance.crash.db.a.a.a(stringExtra3));
                }
                if (aVar != null) {
                    com.bytedance.crash.event.c.b(aVar.state(0).errorInfo(a2.f19589c));
                }
            } else if (aVar != null) {
                com.bytedance.crash.event.c.b(aVar.state(a2.f19587a).errorInfo(a2.f19588b));
            }
        }
    }

    private static h a(String str, String str2, String str3, d dVar) {
        if (dVar == null) {
            return new h(201);
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            jSONObject.put("upload_scene", "new_process");
            str2 = jSONObject.toString();
        } catch (JSONException unused) {
        }
        if (dVar == d.NATIVE) {
            return b.a(str, str2, str3);
        }
        if (dVar == d.LAUNCH) {
            return b.a(str, str2);
        }
        return b.a(str, str2, true);
    }
}
