package com.ss.android.ugc.aweme.plugin.c;

import android.content.Context;
import android.os.Message;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.frameworks.baselib.network.dispatcher.ApiThread;
import com.bytedance.frameworks.baselib.network.dispatcher.IRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.plugin.c.a;
import org.json.JSONArray;

public final class b implements WeakHandler.IHandler, a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59266a;

    /* renamed from: b  reason: collision with root package name */
    public JSONArray f59267b;

    /* renamed from: c  reason: collision with root package name */
    public Context f59268c;

    /* renamed from: d  reason: collision with root package name */
    public WeakHandler f59269d;

    /* renamed from: e  reason: collision with root package name */
    public String f59270e;

    /* renamed from: f  reason: collision with root package name */
    private a.b f59271f;
    private boolean g;
    private boolean h;

    class a extends ApiThread {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f59272a;

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0113, code lost:
            if (r11.f59273b.f59269d == null) goto L_0x0127;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0115, code lost:
            r0 = r11.f59273b.f59269d.obtainMessage(-1);
            r0.obj = r1;
            r11.f59273b.f59269d.sendMessage(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x0127, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r11 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f59272a
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 64612(0xfc64, float:9.054E-41)
                r2 = r11
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0025
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f59272a
                r5 = 0
                r6 = 64612(0xfc64, float:9.054E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r11
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0025:
                r1 = 0
            L_0x0026:
                r2 = 3
                if (r0 >= r2) goto L_0x010f
                com.ss.android.ugc.aweme.plugin.c.b r1 = com.ss.android.ugc.aweme.plugin.c.b.this
                android.content.Context r1 = r1.f59268c
                boolean r1 = com.bytedance.common.utility.NetworkUtils.isNetworkAvailable(r1)
                if (r1 != 0) goto L_0x003c
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "no_network: "
                r1.<init>(r0)
                goto L_0x010f
            L_0x003c:
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Throwable -> 0x010a }
                r1.<init>()     // Catch:{ Throwable -> 0x010a }
                java.lang.String r2 = "plugin"
                com.ss.android.ugc.aweme.plugin.c.b r3 = com.ss.android.ugc.aweme.plugin.c.b.this     // Catch:{ Throwable -> 0x010a }
                org.json.JSONArray r3 = r3.f59267b     // Catch:{ Throwable -> 0x010a }
                r1.put(r2, r3)     // Catch:{ Throwable -> 0x010a }
                java.lang.String r2 = "patch"
                org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Throwable -> 0x010a }
                r3.<init>()     // Catch:{ Throwable -> 0x010a }
                r1.put(r2, r3)     // Catch:{ Throwable -> 0x010a }
                java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Throwable -> 0x010a }
                r2.<init>()     // Catch:{ Throwable -> 0x010a }
                java.lang.String r3 = "retry_count"
                java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x006b }
                r2.put(r3, r4)     // Catch:{ Exception -> 0x006b }
                java.lang.String r3 = "content"
                java.lang.String r4 = r1.toString()     // Catch:{ Exception -> 0x006b }
                r2.put(r3, r4)     // Catch:{ Exception -> 0x006b }
            L_0x006b:
                java.lang.String r3 = "plugin_upload_json"
                com.ss.android.ugc.aweme.common.r.a((java.lang.String) r3, (java.util.Map) r2)     // Catch:{ Throwable -> 0x010a }
                com.ss.android.h.e r2 = com.ss.android.h.e.a()     // Catch:{ Throwable -> 0x010a }
                com.ss.android.ugc.aweme.plugin.c.b r3 = com.ss.android.ugc.aweme.plugin.c.b.this     // Catch:{ Throwable -> 0x010a }
                java.lang.String r3 = r3.f59270e     // Catch:{ Throwable -> 0x010a }
                r4 = 1
                java.lang.String r7 = r2.a(r3, r4)     // Catch:{ Throwable -> 0x010a }
                com.ss.android.h.e r5 = com.ss.android.h.e.a()     // Catch:{ Throwable -> 0x010a }
                r6 = 33554432(0x2000000, float:9.403955E-38)
                java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x010a }
                byte[] r8 = r1.getBytes()     // Catch:{ Throwable -> 0x010a }
                com.bytedance.common.utility.NetworkUtils$CompressType r9 = com.bytedance.common.utility.NetworkUtils.CompressType.GZIP     // Catch:{ Throwable -> 0x010a }
                java.lang.String r10 = "application/json; charset=utf-8"
                java.lang.String r1 = r5.a(r6, r7, r8, r9, r10)     // Catch:{ Throwable -> 0x010a }
                boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x010a }
                if (r2 == 0) goto L_0x00a1
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Throwable -> 0x010a }
                java.lang.String r2 = "response_empty: "
                r1.<init>(r2)     // Catch:{ Throwable -> 0x010a }
                goto L_0x010b
            L_0x00a1:
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x010a }
                r2.<init>(r1)     // Catch:{ Throwable -> 0x010a }
                java.lang.String r3 = "status_code"
                boolean r3 = r2.has(r3)     // Catch:{ Throwable -> 0x010a }
                if (r3 == 0) goto L_0x00b6
                java.lang.String r3 = "status_code"
                int r3 = r2.getInt(r3)     // Catch:{ Throwable -> 0x010a }
                if (r3 == 0) goto L_0x00d5
            L_0x00b6:
                com.ss.android.h.e r3 = com.ss.android.h.e.a()     // Catch:{ Throwable -> 0x010a }
                boolean r3 = r3.a(r2)     // Catch:{ Throwable -> 0x010a }
                if (r3 != 0) goto L_0x00d5
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ Throwable -> 0x010a }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x010a }
                java.lang.String r4 = "response_error: + "
                r3.<init>(r4)     // Catch:{ Throwable -> 0x010a }
                r3.append(r1)     // Catch:{ Throwable -> 0x010a }
                java.lang.String r1 = r3.toString()     // Catch:{ Throwable -> 0x010a }
                r2.<init>(r1)     // Catch:{ Throwable -> 0x010a }
                r1 = r2
                goto L_0x010b
            L_0x00d5:
                java.lang.String r1 = "data"
                org.json.JSONObject r1 = r2.getJSONObject(r1)     // Catch:{ Throwable -> 0x010a }
                com.ss.android.ugc.aweme.plugin.c.a$a r2 = new com.ss.android.ugc.aweme.plugin.c.a$a     // Catch:{ Throwable -> 0x010a }
                r2.<init>()     // Catch:{ Throwable -> 0x010a }
                java.lang.String r3 = "patch"
                org.json.JSONArray r3 = r1.optJSONArray(r3)     // Catch:{ Throwable -> 0x010a }
                r2.f59265b = r3     // Catch:{ Throwable -> 0x010a }
                java.lang.String r3 = "plugin"
                org.json.JSONArray r1 = r1.optJSONArray(r3)     // Catch:{ Throwable -> 0x010a }
                r2.f59264a = r1     // Catch:{ Throwable -> 0x010a }
                com.ss.android.ugc.aweme.plugin.c.b r1 = com.ss.android.ugc.aweme.plugin.c.b.this     // Catch:{ Throwable -> 0x010a }
                com.bytedance.common.utility.collection.WeakHandler r1 = r1.f59269d     // Catch:{ Throwable -> 0x010a }
                if (r1 == 0) goto L_0x0109
                com.ss.android.ugc.aweme.plugin.c.b r1 = com.ss.android.ugc.aweme.plugin.c.b.this     // Catch:{ Throwable -> 0x010a }
                com.bytedance.common.utility.collection.WeakHandler r1 = r1.f59269d     // Catch:{ Throwable -> 0x010a }
                r3 = 1000(0x3e8, float:1.401E-42)
                android.os.Message r1 = r1.obtainMessage(r3)     // Catch:{ Throwable -> 0x010a }
                r1.obj = r2     // Catch:{ Throwable -> 0x010a }
                com.ss.android.ugc.aweme.plugin.c.b r2 = com.ss.android.ugc.aweme.plugin.c.b.this     // Catch:{ Throwable -> 0x010a }
                com.bytedance.common.utility.collection.WeakHandler r2 = r2.f59269d     // Catch:{ Throwable -> 0x010a }
                r2.sendMessage(r1)     // Catch:{ Throwable -> 0x010a }
            L_0x0109:
                return
            L_0x010a:
                r1 = move-exception
            L_0x010b:
                int r0 = r0 + 1
                goto L_0x0026
            L_0x010f:
                com.ss.android.ugc.aweme.plugin.c.b r0 = com.ss.android.ugc.aweme.plugin.c.b.this
                com.bytedance.common.utility.collection.WeakHandler r0 = r0.f59269d
                if (r0 == 0) goto L_0x0127
                com.ss.android.ugc.aweme.plugin.c.b r0 = com.ss.android.ugc.aweme.plugin.c.b.this
                com.bytedance.common.utility.collection.WeakHandler r0 = r0.f59269d
                r2 = -1
                android.os.Message r0 = r0.obtainMessage(r2)
                r0.obj = r1
                com.ss.android.ugc.aweme.plugin.c.b r1 = com.ss.android.ugc.aweme.plugin.c.b.this
                com.bytedance.common.utility.collection.WeakHandler r1 = r1.f59269d
                r1.sendMessage(r0)
            L_0x0127:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.plugin.c.b.a.run():void");
        }

        public a() {
            super("PluginPreloader", IRequest.Priority.NORMAL);
        }
    }

    public final boolean a() {
        return this.g;
    }

    public final String b() {
        return this.f59270e;
    }

    public final boolean c() {
        return this.h;
    }

    public final void handleMsg(Message message) {
        if (PatchProxy.isSupport(new Object[]{message}, this, f59266a, false, 64611, new Class[]{Message.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{message}, this, f59266a, false, 64611, new Class[]{Message.class}, Void.TYPE);
            return;
        }
        int i = message.what;
        if (i == -1) {
            this.g = false;
            if (this.f59271f != null) {
                this.f59271f.a((a) this, (Exception) message.obj);
            }
        } else if (i == 1000) {
            this.g = false;
            a.C0665a aVar = (a.C0665a) message.obj;
            if (this.f59271f != null) {
                this.f59271f.a((a) this, aVar);
            }
        }
    }

    public final void a(JSONArray jSONArray, JSONArray jSONArray2) {
        JSONArray jSONArray3;
        if (PatchProxy.isSupport(new Object[]{jSONArray, jSONArray2}, this, f59266a, false, 64610, new Class[]{JSONArray.class, JSONArray.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONArray, jSONArray2}, this, f59266a, false, 64610, new Class[]{JSONArray.class, JSONArray.class}, Void.TYPE);
        } else if (NetworkUtils.isNetworkAvailable(this.f59268c) && !this.g) {
            if (jSONArray == null) {
                jSONArray3 = new JSONArray();
            } else {
                jSONArray3 = jSONArray;
            }
            this.f59267b = jSONArray3;
            new a().start();
            this.g = true;
        }
    }

    public b(Context context, String str, a.b bVar) {
        this(context, str, false, bVar);
    }

    public b(Context context, String str, boolean z, a.b bVar) {
        this.f59271f = bVar;
        this.f59268c = context;
        this.f59270e = str;
        this.h = z;
        this.f59269d = new WeakHandler(this);
    }
}
