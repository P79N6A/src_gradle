package com.bytedance.android.live.core.utils;

import android.content.Context;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8288a;

    private static boolean b() {
        if (PatchProxy.isSupport(new Object[0], null, f8288a, true, 1055, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f8288a, true, 1055, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f8288a, true, 1054, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f8288a, true, 1054, new Class[0], Boolean.TYPE)).booleanValue();
        }
        String str = null;
        try {
            str = Environment.getExternalStorageState();
        } catch (Exception unused) {
        }
        if ("mounted".equals(str) || "mounted_ro".equals(str)) {
            return true;
        }
        return false;
    }

    public static File a(@NonNull Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f8288a, true, 1020, new Class[]{Context.class}, File.class)) {
            return (File) PatchProxy.accessDispatch(new Object[]{context}, null, f8288a, true, 1020, new Class[]{Context.class}, File.class);
        } else if (!a() || !b()) {
            return null;
        } else {
            File file = new File(Environment.getExternalStorageDirectory().getPath() + "/Android/data/" + context.getPackageName() + "/cache");
            a(file);
            return file;
        }
    }

    public static boolean a(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, null, f8288a, true, 1053, new Class[]{File.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{file}, null, f8288a, true, 1053, new Class[]{File.class}, Boolean.TYPE)).booleanValue();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.exists();
    }

    public static boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f8288a, true, 1071, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f8288a, true, 1071, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (TextUtils.isEmpty(str)) {
            return false;
        } else {
            return new File(str2).exists();
        }
    }

    public static void a(String str, String str2) throws IOException {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f8288a, true, 1074, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f8288a, true, 1074, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str3)));
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (nextEntry.isDirectory()) {
                    new File(str4 + File.separator + name).mkdirs();
                } else {
                    File file = new File(str4 + File.separator + name);
                    if (file.exists()) {
                        file.delete();
                    } else {
                        file.getParentFile().mkdirs();
                    }
                    file.createNewFile();
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int read = zipInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        bufferedOutputStream.write(bArr, 0, read);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                }
            } else {
                zipInputStream.close();
                return;
            }
        }
    }
}
