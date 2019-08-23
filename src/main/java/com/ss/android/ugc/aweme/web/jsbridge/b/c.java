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
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.i;
import com.ss.android.http.a.a.b;
import com.ss.android.ugc.aweme.app.api.a;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.base.utils.j;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.CommonApi;
import com.ss.android.ugc.aweme.utils.cu;
import com.ss.android.ugc.aweme.web.jsbridge.b.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76732a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f76733b = "c";

    /* renamed from: c  reason: collision with root package name */
    public a f76734c;

    /* renamed from: d  reason: collision with root package name */
    public a.b f76735d;

    /* renamed from: e  reason: collision with root package name */
    public String f76736e;

    /* renamed from: f  reason: collision with root package name */
    public String f76737f;
    public String g;
    public JSONObject h;
    public JSONObject i;
    public Exception j = null;
    private h k;
    private JSONObject l;
    private Handler m;
    private CommonApi n = ((CommonApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(CommonApi.class));
    private List<Header> o;
    private String p;
    private Callable<JSONObject> q = new Callable<JSONObject>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76738a;

        public final /* synthetic */ Object call() throws Exception {
            if (!PatchProxy.isSupport(new Object[0], this, f76738a, false, 90067, new Class[0], JSONObject.class)) {
                return c.this.e();
            }
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f76738a, false, 90067, new Class[0], JSONObject.class);
        }
    };
    private Callable<JSONObject> r = new Callable<JSONObject>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76740a;

        public final /* synthetic */ Object call() throws Exception {
            if (!PatchProxy.isSupport(new Object[0], this, f76740a, false, 90068, new Class[0], JSONObject.class)) {
                return c.this.b();
            }
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f76740a, false, 90068, new Class[0], JSONObject.class);
        }
    };
    private Callable<JSONObject> s = new Callable<JSONObject>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76742a;

        public final /* synthetic */ Object call() throws Exception {
            if (!PatchProxy.isSupport(new Object[0], this, f76742a, false, 90069, new Class[0], JSONObject.class)) {
                return c.this.c();
            }
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f76742a, false, 90069, new Class[0], JSONObject.class);
        }
    };
    private Callable<JSONObject> t = new Callable<JSONObject>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76744a;

        public final /* synthetic */ Object call() throws Exception {
            if (!PatchProxy.isSupport(new Object[0], this, f76744a, false, 90070, new Class[0], JSONObject.class)) {
                return c.this.d();
            }
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f76744a, false, 90070, new Class[0], JSONObject.class);
        }
    };

    public final JSONObject c() {
        String a2;
        if (PatchProxy.isSupport(new Object[0], this, f76732a, false, 90058, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f76732a, false, 90058, new Class[0], JSONObject.class);
        } else if (this.f76736e == null || StringUtils.isEmpty(this.f76736e)) {
            return null;
        } else {
            this.f76737f = a(this.f76737f, this.h);
            try {
                if (this.p != null) {
                    a2 = cu.f75699b.a(this.f76737f, this.i, this.p, this.o);
                } else {
                    a2 = cu.f75699b.a(this.f76737f, this.i, "application/x-www-form-urlencoded", this.o);
                }
                String str = a2;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put("response", new JSONObject(str));
                jSONObject.put("_raw", str);
                return jSONObject;
            } catch (b e2) {
                this.j = e2;
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("code", 0);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("errCode", e2.getStatusCode());
                    jSONObject3.put("message", e2.getMessage());
                    jSONObject2.put("error", jSONObject3);
                } catch (JSONException unused) {
                }
                return jSONObject2;
            } catch (Exception e3) {
                this.j = e3;
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("code", 0);
                    jSONObject4.put("response", new JSONObject(""));
                    jSONObject4.put("_raw", "");
                } catch (JSONException unused2) {
                }
                return jSONObject4;
            }
        }
    }

    public final JSONObject e() {
        if (PatchProxy.isSupport(new Object[0], this, f76732a, false, 90061, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f76732a, false, 90061, new Class[0], JSONObject.class);
        } else if (this.f76736e == null || StringUtils.isEmpty(this.f76736e)) {
            return null;
        } else {
            this.f76737f = a(this.f76737f, this.h);
            try {
                ArrayList arrayList = new ArrayList();
                if (this.o != null) {
                    for (Header next : this.o) {
                        arrayList.add(new Header(next.getName(), next.getValue()));
                    }
                }
                String str = (String) this.n.doGet(this.f76737f, (Map<String, String>) null, (List<Header>) arrayList).execute().body();
                JSONObject jSONObject = new JSONObject(str);
                com.ss.android.ugc.aweme.app.api.a.a(jSONObject, str, this.f76737f);
                jSONObject.put("_raw", str);
                return jSONObject;
            } catch (b e2) {
                this.j = e2;
                JSONObject jSONObject2 = new JSONObject();
                a(jSONObject2, 0, e2.getStatusCode(), e2.getMessage(), "", "");
                return jSONObject2;
            } catch (com.ss.android.ugc.aweme.base.api.a.b.a e3) {
                this.j = e3;
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("_raw", e3.getResponse());
                } catch (JSONException unused) {
                }
                a(jSONObject3, 0, e3.getErrorCode(), e3.getErrorMsg(), e3.getPrompt(), "");
                return jSONObject3;
            } catch (Exception e4) {
                this.j = e4;
                JSONObject jSONObject4 = new JSONObject();
                a(jSONObject4, 0, -408, e4.getMessage(), "", "");
                return jSONObject4;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b4, code lost:
        r9 = r2;
        r2 = r1;
        r1 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d6, code lost:
        r10.j = r1;
        r2 = new org.json.JSONObject();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r2.put("code", 0);
        r0 = new org.json.JSONObject();
        r0.put("errCode", r1.getStatusCode());
        r0.put("message", r1.getMessage());
        r2.put("error", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d5 A[ExcHandler: b (r1v8 'e' com.ss.android.http.a.a.b A[CUSTOM_DECLARE]), Splitter:B:9:0x0042] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject b() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f76732a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<org.json.JSONObject> r7 = org.json.JSONObject.class
            r4 = 0
            r5 = 90057(0x15fc9, float:1.26197E-40)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f76732a
            r5 = 0
            r6 = 90057(0x15fc9, float:1.26197E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<org.json.JSONObject> r8 = org.json.JSONObject.class
            r3 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            return r0
        L_0x0028:
            java.lang.String r1 = r10.f76736e
            if (r1 == 0) goto L_0x00ff
            java.lang.String r1 = r10.f76736e
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0036
            goto L_0x00ff
        L_0x0036:
            java.lang.String r1 = r10.f76737f
            org.json.JSONObject r2 = r10.h
            java.lang.String r1 = r10.a(r1, r2)
            r10.f76737f = r1
            java.lang.String r1 = ""
            java.lang.String r2 = r10.p     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            r3 = 1
            if (r2 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.utils.cu r2 = com.ss.android.ugc.aweme.utils.cu.f75699b     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            java.lang.String r4 = r10.f76737f     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            org.json.JSONObject r5 = r10.i     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            java.lang.String r6 = r10.p     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            java.util.List<com.bytedance.retrofit2.client.Header> r7 = r10.o     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            java.lang.String r2 = r2.b(r4, r5, r6, r7)     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
        L_0x0055:
            r1 = r2
            goto L_0x0099
        L_0x0057:
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            r2.<init>()     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            org.json.JSONObject r4 = r10.i     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            if (r4 == 0) goto L_0x007e
            org.json.JSONObject r4 = r10.i     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            java.util.Iterator r4 = r4.keys()     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
        L_0x0066:
            boolean r5 = r4.hasNext()     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            if (r5 == 0) goto L_0x007e
            java.lang.Object r5 = r4.next()     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            org.json.JSONObject r6 = r10.i     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            java.lang.String r7 = ""
            java.lang.String r6 = r6.optString(r5, r7)     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            r2.put(r5, r6)     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            goto L_0x0066
        L_0x007e:
            com.ss.android.common.applog.NetUtil.putCommonParams(r2, r3)     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            com.ss.android.ugc.aweme.net.CommonApi r4 = r10.n     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            java.lang.String r5 = r10.f76737f     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            com.bytedance.retrofit2.Call r2 = r4.doPost(r5, r2)     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            com.bytedance.retrofit2.SsResponse r2 = r2.execute()     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            java.lang.Object r2 = r2.body()     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            java.lang.String r1 = r10.f76737f     // Catch:{ b -> 0x00d5, Exception -> 0x00b3 }
            com.ss.android.ugc.aweme.app.api.a.b(r2, r1)     // Catch:{ b -> 0x00d5, Exception -> 0x00b3 }
            goto L_0x0055
        L_0x0099:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            r2.<init>()     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            java.lang.String r4 = "code"
            r2.put(r4, r3)     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            java.lang.String r3 = "response"
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            r4.<init>(r1)     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            r2.put(r3, r4)     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            java.lang.String r3 = "_raw"
            r2.put(r3, r1)     // Catch:{ b -> 0x00d5, Exception -> 0x00b8 }
            return r2
        L_0x00b3:
            r1 = move-exception
            r9 = r2
            r2 = r1
            r1 = r9
            goto L_0x00b9
        L_0x00b8:
            r2 = move-exception
        L_0x00b9:
            r10.j = r2
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "code"
            r2.put(r3, r0)     // Catch:{ JSONException -> 0x00d4 }
            java.lang.String r0 = "response"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00d4 }
            r3.<init>(r1)     // Catch:{ JSONException -> 0x00d4 }
            r2.put(r0, r3)     // Catch:{ JSONException -> 0x00d4 }
            java.lang.String r0 = "_raw"
            r2.put(r0, r1)     // Catch:{ JSONException -> 0x00d4 }
        L_0x00d4:
            return r2
        L_0x00d5:
            r1 = move-exception
            r10.j = r1
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = "code"
            r2.put(r3, r0)     // Catch:{ JSONException -> 0x00fe }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00fe }
            r0.<init>()     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r3 = "errCode"
            int r4 = r1.getStatusCode()     // Catch:{ JSONException -> 0x00fe }
            r0.put(r3, r4)     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r3 = "message"
            java.lang.String r1 = r1.getMessage()     // Catch:{ JSONException -> 0x00fe }
            r0.put(r3, r1)     // Catch:{ JSONException -> 0x00fe }
            java.lang.String r1 = "error"
            r2.put(r1, r0)     // Catch:{ JSONException -> 0x00fe }
        L_0x00fe:
            return r2
        L_0x00ff:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.web.jsbridge.b.c.b():org.json.JSONObject");
    }

    public final JSONObject d() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f76732a, false, 90060, new Class[0], JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[0], this, f76732a, false, 90060, new Class[0], JSONObject.class);
        } else if (this.f76736e == null || StringUtils.isEmpty(this.f76736e)) {
            return null;
        } else {
            this.f76737f = a(this.f76737f, this.h);
            try {
                String str2 = this.f76737f;
                if (PatchProxy.isSupport(new Object[]{str2}, this, f76732a, false, 90059, new Class[]{String.class}, String.class)) {
                    str = (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f76732a, false, 90059, new Class[]{String.class}, String.class);
                } else if (NetworkUtils.isNetworkAvailable(k.a())) {
                    ArrayList arrayList = new ArrayList();
                    if (!j.a((Collection<T>) this.o)) {
                        for (Header next : this.o) {
                            arrayList.add(new Header(next.getName(), next.getValue()));
                        }
                    }
                    str = (String) com.ss.android.ugc.aweme.app.api.a.a((String) this.n.doDelete(str2, 0, arrayList).execute().body(), a.d.a(), null, str2);
                } else {
                    throw new IOException();
                }
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.put("_raw", str);
                return jSONObject;
            } catch (b e2) {
                this.j = e2;
                JSONObject jSONObject2 = new JSONObject();
                a(jSONObject2, 0, e2.getStatusCode(), e2.getMessage(), "", "");
                return jSONObject2;
            } catch (com.ss.android.ugc.aweme.base.api.a.b.a e3) {
                this.j = e3;
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("_raw", e3.getResponse());
                } catch (JSONException unused) {
                }
                a(jSONObject3, 0, e3.getErrorCode(), e3.getErrorMsg(), e3.getPrompt(), "");
                return jSONObject3;
            } catch (Exception e4) {
                this.j = e4;
                JSONObject jSONObject4 = new JSONObject();
                a(jSONObject4, 0, -408, e4.getMessage(), "", "");
                return jSONObject4;
            }
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f76732a, false, 90056, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76732a, false, 90056, new Class[0], Void.TYPE);
            return;
        }
        h hVar = this.k;
        JSONObject jSONObject = this.l;
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f76732a, false, 90062, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f76732a, false, 90062, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{hVar}, this, f76732a, false, 90063, new Class[]{h.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar}, this, f76732a, false, 90063, new Class[]{h.class}, Void.TYPE);
        } else {
            this.f76736e = hVar.f20621b;
            JSONObject jSONObject2 = hVar.f20623d;
            this.f76737f = jSONObject2.optString(PushConstants.WEB_URL, "");
            this.g = jSONObject2.optString(PushConstants.MZ_PUSH_MESSAGE_METHOD, "get");
            this.h = jSONObject2.optJSONObject("params");
            this.i = jSONObject2.optJSONObject("data");
            JSONObject optJSONObject = jSONObject2.optJSONObject("header");
            if (optJSONObject != null) {
                this.o = new ArrayList();
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    String optString = optJSONObject.optString(next);
                    if (!TextUtils.isEmpty(optString)) {
                        this.o.add(new Header(next, optString));
                        if ("content-type".equalsIgnoreCase(next)) {
                            this.p = optString;
                        }
                    }
                }
            }
        }
        if ("get".equalsIgnoreCase(this.g)) {
            m.a().a(this.m, this.q, 25);
        } else if ("post".equalsIgnoreCase(this.g)) {
            m.a().a(this.m, this.r, 32);
        } else if ("put".equalsIgnoreCase(this.g)) {
            m.a().a(this.m, this.s, 33);
        } else {
            if ("delete".equalsIgnoreCase(this.g)) {
                m.a().a(this.m, this.t, 34);
            }
        }
    }

    public final String a(String str, JSONObject jSONObject) {
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject2}, this, f76732a, false, 90064, new Class[]{String.class, JSONObject.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, jSONObject2}, this, f76732a, false, 90064, new Class[]{String.class, JSONObject.class}, String.class);
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

    public c(h hVar, JSONObject jSONObject, com.bytedance.ies.f.a.a aVar, a.b bVar) {
        this.k = hVar;
        this.l = jSONObject;
        this.f76734c = aVar;
        this.f76735d = bVar;
        this.m = new Handler(Looper.getMainLooper(), new Handler.Callback() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f76746a;

            public final boolean handleMessage(Message message) {
                if (PatchProxy.isSupport(new Object[]{message}, this, f76746a, false, 90071, new Class[]{Message.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{message}, this, f76746a, false, 90071, new Class[]{Message.class}, Boolean.TYPE)).booleanValue();
                }
                if (message.what == 25 || message.what == 32 || message.what == 33 || message.what == 34) {
                    if (message.obj == null) {
                        return true;
                    }
                    try {
                        JSONObject jSONObject = (JSONObject) message.obj;
                        if (c.this.f76735d != null) {
                            a.C0802a aVar = new a.C0802a(c.this.g, c.this.a(c.this.f76737f, c.this.h), c.this.i);
                            JSONObject jSONObject2 = null;
                            if (jSONObject != null && jSONObject.has("response")) {
                                jSONObject2 = jSONObject.optJSONObject("response");
                            }
                            c.this.f76735d.a(aVar, new a.c(jSONObject2, c.this.j));
                        }
                        if (c.this.f76734c != null) {
                            c.this.f76734c.a(c.this.f76736e, jSONObject);
                        }
                    } catch (Exception unused) {
                    }
                }
                return false;
            }
        });
    }

    private void a(JSONObject jSONObject, int i2, String str, String str2, String str3) {
        JSONObject jSONObject2 = jSONObject;
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{jSONObject2, Integer.valueOf(i2), str4, str5, str3}, this, f76732a, false, 90066, new Class[]{JSONObject.class, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {jSONObject2, Integer.valueOf(i2), str4, str5, str3};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f76732a, false, 90066, new Class[]{JSONObject.class, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE);
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
        if (PatchProxy.isSupport(new Object[]{jSONObject2, 0, Integer.valueOf(i3), str, str2, str3}, this, f76732a, false, 90065, new Class[]{JSONObject.class, Integer.TYPE, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE)) {
            Object[] objArr = {jSONObject2, 0, Integer.valueOf(i3), str, str2, str3};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f76732a, false, 90065, new Class[]{JSONObject.class, Integer.TYPE, Integer.TYPE, String.class, String.class, String.class}, Void.TYPE);
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
