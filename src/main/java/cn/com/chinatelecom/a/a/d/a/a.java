package cn.com.chinatelecom.a.a.d.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import cn.com.chinatelecom.a.a.a.d;
import cn.com.chinatelecom.a.a.e.b;
import cn.com.chinatelecom.a.a.e.f;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f1695a = "a";

    /* renamed from: b  reason: collision with root package name */
    private static int f1696b = 5000;

    /* JADX WARNING: Removed duplicated region for block: B:21:0x003d A[SYNTHETIC, Splitter:B:21:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0042 A[Catch:{ IOException -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004c A[SYNTHETIC, Splitter:B:29:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0051 A[Catch:{ IOException -> 0x0054 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.io.InputStream r5) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0033 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0033 }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r5, r4)     // Catch:{ IOException -> 0x0033 }
            r4 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r3, r4)     // Catch:{ IOException -> 0x0033 }
        L_0x0014:
            java.lang.String r1 = r2.readLine()     // Catch:{ IOException -> 0x002f, all -> 0x002c }
            if (r1 == 0) goto L_0x0023
            r0.append(r1)     // Catch:{ IOException -> 0x002f, all -> 0x002c }
            java.lang.String r1 = "\n"
            r0.append(r1)     // Catch:{ IOException -> 0x002f, all -> 0x002c }
            goto L_0x0014
        L_0x0023:
            if (r5 == 0) goto L_0x0028
            r5.close()     // Catch:{ IOException -> 0x0045 }
        L_0x0028:
            r2.close()     // Catch:{ IOException -> 0x0045 }
            goto L_0x0045
        L_0x002c:
            r0 = move-exception
            r1 = r2
            goto L_0x004a
        L_0x002f:
            r1 = r2
            goto L_0x0033
        L_0x0031:
            r0 = move-exception
            goto L_0x004a
        L_0x0033:
            r2 = 0
            int r3 = r0.length()     // Catch:{ all -> 0x0031 }
            r0.delete(r2, r3)     // Catch:{ all -> 0x0031 }
            if (r5 == 0) goto L_0x0040
            r5.close()     // Catch:{ IOException -> 0x0045 }
        L_0x0040:
            if (r1 == 0) goto L_0x0045
            r1.close()     // Catch:{ IOException -> 0x0045 }
        L_0x0045:
            java.lang.String r5 = r0.toString()
            return r5
        L_0x004a:
            if (r5 == 0) goto L_0x004f
            r5.close()     // Catch:{ IOException -> 0x0054 }
        L_0x004f:
            if (r1 == 0) goto L_0x0054
            r1.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.a.a.d.a.a.a(java.io.InputStream):java.lang.String");
    }

    private static void a(HttpURLConnection httpURLConnection, Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            for (Map.Entry next : map.entrySet()) {
                httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0124 A[SYNTHETIC, Splitter:B:58:0x0124] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0129 A[Catch:{ Exception -> 0x0131 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x012e A[Catch:{ Exception -> 0x0131 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0135 A[SYNTHETIC, Splitter:B:68:0x0135] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x013a A[Catch:{ Exception -> 0x0142 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x013f A[Catch:{ Exception -> 0x0142 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static cn.com.chinatelecom.a.a.d.a.b a(java.lang.String r8, android.net.Network r9) {
        /*
            cn.com.chinatelecom.a.a.d.a.b r0 = new cn.com.chinatelecom.a.a.d.a.b
            r0.<init>()
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            r2.<init>(r8)     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            r8 = 21
            if (r9 == 0) goto L_0x001a
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            if (r3 < r8) goto L_0x001a
            java.net.URLConnection r2 = r9.openConnection(r2)     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            goto L_0x0020
        L_0x001a:
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
        L_0x0020:
            java.lang.String r3 = "accept"
            java.lang.String r4 = "*/*"
            r2.setRequestProperty(r3, r4)     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            java.lang.String r3 = "connection"
            java.lang.String r4 = "Keep-Alive"
            r2.setRequestProperty(r3, r4)     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            java.lang.String r3 = "GET"
            r2.setRequestMethod(r3)     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            r3 = 0
            r2.setDoOutput(r3)     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            r4 = 1
            r2.setDoInput(r4)     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            int r5 = f1696b     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            r2.setConnectTimeout(r5)     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            int r5 = f1696b     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            r2.setReadTimeout(r5)     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            r2.setUseCaches(r3)     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            java.lang.String r5 = "Accept-Charset"
            java.lang.String r6 = "UTF-8"
            r2.addRequestProperty(r5, r6)     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            r2.connect()     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            int r5 = r2.getResponseCode()     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            r0.f1697a = r5     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            int r5 = r0.f1697a     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            r6 = 302(0x12e, float:4.23E-43)
            if (r5 != r6) goto L_0x00ad
            java.lang.String r5 = "Location"
            java.lang.String r2 = r2.getHeaderField(r5)     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            java.net.URL r5 = new java.net.URL     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            r5.<init>(r2)     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            if (r9 == 0) goto L_0x0076
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            if (r2 < r8) goto L_0x0076
            java.net.URLConnection r8 = r9.openConnection(r5)     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            goto L_0x007c
        L_0x0076:
            java.net.URLConnection r8 = r5.openConnection()     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
        L_0x007c:
            r2 = r8
            java.lang.String r8 = "accept"
            java.lang.String r9 = "*/*"
            r2.setRequestProperty(r8, r9)     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            java.lang.String r8 = "connection"
            java.lang.String r9 = "Keep-Alive"
            r2.setRequestProperty(r8, r9)     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            java.lang.String r8 = "GET"
            r2.setRequestMethod(r8)     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            r2.setDoOutput(r3)     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            r2.setDoInput(r4)     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            int r8 = f1696b     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            r2.setConnectTimeout(r8)     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            int r8 = f1696b     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            r2.setReadTimeout(r8)     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            r2.setUseCaches(r3)     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            java.lang.String r8 = "Accept-Charset"
            java.lang.String r9 = "UTF-8"
            r2.addRequestProperty(r8, r9)     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            r2.connect()     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
        L_0x00ad:
            int r8 = r2.getResponseCode()     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            r0.f1697a = r8     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            int r8 = r0.f1697a     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 != r9) goto L_0x0103
            java.io.InputStream r8 = r2.getInputStream()     // Catch:{ Exception -> 0x0119, all -> 0x0115 }
            java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00fe, all -> 0x00f9 }
            r9.<init>(r8)     // Catch:{ Exception -> 0x00fe, all -> 0x00f9 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00f4, all -> 0x00f0 }
            r2.<init>(r9)     // Catch:{ Exception -> 0x00f4, all -> 0x00f0 }
            java.lang.String r1 = ""
            r0.f1698b = r1     // Catch:{ Exception -> 0x00ea, all -> 0x00e7 }
        L_0x00cb:
            java.lang.String r1 = r2.readLine()     // Catch:{ Exception -> 0x00ea, all -> 0x00e7 }
            if (r1 == 0) goto L_0x00e5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ea, all -> 0x00e7 }
            r3.<init>()     // Catch:{ Exception -> 0x00ea, all -> 0x00e7 }
            java.lang.String r4 = r0.f1698b     // Catch:{ Exception -> 0x00ea, all -> 0x00e7 }
            r3.append(r4)     // Catch:{ Exception -> 0x00ea, all -> 0x00e7 }
            r3.append(r1)     // Catch:{ Exception -> 0x00ea, all -> 0x00e7 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x00ea, all -> 0x00e7 }
            r0.f1698b = r1     // Catch:{ Exception -> 0x00ea, all -> 0x00e7 }
            goto L_0x00cb
        L_0x00e5:
            r1 = r2
            goto L_0x0105
        L_0x00e7:
            r0 = move-exception
            r1 = r2
            goto L_0x00f1
        L_0x00ea:
            r1 = move-exception
            r7 = r2
            r2 = r8
            r8 = r1
            r1 = r7
            goto L_0x011c
        L_0x00f0:
            r0 = move-exception
        L_0x00f1:
            r2 = r8
            r8 = r0
            goto L_0x0133
        L_0x00f4:
            r2 = move-exception
            r7 = r2
            r2 = r8
            r8 = r7
            goto L_0x011c
        L_0x00f9:
            r9 = move-exception
            r2 = r8
            r8 = r9
            r9 = r1
            goto L_0x0133
        L_0x00fe:
            r9 = move-exception
            r2 = r8
            r8 = r9
            r9 = r1
            goto L_0x011c
        L_0x0103:
            r8 = r1
            r9 = r8
        L_0x0105:
            if (r1 == 0) goto L_0x010a
            r1.close()     // Catch:{ Exception -> 0x0131 }
        L_0x010a:
            if (r9 == 0) goto L_0x010f
            r9.close()     // Catch:{ Exception -> 0x0131 }
        L_0x010f:
            if (r8 == 0) goto L_0x0131
            r8.close()     // Catch:{ Exception -> 0x0131 }
            goto L_0x0131
        L_0x0115:
            r8 = move-exception
            r9 = r1
            r2 = r9
            goto L_0x0133
        L_0x0119:
            r8 = move-exception
            r9 = r1
            r2 = r9
        L_0x011c:
            java.lang.String r8 = cn.com.chinatelecom.a.a.e.f.a(r8)     // Catch:{ all -> 0x0132 }
            r0.f1699c = r8     // Catch:{ all -> 0x0132 }
            if (r1 == 0) goto L_0x0127
            r1.close()     // Catch:{ Exception -> 0x0131 }
        L_0x0127:
            if (r9 == 0) goto L_0x012c
            r9.close()     // Catch:{ Exception -> 0x0131 }
        L_0x012c:
            if (r2 == 0) goto L_0x0131
            r2.close()     // Catch:{ Exception -> 0x0131 }
        L_0x0131:
            return r0
        L_0x0132:
            r8 = move-exception
        L_0x0133:
            if (r1 == 0) goto L_0x0138
            r1.close()     // Catch:{ Exception -> 0x0142 }
        L_0x0138:
            if (r9 == 0) goto L_0x013d
            r9.close()     // Catch:{ Exception -> 0x0142 }
        L_0x013d:
            if (r2 == 0) goto L_0x0142
            r2.close()     // Catch:{ Exception -> 0x0142 }
        L_0x0142:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.a.a.d.a.a.a(java.lang.String, android.net.Network):cn.com.chinatelecom.a.a.d.a.b");
    }

    public static b a(String str, Map<String, String> map, String str2, Network network) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        b bVar = new b();
        try {
            URL url = new URL(str);
            if (network == null || Build.VERSION.SDK_INT < 21) {
                httpURLConnection = (HttpURLConnection) url.openConnection();
            } else {
                httpURLConnection = (HttpURLConnection) network.openConnection(url);
            }
            httpURLConnection.setRequestProperty("accept", "*/*");
            a(httpURLConnection, map);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setConnectTimeout(f1696b);
            httpURLConnection.setReadTimeout(f1696b);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.addRequestProperty("Accept-Charset", "UTF-8");
            if (!TextUtils.isEmpty(str2)) {
                DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(httpURLConnection.getOutputStream()));
                dataOutputStream.writeBytes(str2);
                dataOutputStream.flush();
                dataOutputStream.close();
            } else {
                httpURLConnection.connect();
            }
            bVar.f1697a = httpURLConnection.getResponseCode();
            if (bVar.f1697a == 302) {
                URL url2 = new URL(httpURLConnection.getHeaderField("Location"));
                if (network == null || Build.VERSION.SDK_INT < 21) {
                    httpURLConnection2 = (HttpURLConnection) url2.openConnection();
                } else {
                    httpURLConnection2 = (HttpURLConnection) network.openConnection(url2);
                }
                httpURLConnection = httpURLConnection2;
                httpURLConnection.setRequestProperty("accept", "*/*");
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setConnectTimeout(f1696b);
                httpURLConnection.setReadTimeout(f1696b);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.addRequestProperty("Accept-Charset", "UTF-8");
                httpURLConnection.connect();
            }
            bVar.f1697a = httpURLConnection.getResponseCode();
            if (bVar.f1697a == 200) {
                bVar.f1698b = a(httpURLConnection.getInputStream());
            }
        } catch (Exception e2) {
            bVar.f1699c = f.a(e2);
            String str3 = f1695a;
            String str4 = "doPost Exception : " + bVar.f1699c;
            if (b.f1706a) {
                if (b.f1706a) {
                    f.a(str3, str4);
                }
                Log.w(str3, str4);
            }
        }
        return bVar;
    }

    public static b a(Context context, String str, Map<String, String> map, String str2, boolean z, Network network) {
        HttpURLConnection httpURLConnection;
        HttpURLConnection httpURLConnection2;
        HttpURLConnection httpURLConnection3;
        b bVar = new b();
        try {
            URL url = new URL(str);
            if (network == null || Build.VERSION.SDK_INT < 21) {
                httpURLConnection = (HttpURLConnection) url.openConnection();
            } else {
                httpURLConnection = (HttpURLConnection) network.openConnection(url);
            }
            httpURLConnection.setRequestProperty("accept", "*/*");
            a(httpURLConnection, (Map<String, String>) null);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setConnectTimeout(f1696b);
            httpURLConnection.setReadTimeout(f1696b);
            httpURLConnection.setUseCaches(false);
            if (z && Build.VERSION.SDK_INT < 21) {
                httpURLConnection.setInstanceFollowRedirects(false);
            }
            httpURLConnection.addRequestProperty("Accept-Charset", "UTF-8");
            if (!TextUtils.isEmpty(str2)) {
                DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(httpURLConnection.getOutputStream()));
                dataOutputStream.writeBytes(str2);
                dataOutputStream.flush();
                dataOutputStream.close();
            } else {
                httpURLConnection.connect();
            }
            bVar.f1697a = httpURLConnection.getResponseCode();
            if (bVar.f1697a == 302) {
                String headerField = httpURLConnection.getHeaderField("Location");
                if (z && !TextUtils.isEmpty(headerField) && context != null && Build.VERSION.SDK_INT < 21) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    if (connectivityManager.getNetworkInfo(5).getState().compareTo(NetworkInfo.State.CONNECTED) == 0) {
                        connectivityManager.requestRouteToHost(5, d.a(d.b(headerField)));
                    }
                }
                URL url2 = new URL(headerField);
                if (network == null || Build.VERSION.SDK_INT < 21) {
                    httpURLConnection3 = (HttpURLConnection) url2.openConnection();
                } else {
                    httpURLConnection3 = (HttpURLConnection) network.openConnection(url2);
                }
                httpURLConnection = httpURLConnection3;
                httpURLConnection.setRequestProperty("accept", "*/*");
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setConnectTimeout(f1696b);
                httpURLConnection.setReadTimeout(f1696b);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.addRequestProperty("Accept-Charset", "UTF-8");
                httpURLConnection.connect();
            }
            bVar.f1697a = httpURLConnection.getResponseCode();
            if (bVar.f1697a == 302) {
                URL url3 = new URL(httpURLConnection.getHeaderField("Location"));
                if (network == null || Build.VERSION.SDK_INT < 21) {
                    httpURLConnection2 = (HttpURLConnection) url3.openConnection();
                } else {
                    httpURLConnection2 = (HttpURLConnection) network.openConnection(url3);
                }
                httpURLConnection = httpURLConnection2;
                httpURLConnection.setRequestProperty("accept", "*/*");
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setConnectTimeout(f1696b);
                httpURLConnection.setReadTimeout(f1696b);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.addRequestProperty("Accept-Charset", "UTF-8");
                httpURLConnection.connect();
            }
            bVar.f1697a = httpURLConnection.getResponseCode();
            if (bVar.f1697a == 200) {
                bVar.f1698b = a(httpURLConnection.getInputStream());
            }
        } catch (Exception e2) {
            bVar.f1699c = f.a(e2);
        }
        return bVar;
    }
}
