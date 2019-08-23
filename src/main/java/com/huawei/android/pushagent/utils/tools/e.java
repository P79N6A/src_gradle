package com.huawei.android.pushagent.utils.tools;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.android.pushagent.utils.a;
import com.taobao.android.dexposed.ClassUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class e {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v36, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v40, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v43, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v45, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v58, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v60, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: java.io.InputStream} */
    /* JADX WARNING: type inference failed for: r0v48 */
    /* JADX WARNING: type inference failed for: r0v51 */
    /* JADX WARNING: type inference failed for: r0v54 */
    /* JADX WARNING: type inference failed for: r0v55 */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0148, code lost:
        if (r7 == null) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0181, code lost:
        if (r7 == null) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x01b9, code lost:
        if (r7 == null) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x01bb, code lost:
        com.huawei.android.pushagent.utils.a.e.a("PushLogAC2815", "disconnect the socket");
        r7.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        java.lang.Thread.sleep(2000);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x01cb, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x01cc, code lost:
        com.huawei.android.pushagent.utils.a.e.c("PushLogAC2815", r6.toString(), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00e5, code lost:
        if (r7 == null) goto L_0x01c5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0130 A[SYNTHETIC, Splitter:B:110:0x0130] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x013d A[SYNTHETIC, Splitter:B:115:0x013d] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0169 A[SYNTHETIC, Splitter:B:127:0x0169] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0176 A[SYNTHETIC, Splitter:B:132:0x0176] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01a1 A[SYNTHETIC, Splitter:B:144:0x01a1] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01ae A[SYNTHETIC, Splitter:B:149:0x01ae] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x01e0 A[SYNTHETIC, Splitter:B:164:0x01e0] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x01ed A[SYNTHETIC, Splitter:B:169:0x01ed] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x01fa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.huawei.android.pushagent.a.e a(android.content.Context r6, java.lang.String r7) {
        /*
            r0 = 0
            java.lang.String r1 = a(r6, r7, r0)
            java.lang.String r2 = "PushLogAC2815"
            java.lang.String r3 = "queryTrs runing"
            com.huawei.android.pushagent.utils.a.e.a(r2, r3)
            r2 = 0
            javax.net.ssl.HttpsURLConnection r3 = a(r6, r1, r7, r0, r0)     // Catch:{ UnsupportedEncodingException -> 0x0184, IOException -> 0x014c, Exception -> 0x0113, all -> 0x010d }
            if (r3 != 0) goto L_0x007e
            r4 = 1
            javax.net.ssl.HttpsURLConnection r5 = a(r6, r1, r7, r4, r0)     // Catch:{ UnsupportedEncodingException -> 0x0078, IOException -> 0x0072, Exception -> 0x006c, all -> 0x0066 }
            if (r5 != 0) goto L_0x0064
            javax.net.ssl.HttpsURLConnection r0 = a(r6, r1, r7, r0, r4)     // Catch:{ UnsupportedEncodingException -> 0x005e, IOException -> 0x0058, Exception -> 0x0052, all -> 0x004c }
            if (r0 != 0) goto L_0x004a
            javax.net.ssl.HttpsURLConnection r7 = a(r6, r1, r7, r4, r4)     // Catch:{ UnsupportedEncodingException -> 0x0046, IOException -> 0x0042, Exception -> 0x003e, all -> 0x003a }
            if (r7 != 0) goto L_0x007f
            java.lang.String r6 = "PushLogAC2815"
            java.lang.String r0 = "after all, trs connect is null"
            com.huawei.android.pushagent.utils.a.e.d(r6, r0)     // Catch:{ UnsupportedEncodingException -> 0x0109, IOException -> 0x0106, Exception -> 0x0103, all -> 0x0100 }
            if (r7 == 0) goto L_0x0039
            java.lang.String r6 = "PushLogAC2815"
            java.lang.String r0 = "disconnect the socket"
            com.huawei.android.pushagent.utils.a.e.a(r6, r0)
            r7.disconnect()
        L_0x0039:
            return r2
        L_0x003a:
            r6 = move-exception
            r7 = r0
            goto L_0x0101
        L_0x003e:
            r6 = move-exception
            r7 = r0
            goto L_0x0104
        L_0x0042:
            r6 = move-exception
            r7 = r0
            goto L_0x0107
        L_0x0046:
            r6 = move-exception
            r7 = r0
            goto L_0x010a
        L_0x004a:
            r7 = r0
            goto L_0x007f
        L_0x004c:
            r6 = move-exception
            r0 = r2
            r1 = r0
            r7 = r5
            goto L_0x01de
        L_0x0052:
            r6 = move-exception
            r0 = r2
            r1 = r0
            r7 = r5
            goto L_0x0117
        L_0x0058:
            r6 = move-exception
            r0 = r2
            r1 = r0
            r7 = r5
            goto L_0x0150
        L_0x005e:
            r6 = move-exception
            r0 = r2
            r1 = r0
            r7 = r5
            goto L_0x0188
        L_0x0064:
            r7 = r5
            goto L_0x007f
        L_0x0066:
            r6 = move-exception
            r0 = r2
            r1 = r0
            r7 = r3
            goto L_0x01de
        L_0x006c:
            r6 = move-exception
            r0 = r2
            r1 = r0
            r7 = r3
            goto L_0x0117
        L_0x0072:
            r6 = move-exception
            r0 = r2
            r1 = r0
            r7 = r3
            goto L_0x0150
        L_0x0078:
            r6 = move-exception
            r0 = r2
            r1 = r0
            r7 = r3
            goto L_0x0188
        L_0x007e:
            r7 = r3
        L_0x007f:
            java.lang.String r0 = "PushLogAC2815"
            java.lang.String r1 = "queryTrs connect() success"
            com.huawei.android.pushagent.utils.a.e.a(r0, r1)     // Catch:{ UnsupportedEncodingException -> 0x0109, IOException -> 0x0106, Exception -> 0x0103, all -> 0x0100 }
            java.io.InputStream r0 = r7.getInputStream()     // Catch:{ UnsupportedEncodingException -> 0x0109, IOException -> 0x0106, Exception -> 0x0103, all -> 0x0100 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ UnsupportedEncodingException -> 0x00fc, IOException -> 0x00f8, Exception -> 0x00f5, all -> 0x00f1 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ UnsupportedEncodingException -> 0x00fc, IOException -> 0x00f8, Exception -> 0x00f5, all -> 0x00f1 }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r0, r4)     // Catch:{ UnsupportedEncodingException -> 0x00fc, IOException -> 0x00f8, Exception -> 0x00f5, all -> 0x00f1 }
            r1.<init>(r3)     // Catch:{ UnsupportedEncodingException -> 0x00fc, IOException -> 0x00f8, Exception -> 0x00f5, all -> 0x00f1 }
            java.lang.String r3 = r1.readLine()     // Catch:{ UnsupportedEncodingException -> 0x00ee, IOException -> 0x00eb, Exception -> 0x00e9 }
            if (r3 == 0) goto L_0x00c6
            com.huawei.android.pushagent.a.e r4 = new com.huawei.android.pushagent.a.e     // Catch:{ UnsupportedEncodingException -> 0x00ee, IOException -> 0x00eb, Exception -> 0x00e9 }
            r4.<init>(r6, r3)     // Catch:{ UnsupportedEncodingException -> 0x00ee, IOException -> 0x00eb, Exception -> 0x00e9 }
            if (r0 == 0) goto L_0x00ae
            r0.close()     // Catch:{ IOException -> 0x00a7 }
            goto L_0x00ae
        L_0x00a7:
            java.lang.String r6 = "PushLogAC2815"
            java.lang.String r0 = "close is err"
            com.huawei.android.pushagent.utils.a.e.d(r6, r0)
        L_0x00ae:
            r1.close()     // Catch:{ IOException -> 0x00b2 }
            goto L_0x00b9
        L_0x00b2:
            java.lang.String r6 = "PushLogAC2815"
            java.lang.String r0 = "close br err"
            com.huawei.android.pushagent.utils.a.e.d(r6, r0)
        L_0x00b9:
            if (r7 == 0) goto L_0x00c5
            java.lang.String r6 = "PushLogAC2815"
            java.lang.String r0 = "disconnect the socket"
            com.huawei.android.pushagent.utils.a.e.a(r6, r0)
            r7.disconnect()
        L_0x00c5:
            return r4
        L_0x00c6:
            java.lang.String r6 = "PushLogAC2815"
            java.lang.String r3 = "response is null"
            com.huawei.android.pushagent.utils.a.e.a(r6, r3)     // Catch:{ UnsupportedEncodingException -> 0x00ee, IOException -> 0x00eb, Exception -> 0x00e9 }
            if (r0 == 0) goto L_0x00da
            r0.close()     // Catch:{ IOException -> 0x00d3 }
            goto L_0x00da
        L_0x00d3:
            java.lang.String r6 = "PushLogAC2815"
            java.lang.String r0 = "close is err"
            com.huawei.android.pushagent.utils.a.e.d(r6, r0)
        L_0x00da:
            r1.close()     // Catch:{ IOException -> 0x00de }
            goto L_0x00e5
        L_0x00de:
            java.lang.String r6 = "PushLogAC2815"
            java.lang.String r0 = "close br err"
            com.huawei.android.pushagent.utils.a.e.d(r6, r0)
        L_0x00e5:
            if (r7 == 0) goto L_0x01c5
            goto L_0x01bb
        L_0x00e9:
            r6 = move-exception
            goto L_0x0117
        L_0x00eb:
            r6 = move-exception
            goto L_0x0150
        L_0x00ee:
            r6 = move-exception
            goto L_0x0188
        L_0x00f1:
            r6 = move-exception
            r1 = r2
            goto L_0x01de
        L_0x00f5:
            r6 = move-exception
            r1 = r2
            goto L_0x0117
        L_0x00f8:
            r6 = move-exception
            r1 = r2
            goto L_0x0150
        L_0x00fc:
            r6 = move-exception
            r1 = r2
            goto L_0x0188
        L_0x0100:
            r6 = move-exception
        L_0x0101:
            r0 = r2
            goto L_0x0110
        L_0x0103:
            r6 = move-exception
        L_0x0104:
            r0 = r2
            goto L_0x0116
        L_0x0106:
            r6 = move-exception
        L_0x0107:
            r0 = r2
            goto L_0x014f
        L_0x0109:
            r6 = move-exception
        L_0x010a:
            r0 = r2
            goto L_0x0187
        L_0x010d:
            r6 = move-exception
            r7 = r2
            r0 = r7
        L_0x0110:
            r1 = r0
            goto L_0x01de
        L_0x0113:
            r6 = move-exception
            r7 = r2
            r0 = r7
        L_0x0116:
            r1 = r0
        L_0x0117:
            java.lang.String r3 = "PushLogAC2815"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01dd }
            java.lang.String r5 = "query trs err:"
            r4.<init>(r5)     // Catch:{ all -> 0x01dd }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x01dd }
            r4.append(r5)     // Catch:{ all -> 0x01dd }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01dd }
            com.huawei.android.pushagent.utils.a.e.a((java.lang.String) r3, (java.lang.String) r4, (java.lang.Throwable) r6)     // Catch:{ all -> 0x01dd }
            if (r0 == 0) goto L_0x013b
            r0.close()     // Catch:{ IOException -> 0x0134 }
            goto L_0x013b
        L_0x0134:
            java.lang.String r6 = "PushLogAC2815"
            java.lang.String r0 = "close is err"
            com.huawei.android.pushagent.utils.a.e.d(r6, r0)
        L_0x013b:
            if (r1 == 0) goto L_0x0148
            r1.close()     // Catch:{ IOException -> 0x0141 }
            goto L_0x0148
        L_0x0141:
            java.lang.String r6 = "PushLogAC2815"
            java.lang.String r0 = "close br err"
            com.huawei.android.pushagent.utils.a.e.d(r6, r0)
        L_0x0148:
            if (r7 == 0) goto L_0x01c5
            goto L_0x01bb
        L_0x014c:
            r6 = move-exception
            r7 = r2
            r0 = r7
        L_0x014f:
            r1 = r0
        L_0x0150:
            java.lang.String r3 = "PushLogAC2815"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01dd }
            java.lang.String r5 = "query trs err:"
            r4.<init>(r5)     // Catch:{ all -> 0x01dd }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x01dd }
            r4.append(r5)     // Catch:{ all -> 0x01dd }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01dd }
            com.huawei.android.pushagent.utils.a.e.a((java.lang.String) r3, (java.lang.String) r4, (java.lang.Throwable) r6)     // Catch:{ all -> 0x01dd }
            if (r0 == 0) goto L_0x0174
            r0.close()     // Catch:{ IOException -> 0x016d }
            goto L_0x0174
        L_0x016d:
            java.lang.String r6 = "PushLogAC2815"
            java.lang.String r0 = "close is err"
            com.huawei.android.pushagent.utils.a.e.d(r6, r0)
        L_0x0174:
            if (r1 == 0) goto L_0x0181
            r1.close()     // Catch:{ IOException -> 0x017a }
            goto L_0x0181
        L_0x017a:
            java.lang.String r6 = "PushLogAC2815"
            java.lang.String r0 = "close br err"
            com.huawei.android.pushagent.utils.a.e.d(r6, r0)
        L_0x0181:
            if (r7 == 0) goto L_0x01c5
            goto L_0x01bb
        L_0x0184:
            r6 = move-exception
            r7 = r2
            r0 = r7
        L_0x0187:
            r1 = r0
        L_0x0188:
            java.lang.String r3 = "PushLogAC2815"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01dd }
            java.lang.String r5 = "query trs err:"
            r4.<init>(r5)     // Catch:{ all -> 0x01dd }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x01dd }
            r4.append(r5)     // Catch:{ all -> 0x01dd }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x01dd }
            com.huawei.android.pushagent.utils.a.e.a((java.lang.String) r3, (java.lang.String) r4, (java.lang.Throwable) r6)     // Catch:{ all -> 0x01dd }
            if (r0 == 0) goto L_0x01ac
            r0.close()     // Catch:{ IOException -> 0x01a5 }
            goto L_0x01ac
        L_0x01a5:
            java.lang.String r6 = "PushLogAC2815"
            java.lang.String r0 = "close is err"
            com.huawei.android.pushagent.utils.a.e.d(r6, r0)
        L_0x01ac:
            if (r1 == 0) goto L_0x01b9
            r1.close()     // Catch:{ IOException -> 0x01b2 }
            goto L_0x01b9
        L_0x01b2:
            java.lang.String r6 = "PushLogAC2815"
            java.lang.String r0 = "close br err"
            com.huawei.android.pushagent.utils.a.e.d(r6, r0)
        L_0x01b9:
            if (r7 == 0) goto L_0x01c5
        L_0x01bb:
            java.lang.String r6 = "PushLogAC2815"
            java.lang.String r0 = "disconnect the socket"
            com.huawei.android.pushagent.utils.a.e.a(r6, r0)
            r7.disconnect()
        L_0x01c5:
            r6 = 2000(0x7d0, double:9.88E-321)
            java.lang.Thread.sleep(r6)     // Catch:{ InterruptedException -> 0x01cb }
            goto L_0x01d5
        L_0x01cb:
            r6 = move-exception
            java.lang.String r7 = "PushLogAC2815"
            java.lang.String r0 = r6.toString()
            com.huawei.android.pushagent.utils.a.e.c(r7, r0, r6)
        L_0x01d5:
            java.lang.String r6 = "PushLogAC2815"
            java.lang.String r7 = "get IP/PORT failed, retry again."
            com.huawei.android.pushagent.utils.a.e.a(r6, r7)
            return r2
        L_0x01dd:
            r6 = move-exception
        L_0x01de:
            if (r0 == 0) goto L_0x01eb
            r0.close()     // Catch:{ IOException -> 0x01e4 }
            goto L_0x01eb
        L_0x01e4:
            java.lang.String r0 = "PushLogAC2815"
            java.lang.String r2 = "close is err"
            com.huawei.android.pushagent.utils.a.e.d(r0, r2)
        L_0x01eb:
            if (r1 == 0) goto L_0x01f8
            r1.close()     // Catch:{ IOException -> 0x01f1 }
            goto L_0x01f8
        L_0x01f1:
            java.lang.String r0 = "PushLogAC2815"
            java.lang.String r1 = "close br err"
            com.huawei.android.pushagent.utils.a.e.d(r0, r1)
        L_0x01f8:
            if (r7 == 0) goto L_0x0204
            java.lang.String r0 = "PushLogAC2815"
            java.lang.String r1 = "disconnect the socket"
            com.huawei.android.pushagent.utils.a.e.a(r0, r1)
            r7.disconnect()
        L_0x0204:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.utils.tools.e.a(android.content.Context, java.lang.String):com.huawei.android.pushagent.a.e");
    }

    private static String a(Context context, String str, boolean z) {
        String a2 = a("push.hicloud.com", str);
        if (z && a2 != null && a2.length() > 0) {
            String str2 = a2.split(":")[0];
            a2 = str2 + ":5222";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("https://");
        stringBuffer.append(a2);
        stringBuffer.append("/TRSServer/TRSRequest3");
        com.huawei.android.pushagent.utils.a.e.a("PushLogAC2815", "url:" + stringBuffer.toString());
        return stringBuffer.toString();
    }

    private static String a(String str) {
        return str == null ? "" : str;
    }

    private static String a(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            com.huawei.android.pushagent.utils.a.e.c("PushLogAC2815", "belongId is null or trsAddress is null");
            return str;
        } else if (!str.startsWith("push")) {
            com.huawei.android.pushagent.utils.a.e.c("PushLogAC2815", "trsAddress is invalid:" + str);
            return str;
        } else {
            try {
                int parseInt = Integer.parseInt(str2.trim());
                if (parseInt <= 0) {
                    com.huawei.android.pushagent.utils.a.e.c("PushLogAC2815", "belongId is invalid:" + parseInt);
                    return str;
                }
                int indexOf = str.indexOf(ClassUtils.PACKAGE_SEPARATOR);
                if (indexOf < 0) {
                    return str;
                }
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str.substring(0, indexOf));
                stringBuffer.append(parseInt);
                stringBuffer.append(str.substring(indexOf));
                return stringBuffer.toString();
            } catch (NumberFormatException e2) {
                com.huawei.android.pushagent.utils.a.e.c("PushLogAC2815", "belongId parseInt error: " + str2, e2);
                return str;
            } catch (Exception e3) {
                com.huawei.android.pushagent.utils.a.e.c("PushLogAC2815", e3.getMessage(), e3);
                return str;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        r6 = "PushLogAC2815";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r7 = r4.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0077, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0078, code lost:
        r6 = "PushLogAC2815";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r7 = r4.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008d, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        com.huawei.android.pushagent.utils.a.e.c("PushLogAC2815", r6.toString(), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009a, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d6, code lost:
        r5.disconnect();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0073 A[SYNTHETIC, Splitter:B:34:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0089 A[SYNTHETIC, Splitter:B:43:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x009a A[ExcHandler: IOException (e java.io.IOException), Splitter:B:10:0x0034] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static javax.net.ssl.HttpsURLConnection a(android.content.Context r4, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8) {
        /*
            if (r8 == 0) goto L_0x0006
            java.lang.String r5 = a(r4, r6, r8)
        L_0x0006:
            r0 = 0
            if (r5 != 0) goto L_0x0011
            java.lang.String r4 = "PushLogAC2815"
            java.lang.String r5 = "TRSUrl is null, cannot create connection."
            com.huawei.android.pushagent.utils.a.e.a(r4, r5)
            return r0
        L_0x0011:
            java.lang.String r1 = "PushLogAC2815"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "TRS httpUrl = "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r3 = ",useDefaultPort = "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            com.huawei.android.pushagent.utils.a.e.a(r1, r8)
            javax.net.ssl.HttpsURLConnection r5 = b(r4, r5, r7)     // Catch:{ IOException -> 0x00bb, Exception -> 0x009c }
            java.lang.String r7 = "PushLogAC2815"
            java.lang.String r8 = "get connection success."
            com.huawei.android.pushagent.utils.a.e.a(r7, r8)     // Catch:{ IOException -> 0x009a, Exception -> 0x0098 }
            r5.connect()     // Catch:{ IOException -> 0x009a, Exception -> 0x0098 }
            java.io.OutputStream r7 = r5.getOutputStream()     // Catch:{ Exception -> 0x0066, all -> 0x0063 }
            java.lang.String r4 = b(r4, r6)     // Catch:{ Exception -> 0x0061 }
            java.lang.String r6 = "UTF-8"
            byte[] r4 = r4.getBytes(r6)     // Catch:{ Exception -> 0x0061 }
            r7.write(r4)     // Catch:{ Exception -> 0x0061 }
            r7.flush()     // Catch:{ Exception -> 0x0061 }
            if (r7 == 0) goto L_0x007f
            r7.close()     // Catch:{ Exception -> 0x0054, IOException -> 0x009a }
            goto L_0x007f
        L_0x0054:
            r4 = move-exception
            java.lang.String r6 = "PushLogAC2815"
            java.lang.String r7 = r4.toString()     // Catch:{ IOException -> 0x009a, Exception -> 0x0098 }
        L_0x005b:
            com.huawei.android.pushagent.utils.a.e.c(r6, r7, r4)     // Catch:{ IOException -> 0x009a, Exception -> 0x0098 }
            goto L_0x007f
        L_0x005f:
            r4 = move-exception
            goto L_0x0087
        L_0x0061:
            r4 = move-exception
            goto L_0x0068
        L_0x0063:
            r4 = move-exception
            r7 = r0
            goto L_0x0087
        L_0x0066:
            r4 = move-exception
            r7 = r0
        L_0x0068:
            java.lang.String r6 = "PushLogAC2815"
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x005f }
            com.huawei.android.pushagent.utils.a.e.c(r6, r8, r4)     // Catch:{ all -> 0x005f }
            if (r7 == 0) goto L_0x007f
            r7.close()     // Catch:{ Exception -> 0x0077, IOException -> 0x009a }
            goto L_0x007f
        L_0x0077:
            r4 = move-exception
            java.lang.String r6 = "PushLogAC2815"
            java.lang.String r7 = r4.toString()     // Catch:{ IOException -> 0x009a, Exception -> 0x0098 }
            goto L_0x005b
        L_0x007f:
            java.lang.String r4 = "PushLogAC2815"
            java.lang.String r6 = "call conn.connect() success"
            com.huawei.android.pushagent.utils.a.e.a(r4, r6)     // Catch:{ IOException -> 0x009a, Exception -> 0x0098 }
            return r5
        L_0x0087:
            if (r7 == 0) goto L_0x0097
            r7.close()     // Catch:{ Exception -> 0x008d, IOException -> 0x009a }
            goto L_0x0097
        L_0x008d:
            r6 = move-exception
            java.lang.String r7 = "PushLogAC2815"
            java.lang.String r8 = r6.toString()     // Catch:{ IOException -> 0x009a, Exception -> 0x0098 }
            com.huawei.android.pushagent.utils.a.e.c(r7, r8, r6)     // Catch:{ IOException -> 0x009a, Exception -> 0x0098 }
        L_0x0097:
            throw r4     // Catch:{ IOException -> 0x009a, Exception -> 0x0098 }
        L_0x0098:
            r4 = move-exception
            goto L_0x009e
        L_0x009a:
            r4 = move-exception
            goto L_0x00bd
        L_0x009c:
            r4 = move-exception
            r5 = r0
        L_0x009e:
            java.lang.String r6 = "PushLogAC2815"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "connect to TRS cause Exception:"
            r7.<init>(r8)
            java.lang.String r8 = r4.toString()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.huawei.android.pushagent.utils.a.e.c(r6, r7, r4)
            if (r5 == 0) goto L_0x00ba
            r5.disconnect()
        L_0x00ba:
            return r0
        L_0x00bb:
            r4 = move-exception
            r5 = r0
        L_0x00bd:
            java.lang.String r6 = "PushLogAC2815"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "connect to TRS cause IOException:"
            r7.<init>(r8)
            java.lang.String r4 = r4.toString()
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            com.huawei.android.pushagent.utils.a.e.d(r6, r4)
            if (r5 == 0) goto L_0x00d9
            r5.disconnect()
        L_0x00d9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.utils.tools.e.a(android.content.Context, java.lang.String, java.lang.String, boolean, boolean):javax.net.ssl.HttpsURLConnection");
    }

    private static String b(Context context, String str) {
        String h = a.h(context);
        String a2 = a.a(context);
        String a3 = a.a(context);
        String g = a.g(context);
        String c2 = a.c();
        String packageName = context.getPackageName();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mccmnc", a(h));
            jSONObject.put("PushID", a(a2));
            jSONObject.put("udid", a(a3));
            jSONObject.put("belongid", a(str));
            jSONObject.put("version", a(g));
            jSONObject.put("protocolversion", "2.0");
            jSONObject.put("info", 0);
            jSONObject.put("channel", a(packageName));
            jSONObject.put("mode", a(Build.MODEL));
            jSONObject.put("mac", a(""));
            jSONObject.put("intelligent", 3);
            jSONObject.put("emV", a(c2));
            jSONObject.put("rV", a(Build.DISPLAY));
        } catch (JSONException e2) {
            com.huawei.android.pushagent.utils.a.e.c("PushLogAC2815", e2.toString());
        }
        return jSONObject.toString();
    }

    /* JADX WARNING: type inference failed for: r8v6, types: [java.net.URLConnection] */
    /* JADX WARNING: type inference failed for: r9v7, types: [java.net.URLConnection] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static javax.net.ssl.HttpsURLConnection b(android.content.Context r7, java.lang.String r8, boolean r9) throws java.lang.Exception {
        /*
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)
            r1 = 1
            javax.net.ssl.TrustManager[] r2 = new javax.net.ssl.TrustManager[r1]
            com.huawei.android.pushagent.utils.a.i r3 = new com.huawei.android.pushagent.utils.a.i
            r3.<init>(r7)
            r4 = 0
            r2[r4] = r3
            java.security.SecureRandom r3 = new java.security.SecureRandom
            r3.<init>()
            r4 = 0
            r0.init(r4, r2, r3)
            com.huawei.android.pushagent.utils.a.g r2 = new com.huawei.android.pushagent.utils.a.g
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()
            r2.<init>(r0)
            javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(r2)
            com.huawei.android.pushagent.utils.tools.f r0 = new com.huawei.android.pushagent.utils.tools.f
            r0.<init>()
            javax.net.ssl.HttpsURLConnection.setDefaultHostnameVerifier(r0)
            if (r9 == 0) goto L_0x00bd
            int r9 = com.huawei.android.pushagent.utils.a.b.a((android.content.Context) r7)
            if (r1 == r9) goto L_0x00bd
            r9 = -1
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x005e }
            r2 = 11
            if (r0 < r2) goto L_0x0053
            java.lang.String r0 = "http.proxyHost"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ Exception -> 0x005e }
            java.lang.String r2 = "http.proxyPort"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch:{ Exception -> 0x005c }
            if (r2 == 0) goto L_0x004c
            goto L_0x004e
        L_0x004c:
            java.lang.String r2 = "-1"
        L_0x004e:
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ Exception -> 0x005c }
            goto L_0x0078
        L_0x0053:
            java.lang.String r0 = android.net.Proxy.getHost(r7)     // Catch:{ Exception -> 0x005e }
            int r2 = android.net.Proxy.getPort(r7)     // Catch:{ Exception -> 0x005c }
            goto L_0x0078
        L_0x005c:
            r2 = move-exception
            goto L_0x0060
        L_0x005e:
            r2 = move-exception
            r0 = r4
        L_0x0060:
            java.lang.String r3 = "PushLogAC2815"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "get proxy ip or port error:"
            r5.<init>(r6)
            java.lang.String r2 = r2.getMessage()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.huawei.android.pushagent.utils.a.e.d(r3, r2)
            r2 = -1
        L_0x0078:
            if (r0 == 0) goto L_0x00bd
            int r3 = r0.length()
            if (r3 <= 0) goto L_0x00bd
            if (r2 == r9) goto L_0x00bd
            java.lang.String r9 = "PushLogAC2815"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "use Proxy "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = ":"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = " to open:"
            r3.append(r4)
            r3.append(r8)
            java.lang.String r3 = r3.toString()
            com.huawei.android.pushagent.utils.a.e.a(r9, r3)
            java.net.Proxy r9 = new java.net.Proxy
            java.net.Proxy$Type r3 = java.net.Proxy.Type.HTTP
            java.net.InetSocketAddress r4 = new java.net.InetSocketAddress
            r4.<init>(r0, r2)
            r9.<init>(r3, r4)
            java.net.URL r0 = new java.net.URL
            r0.<init>(r8)
            java.net.URLConnection r9 = r0.openConnection(r9)
            r4 = r9
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4
        L_0x00bd:
            if (r4 != 0) goto L_0x00de
            java.lang.String r9 = "PushLogAC2815"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "direct to open "
            r0.<init>(r2)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            com.huawei.android.pushagent.utils.a.e.a(r9, r0)
            java.net.URL r9 = new java.net.URL
            r9.<init>(r8)
            java.net.URLConnection r8 = r9.openConnection()
            r4 = r8
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4
        L_0x00de:
            com.huawei.android.pushagent.b.b.a r8 = com.huawei.android.pushagent.b.b.a.a((android.content.Context) r7)
            long r8 = r8.u()
            int r8 = (int) r8
            int r8 = r8 * 1000
            r4.setConnectTimeout(r8)
            com.huawei.android.pushagent.b.b.a r7 = com.huawei.android.pushagent.b.b.a.a((android.content.Context) r7)
            long r7 = r7.v()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r2
            int r7 = (int) r7
            r4.setReadTimeout(r7)
            r4.setDoOutput(r1)
            r4.setDoInput(r1)
            java.lang.String r7 = "POST"
            r4.setRequestMethod(r7)
            java.lang.String r7 = "Content-type"
            java.lang.String r8 = "json/text; charset=UTF-8"
            r4.setRequestProperty(r7, r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.android.pushagent.utils.tools.e.b(android.content.Context, java.lang.String, boolean):javax.net.ssl.HttpsURLConnection");
    }
}
