package com.bytedance.ad.symphony;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.ad.symphony.model.config.AdConfig;
import com.bytedance.ad.symphony.model.config.c;
import com.bytedance.ad.symphony.model.config.e;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.concurrent.SimpleThreadFactory;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import org.json.JSONObject;

public class a {

    /* renamed from: b  reason: collision with root package name */
    public static int f7536b = 5;

    /* renamed from: e  reason: collision with root package name */
    private static volatile a f7537e;

    /* renamed from: a  reason: collision with root package name */
    public int f7538a;

    /* renamed from: c  reason: collision with root package name */
    int f7539c = 900;

    /* renamed from: d  reason: collision with root package name */
    public Context f7540d;

    /* renamed from: f  reason: collision with root package name */
    private ScheduledExecutorService f7541f;

    /* renamed from: com.bytedance.ad.symphony.a$a  reason: collision with other inner class name */
    public static class C0058a {

        /* renamed from: a  reason: collision with root package name */
        public List<AdConfig> f7544a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public List<AdConfig> f7545b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public List<AdConfig> f7546c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public Map<String, List<String>> f7547d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        public c f7548e;

        /* renamed from: f  reason: collision with root package name */
        public e f7549f;
    }

    private SharedPreferences c() {
        return com.ss.android.ugc.aweme.q.c.a(this.f7540d, "new_sp_ad_config", 0);
    }

    public final synchronized ScheduledExecutorService b() {
        if (this.f7541f == null) {
            this.f7541f = (ScheduledExecutorService) h.a(m.a(p.SCHEDULED).a(1).a((ThreadFactory) new SimpleThreadFactory("ad-symphony-pool")).a());
        }
        return this.f7541f;
    }

    public final C0058a a() {
        e eVar;
        SharedPreferences c2 = c();
        if (c2 == null || a(c2)) {
            return null;
        }
        String string = c2.getString("config", "");
        if (StringUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            C0058a aVar = new C0058a();
            aVar.f7544a = AdConfig.a(jSONObject.optJSONArray("native_ad_config"), 0);
            aVar.f7545b = AdConfig.a(jSONObject.optJSONArray("interstitial_ad_config"), 1);
            aVar.f7546c = AdConfig.a(jSONObject.optJSONArray("banner_ad_config"), 2);
            aVar.f7547d = AdConfig.a(jSONObject.optJSONArray("placement_type_map_config"));
            aVar.f7548e = c.a(jSONObject.optJSONArray("default_fill_strategy_config"));
            JSONObject optJSONObject = jSONObject.optJSONObject("symphony_sdk_config");
            if (optJSONObject == null) {
                eVar = e.a();
            } else {
                e eVar2 = new e();
                eVar2.f7668a = optJSONObject.optBoolean("bid_log_switch", false);
                eVar2.f7669b = optJSONObject.optLong("bid_ad_request_expire_time", 300000);
                eVar2.f7670c = optJSONObject.optBoolean("enable_upload_material", false);
                eVar2.f7671d = optJSONObject.optBoolean("send_bid_loss_ahead", false);
                eVar = eVar2;
            }
            aVar.f7549f = eVar;
            return aVar;
        } catch (Exception unused) {
            return null;
        }
    }

    private a(Context context) {
        this.f7540d = context;
    }

    private static boolean a(SharedPreferences sharedPreferences) {
        int i;
        try {
            i = sharedPreferences.getInt("version_code", 0);
        } catch (Exception unused) {
            i = 0;
        }
        if (i <= 0) {
            return true;
        }
        return false;
    }

    public static a a(Context context) {
        if (f7537e == null) {
            synchronized (a.class) {
                if (f7537e == null) {
                    f7537e = new a(context);
                }
            }
        }
        return f7537e;
    }
}
