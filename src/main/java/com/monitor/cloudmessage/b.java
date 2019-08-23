package com.monitor.cloudmessage;

import android.content.Context;
import com.bytedance.frameworks.apm.a;
import com.bytedance.news.common.service.manager.c;
import com.bytedance.services.apm.api.IMonitorLogManager;
import com.bytedance.services.apm.api.h;
import com.bytedance.services.slardar.config.IConfigManager;
import com.monitor.cloudmessage.callback.f;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b extends a implements com.bytedance.services.slardar.config.b, f {

    /* renamed from: c  reason: collision with root package name */
    private List<String> f27337c = Arrays.asList(new String[]{"timer", "count", "disk", "memory", "cpu", "fps", "traffic", "start", "page_load", "image_monitor", "api_all", "api_error", "common_log", "service_monitor", "performance_monitor", "ui_action"});

    public final void a() {
        super.a();
    }

    public final void a(Context context) {
        super.a(context);
        a.a(context);
        ((IConfigManager) c.a(IConfigManager.class)).registerResponseConfigListener(this);
        if (a.f27304e) {
            a.a().a((f) this);
        } else {
            a.f27302c = this;
        }
    }

    public final String[] b(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("upload_type");
        int i = 0;
        if (optJSONArray == null) {
            String[] strArr = new String[this.f27337c.size()];
            while (i < this.f27337c.size()) {
                strArr[i] = this.f27337c.get(i);
                i++;
            }
            return strArr;
        }
        String[] strArr2 = new String[optJSONArray.length()];
        while (i < optJSONArray.length()) {
            strArr2[i] = optJSONArray.optString(i);
            i++;
        }
        return strArr2;
    }

    public final void a(h hVar) {
        boolean z;
        if (hVar != null) {
            List<String> list = hVar.f2319a;
            if (list == null || list.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                try {
                    URL url = new URL(hVar.f2319a.get(0));
                    com.monitor.cloudmessage.d.c.a.f27349a = String.format("%s://%s/%s", new Object[]{url.getProtocol(), url.getHost(), "monitor/collect/c/cloudcontrol/file"});
                } catch (MalformedURLException unused) {
                }
            }
        }
    }

    public final void a(JSONObject jSONObject) {
        if (!a.f27303d) {
            JSONArray optJSONArray = jSONObject.optJSONArray("cloud_commands");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    a.a().a(optJSONArray.optString(i));
                }
            }
        }
    }

    public final void a(String str, String str2) {
        ((IMonitorLogManager) c.a(IMonitorLogManager.class)).deleteLegacyLogByIds(str, str2);
    }

    public final void a(long j, long j2, String str, com.bytedance.services.apm.api.f fVar) {
        ((IMonitorLogManager) c.a(IMonitorLogManager.class)).getLegacyLog(j * 1000, j2 * 1000, str, fVar);
    }
}
