package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import com.tencent.bugly.crashreport.common.info.b;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public final class s {

    /* renamed from: b  reason: collision with root package name */
    private static s f79514b;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f79515a;

    /* renamed from: c  reason: collision with root package name */
    private Context f79516c;

    private s(Context context) {
        this.f79516c = context;
    }

    public static s a(Context context) {
        if (f79514b == null) {
            f79514b = new s(context);
        }
        return f79514b;
    }

    private static Map<String, String> a(HttpURLConnection httpURLConnection) {
        HashMap hashMap = new HashMap();
        Map headerFields = httpURLConnection.getHeaderFields();
        if (headerFields == null || headerFields.size() == 0) {
            return null;
        }
        for (String str : headerFields.keySet()) {
            List list = (List) headerFields.get(str);
            if (list.size() > 0) {
                hashMap.put(str, list.get(0));
            }
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003d A[SYNTHETIC, Splitter:B:24:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0049 A[SYNTHETIC, Splitter:B:31:0x0049] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] b(java.net.HttpURLConnection r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ Throwable -> 0x0036, all -> 0x0033 }
            java.io.InputStream r5 = r5.getInputStream()     // Catch:{ Throwable -> 0x0036, all -> 0x0033 }
            r1.<init>(r5)     // Catch:{ Throwable -> 0x0036, all -> 0x0033 }
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x0031 }
            r5.<init>()     // Catch:{ Throwable -> 0x0031 }
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch:{ Throwable -> 0x0031 }
        L_0x0016:
            int r3 = r1.read(r2)     // Catch:{ Throwable -> 0x0031 }
            if (r3 <= 0) goto L_0x0021
            r4 = 0
            r5.write(r2, r4, r3)     // Catch:{ Throwable -> 0x0031 }
            goto L_0x0016
        L_0x0021:
            r5.flush()     // Catch:{ Throwable -> 0x0031 }
            byte[] r5 = r5.toByteArray()     // Catch:{ Throwable -> 0x0031 }
            r1.close()     // Catch:{ Throwable -> 0x002c }
            goto L_0x0030
        L_0x002c:
            r0 = move-exception
            com.google.a.a.a.a.a.a.b(r0)
        L_0x0030:
            return r5
        L_0x0031:
            r5 = move-exception
            goto L_0x0038
        L_0x0033:
            r5 = move-exception
            r1 = r0
            goto L_0x0047
        L_0x0036:
            r5 = move-exception
            r1 = r0
        L_0x0038:
            com.tencent.bugly.proguard.x.a(r5)     // Catch:{ all -> 0x0046 }
            if (r1 == 0) goto L_0x0045
            r1.close()     // Catch:{ Throwable -> 0x0041 }
            goto L_0x0045
        L_0x0041:
            r5 = move-exception
            com.google.a.a.a.a.a.a.b(r5)
        L_0x0045:
            return r0
        L_0x0046:
            r5 = move-exception
        L_0x0047:
            if (r1 == 0) goto L_0x0051
            r1.close()     // Catch:{ Throwable -> 0x004d }
            goto L_0x0051
        L_0x004d:
            r0 = move-exception
            com.google.a.a.a.a.a.a.b(r0)
        L_0x0051:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.s.b(java.net.HttpURLConnection):byte[]");
    }

    private static HttpURLConnection a(String str, String str2) {
        HttpURLConnection httpURLConnection;
        try {
            URL url = new URL(str2);
            if (str == null || !str.toLowerCase(Locale.US).contains("wap")) {
                httpURLConnection = (HttpURLConnection) url.openConnection();
            } else {
                httpURLConnection = (HttpURLConnection) url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("http.proxyHost"), Integer.parseInt(System.getProperty("http.proxyPort")))));
            }
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setInstanceFollowRedirects(false);
            return httpURLConnection;
        } catch (Throwable th) {
            x.a(th);
            return null;
        }
    }

    private HttpURLConnection a(String str, byte[] bArr, String str2, Map<String, String> map) {
        if (str == null) {
            x.e("destUrl is null.", new Object[0]);
            return null;
        }
        HttpURLConnection a2 = a(str2, str);
        if (a2 == null) {
            x.e("Failed to get HttpURLConnection object.", new Object[0]);
            return null;
        }
        try {
            a2.setRequestProperty("wup_version", "3.0");
            if (map != null && map.size() > 0) {
                for (Map.Entry next : map.entrySet()) {
                    a2.setRequestProperty((String) next.getKey(), URLEncoder.encode((String) next.getValue(), "utf-8"));
                }
            }
            a2.setRequestProperty("A37", URLEncoder.encode(str2, "utf-8"));
            a2.setRequestProperty("A38", URLEncoder.encode(str2, "utf-8"));
            OutputStream outputStream = a2.getOutputStream();
            if (bArr == null) {
                outputStream.write(0);
            } else {
                outputStream.write(bArr);
            }
            return a2;
        } catch (Throwable th) {
            x.a(th);
            x.e("Failed to upload, please check your network.", new Object[0]);
            return null;
        }
    }

    public final byte[] a(String str, byte[] bArr, v vVar, Map<String, String> map) {
        long j;
        int i;
        int i2;
        int i3;
        Throwable th;
        Throwable th2;
        long j2;
        boolean z;
        byte[] bArr2 = bArr;
        v vVar2 = vVar;
        byte[] bArr3 = null;
        int i4 = 0;
        if (str == null) {
            x.e("Failed for no URL.", new Object[0]);
            return null;
        }
        if (bArr2 == null) {
            j = 0;
        } else {
            j = (long) bArr2.length;
        }
        i = 1;
        x.c("request: %s, send: %d (pid=%d | tid=%d)", str, Long.valueOf(j), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        String str2 = str;
        i2 = 0;
        int i5 = 0;
        boolean z2 = false;
        while (i2 <= 0 && i5 <= 0) {
            if (z2) {
                i3 = i2;
                z2 = false;
            } else {
                int i6 = i2 + 1;
                if (i6 > i) {
                    x.c("try time: ".concat(String.valueOf(i6)), new Object[i4]);
                    SystemClock.sleep(((long) new Random(System.currentTimeMillis()).nextInt(10000)) + 10000);
                }
                i3 = i6;
            }
            String f2 = b.f(this.f79516c);
            if (f2 == null) {
                x.d("Failed to request for network not avail", new Object[i4]);
                Map<String, String> map2 = map;
            } else {
                vVar2.a(j);
                HttpURLConnection a2 = a(str2, bArr2, f2, map);
                if (a2 != null) {
                    try {
                        int responseCode = a2.getResponseCode();
                        if (responseCode == 200) {
                            this.f79515a = a(a2);
                            byte[] b2 = b(a2);
                            if (b2 == null) {
                                j2 = 0;
                            } else {
                                j2 = (long) b2.length;
                            }
                            vVar2.b(j2);
                            try {
                                a2.disconnect();
                            } catch (Throwable th3) {
                                x.a(th3);
                            }
                            return b2;
                        }
                        if (responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            try {
                                String headerField = a2.getHeaderField("Location");
                                if (headerField == null) {
                                    try {
                                        x.e("Failed to redirect: %d".concat(String.valueOf(responseCode)), new Object[0]);
                                        try {
                                            a2.disconnect();
                                        } catch (Throwable th4) {
                                            x.a(th4);
                                        }
                                        return null;
                                    } catch (IOException e2) {
                                        e = e2;
                                        z2 = true;
                                        try {
                                            x.a(e);
                                            try {
                                                a2.disconnect();
                                            } catch (Throwable th5) {
                                                th = th5;
                                            }
                                            i2 = i3;
                                            bArr3 = null;
                                            i4 = 0;
                                            i = 1;
                                        } catch (Throwable th6) {
                                            x.a(th6);
                                        }
                                    }
                                } else {
                                    i5++;
                                    try {
                                        Object[] objArr = new Object[2];
                                        objArr[0] = Integer.valueOf(responseCode);
                                        try {
                                            objArr[1] = headerField;
                                            x.c("redirect code: %d ,to:%s", objArr);
                                            str2 = headerField;
                                            i3 = 0;
                                            z2 = true;
                                        } catch (IOException e3) {
                                            e = e3;
                                            str2 = headerField;
                                            i3 = 0;
                                            z2 = true;
                                            x.a(e);
                                            a2.disconnect();
                                            i2 = i3;
                                            bArr3 = null;
                                            i4 = 0;
                                            i = 1;
                                        }
                                    } catch (IOException e4) {
                                        e = e4;
                                        str2 = headerField;
                                        i3 = 0;
                                        z2 = true;
                                        x.a(e);
                                        a2.disconnect();
                                        i2 = i3;
                                        bArr3 = null;
                                        i4 = 0;
                                        i = 1;
                                    }
                                }
                            } catch (IOException e5) {
                                e = e5;
                                z2 = true;
                                x.a(e);
                                a2.disconnect();
                                i2 = i3;
                                bArr3 = null;
                                i4 = 0;
                                i = 1;
                            }
                        }
                        try {
                            x.d("response code ".concat(String.valueOf(responseCode)), new Object[0]);
                            long contentLength = (long) a2.getContentLength();
                            if (contentLength < 0) {
                                contentLength = 0;
                            }
                            vVar2.b(contentLength);
                            try {
                                a2.disconnect();
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        } catch (IOException e6) {
                            e = e6;
                            x.a(e);
                            a2.disconnect();
                            i2 = i3;
                            bArr3 = null;
                            i4 = 0;
                            i = 1;
                        }
                    } catch (IOException e7) {
                        e = e7;
                        x.a(e);
                        a2.disconnect();
                        i2 = i3;
                        bArr3 = null;
                        i4 = 0;
                        i = 1;
                    }
                } else {
                    x.c("Failed to execute post.", new Object[0]);
                    vVar2.b(0);
                }
            }
            i2 = i3;
            bArr3 = null;
            i4 = 0;
            i = 1;
        }
        return bArr3;
        throw th2;
        x.a(th);
        i2 = i3;
        bArr3 = null;
        i4 = 0;
        i = 1;
    }
}
