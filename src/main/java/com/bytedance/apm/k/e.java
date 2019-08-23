package com.bytedance.apm.k;

import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.apm.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f19036a = "e";

    /* renamed from: b  reason: collision with root package name */
    private static File f19037b;

    public static boolean a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return false;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                boolean a2 = a((InputStream) fileInputStream2, str2, str3);
                g.a(fileInputStream2);
                return a2;
            } catch (Exception e2) {
                e = e2;
                fileInputStream = fileInputStream2;
                d.a().a(e, "FileUtils: copyFile");
                g.a(fileInputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                g.a(fileInputStream);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            d.a().a(e, "FileUtils: copyFile");
            g.a(fileInputStream);
            return false;
        } catch (Throwable th2) {
            th = th2;
            g.a(fileInputStream);
            throw th;
        }
    }

    public static File a() {
        if (f19037b == null) {
            f19037b = Environment.getExternalStorageDirectory();
        }
        return f19037b;
    }

    public static void a(String str) {
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    a(listFiles[i].getAbsolutePath());
                } else {
                    listFiles[i].delete();
                }
            }
            file.delete();
        }
    }

    public static String a(double d2) {
        double d3 = d2 / 1024.0d;
        if (d3 < 1.0d) {
            return d2 + "Byte(s)";
        }
        double d4 = d3 / 1024.0d;
        if (d4 < 1.0d) {
            new BigDecimal(Double.toString(d3));
            return r9.setScale(2, 4).toPlainString() + "KB";
        }
        double d5 = d4 / 1024.0d;
        if (d5 < 1.0d) {
            new BigDecimal(Double.toString(d4));
            return r0.setScale(2, 4).toPlainString() + "MB";
        }
        double d6 = d5 / 1024.0d;
        if (d6 < 1.0d) {
            new BigDecimal(Double.toString(d5));
            return r9.setScale(2, 4).toPlainString() + "GB";
        }
        new BigDecimal(d6);
        return r0.setScale(2, 4).toPlainString() + "TB";
    }

    public static void a(String str, String str2) throws Exception {
        File file = new File(str);
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(str2));
            try {
                a(zipOutputStream2, file, "");
                g.a(zipOutputStream2);
            } catch (Throwable th) {
                th = th;
                zipOutputStream = zipOutputStream2;
                g.a(zipOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            g.a(zipOutputStream);
            throw th;
        }
    }

    public static void a(List<String> list, String str) throws Exception {
        ZipOutputStream zipOutputStream;
        try {
            zipOutputStream = new ZipOutputStream(new FileOutputStream(str));
            try {
                for (String file : list) {
                    File file2 = new File(file);
                    a(zipOutputStream, file2, file2.getName());
                }
                g.a(zipOutputStream);
            } catch (Throwable th) {
                th = th;
                g.a(zipOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zipOutputStream = null;
            g.a(zipOutputStream);
            throw th;
        }
    }

    private static void a(ZipOutputStream zipOutputStream, File file, String str) throws Exception {
        String str2;
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            zipOutputStream.putNextEntry(new ZipEntry(str + "/"));
            if (str.length() == 0) {
                str2 = "";
            } else {
                str2 = str + "/";
            }
            for (File a2 : listFiles) {
                a(zipOutputStream, a2, str2 + listFiles[r0].getName());
            }
            return;
        }
        zipOutputStream.putNextEntry(new ZipEntry(str));
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            int read = fileInputStream.read();
            if (read != -1) {
                zipOutputStream.write(read);
            } else {
                return;
            }
        }
    }

    private static boolean a(InputStream inputStream, String str, String str2) {
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File(str);
            if (file.exists() || file.mkdirs()) {
                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(file, str2));
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream2.write(bArr, 0, read);
                        } else {
                            fileOutputStream2.flush();
                            fileOutputStream2.close();
                            inputStream.close();
                            g.a(null);
                            g.a(inputStream);
                            return true;
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    d.a().a(e, "FileUtils: saveInputStream");
                    g.a(fileOutputStream);
                    g.a(inputStream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    g.a(fileOutputStream);
                    g.a(inputStream);
                    throw th;
                }
            } else {
                g.a(null);
                g.a(inputStream);
                return false;
            }
        } catch (Exception e3) {
            e = e3;
            d.a().a(e, "FileUtils: saveInputStream");
            g.a(fileOutputStream);
            g.a(inputStream);
            return false;
        } catch (Throwable th2) {
            th = th2;
            g.a(fileOutputStream);
            g.a(inputStream);
            throw th;
        }
    }
}
