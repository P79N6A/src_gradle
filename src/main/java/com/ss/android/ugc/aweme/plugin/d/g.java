package com.ss.android.ugc.aweme.plugin.d;

import android.content.Context;
import android.support.annotation.UiThread;
import android.text.TextUtils;
import com.bytedance.frameworks.plugin.core.d;
import com.bytedance.frameworks.plugin.pm.c;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.plugin.b.e;
import com.ss.android.ugc.aweme.plugin.b.f;
import com.ss.android.ugc.aweme.plugin.c.a;
import com.ss.android.ugc.aweme.plugin.c.b;
import com.ss.android.ugc.aweme.plugin.e.c;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class g implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59296a;
    private static volatile g k;

    /* renamed from: b  reason: collision with root package name */
    public Context f59297b;

    /* renamed from: c  reason: collision with root package name */
    public int f59298c;

    /* renamed from: d  reason: collision with root package name */
    public b f59299d;

    /* renamed from: e  reason: collision with root package name */
    private a f59300e;

    /* renamed from: f  reason: collision with root package name */
    private a f59301f;
    private com.ss.android.ugc.aweme.plugin.a.a g;
    private int h;
    private int i = 2;
    private b j;

    private JSONArray c() {
        if (PatchProxy.isSupport(new Object[0], this, f59296a, false, 64638, new Class[0], JSONArray.class)) {
            return (JSONArray) PatchProxy.accessDispatch(new Object[0], this, f59296a, false, 64638, new Class[0], JSONArray.class);
        }
        if (!c.b()) {
            c.c();
        }
        List<com.bytedance.frameworks.plugin.a.a> d2 = c.d();
        if (d2 == null || d2.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (com.bytedance.frameworks.plugin.a.a next : d2) {
            if (next != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.putOpt("packagename", next.f2145a);
                    jSONObject.putOpt("versioncode", Integer.valueOf(next.f2146b));
                    jSONArray.put(jSONObject);
                } catch (Exception unused) {
                }
            }
        }
        return jSONArray;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f59296a, false, 64635, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59296a, false, 64635, new Class[0], Void.TYPE);
        } else if (this.f59301f == null || !this.f59301f.a()) {
            this.f59301f = new b(this.f59297b, "https://security.snssdk.com/api/plugin/config/v1/", true, this);
            this.f59301f.a(c(), null);
        }
    }

    @UiThread
    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f59296a, false, 64633, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59296a, false, 64633, new Class[0], Void.TYPE);
        } else if (this.f59300e == null || !this.f59300e.a()) {
            this.f59298c = 1;
            this.f59300e = new b(this.f59297b, "https://security.snssdk.com/api/plugin/config/v1/", this);
            this.f59300e.a(c(), null);
        }
    }

    private g(Context context) {
        this.f59297b = context;
        if (PatchProxy.isSupport(new Object[0], this, f59296a, false, 64631, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f59296a, false, 64631, new Class[0], Void.TYPE);
            return;
        }
        this.g = f.a(this.f59297b);
        this.f59299d = new a(this.f59297b);
        this.j = new a(this.f59297b, true);
    }

    public static g a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f59296a, true, 64630, new Class[]{Context.class}, g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[]{context2}, null, f59296a, true, 64630, new Class[]{Context.class}, g.class);
        }
        if (k == null) {
            synchronized (g.class) {
                if (k == null) {
                    k = new g(context2);
                }
            }
        }
        return k;
    }

    public final void a(a aVar, a.C0665a aVar2) {
        int i2;
        final String str;
        String str2;
        String str3;
        g gVar = this;
        a.C0665a aVar3 = aVar2;
        int i3 = 0;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{aVar, aVar3}, this, f59296a, false, 64639, new Class[]{a.class, a.C0665a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, aVar3}, this, f59296a, false, 64639, new Class[]{a.class, a.C0665a.class}, Void.TYPE);
            return;
        }
        boolean equals = TextUtils.equals(aVar.b(), "https://security.snssdk.com/hotsoon/plugin/config/");
        if (equals) {
            gVar.h = 2;
            i2 = 0;
        } else if (aVar.c()) {
            i2 = gVar.j.a();
        } else {
            gVar.f59298c = 2;
            i2 = gVar.f59299d.a();
        }
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = new JSONObject();
        try {
            hashMap.put("is_success", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            hashMap.put("retry_count", String.valueOf(i2));
            if (aVar3 == null) {
                str3 = "data is null";
            } else if (aVar3.f59264a == null) {
                str3 = "pluginInfos is null";
            } else {
                str3 = aVar3.f59264a.toString();
            }
            hashMap.put(PushConstants.CONTENT, str3);
            jSONObject.put("is_success", 1);
            jSONObject.put("plugin_retry_count", i2);
            jSONObject.put("plugin_response_content", str3);
        } catch (Exception unused) {
        }
        r.a("plugin_response_json", (Map) hashMap);
        if (aVar.c()) {
            MonitorUtils.monitorStatusRate("plugin_api_response", 1, jSONObject);
        }
        if (aVar3 != null) {
            if (!equals && aVar3.f59265b != null && aVar3.f59265b.length() > 0) {
                com.ss.android.h.a.a.a(gVar.f59297b).a(aVar3.f59265b);
            }
            if (aVar3.f59264a == null || aVar3.f59264a.length() <= 0) {
                g gVar2 = gVar;
                return;
            }
            f a2 = f.a(gVar.f59297b);
            if (equals) {
                str = e.b();
            } else {
                str = e.a();
            }
            if (equals) {
                str2 = "preload";
            } else {
                str2 = e.c();
            }
            int i4 = 0;
            while (i4 < aVar3.f59264a.length()) {
                try {
                    JSONObject jSONObject2 = aVar3.f59264a.getJSONObject(i4);
                    if (jSONObject2 != null) {
                        final String optString = jSONObject2.optString("packagename");
                        if (jSONObject2.optBoolean("offline")) {
                            new Thread(new Runnable() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f59302a;

                                public final void run() {
                                    if (PatchProxy.isSupport(new Object[0], this, f59302a, false, 64641, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f59302a, false, 64641, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    com.ss.android.h.b.a(optString);
                                    try {
                                        File[] listFiles = new File(str).listFiles();
                                        if (!(listFiles == null || listFiles.length == 0)) {
                                            for (File file : listFiles) {
                                                if (file.getName().contains(optString)) {
                                                    file.delete();
                                                }
                                            }
                                        }
                                    } catch (Exception unused) {
                                    }
                                }
                            }).start();
                        } else {
                            int optInt = jSONObject2.optInt("versioncode");
                            int optInt2 = jSONObject2.optInt("clientversion_min", i3);
                            int optInt3 = jSONObject2.optInt("clientversion_max", Integer.MAX_VALUE);
                            String optString2 = jSONObject2.optString(PushConstants.WEB_URL);
                            String optString3 = jSONObject2.optString("md5");
                            boolean optBoolean = jSONObject2.optBoolean("wifionly", z);
                            JSONArray optJSONArray = jSONObject2.optJSONArray("backup_urls");
                            if (optJSONArray == null) {
                                optJSONArray = new JSONArray();
                            }
                            ArrayList arrayList = new ArrayList();
                            if (optJSONArray.length() > 0) {
                                for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                                    String optString4 = optJSONArray.optString(i5);
                                    if (!TextUtils.isEmpty(optString4)) {
                                        arrayList.add(optString4);
                                    }
                                }
                            }
                            d.a().a(optString, optInt, optInt2, optInt3);
                            c.a a3 = new c.a().a(optString).a(optInt);
                            a3.m = optInt2;
                            a3.n = optInt3;
                            c.a d2 = a3.b(optString2).c(optString3).a(optBoolean).d(str2);
                            d2.f59334e = arrayList;
                            c.a b2 = d2.b(equals);
                            b2.l = aVar.c();
                            a2.a(b2.a(), str);
                        }
                    }
                } catch (Exception unused2) {
                }
                i4++;
                gVar = this;
                aVar3 = aVar2;
                i3 = 0;
                z = true;
            }
            if (aVar.c()) {
                if (this.j != null) {
                    this.j.a(equals);
                }
            } else {
                if (this.f59299d != null) {
                    this.f59299d.a(equals);
                }
            }
        }
    }

    public final void a(a aVar, Exception exc) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{aVar, exc}, this, f59296a, false, 64640, new Class[]{a.class, Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, exc}, this, f59296a, false, 64640, new Class[]{a.class, Exception.class}, Void.TYPE);
            return;
        }
        boolean equals = TextUtils.equals(aVar.b(), "https://security.snssdk.com/hotsoon/plugin/config/");
        if (equals) {
            this.h = 3;
        } else if (!aVar.c()) {
            this.f59298c = 3;
        }
        String str = "";
        if (exc != null) {
            str = exc.getMessage();
        }
        if (!equals) {
            com.ss.android.h.a.a.a(this.f59297b).a((JSONArray) null);
        }
        if (aVar.c()) {
            if (this.j != null) {
                this.j.a(equals, exc);
            }
        } else if (this.f59299d != null) {
            this.f59299d.a(equals, exc);
        }
        if (aVar.c()) {
            i2 = this.j.a();
        } else {
            i2 = this.f59299d.a();
        }
        HashMap hashMap = new HashMap();
        JSONObject jSONObject = new JSONObject();
        try {
            hashMap.put("reason", str);
            hashMap.put("is_success", PushConstants.PUSH_TYPE_NOTIFY);
            hashMap.put("retry_count", String.valueOf(i2));
            jSONObject.put("reason", str);
            jSONObject.put("is_success", 0);
            jSONObject.put("retry_count", i2);
            jSONObject.put("load_patch_only", aVar.c());
        } catch (Exception unused) {
        }
        r.a("plugin_response_json", (Map) hashMap);
        if (aVar.c()) {
            MonitorUtils.monitorStatusRate("plugin_api_response", 0, jSONObject);
        }
    }
}
