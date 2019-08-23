package com.monitor.cloudmessage.d.c;

import com.monitor.cloudmessage.d.b.b;
import com.monitor.cloudmessage.e.e;
import java.io.DataOutputStream;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static String f27349a = "http://mon.snssdk.com/monitor/collect/c/cloudcontrol/file";

    /* renamed from: b  reason: collision with root package name */
    public static String f27350b = "UTF-8";

    /* renamed from: c  reason: collision with root package name */
    public static Map<String, String> f27351c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    static final String f27352d = ("cloudMessage" + UUID.randomUUID().toString());

    public static boolean a(b bVar) {
        return a(f27349a, bVar.l, bVar.k, bVar.m, bVar.n, bVar.o);
    }

    public static boolean a(com.monitor.cloudmessage.d.b.a aVar) {
        int i;
        boolean z = false;
        for (int i2 = 0; i2 < aVar.h.size(); i2++) {
            File file = new File(aVar.h.get(i2));
            if (file.exists()) {
                if (i2 < aVar.h.size() - 1) {
                    i = 1;
                } else {
                    i = 2;
                }
                if (aVar.g) {
                    i = aVar.l;
                }
                File file2 = file;
                boolean a2 = a(f27349a, file2, i, aVar.f27343a, aVar.k, aVar.m, aVar.n, aVar.o);
                if (a2 && aVar.f27346d) {
                    file.delete();
                }
                if (i2 != 0) {
                    if (!z || !a2) {
                        a2 = false;
                    } else {
                        a2 = true;
                    }
                }
                z = a2;
            }
        }
        return z;
    }

    private static void a(DataOutputStream dataOutputStream, HashMap<String, String> hashMap) throws Throwable {
        if (!(com.monitor.cloudmessage.a.a().f27306f == null || com.monitor.cloudmessage.a.a().f27306f.size() == 0)) {
            dataOutputStream.write(("Content-Disposition: form-data; name=\"fileCommon\"; filetype=\"command_commonparams\"; filename=\"common_params.txt\"\r\n" + "Content-Type: text/plain\r\n" + "\r\n").getBytes());
            dataOutputStream.write(e.a(com.monitor.cloudmessage.a.a().f27306f).getBytes());
            dataOutputStream.write("\r\n".getBytes());
            dataOutputStream.write(("--" + f27352d + "\r\n").getBytes());
            dataOutputStream.flush();
        }
        if (hashMap != null && hashMap.size() != 0) {
            dataOutputStream.write(("Content-Disposition: form-data; name=\"fileSpecific\"; filetype=\"command_specificparams\"; filename=\"specific_params.txt\"\r\n" + "Content-Type: text/plain\r\n" + "\r\n").getBytes());
            dataOutputStream.write(e.a(hashMap).getBytes());
            dataOutputStream.write("\r\n".getBytes());
            dataOutputStream.write(("--" + f27352d + "\r\n").getBytes());
            dataOutputStream.flush();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01ef A[SYNTHETIC, Splitter:B:50:0x01ef] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01fb A[SYNTHETIC, Splitter:B:59:0x01fb] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10, long r11, java.util.HashMap<java.lang.String, java.lang.String> r13) {
        /*
            r0 = 0
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ Throwable -> 0x01f3, all -> 0x01e5 }
            r2.<init>(r7)     // Catch:{ Throwable -> 0x01f3, all -> 0x01e5 }
            java.net.URLConnection r7 = r2.openConnection()     // Catch:{ Throwable -> 0x01f3, all -> 0x01e5 }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ Throwable -> 0x01f3, all -> 0x01e5 }
            r2 = 30000(0x7530, float:4.2039E-41)
            r7.setReadTimeout(r2)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            r7.setConnectTimeout(r2)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            r2 = 1
            r7.setDoInput(r2)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            r7.setDoOutput(r2)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            r7.setUseCaches(r1)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            java.lang.String r3 = "POST"
            r7.setRequestMethod(r3)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            java.lang.String r3 = "Charset"
            java.lang.String r4 = f27350b     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            r7.setRequestProperty(r3, r4)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            java.lang.String r3 = "connection"
            java.lang.String r4 = "keep-alive"
            r7.setRequestProperty(r3, r4)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            java.lang.String r3 = "Content-Type"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            java.lang.String r5 = "multipart/form-data;boundary="
            r4.<init>(r5)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            java.lang.String r5 = f27352d     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            r4.append(r5)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            r7.setRequestProperty(r3, r4)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            java.util.Map<java.lang.String, java.lang.String> r3 = f27351c     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            if (r3 == 0) goto L_0x0085
            java.util.Map<java.lang.String, java.lang.String> r3 = f27351c     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            boolean r3 = r3.isEmpty()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            if (r3 != 0) goto L_0x0085
            java.util.Map<java.lang.String, java.lang.String> r3 = f27351c     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
        L_0x005d:
            boolean r4 = r3.hasNext()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            if (r4 == 0) goto L_0x0085
            java.lang.Object r4 = r3.next()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            if (r6 != 0) goto L_0x005d
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            if (r6 != 0) goto L_0x005d
            r7.setRequestProperty(r5, r4)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            goto L_0x005d
        L_0x0085:
            r7.connect()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            java.io.OutputStream r4 = r7.getOutputStream()     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x01e3, all -> 0x01e0 }
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r0.<init>()     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r4 = "--"
            r0.append(r4)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r4 = f27352d     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r0.append(r4)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r4 = "\r\n"
            r0.append(r4)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r5 = "Content-Disposition: form-data; name=\"status\"\r\n\r\n"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r4.append(r8)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r5 = "\r\n--"
            r4.append(r5)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r5 = f27352d     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r4.append(r5)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r5 = "\r\n"
            r4.append(r5)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r0.append(r4)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r5 = "Content-Disposition: form-data; name=\"cid\"\r\n\r\n"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r4.append(r9)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r9 = "\r\n--"
            r4.append(r9)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r9 = f27352d     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r4.append(r9)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r9 = "\r\n"
            r4.append(r9)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r9 = r4.toString()     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r0.append(r9)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r4 = "Content-Disposition: form-data; name=\"err_msg\"\r\n\r\n"
            r9.<init>(r4)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r9.append(r10)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r10 = "\r\n--"
            r9.append(r10)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r10 = f27352d     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r9.append(r10)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r10 = "\r\n"
            r9.append(r10)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r9 = r9.toString()     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r0.append(r9)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r10 = "Content-Disposition: form-data; name=\"aid\"\r\n\r\n"
            r9.<init>(r10)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            com.monitor.cloudmessage.a.a()     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r10 = com.monitor.cloudmessage.a.d()     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r9.append(r10)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r10 = "\r\n--"
            r9.append(r10)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r10 = f27352d     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r9.append(r10)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r10 = "\r\n"
            r9.append(r10)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r9 = r9.toString()     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r0.append(r9)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r10 = "Content-Disposition: form-data; name=\"update_version_code\"\r\n\r\n"
            r9.<init>(r10)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            com.monitor.cloudmessage.a.a()     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r10 = com.monitor.cloudmessage.a.e()     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r9.append(r10)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r10 = "\r\n--"
            r9.append(r10)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r10 = f27352d     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r9.append(r10)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r10 = "\r\n"
            r9.append(r10)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r9 = r9.toString()     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r0.append(r9)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r10 = "Content-Disposition: form-data; name=\"operate_time\"\r\n\r\n"
            r9.<init>(r10)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r9.append(r11)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r10 = "\r\n--"
            r9.append(r10)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r10 = f27352d     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r9.append(r10)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r10 = "\r\n"
            r9.append(r10)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r9 = r9.toString()     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r0.append(r9)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r9 = 2
            if (r8 == r9) goto L_0x0179
            r9 = 3
            if (r8 != r9) goto L_0x018a
        L_0x0179:
            java.lang.String r8 = r0.toString()     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            byte[] r8 = r8.getBytes()     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r3.write(r8)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            a(r3, r13)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r0.setLength(r1)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
        L_0x018a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r9 = "Content-Disposition: form-data; name=\"uid\"\r\n\r\n"
            r8.<init>(r9)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            com.monitor.cloudmessage.a.a()     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r9 = com.monitor.cloudmessage.a.c()     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r8.append(r9)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r9 = "\r\n--"
            r8.append(r9)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r9 = f27352d     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r8.append(r9)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r9 = "\r\n"
            r8.append(r9)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r8 = r8.toString()     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r0.append(r8)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            java.lang.String r8 = r0.toString()     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            byte[] r8 = r8.getBytes()     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r3.write(r8)     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r3.flush()     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r3.close()     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            int r8 = r7.getResponseCode()     // Catch:{ Throwable -> 0x01de, all -> 0x01dc }
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 != r9) goto L_0x01d3
            if (r7 == 0) goto L_0x01cf
            r7.disconnect()
        L_0x01cf:
            r3.close()     // Catch:{ Throwable -> 0x01d2 }
        L_0x01d2:
            return r2
        L_0x01d3:
            if (r7 == 0) goto L_0x01d8
            r7.disconnect()
        L_0x01d8:
            r3.close()     // Catch:{ Throwable -> 0x01db }
        L_0x01db:
            return r1
        L_0x01dc:
            r8 = move-exception
            goto L_0x01e8
        L_0x01de:
            r0 = r3
            goto L_0x01f4
        L_0x01e0:
            r8 = move-exception
            r3 = r0
            goto L_0x01e8
        L_0x01e3:
            goto L_0x01f4
        L_0x01e5:
            r8 = move-exception
            r7 = r0
            r3 = r7
        L_0x01e8:
            if (r7 == 0) goto L_0x01ed
            r7.disconnect()
        L_0x01ed:
            if (r3 == 0) goto L_0x01f2
            r3.close()     // Catch:{ Throwable -> 0x01f2 }
        L_0x01f2:
            throw r8
        L_0x01f3:
            r7 = r0
        L_0x01f4:
            if (r7 == 0) goto L_0x01f9
            r7.disconnect()
        L_0x01f9:
            if (r0 == 0) goto L_0x01fe
            r0.close()     // Catch:{ Throwable -> 0x01fe }
        L_0x01fe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monitor.cloudmessage.d.c.a.a(java.lang.String, int, java.lang.String, java.lang.String, long, java.util.HashMap):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0263 A[SYNTHETIC, Splitter:B:58:0x0263] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x026f A[SYNTHETIC, Splitter:B:67:0x026f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.lang.String r7, java.io.File r8, int r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, long r13, java.util.HashMap<java.lang.String, java.lang.String> r15) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0273
            boolean r0 = r8.exists()
            if (r0 == 0) goto L_0x0273
            r0 = 0
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ Throwable -> 0x0267, all -> 0x0259 }
            r2.<init>(r7)     // Catch:{ Throwable -> 0x0267, all -> 0x0259 }
            java.net.URLConnection r7 = r2.openConnection()     // Catch:{ Throwable -> 0x0267, all -> 0x0259 }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ Throwable -> 0x0267, all -> 0x0259 }
            r2 = 30000(0x7530, float:4.2039E-41)
            r7.setReadTimeout(r2)     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            r7.setConnectTimeout(r2)     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            r2 = 1
            r7.setDoInput(r2)     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            r7.setDoOutput(r2)     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            r7.setUseCaches(r1)     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            java.lang.String r3 = "POST"
            r7.setRequestMethod(r3)     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            java.lang.String r3 = "Charset"
            java.lang.String r4 = f27350b     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            r7.setRequestProperty(r3, r4)     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            java.lang.String r3 = "connection"
            java.lang.String r4 = "keep-alive"
            r7.setRequestProperty(r3, r4)     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            java.lang.String r3 = "Content-Type"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            java.lang.String r5 = "multipart/form-data;boundary="
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            java.lang.String r5 = f27352d     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            r4.append(r5)     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            r7.setRequestProperty(r3, r4)     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            java.util.Map<java.lang.String, java.lang.String> r3 = f27351c     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            if (r3 == 0) goto L_0x0091
            java.util.Map<java.lang.String, java.lang.String> r3 = f27351c     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            boolean r3 = r3.isEmpty()     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            if (r3 != 0) goto L_0x0091
            java.util.Map<java.lang.String, java.lang.String> r3 = f27351c     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            java.util.Set r3 = r3.entrySet()     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
        L_0x0069:
            boolean r4 = r3.hasNext()     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            if (r4 == 0) goto L_0x0091
            java.lang.Object r4 = r3.next()     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            if (r6 != 0) goto L_0x0069
            boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            if (r6 != 0) goto L_0x0069
            r7.setRequestProperty(r5, r4)     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            goto L_0x0069
        L_0x0091:
            r7.connect()     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            java.io.DataOutputStream r3 = new java.io.DataOutputStream     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            java.io.OutputStream r4 = r7.getOutputStream()     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x0257, all -> 0x0254 }
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r0.<init>()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r4 = "--"
            r0.append(r4)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r4 = f27352d     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r0.append(r4)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r4 = "\r\n"
            r0.append(r4)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r5 = "Content-Disposition: form-data; name=\"status\"\r\n\r\n"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r4.append(r9)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r5 = "\r\n--"
            r4.append(r5)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r5 = f27352d     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r4.append(r5)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r5 = "\r\n"
            r4.append(r5)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r0.append(r4)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r5 = "Content-Disposition: form-data; name=\"cid\"\r\n\r\n"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r4.append(r11)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r11 = "\r\n--"
            r4.append(r11)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r11 = f27352d     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r4.append(r11)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r11 = "\r\n"
            r4.append(r11)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r11 = r4.toString()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r0.append(r11)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r4 = "Content-Disposition: form-data; name=\"err_msg\"\r\n\r\n"
            r11.<init>(r4)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r11.append(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r12 = "\r\n--"
            r11.append(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r12 = f27352d     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r11.append(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r12 = "\r\n"
            r11.append(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r11 = r11.toString()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r0.append(r11)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r12 = "Content-Disposition: form-data; name=\"operate_time\"\r\n\r\n"
            r11.<init>(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r11.append(r13)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r12 = "\r\n--"
            r11.append(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r12 = f27352d     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r11.append(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r12 = "\r\n"
            r11.append(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r11 = r11.toString()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r0.append(r11)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r12 = "Content-Disposition: form-data; name=\"aid\"\r\n\r\n"
            r11.<init>(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            com.monitor.cloudmessage.a.a()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r12 = com.monitor.cloudmessage.a.d()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r11.append(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r12 = "\r\n--"
            r11.append(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r12 = f27352d     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r11.append(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r12 = "\r\n"
            r11.append(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r11 = r11.toString()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r0.append(r11)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r12 = "Content-Disposition: form-data; name=\"update_version_code\"\r\n\r\n"
            r11.<init>(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            com.monitor.cloudmessage.a.a()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r12 = com.monitor.cloudmessage.a.e()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r11.append(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r12 = "\r\n--"
            r11.append(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r12 = f27352d     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r11.append(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r12 = "\r\n"
            r11.append(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r11 = r11.toString()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r0.append(r11)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r12 = "Content-Disposition: form-data; name=\"uid\"\r\n\r\n"
            r11.<init>(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            com.monitor.cloudmessage.a.a()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r12 = com.monitor.cloudmessage.a.c()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r11.append(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r12 = "\r\n--"
            r11.append(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r12 = f27352d     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r11.append(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r12 = "\r\n"
            r11.append(r12)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r11 = r11.toString()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r0.append(r11)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r11 = 2
            if (r9 == r11) goto L_0x01ac
            r11 = 3
            if (r9 != r11) goto L_0x01bd
        L_0x01ac:
            java.lang.String r9 = r0.toString()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            byte[] r9 = r9.getBytes()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r3.write(r9)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            a(r3, r15)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r0.setLength(r1)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
        L_0x01bd:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r11 = "Content-Disposition: form-data; name=\"file\"; filetype=\""
            r9.<init>(r11)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r9.append(r10)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r10 = "\"; filename=\""
            r9.append(r10)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r10 = r8.getName()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r9.append(r10)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r10 = "\"\r\n"
            r9.append(r10)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r9 = r9.toString()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r0.append(r9)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r9 = "Content-Type: text/plain\r\n"
            r0.append(r9)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r9 = "\r\n"
            r0.append(r9)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r9 = r0.toString()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            byte[] r9 = r9.getBytes()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r3.write(r9)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r9.<init>(r8)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r8]     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
        L_0x01fd:
            int r10 = r9.read(r8)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r11 = -1
            if (r10 == r11) goto L_0x0208
            r3.write(r8, r1, r10)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            goto L_0x01fd
        L_0x0208:
            r9.close()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r8 = "\r\n"
            byte[] r8 = r8.getBytes()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r3.write(r8)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r9 = "--"
            r8.<init>(r9)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r9 = f27352d     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r8.append(r9)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r9 = "--\r\n"
            r8.append(r9)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            java.lang.String r8 = r8.toString()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            byte[] r8 = r8.getBytes()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r3.write(r8)     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r3.flush()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r3.close()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            int r8 = r7.getResponseCode()     // Catch:{ Throwable -> 0x0252, all -> 0x0250 }
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 != r9) goto L_0x0247
            if (r7 == 0) goto L_0x0243
            r7.disconnect()
        L_0x0243:
            r3.close()     // Catch:{ Throwable -> 0x0246 }
        L_0x0246:
            return r2
        L_0x0247:
            if (r7 == 0) goto L_0x024c
            r7.disconnect()
        L_0x024c:
            r3.close()     // Catch:{ Throwable -> 0x024f }
        L_0x024f:
            return r1
        L_0x0250:
            r8 = move-exception
            goto L_0x025c
        L_0x0252:
            r0 = r3
            goto L_0x0268
        L_0x0254:
            r8 = move-exception
            r3 = r0
            goto L_0x025c
        L_0x0257:
            goto L_0x0268
        L_0x0259:
            r8 = move-exception
            r7 = r0
            r3 = r7
        L_0x025c:
            if (r7 == 0) goto L_0x0261
            r7.disconnect()
        L_0x0261:
            if (r3 == 0) goto L_0x0266
            r3.close()     // Catch:{ Throwable -> 0x0266 }
        L_0x0266:
            throw r8
        L_0x0267:
            r7 = r0
        L_0x0268:
            if (r7 == 0) goto L_0x026d
            r7.disconnect()
        L_0x026d:
            if (r0 == 0) goto L_0x0272
            r0.close()     // Catch:{ Throwable -> 0x0272 }
        L_0x0272:
            return r1
        L_0x0273:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "url and file not be null "
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monitor.cloudmessage.d.c.a.a(java.lang.String, java.io.File, int, java.lang.String, java.lang.String, java.lang.String, long, java.util.HashMap):boolean");
    }
}
