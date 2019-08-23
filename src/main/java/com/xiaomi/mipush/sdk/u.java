package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.z;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class u {

    /* renamed from: a  reason: collision with root package name */
    private static volatile u f81808a;

    /* renamed from: a  reason: collision with other field name */
    private static final Object f133a = new Object();

    /* renamed from: a  reason: collision with other field name */
    private Context f134a;

    private u(Context context) {
        this.f134a = context;
    }

    public static u a(Context context) {
        if (f81808a == null) {
            synchronized (u.class) {
                try {
                    if (f81808a == null) {
                        f81808a = new u(context);
                    }
                } catch (Throwable th) {
                    Class<u> cls = u.class;
                    throw th;
                }
            }
        }
        return f81808a;
    }

    private File a(String str) {
        File file = new File(this.f134a.getFilesDir() + "/crash");
        if (!file.exists()) {
            file.mkdirs();
            return null;
        }
        File[] listFiles = file.listFiles();
        for (int i = 0; i < listFiles.length; i++) {
            if (listFiles[i].isFile() && listFiles[i].getName().startsWith(str)) {
                return listFiles[i];
            }
        }
        return null;
    }

    public String a(File file) {
        if (file != null) {
            String[] split = file.getName().split(":");
            if (split.length == 2) {
                return split[0];
            }
        }
        return "";
    }

    public ArrayList<File> a() {
        ArrayList<File> arrayList = new ArrayList<>();
        File file = new File(this.f134a.getFilesDir() + "/crash");
        if (!file.exists()) {
            file.mkdirs();
        } else {
            File[] listFiles = file.listFiles();
            for (int i = 0; i < listFiles.length; i++) {
                String[] split = listFiles[i].getName().split(":");
                if (split.length >= 2 && Integer.parseInt(split[1]) > 0 && listFiles[i].isFile()) {
                    arrayList.add(listFiles[i]);
                }
            }
        }
        return arrayList;
    }

    public void a(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            synchronized (f133a) {
                File a2 = a(str2);
                if (a2 != null) {
                    String[] split = a2.getName().split(":");
                    if (split.length >= 2) {
                        int parseInt = Integer.parseInt(split[1]);
                        a2.renameTo(new File(this.f134a.getFilesDir() + "/crash/" + str2 + ":" + String.valueOf(parseInt + 1)));
                    }
                } else {
                    FileOutputStream fileOutputStream = null;
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(new File(this.f134a.getFilesDir() + "/crash/" + str2 + ":1"));
                        try {
                            fileOutputStream2.write(str.getBytes());
                            fileOutputStream2.flush();
                            z.a((Closeable) fileOutputStream2);
                        } catch (Exception e2) {
                            e = e2;
                            fileOutputStream = fileOutputStream2;
                            try {
                                b.a((Throwable) e);
                                z.a((Closeable) fileOutputStream);
                            } catch (Throwable th) {
                                th = th;
                                z.a((Closeable) fileOutputStream);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            z.a((Closeable) fileOutputStream);
                            throw th;
                        }
                    } catch (Exception e3) {
                        e = e3;
                        b.a((Throwable) e);
                        z.a((Closeable) fileOutputStream);
                    }
                }
            }
        }
    }
}
