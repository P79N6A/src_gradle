package com.bytedance.frameworks.plugin.b;

import android.os.Build;
import com.bytedance.frameworks.plugin.f.g;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static String f2168a = "";

    /* renamed from: b  reason: collision with root package name */
    private static Set<String> f2169b = new HashSet();

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f2168a = Build.SUPPORTED_ABIS[0];
        } else {
            f2168a = Build.CPU_ABI;
        }
        f2169b.add("armeabi");
        f2169b.add("armeabi-v7a");
        f2169b.add("arm64-v8a");
        f2169b.add("x86");
        f2169b.add("x86_64");
        f2169b.add("mips");
        f2169b.add("mips64");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00aa, code lost:
        if (r4.equals("armeabi") != false) goto L_0x00c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<java.util.zip.ZipEntry> a(java.util.zip.ZipFile r7) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Enumeration r7 = r7.entries()
        L_0x0009:
            boolean r1 = r7.hasMoreElements()
            r2 = 2
            if (r1 == 0) goto L_0x005b
            java.lang.Object r1 = r7.nextElement()
            java.util.zip.ZipEntry r1 = (java.util.zip.ZipEntry) r1
            boolean r3 = r1.isDirectory()
            if (r3 != 0) goto L_0x0009
            java.lang.String r3 = r1.getName()
            java.lang.String r4 = ".so"
            boolean r3 = r3.endsWith(r4)
            if (r3 == 0) goto L_0x0009
            java.lang.String r3 = r1.getName()
            java.lang.String r4 = java.io.File.separator
            java.lang.String[] r3 = r3.split(r4)
            if (r3 == 0) goto L_0x0009
            int r4 = r3.length
            if (r4 < r2) goto L_0x0009
            int r4 = r3.length
            int r4 = r4 - r2
            r2 = r3[r4]
            java.util.Set<java.lang.String> r3 = f2169b
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto L_0x0009
            java.lang.Object r3 = r0.get(r2)
            if (r3 != 0) goto L_0x0051
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r0.put(r2, r3)
        L_0x0051:
            java.lang.Object r2 = r0.get(r2)
            java.util.List r2 = (java.util.List) r2
            r2.add(r1)
            goto L_0x0009
        L_0x005b:
            java.util.LinkedList r7 = new java.util.LinkedList
            r7.<init>()
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0067
            return r7
        L_0x0067:
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.lang.String r4 = f2168a
            r5 = -1
            int r6 = r4.hashCode()
            switch(r6) {
                case -1073971299: goto L_0x00b7;
                case -806050265: goto L_0x00ad;
                case -738963905: goto L_0x00a4;
                case 117110: goto L_0x009a;
                case 3351711: goto L_0x0090;
                case 145444210: goto L_0x0086;
                case 1431565292: goto L_0x007c;
                default: goto L_0x007b;
            }
        L_0x007b:
            goto L_0x00c1
        L_0x007c:
            java.lang.String r2 = "arm64-v8a"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00c1
            r2 = 0
            goto L_0x00c2
        L_0x0086:
            java.lang.String r2 = "armeabi-v7a"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00c1
            r2 = 1
            goto L_0x00c2
        L_0x0090:
            java.lang.String r2 = "mips"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00c1
            r2 = 6
            goto L_0x00c2
        L_0x009a:
            java.lang.String r2 = "x86"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00c1
            r2 = 4
            goto L_0x00c2
        L_0x00a4:
            java.lang.String r6 = "armeabi"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x00c1
            goto L_0x00c2
        L_0x00ad:
            java.lang.String r2 = "x86_64"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00c1
            r2 = 3
            goto L_0x00c2
        L_0x00b7:
            java.lang.String r2 = "mips64"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00c1
            r2 = 5
            goto L_0x00c2
        L_0x00c1:
            r2 = -1
        L_0x00c2:
            switch(r2) {
                case 0: goto L_0x0118;
                case 1: goto L_0x010d;
                case 2: goto L_0x0107;
                case 3: goto L_0x00e7;
                case 4: goto L_0x00d1;
                case 5: goto L_0x00c6;
                case 6: goto L_0x00cb;
                default: goto L_0x00c5;
            }
        L_0x00c5:
            goto L_0x0127
        L_0x00c6:
            java.lang.String r2 = "mips64"
            a(r0, r2, r1, r3)
        L_0x00cb:
            java.lang.String r2 = "mips"
            a(r0, r2, r1, r3)
            goto L_0x0127
        L_0x00d1:
            java.lang.String r2 = "x86"
            a(r0, r2, r1, r3)
            int r2 = r1.size()
            if (r2 != 0) goto L_0x0127
            java.lang.String r2 = "armeabi-v7a"
            a(r0, r2, r1, r3)
            java.lang.String r2 = "armeabi"
            a(r0, r2, r1, r3)
            goto L_0x0127
        L_0x00e7:
            java.lang.String r2 = "x86_64"
            a(r0, r2, r1, r3)
            java.lang.String r2 = "x86"
            a(r0, r2, r1, r3)
            int r2 = r1.size()
            if (r2 != 0) goto L_0x0127
            java.lang.String r2 = "arm64-v8a"
            a(r0, r2, r1, r3)
            java.lang.String r2 = "armeabi-v7a"
            a(r0, r2, r1, r3)
            java.lang.String r2 = "armeabi"
            a(r0, r2, r1, r3)
            goto L_0x0127
        L_0x0107:
            java.lang.String r2 = "armeabi"
            a(r0, r2, r1, r3)
            goto L_0x0127
        L_0x010d:
            java.lang.String r2 = "armeabi-v7a"
            a(r0, r2, r1, r3)
            java.lang.String r2 = "armeabi"
            a(r0, r2, r1, r3)
            goto L_0x0127
        L_0x0118:
            java.lang.String r2 = "arm64-v8a"
            a(r0, r2, r1, r3)
            java.lang.String r2 = "armeabi-v7a"
            a(r0, r2, r1, r3)
            java.lang.String r2 = "armeabi"
            a(r0, r2, r1, r3)
        L_0x0127:
            r7.addAll(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.b.d.a(java.util.zip.ZipFile):java.util.List");
    }

    public static void a(File file, File file2) throws IOException {
        ZipFile zipFile = new ZipFile(file);
        List<ZipEntry> a2 = a(zipFile);
        if (a2.size() != 0) {
            if (!file2.exists()) {
                file2.mkdirs();
            }
            g.c("NativeLibCopyHelper copy start");
            for (ZipEntry a3 : a2) {
                a(zipFile, a3, file2);
            }
            zipFile.close();
        }
    }

    private static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = bufferedInputStream.read(bArr, 0, 8192);
            if (-1 != read) {
                bufferedOutputStream.write(bArr, 0, read);
            } else {
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                bufferedInputStream.close();
                return;
            }
        }
    }

    private static void a(ZipFile zipFile, ZipEntry zipEntry, File file) throws IOException {
        File file2 = new File(file, zipEntry.getName().substring(zipEntry.getName().lastIndexOf(File.separator) + 1));
        int i = 0;
        boolean z = false;
        do {
            if (file2.exists()) {
                file2.delete();
            }
            try {
                a(zipFile.getInputStream(zipEntry), (OutputStream) new FileOutputStream(file2));
                z = true;
                continue;
            } catch (IOException e2) {
                if (i < 3) {
                    i++;
                    continue;
                } else {
                    throw e2;
                }
            }
        } while (!z);
    }

    private static void a(Map<String, List<ZipEntry>> map, String str, List<ZipEntry> list, Set<String> set) {
        List<ZipEntry> list2 = map.get(str);
        if (list2 != null && list2.size() != 0) {
            for (ZipEntry zipEntry : list2) {
                String substring = zipEntry.getName().substring(zipEntry.getName().lastIndexOf(File.separator) + 1);
                if (!set.contains(substring)) {
                    list.add(zipEntry);
                    set.add(substring);
                }
            }
        }
    }
}
