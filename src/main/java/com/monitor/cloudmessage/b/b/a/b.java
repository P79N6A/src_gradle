package com.monitor.cloudmessage.b.b.a;

import com.taobao.android.dexposed.ClassUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public final class b {
    private static void a(File file, BufferedWriter bufferedWriter) throws IOException {
        HashMap hashMap = new HashMap();
        bufferedWriter.write("{");
        bufferedWriter.newLine();
        int i = 0;
        for (File a2 : file.listFiles()) {
            hashMap.clear();
            a(a2, hashMap);
            if (!hashMap.keySet().isEmpty()) {
                i++;
            }
        }
        int i2 = 0;
        for (File a3 : file.listFiles()) {
            hashMap.clear();
            a(a3, hashMap);
            if (!hashMap.keySet().isEmpty()) {
                i2++;
                a(hashMap, 1, bufferedWriter);
                if (i2 < i) {
                    bufferedWriter.write(",");
                }
            }
        }
        bufferedWriter.write("}");
    }

    private static void a(File file, HashMap<String, Object> hashMap) {
        if (!file.getName().startsWith(ClassUtils.PACKAGE_SEPARATOR)) {
            if (file.isFile()) {
                hashMap.put(file.getName(), Long.valueOf(file.length()));
            }
            if (file.isDirectory()) {
                HashMap hashMap2 = new HashMap();
                hashMap.put(file.getName(), hashMap2);
                for (String file2 : file.list()) {
                    a(new File(file, file2), hashMap2);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074 A[SYNTHETIC, Splitter:B:24:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0079 A[Catch:{ IOException -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0081 A[SYNTHETIC, Splitter:B:34:0x0081] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0086 A[Catch:{ IOException -> 0x0089 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File a(android.content.Context r5, java.io.File r6, java.lang.String r7) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r5 = com.monitor.cloudmessage.e.b.a((android.content.Context) r5)
            java.lang.String r5 = r5.getAbsolutePath()
            r0.append(r5)
            java.lang.String r5 = java.io.File.separator
            r0.append(r5)
            java.lang.String r5 = "dirTreeinfo"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r1 = "%s_dirtree.txt"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r7
            java.lang.String r7 = java.lang.String.format(r1, r2)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x007d, all -> 0x0070 }
            r1.<init>(r5)     // Catch:{ IOException -> 0x007d, all -> 0x0070 }
            boolean r5 = r1.exists()     // Catch:{ IOException -> 0x007d, all -> 0x0070 }
            if (r5 != 0) goto L_0x004d
            r1.mkdirs()     // Catch:{ IOException -> 0x007d, all -> 0x0070 }
        L_0x004d:
            java.io.FileWriter r5 = new java.io.FileWriter     // Catch:{ IOException -> 0x007d, all -> 0x0070 }
            r5.<init>(r7)     // Catch:{ IOException -> 0x007d, all -> 0x0070 }
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x006e, all -> 0x0069 }
            r1.<init>(r5)     // Catch:{ IOException -> 0x006e, all -> 0x0069 }
            a((java.io.File) r6, (java.io.BufferedWriter) r1)     // Catch:{ IOException -> 0x007f, all -> 0x0066 }
            r1.close()     // Catch:{ IOException -> 0x0060 }
            r5.close()     // Catch:{ IOException -> 0x0060 }
        L_0x0060:
            java.io.File r5 = new java.io.File
            r5.<init>(r7)
            return r5
        L_0x0066:
            r6 = move-exception
            r0 = r1
            goto L_0x006a
        L_0x0069:
            r6 = move-exception
        L_0x006a:
            r4 = r6
            r6 = r5
            r5 = r4
            goto L_0x0072
        L_0x006e:
            r1 = r0
            goto L_0x007f
        L_0x0070:
            r5 = move-exception
            r6 = r0
        L_0x0072:
            if (r0 == 0) goto L_0x0077
            r0.close()     // Catch:{ IOException -> 0x007c }
        L_0x0077:
            if (r6 == 0) goto L_0x007c
            r6.close()     // Catch:{ IOException -> 0x007c }
        L_0x007c:
            throw r5
        L_0x007d:
            r5 = r0
            r1 = r5
        L_0x007f:
            if (r1 == 0) goto L_0x0084
            r1.close()     // Catch:{ IOException -> 0x0089 }
        L_0x0084:
            if (r5 == 0) goto L_0x0089
            r5.close()     // Catch:{ IOException -> 0x0089 }
        L_0x0089:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monitor.cloudmessage.b.b.a.b.a(android.content.Context, java.io.File, java.lang.String):java.io.File");
    }

    private static void a(HashMap<String, Object> hashMap, int i, BufferedWriter bufferedWriter) throws IOException {
        int size = hashMap.keySet().size();
        int i2 = 0;
        for (String next : hashMap.keySet()) {
            Object obj = hashMap.get(next);
            i2++;
            if (obj instanceof Long) {
                for (int i3 = 0; i3 < i + 1; i3++) {
                    bufferedWriter.write("\t");
                }
                bufferedWriter.write(String.format("\"%s\": %d", new Object[]{next.replaceAll("\n", ""), Long.valueOf(((Long) obj).longValue())}));
                if (i2 < size) {
                    bufferedWriter.write(",");
                }
                bufferedWriter.newLine();
            } else {
                for (int i4 = 0; i4 < i; i4++) {
                    bufferedWriter.write("\t");
                }
                bufferedWriter.write(String.format("\"%s\": {", new Object[]{next.replaceAll("\n", "")}));
                bufferedWriter.newLine();
                int i5 = i + 1;
                a((HashMap) obj, i5, bufferedWriter);
                for (int i6 = 0; i6 < i5; i6++) {
                    bufferedWriter.write("\t");
                }
                bufferedWriter.write("}");
                if (i2 < size) {
                    bufferedWriter.write(",");
                }
                bufferedWriter.newLine();
            }
        }
    }
}
