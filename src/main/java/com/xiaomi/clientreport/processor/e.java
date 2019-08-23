package com.xiaomi.clientreport.processor;

import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.push.z;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

public class e {
    private static PerfClientReport a(PerfClientReport perfClientReport, String str) {
        if (perfClientReport == null) {
            return null;
        }
        long[] a2 = a(str);
        if (a2 == null) {
            return null;
        }
        perfClientReport.perfCounts = a2[0];
        perfClientReport.perfLatencies = a2[1];
        return perfClientReport;
    }

    private static PerfClientReport a(String str) {
        PerfClientReport perfClientReport = null;
        try {
            String[] a2 = a(str);
            if (a2 == null || a2.length < 4 || TextUtils.isEmpty(a2[0]) || TextUtils.isEmpty(a2[1]) || TextUtils.isEmpty(a2[2]) || TextUtils.isEmpty(a2[3])) {
                return null;
            }
            PerfClientReport blankInstance = PerfClientReport.getBlankInstance();
            try {
                blankInstance.production = Integer.parseInt(a2[0]);
                blankInstance.clientInterfaceId = a2[1];
                blankInstance.reportType = Integer.parseInt(a2[2]);
                blankInstance.code = Integer.parseInt(a2[3]);
                return blankInstance;
            } catch (Exception unused) {
                perfClientReport = blankInstance;
                b.c("parse per key error");
                return perfClientReport;
            }
        } catch (Exception unused2) {
            b.c("parse per key error");
            return perfClientReport;
        }
    }

