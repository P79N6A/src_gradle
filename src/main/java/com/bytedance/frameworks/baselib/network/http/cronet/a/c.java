package com.bytedance.frameworks.baselib.network.http.cronet.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient;
import com.bytedance.frameworks.baselib.network.http.e;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.i;
import com.bytedance.retrofit2.j;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieHandler;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class c implements com.bytedance.frameworks.baselib.network.http.c, e.j {

    /* renamed from: a  reason: collision with root package name */
    public static Context f19797a = null;

    /* renamed from: b  reason: collision with root package name */
    public static ICronetClient f19798b = null;

    /* renamed from: c  reason: collision with root package name */
    public static volatile boolean f19799c = false;

    /* renamed from: d  reason: collision with root package name */
    private static String f19800d = "";

    /* renamed from: e  reason: collision with root package name */
    private static volatile c f19801e;

    /* renamed from: f  reason: collision with root package name */
    private static b f19802f;

    public static class a implements com.bytedance.retrofit2.client.a, i, j {

        /* renamed from: a  reason: collision with root package name */
        HttpURLConnection f19803a;

        /* renamed from: b  reason: collision with root package name */
        com.bytedance.frameworks.baselib.network.http.a f19804b = com.bytedance.frameworks.baselib.network.http.a.a();

        /* renamed from: c  reason: collision with root package name */
        long f19805c = 0;

        /* renamed from: d  reason: collision with root package name */
        String f19806d = null;

        /* renamed from: e  reason: collision with root package name */
        Request f19807e;

        /* renamed from: f  reason: collision with root package name */
        boolean f19808f = false;
        boolean g = false;

        public final Object getRequestInfo() {
            return this.f19804b;
        }

        public final void doCollect() {
            c.a(this.f19803a, this.f19804b);
        }

        public final void b() {
            if (this.f19803a != null) {
                this.f19803a.disconnect();
                this.f19808f = true;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
            r4 = r14.f19803a.getErrorStream();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:87:0x016a, code lost:
            r0 = th;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x00de */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x004e A[Catch:{ Exception -> 0x016c, all -> 0x016a }] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x008b A[Catch:{ Exception -> 0x016c, all -> 0x016a }] */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x0116 A[Catch:{ Exception -> 0x016c, all -> 0x016a }] */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0153  */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x016a A[ExcHandler: all (th java.lang.Throwable), Splitter:B:23:0x0047] */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x0179 A[Catch:{ all -> 0x01ae }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.retrofit2.client.Response a() throws java.io.IOException {
            /*
                r14 = this;
                com.bytedance.retrofit2.client.Request r0 = r14.f19807e
                java.lang.String r0 = r0.getUrl()
                boolean r1 = com.bytedance.frameworks.baselib.network.http.cronet.a.c.f19799c
                if (r1 != 0) goto L_0x01da
                boolean r1 = r14.f19808f
                if (r1 != 0) goto L_0x01d2
                boolean r1 = r14.g
                if (r1 != 0) goto L_0x0027
                android.content.Context r1 = com.bytedance.frameworks.baselib.network.http.cronet.a.c.f19797a
                if (r1 == 0) goto L_0x0027
                android.content.Context r1 = com.bytedance.frameworks.baselib.network.http.cronet.a.c.f19797a
                boolean r1 = com.bytedance.common.utility.NetworkUtils.isNetworkAvailable(r1)
                if (r1 == 0) goto L_0x001f
                goto L_0x0027
            L_0x001f:
                com.bytedance.frameworks.baselib.network.http.a.c r0 = new com.bytedance.frameworks.baselib.network.http.a.c
                java.lang.String r1 = "network not available"
                r0.<init>((java.lang.String) r1)
                throw r0
            L_0x0027:
                r9 = 1
                r10 = 0
                com.bytedance.retrofit2.client.Request r1 = r14.f19807e     // Catch:{ Exception -> 0x0173, all -> 0x0170 }
                boolean r1 = r1.isResponseStreaming()     // Catch:{ Exception -> 0x0173, all -> 0x0170 }
                if (r1 != 0) goto L_0x0046
                com.bytedance.frameworks.baselib.network.http.e$g r1 = com.bytedance.frameworks.baselib.network.http.e.b()     // Catch:{ Exception -> 0x0173, all -> 0x0170 }
                if (r1 == 0) goto L_0x0046
                boolean r1 = r1.c(r0)     // Catch:{ Exception -> 0x0173, all -> 0x0170 }
                if (r1 == 0) goto L_0x0046
                com.bytedance.frameworks.baselib.network.a.e r1 = com.bytedance.frameworks.baselib.network.a.e.b()     // Catch:{ Exception -> 0x0173, all -> 0x0170 }
                r1.c()     // Catch:{ Exception -> 0x0173, all -> 0x0170 }
                r11 = 1
                goto L_0x0047
            L_0x0046:
                r11 = 0
            L_0x0047:
                com.bytedance.retrofit2.client.Request r1 = r14.f19807e     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                java.net.HttpURLConnection r2 = r14.f19803a     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                r3 = -1
                if (r1 == 0) goto L_0x0064
                if (r2 != 0) goto L_0x0051
                goto L_0x0064
            L_0x0051:
                com.bytedance.retrofit2.mime.TypedOutput r1 = r1.getBody()     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                if (r1 == 0) goto L_0x005e
                java.io.OutputStream r4 = r2.getOutputStream()     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                r1.writeTo(r4)     // Catch:{ Exception -> 0x016c, all -> 0x016a }
            L_0x005e:
                int r1 = r2.getResponseCode()     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                r12 = r1
                goto L_0x0065
            L_0x0064:
                r12 = -1
            L_0x0065:
                com.bytedance.frameworks.baselib.network.http.a r1 = r14.f19804b     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                r1.f19735f = r4     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                com.bytedance.frameworks.baselib.network.http.a r1 = r14.f19804b     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                r1.i = r3     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                java.net.HttpURLConnection r1 = r14.f19803a     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                com.bytedance.frameworks.baselib.network.http.a r2 = r14.f19804b     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                java.lang.String r1 = com.bytedance.frameworks.baselib.network.http.cronet.a.c.a((java.net.HttpURLConnection) r1, (com.bytedance.frameworks.baselib.network.http.a) r2, (int) r12)     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                r14.f19806d = r1     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                java.net.HttpURLConnection r1 = r14.f19803a     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                java.lang.String r2 = "Content-Type"
                java.lang.String r13 = com.bytedance.frameworks.baselib.network.http.cronet.a.c.a((java.net.HttpURLConnection) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                com.bytedance.retrofit2.client.Request r1 = r14.f19807e     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                boolean r1 = r1.isResponseStreaming()     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                if (r1 == 0) goto L_0x0116
                java.net.HttpURLConnection r1 = r14.f19803a     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                java.lang.String r2 = "Content-Encoding"
                java.lang.String r1 = com.bytedance.frameworks.baselib.network.http.cronet.a.c.a((java.net.HttpURLConnection) r1, (java.lang.String) r2)     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                if (r1 == 0) goto L_0x009f
                java.lang.String r2 = "gzip"
                boolean r1 = r2.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                if (r1 == 0) goto L_0x009f
                r1 = 1
                goto L_0x00a0
            L_0x009f:
                r1 = 0
            L_0x00a0:
                com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient r2 = com.bytedance.frameworks.baselib.network.http.cronet.a.c.f19798b     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                if (r2 == 0) goto L_0x00af
                com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient r2 = com.bytedance.frameworks.baselib.network.http.cronet.a.c.f19798b     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                java.net.HttpURLConnection r3 = r14.f19803a     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                boolean r2 = r2.isCronetHttpURLConnection(r3)     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                if (r2 == 0) goto L_0x00af
                r1 = 0
            L_0x00af:
                r2 = 200(0xc8, float:2.8E-43)
                if (r12 < r2) goto L_0x00cb
                r2 = 300(0x12c, float:4.2E-43)
                if (r12 >= r2) goto L_0x00cb
                java.net.HttpURLConnection r2 = r14.f19803a     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                if (r2 == 0) goto L_0x00c8
                int r3 = r2.getContentLength()     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                if (r3 != 0) goto L_0x00c2
                goto L_0x00c8
            L_0x00c2:
                com.bytedance.frameworks.baselib.network.http.cronet.a.c$a$1 r3 = new com.bytedance.frameworks.baselib.network.http.cronet.a.c$a$1     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                r3.<init>(r2, r1)     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                goto L_0x00c9
            L_0x00c8:
                r3 = 0
            L_0x00c9:
                r6 = r3
                goto L_0x0132
            L_0x00cb:
                java.net.HttpURLConnection r2 = r14.f19803a     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                java.lang.String r2 = r2.getResponseMessage()     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                com.bytedance.retrofit2.client.Request r3 = r14.f19807e     // Catch:{ Throwable -> 0x00e8 }
                int r3 = r3.getMaxLength()     // Catch:{ Throwable -> 0x00e8 }
                java.net.HttpURLConnection r4 = r14.f19803a     // Catch:{ Exception -> 0x00de, all -> 0x016a }
                java.io.InputStream r4 = r4.getInputStream()     // Catch:{ Exception -> 0x00de, all -> 0x016a }
                goto L_0x00e4
            L_0x00de:
                java.net.HttpURLConnection r4 = r14.f19803a     // Catch:{ Throwable -> 0x00e8 }
                java.io.InputStream r4 = r4.getErrorStream()     // Catch:{ Throwable -> 0x00e8 }
            L_0x00e4:
                com.bytedance.frameworks.baselib.network.http.cronet.a.c.a(r1, r3, r4, r13, r0)     // Catch:{ Throwable -> 0x00e8 }
                goto L_0x0107
            L_0x00e8:
                r1 = move-exception
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                java.lang.String r4 = "reason = "
                r3.<init>(r4)     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                if (r2 != 0) goto L_0x00f4
                java.lang.String r2 = ""
            L_0x00f4:
                r3.append(r2)     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                java.lang.String r2 = "  exception = "
                r3.append(r2)     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                java.lang.String r1 = r1.getMessage()     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                r3.append(r1)     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x016c, all -> 0x016a }
            L_0x0107:
                java.net.HttpURLConnection r1 = r14.f19803a     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                if (r1 == 0) goto L_0x0110
                java.net.HttpURLConnection r1 = r14.f19803a     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                r1.disconnect()     // Catch:{ Exception -> 0x016c, all -> 0x016a }
            L_0x0110:
                com.bytedance.frameworks.baselib.network.http.a.b r1 = new com.bytedance.frameworks.baselib.network.http.a.b     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                r1.<init>(r12, r2)     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                throw r1     // Catch:{ Exception -> 0x016c, all -> 0x016a }
            L_0x0116:
                com.bytedance.retrofit2.client.Request r1 = r14.f19807e     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                int r2 = r1.getMaxLength()     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                java.net.HttpURLConnection r3 = r14.f19803a     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                long r4 = r14.f19805c     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                com.bytedance.frameworks.baselib.network.http.a r6 = r14.f19804b     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                java.lang.String r7 = r14.f19806d     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                r1 = r0
                r8 = r12
                byte[] r1 = com.bytedance.frameworks.baselib.network.http.cronet.a.c.a(r1, r2, r3, r4, r6, r7, r8)     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                com.bytedance.retrofit2.mime.TypedByteArray r2 = new com.bytedance.retrofit2.mime.TypedByteArray     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                r2.<init>(r13, r1, r3)     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                r6 = r2
            L_0x0132:
                com.bytedance.retrofit2.client.Response r7 = new com.bytedance.retrofit2.client.Response     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                java.net.HttpURLConnection r1 = r14.f19803a     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                java.lang.String r4 = r1.getResponseMessage()     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                java.net.HttpURLConnection r1 = r14.f19803a     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                java.util.List r5 = a(r1)     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                r1 = r7
                r2 = r0
                r3 = r12
                r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                com.bytedance.frameworks.baselib.network.http.a r1 = r14.f19804b     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                r7.setExtraInfo(r1)     // Catch:{ Exception -> 0x016c, all -> 0x016a }
                com.bytedance.retrofit2.client.Request r0 = r14.f19807e
                boolean r0 = r0.isResponseStreaming()
                if (r0 != 0) goto L_0x0158
                java.net.HttpURLConnection r0 = r14.f19803a
                com.bytedance.frameworks.baselib.network.http.cronet.a.c.a((java.net.HttpURLConnection) r0)
            L_0x0158:
                com.bytedance.retrofit2.client.Request r0 = r14.f19807e
                boolean r0 = r0.isResponseStreaming()
                if (r0 != 0) goto L_0x0169
                if (r11 == 0) goto L_0x0169
                com.bytedance.frameworks.baselib.network.a.e r0 = com.bytedance.frameworks.baselib.network.a.e.b()
                r0.d()
            L_0x0169:
                return r7
            L_0x016a:
                r0 = move-exception
                goto L_0x01b1
            L_0x016c:
                r1 = move-exception
                r8 = r1
                r10 = r11
                goto L_0x0175
            L_0x0170:
                r0 = move-exception
                r11 = 0
                goto L_0x01b1
            L_0x0173:
                r1 = move-exception
                r8 = r1
            L_0x0175:
                boolean r1 = r8 instanceof com.bytedance.frameworks.baselib.network.http.a.b     // Catch:{ all -> 0x01ae }
                if (r1 == 0) goto L_0x0186
                r1 = r8
                com.bytedance.frameworks.baselib.network.http.a.b r1 = (com.bytedance.frameworks.baselib.network.http.a.b) r1     // Catch:{ all -> 0x01ae }
                int r2 = r1.getStatusCode()     // Catch:{ all -> 0x01ae }
                r3 = 304(0x130, float:4.26E-43)
                if (r2 == r3) goto L_0x0185
                goto L_0x0186
            L_0x0185:
                throw r1     // Catch:{ all -> 0x01ae }
            L_0x0186:
                boolean r1 = r8 instanceof java.io.IOException     // Catch:{ all -> 0x01ae }
                if (r1 == 0) goto L_0x0197
                java.lang.String r1 = "request canceled"
                java.lang.String r2 = r8.getMessage()     // Catch:{ all -> 0x01ae }
                boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x01ae }
                if (r1 == 0) goto L_0x0197
                throw r8     // Catch:{ all -> 0x01ae }
            L_0x0197:
                long r2 = r14.f19805c     // Catch:{ all -> 0x01ae }
                com.bytedance.frameworks.baselib.network.http.a r4 = r14.f19804b     // Catch:{ all -> 0x01ae }
                java.lang.String r5 = r14.f19806d     // Catch:{ all -> 0x01ae }
                java.net.HttpURLConnection r7 = r14.f19803a     // Catch:{ all -> 0x01ae }
                r1 = r0
                r6 = r8
                com.bytedance.frameworks.baselib.network.http.cronet.a.c.a(r1, r2, r4, r5, r6, r7)     // Catch:{ all -> 0x01ae }
                com.bytedance.frameworks.baselib.network.http.cronet.a.a r0 = new com.bytedance.frameworks.baselib.network.http.cronet.a.a     // Catch:{ all -> 0x01ae }
                com.bytedance.frameworks.baselib.network.http.a r1 = r14.f19804b     // Catch:{ all -> 0x01ae }
                java.lang.String r2 = r14.f19806d     // Catch:{ all -> 0x01ae }
                r0.<init>(r8, r1, r2)     // Catch:{ all -> 0x01ae }
                throw r0     // Catch:{ all -> 0x01ae }
            L_0x01ae:
                r0 = move-exception
                r11 = r10
                r10 = 1
            L_0x01b1:
                com.bytedance.retrofit2.client.Request r1 = r14.f19807e
                boolean r1 = r1.isResponseStreaming()
                if (r1 == 0) goto L_0x01bb
                if (r10 == 0) goto L_0x01c0
            L_0x01bb:
                java.net.HttpURLConnection r1 = r14.f19803a
                com.bytedance.frameworks.baselib.network.http.cronet.a.c.a((java.net.HttpURLConnection) r1)
            L_0x01c0:
                com.bytedance.retrofit2.client.Request r1 = r14.f19807e
                boolean r1 = r1.isResponseStreaming()
                if (r1 != 0) goto L_0x01d1
                if (r11 == 0) goto L_0x01d1
                com.bytedance.frameworks.baselib.network.a.e r1 = com.bytedance.frameworks.baselib.network.a.e.b()
                r1.d()
            L_0x01d1:
                throw r0
            L_0x01d2:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "request canceled"
                r0.<init>(r1)
                throw r0
            L_0x01da:
                com.bytedance.frameworks.baselib.network.http.a.e r0 = new com.bytedance.frameworks.baselib.network.http.a.e
                java.lang.String r1 = "request is not allowed using network"
                r0.<init>((java.lang.String) r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.a.c.a.a():com.bytedance.retrofit2.client.Response");
        }

        private static List<Header> a(HttpURLConnection httpURLConnection) {
            if (httpURLConnection == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : httpURLConnection.getHeaderFields().entrySet()) {
                String str = (String) entry.getKey();
                for (String header : (List) entry.getValue()) {
                    arrayList.add(new Header(str, header));
                }
            }
            return arrayList;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x011d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x013c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x015f */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0121 A[SYNTHETIC, Splitter:B:30:0x0121] */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0144 A[SYNTHETIC, Splitter:B:35:0x0144] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(com.bytedance.retrofit2.client.Request r13) throws java.io.IOException {
            /*
                r12 = this;
                r12.<init>()
                com.bytedance.frameworks.baselib.network.http.a r0 = com.bytedance.frameworks.baselib.network.http.a.a()
                r12.f19804b = r0
                r0 = 0
                r12.f19805c = r0
                r2 = 0
                r12.f19806d = r2
                r3 = 0
                r12.f19808f = r3
                r12.g = r3
                r12.f19807e = r13
                com.bytedance.retrofit2.client.Request r4 = r12.f19807e
                java.lang.String r5 = r4.getUrl()
                r12.f19803a = r2
                com.bytedance.retrofit2.o r2 = r13.getMetrics()
                if (r2 == 0) goto L_0x0031
                com.bytedance.frameworks.baselib.network.http.a r4 = r12.f19804b
                long r6 = r2.f21929a
                r4.f19732c = r6
                com.bytedance.frameworks.baselib.network.http.a r4 = r12.f19804b
                long r6 = r2.f21930b
                r4.f19733d = r6
            L_0x0031:
                long r6 = java.lang.System.currentTimeMillis()
                r12.f19805c = r6
                com.bytedance.frameworks.baselib.network.http.a r2 = r12.f19804b
                long r6 = r12.f19805c
                r2.f19734e = r6
                com.bytedance.frameworks.baselib.network.http.a r2 = r12.f19804b
                r2.u = r3
                com.bytedance.retrofit2.client.Request r2 = r12.f19807e
                boolean r2 = r2.isResponseStreaming()
                r4 = 1
                if (r2 == 0) goto L_0x004f
                com.bytedance.frameworks.baselib.network.http.a r2 = r12.f19804b
                r2.x = r4
                goto L_0x0053
            L_0x004f:
                com.bytedance.frameworks.baselib.network.http.a r2 = r12.f19804b
                r2.x = r3
            L_0x0053:
                java.net.HttpURLConnection r2 = com.bytedance.frameworks.baselib.network.http.cronet.a.c.a((java.lang.String) r5)     // Catch:{ Exception -> 0x01a6 }
                r12.f19803a = r2     // Catch:{ Exception -> 0x01a6 }
                java.lang.Object r2 = r13.getExtraInfo()     // Catch:{ Exception -> 0x01a6 }
                boolean r2 = r2 instanceof com.bytedance.frameworks.baselib.network.http.b     // Catch:{ Exception -> 0x01a6 }
                if (r2 == 0) goto L_0x015f
                com.bytedance.frameworks.baselib.network.http.a r2 = r12.f19804b     // Catch:{ Exception -> 0x01a6 }
                java.lang.Object r6 = r13.getExtraInfo()     // Catch:{ Exception -> 0x01a6 }
                com.bytedance.frameworks.baselib.network.http.b r6 = (com.bytedance.frameworks.baselib.network.http.b) r6     // Catch:{ Exception -> 0x01a6 }
                r2.f19731b = r6     // Catch:{ Exception -> 0x01a6 }
                com.bytedance.frameworks.baselib.network.http.a r2 = r12.f19804b     // Catch:{ Exception -> 0x01a6 }
                T r2 = r2.f19731b     // Catch:{ Exception -> 0x01a6 }
                long r6 = r2.f19738c     // Catch:{ Exception -> 0x01a6 }
                int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r8 <= 0) goto L_0x007d
                java.net.HttpURLConnection r6 = r12.f19803a     // Catch:{ Exception -> 0x01a6 }
                long r7 = r2.f19738c     // Catch:{ Exception -> 0x01a6 }
                int r7 = (int) r7     // Catch:{ Exception -> 0x01a6 }
                r6.setConnectTimeout(r7)     // Catch:{ Exception -> 0x01a6 }
            L_0x007d:
                long r6 = r2.f19739d     // Catch:{ Exception -> 0x01a6 }
                int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r8 <= 0) goto L_0x008b
                java.net.HttpURLConnection r6 = r12.f19803a     // Catch:{ Exception -> 0x01a6 }
                long r7 = r2.f19739d     // Catch:{ Exception -> 0x01a6 }
                int r7 = (int) r7     // Catch:{ Exception -> 0x01a6 }
                r6.setReadTimeout(r7)     // Catch:{ Exception -> 0x01a6 }
            L_0x008b:
                long r6 = r2.i     // Catch:{ Exception -> 0x01a6 }
                int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r8 <= 0) goto L_0x011d
                java.net.HttpURLConnection r6 = r12.f19803a     // Catch:{ Throwable -> 0x011d }
                com.bytedance.common.utility.reflect.Reflect r6 = com.bytedance.common.utility.reflect.Reflect.on((java.lang.Object) r6)     // Catch:{ Throwable -> 0x011d }
                java.lang.String r7 = "setRequestTimeout"
                java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x011d }
                java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x011d }
                r8[r3] = r9     // Catch:{ Throwable -> 0x011d }
                java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x011d }
                long r10 = r2.i     // Catch:{ Throwable -> 0x011d }
                int r10 = (int) r10     // Catch:{ Throwable -> 0x011d }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x011d }
                r9[r3] = r10     // Catch:{ Throwable -> 0x011d }
                r6.call(r7, r8, r9)     // Catch:{ Throwable -> 0x011d }
                java.net.HttpURLConnection r6 = r12.f19803a     // Catch:{ Throwable -> 0x011d }
                r6.setConnectTimeout(r3)     // Catch:{ Throwable -> 0x011d }
                java.net.HttpURLConnection r6 = r12.f19803a     // Catch:{ Throwable -> 0x011d }
                r6.setReadTimeout(r3)     // Catch:{ Throwable -> 0x011d }
                long r6 = r2.f19741f     // Catch:{ Throwable -> 0x011d }
                int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r8 > 0) goto L_0x00c9
                long r6 = r2.h     // Catch:{ Throwable -> 0x011d }
                int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r8 > 0) goto L_0x00c9
                long r6 = r2.g     // Catch:{ Throwable -> 0x011d }
                int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r8 <= 0) goto L_0x011d
            L_0x00c9:
                java.net.HttpURLConnection r0 = r12.f19803a     // Catch:{ Throwable -> 0x011d }
                com.bytedance.common.utility.reflect.Reflect r0 = com.bytedance.common.utility.reflect.Reflect.on((java.lang.Object) r0)     // Catch:{ Throwable -> 0x011d }
                java.lang.String r1 = "setSocketConnectTimeout"
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x011d }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x011d }
                r6[r3] = r7     // Catch:{ Throwable -> 0x011d }
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x011d }
                long r8 = r2.f19741f     // Catch:{ Throwable -> 0x011d }
                int r8 = (int) r8     // Catch:{ Throwable -> 0x011d }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x011d }
                r7[r3] = r8     // Catch:{ Throwable -> 0x011d }
                r0.call(r1, r6, r7)     // Catch:{ Throwable -> 0x011d }
                java.net.HttpURLConnection r0 = r12.f19803a     // Catch:{ Throwable -> 0x011d }
                com.bytedance.common.utility.reflect.Reflect r0 = com.bytedance.common.utility.reflect.Reflect.on((java.lang.Object) r0)     // Catch:{ Throwable -> 0x011d }
                java.lang.String r1 = "setSocketReadTimeout"
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x011d }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x011d }
                r6[r3] = r7     // Catch:{ Throwable -> 0x011d }
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x011d }
                long r8 = r2.h     // Catch:{ Throwable -> 0x011d }
                int r8 = (int) r8     // Catch:{ Throwable -> 0x011d }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x011d }
                r7[r3] = r8     // Catch:{ Throwable -> 0x011d }
                r0.call(r1, r6, r7)     // Catch:{ Throwable -> 0x011d }
                java.net.HttpURLConnection r0 = r12.f19803a     // Catch:{ Throwable -> 0x011d }
                com.bytedance.common.utility.reflect.Reflect r0 = com.bytedance.common.utility.reflect.Reflect.on((java.lang.Object) r0)     // Catch:{ Throwable -> 0x011d }
                java.lang.String r1 = "setSocketWriteTimeout"
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x011d }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x011d }
                r6[r3] = r7     // Catch:{ Throwable -> 0x011d }
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x011d }
                long r8 = r2.g     // Catch:{ Throwable -> 0x011d }
                int r8 = (int) r8     // Catch:{ Throwable -> 0x011d }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x011d }
                r7[r3] = r8     // Catch:{ Throwable -> 0x011d }
                r0.call(r1, r6, r7)     // Catch:{ Throwable -> 0x011d }
            L_0x011d:
                int r0 = r2.k     // Catch:{ Exception -> 0x01a6 }
                if (r0 <= 0) goto L_0x013c
                java.net.HttpURLConnection r0 = r12.f19803a     // Catch:{ Throwable -> 0x013c }
                com.bytedance.common.utility.reflect.Reflect r0 = com.bytedance.common.utility.reflect.Reflect.on((java.lang.Object) r0)     // Catch:{ Throwable -> 0x013c }
                java.lang.String r1 = "setInputStreamBufferSize"
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x013c }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x013c }
                r6[r3] = r7     // Catch:{ Throwable -> 0x013c }
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x013c }
                int r8 = r2.k     // Catch:{ Throwable -> 0x013c }
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x013c }
                r7[r3] = r8     // Catch:{ Throwable -> 0x013c }
                r0.call(r1, r6, r7)     // Catch:{ Throwable -> 0x013c }
            L_0x013c:
                boolean r0 = r2.j     // Catch:{ Exception -> 0x01a6 }
                r12.g = r0     // Catch:{ Exception -> 0x01a6 }
                int r0 = r2.l     // Catch:{ Exception -> 0x01a6 }
                if (r0 <= 0) goto L_0x015f
                java.net.HttpURLConnection r0 = r12.f19803a     // Catch:{ Throwable -> 0x015f }
                com.bytedance.common.utility.reflect.Reflect r0 = com.bytedance.common.utility.reflect.Reflect.on((java.lang.Object) r0)     // Catch:{ Throwable -> 0x015f }
                java.lang.String r1 = "setRequestFlag"
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x015f }
                java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ Throwable -> 0x015f }
                r6[r3] = r7     // Catch:{ Throwable -> 0x015f }
                java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ Throwable -> 0x015f }
                int r2 = r2.l     // Catch:{ Throwable -> 0x015f }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Throwable -> 0x015f }
                r7[r3] = r2     // Catch:{ Throwable -> 0x015f }
                r0.call(r1, r6, r7)     // Catch:{ Throwable -> 0x015f }
            L_0x015f:
                com.bytedance.retrofit2.client.Request r0 = r12.f19807e     // Catch:{ Exception -> 0x01a6 }
                boolean r0 = r0.isResponseStreaming()     // Catch:{ Exception -> 0x01a6 }
                if (r0 != 0) goto L_0x0191
                java.lang.String r0 = "GET"
                com.bytedance.retrofit2.client.Request r1 = r12.f19807e     // Catch:{ Exception -> 0x01a6 }
                java.lang.String r1 = r1.getMethod()     // Catch:{ Exception -> 0x01a6 }
                java.lang.String r1 = r1.toUpperCase()     // Catch:{ Exception -> 0x01a6 }
                boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x01a6 }
                if (r0 != 0) goto L_0x0191
                java.lang.String r0 = "POST"
                com.bytedance.retrofit2.client.Request r1 = r12.f19807e     // Catch:{ Exception -> 0x01a6 }
                java.lang.String r1 = r1.getMethod()     // Catch:{ Exception -> 0x01a6 }
                java.lang.String r1 = r1.toUpperCase()     // Catch:{ Exception -> 0x01a6 }
                boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x01a6 }
                if (r0 == 0) goto L_0x0191
                java.net.HttpURLConnection r0 = r12.f19803a     // Catch:{ Exception -> 0x01a6 }
                r0.setInstanceFollowRedirects(r3)     // Catch:{ Exception -> 0x01a6 }
                goto L_0x0196
            L_0x0191:
                java.net.HttpURLConnection r0 = r12.f19803a     // Catch:{ Exception -> 0x01a6 }
                r0.setInstanceFollowRedirects(r4)     // Catch:{ Exception -> 0x01a6 }
            L_0x0196:
                java.net.HttpURLConnection r0 = r12.f19803a     // Catch:{ Exception -> 0x01a6 }
                com.bytedance.frameworks.baselib.network.http.cronet.a.c.a((java.net.HttpURLConnection) r0, (com.bytedance.retrofit2.client.Request) r13)     // Catch:{ Exception -> 0x01a6 }
                com.bytedance.frameworks.baselib.network.http.a r13 = r12.f19804b     // Catch:{ Exception -> 0x01a6 }
                java.net.HttpURLConnection r0 = r12.f19803a     // Catch:{ Exception -> 0x01a6 }
                org.json.JSONObject r0 = com.bytedance.frameworks.baselib.network.http.cronet.a.c.b((java.net.HttpURLConnection) r0)     // Catch:{ Exception -> 0x01a6 }
                r13.w = r0     // Catch:{ Exception -> 0x01a6 }
                return
            L_0x01a6:
                r13 = move-exception
                long r6 = r12.f19805c
                com.bytedance.frameworks.baselib.network.http.a r8 = r12.f19804b
                java.lang.String r9 = r12.f19806d
                java.net.HttpURLConnection r11 = r12.f19803a
                r10 = r13
                com.bytedance.frameworks.baselib.network.http.cronet.a.c.a(r5, r6, r8, r9, r10, r11)
                r12.f19808f = r4
                boolean r0 = r13 instanceof java.io.IOException
                if (r0 == 0) goto L_0x01bc
                java.io.IOException r13 = (java.io.IOException) r13
                throw r13
            L_0x01bc:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = r13.getMessage()
                java.lang.Throwable r13 = r13.getCause()
                r0.<init>(r1, r13)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.a.c.a.<init>(com.bytedance.retrofit2.client.Request):void");
        }
    }

    public interface b {
        boolean a();
    }

    public final void a(Map<String, ?> map) {
        if (map != null) {
            Logger.debug();
            b(map);
        }
    }

    public static void a(boolean z, boolean z2, boolean z3, boolean z4) {
        a();
        if (f19798b != null) {
            f19798b.setCronetEngine(f19797a, false, false, false, z4, e.f(), new com.bytedance.frameworks.baselib.network.http.retrofit.a());
        }
    }

    private static void a(String str, com.bytedance.frameworks.baselib.network.http.a aVar) {
        if (!StringUtils.isEmpty(str) && aVar != null) {
            try {
                Logger.debug();
                aVar.f19730a = str;
                if (aVar.f19731b != null) {
                    aVar.f19731b.f19736a = str;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(HttpURLConnection httpURLConnection, com.bytedance.frameworks.baselib.network.http.a aVar) {
        if (httpURLConnection != null && aVar != null) {
            try {
                if (f19798b != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    f19798b.getRequestMetrics(httpURLConnection, linkedHashMap);
                    if (!linkedHashMap.isEmpty()) {
                        aVar.f19730a = (String) a(linkedHashMap.get("remote_ip"), String.class, (T) "");
                        aVar.j = ((Long) a(linkedHashMap.get("dns_time"), Long.class, (T) -1L)).longValue();
                        aVar.k = ((Long) a(linkedHashMap.get("connect_time"), Long.class, (T) -1L)).longValue();
                        aVar.l = ((Long) a(linkedHashMap.get("ssl_time"), Long.class, (T) -1L)).longValue();
                        aVar.m = ((Long) a(linkedHashMap.get("send_time"), Long.class, (T) -1L)).longValue();
                        aVar.n = ((Long) a(linkedHashMap.get("push_time"), Long.class, (T) -1L)).longValue();
                        aVar.o = ((Long) a(linkedHashMap.get("receive_time"), Long.class, (T) -1L)).longValue();
                        aVar.p = ((Boolean) a(linkedHashMap.get("socket_reused"), Boolean.class, (T) Boolean.FALSE)).booleanValue();
                        aVar.q = ((Long) a(linkedHashMap.get("ttfb"), Long.class, (T) -1L)).longValue();
                        aVar.r = ((Long) a(linkedHashMap.get("total_time"), Long.class, (T) -1L)).longValue();
                        aVar.s = ((Long) a(linkedHashMap.get("send_byte_count"), Long.class, (T) -1L)).longValue();
                        aVar.t = ((Long) a(linkedHashMap.get("received_byte_count"), Long.class, (T) -1L)).longValue();
                        aVar.v = (String) a(linkedHashMap.get("request_log"), String.class, (T) "");
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    static void a(HttpURLConnection httpURLConnection, Request request) throws IOException {
        httpURLConnection.setRequestMethod(request.getMethod());
        httpURLConnection.setDoInput(true);
        if (request.headers("Accept-Encoding") == null && request.headers("Range") == null) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        }
        boolean z = false;
        for (Header next : request.getHeaders()) {
            if (!StringUtils.isEmpty(next.getName()) && !StringUtils.isEmpty(next.getValue())) {
                if ("User-Agent".equalsIgnoreCase(next.getName())) {
                    z = true;
                }
                httpURLConnection.setRequestProperty(next.getName(), next.getValue());
            }
        }
        if (!z) {
            String f2 = e.f();
            if (!StringUtils.isEmpty(f2)) {
                if (f19798b != null) {
                    f2 = f2 + " cronet/" + f19798b.getCronetVersion();
                }
                httpURLConnection.setRequestProperty("User-Agent", f2);
            }
        }
        TypedOutput body = request.getBody();
        if (body != null) {
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Type", body.mimeType());
            String md5Stub = body.md5Stub();
            if (md5Stub != null) {
                httpURLConnection.setRequestProperty("X-SS-STUB", md5Stub);
            }
            long length = body.length();
            if (length != -1) {
                httpURLConnection.setFixedLengthStreamingMode((int) length);
                httpURLConnection.setRequestProperty("Content-Length", String.valueOf(length));
                return;
            }
            httpURLConnection.setChunkedStreamingMode(4096);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r2 = r15.getErrorStream();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bc, code lost:
        r2 = new java.lang.StringBuilder("reason = ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c3, code lost:
        if (r1 == null) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c5, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c7, code lost:
        r2.append(r1);
        r2.append("  exception = ");
        r2.append(r0.getMessage());
        r1 = r2.toString();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00b4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(java.lang.String r13, int r14, java.net.HttpURLConnection r15, long r16, com.bytedance.frameworks.baselib.network.http.a r18, java.lang.String r19, int r20) throws java.io.IOException {
        /*
            r0 = r13
            r8 = r14
            r9 = r15
            r7 = r18
            r10 = r20
            r1 = 0
            if (r9 != 0) goto L_0x000d
            byte[] r0 = new byte[r1]
            return r0
        L_0x000d:
            java.lang.String r2 = "gzip"
            java.lang.String r5 = "Content-Encoding"
            java.lang.String r5 = a((java.net.HttpURLConnection) r15, (java.lang.String) r5)
            boolean r2 = r2.equals(r5)
            com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient r5 = f19798b
            if (r5 == 0) goto L_0x0027
            com.bytedance.frameworks.baselib.network.http.cronet.ICronetClient r5 = f19798b
            boolean r5 = r5.isCronetHttpURLConnection(r15)
            if (r5 == 0) goto L_0x0027
            r11 = 0
            goto L_0x0028
        L_0x0027:
            r11 = r2
        L_0x0028:
            java.lang.String r2 = "Content-Type"
            java.lang.String r12 = a((java.net.HttpURLConnection) r15, (java.lang.String) r2)
            r2 = 200(0xc8, float:2.8E-43)
            if (r10 != r2) goto L_0x0083
            long r5 = java.lang.System.currentTimeMillis()
            r7.g = r5
            java.io.InputStream r2 = r15.getInputStream()
            r5 = 1
            int[] r5 = new int[r5]
            r5[r1] = r1     // Catch:{ all -> 0x007e }
            byte[] r6 = com.bytedance.frameworks.baselib.network.http.d.e.a(r11, r14, r2, r5)     // Catch:{ all -> 0x007e }
            com.bytedance.frameworks.baselib.network.http.d.e.a((java.io.Closeable) r2)
            r2 = r5[r1]
            byte[] r8 = new byte[r2]
            if (r6 == 0) goto L_0x0057
            r2 = r5[r1]
            if (r2 <= 0) goto L_0x0057
            r2 = r5[r1]
            java.lang.System.arraycopy(r6, r1, r8, r1, r2)
        L_0x0057:
            boolean r1 = com.bytedance.frameworks.baselib.network.http.d.e.a((java.lang.String) r12)
            if (r1 == 0) goto L_0x0061
            int r1 = r8.length
            com.bytedance.frameworks.baselib.network.http.d.e.a((byte[]) r8, (int) r1)
        L_0x0061:
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r16
            long r5 = java.lang.System.currentTimeMillis()
            r7.h = r5
            a((java.net.HttpURLConnection) r15, (com.bytedance.frameworks.baselib.network.http.a) r7)
            com.bytedance.frameworks.baselib.network.http.e.a(r13, r1, r7)
            r3 = r16
            r5 = r13
            r6 = r19
            r7 = r18
            com.bytedance.frameworks.baselib.network.http.e.a(r1, r3, r5, r6, r7)
            return r8
        L_0x007e:
            r0 = move-exception
            com.bytedance.frameworks.baselib.network.http.d.e.a((java.io.Closeable) r2)
            throw r0
        L_0x0083:
            r1 = 304(0x130, float:4.26E-43)
            if (r10 != r1) goto L_0x00a9
            long r1 = java.lang.System.currentTimeMillis()
            r7.g = r1
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r16
            long r5 = java.lang.System.currentTimeMillis()
            r7.h = r5
            a((java.net.HttpURLConnection) r15, (com.bytedance.frameworks.baselib.network.http.a) r7)
            com.bytedance.frameworks.baselib.network.http.e.a(r13, r1, r7)
            r3 = r16
            r5 = r13
            r6 = r19
            r7 = r18
            com.bytedance.frameworks.baselib.network.http.e.a(r1, r3, r5, r6, r7)
        L_0x00a9:
            java.lang.String r1 = r15.getResponseMessage()
            java.io.InputStream r2 = r15.getInputStream()     // Catch:{ Exception -> 0x00b4 }
            goto L_0x00b8
        L_0x00b2:
            r0 = move-exception
            goto L_0x00bc
        L_0x00b4:
            java.io.InputStream r2 = r15.getErrorStream()     // Catch:{ Throwable -> 0x00b2 }
        L_0x00b8:
            a(r11, r14, r2, r12, r13)     // Catch:{ Throwable -> 0x00b2 }
            goto L_0x00da
        L_0x00bc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "reason = "
            r2.<init>(r3)
            if (r1 != 0) goto L_0x00c7
            java.lang.String r1 = ""
        L_0x00c7:
            r2.append(r1)
            java.lang.String r1 = "  exception = "
            r2.append(r1)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r1 = r2.toString()
        L_0x00da:
            if (r9 == 0) goto L_0x00df
            r15.disconnect()
        L_0x00df:
            com.bytedance.frameworks.baselib.network.http.a.b r0 = new com.bytedance.frameworks.baselib.network.http.a.b
            r0.<init>(r10, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.a.c.a(java.lang.String, int, java.net.HttpURLConnection, long, com.bytedance.frameworks.baselib.network.http.a, java.lang.String, int):byte[]");
    }

    /* JADX INFO: finally extract failed */
    public static void a(boolean z, int i, InputStream inputStream, String str, String str2) throws IOException {
        if (inputStream != null) {
            int[] iArr = new int[1];
            try {
                iArr[0] = 0;
                byte[] a2 = com.bytedance.frameworks.baselib.network.http.d.e.a(z, i, inputStream, iArr);
                com.bytedance.frameworks.baselib.network.http.d.e.a((Closeable) inputStream);
                byte[] bArr = new byte[iArr[0]];
                if (a2 != null && iArr[0] > 0) {
                    System.arraycopy(a2, 0, bArr, 0, iArr[0]);
                }
                if (bArr.length > 0 && !StringUtils.isEmpty(str) && Logger.debug()) {
                    try {
                        com.bytedance.frameworks.baselib.network.http.d.b bVar = new com.bytedance.frameworks.baselib.network.http.d.b(str);
                        if ("text".equalsIgnoreCase(bVar.getPrimaryType()) || "application/json".equalsIgnoreCase(bVar.getBaseType())) {
                            String parameter = bVar.getParameter("charset");
                            if (StringUtils.isEmpty(parameter)) {
                                parameter = "utf-8";
                            }
                            StringBuilder sb = new StringBuilder(" response body = ");
                            sb.append(new String(bArr, parameter));
                            sb.append(" for url = ");
                            if (str2 == null) {
                                str2 = "";
                            }
                            sb.append(str2);
                            Logger.d("SsCronetHttpClient", sb.toString());
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th) {
                com.bytedance.frameworks.baselib.network.http.d.e.a((Closeable) inputStream);
                throw th;
            }
        }
    }

    public static void a(HttpURLConnection httpURLConnection) {
        if (!(httpURLConnection == null || httpURLConnection == null)) {
            httpURLConnection.disconnect();
        }
    }

    private static void a() {
        if (f19798b == null) {
            String str = "org.chromium.CronetClient";
            if (!StringUtils.isEmpty(f19800d)) {
                str = f19800d;
            }
            try {
                Object newInstance = Class.forName(str).newInstance();
                if (newInstance instanceof ICronetClient) {
                    f19798b = (ICronetClient) newInstance;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(b bVar) {
        f19802f = bVar;
    }

    public com.bytedance.retrofit2.client.a newSsCall(Request request) throws IOException {
        return new a(request);
    }

    private c(Context context) {
        f19797a = context.getApplicationContext();
    }

    public static c a(Context context) {
        if (f19801e == null) {
            synchronized (c.class) {
                if (f19801e == null) {
                    f19801e = new c(context);
                    a();
                    e.i a2 = e.a();
                    if (a2 != null) {
                        Map<String, ?> a3 = a2.a();
                        if (a3 != null) {
                            Logger.debug();
                            b(a3);
                        }
                    }
                    e.a((e.j) f19801e);
                }
            }
        }
        return f19801e;
    }

    private static void b(Map<String, ?> map) {
        if (map != null) {
            try {
                Logger.debug();
                if (f19798b != null) {
                    Reflect.on((Object) f19798b).call("syncHttpEncryptConfig", new Class[]{Map.class}, map);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static String a(Exception exc) {
        if (exc == null) {
            return "";
        }
        try {
            String message = exc.getMessage();
            if (message == null) {
                return "";
            }
            String[] split = message.split("\\|");
            if (split != null && split.length >= 2) {
                Logger.debug();
                return split[0];
            }
            return "";
        } catch (Throwable unused) {
        }
    }

    public static JSONObject b(HttpURLConnection httpURLConnection) {
        String str;
        JSONObject jSONObject = new JSONObject();
        if (httpURLConnection == null) {
            return jSONObject;
        }
        try {
            jSONObject.put("hc", "SsCronetHttpClient");
            if (f19798b != null) {
                jSONObject.put("hcv", f19798b.getCronetVersion());
            }
            jSONObject.put("ua", httpURLConnection.getRequestProperty("User-Agent"));
            CookieHandler cookieHandler = CookieHandler.getDefault();
            if (cookieHandler != null) {
                HashMap hashMap = new HashMap();
                String requestProperty = httpURLConnection.getRequestProperty("Cookie");
                if (!StringUtils.isEmpty(requestProperty)) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(requestProperty);
                    hashMap.put("Cookie", arrayList);
                }
                String requestProperty2 = httpURLConnection.getRequestProperty("X-SS-Cookie");
                if (!StringUtils.isEmpty(requestProperty2)) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(requestProperty2);
                    hashMap.put("X-SS-Cookie", arrayList2);
                }
                String requestProperty3 = httpURLConnection.getRequestProperty("X-SS-No-Cookie");
                if (!StringUtils.isEmpty(requestProperty3)) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(requestProperty3);
                    hashMap.put("X-SS-No-Cookie", arrayList3);
                }
                Map<String, List<String>> map = cookieHandler.get(com.bytedance.frameworks.baselib.network.http.util.i.a(httpURLConnection.getURL().toString()), hashMap);
                if (map != null && !map.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    for (String next : map.keySet()) {
                        if (sb.length() > 0) {
                            sb.append(",");
                        }
                        List list = map.get(next);
                        if (next == null) {
                            next = "null";
                        }
                        sb.append(next);
                        sb.append(":");
                        if (list != null) {
                            str = TextUtils.join(", ", list);
                        } else {
                            str = "null";
                        }
                        sb.append(str);
                    }
                    jSONObject.put("cookie", sb.toString());
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private static String c(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return "";
        }
        try {
            Map headerFields = httpURLConnection.getHeaderFields();
            if (headerFields != null) {
                if (!headerFields.isEmpty()) {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : headerFields.entrySet()) {
                        if (entry != null) {
                            String str = (String) entry.getKey();
                            if (!StringUtils.isEmpty(str)) {
                                List<String> list = (List) entry.getValue();
                                if (list != null && !list.isEmpty()) {
                                    StringBuilder sb = new StringBuilder();
                                    int i = 0;
                                    for (String str2 : list) {
                                        if (!StringUtils.isEmpty(str2)) {
                                            if (i == 0) {
                                                sb.append(str2);
                                            } else {
                                                sb.append("; ");
                                                sb.append(str2);
                                            }
                                            i++;
                                        }
                                    }
                                    jSONObject.put(str, sb.toString());
                                }
                            }
                        }
                    }
                    return jSONObject.toString();
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    protected static HttpURLConnection a(String str) throws IOException {
        boolean z;
        a();
        e.h();
        if (f19798b != null) {
            ICronetClient iCronetClient = f19798b;
            Context context = f19797a;
            if (f19802f == null) {
                z = false;
            } else {
                z = f19802f.a();
            }
            HttpURLConnection openConnection = iCronetClient.openConnection(context, str, z, e.f(), new com.bytedance.frameworks.baselib.network.http.retrofit.a());
            openConnection.setConnectTimeout(e.d());
            openConnection.setReadTimeout(e.e());
            return openConnection;
        }
        throw new IllegalArgumentException("CronetClient is null");
    }

    public static String a(HttpURLConnection httpURLConnection, String str) {
        if (httpURLConnection == null || TextUtils.isEmpty(str)) {
            return null;
        }
        String headerField = httpURLConnection.getHeaderField(str);
        if (TextUtils.isEmpty(headerField)) {
            headerField = httpURLConnection.getHeaderField(str.toLowerCase());
        }
        return headerField;
    }

    private static <T> T a(Object obj, Class<T> cls, T t) {
        if (obj == null || !obj.getClass().equals(cls)) {
            return t;
        }
        return obj;
    }

    public static String a(HttpURLConnection httpURLConnection, com.bytedance.frameworks.baselib.network.http.a aVar, int i) {
        if (httpURLConnection == null) {
            return null;
        }
        a(a(httpURLConnection, "x-net-info.remoteaddr"), aVar);
        if (!(aVar == null || aVar.f19731b == null)) {
            aVar.f19731b.f19737b = i;
        }
        return a(httpURLConnection, "X-TT-LOGID");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b A[Catch:{ Throwable -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r11, long r12, com.bytedance.frameworks.baselib.network.http.a r14, java.lang.String r15, java.lang.Exception r16, java.net.HttpURLConnection r17) {
        /*
            r4 = r11
            r6 = r14
            r8 = r17
            if (r4 != 0) goto L_0x0007
            return
        L_0x0007:
            if (r6 == 0) goto L_0x0013
            org.json.JSONObject r0 = r6.w     // Catch:{ Throwable -> 0x002f }
            if (r0 != 0) goto L_0x0013
            org.json.JSONObject r0 = b((java.net.HttpURLConnection) r17)     // Catch:{ Throwable -> 0x002f }
            r6.w = r0     // Catch:{ Throwable -> 0x002f }
        L_0x0013:
            org.json.JSONObject r0 = r6.w     // Catch:{ Throwable -> 0x002f }
            java.lang.String r1 = "ex"
            java.lang.String r2 = r16.getMessage()     // Catch:{ Throwable -> 0x002f }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x002f }
            java.lang.String r0 = c(r17)     // Catch:{ Throwable -> 0x002f }
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x002f }
            if (r1 != 0) goto L_0x002f
            org.json.JSONObject r1 = r6.w     // Catch:{ Throwable -> 0x002f }
            java.lang.String r2 = "response-headers"
            r1.put(r2, r0)     // Catch:{ Throwable -> 0x002f }
        L_0x002f:
            int r0 = r17.getResponseCode()     // Catch:{ Throwable -> 0x004e }
            java.lang.String r1 = "tko"
            java.lang.String r1 = r8.getHeaderField(r1)     // Catch:{ Throwable -> 0x004e }
            r2 = 498(0x1f2, float:6.98E-43)
            if (r0 != r2) goto L_0x004e
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r1)     // Catch:{ Throwable -> 0x004e }
            if (r0 == 0) goto L_0x004e
            com.bytedance.frameworks.baselib.network.http.e$i r0 = com.bytedance.frameworks.baselib.network.http.e.a()     // Catch:{ Throwable -> 0x004e }
            if (r0 == 0) goto L_0x004e
            r0.b()     // Catch:{ Throwable -> 0x004e }
        L_0x004e:
            if (r6 == 0) goto L_0x005f
            java.lang.String r0 = r6.f19730a
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = a((java.lang.Exception) r16)
            a((java.lang.String) r0, (com.bytedance.frameworks.baselib.network.http.a) r14)
        L_0x005f:
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r12
            long r9 = java.lang.System.currentTimeMillis()
            r6.h = r9
            a((java.net.HttpURLConnection) r8, (com.bytedance.frameworks.baselib.network.http.a) r14)
            r7 = r16
            com.bytedance.frameworks.baselib.network.http.e.a(r11, r7, r0, r14)
            r2 = r12
            r4 = r11
            r5 = r15
            r6 = r14
            com.bytedance.frameworks.baselib.network.http.e.a(r0, r2, r4, r5, r6, r7)
            if (r8 == 0) goto L_0x007e
            r17.disconnect()
        L_0x007e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.cronet.a.c.a(java.lang.String, long, com.bytedance.frameworks.baselib.network.http.a, java.lang.String, java.lang.Exception, java.net.HttpURLConnection):void");
    }
}
