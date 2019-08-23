package com.bytedance.frameworks.baselib.network.http.c.a;

import android.content.Context;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.http.b;
import com.bytedance.frameworks.baselib.network.http.c;
import com.bytedance.retrofit2.client.Header;
//import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.j;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.o;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpMethod;
import okio.BufferedSink;
import org.json.JSONObject;

public class e implements c {
    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f19778a;

    /* renamed from: b  reason: collision with root package name */
    public static Context f19779b;

    /* renamed from: c  reason: collision with root package name */
    public static b f19780c;

    /* renamed from: d  reason: collision with root package name */
    public static a f19781d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile e f19782e;

    public static class a implements com.bytedance.retrofit2.client.a, j {

        /* renamed from: a  reason: collision with root package name */
        OkHttpClient f19783a;

        /* renamed from: b  reason: collision with root package name */
        com.bytedance.frameworks.baselib.network.http.a f19784b = com.bytedance.frameworks.baselib.network.http.a.a();

        /* renamed from: c  reason: collision with root package name */
        long f19785c = 0;

        /* renamed from: d  reason: collision with root package name */
        ResponseBody f19786d;

        /* renamed from: e  reason: collision with root package name */
        String f19787e;

        /* renamed from: f  reason: collision with root package name */
        com.bytedance.retrofit2.client.Request f19788f;
        okhttp3.Request g;
        Response h;
        Call i;
        boolean j;

        public final Object getRequestInfo() {
            return this.f19784b;
        }

