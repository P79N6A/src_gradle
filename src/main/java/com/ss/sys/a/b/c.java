package com.ss.sys.a.b;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f78478a;

    /* renamed from: b  reason: collision with root package name */
    private static HostnameVerifier f78479b = new a();

    public static String a(String str, Map map, byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                try {
                    sb.append((String) entry.getKey());
                    sb.append("=");
                    sb.append(URLEncoder.encode((String) entry.getValue(), "utf-8"));
                    sb.append("&");
                } catch (Throwable unused) {
                }
            }
        }
        if (!map.isEmpty()) {
            sb.deleteCharAt(sb.length() - 1);
        }
        URL url = null;
        try {
            url = new URL(str + "?" + sb.toString());
        } catch (Throwable unused2) {
        }
        return a(url, bArr, "application/octet-stream");
    }

    private static String a(URL url, byte[] bArr, String str) {
        HttpURLConnection httpURLConnection;
        TrustManager[] trustManagerArr = {new b()};
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init(null, trustManagerArr, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(instance.getSocketFactory());
            if ("https".equals(url.getProtocol().toLowerCase())) {
                httpURLConnection = (HttpURLConnection) (f78478a ? url.openConnection(Proxy.NO_PROXY) : url.openConnection());
                ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(f78479b);
            } else {
                httpURLConnection = (HttpURLConnection) url.openConnection();
            }
            httpURLConnection.setRequestProperty("Content-Type", str);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.flush();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                return String.format("{\"code\":%d}", new Object[]{Integer.valueOf(responseCode)});
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    inputStream.close();
                    outputStream.close();
                    return sb.toString();
                }
            }
        } catch (Throwable unused) {
            return "";
        }
    }
}