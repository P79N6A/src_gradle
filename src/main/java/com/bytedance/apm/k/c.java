package com.bytedance.apm.k;

import android.app.ActivityManager;
import android.content.Context;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Debug;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import com.bytedance.apm.d;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static long f19035a = -1;

    public static long d() {
        return e() + a(Environment.getRootDirectory());
    }

    public static long c() {
        if (f19035a == -1) {
            try {
                f19035a = Runtime.getRuntime().maxMemory();
            } catch (Exception e2) {
                d.a().a(e2, "CommonMonitorUtil: getRuntimeMexMem");
            }
        }
        return f19035a;
    }

    private static long e() {
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                return a(e.a());
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public static long b() {
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/stat")), PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
            try {
                String readLine = bufferedReader2.readLine();
                bufferedReader2.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]);
                g.a(bufferedReader2);
                return parseLong;
            } catch (Exception e2) {
                BufferedReader bufferedReader3 = bufferedReader2;
                e = e2;
                bufferedReader = bufferedReader3;
                d.a().a(e, "CommonMonitorUtil: getAppCpuActiveTime");
                g.a(bufferedReader);
                return -1;
            } catch (Throwable th) {
                BufferedReader bufferedReader4 = bufferedReader2;
                th = th;
                bufferedReader = bufferedReader4;
                g.a(bufferedReader);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            d.a().a(e, "CommonMonitorUtil: getAppCpuActiveTime");
            g.a(bufferedReader);
            return -1;
        } catch (Throwable th2) {
            th = th2;
            g.a(bufferedReader);
            throw th;
        }
    }

    public static long a() {
        BufferedReader bufferedReader;
        Exception e2;
        Throwable th;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/stat")), PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[2]) + Long.parseLong(split[3]) + Long.parseLong(split[4]) + Long.parseLong(split[6]) + Long.parseLong(split[5]) + Long.parseLong(split[7]) + Long.parseLong(split[8]);
                g.a(bufferedReader);
                return parseLong;
            } catch (Exception e3) {
                e2 = e3;
                d.a().a(e2, "CommonMonitorUtil: getTotalCPUTime");
                g.a(bufferedReader);
                return -1;
            } catch (Throwable th2) {
                th = th2;
                g.a(bufferedReader);
                throw th;
            }
        } catch (Exception e4) {
            Exception exc = e4;
            bufferedReader = null;
            e2 = exc;
            d.a().a(e2, "CommonMonitorUtil: getTotalCPUTime");
            g.a(bufferedReader);
            return -1;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            bufferedReader = null;
            th = th4;
            g.a(bufferedReader);
            throw th;
        }
    }

    public static long a(Context context) {
        if (context == null) {
            return -1;
        }
        return d(context) + e(context);
    }

    private static long e(Context context) {
        if (context == null) {
            return -1;
        }
        return TrafficStats.getUidTxBytes(Process.myUid());
    }

    private static long d(Context context) {
        if (context == null) {
            return -1;
        }
        return TrafficStats.getUidRxBytes(Process.myUid());
    }

    private static long a(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                return statFs.getTotalBytes();
            }
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }

    private static long b(File file) {
        long j;
        File[] listFiles = file.listFiles();
        long j2 = 0;
        if (listFiles == null) {
            return 0;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                j = b(file2);
            } else {
                j = file2.length();
            }
            j2 += j;
        }
        return j2;
    }

    public static long a(int i) {
        BufferedReader bufferedReader = null;
        try {
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + i + "/stat")), PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
            try {
                String readLine = bufferedReader2.readLine();
                bufferedReader2.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]) + Long.parseLong(split[15]) + Long.parseLong(split[16]);
                g.a(bufferedReader2);
                return parseLong;
            } catch (Exception e2) {
                e = e2;
                bufferedReader = bufferedReader2;
                d.a().a(e, "CommonMonitorUtil: getAppCPUTime");
                g.a(bufferedReader);
                return -1;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                g.a(bufferedReader);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            d.a().a(e, "CommonMonitorUtil: getAppCPUTime");
            g.a(bufferedReader);
            return -1;
        } catch (Throwable th2) {
            th = th2;
            g.a(bufferedReader);
            throw th;
        }
    }

    public static long c(Context context) {
        long j;
        if (context == null) {
            return -1;
        }
        try {
            if (TextUtils.isEmpty(context.getPackageName())) {
                return -1;
            }
            File cacheDir = context.getCacheDir();
            long j2 = 0;
            if (cacheDir.exists()) {
                j = b(cacheDir);
            } else {
                j = 0;
            }
            File file = new File(e.a().getAbsolutePath() + "/Android/data/" + r2 + "/cache");
            if (file.exists()) {
                j2 = b(file);
            }
            return j + j2;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static long b(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            String packageName = context.getPackageName();
            if (TextUtils.isEmpty(packageName)) {
                return -1;
            }
            File file = new File(context.getFilesDir().getParent());
            if (!file.exists()) {
                return -1;
            }
            long b2 = b(file);
            File file2 = new File(e.a().getAbsolutePath() + "/Android/data/" + packageName);
            long j = 0;
            if (file2.exists()) {
                j = b(file2);
            }
            return b2 + j;
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static Debug.MemoryInfo a(int i, Context context) {
        if (context == null) {
            return null;
        }
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (activityManager == null) {
                return null;
            }
            return activityManager.getProcessMemoryInfo(new int[]{i})[0];
        } catch (Exception e2) {
            d.a().a(e2, "CommonMonitorUtil: getPidMemoryInfo");
            return null;
        }
    }
}
