package com.umeng.message.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.umeng.message.PushAgent;
import com.umeng.message.common.UmengMessageDeviceConfig;
import com.umeng.message.proguard.h;
import java.net.URLEncoder;

public class c {
    private static final String i = "com.umeng.message.util.c";

    /* renamed from: d  reason: collision with root package name */
    private final int f81409d = 1;

    /* renamed from: e  reason: collision with root package name */
    private String f81410e;

    /* renamed from: f  reason: collision with root package name */
    private String f81411f = "10.0.0.172";
    private int g = 80;
    private Context h;

    private boolean a() {
        if (this.h.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.h.getPackageName()) != 0) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.h.getSystemService("connectivity")).getActiveNetworkInfo();
            if (!(activeNetworkInfo == null || activeNetworkInfo.getType() == 1)) {
                String extraInfo = activeNetworkInfo.getExtraInfo();
                if (extraInfo == null || (!extraInfo.equals("cmwap") && !extraInfo.equals("3gwap") && !extraInfo.equals("uniwap"))) {
                    return false;
                }
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public c(Context context) {
        this.h = context;
        this.f81410e = a(context);
    }

    private String a(Context context) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("6.0.0.001");
        stringBuffer.append("/");
        stringBuffer.append("6.0.0.001");
        stringBuffer.append(" ");
        try {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(UmengMessageDeviceConfig.getApplicationLable(context));
            stringBuffer2.append("/");
            stringBuffer2.append(UmengMessageDeviceConfig.getAppVersionName(context));
            stringBuffer2.append(" ");
            stringBuffer2.append(Build.MODEL);
            stringBuffer2.append("/");
            stringBuffer2.append(Build.VERSION.RELEASE);
            stringBuffer2.append(" ");
            stringBuffer2.append(h.a(PushAgent.getInstance(context).getMessageAppkey()));
            stringBuffer.append(URLEncoder.encode(stringBuffer2.toString(), "UTF-8"));
        } catch (Exception unused) {
        }
        return stringBuffer.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        r7 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0085, code lost:
        r8.disconnect();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x0010] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] a(byte[] r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x0060 }
            r3.<init>(r8)     // Catch:{ Exception -> 0x0060 }
            java.net.URLConnection r8 = r3.openConnection()     // Catch:{ Exception -> 0x0060 }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ Exception -> 0x0060 }
            java.lang.String r3 = "POST"
            r8.setRequestMethod(r3)     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            r3 = 10000(0x2710, float:1.4013E-41)
            r8.setReadTimeout(r3)     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            r8.setConnectTimeout(r3)     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            java.lang.String r3 = "Msg-Type"
            java.lang.String r4 = "envelope"
            r8.setRequestProperty(r3, r4)     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            r8.setDoOutput(r0)     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            r8.setChunkedStreamingMode(r2)     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            java.io.OutputStream r4 = r8.getOutputStream()     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            r3.write(r7)     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            r3.flush()     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            r3.close()     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            java.io.InputStream r3 = r8.getInputStream()     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            r7.<init>(r3)     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            byte[] r3 = com.umeng.message.proguard.h.a((java.io.InputStream) r7)     // Catch:{ all -> 0x0052 }
            com.umeng.message.proguard.h.b((java.io.InputStream) r7)     // Catch:{ Exception -> 0x0050, all -> 0x0057 }
            if (r8 == 0) goto L_0x0082
            r8.disconnect()
            goto L_0x0082
        L_0x0050:
            r7 = move-exception
            goto L_0x005b
        L_0x0052:
            r3 = move-exception
            com.umeng.message.proguard.h.b((java.io.InputStream) r7)     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
            throw r3     // Catch:{ Exception -> 0x0059, all -> 0x0057 }
        L_0x0057:
            r7 = move-exception
            goto L_0x0083
        L_0x0059:
            r7 = move-exception
            r3 = r1
        L_0x005b:
            r1 = r8
            goto L_0x0062
        L_0x005d:
            r7 = move-exception
            r8 = r1
            goto L_0x0083
        L_0x0060:
            r7 = move-exception
            r3 = r1
        L_0x0062:
            java.lang.String r8 = i     // Catch:{ all -> 0x005d }
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x005d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
            java.lang.String r5 = "sendMessage:"
            r4.<init>(r5)     // Catch:{ all -> 0x005d }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x005d }
            r4.append(r7)     // Catch:{ all -> 0x005d }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x005d }
            r0[r2] = r7     // Catch:{ all -> 0x005d }
            com.umeng.commonsdk.debug.UMLog.mutlInfo((java.lang.String) r8, (int) r2, (java.lang.String[]) r0)     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x0082
            r1.disconnect()
        L_0x0082:
            return r3
        L_0x0083:
            if (r8 == 0) goto L_0x0088
            r8.disconnect()
        L_0x0088:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.util.c.a(byte[], java.lang.String):byte[]");
    }
}
