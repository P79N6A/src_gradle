package com.huawei.android.pushselfshow.utils.b;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushselfshow.utils.a;
import java.io.File;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpRequestBase;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public Handler f25374a;

    /* renamed from: b  reason: collision with root package name */
    public Context f25375b;

    /* renamed from: c  reason: collision with root package name */
    public String f25376c;

    /* renamed from: d  reason: collision with root package name */
    public String f25377d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f25378e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f25379f;
    private Runnable g;

    public b() {
        this.g = new c(this);
        this.f25379f = false;
    }

    public b(Handler handler, Context context, String str, String str2) {
        this.g = new c(this);
        this.f25374a = handler;
        this.f25375b = context;
        this.f25376c = str;
        this.f25377d = str2;
        this.f25379f = false;
    }

    public static String a(Context context) {
        return b(context) + File.separator + "richpush";
    }

    public static void a(HttpClient httpClient) {
        if (httpClient != null) {
            try {
                httpClient.getConnectionManager().shutdown();
            } catch (Exception e2) {
                e.c("PushSelfShowLog", "close input stream failed." + e2.getMessage(), e2);
            }
        }
    }

    public static void a(HttpRequestBase httpRequestBase) {
        if (httpRequestBase != null) {
            try {
                httpRequestBase.abort();
            } catch (Exception e2) {
                e.c("PushSelfShowLog", "close input stream failed." + e2.getMessage(), e2);
            }
        }
    }

    public static String b(Context context) {
        String str;
        String str2;
        try {
            str = !Environment.getExternalStorageState().equals("mounted") ? context.getFilesDir().getPath() : a.k(context);
        } catch (Exception e2) {
            e.c("PushSelfShowLog", "getLocalFileHeader failed ", e2);
            str = "";
        }
        e.a("PushSelfShowLog", "getFileHeader:" + str2);
        return str2;
    }

    public static String c(Context context) {
        String str;
        try {
            if (!Environment.getExternalStorageState().equals("mounted")) {
                return null;
            }
            str = a.k(context);
            return str + File.separator + "PushService";
        } catch (Exception e2) {
            e.c("PushSelfShowLog", "getLocalFileHeader failed ", e2);
            str = "";
        }
    }

    public String a(Context context, String str, String str2) {
        try {
            String str3 = System.currentTimeMillis();
            String str4 = str3 + str2;
            String str5 = r0 + File.separator + str4;
            File file = new File(a(context) + File.separator + str3);
            if (!file.exists()) {
                e.a("PushSelfShowLog", "dir is not exists()," + file.getAbsolutePath());
            } else {
                a.a(file);
            }
            if (file.mkdirs()) {
                e.a("PushSelfShowLog", "dir.mkdirs() success  ");
            }
            e.a("PushSelfShowLog", "begin to download zip file, path is " + str5 + ",dir is " + file.getAbsolutePath());
            if (b(context, str, str5)) {
                return str5;
            }
            e.a("PushSelfShowLog", "download richpush file failed，clear temp file");
            if (file.exists()) {
                a.a(file);
            }
            return null;
        } catch (Exception e2) {
            e.a("PushSelfShowLog", "download err" + e2.toString());
        }
    }

    public void a() {
        this.f25379f = true;
    }

    public void a(String str) {
        Message message = new Message();
        message.what = 1;
        message.obj = str;
        e.a("PushSelfShowLog", "mDownloadHandler = " + this.f25374a);
        if (this.f25374a != null) {
            this.f25374a.sendMessageDelayed(message, 1);
        }
    }

    public void b() {
        new Thread(this.g).start();
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0208 A[SYNTHETIC, Splitter:B:104:0x0208] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0234 A[SYNTHETIC, Splitter:B:115:0x0234] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0252 A[SYNTHETIC, Splitter:B:120:0x0252] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0270 A[SYNTHETIC, Splitter:B:125:0x0270] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01cc A[SYNTHETIC, Splitter:B:94:0x01cc] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ea A[SYNTHETIC, Splitter:B:99:0x01ea] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(android.content.Context r9, java.lang.String r10, java.lang.String r11) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            org.apache.http.impl.client.DefaultHttpClient r2 = new org.apache.http.impl.client.DefaultHttpClient     // Catch:{ IOException -> 0x01a8, all -> 0x01a1 }
            r2.<init>()     // Catch:{ IOException -> 0x01a8, all -> 0x01a1 }
            org.apache.http.client.methods.HttpGet r3 = new org.apache.http.client.methods.HttpGet     // Catch:{ IOException -> 0x019c, all -> 0x0196 }
            r3.<init>(r10)     // Catch:{ IOException -> 0x019c, all -> 0x0196 }
            com.huawei.android.pushselfshow.utils.b.d r4 = new com.huawei.android.pushselfshow.utils.b.d     // Catch:{ IOException -> 0x0191, all -> 0x018c }
            r4.<init>(r9)     // Catch:{ IOException -> 0x0191, all -> 0x018c }
            org.apache.http.HttpResponse r9 = r4.a((java.lang.String) r10, (org.apache.http.client.HttpClient) r2, (org.apache.http.client.methods.HttpGet) r3)     // Catch:{ IOException -> 0x0191, all -> 0x018c }
            if (r9 != 0) goto L_0x0025
            java.lang.String r9 = "PushSelfShowLog"
            java.lang.String r10 = "fail, httprespone  is null"
            com.huawei.android.pushagent.utils.a.e.a(r9, r10)     // Catch:{ IOException -> 0x0191, all -> 0x018c }
        L_0x001e:
            a((org.apache.http.client.methods.HttpRequestBase) r3)
            a((org.apache.http.client.HttpClient) r2)
            return r1
        L_0x0025:
            org.apache.http.StatusLine r10 = r9.getStatusLine()     // Catch:{ IOException -> 0x0191, all -> 0x018c }
            if (r10 == 0) goto L_0x0053
            org.apache.http.StatusLine r10 = r9.getStatusLine()     // Catch:{ IOException -> 0x0191, all -> 0x018c }
            int r10 = r10.getStatusCode()     // Catch:{ IOException -> 0x0191, all -> 0x018c }
            r4 = 200(0xc8, float:2.8E-43)
            if (r10 == r4) goto L_0x0053
            java.lang.String r10 = "PushSelfShowLog"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0191, all -> 0x018c }
            java.lang.String r4 = "fail, httprespone status is "
            r11.<init>(r4)     // Catch:{ IOException -> 0x0191, all -> 0x018c }
            org.apache.http.StatusLine r9 = r9.getStatusLine()     // Catch:{ IOException -> 0x0191, all -> 0x018c }
            int r9 = r9.getStatusCode()     // Catch:{ IOException -> 0x0191, all -> 0x018c }
            r11.append(r9)     // Catch:{ IOException -> 0x0191, all -> 0x018c }
            java.lang.String r9 = r11.toString()     // Catch:{ IOException -> 0x0191, all -> 0x018c }
            com.huawei.android.pushagent.utils.a.e.a(r10, r9)     // Catch:{ IOException -> 0x0191, all -> 0x018c }
            goto L_0x001e
        L_0x0053:
            java.io.BufferedInputStream r10 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0191, all -> 0x018c }
            org.apache.http.HttpEntity r9 = r9.getEntity()     // Catch:{ IOException -> 0x0191, all -> 0x018c }
            java.io.InputStream r9 = r9.getContent()     // Catch:{ IOException -> 0x0191, all -> 0x018c }
            r10.<init>(r9)     // Catch:{ IOException -> 0x0191, all -> 0x018c }
            java.lang.String r9 = "PushSelfShowLog"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0189, all -> 0x0185 }
            java.lang.String r5 = "begin to write content to "
            r4.<init>(r5)     // Catch:{ IOException -> 0x0189, all -> 0x0185 }
            r4.append(r11)     // Catch:{ IOException -> 0x0189, all -> 0x0185 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0189, all -> 0x0185 }
            com.huawei.android.pushagent.utils.a.e.a(r9, r4)     // Catch:{ IOException -> 0x0189, all -> 0x0185 }
            java.io.File r9 = new java.io.File     // Catch:{ IOException -> 0x0189, all -> 0x0185 }
            r9.<init>(r11)     // Catch:{ IOException -> 0x0189, all -> 0x0185 }
            boolean r9 = r9.exists()     // Catch:{ IOException -> 0x0189, all -> 0x0185 }
            if (r9 == 0) goto L_0x009a
            java.lang.String r9 = "PushSelfShowLog"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0189, all -> 0x0185 }
            java.lang.String r5 = "file delete "
            r4.<init>(r5)     // Catch:{ IOException -> 0x0189, all -> 0x0185 }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x0189, all -> 0x0185 }
            r5.<init>(r11)     // Catch:{ IOException -> 0x0189, all -> 0x0185 }
            boolean r5 = r5.delete()     // Catch:{ IOException -> 0x0189, all -> 0x0185 }
            r4.append(r5)     // Catch:{ IOException -> 0x0189, all -> 0x0185 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0189, all -> 0x0185 }
            com.huawei.android.pushagent.utils.a.e.a(r9, r4)     // Catch:{ IOException -> 0x0189, all -> 0x0185 }
        L_0x009a:
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0189, all -> 0x0185 }
            r9.<init>(r11)     // Catch:{ IOException -> 0x0189, all -> 0x0185 }
            java.io.BufferedOutputStream r11 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x017e, all -> 0x0178 }
            r11.<init>(r9)     // Catch:{ IOException -> 0x017e, all -> 0x0178 }
            r0 = 32768(0x8000, float:4.5918E-41)
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x0173, all -> 0x016c }
        L_0x00a9:
            int r4 = r10.read(r0)     // Catch:{ IOException -> 0x0173, all -> 0x016c }
            r5 = 1
            if (r4 >= 0) goto L_0x0114
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.String r4 = "downLoad success "
            com.huawei.android.pushagent.utils.a.e.a(r0, r4)     // Catch:{ IOException -> 0x0173, all -> 0x016c }
            r8.f25378e = r1     // Catch:{ IOException -> 0x0173, all -> 0x016c }
            a((org.apache.http.client.methods.HttpRequestBase) r3)
            a((org.apache.http.client.HttpClient) r2)
            r11.close()     // Catch:{ IOException -> 0x00c3 }
            goto L_0x00db
        L_0x00c3:
            r11 = move-exception
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " bos download  error"
            r1.<init>(r2)
            java.lang.String r2 = r11.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.huawei.android.pushagent.utils.a.e.c(r0, r1, r11)
        L_0x00db:
            r10.close()     // Catch:{ IOException -> 0x00df }
            goto L_0x00f7
        L_0x00df:
            r10 = move-exception
            java.lang.String r11 = "PushSelfShowLog"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = " bis download  error"
            r0.<init>(r1)
            java.lang.String r1 = r10.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.huawei.android.pushagent.utils.a.e.c(r11, r0, r10)
        L_0x00f7:
            r9.close()     // Catch:{ Exception -> 0x00fb }
            goto L_0x0113
        L_0x00fb:
            r9 = move-exception
            java.lang.String r10 = "PushSelfShowLog"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "out download  error"
            r11.<init>(r0)
            java.lang.String r0 = r9.toString()
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.huawei.android.pushagent.utils.a.e.c(r10, r11, r9)
        L_0x0113:
            return r5
        L_0x0114:
            r8.f25378e = r5     // Catch:{ IOException -> 0x0173, all -> 0x016c }
            r11.write(r0, r1, r4)     // Catch:{ IOException -> 0x0173, all -> 0x016c }
            boolean r4 = r8.f25379f     // Catch:{ IOException -> 0x0173, all -> 0x016c }
            if (r4 == 0) goto L_0x00a9
            a((org.apache.http.client.methods.HttpRequestBase) r3)
            a((org.apache.http.client.HttpClient) r2)
            r11.close()     // Catch:{ IOException -> 0x0127 }
            goto L_0x013f
        L_0x0127:
            r11 = move-exception
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " bos download  error"
            r2.<init>(r3)
            java.lang.String r3 = r11.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.huawei.android.pushagent.utils.a.e.c(r0, r2, r11)
        L_0x013f:
            r10.close()     // Catch:{ IOException -> 0x0143 }
            goto L_0x015b
        L_0x0143:
            r10 = move-exception
            java.lang.String r11 = "PushSelfShowLog"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = " bis download  error"
            r0.<init>(r2)
            java.lang.String r2 = r10.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.huawei.android.pushagent.utils.a.e.c(r11, r0, r10)
        L_0x015b:
            r9.close()     // Catch:{ Exception -> 0x0160 }
            goto L_0x0224
        L_0x0160:
            r9 = move-exception
            java.lang.String r10 = "PushSelfShowLog"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "out download  error"
            r11.<init>(r0)
            goto L_0x0216
        L_0x016c:
            r0 = move-exception
            r7 = r11
            r11 = r9
            r9 = r0
            r0 = r7
            goto L_0x022c
        L_0x0173:
            r0 = move-exception
            r7 = r3
            r3 = r9
            r9 = r0
            goto L_0x0183
        L_0x0178:
            r11 = move-exception
            r7 = r11
            r11 = r9
            r9 = r7
            goto L_0x022c
        L_0x017e:
            r11 = move-exception
            r7 = r3
            r3 = r9
            r9 = r11
            r11 = r0
        L_0x0183:
            r0 = r7
            goto L_0x01ad
        L_0x0185:
            r9 = move-exception
            r11 = r0
            goto L_0x022c
        L_0x0189:
            r9 = move-exception
            r11 = r0
            goto L_0x0194
        L_0x018c:
            r9 = move-exception
            r10 = r0
            r11 = r10
            goto L_0x022c
        L_0x0191:
            r9 = move-exception
            r10 = r0
            r11 = r10
        L_0x0194:
            r0 = r3
            goto L_0x019f
        L_0x0196:
            r9 = move-exception
            r10 = r0
            r11 = r10
            r3 = r11
            goto L_0x022c
        L_0x019c:
            r9 = move-exception
            r10 = r0
            r11 = r10
        L_0x019f:
            r3 = r11
            goto L_0x01ad
        L_0x01a1:
            r9 = move-exception
            r10 = r0
            r11 = r10
            r2 = r11
            r3 = r2
            goto L_0x022c
        L_0x01a8:
            r9 = move-exception
            r10 = r0
            r11 = r10
            r2 = r11
            r3 = r2
        L_0x01ad:
            java.lang.String r4 = "PushSelfShowLog"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0227 }
            java.lang.String r6 = "downLoadSgThread download  error"
            r5.<init>(r6)     // Catch:{ all -> 0x0227 }
            java.lang.String r6 = r9.toString()     // Catch:{ all -> 0x0227 }
            r5.append(r6)     // Catch:{ all -> 0x0227 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0227 }
            com.huawei.android.pushagent.utils.a.e.c(r4, r5, r9)     // Catch:{ all -> 0x0227 }
            a((org.apache.http.client.methods.HttpRequestBase) r0)
            a((org.apache.http.client.HttpClient) r2)
            if (r11 == 0) goto L_0x01e8
            r11.close()     // Catch:{ IOException -> 0x01d0 }
            goto L_0x01e8
        L_0x01d0:
            r9 = move-exception
            java.lang.String r11 = "PushSelfShowLog"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = " bos download  error"
            r0.<init>(r2)
            java.lang.String r2 = r9.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.huawei.android.pushagent.utils.a.e.c(r11, r0, r9)
        L_0x01e8:
            if (r10 == 0) goto L_0x0206
            r10.close()     // Catch:{ IOException -> 0x01ee }
            goto L_0x0206
        L_0x01ee:
            r9 = move-exception
            java.lang.String r10 = "PushSelfShowLog"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = " bis download  error"
            r11.<init>(r0)
            java.lang.String r0 = r9.toString()
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.huawei.android.pushagent.utils.a.e.c(r10, r11, r9)
        L_0x0206:
            if (r3 == 0) goto L_0x0224
            r3.close()     // Catch:{ Exception -> 0x020c }
            goto L_0x0224
        L_0x020c:
            r9 = move-exception
            java.lang.String r10 = "PushSelfShowLog"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "out download  error"
            r11.<init>(r0)
        L_0x0216:
            java.lang.String r0 = r9.toString()
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.huawei.android.pushagent.utils.a.e.c(r10, r11, r9)
        L_0x0224:
            r8.f25378e = r1
            return r1
        L_0x0227:
            r9 = move-exception
            r7 = r0
            r0 = r11
            r11 = r3
            r3 = r7
        L_0x022c:
            a((org.apache.http.client.methods.HttpRequestBase) r3)
            a((org.apache.http.client.HttpClient) r2)
            if (r0 == 0) goto L_0x0250
            r0.close()     // Catch:{ IOException -> 0x0238 }
            goto L_0x0250
        L_0x0238:
            r0 = move-exception
            java.lang.String r1 = "PushSelfShowLog"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = " bos download  error"
            r2.<init>(r3)
            java.lang.String r3 = r0.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.huawei.android.pushagent.utils.a.e.c(r1, r2, r0)
        L_0x0250:
            if (r10 == 0) goto L_0x026e
            r10.close()     // Catch:{ IOException -> 0x0256 }
            goto L_0x026e
        L_0x0256:
            r10 = move-exception
            java.lang.String r0 = "PushSelfShowLog"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " bis download  error"
            r1.<init>(r2)
            java.lang.String r2 = r10.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.huawei.android.pushagent.utils.a.e.c(r0, r1, r10)
        L_0x026e:
            if (r11 == 0) goto L_0x028c
            r11.close()     // Catch:{ Exception -> 0x0274 }
            goto L_0x028c
        L_0x0274:
            r10 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "out download  error"
            r11.<init>(r0)
            java.lang.String r0 = r10.toString()
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "PushSelfShowLog"
            com.huawei.android.pushagent.utils.a.e.c(r0, r11, r10)
        L_0x028c:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushselfshow.utils.b.b.b(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public void c() {
        Message message = new Message();
        message.what = 2;
        e.a("PushSelfShowLog", "mDownloadHandler = " + this.f25374a);
        if (this.f25374a != null) {
            this.f25374a.sendMessageDelayed(message, 1);
        }
    }
}
