package com.ss.android.sdk.c;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.f.a.e;
import com.bytedance.ies.f.a.f;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.AppContext;
import com.ss.android.download.api.b.a.b;
import com.ss.android.sdk.c.b.a;
import com.ss.android.sdk.c.b.c;
import com.ss.android.sdk.c.b.d;
import com.ss.android.sdk.c.h;
import com.ss.android.ugc.aweme.C0906R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class a implements WeakHandler.IHandler, f, a.C0370a, h.a {

    /* renamed from: a  reason: collision with root package name */
    protected b f30706a;

    /* renamed from: b  reason: collision with root package name */
    protected WeakReference<AlertDialog> f30707b;

    /* renamed from: c  reason: collision with root package name */
    protected Map<Long, C0369a> f30708c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    protected WeakReference<Context> f30709d;

    /* renamed from: e  reason: collision with root package name */
    protected List<String> f30710e;

    /* renamed from: f  reason: collision with root package name */
    protected e f30711f;
    protected List<String> g;
    protected long h = 0;
    protected String i = null;
    protected int j = 0;
    protected String k;
    protected String l;
    private AppContext m;
    private d n;
    private Handler o = new WeakHandler(this);
    private String p;
    private com.bytedance.ies.f.a.h q;
    private i r = null;
    private JSONArray s = new JSONArray();

    /* renamed from: com.ss.android.sdk.c.a$a  reason: collision with other inner class name */
    class C0369a implements b {

        /* renamed from: b  reason: collision with root package name */
        private int f30716b;

        public final void a(long j) {
        }

        C0369a() {
        }

        public final void a(com.ss.android.download.api.c.e eVar, int i, long j, long j2, long j3) {
            if (eVar != null && a.this.e() != null) {
                String a2 = com.ss.android.downloadlib.h.a((Context) a.this.e()).f29059c.a(eVar.f28491a);
                if (!StringUtils.isEmpty(a2)) {
                    String[] split = a2.split("##");
                    if (split == null || split.length <= 0) {
                        com.ss.android.downloadlib.h.a((Context) a.this.e()).f29059c.a(Long.valueOf(eVar.f28491a), this);
                        a.this.f30708c.remove(Long.valueOf(eVar.f28491a));
                        return;
                    }
                    boolean z = false;
                    String str = split[0];
                    if (i == 3 && eVar.f28492b == 8) {
                        a.this.b(str);
                        return;
                    }
                    if (j > 0) {
                        int i2 = (int) ((j2 * 100) / j);
                        if (i2 - this.f30716b >= 20 || (this.f30716b == 0 && i2 >= 3)) {
                            this.f30716b = i2;
                            z = true;
                        }
                        if (z) {
                            a.this.a(str, i2);
                        }
                    }
                }
            }
        }
    }

    public static String a() {
        return "bytedance";
    }

    /* access modifiers changed from: protected */
    public abstract void b(@NonNull b bVar);

    public final boolean a(com.bytedance.ies.f.a.h hVar) {
        return "call".equals(hVar.f20620a) && "config".equals(hVar.f20622c) && !StringUtils.isEmpty(hVar.f20621b);
    }

    public final void a(String str, JSONObject jSONObject) {
        if (this.f30706a != null) {
            com.bytedance.ies.f.a.a aVar = this.f30706a.f30719b;
            if (aVar != null) {
                aVar.b(str, jSONObject);
            }
        }
    }

    public final void a(String str, i iVar, String str2) {
        if (str != null && str.equals(this.p) && this.q != null) {
            WebView webView = this.f30706a != null ? this.f30706a.f30720c : null;
            String url = webView != null ? webView.getUrl() : null;
            if (!StringUtils.isEmpty(url) && e(url)) {
                try {
                    String host = Uri.parse(url).getHost();
                    if (host != null && host.equals(str2)) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", iVar != null ? 1 : 0);
                        List<String> list = iVar != null ? iVar.f30748e : null;
                        if (this.f30711f != null) {
                            this.f30711f.a(list, this.q, jSONObject);
                        }
                        this.r = iVar;
                        this.p = null;
                        this.q = null;
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void a(JSONObject jSONObject) throws Exception {
        jSONObject.put("cid", this.h);
        jSONObject.put("ad_type", this.j);
        jSONObject.put("log_extra", this.k);
        jSONObject.put("download_url", this.l);
        jSONObject.put("code", this.h == 0 ? 0 : 1);
    }

    public List<String> c() {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        return this.g;
    }

    public final void f() {
        AlertDialog alertDialog;
        if (this.f30707b != null) {
            alertDialog = (AlertDialog) this.f30707b.get();
        } else {
            alertDialog = null;
        }
        if (alertDialog != null && alertDialog.isShowing()) {
            alertDialog.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public final Activity e() {
        Context context;
        if (this.f30709d != null) {
            context = (Context) this.f30709d.get();
        } else {
            context = null;
        }
        if (context != null && (context instanceof Activity)) {
            return (Activity) context;
        }
        return null;
    }

    public final void h() {
        this.f30709d = null;
        if (this.f30706a != null) {
            com.bytedance.ies.f.a.a aVar = this.f30706a.f30719b;
            if (aVar != null) {
                aVar.a();
            }
            this.f30706a = null;
        }
        h a2 = h.a();
        if (a2.f30741d != null && !a2.f30741d.isEmpty()) {
            a2.f30741d.remove(this);
        }
        this.f30711f = null;
        d();
    }

    public List<String> b() {
        if (this.f30710e == null) {
            this.f30710e = new ArrayList();
        }
        this.f30710e.add("config");
        this.f30710e.add("appInfo");
        this.f30710e.add("login");
        this.f30710e.add("close");
        this.f30710e.add("gallery");
        this.f30710e.add("toggleGalleryBars");
        this.f30710e.add("slideShow");
        this.f30710e.add("relatedShow");
        this.f30710e.add("toast");
        this.f30710e.add("slideDownload");
        this.f30710e.add("requestChangeOrientation");
        this.f30710e.add("adInfo");
        return this.f30710e;
    }

    public final void d() {
        if (this.f30708c != null && e() != null && this.f30708c.size() > 0) {
            for (Map.Entry next : this.f30708c.entrySet()) {
                if (next != null) {
                    com.ss.android.downloadlib.h.a((Context) e()).f29059c.a((Long) next.getKey(), (b) next.getValue());
                }
            }
            this.f30708c.clear();
            this.f30708c = null;
        }
    }

    public final void g() {
        d dVar = this.n;
        if (!TextUtils.isEmpty(dVar.f30728b)) {
            int i2 = 1;
            if (!TextUtils.isEmpty(dVar.f30727a) ? !com.ss.android.sdk.c.a.b.a().isPlatformBinded(dVar.f30727a) : !com.ss.android.sdk.c.a.b.a().hasPlatformBinded() && !com.ss.android.sdk.c.a.b.a().isPlatformBinded(com.ss.android.sdk.c.a.b.a().getPlayNameMobile())) {
                i2 = 0;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", i2);
                if (dVar.f30729c != null) {
                    dVar.f30729c.a(dVar.f30728b, jSONObject);
                }
            } catch (Exception unused) {
            }
        }
        dVar.f30728b = null;
        dVar.f30727a = null;
    }

    public final void b(String str) {
        a("onGameComplete", str);
    }

    public final void d(String str) {
        if (str != null && str.startsWith("bytedance://")) {
            reportLocalEvent(str);
        }
    }

    private static boolean e(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    public boolean c(String str) {
        if (this.f30706a != null) {
            return this.f30706a.a(str);
        }
        return false;
    }

    @JavascriptInterface
    public boolean reportLocalEvent(String str) {
        if (this.m == null || StringUtils.isEmpty(str)) {
            return false;
        }
        boolean z = true;
        try {
            Uri parse = Uri.parse(str);
            if (!"log_event".equals(parse.getHost())) {
                return false;
            }
            try {
                Message obtainMessage = this.o.obtainMessage(1);
                obtainMessage.obj = parse;
                this.o.sendMessage(obtainMessage);
            } catch (Exception unused) {
            }
            return z;
        } catch (Exception unused2) {
            z = false;
        }
    }

    public final void a(b bVar) {
        this.f30706a = bVar;
        if (this.f30706a != null) {
            b bVar2 = this.f30706a;
            this.n = new d(bVar2.f30719b, e());
            bVar2.a("isAppInstalled", (com.bytedance.ies.f.a.d) new com.ss.android.sdk.c.b.b(this.f30709d)).a("open", (com.bytedance.ies.f.a.d) new com.ss.android.sdk.c.b.e(this.f30709d)).a("login", (com.bytedance.ies.f.a.d) this.n).a("copyToClipboard", (com.bytedance.ies.f.a.d) new c(e())).a("adInfo", (com.bytedance.ies.f.a.d) new com.ss.android.sdk.c.b.a(this)).a("openThirdApp", (com.bytedance.ies.f.a.d) new com.ss.android.sdk.c.b.f(e()));
            b(this.f30706a);
        }
    }

    public void handleMsg(Message message) {
        long j2;
        long j3;
        JSONObject jSONObject;
        if (message.what == 1) {
            try {
                if (message.obj instanceof Uri) {
                    Uri uri = (Uri) message.obj;
                    if ("log_event".equals(uri.getHost())) {
                        String queryParameter = uri.getQueryParameter("category");
                        String queryParameter2 = uri.getQueryParameter("tag");
                        String queryParameter3 = uri.getQueryParameter("label");
                        try {
                            j2 = Long.parseLong(uri.getQueryParameter("value"));
                        } catch (Exception unused) {
                            j2 = 0;
                        }
                        try {
                            j3 = Long.parseLong(uri.getQueryParameter("ext_value"));
                        } catch (Exception unused2) {
                            j3 = 0;
                        }
                        String queryParameter4 = uri.getQueryParameter(PushConstants.EXTRA);
                        if (!StringUtils.isEmpty(queryParameter4)) {
                            try {
                                jSONObject = new JSONObject(queryParameter4);
                            } catch (Exception unused3) {
                            }
                            com.ss.android.common.lib.a.a((Context) this.f30709d.get(), queryParameter, queryParameter2, queryParameter3, j2, j3, jSONObject);
                        }
                        jSONObject = null;
                        com.ss.android.common.lib.a.a((Context) this.f30709d.get(), queryParameter, queryParameter2, queryParameter3, j2, j3, jSONObject);
                    }
                }
            } catch (Exception unused4) {
            }
        }
    }

    public final void a(String str) {
        a("onGameStart", str);
    }

    private void a(String str, String... strArr) {
        if (this.f30706a != null) {
            this.f30706a.a(str, strArr);
        }
    }

    public final void a(Long l2, String str) {
        if (this.f30708c == null) {
            this.f30708c = new HashMap();
        }
        if (e() != null && l2 != null && !StringUtils.isEmpty(str)) {
            C0369a aVar = new C0369a();
            com.ss.android.downloadlib.h.a((Context) e()).f29059c.a(l2, aVar, str, 4, null);
            this.f30708c.put(l2, aVar);
        }
    }

    public a(Context context, AppContext appContext) {
        this.f30709d = new WeakReference<>(context);
        this.m = appContext;
        h a2 = h.a();
        if (a2.f30741d == null) {
            a2.f30741d = new ArrayList();
        }
        if (!a2.f30741d.contains(this)) {
            a2.f30741d.add(this);
        }
    }

    public final void a(String str, int i2) {
        a("onGameProgress", str, String.valueOf(i2));
    }

    public final void a(final String str, final GeolocationPermissions.Callback callback) {
        AlertDialog alertDialog;
        if (!StringUtils.isEmpty(str) && callback != null) {
            Activity e2 = e();
            if (e2 != null) {
                if (this.f30707b != null) {
                    alertDialog = (AlertDialog) this.f30707b.get();
                } else {
                    alertDialog = null;
                }
                if (alertDialog != null && alertDialog.isShowing()) {
                    alertDialog.dismiss();
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(e2);
                builder.setTitle((int) C0906R.string.aix);
                builder.setMessage((CharSequence) e2.getString(C0906R.string.aiw, new Object[]{str}));
                AnonymousClass1 r0 = new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (i == -2) {
                            callback.invoke(str, false, false);
                            dialogInterface.dismiss();
                            return;
                        }
                        if (i == -1) {
                            callback.invoke(str, true, true);
                            dialogInterface.dismiss();
                        }
                    }
                };
                builder.setNegativeButton((int) C0906R.string.aiv, (DialogInterface.OnClickListener) r0);
                builder.setPositiveButton((int) C0906R.string.aiu, (DialogInterface.OnClickListener) r0);
                builder.setCancelable(false);
                this.f30707b = new WeakReference<>(builder.show());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ec A[Catch:{ Exception -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f9 A[Catch:{ Exception -> 0x0102 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.ies.f.a.h r20, org.json.JSONObject r21, java.lang.String r22, com.bytedance.ies.f.a.e r23) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r23
            r0.f30711f = r3     // Catch:{ Exception -> 0x0102 }
            com.bytedance.ies.f.a.e r3 = r0.f30711f     // Catch:{ Exception -> 0x0102 }
            if (r3 == 0) goto L_0x0101
            org.json.JSONObject r3 = r1.f20623d     // Catch:{ Exception -> 0x0102 }
            r4 = 0
            r0.p = r4     // Catch:{ Exception -> 0x0102 }
            r0.q = r4     // Catch:{ Exception -> 0x0102 }
            if (r3 == 0) goto L_0x002d
            java.lang.String r5 = "client_id"
            boolean r5 = r3.has(r5)     // Catch:{ Exception -> 0x0102 }
            if (r5 == 0) goto L_0x0026
            java.lang.String r5 = "client_id"
            java.lang.String r3 = r3.optString(r5)     // Catch:{ Exception -> 0x0102 }
            goto L_0x002e
        L_0x0026:
            java.lang.String r5 = "clientID"
            java.lang.String r3 = r3.optString(r5)     // Catch:{ Exception -> 0x0102 }
            goto L_0x002e
        L_0x002d:
            r3 = r4
        L_0x002e:
            boolean r5 = com.bytedance.common.utility.StringUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0102 }
            r6 = 0
            if (r5 == 0) goto L_0x0041
            java.lang.String r3 = "code"
            r2.put(r3, r6)     // Catch:{ Exception -> 0x0102 }
            com.bytedance.ies.f.a.e r3 = r0.f30711f     // Catch:{ Exception -> 0x0102 }
            r3.a(r4, r1, r2)     // Catch:{ Exception -> 0x0102 }
            goto L_0x0102
        L_0x0041:
            boolean r5 = com.bytedance.common.utility.StringUtils.isEmpty(r22)     // Catch:{ Exception -> 0x0102 }
            if (r5 == 0) goto L_0x0053
            java.lang.String r3 = "code"
            r2.put(r3, r6)     // Catch:{ Exception -> 0x0102 }
            com.bytedance.ies.f.a.e r3 = r0.f30711f     // Catch:{ Exception -> 0x0102 }
            r3.a(r4, r1, r2)     // Catch:{ Exception -> 0x0102 }
            goto L_0x0102
        L_0x0053:
            android.net.Uri r5 = android.net.Uri.parse(r22)     // Catch:{ Exception -> 0x005f }
            java.lang.String r5 = r5.getHost()     // Catch:{ Exception -> 0x005f }
            r7 = r5
            r5 = r22
            goto L_0x0062
        L_0x005f:
            r5 = r22
            r7 = r4
        L_0x0062:
            boolean r8 = r0.c(r5)     // Catch:{ Exception -> 0x0102 }
            r9 = 1
            if (r8 == 0) goto L_0x0075
            java.lang.String r3 = "code"
            r2.put(r3, r9)     // Catch:{ Exception -> 0x0102 }
            com.bytedance.ies.f.a.e r3 = r0.f30711f     // Catch:{ Exception -> 0x0102 }
            r3.a(r4, r1, r2)     // Catch:{ Exception -> 0x0102 }
            goto L_0x0102
        L_0x0075:
            boolean r5 = e(r22)     // Catch:{ Exception -> 0x0102 }
            if (r5 == 0) goto L_0x0101
            java.lang.ref.WeakReference<android.content.Context> r5 = r0.f30709d     // Catch:{ Exception -> 0x0102 }
            if (r5 == 0) goto L_0x00d2
            java.lang.ref.WeakReference<android.content.Context> r5 = r0.f30709d     // Catch:{ Exception -> 0x0102 }
            java.lang.Object r5 = r5.get()     // Catch:{ Exception -> 0x0102 }
            android.content.Context r5 = (android.content.Context) r5     // Catch:{ Exception -> 0x0102 }
            if (r5 == 0) goto L_0x00d2
            com.ss.android.sdk.c.h r8 = com.ss.android.sdk.c.h.a()     // Catch:{ Exception -> 0x0102 }
            if (r5 == 0) goto L_0x00d2
            java.lang.String r10 = com.ss.android.sdk.c.i.a(r7, r3)     // Catch:{ Exception -> 0x0102 }
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch:{ Exception -> 0x0102 }
            if (r11 == 0) goto L_0x009d
            com.ss.android.sdk.c.i r5 = r8.f30739b     // Catch:{ Exception -> 0x0102 }
            r11 = r5
            goto L_0x00d3
        L_0x009d:
            com.bytedance.common.utility.collection.MaxSizeLinkedHashMap<java.lang.String, com.ss.android.sdk.c.i> r11 = r8.f30738a     // Catch:{ Exception -> 0x0102 }
            java.lang.Object r11 = r11.get(r10)     // Catch:{ Exception -> 0x0102 }
            com.ss.android.sdk.c.i r11 = (com.ss.android.sdk.c.i) r11     // Catch:{ Exception -> 0x0102 }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0102 }
            boolean r5 = com.ss.android.common.util.NetworkUtils.isNetworkAvailable(r5)     // Catch:{ Exception -> 0x0102 }
            if (r11 == 0) goto L_0x00cb
            long r14 = r11.f30747d     // Catch:{ Exception -> 0x0102 }
            r16 = 0
            long r14 = r12 - r14
            r16 = 600000(0x927c0, double:2.964394E-318)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 < 0) goto L_0x00d3
            if (r5 != 0) goto L_0x00cb
            long r14 = r11.f30747d     // Catch:{ Exception -> 0x0102 }
            r16 = 0
            long r12 = r12 - r14
            r14 = 1200000(0x124f80, double:5.92879E-318)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x00cb
            goto L_0x00d3
        L_0x00cb:
            if (r5 == 0) goto L_0x00d2
            com.ss.android.download.a.c<java.lang.String, java.lang.String, java.lang.String, java.lang.Void, com.ss.android.sdk.c.i> r5 = r8.f30740c     // Catch:{ Exception -> 0x0102 }
            r5.a(r10, r7, r3, r4)     // Catch:{ Exception -> 0x0102 }
        L_0x00d2:
            r11 = r4
        L_0x00d3:
            if (r11 != 0) goto L_0x00ea
            android.app.Activity r5 = r19.e()     // Catch:{ Exception -> 0x0102 }
            boolean r5 = com.ss.android.common.util.NetworkUtils.isNetworkAvailable(r5)     // Catch:{ Exception -> 0x0102 }
            if (r5 != 0) goto L_0x00ea
            java.lang.String r3 = "code"
            r2.put(r3, r6)     // Catch:{ Exception -> 0x0102 }
            com.bytedance.ies.f.a.e r3 = r0.f30711f     // Catch:{ Exception -> 0x0102 }
            r3.a(r4, r1, r2)     // Catch:{ Exception -> 0x0102 }
            goto L_0x0102
        L_0x00ea:
            if (r11 == 0) goto L_0x00f9
            java.lang.String r3 = "code"
            r2.put(r3, r9)     // Catch:{ Exception -> 0x0102 }
            com.bytedance.ies.f.a.e r3 = r0.f30711f     // Catch:{ Exception -> 0x0102 }
            java.util.List<java.lang.String> r4 = r11.f30748e     // Catch:{ Exception -> 0x0102 }
            r3.a(r4, r1, r2)     // Catch:{ Exception -> 0x0102 }
            goto L_0x0102
        L_0x00f9:
            java.lang.String r2 = com.ss.android.sdk.c.i.a(r7, r3)     // Catch:{ Exception -> 0x0102 }
            r0.p = r2     // Catch:{ Exception -> 0x0102 }
            r0.q = r1     // Catch:{ Exception -> 0x0102 }
        L_0x0101:
            return
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.sdk.c.a.a(com.bytedance.ies.f.a.h, org.json.JSONObject, java.lang.String, com.bytedance.ies.f.a.e):void");
    }

    public final void a(long j2, String str, int i2, String str2, String str3) {
        this.h = j2;
        this.i = str;
        this.j = i2;
        this.k = str2;
        this.l = str3;
    }
}
