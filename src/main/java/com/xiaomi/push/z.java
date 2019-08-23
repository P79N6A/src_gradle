package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class z {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f82613a = {"jpg", "png", "bmp", "gif", "webp"};

    public static String a(File file) {
        IOException e2;
        InputStreamReader inputStreamReader;
        StringWriter stringWriter = new StringWriter();
        InputStreamReader inputStreamReader2 = null;
        try {
            inputStreamReader = new InputStreamReader(new BufferedInputStream(new FileInputStream(file)));
            try {
                char[] cArr = new char[2048];
                while (true) {
                    int read = inputStreamReader.read(cArr);
                    if (read != -1) {
                        stringWriter.write(cArr, 0, read);
                    } else {
                        String stringWriter2 = stringWriter.toString();
                        a((Closeable) inputStreamReader);
                        a((Closeable) stringWriter);
                        return stringWriter2;
                    }
                }
            } catch (IOException e3) {
                e2 = e3;
                try {
                    b.c("read file :" + file.getAbsolutePath() + " failure :" + e2.getMessage());
                    a((Closeable) inputStreamReader);
                    a((Closeable) stringWriter);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    inputStreamReader2 = inputStreamReader;
                    a((Closeable) inputStreamReader2);
                    a((Closeable) stringWriter);
                    throw th;
                }
            }
        } catch (IOException e4) {
            e2 = e4;
            inputStreamReader = null;
            b.c("read file :" + file.getAbsolutePath() + " failure :" + e2.getMessage());
            a((Closeable) inputStreamReader);
            a((Closeable) stringWriter);
            return null;
        } catch (Throwable th2) {
            th = th2;
            a((Closeable) inputStreamReader2);
            a((Closeable) stringWriter);
            throw th;
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m666a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            for (File a2 : listFiles) {
                a(a2);
            }
            file.delete();
        } else if (file.exists()) {
            file.delete();
        }
    }

    public static void a(File file, File file2) {
        ZipOutputStream zipOutputStream;
        Throwable th;
        IOException e2;
        ZipOutputStream zipOutputStream2 = null;
        try {
            zipOutputStream = new ZipOutputStream(new FileOutputStream(file, false));
            try {
                a(zipOutputStream, file2, null, null);
                a((Closeable) zipOutputStream);
            } catch (FileNotFoundException unused) {
                a((Closeable) zipOutputStream);
            } catch (IOException e3) {
                e2 = e3;
                zipOutputStream2 = zipOutputStream;
                try {
                    b.a("zip file failure + " + e2.getMessage());
                    a((Closeable) zipOutputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    zipOutputStream = zipOutputStream2;
                    a((Closeable) zipOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                a((Closeable) zipOutputStream);
                throw th;
            }
        } catch (FileNotFoundException unused2) {
            zipOutputStream = null;
            a((Closeable) zipOutputStream);
        } catch (IOException e4) {
            e2 = e4;
            b.a("zip file failure + " + e2.getMessage());
            a((Closeable) zipOutputStream2);
        }
    }

    public static void a(File file, String str) {
        if (!file.exists()) {
            b.c("mkdir " + file.getAbsolutePath());
            file.getParentFile().mkdirs();
        }
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            try {
                bufferedWriter2.write(str);
                a((Closeable) bufferedWriter2);
            } catch (IOException e2) {
                e = e2;
                bufferedWriter = bufferedWriter2;
                try {
                    b.c("write file :" + file.getAbsolutePath() + " failure :" + e.getMessage());
                    a((Closeable) bufferedWriter);
                } catch (Throwable th) {
                    th = th;
                    a((Closeable) bufferedWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                a((Closeable) bufferedWriter);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            b.c("write file :" + file.getAbsolutePath() + " failure :" + e.getMessage());
            a((Closeable) bufferedWriter);
        }
    }

    public static void a(ZipOutputStream zipOutputStream, File file, String str, FileFilter fileFilter) {
        FileInputStream fileInputStream;
        ZipEntry zipEntry;
        String str2;
        if (str == null) {
            str = "";
        }
        FileInputStream fileInputStream2 = null;
        try {
            if (file.isDirectory()) {
                File[] listFiles = fileFilter != null ? file.listFiles(fileFilter) : file.listFiles();
                zipOutputStream.putNextEntry(new ZipEntry(str + File.separator));
                if (TextUtils.isEmpty(str)) {
                    str2 = "";
                } else {
                    str2 = str + File.separator;
                }
                for (File a2 : listFiles) {
                    a(zipOutputStream, a2, str2 + listFiles[r3].getName(), null);
                }
                File[] listFiles2 = file.listFiles(new aa());
                if (listFiles2 != null) {
                    for (File a3 : listFiles2) {
                        a(zipOutputStream, a3, str2 + File.separator + listFiles2[r2].getName(), fileFilter);
                    }
                }
                fileInputStream = null;
            } else {
                if (!TextUtils.isEmpty(str)) {
                    zipEntry = new ZipEntry(str);
                } else {
                    new Date();
                    zipEntry = new ZipEntry(String.valueOf(r9.getTime()) + ".txt");
                }
                zipOutputStream.putNextEntry(zipEntry);
                fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        zipOutputStream.write(bArr, 0, read);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileInputStream2 = fileInputStream;
                    try {
                        b.d("zipFiction failed with exception:" + e.toString());
                        a((Closeable) fileInputStream2);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        a((Closeable) fileInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    a((Closeable) fileInputStream);
                    throw th;
                }
            }
            a((Closeable) fileInputStream);
        } catch (IOException e3) {
            e = e3;
            b.d("zipFiction failed with exception:" + e.toString());
            a((Closeable) fileInputStream2);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m667a(File file) {
        try {
            if (file.isDirectory()) {
                return false;
            }
            if (file.exists()) {
                return true;
            }
            File parentFile = file.getParentFile();
            if (parentFile.exists() || parentFile.mkdirs()) {
                return file.createNewFile();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static byte[] a(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.finish();
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception unused) {
            return bArr;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.io.File r3, java.io.File r4) {
        /*
            java.lang.String r0 = r3.getAbsolutePath()
            java.lang.String r1 = r4.getAbsolutePath()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x000f
            return
        L_0x000f:
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0036 }
            r1.<init>(r3)     // Catch:{ all -> 0x0036 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0033 }
            r3.<init>(r4)     // Catch:{ all -> 0x0033 }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x0030 }
        L_0x001e:
            int r0 = r1.read(r4)     // Catch:{ all -> 0x0030 }
            if (r0 < 0) goto L_0x0029
            r2 = 0
            r3.write(r4, r2, r0)     // Catch:{ all -> 0x0030 }
            goto L_0x001e
        L_0x0029:
            r1.close()
            r3.close()
            return
        L_0x0030:
            r4 = move-exception
            r0 = r3
            goto L_0x0039
        L_0x0033:
            r3 = move-exception
            r4 = r3
            goto L_0x0039
        L_0x0036:
            r3 = move-exception
            r4 = r3
            r1 = r0
        L_0x0039:
            if (r1 == 0) goto L_0x003e
            r1.close()
        L_0x003e:
            if (r0 == 0) goto L_0x0043
            r0.close()
        L_0x0043:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.z.b(java.io.File, java.io.File):void");
    }
}
