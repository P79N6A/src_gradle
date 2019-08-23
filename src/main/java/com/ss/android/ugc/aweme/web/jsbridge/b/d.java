package com.ss.android.ugc.aweme.web.jsbridge.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.f.a.a;
import com.bytedance.ies.f.a.h;
import com.bytedance.retrofit2.client.Header;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.NetUtil;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.i;
import com.ss.android.http.a.a.b;
import com.ss.android.ugc.aweme.app.api.a;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.CommonApi;
import com.ss.android.ugc.aweme.utils.cu;
import com.ss.android.ugc.aweme.web.jsbridge.b.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public class d implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76748a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f76749b = "d";

    /* renamed from: c  reason: collision with root package name */
    private h f76750c;

    /* renamed from: d  reason: collision with root package name */
    private JSONObject f76751d;

    /* renamed from: e  reason: collision with root package name */
    private Handler f76752e;

    /* renamed from: f  reason: collision with root package name */
    private a f76753f;
    private a.b g;
    private String h;
    private String i;
    private String j;
    private JSONObject k;
    private JSONObject l;
    private List<Header> m;
    private String n;
    private Exception o;
    private Callable<JSONObject> p = new e(this);
    private Callable<JSONObject> q = new f(this);
    private Callable<JSONObject> r = new g(this);
    private Callable<JSONObject> s = new h(this);
    private CommonApi t = ((CommonApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(CommonApi.class));

    /* access modifiers changed from: package-private */
    public JSONObject b() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f76748a, false, 90073, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f76748a, false, 90073, new Class[0], JSONObject.class);
        } else if (this.h == null || StringUtils.isEmpty(this.h)) {
            return null;
        } else {
            this.i = a(this.i, this.k);
            String str2 = "";
            try {
                if (this.n != null) {
                    str = cu.f75699b.b(this.i, this.l, this.n, this.m);
                } else {
                    HashMap hashMap = new HashMap();
                    if (this.l != null) {
                        Iterator<String> keys = this.l.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            hashMap.put(next, this.l.optString(next, ""));
                        }
                    }
                    NetUtil.putCommonParams(hashMap, true);
                    str = (String) this.t.doPost(this.i, 0, (Map<String, String>) hashMap).execute().body();
                    try {
                        com.ss.android.ugc.aweme.app.api.a.b(str, this.i);
                    } catch (Exception e2) {
                        String str3 = str;
                        e = e2;
                        str2 = str3;
                    }
                }
                str2 = str;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put("response", new JSONObject(str2));
                jSONObject.put("_raw", str2);
                return jSONObject;
            } catch (Exception e3) {
                e = e3;
                this.o = e;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("code", 0);
                    jSONObject2.put("response", new JSONObject(str2));
                    jSONObject2.put("_raw", str2);
                } catch (JSONException unused) {
                }
                return jSONObject2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public JSONObject c() {
        String a2;
        if (PatchProxy.isSupport(new Object[0], this, f76748a, false, 90074, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f76748a, false, 90074, new Class[0], JSONObject.class);
        } else if (this.h == null || StringUtils.isEmpty(this.h)) {
            return null;
        } else {
            this.i = a(this.i, this.k);
            try {
                if (this.n != null) {
                    a2 = cu.f75699b.a(this.i, this.l, this.n, this.m);
                } else {
                    a2 = cu.f75699b.a(this.i, this.l, "application/x-www-form-urlencoded", this.m);
                }
                String str = a2;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put("response", new JSONObject(str));
                jSONObject.put("_raw", str);
                return jSONObject;
            } catch (Exception e2) {
                this.o = e2;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("code", 0);
                    jSONObject2.put("response", new JSONObject(""));
                    jSONObject2.put("_raw", "");
                } catch (JSONException unused) {
                }
                return jSONObject2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public JSONObject e() {
        if (PatchProxy.isSupport(new Object[0], this, f76748a, false, 90077, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f76748a, false, 90077, new Class[0], JSONObject.class);
        } else if (this.h == null || StringUtils.isEmpty(this.h)) {
            return null;
        } else {
            this.i = a(this.i, this.k);
            try {
                String str = (String) this.t.doGet(this.i, (Map<String, String>) null, this.m).execute().body();
                JSONObject jSONObject = new JSONObject(str);
                com.ss.android.ugc.aweme.app.api.a.a(jSONObject, str, this.i);
                jSONObject.put("_raw", str);
                jSONObject.put("code", 1);
                jSONObject.put("response", new JSONObject(str));
                return jSONObject;
            } catch (b e2) {
                this.o = e2;
                JSONObject jSONObject2 = new JSONObject();
                a(jSONObject2, 0, e2.getStatusCode(), e2.getMessage(), "", "");
                return jSONObject2;
            } catch (com.ss.android.ugc.aweme.base.api.a.b.a e3) {
                this.o = e3;
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("_raw", e3.getResponse());
                } catch (JSONException unused) {
                }
                a(jSONObject3, 0, e3.getErrorCode(), e3.getErrorMsg(), e3.getPrompt(), "");
                return jSONObject3;
            } catch (Exception e4) {
                this.o = e4;
                JSONObject jSONObject4 = new JSONObject();
                a(jSONObject4, 0, -408, e4.getMessage(), "", "");
                return jSONObject4;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public JSONObject d() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f76748a, false, 90076, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f76748a, false, 90076, new Class[0], JSONObject.class);
        } else if (this.h == null || StringUtils.isEmpty(this.h)) {
            return null;
        } else {
            this.i = a(this.i, this.k);
            try {
                String str2 = this.i;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f76748a, false, 90075, new Class[]{String.class}, String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f76748a, false, 90075, new Class[]{String.class}, String.class);
                } else if (NetworkUtils.isNetworkAvailable(k.a())) {
                    str = (String) com.ss.android.ugc.aweme.app.api.a.a((String) this.t.doDelete(str2, this.m).execute().body(), a.d.a(), null, str2);
                } else {
                    throw new IOException();
                }
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.put("_raw", str);
                jSONObject.put("code", 1);
                jSONObject.put("response", new JSONObject(str));
                return jSONObject;
            } catch (b e2) {
                this.o = e2;
                JSONObject jSONObject2 = new JSONObject();
                a(jSONObject2, 0, e2.getStatusCode(), e2.getMessage(), "", "");
                return jSONObject2;
            } catch (com.ss.android.ugc.aweme.base.api.a.b.a e3) {
                this.o = e3;
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("_raw", e3.getResponse());
                } catch (JSONException unused) {
                }
                a(jSONObject3, 0, e3.getErrorCode(), e3.getErrorMsg(), e3.getPrompt(), "");
                return jSONObject3;
            } catch (Exception e4) {
                this.o = e4;
                JSONObject jSONObject4 = new JSONObject();
                a(jSONObject4, 0, -408, e4.getMessage(), "", "");
                return jSONObject4;
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f76748a, false, 90072, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76748a, false, 90072, new Class[0], Void.TYPE);
            return;
        }
        h hVar = this.f76750c;
        JSONObject jSONObject = this.f76751d;
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f76748a, false, 90078, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f76748a, false, 90078, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f76748a, false, 90079, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f76748a, false, 90079, new Class[]{h.class}, Void.TYPE);
        } else {
            this.h = hVar.f20621b;
            JSONObject jSONObject2 = hVar.f20623d;
            this.i = jSONObject2.optString(PushConstants.WEB_URL, "");
            this.j = jSONObject2.optString(PushConstants.MZ_PUSH_MESSAGE_METHOD, "get");
            this.k = jSONObject2.optJSONObject("params");
            this.l = jSONObject2.optJSONObject("data");
            JSONObject optJSONObject = jSONObject2.optJSONObject("header");
            if (optJSONObject != null) {
                this.m = new ArrayList();
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = optJSONObject.optString(next);
                    if (!TextUtils.isEmpty(optString)) {
                        this.m.add(new Header(next, optString));
                        if ("content-type".equalsIgnoreCase(next)) {
                            this.n = optString;
                        }
                    }
                }
            }
        }
        if ("get".equalsIgnoreCase(this.j)) {
            m.a().a(this.f76752e, this.p, 25);
        } else if ("post".equalsIgnoreCase(this.j)) {
            m.a().a(this.f76752e, this.q, 32);
        } else if ("put".equalsIgnoreCase(this.j)) {
            m.a().a(this.f76752e, this.r, 33);
        } else {
            if ("delete".equalsIgnoreCase(this.j)) {
                m.a().a(this.f76752e, this.s, 34);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean a(Message message) {
        if (message.what == 25 || message.what == 32 || message.what == 33 || message.what == 34) {
            if (message.obj == null) {
                return true;
            }
            try {
                JSONObject jSONObject = (JSONObject) message.obj;
                if (this.g != null) {
                    a.C0802a aVar = new a.C0802a(this.j, a(this.i, this.k), this.l);
                    JSONObject jSONObject2 = null;
                    if (jSONObject != null && jSONObject.has("response")) {
                        jSONObject2 = jSONObject.optJSONObject("response");
                    }
                    this.g.a(aVar, new a.c(jSONObject2, this.o));
                }
                if (this.f76753f != null) {
                    this.f76753f.a(this.h, jSONObject);
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private String a(String str, JSONObject jSONObject) {
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject2}, this, f76748a, false, 90080, new Class[]{String.class, JSONObject.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, jSONObject2}, this, f76748a, false, 90080, new Class[]{String.class, JSONObject.class}, String.class);
        } else if (jSONObject2 == null) {
            return str2;
        } else {
            i iVar = new i(str2);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                iVar.a(next, jSONObject2.optString(next, ""));
            }
            return iVar.a();
        }
    }

    public d(h hVar, JSONObject jSONObject, com.bytedance.ies.f.a.a aVar, a.b bVar) {
        this.f76750c = hVar;
        this.f76751d = jSONObject;
        this.f76753f = aVar;
        this.g = bVar;
        this.f76752e = new Handler(Looper.getMainLooper(), new i(this));
    }

    private void a(JSONObject jSONObject, int i2, String str, String str2, String str3) {
        JSONObject jSONObject2 = jSONObject;
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, Integer.valueOf(i2), str4, str5, str3}, this, f76748a, false, 90082, new Class[]{JSONObject.class, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {jSONObject2, Integer.valueOf(i2), str4, str5, str3};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f76748a, false, 90082, new Class[]{JSONObject.class, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        try {
            jSONObject2.put("errCode", i2);
            jSONObject2.put("message", str4);
            jSONObject2.put("prompts", str5);
        } catch (JSONException unused) {
        }
    }

    private void a(JSONObject jSONObject, int i2, int i3, String str, String str2, String str3) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, 0, Integer.valueOf(i3), str, str2, str3}, this, f76748a, false, 90081, new Class[]{JSONObject.class, Integer.TYPE, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {jSONObject2, 0, Integer.valueOf(i3), str, str2, str3};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f76748a, false, 90081, new Class[]{JSONObject.class, Integer.TYPE, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        try {
            jSONObject2.put("code", 0);
            JSONObject jSONObject3 = new JSONObject();
            a(jSONObject3, i3, str, str2, str3);
            jSONObject2.put("response", jSONObject3);
        } catch (JSONException unused) {
        }
    }
}
