package com.tencent.bugly.crashreport.crash.anr;

import com.tencent.bugly.proguard.x;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class TraceFileHelper {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f79318a;

        /* renamed from: b  reason: collision with root package name */
        public String f79319b;

        /* renamed from: c  reason: collision with root package name */
        public long f79320c;

        /* renamed from: d  reason: collision with root package name */
        public Map<String, String[]> f79321d;
    }

    public interface b {
        boolean a(long j);

        boolean a(long j, long j2, String str);

        boolean a(String str, int i, String str2, String str3);
    }

    private static String a(BufferedReader bufferedReader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 3; i++) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return null;
            }
            stringBuffer.append(readLine + "\n");
        }
        return stringBuffer.toString();
    }

    private static String b(BufferedReader bufferedReader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null && readLine.trim().length() > 0) {
                stringBuffer.append(readLine + "\n");
            }
        }
        return stringBuffer.toString();
    }

    private static Object[] a(BufferedReader bufferedReader, Pattern... patternArr) throws IOException {
        if (bufferedReader == null || patternArr == null) {
            return null;
        }
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return null;
            }
            int length = patternArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Pattern pattern = patternArr[i];
                    if (pattern.matcher(readLine).matches()) {
                        return new Object[]{pattern, readLine};
                    }
                    i++;
                }
            }
        }
    }

    public static a readFirstDumpInfo(String str, final boolean z) {
        if (str == null) {
            x.e("path:%s", str);
            return null;
        }
        final a aVar = new a();
        readTraceFile(str, new b() {
            public final boolean a(long j) {
                x.c("process end %d", Long.valueOf(j));
                return false;
            }

            public final boolean a(long j, long j2, String str) {
                x.c("new process %s", str);
                aVar.f79318a = j;
                aVar.f79319b = str;
                aVar.f79320c = j2;
                if (!z) {
                    return false;
                }
                return true;
            }

            public final boolean a(String str, int i, String str2, String str3) {
                x.c("new thread %s", str);
                if (aVar.f79321d == null) {
                    aVar.f79321d = new HashMap();
                }
                aVar.f79321d.put(str, new String[]{str2, str3, String.valueOf(i)});
                return true;
            }
        });
        if (aVar.f79318a > 0 && aVar.f79320c > 0 && aVar.f79319b != null) {
            return aVar;
        }
        x.e("first dump error %s", aVar.f79318a + " " + aVar.f79320c + " " + aVar.f79319b);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0183 A[SYNTHETIC, Splitter:B:61:0x0183] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x018d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0190 A[SYNTHETIC, Splitter:B:69:0x0190] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void readTraceFile(java.lang.String r16, com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.b r17) {
        /*
            r0 = r16
            r6 = r17
            if (r0 == 0) goto L_0x019a
            if (r6 != 0) goto L_0x000a
            goto L_0x019a
        L_0x000a:
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0016
            return
        L_0x0016:
            r1.lastModified()
            r1.length()
            r2 = 0
            r7 = 2
            r8 = 0
            r9 = 1
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch:{ Exception -> 0x015a }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ Exception -> 0x015a }
            r0.<init>(r1)     // Catch:{ Exception -> 0x015a }
            r10.<init>(r0)     // Catch:{ Exception -> 0x015a }
            java.lang.String r0 = "-{5}\\spid\\s\\d+\\sat\\s\\d+-\\d+-\\d+\\s\\d{2}:\\d{2}:\\d{2}\\s-{5}"
            java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r0)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.String r0 = "-{5}\\send\\s\\d+\\s-{5}"
            java.util.regex.Pattern r12 = java.util.regex.Pattern.compile(r0)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.String r0 = "Cmd\\sline:\\s(\\S+)"
            java.util.regex.Pattern r13 = java.util.regex.Pattern.compile(r0)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.String r0 = "\".+\"\\s(daemon\\s){0,1}prio=\\d+\\stid=\\d+\\s.*"
            java.util.regex.Pattern r14 = java.util.regex.Pattern.compile(r0)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.text.SimpleDateFormat r15 = new java.text.SimpleDateFormat     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.String r0 = "yyyy-MM-dd HH:mm:ss"
            java.util.Locale r1 = java.util.Locale.US     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            r15.<init>(r0, r1)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
        L_0x004b:
            java.util.regex.Pattern[] r0 = new java.util.regex.Pattern[r9]     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            r0[r8] = r11     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.Object[] r0 = a(r10, r0)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            if (r0 == 0) goto L_0x0146
            r0 = r0[r9]     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.String r1 = "\\s"
            java.lang.String[] r0 = r0.split(r1)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            r1 = r0[r7]     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            r3.<init>()     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            r4 = 4
            r4 = r0[r4]     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            r3.append(r4)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.String r4 = " "
            r3.append(r4)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            r4 = 5
            r0 = r0[r4]     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            r3.append(r0)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.util.Date r0 = r15.parse(r0)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            long r3 = r0.getTime()     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.util.regex.Pattern[] r0 = new java.util.regex.Pattern[r9]     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            r0[r8] = r13     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.Object[] r0 = a(r10, r0)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            if (r0 != 0) goto L_0x009d
            r10.close()     // Catch:{ IOException -> 0x0097 }
            return
        L_0x0097:
            r0 = move-exception
            r1 = r0
            com.tencent.bugly.proguard.x.a(r1)
            return
        L_0x009d:
            r0 = r0[r9]     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.util.regex.Matcher r0 = r13.matcher(r0)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            r0.find()     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            r0.group(r9)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.String r5 = r0.group(r9)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            r0 = r17
            boolean r0 = r0.a(r1, r3, r5)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            if (r0 != 0) goto L_0x00c3
            r10.close()     // Catch:{ IOException -> 0x00bd }
            return
        L_0x00bd:
            r0 = move-exception
            r1 = r0
            com.tencent.bugly.proguard.x.a(r1)
            return
        L_0x00c3:
            java.util.regex.Pattern[] r0 = new java.util.regex.Pattern[r7]     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            r0[r8] = r14     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            r0[r9] = r12     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.Object[] r0 = a(r10, r0)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            if (r0 == 0) goto L_0x004b
            r1 = r0[r8]     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            if (r1 != r14) goto L_0x0124
            r0 = r0[r9]     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.String r1 = "\".+\""
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.util.regex.Matcher r1 = r1.matcher(r0)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            r1.find()     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.String r1 = r1.group()     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            int r2 = r1.length()     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            int r2 = r2 - r9
            java.lang.String r1 = r1.substring(r9, r2)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.String r2 = "NATIVE"
            r0.contains(r2)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.String r2 = "tid=\\d+"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.util.regex.Matcher r0 = r2.matcher(r0)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            r0.find()     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.String r0 = r0.group()     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.String r2 = "="
            int r2 = r0.indexOf(r2)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            int r2 = r2 + r9
            java.lang.String r0 = r0.substring(r2)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.String r2 = a(r10)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.String r3 = b(r10)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            r6.a(r1, r0, r2, r3)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            goto L_0x00c3
        L_0x0124:
            r0 = r0[r9]     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            java.lang.String r1 = "\\s"
            java.lang.String[] r0 = r0.split(r1)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            r0 = r0[r7]     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            boolean r0 = r6.a(r0)     // Catch:{ Exception -> 0x0153, all -> 0x0150 }
            if (r0 != 0) goto L_0x004b
            r10.close()     // Catch:{ IOException -> 0x0140 }
            return
        L_0x0140:
            r0 = move-exception
            r1 = r0
            com.tencent.bugly.proguard.x.a(r1)
            return
        L_0x0146:
            r10.close()     // Catch:{ IOException -> 0x014a }
            return
        L_0x014a:
            r0 = move-exception
            r1 = r0
            com.tencent.bugly.proguard.x.a(r1)
            return
        L_0x0150:
            r0 = move-exception
            r1 = r0
            goto L_0x018e
        L_0x0153:
            r0 = move-exception
            r2 = r10
            goto L_0x015b
        L_0x0156:
            r0 = move-exception
            r1 = r0
            r10 = r2
            goto L_0x018e
        L_0x015a:
            r0 = move-exception
        L_0x015b:
            com.tencent.bugly.proguard.x.a(r0)     // Catch:{ all -> 0x0156 }
            java.lang.String r1 = "trace open fail:%s : %s"
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x0156 }
            java.lang.Class r4 = r0.getClass()     // Catch:{ all -> 0x0156 }
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x0156 }
            r3[r8] = r4     // Catch:{ all -> 0x0156 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0156 }
            r4.<init>()     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0156 }
            r4.append(r0)     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0156 }
            r3[r9] = r0     // Catch:{ all -> 0x0156 }
            com.tencent.bugly.proguard.x.d(r1, r3)     // Catch:{ all -> 0x0156 }
            if (r2 == 0) goto L_0x018d
            r2.close()     // Catch:{ IOException -> 0x0187 }
            return
        L_0x0187:
            r0 = move-exception
            r1 = r0
            com.tencent.bugly.proguard.x.a(r1)
            return
        L_0x018d:
            return
        L_0x018e:
            if (r10 == 0) goto L_0x0199
            r10.close()     // Catch:{ IOException -> 0x0194 }
            goto L_0x0199
        L_0x0194:
            r0 = move-exception
            r2 = r0
            com.tencent.bugly.proguard.x.a(r2)
        L_0x0199:
            throw r1
        L_0x019a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.crashreport.crash.anr.TraceFileHelper.readTraceFile(java.lang.String, com.tencent.bugly.crashreport.crash.anr.TraceFileHelper$b):void");
    }

    public static a readTargetDumpInfo(String str, String str2, final boolean z) {
        if (str == null || str2 == null) {
            return null;
        }
        final a aVar = new a();
        readTraceFile(str2, new b() {
            public final boolean a(long j) {
                x.c("process end %d", Long.valueOf(j));
                if (aVar.f79318a <= 0 || aVar.f79320c <= 0 || aVar.f79319b == null) {
                    return true;
                }
                return false;
            }

            public final boolean a(long j, long j2, String str) {
                x.c("new process %s", str);
                if (!str.equals(str)) {
                    return true;
                }
                aVar.f79318a = j;
                aVar.f79319b = str;
                aVar.f79320c = j2;
                if (!z) {
                    return false;
                }
                return true;
            }

            public final boolean a(String str, int i, String str2, String str3) {
                x.c("new thread %s", str);
                if (aVar.f79318a <= 0 || aVar.f79320c <= 0 || aVar.f79319b == null) {
                    return true;
                }
                if (aVar.f79321d == null) {
                    aVar.f79321d = new HashMap();
                }
                aVar.f79321d.put(str, new String[]{str2, str3, String.valueOf(i)});
                return true;
            }
        });
        if (aVar.f79318a <= 0 || aVar.f79320c <= 0 || aVar.f79319b == null) {
            return null;
        }
        return aVar;
    }
}
