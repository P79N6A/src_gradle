package com.ss.android.ugc.aweme.plugin.b;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.frameworks.baselib.network.http.util.UrlUtils;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.plugin.e.c;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59229a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.plugin.e.a f59230b;

    /* renamed from: c  reason: collision with root package name */
    public volatile long f59231c = -1;

    /* renamed from: d  reason: collision with root package name */
    public volatile long f59232d = -1;

    /* renamed from: e  reason: collision with root package name */
    public volatile int f59233e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f59234f;
    private a g;
    private i h;
    private Context i;
    private File j;
    private long k;

    public interface a {
        void a(d dVar, com.ss.android.ugc.aweme.plugin.e.a aVar, int i);

        void a(d dVar, com.ss.android.ugc.aweme.plugin.e.a aVar, Exception exc);

        boolean a(d dVar, com.ss.android.ugc.aweme.plugin.e.a aVar);

        void b(d dVar, com.ss.android.ugc.aweme.plugin.e.a aVar);

        void c(d dVar, com.ss.android.ugc.aweme.plugin.e.a aVar);

        void d(d dVar, com.ss.android.ugc.aweme.plugin.e.a aVar);

        void e(d dVar, com.ss.android.ugc.aweme.plugin.e.a aVar);

        void f(d dVar, com.ss.android.ugc.aweme.plugin.e.a aVar);
    }

    private boolean a() {
        if (this.f59233e == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:56|57|58|59|60|61|62|63) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x01c2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r13 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f59229a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 64555(0xfc2b, float:9.0461E-41)
            r2 = r13
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f59229a
            r5 = 0
            r6 = 64555(0xfc2b, float:9.0461E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r13
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            com.ss.android.ugc.aweme.plugin.e.a r1 = r13.f59230b
            r2 = 1
            if (r1 == 0) goto L_0x0289
            com.ss.android.ugc.aweme.plugin.e.a r1 = r13.f59230b
            java.lang.String r1 = r1.a()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0289
            com.ss.android.ugc.aweme.plugin.e.a r1 = r13.f59230b
            java.lang.String r1 = r1.f59308c
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0042
            goto L_0x0289
        L_0x0042:
            com.ss.android.ugc.aweme.plugin.b.d$a r1 = r13.g
            com.ss.android.ugc.aweme.plugin.e.a r3 = r13.f59230b
            boolean r1 = r1.a(r13, r3)
            if (r1 != 0) goto L_0x004f
            r13.f59234f = r2
            return
        L_0x004f:
            com.ss.android.ugc.aweme.plugin.e.a r1 = r13.f59230b
            boolean r1 = r1.f59309d
            if (r1 == 0) goto L_0x00a5
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = f59229a
            r6 = 0
            r7 = 64558(0xfc2e, float:9.0465E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = r13
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r1 == 0) goto L_0x0080
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = f59229a
            r6 = 0
            r7 = 64558(0xfc2e, float:9.0465E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r4 = r13
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x0099
        L_0x0080:
            android.content.Context r1 = r13.i
            java.lang.String r3 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r3)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
            if (r1 == 0) goto L_0x0098
            int r1 = r1.getType()
            if (r1 != r2) goto L_0x0098
            r1 = 1
            goto L_0x0099
        L_0x0098:
            r1 = 0
        L_0x0099:
            if (r1 != 0) goto L_0x00a5
            com.ss.android.ugc.aweme.plugin.b.d$a r0 = r13.g
            com.ss.android.ugc.aweme.plugin.e.a r1 = r13.f59230b
            r0.b(r13, r1)
            r13.f59234f = r2
            return
        L_0x00a5:
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = f59229a
            r6 = 0
            r7 = 64559(0xfc2f, float:9.0466E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class<java.io.File> r9 = java.io.File.class
            r4 = r13
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r1 == 0) goto L_0x00cc
            java.lang.Object[] r3 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r5 = f59229a
            r6 = 0
            r7 = 64559(0xfc2f, float:9.0466E-41)
            java.lang.Class[] r8 = new java.lang.Class[r0]
            java.lang.Class<java.io.File> r9 = java.io.File.class
            r4 = r13
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r3, r4, r5, r6, r7, r8, r9)
            java.io.File r1 = (java.io.File) r1
            goto L_0x0116
        L_0x00cc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.ss.android.ugc.aweme.plugin.e.a r3 = r13.f59230b
            com.ss.android.ugc.aweme.plugin.e.c r3 = r3.f59310e
            java.lang.String r3 = r3.i
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00e6
            com.ss.android.ugc.aweme.plugin.e.a r3 = r13.f59230b
            com.ss.android.ugc.aweme.plugin.e.c r3 = r3.f59310e
            java.lang.String r3 = r3.i
            r1.append(r3)
        L_0x00e6:
            com.ss.android.ugc.aweme.plugin.e.a r3 = r13.f59230b
            java.lang.String r3 = r3.a()
            r1.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = r1.toString()
            byte[] r1 = r1.getBytes()
            java.lang.String r1 = com.bytedance.common.utility.DigestUtils.md5Hex((byte[]) r1)
            r3.append(r1)
            java.lang.String r1 = ".tmp"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.io.File r3 = new java.io.File
            com.ss.android.ugc.aweme.plugin.e.a r4 = r13.f59230b
            java.lang.String r4 = r4.f59308c
            r3.<init>(r4, r1)
            r1 = r3
        L_0x0116:
            r13.j = r1
            java.io.File r1 = r13.j
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x0171
            com.ss.android.ugc.aweme.plugin.b.d$a r1 = r13.g
            com.ss.android.ugc.aweme.plugin.e.a r3 = r13.f59230b
            r1.d(r13, r3)
            java.io.File r1 = r13.j
            java.io.File r1 = r1.getParentFile()
            boolean r1 = r1.mkdirs()
            java.io.File r3 = r13.j     // Catch:{ IOException -> 0x0138 }
            boolean r3 = r3.createNewFile()     // Catch:{ IOException -> 0x0138 }
            goto L_0x0153
        L_0x0138:
            r3 = move-exception
            java.lang.String r4 = "plugin_download"
            java.lang.String r5 = "plugin_log"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "downloadFile file:"
            r6.<init>(r7)
            java.lang.String r3 = android.util.Log.getStackTraceString(r3)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            r13.a(r4, r5, r3)
            r3 = 0
        L_0x0153:
            java.lang.String r4 = "plugin_download"
            java.lang.String r5 = "plugin_log"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = " mkdirs:"
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r1 = "   mkFile:"
            r6.append(r1)
            r6.append(r3)
            java.lang.String r1 = r6.toString()
            r13.a(r4, r5, r1)
            goto L_0x0178
        L_0x0171:
            com.ss.android.ugc.aweme.plugin.b.d$a r1 = r13.g
            com.ss.android.ugc.aweme.plugin.e.a r3 = r13.f59230b
            r1.c(r13, r3)
        L_0x0178:
            r1 = 0
            r5 = r1
            r1 = 0
            r3 = 0
            r4 = 0
        L_0x017d:
            boolean r6 = r13.a()
            r7 = -1
            if (r6 == 0) goto L_0x0216
            if (r1 != 0) goto L_0x0216
            com.ss.android.ugc.aweme.plugin.e.a r6 = r13.f59230b     // Catch:{ Exception -> 0x01ee }
            com.bytedance.retrofit2.SsResponse r6 = r13.a((com.ss.android.ugc.aweme.plugin.e.a) r6)     // Catch:{ Exception -> 0x01ee }
            r13.a((com.bytedance.retrofit2.SsResponse<com.bytedance.retrofit2.mime.TypedInput>) r6)     // Catch:{ Exception -> 0x01ee }
            long r9 = r13.f59232d     // Catch:{ Exception -> 0x01ee }
            long r11 = r13.f59231c     // Catch:{ Exception -> 0x01ee }
            int r6 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x020a
            long r9 = r13.f59231c     // Catch:{ Exception -> 0x01ee }
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x020a
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x01ee }
            com.ss.android.ugc.aweme.plugin.e.a r6 = r13.f59230b     // Catch:{ Exception -> 0x01ee }
            java.lang.String r6 = r6.f59308c     // Catch:{ Exception -> 0x01ee }
            com.ss.android.ugc.aweme.plugin.e.a r9 = r13.f59230b     // Catch:{ Exception -> 0x01ee }
            java.lang.String r9 = r9.f59307b     // Catch:{ Exception -> 0x01ee }
            r3.<init>(r6, r9)     // Catch:{ Exception -> 0x01ee }
            java.lang.String r6 = com.bytedance.common.utility.DigestUtils.md5Hex((java.io.File) r3)     // Catch:{ Exception -> 0x01ee }
            com.ss.android.ugc.aweme.plugin.e.a r9 = r13.f59230b     // Catch:{ Exception -> 0x01ee }
            com.ss.android.ugc.aweme.plugin.e.c r9 = r9.f59310e     // Catch:{ Exception -> 0x01ee }
            java.lang.String r9 = r9.f59328e     // Catch:{ Exception -> 0x01ee }
            boolean r6 = android.text.TextUtils.equals(r6, r9)     // Catch:{ Exception -> 0x01ee }
            if (r6 == 0) goto L_0x01bf
            r1 = 1
            r3 = 1
            r4 = 1
            goto L_0x020a
        L_0x01bf:
            r3.delete()     // Catch:{ Throwable -> 0x01c2 }
        L_0x01c2:
            r13.f59232d = r7     // Catch:{ Exception -> 0x01ee }
            r13.f59231c = r7     // Catch:{ Exception -> 0x01ee }
            java.net.UnknownServiceException r5 = new java.net.UnknownServiceException     // Catch:{ Exception -> 0x01ee }
            java.lang.String r3 = "md5 verify failed"
            r5.<init>(r3)     // Catch:{ Exception -> 0x01ee }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x01ee }
            r3.<init>()     // Catch:{ Exception -> 0x01ee }
            java.lang.String r6 = "event_type"
            java.lang.String r7 = "plugin_download"
            r3.put(r6, r7)     // Catch:{ Throwable -> 0x01ec }
            java.lang.String r6 = "module_type"
            java.lang.String r7 = "plugin_download"
            r3.put(r6, r7)     // Catch:{ Throwable -> 0x01ec }
            java.lang.String r6 = "reason"
            java.lang.String r7 = "md5 verify failed, auto retry"
            r3.put(r6, r7)     // Catch:{ Throwable -> 0x01ec }
            java.lang.String r6 = "plugin_bug_track"
            com.bytedance.framwork.core.monitor.MonitorUtils.monitorStatusRate(r6, r2, r3)     // Catch:{ Throwable -> 0x01ec }
        L_0x01ec:
            r3 = 1
            goto L_0x020a
        L_0x01ee:
            r3 = move-exception
            java.lang.String r5 = "plugin_download"
            java.lang.String r6 = "plugin_log"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "download run:"
            r7.<init>(r8)
            java.lang.String r8 = android.util.Log.getStackTraceString(r3)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r13.a(r5, r6, r7)
            r5 = r3
            r3 = 0
        L_0x020a:
            if (r1 != 0) goto L_0x017d
            com.ss.android.ugc.aweme.plugin.b.i r6 = r13.h     // Catch:{ c -> 0x0213 }
            r6.a()     // Catch:{ c -> 0x0213 }
            goto L_0x017d
        L_0x0213:
            r1 = 1
            goto L_0x017d
        L_0x0216:
            r13.f59234f = r2
            boolean r0 = r13.a()
            if (r0 != 0) goto L_0x0228
            com.ss.android.ugc.aweme.plugin.b.d$a r0 = r13.g
            com.ss.android.ugc.aweme.plugin.e.a r1 = r13.f59230b
            int r2 = r13.f59233e
            r0.a((com.ss.android.ugc.aweme.plugin.b.d) r13, (com.ss.android.ugc.aweme.plugin.e.a) r1, (int) r2)
            return
        L_0x0228:
            if (r3 == 0) goto L_0x023c
            if (r4 == 0) goto L_0x0234
            com.ss.android.ugc.aweme.plugin.b.d$a r0 = r13.g
            com.ss.android.ugc.aweme.plugin.e.a r1 = r13.f59230b
            r0.e(r13, r1)
            return
        L_0x0234:
            com.ss.android.ugc.aweme.plugin.b.d$a r0 = r13.g
            com.ss.android.ugc.aweme.plugin.e.a r1 = r13.f59230b
            r0.f(r13, r1)
            return
        L_0x023c:
            long r0 = r13.f59232d
            long r2 = r13.f59231c
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0277
            long r0 = r13.f59231c
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0277
            java.io.File r0 = new java.io.File
            com.ss.android.ugc.aweme.plugin.e.a r1 = r13.f59230b
            java.lang.String r1 = r1.f59308c
            com.ss.android.ugc.aweme.plugin.e.a r2 = r13.f59230b
            java.lang.String r2 = r2.f59307b
            r0.<init>(r1, r2)
            java.lang.String r0 = com.bytedance.common.utility.DigestUtils.md5Hex((java.io.File) r0)
            com.ss.android.ugc.aweme.plugin.e.a r1 = r13.f59230b
            com.ss.android.ugc.aweme.plugin.e.c r1 = r1.f59310e
            java.lang.String r1 = r1.f59328e
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x026f
            com.ss.android.ugc.aweme.plugin.b.d$a r0 = r13.g
            com.ss.android.ugc.aweme.plugin.e.a r1 = r13.f59230b
            r0.e(r13, r1)
            goto L_0x0288
        L_0x026f:
            com.ss.android.ugc.aweme.plugin.b.d$a r0 = r13.g
            com.ss.android.ugc.aweme.plugin.e.a r1 = r13.f59230b
            r0.f(r13, r1)
            return
        L_0x0277:
            com.ss.android.ugc.aweme.plugin.b.d$a r0 = r13.g
            com.ss.android.ugc.aweme.plugin.e.a r1 = r13.f59230b
            if (r5 == 0) goto L_0x027e
            goto L_0x0285
        L_0x027e:
            java.lang.Exception r5 = new java.lang.Exception
            java.lang.String r2 = "unkown error"
            r5.<init>(r2)
        L_0x0285:
            r0.a((com.ss.android.ugc.aweme.plugin.b.d) r13, (com.ss.android.ugc.aweme.plugin.e.a) r1, (java.lang.Exception) r5)
        L_0x0288:
            return
        L_0x0289:
            r13.f59234f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.plugin.b.d.run():void");
    }

    private SsResponse<TypedInput> a(com.ss.android.ugc.aweme.plugin.e.a aVar) throws IOException {
        long j2;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f59229a, false, 64557, new Class[]{com.ss.android.ugc.aweme.plugin.e.a.class}, SsResponse.class)) {
            return (SsResponse) PatchProxy.accessDispatch(new Object[]{aVar}, this, f59229a, false, 64557, new Class[]{com.ss.android.ugc.aweme.plugin.e.a.class}, SsResponse.class);
        }
        if (this.j.exists()) {
            j2 = this.j.length();
        } else {
            j2 = 0;
        }
        this.k = j2;
        this.k = Math.max(this.k - 20480, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> parseUrl = UrlUtils.parseUrl(aVar.a(), linkedHashMap);
        if (parseUrl == null) {
            return null;
        }
        String str = (String) parseUrl.second;
        INetworkApi iNetworkApi = (INetworkApi) RetrofitUtils.createSsService((String) parseUrl.first, INetworkApi.class);
        com.bytedance.ttnet.b.d dVar = new com.bytedance.ttnet.b.d();
        LinkedList linkedList = new LinkedList();
        linkedList.add(new Header("Range", "bytes=" + this.k + "-"));
        if (!TextUtils.isEmpty(e.f())) {
            linkedList.add(new Header("User-Agent", r0 + " ttnet/2.0.9"));
        }
        if (iNetworkApi == null) {
            return null;
        }
        try {
            return iNetworkApi.downloadFile(false, -1, str, linkedHashMap, linkedList, dVar).execute();
        } catch (Exception e2) {
            a("plugin_download", "plugin_log", "tryConnect call:" + Log.getStackTraceString(e2));
            com.ss.android.ugc.aweme.plugin.b.a.a.rethrowEstablishConnectionException(e2);
            return null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:14|15|(2:17|(1:19))|20|(1:22)|23|24|25|(2:26|(4:28|29|30|(4:36|37|42|(2:75|44))(1:74))(1:76))|45|(1:47)|(2:49|50)|51|52|53) */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x013b, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0137 */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0146 A[SYNTHETIC, Splitter:B:62:0x0146] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014b A[SYNTHETIC, Splitter:B:66:0x014b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.bytedance.retrofit2.SsResponse<com.bytedance.retrofit2.mime.TypedInput> r13) throws java.lang.Exception {
        /*
            r12 = this;
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r3 = f59229a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.retrofit2.SsResponse> r2 = com.bytedance.retrofit2.SsResponse.class
            r6[r9] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 64556(0xfc2c, float:9.0462E-41)
            r2 = r12
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0032
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r13
            com.meituan.robust.ChangeQuickRedirect r3 = f59229a
            r4 = 0
            r5 = 64556(0xfc2c, float:9.0462E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<com.bytedance.retrofit2.SsResponse> r0 = com.bytedance.retrofit2.SsResponse.class
            r6[r9] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0032:
            if (r13 == 0) goto L_0x0157
            int r1 = r13.code()
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 == r2) goto L_0x0044
            int r1 = r13.code()
            r2 = 206(0xce, float:2.89E-43)
            if (r1 != r2) goto L_0x0157
        L_0x0044:
            java.lang.Object r1 = r13.body()
            com.bytedance.retrofit2.mime.TypedInput r1 = (com.bytedance.retrofit2.mime.TypedInput) r1
            if (r1 == 0) goto L_0x014f
            r2 = 0
            java.io.InputStream r1 = r1.in()     // Catch:{ all -> 0x0141 }
            java.util.List r0 = r13.headers()     // Catch:{ all -> 0x013e }
            java.lang.String r3 = "Content-Range"
            java.lang.String r0 = r12.a(r0, r3)     // Catch:{ all -> 0x013e }
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x013e }
            r4 = -1
            if (r3 != 0) goto L_0x0075
            java.lang.String r3 = "/"
            int r3 = r0.indexOf(r3)     // Catch:{ all -> 0x013e }
            if (r3 == r4) goto L_0x0075
            int r3 = r3 + r8
            java.lang.String r0 = r0.substring(r3)     // Catch:{ all -> 0x013e }
            long r5 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x013e }
            r12.f59231c = r5     // Catch:{ all -> 0x013e }
        L_0x0075:
            long r5 = r12.f59231c     // Catch:{ all -> 0x013e }
            r10 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0080
            r12.f59231c = r10     // Catch:{ all -> 0x013e }
        L_0x0080:
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ all -> 0x013e }
            java.io.File r0 = r12.j     // Catch:{ all -> 0x013e }
            java.lang.String r5 = "rw"
            r3.<init>(r0, r5)     // Catch:{ all -> 0x013e }
            long r5 = r12.k     // Catch:{ all -> 0x013c }
            r3.seek(r5)     // Catch:{ all -> 0x013c }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x013c }
            long r5 = r12.k     // Catch:{ all -> 0x013c }
            r12.f59232d = r5     // Catch:{ all -> 0x013c }
            r5 = 0
        L_0x0097:
            boolean r0 = r12.a()     // Catch:{ all -> 0x013c }
            if (r0 == 0) goto L_0x0114
            int r0 = r1.read(r2)     // Catch:{ IOException -> 0x00a3 }
            r5 = r0
            goto L_0x00c1
        L_0x00a3:
            r0 = move-exception
            r6 = r0
            java.lang.String r0 = "plugin_download"
            java.lang.String r7 = "plugin_log"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x013c }
            java.lang.String r10 = "  read:"
            r8.<init>(r10)     // Catch:{ all -> 0x013c }
            java.lang.String r10 = android.util.Log.getStackTraceString(r6)     // Catch:{ all -> 0x013c }
            r8.append(r10)     // Catch:{ all -> 0x013c }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x013c }
            r12.a(r0, r7, r8)     // Catch:{ all -> 0x013c }
            com.ss.android.ugc.aweme.plugin.b.a.b.rethrowReadDataException(r6)     // Catch:{ all -> 0x013c }
        L_0x00c1:
            if (r5 == r4) goto L_0x0114
            r3.write(r2, r9, r5)     // Catch:{ IOException -> 0x00c7 }
            goto L_0x00e5
        L_0x00c7:
            r0 = move-exception
            r6 = r0
            java.lang.String r0 = "plugin_download"
            java.lang.String r7 = "plugin_log"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x013c }
            java.lang.String r10 = "  write:"
            r8.<init>(r10)     // Catch:{ all -> 0x013c }
            java.lang.String r10 = android.util.Log.getStackTraceString(r6)     // Catch:{ all -> 0x013c }
            r8.append(r10)     // Catch:{ all -> 0x013c }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x013c }
            r12.a(r0, r7, r8)     // Catch:{ all -> 0x013c }
            com.ss.android.ugc.aweme.plugin.b.a.c.rethrowWriteDataException(r6)     // Catch:{ all -> 0x013c }
        L_0x00e5:
            long r6 = r12.f59232d     // Catch:{ all -> 0x013c }
            long r10 = (long) r5     // Catch:{ all -> 0x013c }
            long r6 = r6 + r10
            r12.f59232d = r6     // Catch:{ all -> 0x013c }
            long r6 = r12.f59232d     // Catch:{ all -> 0x013c }
            long r10 = r12.f59231c     // Catch:{ all -> 0x013c }
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x0097
            java.lang.String r0 = "plugin_download"
            java.lang.String r2 = "plugin_log"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x013c }
            java.lang.String r5 = "  total recv:"
            r4.<init>(r5)     // Catch:{ all -> 0x013c }
            long r5 = r12.f59232d     // Catch:{ all -> 0x013c }
            r4.append(r5)     // Catch:{ all -> 0x013c }
            java.lang.String r5 = "  totalLen:"
            r4.append(r5)     // Catch:{ all -> 0x013c }
            long r5 = r12.f59231c     // Catch:{ all -> 0x013c }
            r4.append(r5)     // Catch:{ all -> 0x013c }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x013c }
            r12.a(r0, r2, r4)     // Catch:{ all -> 0x013c }
        L_0x0114:
            java.io.File r0 = r12.j     // Catch:{ all -> 0x013c }
            long r4 = r0.length()     // Catch:{ all -> 0x013c }
            long r6 = r12.f59231c     // Catch:{ all -> 0x013c }
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0132
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x013c }
            com.ss.android.ugc.aweme.plugin.e.a r2 = r12.f59230b     // Catch:{ all -> 0x013c }
            java.lang.String r2 = r2.f59308c     // Catch:{ all -> 0x013c }
            com.ss.android.ugc.aweme.plugin.e.a r4 = r12.f59230b     // Catch:{ all -> 0x013c }
            java.lang.String r4 = r4.f59307b     // Catch:{ all -> 0x013c }
            r0.<init>(r2, r4)     // Catch:{ all -> 0x013c }
            java.io.File r2 = r12.j     // Catch:{ all -> 0x013c }
            r2.renameTo(r0)     // Catch:{ all -> 0x013c }
        L_0x0132:
            if (r1 == 0) goto L_0x0137
            r1.close()     // Catch:{ IOException -> 0x0137 }
        L_0x0137:
            r3.close()     // Catch:{ IOException -> 0x013b }
            return
        L_0x013b:
            return
        L_0x013c:
            r0 = move-exception
            goto L_0x0144
        L_0x013e:
            r0 = move-exception
            r3 = r2
            goto L_0x0144
        L_0x0141:
            r0 = move-exception
            r1 = r2
            r3 = r1
        L_0x0144:
            if (r1 == 0) goto L_0x0149
            r1.close()     // Catch:{ IOException -> 0x0149 }
        L_0x0149:
            if (r3 == 0) goto L_0x014e
            r3.close()     // Catch:{ IOException -> 0x014e }
        L_0x014e:
            throw r0
        L_0x014f:
            android.accounts.NetworkErrorException r0 = new android.accounts.NetworkErrorException
            java.lang.String r1 = "body is null"
            r0.<init>(r1)
            throw r0
        L_0x0157:
            android.accounts.NetworkErrorException r0 = new android.accounts.NetworkErrorException
            java.lang.String r1 = "network error"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.plugin.b.d.a(com.bytedance.retrofit2.SsResponse):void");
    }

    private String a(List<Header> list, String str) {
        List<Header> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, str}, this, f59229a, false, 64560, new Class[]{List.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{list2, str}, this, f59229a, false, 64560, new Class[]{List.class, String.class}, String.class);
        } else if (list2 == null || list.size() == 0) {
            return null;
        } else {
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (list2.get(i2) != null && TextUtils.equals(str.toLowerCase(), list2.get(i2).getName().toLowerCase())) {
                    return list2.get(i2).getValue();
                }
            }
            return null;
        }
    }

    private void a(String str, String str2, String str3) {
        c cVar;
        String str4;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        if (PatchProxy.isSupport(new Object[]{str5, str6, str7}, this, f59229a, false, 64561, new Class[]{String.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str5, str6, str7}, this, f59229a, false, 64561, new Class[]{String.class, String.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        if (this.f59230b == null) {
            cVar = null;
        } else {
            cVar = this.f59230b.f59310e;
        }
        if (cVar == null) {
            str4 = "";
        } else {
            str4 = cVar.f59324a + ":" + cVar.f59328e;
        }
        hashMap.put("plugin_info", str4);
        hashMap.put(str6, str7);
        r.a(str5, (Map) hashMap);
    }

    public d(Context context, com.ss.android.ugc.aweme.plugin.e.a aVar, a aVar2, i iVar) {
        this.i = context;
        this.f59230b = aVar;
        this.g = aVar2;
        this.h = iVar;
    }
}
