package com.ss.alive.monitor;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class d {

    /* renamed from: c  reason: collision with root package name */
    private static volatile d f2397c;

    /* renamed from: a  reason: collision with root package name */
    PushMultiProcessSharedProvider.b f2398a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2399b;

    /* renamed from: d  reason: collision with root package name */
    private Context f2400d;

    /* renamed from: e  reason: collision with root package name */
    private a f2401e;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2402a;

        /* renamed from: b  reason: collision with root package name */
        public int f2403b = 60;

        /* renamed from: c  reason: collision with root package name */
        public int f2404c = 100;

        /* renamed from: d  reason: collision with root package name */
        public int f2405d = 7200;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2406e;

        /* renamed from: f  reason: collision with root package name */
        public List<String> f2407f;

        public a() {
        }

        public a(String str) {
            a(str);
        }

        public final void a(String str) {
            boolean z;
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    int i = 0;
                    if (jSONObject.optInt("is_monitor_alive_enable", 0) > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.f2402a = z;
                    this.f2403b = jSONObject.optInt("monitor_live_interval_second", 30);
                    this.f2404c = jSONObject.optInt("max_send_start_info_num", 100);
                    this.f2405d = jSONObject.optInt("default_send_data_interval", 7200);
                    this.f2406e = jSONObject.optBoolean("enable_upload_unactive_apps", false);
                    JSONArray optJSONArray = jSONObject.optJSONArray("upload_unactive_app_packages");
                    if (optJSONArray != null) {
                        this.f2407f = new ArrayList();
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            try {
                                String string = optJSONArray.getString(i2);
                                if (!TextUtils.isEmpty(string)) {
                                    this.f2407f.add(string);
                                }
                            } catch (JSONException unused) {
                            }
                        }
                    }
                    if (Logger.debug()) {
                        StringBuilder sb = new StringBuilder("upload_unactive_app_packages size : ");
                        if (this.f2407f != null) {
                            i = this.f2407f.size();
                        }
                        sb.append(i);
                        Logger.d("MonitorLiveSetting", sb.toString());
                    }
                } catch (Exception unused2) {
                }
            }
        }
    }

    public final synchronized a a() {
        if (this.f2401e == null) {
            this.f2401e = new a(this.f2398a.a("monitor_alive_config", ""));
        }
        return this.f2401e;
    }

    private d(Context context) {
        this.f2400d = context.getApplicationContext();
        this.f2398a = PushMultiProcessSharedProvider.a(context);
    }

    public static d a(Context context) {
        if (f2397c == null) {
            synchronized (d.class) {
                if (f2397c == null) {
                    f2397c = new d(context);
                }
            }
        }
        return f2397c;
    }

    public final void a(String str) {
        this.f2398a.a().a("monitor_alive_config", str).a();
        if (this.f2401e == null) {
            this.f2401e = new a(str);
        } else {
            this.f2401e.a(str);
        }
    }
}