    public static String a(PerfClientReport perfClientReport) {
        return perfClientReport.production + "#" + perfClientReport.clientInterfaceId + "#" + perfClientReport.reportType + "#" + perfClientReport.code;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static HashMap<String, String> m27a(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String[] split = readLine.split("%%%");
                        if (split.length >= 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
                            hashMap.put(split[0], split[1]);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        bufferedReader = bufferedReader2;
                        try {
                            b.a((Throwable) e);
                            z.a((Closeable) bufferedReader);
                            return hashMap;
                        } catch (Throwable th) {
                            th = th;
                            z.a((Closeable) bufferedReader);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        z.a((Closeable) bufferedReader);
                        throw th;
                    }
                }
                z.a((Closeable) bufferedReader2);
            } catch (Exception e3) {
                e = e3;
                b.a((Throwable) e);
                z.a((Closeable) bufferedReader);
                return hashMap;
            }
        }
        return hashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.io.RandomAccessFile} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.io.RandomAccessFile} */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00d4, code lost:
        if (r1 == null) goto L_0x00f7;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> a(android.content.Context r7, java.lang.String r8) {
        /*
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x00f7
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0018
            goto L_0x00f7
        L_0x0018:
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x00b7, all -> 0x00b2 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b7, all -> 0x00b2 }
            r2.<init>()     // Catch:{ Exception -> 0x00b7, all -> 0x00b2 }
            r2.append(r8)     // Catch:{ Exception -> 0x00b7, all -> 0x00b2 }
            java.lang.String r3 = ".lock"
            r2.append(r3)     // Catch:{ Exception -> 0x00b7, all -> 0x00b2 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00b7, all -> 0x00b2 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x00b7, all -> 0x00b2 }
            com.xiaomi.push.z.a((java.io.File) r1)     // Catch:{ Exception -> 0x00af, all -> 0x00ac }
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00af, all -> 0x00ac }
            java.lang.String r3 = "rw"
            r2.<init>(r1, r3)     // Catch:{ Exception -> 0x00af, all -> 0x00ac }
            java.nio.channels.FileChannel r3 = r2.getChannel()     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            java.nio.channels.FileLock r3 = r3.lock()     // Catch:{ Exception -> 0x00a9, all -> 0x00a6 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00a2, all -> 0x009e }
            java.io.FileReader r5 = new java.io.FileReader     // Catch:{ Exception -> 0x00a2, all -> 0x009e }
            r5.<init>(r8)     // Catch:{ Exception -> 0x00a2, all -> 0x009e }
            r4.<init>(r5)     // Catch:{ Exception -> 0x00a2, all -> 0x009e }
        L_0x004b:
            java.lang.String r8 = r4.readLine()     // Catch:{ Exception -> 0x009c, all -> 0x009a }
            if (r8 == 0) goto L_0x0083
            java.lang.String r0 = "%%%"
            java.lang.String[] r8 = r8.split(r0)     // Catch:{ Exception -> 0x009c, all -> 0x009a }
            int r0 = r8.length     // Catch:{ Exception -> 0x009c, all -> 0x009a }
            r5 = 2
            if (r0 < r5) goto L_0x004b
            r0 = 0
            r5 = r8[r0]     // Catch:{ Exception -> 0x009c, all -> 0x009a }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x009c, all -> 0x009a }
            if (r5 != 0) goto L_0x004b
            r5 = 1
            r6 = r8[r5]     // Catch:{ Exception -> 0x009c, all -> 0x009a }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x009c, all -> 0x009a }
            if (r6 != 0) goto L_0x004b
            r0 = r8[r0]     // Catch:{ Exception -> 0x009c, all -> 0x009a }
            com.xiaomi.clientreport.data.PerfClientReport r0 = a((java.lang.String) r0)     // Catch:{ Exception -> 0x009c, all -> 0x009a }
            r8 = r8[r5]     // Catch:{ Exception -> 0x009c, all -> 0x009a }
            com.xiaomi.clientreport.data.PerfClientReport r8 = a((com.xiaomi.clientreport.data.PerfClientReport) r0, (java.lang.String) r8)     // Catch:{ Exception -> 0x009c, all -> 0x009a }
            if (r8 == 0) goto L_0x004b
            java.lang.String r8 = r8.toJsonString()     // Catch:{ Exception -> 0x009c, all -> 0x009a }
            r7.add(r8)     // Catch:{ Exception -> 0x009c, all -> 0x009a }
            goto L_0x004b
        L_0x0083:
            if (r3 == 0) goto L_0x0093
            boolean r8 = r3.isValid()
            if (r8 == 0) goto L_0x0093
            r3.release()     // Catch:{ IOException -> 0x008f }
            goto L_0x0093
        L_0x008f:
            r8 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r8)
        L_0x0093:
            com.xiaomi.push.z.a((java.io.Closeable) r2)
            com.xiaomi.push.z.a((java.io.Closeable) r4)
            goto L_0x00d6
        L_0x009a:
            r7 = move-exception
            goto L_0x00a0
        L_0x009c:
            r8 = move-exception
            goto L_0x00a4
        L_0x009e:
            r7 = move-exception
            r4 = r0
        L_0x00a0:
            r0 = r3
            goto L_0x00db
        L_0x00a2:
            r8 = move-exception
            r4 = r0
        L_0x00a4:
            r0 = r3
            goto L_0x00bb
        L_0x00a6:
            r7 = move-exception
            r4 = r0
            goto L_0x00db
        L_0x00a9:
            r8 = move-exception
            r4 = r0
            goto L_0x00bb
        L_0x00ac:
            r7 = move-exception
            r2 = r0
            goto L_0x00b5
        L_0x00af:
            r8 = move-exception
            r2 = r0
            goto L_0x00ba
        L_0x00b2:
            r7 = move-exception
            r1 = r0
            r2 = r1
        L_0x00b5:
            r4 = r2
            goto L_0x00db
        L_0x00b7:
            r8 = move-exception
            r1 = r0
            r2 = r1
        L_0x00ba:
            r4 = r2
        L_0x00bb:
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r8)     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00ce
            boolean r8 = r0.isValid()
            if (r8 == 0) goto L_0x00ce
            r0.release()     // Catch:{ IOException -> 0x00ca }
            goto L_0x00ce
        L_0x00ca:
            r8 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r8)
        L_0x00ce:
            com.xiaomi.push.z.a((java.io.Closeable) r2)
            com.xiaomi.push.z.a((java.io.Closeable) r4)
            if (r1 == 0) goto L_0x00f7
        L_0x00d6:
            r1.delete()
            goto L_0x00f7
        L_0x00da:
            r7 = move-exception
        L_0x00db:
            if (r0 == 0) goto L_0x00eb
            boolean r8 = r0.isValid()
            if (r8 == 0) goto L_0x00eb
            r0.release()     // Catch:{ IOException -> 0x00e7 }
            goto L_0x00eb
        L_0x00e7:
            r8 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r8)
        L_0x00eb:
            com.xiaomi.push.z.a((java.io.Closeable) r2)
            com.xiaomi.push.z.a((java.io.Closeable) r4)
            if (r1 == 0) goto L_0x00f6
            r1.delete()
        L_0x00f6:
            throw r7
        L_0x00f7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.clientreport.processor.e.a(android.content.Context, java.lang.String):java.util.List");
    }

    private static void a(String str, HashMap<String, String> hashMap) {
        BufferedWriter bufferedWriter;
        Exception e2;
        if (!TextUtils.isEmpty(str) && hashMap != null && hashMap.size() != 0) {
            File file = new File(str);
            if (file.exists()) {
                file.delete();
            }
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(file));
                try {
                    for (String next : hashMap.keySet()) {
                        bufferedWriter.write(next + "%%%" + hashMap.get(next));
                        bufferedWriter.newLine();
                    }
                    z.a((Closeable) bufferedWriter);
                } catch (Exception e3) {
                    e2 = e3;
                    try {
                        b.a((Throwable) e2);
                        z.a((Closeable) bufferedWriter);
                    } catch (Throwable th) {
                        th = th;
                        z.a((Closeable) bufferedWriter);
                        throw th;
                    }
                }
            } catch (Exception e4) {
                bufferedWriter = null;
                e2 = e4;
                b.a((Throwable) e2);
                z.a((Closeable) bufferedWriter);
            } catch (Throwable th2) {
                bufferedWriter = null;
                th = th2;
                z.a((Closeable) bufferedWriter);
                throw th;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.nio.channels.FileLock} */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r13, com.xiaomi.clientreport.data.a[] r14) {
        /*
            if (r14 == 0) goto L_0x00bd
            int r0 = r14.length
            if (r0 <= 0) goto L_0x00bd
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 == 0) goto L_0x000d
            goto L_0x00bd
        L_0x000d:
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ Throwable -> 0x008c, all -> 0x0089 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x008c, all -> 0x0089 }
            r2.<init>()     // Catch:{ Throwable -> 0x008c, all -> 0x0089 }
            r2.append(r13)     // Catch:{ Throwable -> 0x008c, all -> 0x0089 }
            java.lang.String r3 = ".lock"
            r2.append(r3)     // Catch:{ Throwable -> 0x008c, all -> 0x0089 }
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x008c, all -> 0x0089 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x008c, all -> 0x0089 }
            com.xiaomi.push.z.a((java.io.File) r1)     // Catch:{ Throwable -> 0x008c, all -> 0x0089 }
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ Throwable -> 0x008c, all -> 0x0089 }
            java.lang.String r3 = "rw"
            r2.<init>(r1, r3)     // Catch:{ Throwable -> 0x008c, all -> 0x0089 }
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch:{ Throwable -> 0x0086, all -> 0x0084 }
            java.nio.channels.FileLock r1 = r1.lock()     // Catch:{ Throwable -> 0x0086, all -> 0x0084 }
            java.util.HashMap r0 = a((java.lang.String) r13)     // Catch:{ Throwable -> 0x0087, all -> 0x0082 }
            int r9 = r14.length     // Catch:{ Throwable -> 0x0087, all -> 0x0082 }
            r3 = 0
            r10 = 0
        L_0x003d:
            if (r10 >= r9) goto L_0x006b
            r3 = r14[r10]
            if (r3 == 0) goto L_0x0068
            r4 = r3
            com.xiaomi.clientreport.data.PerfClientReport r4 = (com.xiaomi.clientreport.data.PerfClientReport) r4     // Catch:{ Throwable -> 0x0087, all -> 0x0082 }
            java.lang.String r4 = a((com.xiaomi.clientreport.data.PerfClientReport) r4)     // Catch:{ Throwable -> 0x0087, all -> 0x0082 }
            r5 = r3
            com.xiaomi.clientreport.data.PerfClientReport r5 = (com.xiaomi.clientreport.data.PerfClientReport) r5     // Catch:{ Throwable -> 0x0087, all -> 0x0082 }
            long r5 = r5.perfCounts     // Catch:{ Throwable -> 0x0087, all -> 0x0082 }
            com.xiaomi.clientreport.data.PerfClientReport r3 = (com.xiaomi.clientreport.data.PerfClientReport) r3     // Catch:{ Throwable -> 0x0087, all -> 0x0082 }
            long r7 = r3.perfLatencies     // Catch:{ Throwable -> 0x0087, all -> 0x0082 }
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x0087, all -> 0x0082 }
            if (r3 != 0) goto L_0x0068
            r11 = 0
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x0068
            int r3 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r3 >= 0) goto L_0x0064
            goto L_0x0068
        L_0x0064:
            r3 = r0
            a(r3, r4, r5, r7)     // Catch:{ Throwable -> 0x0087, all -> 0x0082 }
        L_0x0068:
            int r10 = r10 + 1
            goto L_0x003d
        L_0x006b:
            a((java.lang.String) r13, (java.util.HashMap<java.lang.String, java.lang.String>) r0)     // Catch:{ Throwable -> 0x0087, all -> 0x0082 }
            if (r1 == 0) goto L_0x007e
            boolean r13 = r1.isValid()
            if (r13 == 0) goto L_0x007e
            r1.release()     // Catch:{ IOException -> 0x007a }
            goto L_0x007e
        L_0x007a:
            r13 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r13)
        L_0x007e:
            com.xiaomi.push.z.a((java.io.Closeable) r2)
            return
        L_0x0082:
            r13 = move-exception
            goto L_0x00a8
        L_0x0084:
            r13 = move-exception
            goto L_0x00a9
        L_0x0086:
            r1 = r0
        L_0x0087:
            r0 = r2
            goto L_0x008d
        L_0x0089:
            r13 = move-exception
            r2 = r0
            goto L_0x00a9
        L_0x008c:
            r1 = r0
        L_0x008d:
            java.lang.String r13 = "failed to write perf to file "
            com.xiaomi.channel.commonutils.logger.b.c(r13)     // Catch:{ all -> 0x00a6 }
            if (r1 == 0) goto L_0x00a2
            boolean r13 = r1.isValid()
            if (r13 == 0) goto L_0x00a2
            r1.release()     // Catch:{ IOException -> 0x009e }
            goto L_0x00a2
        L_0x009e:
            r13 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r13)
        L_0x00a2:
            com.xiaomi.push.z.a((java.io.Closeable) r0)
            return
        L_0x00a6:
            r13 = move-exception
            r2 = r0
        L_0x00a8:
            r0 = r1
        L_0x00a9:
            if (r0 == 0) goto L_0x00b9
            boolean r14 = r0.isValid()
            if (r14 == 0) goto L_0x00b9
            r0.release()     // Catch:{ IOException -> 0x00b5 }
            goto L_0x00b9
        L_0x00b5:
            r14 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r14)
        L_0x00b9:
            com.xiaomi.push.z.a((java.io.Closeable) r2)
            throw r13
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.clientreport.processor.e.a(java.lang.String, com.xiaomi.clientreport.data.a[]):void");
    }

    private static void a(HashMap<String, String> hashMap, String str, long j, long j2) {
        StringBuilder sb;
        String str2 = hashMap.get(str);
        if (TextUtils.isEmpty(str2)) {
            hashMap.put(str, j + "#" + j2);
            return;
        }
        long[] a2 = a(str2);
        if (a2 == null || a2[0] <= 0 || a2[1] < 0) {
            sb = new StringBuilder();
            sb.append(j);
            sb.append("#");
            sb.append(j2);
        } else {
            long j3 = a2[0];
            long j4 = a2[1];
            sb = new StringBuilder();
            sb.append(j3 + j);
            sb.append("#");
            sb.append(j4 + j2);
        }
        hashMap.put(str, sb.toString());
    }

    /* renamed from: a  reason: collision with other method in class */
    protected static long[] m28a(String str) {
        long[] jArr = new long[2];
        try {
            String[] split = str.split("#");
            if (split.length < 2) {
                return jArr;
            }
            jArr[0] = Long.parseLong(split[0].trim());
            jArr[1] = Long.parseLong(split[1].trim());
            return jArr;
        } catch (Exception e2) {
            b.a((Throwable) e2);
            return null;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private static String[] m29a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split("#");
    }
}
