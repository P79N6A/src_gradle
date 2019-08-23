package com.alibaba.sdk.android.utils;

import android.content.Context;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class AMSDevReporter {

    /* renamed from: a  reason: collision with root package name */
    private static Context f5136a;

    /* renamed from: a  reason: collision with other field name */
    private static c f30a = new c("AMSDevReporter");

    /* renamed from: a  reason: collision with other field name */
    private static ConcurrentHashMap<AMSSdkTypeEnum, AMSReportStatusEnum> f31a = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with other field name */
    private static final ExecutorService f32a = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor(new a());

    /* renamed from: a  reason: collision with other field name */
    private static boolean f33a = false;

    public enum AMSReportStatusEnum {
        UNREPORTED,
        REPORTED
    }

    public enum AMSSdkExtInfoKeyEnum {
        AMS_EXTINFO_KEY_VERSION("SdkVersion"),
        AMS_EXTINFO_KEY_PACKAGE("PackageName");
        
        private String description;

        public final String toString() {
            return this.description;
        }

        private AMSSdkExtInfoKeyEnum(String str) {
            this.description = str;
        }
    }

    public enum AMSSdkTypeEnum {
        AMS_MAN("MAN"),
        AMS_HTTPDNS("HTTPDNS"),
        AMS_MPUSH("MPUSH"),
        AMS_MAC("MAC"),
        AMS_API("API"),
        AMS_HOTFIX("HOTFIX"),
        AMS_FEEDBACK("FEEDBACK"),
        AMS_IM("IM");
        
        private String description;

        public final String toString() {
            return this.description;
        }

        private AMSSdkTypeEnum(String str) {
            this.description = str;
        }
    }

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor(ThreadFactory threadFactory) {
            return h.a(m.a(p.FIXED).a(1).a(threadFactory).a());
        }
    }

    static {
        for (AMSSdkTypeEnum put : AMSSdkTypeEnum.values()) {
            f31a.put(put, AMSReportStatusEnum.UNREPORTED);
        }
    }

    public static void setLogEnabled(boolean z) {
        f30a.setLogEnabled(z);
    }

    public static AMSReportStatusEnum getReportStatus(AMSSdkTypeEnum aMSSdkTypeEnum) {
        return f31a.get(aMSSdkTypeEnum);
    }

    public static void asyncReport(Context context, AMSSdkTypeEnum aMSSdkTypeEnum) {
        asyncReport(context, aMSSdkTypeEnum, null);
    }

    /* access modifiers changed from: private */
    public static void a(AMSSdkTypeEnum aMSSdkTypeEnum, Map<String, Object> map) {
        String aMSSdkTypeEnum2 = aMSSdkTypeEnum.toString();
        if (f31a.get(aMSSdkTypeEnum) != AMSReportStatusEnum.UNREPORTED) {
            c cVar = f30a;
            cVar.b("[" + aMSSdkTypeEnum2 + "] already reported, return.");
            return;
        }
        int i = 0;
        int i2 = 5;
        while (true) {
            c cVar2 = f30a;
            StringBuilder sb = new StringBuilder("Report [");
            sb.append(aMSSdkTypeEnum2);
            sb.append("], times: [");
            i++;
            sb.append(i);
            sb.append("].");
            cVar2.b(sb.toString());
            if (!a(aMSSdkTypeEnum, map)) {
                if (i > 10) {
                    c cVar3 = f30a;
                    cVar3.c("Report [" + aMSSdkTypeEnum2 + "] stat failed, exceed max retry times, return.");
                    f31a.put(aMSSdkTypeEnum, AMSReportStatusEnum.UNREPORTED);
                    f33a = true;
                    break;
                }
                c cVar4 = f30a;
                cVar4.b("Report [" + aMSSdkTypeEnum2 + "] failed, wait for [" + i2 + "] seconds.");
                d.a((double) i2);
                i2 *= 2;
                if (i2 >= 60) {
                    i2 = 60;
                }
            } else {
                c cVar5 = f30a;
                cVar5.b("Report [" + aMSSdkTypeEnum2 + "] stat success.");
                f31a.put(aMSSdkTypeEnum, AMSReportStatusEnum.REPORTED);
                break;
            }
        }
        if (f33a) {
            c cVar6 = f30a;
            cVar6.c("Report [" + aMSSdkTypeEnum2 + "] failed, clear remain report in queue.");
        }
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a6 A[SYNTHETIC, Splitter:B:66:0x01a6] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01ae A[Catch:{ IOException -> 0x01aa }] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01c3 A[SYNTHETIC, Splitter:B:80:0x01c3] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01cb A[Catch:{ IOException -> 0x01c7 }] */
    /* renamed from: a  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m11a(com.alibaba.sdk.android.utils.AMSDevReporter.AMSSdkTypeEnum r8, java.util.Map<java.lang.String, java.lang.Object> r9) {
        /*
            r0 = 0
            r1 = 0
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            r3 = 14
            if (r2 < r3) goto L_0x000e
            r2 = 40965(0xa005, float:5.7404E-41)
            android.net.TrafficStats.setThreadStatsTag(r2)     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
        L_0x000e:
            android.content.Context r2 = f5136a     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            java.lang.String r2 = com.ut.device.UTDevice.getUtdid(r2)     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            com.alibaba.sdk.android.utils.c r3 = f30a     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            java.lang.String r5 = "stat: "
            r4.<init>(r5)     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            r4.append(r2)     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            r3.b(r4)     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            java.lang.String r8 = a(r8, r2, r9)     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            java.lang.String r2 = "23356390Raw"
            r9.<init>(r2)     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            java.lang.String r2 = com.alibaba.sdk.android.utils.d.a((java.lang.String) r8)     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            r9.append(r2)     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            java.lang.String r3 = "16594f72217bece5a457b4803a48f2da"
            r2.<init>(r3)     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            java.lang.String r9 = com.alibaba.sdk.android.utils.d.a((java.lang.String) r9)     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            r2.append(r9)     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            java.lang.String r9 = "16594f72217bece5a457b4803a48f2da"
            r2.append(r9)     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            java.lang.String r9 = r2.toString()     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            java.lang.String r9 = com.alibaba.sdk.android.utils.d.b(r9)     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            java.lang.String r3 = "http://adash.man.aliyuncs.com:80/man/api?ak=23356390&s="
            r2.<init>(r3)     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            r2.append(r9)     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            java.lang.String r9 = r2.toString()     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            r2.<init>(r9)     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            java.net.URLConnection r9 = r2.openConnection()     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch:{ Exception -> 0x0197, all -> 0x0193 }
            r2 = 1
            r9.setDoOutput(r2)     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            r9.setUseCaches(r0)     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            r3 = 15000(0x3a98, float:2.102E-41)
            r9.setConnectTimeout(r3)     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            java.lang.String r4 = "==="
            r3.<init>(r4)     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            r3.append(r4)     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            java.lang.String r4 = "==="
            r3.append(r4)     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            java.lang.String r4 = "Content-Type"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            java.lang.String r6 = "multipart/form-data; boundary="
            r5.<init>(r6)     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            r5.append(r3)     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            r9.setRequestProperty(r4, r5)     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            java.lang.String r5 = "--"
            r4.<init>(r5)     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            r4.append(r3)     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            java.lang.String r5 = "\r\nContent-Disposition: form-data; name=\"Raw"
            r4.append(r5)     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            java.lang.String r5 = "\"\r\nContent-Type: text/plain; charset=UTF-8\r\n\r\n"
            r4.append(r5)     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            r4.append(r8)     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            java.lang.String r8 = "\r\n--"
            r4.append(r8)     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            r4.append(r3)     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            java.lang.String r8 = "--\r\n"
            r4.append(r8)     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            java.lang.String r8 = r4.toString()     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            java.io.OutputStream r3 = r9.getOutputStream()     // Catch:{ Exception -> 0x018e, all -> 0x018b }
            byte[] r8 = r8.getBytes()     // Catch:{ Exception -> 0x0186, all -> 0x0183 }
            r3.write(r8)     // Catch:{ Exception -> 0x0186, all -> 0x0183 }
            int r8 = r9.getResponseCode()     // Catch:{ Exception -> 0x0186, all -> 0x0183 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r8 != r4) goto L_0x015f
            java.io.DataInputStream r8 = new java.io.DataInputStream     // Catch:{ Exception -> 0x0186, all -> 0x0183 }
            java.io.InputStream r4 = r9.getInputStream()     // Catch:{ Exception -> 0x0186, all -> 0x0183 }
            r8.<init>(r4)     // Catch:{ Exception -> 0x0186, all -> 0x0183 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0159, all -> 0x0152 }
            r1.<init>()     // Catch:{ Exception -> 0x0159, all -> 0x0152 }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ Exception -> 0x0159, all -> 0x0152 }
        L_0x00f4:
            int r5 = r8.read(r4)     // Catch:{ Exception -> 0x0159, all -> 0x0152 }
            r6 = -1
            if (r5 == r6) goto L_0x0104
            java.lang.String r6 = new java.lang.String     // Catch:{ Exception -> 0x0159, all -> 0x0152 }
            r6.<init>(r4, r0, r5)     // Catch:{ Exception -> 0x0159, all -> 0x0152 }
            r1.append(r6)     // Catch:{ Exception -> 0x0159, all -> 0x0152 }
            goto L_0x00f4
        L_0x0104:
            com.alibaba.sdk.android.utils.c r4 = f30a     // Catch:{ Exception -> 0x0159, all -> 0x0152 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0159, all -> 0x0152 }
            java.lang.String r6 = "Get MAN response: "
            r5.<init>(r6)     // Catch:{ Exception -> 0x0159, all -> 0x0152 }
            java.lang.String r6 = r1.toString()     // Catch:{ Exception -> 0x0159, all -> 0x0152 }
            r5.append(r6)     // Catch:{ Exception -> 0x0159, all -> 0x0152 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0159, all -> 0x0152 }
            r4.a((java.lang.String) r5)     // Catch:{ Exception -> 0x0159, all -> 0x0152 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x014b }
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x014b }
            r4.<init>(r1)     // Catch:{ JSONException -> 0x014b }
            java.lang.String r1 = "success"
            java.lang.Object r1 = r4.get(r1)     // Catch:{ JSONException -> 0x014b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x014b }
            java.lang.String r4 = "success"
            boolean r1 = r1.equals(r4)     // Catch:{ JSONException -> 0x014b }
            if (r1 == 0) goto L_0x0173
            if (r9 == 0) goto L_0x0139
            r9.disconnect()
        L_0x0139:
            if (r3 == 0) goto L_0x0141
            r3.close()     // Catch:{ IOException -> 0x013f }
            goto L_0x0141
        L_0x013f:
            r8 = move-exception
            goto L_0x0145
        L_0x0141:
            r8.close()     // Catch:{ IOException -> 0x013f }
            goto L_0x014a
        L_0x0145:
            com.alibaba.sdk.android.utils.c r9 = f30a
            r9.a((java.lang.Throwable) r8)
        L_0x014a:
            return r2
        L_0x014b:
            r1 = move-exception
            com.alibaba.sdk.android.utils.c r2 = f30a     // Catch:{ Exception -> 0x0159, all -> 0x0152 }
            r2.a((java.lang.Throwable) r1)     // Catch:{ Exception -> 0x0159, all -> 0x0152 }
            goto L_0x0173
        L_0x0152:
            r0 = move-exception
            r1 = r3
            r7 = r0
            r0 = r8
            r8 = r7
            goto L_0x01bc
        L_0x0159:
            r1 = move-exception
            r7 = r9
            r9 = r8
            r8 = r1
            r1 = r7
            goto L_0x019a
        L_0x015f:
            com.alibaba.sdk.android.utils.c r2 = f30a     // Catch:{ Exception -> 0x0186, all -> 0x0183 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0186, all -> 0x0183 }
            java.lang.String r5 = "MAN API error, response code: "
            r4.<init>(r5)     // Catch:{ Exception -> 0x0186, all -> 0x0183 }
            r4.append(r8)     // Catch:{ Exception -> 0x0186, all -> 0x0183 }
            java.lang.String r8 = r4.toString()     // Catch:{ Exception -> 0x0186, all -> 0x0183 }
            r2.c(r8)     // Catch:{ Exception -> 0x0186, all -> 0x0183 }
            r8 = r1
        L_0x0173:
            if (r9 == 0) goto L_0x0178
            r9.disconnect()
        L_0x0178:
            if (r3 == 0) goto L_0x017d
            r3.close()     // Catch:{ IOException -> 0x01aa }
        L_0x017d:
            if (r8 == 0) goto L_0x01b7
            r8.close()     // Catch:{ IOException -> 0x01aa }
            goto L_0x01b7
        L_0x0183:
            r8 = move-exception
            r0 = r1
            goto L_0x01bb
        L_0x0186:
            r8 = move-exception
            r7 = r1
            r1 = r9
            r9 = r7
            goto L_0x019a
        L_0x018b:
            r8 = move-exception
            r0 = r1
            goto L_0x01bc
        L_0x018e:
            r8 = move-exception
            r3 = r1
            r1 = r9
            r9 = r3
            goto L_0x019a
        L_0x0193:
            r8 = move-exception
            r9 = r1
            r0 = r9
            goto L_0x01bc
        L_0x0197:
            r8 = move-exception
            r9 = r1
            r3 = r9
        L_0x019a:
            com.alibaba.sdk.android.utils.c r2 = f30a     // Catch:{ all -> 0x01b8 }
            r2.a((java.lang.Throwable) r8)     // Catch:{ all -> 0x01b8 }
            if (r1 == 0) goto L_0x01a4
            r1.disconnect()
        L_0x01a4:
            if (r3 == 0) goto L_0x01ac
            r3.close()     // Catch:{ IOException -> 0x01aa }
            goto L_0x01ac
        L_0x01aa:
            r8 = move-exception
            goto L_0x01b2
        L_0x01ac:
            if (r9 == 0) goto L_0x01b7
            r9.close()     // Catch:{ IOException -> 0x01aa }
            goto L_0x01b7
        L_0x01b2:
            com.alibaba.sdk.android.utils.c r9 = f30a
            r9.a((java.lang.Throwable) r8)
        L_0x01b7:
            return r0
        L_0x01b8:
            r8 = move-exception
            r0 = r9
            r9 = r1
        L_0x01bb:
            r1 = r3
        L_0x01bc:
            if (r9 == 0) goto L_0x01c1
            r9.disconnect()
        L_0x01c1:
            if (r1 == 0) goto L_0x01c9
            r1.close()     // Catch:{ IOException -> 0x01c7 }
            goto L_0x01c9
        L_0x01c7:
            r9 = move-exception
            goto L_0x01cf
        L_0x01c9:
            if (r0 == 0) goto L_0x01d4
            r0.close()     // Catch:{ IOException -> 0x01c7 }
            goto L_0x01d4
        L_0x01cf:
            com.alibaba.sdk.android.utils.c r0 = f30a
            r0.a((java.lang.Throwable) r9)
        L_0x01d4:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.utils.AMSDevReporter.m11a(com.alibaba.sdk.android.utils.AMSDevReporter$AMSSdkTypeEnum, java.util.Map):boolean");
    }

    public static void asyncReport(Context context, final AMSSdkTypeEnum aMSSdkTypeEnum, final Map<String, Object> map) {
        if (context == null) {
            f30a.c("Context is null, return.");
            return;
        }
        f5136a = context;
        c cVar = f30a;
        cVar.b("Add [" + aMSSdkTypeEnum.toString() + "] to report queue.");
        f33a = false;
        f32a.execute(new Runnable() {
            public final void run() {
                if (AMSDevReporter.a()) {
                    AMSDevReporter.a().c("Unable to execute remain task in queue, return.");
                    return;
                }
                c a2 = AMSDevReporter.a();
                a2.b("Get [" + aMSSdkTypeEnum.toString() + "] from report queue.");
                AMSDevReporter.a(aMSSdkTypeEnum, map);
            }
        });
    }

    private static String a(AMSSdkTypeEnum aMSSdkTypeEnum, String str, Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        sb.append(aMSSdkTypeEnum);
        sb.append("-");
        sb.append(str);
        if (map != null) {
            String str2 = (String) map.get(AMSSdkExtInfoKeyEnum.AMS_EXTINFO_KEY_VERSION.toString());
            if (!d.a(str2)) {
                sb.append("-");
                sb.append(str2);
            }
            String str3 = (String) map.get(AMSSdkExtInfoKeyEnum.AMS_EXTINFO_KEY_PACKAGE.toString());
            if (!d.a(str3)) {
                sb.append("-");
                sb.append(str3);
            }
        }
        return sb.toString();
    }
}
