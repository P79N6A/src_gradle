package com.ss.android.ugc.aweme.utils;

import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.codec.binary.Base64;

public final class bm {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75621a;

    private static byte[] a(File file) throws IOException {
        File file2 = file;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{file2}, null, f75621a, true, 88315, new Class[]{File.class}, byte[].class)) {
            return (byte[]) PatchProxy.accessDispatch(new Object[]{file2}, null, f75621a, true, 88315, new Class[]{File.class}, byte[].class);
        }
        FileInputStream fileInputStream = new FileInputStream(file2);
        byte[] bArr = new byte[((int) file.length())];
        while (i < bArr.length) {
            int read = fileInputStream.read(bArr, i, bArr.length - i);
            if (read < 0) {
                break;
            }
            i += read;
        }
        if (i >= bArr.length) {
            fileInputStream.close();
            return bArr;
        }
        throw new IOException("Could not completely read file " + file.getName());
    }

    public static long a() {
        if (PatchProxy.isSupport(new Object[0], null, f75621a, true, 88312, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], null, f75621a, true, 88312, new Class[0], Long.TYPE)).longValue();
        }
        StatFs statFs = null;
        long j = 0;
        try {
            statFs = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
        } catch (IllegalArgumentException unused) {
        }
        if (statFs != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                j = statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
            } else {
                j = ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
            }
        }
        return (j / 1024) / 1024;
    }

    public static long b() {
        if (PatchProxy.isSupport(new Object[0], null, f75621a, true, 88313, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], null, f75621a, true, 88313, new Class[0], Long.TYPE)).longValue();
        }
        StatFs statFs = null;
        try {
            statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        } catch (IllegalArgumentException unused) {
        }
        long j = 0;
        if (statFs != null) {
            if (Build.VERSION.SDK_INT >= 18) {
                j = statFs.getBlockSizeLong() * statFs.getBlockCountLong();
            } else {
                j = ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
            }
        }
        return (j / 1024) / 1024;
    }

    private static void a(@Nullable Closeable closeable) {
        if (PatchProxy.isSupport(new Object[]{closeable}, null, f75621a, true, 88310, new Class[]{Closeable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{closeable}, null, f75621a, true, 88310, new Class[]{Closeable.class}, Void.TYPE);
        } else if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f75621a, true, 88316, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f75621a, true, 88316, new Class[]{String.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            File file = new File(str2);
            if (file.exists() && file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2.isDirectory()) {
                            c(file2.getPath());
                        } else {
                            file2.delete();
                        }
                    }
                    file.delete();
                }
            }
        }
    }

    public static String b(String str) throws IOException {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f75621a, true, 88314, new Class[]{String.class}, String.class)) {
            return new String(Base64.encodeBase64(a(new File(str2))));
        }
        return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f75621a, true, 88314, new Class[]{String.class}, String.class);
    }

    public static boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f75621a, true, 88309, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f75621a, true, 88309, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            return false;
        } else {
            return new File(str2).exists();
        }
    }

    public static File a(String str, boolean z) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f75621a, true, 88317, new Class[]{String.class, Boolean.TYPE}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, null, f75621a, true, 88317, new Class[]{String.class, Boolean.TYPE}, File.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            File file = new File(str2);
            if (!file.exists()) {
                if (!z) {
                    file.mkdirs();
                } else {
                    try {
                        File parentFile = file.getParentFile();
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                        file.createNewFile();
                    } catch (IOException unused) {
                    }
                }
            }
            return file;
        }
    }

    public static String a(File file, String str) {
        File file2 = file;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{file2, str2}, null, f75621a, true, 88306, new Class[]{File.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{file2, str2}, null, f75621a, true, 88306, new Class[]{File.class, String.class}, String.class);
        }
        try {
            return a((InputStream) new FileInputStream(file2), str2);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076 A[Catch:{ Exception -> 0x008b, all -> 0x0082 }, LOOP:0: B:18:0x006f->B:20:0x0076, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007a A[EDGE_INSN: B:21:0x007a->B:22:? ?: BREAK  , SYNTHETIC, Splitter:B:21:0x007a] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0086 A[SYNTHETIC, Splitter:B:29:0x0086] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008d A[SYNTHETIC, Splitter:B:37:0x008d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.io.InputStream r19, java.lang.String r20) {
        /*
            r0 = r19
            r1 = r20
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r0
            r11 = 1
            r3[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r5 = f75621a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.io.InputStream> r4 = java.io.InputStream.class
            r8[r10] = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r11] = r4
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r4 = 0
            r6 = 1
            r7 = 88307(0x158f3, float:1.23744E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0048
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r0
            r12[r11] = r1
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f75621a
            r15 = 1
            r16 = 88307(0x158f3, float:1.23744E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.io.InputStream> r1 = java.io.InputStream.class
            r0[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r11] = r1
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0048:
            java.io.StringWriter r2 = new java.io.StringWriter
            r2.<init>()
            r3 = 0
            if (r1 == 0) goto L_0x0066
            java.lang.String r4 = ""
            java.lang.String r5 = r20.trim()     // Catch:{ Exception -> 0x008a, all -> 0x0064 }
            boolean r4 = r4.equals(r5)     // Catch:{ Exception -> 0x008a, all -> 0x0064 }
            if (r4 == 0) goto L_0x005d
            goto L_0x0066
        L_0x005d:
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x008a, all -> 0x0064 }
            r4.<init>(r0, r1)     // Catch:{ Exception -> 0x008a, all -> 0x0064 }
            r1 = r4
            goto L_0x006b
        L_0x0064:
            r0 = move-exception
            goto L_0x0084
        L_0x0066:
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x008a, all -> 0x0064 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x008a, all -> 0x0064 }
        L_0x006b:
            r0 = 8192(0x2000, float:1.14794E-41)
            char[] r0 = new char[r0]     // Catch:{ Exception -> 0x008b, all -> 0x0082 }
        L_0x006f:
            r4 = -1
            int r5 = r1.read(r0)     // Catch:{ Exception -> 0x008b, all -> 0x0082 }
            if (r4 == r5) goto L_0x007a
            r2.write(r0, r10, r5)     // Catch:{ Exception -> 0x008b, all -> 0x0082 }
            goto L_0x006f
        L_0x007a:
            r1.close()     // Catch:{ IOException -> 0x007d }
        L_0x007d:
            java.lang.String r0 = r2.toString()
            return r0
        L_0x0082:
            r0 = move-exception
            r3 = r1
        L_0x0084:
            if (r3 == 0) goto L_0x0089
            r3.close()     // Catch:{ IOException -> 0x0089 }
        L_0x0089:
            throw r0
        L_0x008a:
            r1 = r3
        L_0x008b:
            if (r1 == 0) goto L_0x0090
            r1.close()     // Catch:{ IOException -> 0x0090 }
        L_0x0090:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.bm.a(java.io.InputStream, java.lang.String):java.lang.String");
    }

    public static boolean a(@NonNull InputStream inputStream, @NonNull OutputStream outputStream) {
        InputStream inputStream2 = inputStream;
        OutputStream outputStream2 = outputStream;
        if (PatchProxy.isSupport(new Object[]{inputStream2, outputStream2}, null, f75621a, true, 88308, new Class[]{InputStream.class, OutputStream.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{inputStream2, outputStream2}, null, f75621a, true, 88308, new Class[]{InputStream.class, OutputStream.class}, Boolean.TYPE)).booleanValue();
        }
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                int read = inputStream2.read(bArr);
                if (read != -1) {
                    outputStream2.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    return true;
                }
            } catch (Exception unused) {
                return false;
            } finally {
                a((Closeable) inputStream);
                a((Closeable) outputStream);
            }
        }
    }
}
