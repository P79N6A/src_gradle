package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.q.c;
import com.umeng.commonsdk.framework.a;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

public class i {
    public static String b(Context context) {
        return h(context);
    }

    public static String c(Context context) {
        return c(context, "/.um/.umm.dat");
    }

    public static String d(Context context) {
        return c(context, "/.uxx/.cca.dat");
    }

    public static String e(Context context) {
        return c(context, "/.cc/.adfwe.dat");
    }

    public static String f(Context context) {
        return c(context, "/.a.dat");
    }

    public static String g(Context context) {
        return i(context);
    }

    private static String h(Context context) {
        return a.a(context, "umtt", (String) null);
    }

    private static String i(Context context) {
        SharedPreferences a2 = c.a(context.getApplicationContext(), "umdat", 0);
        if (a2 != null) {
            return a2.getString("u", null);
        }
        return null;
    }

    public static String a(Context context) {
        String b2 = b(context);
        if (b2 == null || b2.equals("")) {
            b2 = g(context);
        }
        if (b2 == null || b2.equals("")) {
            b2 = c(context);
        }
        if (b2 == null || b2.equals("")) {
            b2 = d(context);
        }
        if (b2 == null || b2.equals("")) {
            b2 = e(context);
        }
        if (b2 == null || b2.equals("")) {
            return f(context);
        }
        return b2;
    }

    public static void a(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            String g = g(context);
            if (TextUtils.isEmpty(g) || !str.equals(g)) {
                b(context, str);
            }
        }
    }

    public static void b(Context context, String str) {
        a(context, str, "/.um/.umm.dat");
        a(context, str, "/.uxx/.cca.dat");
        a(context, str, "/.cc/.adfwe.dat");
        a(context, str, "/.a.dat");
        d(context, str);
    }

    private static void d(Context context, String str) {
        SharedPreferences a2 = c.a(context.getApplicationContext(), "umdat", 0);
        if (a2 != null) {
            String string = a2.getString("u", null);
            if (string == null || !string.equals(str)) {
                a2.edit().putString("u", str).commit();
            }
        }
    }

    private static String c(Context context, String str) {
        String str2 = null;
        try {
            if (DeviceConfig.checkPermission(context, "android.permission.READ_EXTERNAL_STORAGE")) {
                String externalStorageState = Environment.getExternalStorageState();
                if (externalStorageState != null && externalStorageState.equalsIgnoreCase("mounted")) {
                    if (!new File(Environment.getExternalStorageDirectory() + str).exists()) {
                        return null;
                    }
                    FileChannel channel = new RandomAccessFile(Environment.getExternalStorageDirectory() + str, "rw").getChannel();
                    FileLock tryLock = channel.tryLock();
                    StringBuilder sb = new StringBuilder();
                    ByteBuffer allocate = ByteBuffer.allocate(1024);
                    allocate.clear();
                    while (channel.read(allocate) != -1) {
                        byte[] bArr = new byte[allocate.position()];
                        for (int i = 0; i < allocate.position(); i++) {
                            bArr[i] = allocate.get(i);
                        }
                        sb.append(new String(bArr));
                        allocate.clear();
                    }
                    if (channel != null) {
                        tryLock.release();
                    }
                    channel.close();
                    str2 = sb.toString();
                }
            }
        } catch (Exception e2) {
            ULog.e("getFileUmtt:" + e2.getMessage());
        }
        return str2;
    }

    private static void a(Context context, String str, String str2) {
        if (DeviceConfig.checkPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
            try {
                String externalStorageState = Environment.getExternalStorageState();
                if (externalStorageState != null && externalStorageState.equalsIgnoreCase("mounted")) {
                    String c2 = c(context, str2);
                    if (c2 == null || !c2.equals(str)) {
                        File file = new File(Environment.getExternalStorageDirectory() + str2);
                        if (file.getParentFile() != null && !file.getParentFile().exists()) {
                            file.getParentFile().mkdir();
                        }
                        RandomAccessFile randomAccessFile = new RandomAccessFile(Environment.getExternalStorageDirectory() + str2, "rw");
                        randomAccessFile.setLength((long) str.getBytes().length);
                        FileChannel channel = randomAccessFile.getChannel();
                        FileLock tryLock = channel.tryLock();
                        ByteBuffer allocate = ByteBuffer.allocate(1024);
                        allocate.clear();
                        allocate.put(str.getBytes());
                        allocate.flip();
                        while (allocate.hasRemaining()) {
                            channel.write(allocate);
                        }
                        channel.force(true);
                        if (tryLock != null) {
                            tryLock.release();
                        }
                        channel.close();
                    }
                }
            } catch (Exception e2) {
                ULog.e("saveFileUmtt:" + e2.getMessage());
            }
        }
    }
}