        public final void b() {
            if (this.i != null) {
                this.i.cancel();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:101:0x01bb A[Catch:{ all -> 0x01c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x005f A[Catch:{ Exception -> 0x016b, all -> 0x0169 }] */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x009a A[Catch:{ Exception -> 0x016b, all -> 0x0169 }] */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00b9 A[Catch:{ Exception -> 0x016b, all -> 0x0169 }] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0112 A[Catch:{ Exception -> 0x016b, all -> 0x0169 }] */
        /* JADX WARNING: Removed duplicated region for block: B:68:0x0152  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0179 A[Catch:{ all -> 0x01c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:87:0x0184 A[Catch:{ all -> 0x01c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x0195 A[Catch:{ all -> 0x01c9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x01b8 A[Catch:{ all -> 0x01c9 }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.retrofit2.client.Response a() throws java.io.IOException {
            /*
                r13 = this;
                com.bytedance.retrofit2.client.Request r0 = r13.f19788f
                java.lang.String r0 = r0.getUrl()
                boolean r1 = com.bytedance.frameworks.baselib.network.http.c.a.e.f19778a
                if (r1 != 0) goto L_0x01ed
                okhttp3.Call r1 = r13.i
                if (r1 == 0) goto L_0x001f
                okhttp3.Call r1 = r13.i
                boolean r1 = r1.isCanceled()
                if (r1 != 0) goto L_0x0017
                goto L_0x001f
            L_0x0017:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "request canceled"
                r0.<init>(r1)
                throw r0
            L_0x001f:
                boolean r1 = r13.j
                if (r1 != 0) goto L_0x0038
                android.content.Context r1 = com.bytedance.frameworks.baselib.network.http.c.a.e.f19779b
                if (r1 == 0) goto L_0x0038
                android.content.Context r1 = com.bytedance.frameworks.baselib.network.http.c.a.e.f19779b
                boolean r1 = com.bytedance.common.utility.NetworkUtils.isNetworkAvailable(r1)
                if (r1 == 0) goto L_0x0030
                goto L_0x0038
            L_0x0030:
                com.bytedance.frameworks.baselib.network.http.a.c r0 = new com.bytedance.frameworks.baselib.network.http.a.c
                java.lang.String r1 = "network not available"
                r0.<init>((java.lang.String) r1)
                throw r0
            L_0x0038:
                r10 = 1
                r8 = 0
                com.bytedance.retrofit2.client.Request r1 = r13.f19788f     // Catch:{ Exception -> 0x0172, all -> 0x016f }
                boolean r1 = r1.isResponseStreaming()     // Catch:{ Exception -> 0x0172, all -> 0x016f }
                if (r1 != 0) goto L_0x0057
                com.bytedance.frameworks.baselib.network.http.e$g r1 = com.bytedance.frameworks.baselib.network.http.e.b()     // Catch:{ Exception -> 0x0172, all -> 0x016f }
                if (r1 == 0) goto L_0x0057
                boolean r1 = r1.c(r0)     // Catch:{ Exception -> 0x0172, all -> 0x016f }
                if (r1 == 0) goto L_0x0057
                com.bytedance.frameworks.baselib.network.a.e r1 = com.bytedance.frameworks.baselib.network.a.e.b()     // Catch:{ Exception -> 0x0172, all -> 0x016f }
                r1.c()     // Catch:{ Exception -> 0x0172, all -> 0x016f }
                r9 = 1
                goto L_0x0058
            L_0x0057:
                r9 = 0
            L_0x0058:
                okhttp3.OkHttpClient r1 = r13.f19783a     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                okhttp3.Call r2 = r13.i     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                r3 = 0
                if (r1 == 0) goto L_0x0067
                if (r2 != 0) goto L_0x0062
                goto L_0x0067
            L_0x0062:
                okhttp3.Response r1 = r2.execute()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                goto L_0x0068
            L_0x0067:
                r1 = r3
            L_0x0068:
                r13.h = r1     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                com.bytedance.frameworks.baselib.network.http.a r1 = r13.f19784b     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                r1.f19735f = r4     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                okhttp3.Call r1 = r13.i     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                if (r1 == 0) goto L_0x008c
                okhttp3.Call r1 = r13.i     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                okhttp3.internal.connection.StreamAllocation r1 = r1.streamAllocation()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                if (r1 == 0) goto L_0x008c
                com.bytedance.frameworks.baselib.network.http.a r1 = r13.f19784b     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                okhttp3.Call r2 = r13.i     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                okhttp3.internal.connection.StreamAllocation r2 = r2.streamAllocation()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                int r2 = r2.recycleCount()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                r1.i = r2     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            L_0x008c:
                okhttp3.Response r1 = r13.h     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                com.bytedance.frameworks.baselib.network.http.a r2 = r13.f19784b     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                java.lang.String r1 = com.bytedance.frameworks.baselib.network.http.c.a.e.a((okhttp3.Response) r1, (com.bytedance.frameworks.baselib.network.http.a) r2)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                r13.f19787e = r1     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                com.bytedance.frameworks.baselib.network.http.c.a.a r1 = com.bytedance.frameworks.baselib.network.http.c.a.e.f19781d     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                if (r1 == 0) goto L_0x00a3
                com.bytedance.frameworks.baselib.network.http.c.a.a r1 = com.bytedance.frameworks.baselib.network.http.c.a.e.f19781d     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                okhttp3.Request r2 = r13.g     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                okhttp3.Response r4 = r13.h     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                r1.a((okhttp3.Request) r2, (okhttp3.Response) r4)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            L_0x00a3:
                okhttp3.Response r1 = r13.h     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                int r11 = r1.code()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                okhttp3.Response r1 = r13.h     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                java.lang.String r2 = "Content-Type"
                java.lang.String r12 = r1.header(r2)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                com.bytedance.retrofit2.client.Request r1 = r13.f19788f     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                boolean r1 = r1.isResponseStreaming()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                if (r1 == 0) goto L_0x0112
                okhttp3.Response r1 = r13.h     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                java.lang.String r2 = "Content-Encoding"
                java.lang.String r1 = r1.header(r2)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                if (r1 == 0) goto L_0x00cd
                java.lang.String r2 = "gzip"
                boolean r1 = r2.equalsIgnoreCase(r1)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                if (r1 == 0) goto L_0x00cd
                r1 = 1
                goto L_0x00ce
            L_0x00cd:
                r1 = 0
            L_0x00ce:
                r2 = 200(0xc8, float:2.8E-43)
                if (r11 < r2) goto L_0x00ee
                r2 = 300(0x12c, float:4.2E-43)
                if (r11 >= r2) goto L_0x00ee
                okhttp3.Response r2 = r13.h     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                okhttp3.ResponseBody r2 = r2.body()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                long r4 = r2.contentLength()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                r6 = 0
                int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r12 != 0) goto L_0x00e7
                goto L_0x00ec
            L_0x00e7:
                com.bytedance.frameworks.baselib.network.http.c.a.e$a$2 r3 = new com.bytedance.frameworks.baselib.network.http.c.a.e$a$2     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                r3.<init>(r2, r1)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            L_0x00ec:
                r6 = r3
                goto L_0x012d
            L_0x00ee:
                okhttp3.Response r2 = r13.h     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                java.lang.String r2 = r2.message()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                com.bytedance.retrofit2.client.Request r3 = r13.f19788f     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                int r3 = r3.getMaxLength()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                okhttp3.Response r4 = r13.h     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                okhttp3.ResponseBody r4 = r4.body()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                if (r4 == 0) goto L_0x010c
                java.io.InputStream r5 = r4.byteStream()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                com.bytedance.frameworks.baselib.network.http.c.a.e.a(r1, r3, r5, r12)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                com.bytedance.frameworks.baselib.network.http.d.e.a((java.io.Closeable) r4)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            L_0x010c:
                com.bytedance.frameworks.baselib.network.http.a.b r1 = new com.bytedance.frameworks.baselib.network.http.a.b     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                r1.<init>(r11, r2)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                throw r1     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
            L_0x0112:
                com.bytedance.retrofit2.client.Request r1 = r13.f19788f     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                int r2 = r1.getMaxLength()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                okhttp3.Response r3 = r13.h     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                long r4 = r13.f19785c     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                com.bytedance.frameworks.baselib.network.http.a r6 = r13.f19784b     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                java.lang.String r7 = r13.f19787e     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                r1 = r0
                byte[] r1 = com.bytedance.frameworks.baselib.network.http.c.a.e.a(r1, r2, r3, r4, r6, r7)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                com.bytedance.retrofit2.mime.TypedByteArray r2 = new com.bytedance.retrofit2.mime.TypedByteArray     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                java.lang.String[] r3 = new java.lang.String[r8]     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                r2.<init>(r12, r1, r3)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                r6 = r2
            L_0x012d:
                com.bytedance.retrofit2.client.Response r7 = new com.bytedance.retrofit2.client.Response     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                okhttp3.Response r1 = r13.h     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                java.lang.String r4 = r1.message()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                okhttp3.Response r1 = r13.h     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                okhttp3.Headers r1 = r1.headers()     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                java.util.List r5 = a(r1)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                r1 = r7
                r2 = r0
                r3 = r11
                r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                com.bytedance.frameworks.baselib.network.http.a r1 = r13.f19784b     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                r7.setExtraInfo(r1)     // Catch:{ Exception -> 0x016b, all -> 0x0169 }
                com.bytedance.retrofit2.client.Request r0 = r13.f19788f
                boolean r0 = r0.isResponseStreaming()
                if (r0 != 0) goto L_0x0157
                okhttp3.ResponseBody r0 = r13.f19786d
                com.bytedance.frameworks.baselib.network.http.c.a.e.a((okhttp3.ResponseBody) r0)
            L_0x0157:
                com.bytedance.retrofit2.client.Request r0 = r13.f19788f
                boolean r0 = r0.isResponseStreaming()
                if (r0 != 0) goto L_0x0168
                if (r9 == 0) goto L_0x0168
                com.bytedance.frameworks.baselib.network.a.e r0 = com.bytedance.frameworks.baselib.network.a.e.b()
                r0.d()
            L_0x0168:
                return r7
            L_0x0169:
                r0 = move-exception
                goto L_0x01cc
            L_0x016b:
                r1 = move-exception
                r11 = r1
                r12 = r9
                goto L_0x0175
            L_0x016f:
                r0 = move-exception
                r9 = 0
                goto L_0x01cc
            L_0x0172:
                r1 = move-exception
                r11 = r1
                r12 = 0
            L_0x0175:
                com.bytedance.frameworks.baselib.network.http.c.a.a r1 = com.bytedance.frameworks.baselib.network.http.c.a.e.f19781d     // Catch:{ all -> 0x01c9 }
                if (r1 == 0) goto L_0x0180
                com.bytedance.frameworks.baselib.network.http.c.a.a r1 = com.bytedance.frameworks.baselib.network.http.c.a.e.f19781d     // Catch:{ all -> 0x01c9 }
                okhttp3.Request r2 = r13.g     // Catch:{ all -> 0x01c9 }
                r1.a((okhttp3.Request) r2, (java.lang.Exception) r11)     // Catch:{ all -> 0x01c9 }
            L_0x0180:
                boolean r1 = r11 instanceof com.bytedance.frameworks.baselib.network.http.a.b     // Catch:{ all -> 0x01c9 }
                if (r1 == 0) goto L_0x0191
                r1 = r11
                com.bytedance.frameworks.baselib.network.http.a.b r1 = (com.bytedance.frameworks.baselib.network.http.a.b) r1     // Catch:{ all -> 0x01c9 }
                int r2 = r1.getStatusCode()     // Catch:{ all -> 0x01c9 }
                r3 = 304(0x130, float:4.26E-43)
                if (r2 == r3) goto L_0x0190
                goto L_0x0191
            L_0x0190:
                throw r1     // Catch:{ all -> 0x01c9 }
            L_0x0191:
                boolean r1 = r11 instanceof java.io.IOException     // Catch:{ all -> 0x01c9 }
                if (r1 == 0) goto L_0x01a3
                java.lang.String r1 = "Canceled"
                java.lang.String r2 = r11.getMessage()     // Catch:{ all -> 0x01c9 }
                boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x01c9 }
                if (r1 != 0) goto L_0x01a2
                goto L_0x01a3
            L_0x01a2:
                throw r11     // Catch:{ all -> 0x01c9 }
            L_0x01a3:
                okhttp3.Request r1 = r13.g     // Catch:{ all -> 0x01c9 }
                long r3 = r13.f19785c     // Catch:{ all -> 0x01c9 }
                com.bytedance.frameworks.baselib.network.http.a r5 = r13.f19784b     // Catch:{ all -> 0x01c9 }
                java.lang.String r6 = r13.f19787e     // Catch:{ all -> 0x01c9 }
                okhttp3.Call r8 = r13.i     // Catch:{ all -> 0x01c9 }
                okhttp3.Response r9 = r13.h     // Catch:{ all -> 0x01c9 }
                r2 = r0
                r7 = r11
                com.bytedance.frameworks.baselib.network.http.c.a.e.a(r1, r2, r3, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x01c9 }
                boolean r0 = r11 instanceof java.io.IOException     // Catch:{ all -> 0x01c9 }
                if (r0 == 0) goto L_0x01bb
                java.io.IOException r11 = (java.io.IOException) r11     // Catch:{ all -> 0x01c9 }
                throw r11     // Catch:{ all -> 0x01c9 }
            L_0x01bb:
                java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x01c9 }
                java.lang.String r1 = r11.getMessage()     // Catch:{ all -> 0x01c9 }
                java.lang.Throwable r2 = r11.getCause()     // Catch:{ all -> 0x01c9 }
                r0.<init>(r1, r2)     // Catch:{ all -> 0x01c9 }
                throw r0     // Catch:{ all -> 0x01c9 }
            L_0x01c9:
                r0 = move-exception
                r9 = r12
                r8 = 1
            L_0x01cc:
                com.bytedance.retrofit2.client.Request r1 = r13.f19788f
                boolean r1 = r1.isResponseStreaming()
                if (r1 == 0) goto L_0x01d6
                if (r8 == 0) goto L_0x01db
            L_0x01d6:
                okhttp3.ResponseBody r1 = r13.f19786d
                com.bytedance.frameworks.baselib.network.http.c.a.e.a((okhttp3.ResponseBody) r1)
            L_0x01db:
                com.bytedance.retrofit2.client.Request r1 = r13.f19788f
                boolean r1 = r1.isResponseStreaming()
                if (r1 != 0) goto L_0x01ec
                if (r9 == 0) goto L_0x01ec
                com.bytedance.frameworks.baselib.network.a.e r1 = com.bytedance.frameworks.baselib.network.a.e.b()
                r1.d()
            L_0x01ec:
                throw r0
            L_0x01ed:
                com.bytedance.frameworks.baselib.network.http.a.e r0 = new com.bytedance.frameworks.baselib.network.http.a.e
                java.lang.String r1 = "request is not allowed using network"
                r0.<init>((java.lang.String) r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.c.a.e.a.a():com.bytedance.retrofit2.client.Response");
        }

        private static List<Header> a(Headers headers) {
            int size = headers.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(new Header(headers.name(i2), headers.value(i2)));
            }
            return arrayList;
        }

        public a(com.bytedance.retrofit2.client.Request request) throws IOException {
            String str;
            RequestBody requestBody = null;
            this.f19786d = null;
            this.f19787e = null;
            this.j = false;
            this.f19783a = e.f19780c.a();
            this.f19788f = request;
            String url = this.f19788f.getUrl();
            o metrics = request.getMetrics();
            if (metrics != null) {
                this.f19784b.f19732c = metrics.f21929a;
                this.f19784b.f19733d = metrics.f21930b;
            }
            this.f19785c = System.currentTimeMillis();
            this.f19784b.f19734e = this.f19785c;
            this.f19784b.u = 1;
            if (this.f19788f.isResponseStreaming()) {
                this.f19784b.x = true;
            } else {
                this.f19784b.x = false;
            }
            try {
                OkHttpClient.Builder newBuilder = this.f19783a.newBuilder();
                if (this.f19788f.isResponseStreaming()) {
                    newBuilder.followRedirects(true);
                } else if ("GET".equals(this.f19788f.getMethod().toUpperCase())) {
                    newBuilder.followRedirects(true);
                } else if ("POST".equals(this.f19788f.getMethod().toUpperCase())) {
                    newBuilder.followRedirects(false);
                } else {
                    newBuilder.followRedirects(true);
                }
                newBuilder.connectTimeout((long) com.bytedance.frameworks.baselib.network.http.e.d(), TimeUnit.MILLISECONDS);
                newBuilder.readTimeout((long) com.bytedance.frameworks.baselib.network.http.e.e(), TimeUnit.MILLISECONDS);
                newBuilder.writeTimeout((long) com.bytedance.frameworks.baselib.network.http.e.e(), TimeUnit.MILLISECONDS);
                if (request.getExtraInfo() instanceof b) {
                    this.f19784b.f19731b = (b) request.getExtraInfo();
                    T t = this.f19784b.f19731b;
                    if (t.f19738c > 0 || t.f19739d > 0 || t.f19740e > 0) {
                        if (t.f19738c > 0) {
                            newBuilder.connectTimeout(t.f19738c, TimeUnit.MILLISECONDS);
                        }
                        if (t.f19740e > 0) {
                            newBuilder.writeTimeout(t.f19740e, TimeUnit.MILLISECONDS);
                        }
                        if (t.f19739d > 0) {
                            newBuilder.readTimeout(t.f19739d, TimeUnit.MILLISECONDS);
                        }
                    }
                    this.j = t.j;
                }
                this.f19783a = newBuilder.build();
                Request.Builder url2 = new Request.Builder().url(url);
                if (!HttpMethod.permitsRequestBody(this.f19788f.getMethod())) {
                    str = this.f19788f.getMethod();
                } else {
                    str = this.f19788f.getMethod();
                    final TypedOutput body = this.f19788f.getBody();
                    if (body == null) {
                        requestBody = RequestBody.create((MediaType) null, "body=null");
                    } else {
                        final MediaType parse = MediaType.parse(body.mimeType());
                        requestBody = new RequestBody() {
                            public final MediaType contentType() {
                                return parse;
                            }

                            public final long contentLength() {
                                return body.length();
                            }

                            public final void writeTo(BufferedSink bufferedSink) throws IOException {
                                body.writeTo(bufferedSink.outputStream());
                            }
                        };
                    }
                }
                Request.Builder method = url2.method(str, requestBody);
                List<Header> headers = this.f19788f.getHeaders();
                if (this.f19788f.getBody() != null) {
                    String md5Stub = this.f19788f.getBody().md5Stub();
                    if (md5Stub != null) {
                        method.addHeader("X-SS-STUB", md5Stub);
                    }
                }
                this.g = e.a(method, headers);
                this.i = this.f19783a.newCall(this.g);
                this.f19784b.w = e.a(this.g);
            } catch (Exception e2) {
                e.a(this.g, url, this.f19785c, this.f19784b, this.f19787e, e2, this.i, this.h);
                if (e2 instanceof IOException) {
                    throw ((IOException) e2);
                }
                throw new IOException(e2.getMessage(), e2.getCause());
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public static byte[] a(String str, int i, Response response, long j, com.bytedance.frameworks.baselib.network.http.a aVar, String str2) throws IOException {
        String str3 = str;
        int i2 = i;
        Response response2 = response;
        com.bytedance.frameworks.baselib.network.http.a aVar2 = aVar;
        if (response2 == null) {
            return new byte[0];
        }
        int code = response.code();
        ResponseBody body = response.body();
        boolean equals = "gzip".equals(response2.header("Content-Encoding"));
        String header = response2.header("Content-Type");
        if (code != 200) {
            if (code == 304) {
                aVar2.g = System.currentTimeMillis();
                long currentTimeMillis = System.currentTimeMillis() - j;
                aVar2.h = System.currentTimeMillis();
                com.bytedance.frameworks.baselib.network.http.e.a(str, currentTimeMillis, aVar2);
                com.bytedance.frameworks.baselib.network.http.e.a(currentTimeMillis, j, str, str2, aVar);
            }
            String message = response.message();
            if (body != null) {
                a(equals, i, body.byteStream(), header);
                com.bytedance.frameworks.baselib.network.http.d.e.a((Closeable) body);
            }
            throw new com.bytedance.frameworks.baselib.network.http.a.b(code, message);
        } else if (body == null) {
            return new byte[0];
        } else {
            aVar2.g = System.currentTimeMillis();
            InputStream byteStream = body.byteStream();
            int[] iArr = new int[1];
            try {
                iArr[0] = 0;
                byte[] a2 = com.bytedance.frameworks.baselib.network.http.d.e.a(equals, i, byteStream, iArr);
                com.bytedance.frameworks.baselib.network.http.d.e.a((Closeable) byteStream);
                byte[] bArr = new byte[iArr[0]];
                if (a2 != null && iArr[0] > 0) {
                    System.arraycopy(a2, 0, bArr, 0, iArr[0]);
                }
                if (com.bytedance.frameworks.baselib.network.http.d.e.a(header)) {
                    com.bytedance.frameworks.baselib.network.http.d.e.a(bArr, bArr.length);
                }
                long currentTimeMillis2 = System.currentTimeMillis() - j;
                aVar2.h = System.currentTimeMillis();
                com.bytedance.frameworks.baselib.network.http.e.a(str, currentTimeMillis2, aVar2);
                com.bytedance.frameworks.baselib.network.http.e.a(currentTimeMillis2, j, str, str2, aVar);
                return bArr;
            } catch (Throwable th) {
                com.bytedance.frameworks.baselib.network.http.d.e.a((Closeable) byteStream);
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public static void a(boolean z, int i, InputStream inputStream, String str) throws IOException {
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
                            StringUtils.isEmpty(bVar.getParameter("charset"));
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

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002d */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004b A[Catch:{ Throwable -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(okhttp3.Request r9, java.lang.String r10, long r11, com.bytedance.frameworks.baselib.network.http.a r13, java.lang.String r14, java.lang.Exception r15, okhttp3.Call r16, okhttp3.Response r17) {
        /*
            r4 = r10
            r6 = r13
            if (r4 != 0) goto L_0x0005
            return
        L_0x0005:
            if (r6 == 0) goto L_0x0011
            org.json.JSONObject r0 = r6.w     // Catch:{ Throwable -> 0x002d }
            if (r0 != 0) goto L_0x0011
            org.json.JSONObject r0 = a((okhttp3.Request) r9)     // Catch:{ Throwable -> 0x002d }
            r6.w = r0     // Catch:{ Throwable -> 0x002d }
        L_0x0011:
            org.json.JSONObject r0 = r6.w     // Catch:{ Throwable -> 0x002d }
            java.lang.String r1 = "ex"
            java.lang.String r2 = r15.getMessage()     // Catch:{ Throwable -> 0x002d }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x002d }
            java.lang.String r0 = a((okhttp3.Response) r17)     // Catch:{ Throwable -> 0x002d }
            boolean r1 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x002d }
            if (r1 != 0) goto L_0x002d
            org.json.JSONObject r1 = r6.w     // Catch:{ Throwable -> 0x002d }
            java.lang.String r2 = "response-headers"
            r1.put(r2, r0)     // Catch:{ Throwable -> 0x002d }
        L_0x002d:
            int r0 = r17.code()     // Catch:{ Throwable -> 0x004e }
            java.lang.String r1 = "tko"
            r2 = r17
            java.lang.String r1 = r2.header(r1)     // Catch:{ Throwable -> 0x004e }
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
            java.lang.String r0 = a((java.lang.Exception) r15)
            a((java.lang.String) r0, (com.bytedance.frameworks.baselib.network.http.a) r13)
        L_0x005f:
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r11
            long r7 = java.lang.System.currentTimeMillis()
            r6.h = r7
            r7 = r15
            com.bytedance.frameworks.baselib.network.http.e.a(r10, r15, r0, r13)
            r2 = r11
            r4 = r10
            r5 = r14
            r6 = r13
            com.bytedance.frameworks.baselib.network.http.e.a(r0, r2, r4, r5, r6, r7)
            if (r16 == 0) goto L_0x007a
            r16.cancel()
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.c.a.e.a(okhttp3.Request, java.lang.String, long, com.bytedance.frameworks.baselib.network.http.a, java.lang.String, java.lang.Exception, okhttp3.Call, okhttp3.Response):void");
    }

    public static void a(ResponseBody responseBody) {
        if (responseBody != null) {
            com.bytedance.frameworks.baselib.network.http.d.e.a((Closeable) responseBody);
        }
    }

    public com.bytedance.retrofit2.client.a newSsCall(com.bytedance.retrofit2.client.Request request) throws IOException {
        return new a(request);
    }

    private e(Context context) {
        f19779b = context.getApplicationContext();
        f19780c = new b();
    }

    public static e a(Context context) {
        if (f19782e == null) {
            synchronized (e.class) {
                if (f19782e == null) {
                    f19782e = new e(context);
                }
            }
        }
        return f19782e;
    }

    private static String a(Exception exc) {
        if (exc == null) {
            return "";
        }
        try {
            String[] split = exc.getMessage().split("\\|");
            if (split != null && split.length >= 2) {
                Logger.debug();
                return split[0];
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    private static String a(Response response) {
        if (response == null) {
            return "";
        }
        try {
            Headers headers = response.headers();
            if (headers == null) {
                return "";
            }
            JSONObject jSONObject = new JSONObject();
            for (String next : headers.names()) {
                if (!StringUtils.isEmpty(next)) {
                    List<String> values = headers.values(next);
                    if (values != null && !values.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        int i = 0;
                        for (String next2 : values) {
                            if (!StringUtils.isEmpty(next2)) {
                                if (i == 0) {
                                    sb.append(next2);
                                } else {
                                    sb.append("; ");
                                    sb.append(next2);
                                }
                                i++;
                            }
                        }
                        jSONObject.put(next, sb.toString());
                    }
                }
            }
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3 = com.bytedance.frameworks.baselib.network.http.util.i.b(r7.url().toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0059 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject a(okhttp3.Request r7) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r7 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.lang.String r1 = "hc"
            java.lang.String r2 = "SsOkHttp3Client"
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r1 = "hcv"
            java.lang.String r2 = "ok/3.10.0.2"
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r1 = "ua"
            java.lang.String r2 = "User-Agent"
            java.lang.String r2 = r7.header(r2)     // Catch:{ Exception -> 0x00c0 }
            r0.put(r1, r2)     // Catch:{ Exception -> 0x00c0 }
            java.net.CookieHandler r1 = java.net.CookieHandler.getDefault()     // Catch:{ Exception -> 0x00c0 }
            if (r1 == 0) goto L_0x00c0
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x00c0 }
            r2.<init>()     // Catch:{ Exception -> 0x00c0 }
            okhttp3.Headers r3 = r7.headers()     // Catch:{ Exception -> 0x00c0 }
            if (r3 == 0) goto L_0x0050
            java.util.Set r4 = r3.names()     // Catch:{ Exception -> 0x00c0 }
            if (r4 == 0) goto L_0x0050
            java.util.Iterator r4 = r4.iterator()     // Catch:{ Exception -> 0x00c0 }
        L_0x003c:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x00c0 }
            if (r5 == 0) goto L_0x0050
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x00c0 }
            java.util.List r6 = r3.values(r5)     // Catch:{ Exception -> 0x00c0 }
            r2.put(r5, r6)     // Catch:{ Exception -> 0x00c0 }
            goto L_0x003c
        L_0x0050:
            okhttp3.HttpUrl r3 = r7.url()     // Catch:{ Exception -> 0x0059 }
            java.net.URI r3 = r3.uri()     // Catch:{ Exception -> 0x0059 }
            goto L_0x0065
        L_0x0059:
            okhttp3.HttpUrl r7 = r7.url()     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00c0 }
            java.net.URI r3 = com.bytedance.frameworks.baselib.network.http.util.i.b(r7)     // Catch:{ Exception -> 0x00c0 }
        L_0x0065:
            java.util.Map r7 = r1.get(r3, r2)     // Catch:{ Exception -> 0x00c0 }
            if (r7 == 0) goto L_0x00c0
            boolean r1 = r7.isEmpty()     // Catch:{ Exception -> 0x00c0 }
            if (r1 != 0) goto L_0x00c0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c0 }
            r1.<init>()     // Catch:{ Exception -> 0x00c0 }
            java.util.Set r2 = r7.keySet()     // Catch:{ Exception -> 0x00c0 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x00c0 }
        L_0x007e:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x00c0 }
            if (r3 == 0) goto L_0x00b7
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00c0 }
            int r4 = r1.length()     // Catch:{ Exception -> 0x00c0 }
            if (r4 <= 0) goto L_0x0095
            java.lang.String r4 = ","
            r1.append(r4)     // Catch:{ Exception -> 0x00c0 }
        L_0x0095:
            java.lang.Object r4 = r7.get(r3)     // Catch:{ Exception -> 0x00c0 }
            java.util.List r4 = (java.util.List) r4     // Catch:{ Exception -> 0x00c0 }
            if (r3 == 0) goto L_0x009e
            goto L_0x00a0
        L_0x009e:
            java.lang.String r3 = "null"
        L_0x00a0:
            r1.append(r3)     // Catch:{ Exception -> 0x00c0 }
            java.lang.String r3 = ":"
            r1.append(r3)     // Catch:{ Exception -> 0x00c0 }
            if (r4 == 0) goto L_0x00b1
            java.lang.String r3 = ", "
            java.lang.String r3 = android.text.TextUtils.join(r3, r4)     // Catch:{ Exception -> 0x00c0 }
            goto L_0x00b3
        L_0x00b1:
            java.lang.String r3 = "null"
        L_0x00b3:
            r1.append(r3)     // Catch:{ Exception -> 0x00c0 }
            goto L_0x007e
        L_0x00b7:
            java.lang.String r7 = "cookie"
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00c0 }
            r0.put(r7, r1)     // Catch:{ Exception -> 0x00c0 }
        L_0x00c0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.c.a.e.a(okhttp3.Request):org.json.JSONObject");
    }

    public static String a(Response response, com.bytedance.frameworks.baselib.network.http.a aVar) {
        if (response == null) {
            return null;
        }
        a(response.header("x-net-info.remoteaddr"), aVar);
        if (!(aVar == null || aVar.f19731b == null)) {
            aVar.f19731b.f19737b = response.code();
        }
        return response.header("X-TT-LOGID");
    }

    public static okhttp3.Request a(Request.Builder builder, List<Header> list) throws IOException {
        if (builder == null) {
            return null;
        }
        builder.addHeader("Accept-Encoding", "gzip");
        boolean z = false;
        if (list != null) {
            for (Header next : list) {
                if (!StringUtils.isEmpty(next.getName()) && !StringUtils.isEmpty(next.getValue())) {
                    if ("User-Agent".equals(next.getName())) {
                        z = true;
                    }
                    builder.header(next.getName(), next.getValue());
                }
            }
        }
        if (!z) {
            String f2 = com.bytedance.frameworks.baselib.network.http.e.f();
            if (!StringUtils.isEmpty(f2)) {
                builder.header("User-Agent", f2 + " ok/3.10.0.2");
            }
        }
        return builder.build();
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
}
