package com.bytedance.article.common.monitor.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.c;
import com.taobao.android.dexposed.ClassUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static long f19124a;

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080 A[SYNTHETIC, Splitter:B:26:0x0080] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0085 A[Catch:{ IOException -> 0x0088 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008c A[SYNTHETIC, Splitter:B:36:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0091 A[Catch:{ IOException -> 0x0094 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean b(android.content.Context r4) {
        /*
            boolean r4 = com.bytedance.apm.k.o.a(r4)
            r0 = 0
            if (r4 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.io.File r1 = com.bytedance.apm.k.e.a()
            r4.append(r1)
            java.lang.String r1 = java.io.File.separator
            r4.append(r1)
            java.lang.String r1 = "backfetch"
            r4.append(r1)
            java.lang.String r1 = java.io.File.separator
            r4.append(r1)
            java.lang.String r1 = "sdcardinfo"
            r4.append(r1)
            java.lang.String r1 = java.io.File.separator
            r4.append(r1)
            java.lang.String r1 = "tmp"
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ IOException -> 0x0089, all -> 0x007c }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0089, all -> 0x007c }
            boolean r3 = r2.exists()     // Catch:{ IOException -> 0x0089, all -> 0x007c }
            if (r3 != 0) goto L_0x0045
            r2.mkdirs()     // Catch:{ IOException -> 0x0089, all -> 0x007c }
        L_0x0045:
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch:{ IOException -> 0x0089, all -> 0x007c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0089, all -> 0x007c }
            r3.<init>()     // Catch:{ IOException -> 0x0089, all -> 0x007c }
            r3.append(r4)     // Catch:{ IOException -> 0x0089, all -> 0x007c }
            java.lang.String r4 = java.io.File.separator     // Catch:{ IOException -> 0x0089, all -> 0x007c }
            r3.append(r4)     // Catch:{ IOException -> 0x0089, all -> 0x007c }
            java.lang.String r4 = "sdcardinfo.txt"
            r3.append(r4)     // Catch:{ IOException -> 0x0089, all -> 0x007c }
            java.lang.String r4 = r3.toString()     // Catch:{ IOException -> 0x0089, all -> 0x007c }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0089, all -> 0x007c }
            java.io.BufferedWriter r4 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x008a, all -> 0x007a }
            r4.<init>(r2)     // Catch:{ IOException -> 0x008a, all -> 0x007a }
            java.io.File r1 = com.bytedance.apm.k.e.a()     // Catch:{ IOException -> 0x0078, all -> 0x0074 }
            a(r1, r0, r4)     // Catch:{ IOException -> 0x0078, all -> 0x0074 }
            r4.close()     // Catch:{ IOException -> 0x0072 }
            r2.close()     // Catch:{ IOException -> 0x0072 }
        L_0x0072:
            r4 = 1
            return r4
        L_0x0074:
            r0 = move-exception
            r1 = r4
            r4 = r0
            goto L_0x007e
        L_0x0078:
            r1 = r4
            goto L_0x008a
        L_0x007a:
            r4 = move-exception
            goto L_0x007e
        L_0x007c:
            r4 = move-exception
            r2 = r1
        L_0x007e:
            if (r1 == 0) goto L_0x0083
            r1.close()     // Catch:{ IOException -> 0x0088 }
        L_0x0083:
            if (r2 == 0) goto L_0x0088
            r2.close()     // Catch:{ IOException -> 0x0088 }
        L_0x0088:
            throw r4
        L_0x0089:
            r2 = r1
        L_0x008a:
            if (r1 == 0) goto L_0x008f
            r1.close()     // Catch:{ IOException -> 0x0094 }
        L_0x008f:
            if (r2 == 0) goto L_0x0094
            r2.close()     // Catch:{ IOException -> 0x0094 }
        L_0x0094:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.article.common.monitor.a.e.b(android.content.Context):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0083 A[SYNTHETIC, Splitter:B:26:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088 A[Catch:{ IOException -> 0x008b }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008f A[SYNTHETIC, Splitter:B:36:0x008f] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0094 A[Catch:{ IOException -> 0x0097 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean c(android.content.Context r5) {
        /*
            boolean r0 = com.bytedance.apm.k.o.a(r5)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r2 = com.bytedance.apm.k.e.a()
            r0.append(r2)
            java.lang.String r2 = java.io.File.separator
            r0.append(r2)
            java.lang.String r2 = "backfetch"
            r0.append(r2)
            java.lang.String r2 = java.io.File.separator
            r0.append(r2)
            java.lang.String r2 = "sdcardinfo"
            r0.append(r2)
            java.lang.String r2 = java.io.File.separator
            r0.append(r2)
            java.lang.String r2 = "tmp"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x008c, all -> 0x007f }
            r3.<init>(r0)     // Catch:{ IOException -> 0x008c, all -> 0x007f }
            boolean r4 = r3.exists()     // Catch:{ IOException -> 0x008c, all -> 0x007f }
            if (r4 != 0) goto L_0x0045
            r3.mkdirs()     // Catch:{ IOException -> 0x008c, all -> 0x007f }
        L_0x0045:
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch:{ IOException -> 0x008c, all -> 0x007f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008c, all -> 0x007f }
            r4.<init>()     // Catch:{ IOException -> 0x008c, all -> 0x007f }
            r4.append(r0)     // Catch:{ IOException -> 0x008c, all -> 0x007f }
            java.lang.String r0 = java.io.File.separator     // Catch:{ IOException -> 0x008c, all -> 0x007f }
            r4.append(r0)     // Catch:{ IOException -> 0x008c, all -> 0x007f }
            java.lang.String r0 = "appDataInfo.txt"
            r4.append(r0)     // Catch:{ IOException -> 0x008c, all -> 0x007f }
            java.lang.String r0 = r4.toString()     // Catch:{ IOException -> 0x008c, all -> 0x007f }
            r3.<init>(r0)     // Catch:{ IOException -> 0x008c, all -> 0x007f }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x008d, all -> 0x007d }
            r0.<init>(r3)     // Catch:{ IOException -> 0x008d, all -> 0x007d }
            java.io.File r5 = r5.getCacheDir()     // Catch:{ IOException -> 0x007b, all -> 0x0078 }
            java.io.File r5 = r5.getParentFile()     // Catch:{ IOException -> 0x007b, all -> 0x0078 }
            a(r5, r1, r0)     // Catch:{ IOException -> 0x007b, all -> 0x0078 }
            r0.close()     // Catch:{ IOException -> 0x0076 }
            r3.close()     // Catch:{ IOException -> 0x0076 }
        L_0x0076:
            r5 = 1
            return r5
        L_0x0078:
            r5 = move-exception
            r2 = r0
            goto L_0x0081
        L_0x007b:
            r2 = r0
            goto L_0x008d
        L_0x007d:
            r5 = move-exception
            goto L_0x0081
        L_0x007f:
            r5 = move-exception
            r3 = r2
        L_0x0081:
            if (r2 == 0) goto L_0x0086
            r2.close()     // Catch:{ IOException -> 0x008b }
        L_0x0086:
            if (r3 == 0) goto L_0x008b
            r3.close()     // Catch:{ IOException -> 0x008b }
        L_0x008b:
            throw r5
        L_0x008c:
            r3 = r2
        L_0x008d:
            if (r2 == 0) goto L_0x0092
            r2.close()     // Catch:{ IOException -> 0x0097 }
        L_0x0092:
            if (r3 == 0) goto L_0x0097
            r3.close()     // Catch:{ IOException -> 0x0097 }
        L_0x0097:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.article.common.monitor.a.e.c(android.content.Context):boolean");
    }

    public static boolean a(Context context) {
        String str;
        boolean b2 = b(context);
        if (!b2) {
            return b2;
        }
        boolean c2 = c(context);
        if (!c2) {
            return c2;
        }
        File file = new File(com.bytedance.apm.k.e.a() + File.separator + "backfetch" + File.separator + "sdcardinfo" + File.separator + "tmp");
        try {
            String absolutePath = file.getAbsolutePath();
            StringBuilder sb = new StringBuilder();
            sb.append(file.getParentFile().getAbsolutePath());
            sb.append(File.separator);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HH-mm");
            String a2 = b.a(c.f());
            if (TextUtils.isEmpty(a2)) {
                str = String.format("%s_sdcardinfo.zip", new Object[]{simpleDateFormat.format(new Date(System.currentTimeMillis()))});
            } else {
                str = String.format("%s_sdcardinfo_%s.zip", new Object[]{simpleDateFormat.format(new Date(System.currentTimeMillis())), a2});
            }
            sb.append(str);
            com.bytedance.apm.k.e.a(absolutePath, sb.toString());
            com.bytedance.apm.k.e.a(file.getAbsolutePath());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static void a(File file, int i, BufferedWriter bufferedWriter) throws IOException {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (int i2 = 0; i2 < i; i2++) {
                    bufferedWriter.write("\t");
                }
                bufferedWriter.write(String.format("<dir name=\"%s\">", new Object[]{file.getName()}));
                bufferedWriter.newLine();
                for (int i3 = 0; i3 < listFiles.length; i3++) {
                    if (!listFiles[i3].getName().startsWith(ClassUtils.PACKAGE_SEPARATOR) && listFiles[i3].canRead()) {
                        if (!listFiles[i3].isDirectory()) {
                            for (int i4 = 0; i4 < i + 1; i4++) {
                                bufferedWriter.write("\t");
                            }
                            bufferedWriter.write(String.format("<file name=\"%s\" size=\"%s\"></file>", new Object[]{listFiles[i3].getName(), com.bytedance.apm.k.e.a((double) listFiles[i3].length())}));
                            bufferedWriter.newLine();
                        } else if (listFiles[i3].getPath().indexOf("/.") == -1) {
                            a(listFiles[i3], i + 1, bufferedWriter);
                        }
                    }
                }
                for (int i5 = 0; i5 < i; i5++) {
                    bufferedWriter.write("\t");
                }
                bufferedWriter.write("</dir>");
                bufferedWriter.newLine();
            }
        } else if (!file.getName().startsWith(ClassUtils.PACKAGE_SEPARATOR) && file.canRead()) {
            for (int i6 = 0; i6 < i; i6++) {
                bufferedWriter.write("\t");
            }
            bufferedWriter.write(String.format("<file name=\"%s\" size=\"%s\"></file>", new Object[]{file.getName(), com.bytedance.apm.k.e.a((double) file.length())}));
            bufferedWriter.newLine();
        }
    }
}
