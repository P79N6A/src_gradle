package com.bytedance.crash.i;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.crash.upload.CrashUploadService;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static String f19467a;

    /* renamed from: b  reason: collision with root package name */
    private static String f19468b;

    /* renamed from: c  reason: collision with root package name */
    private static Class<?> f19469c;

    /* renamed from: d  reason: collision with root package name */
    private static Field f19470d;

    /* renamed from: e  reason: collision with root package name */
    private static Field f19471e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f19472f;

    private static long a(int i) {
        if (i < 0) {
            return 0;
        }
        return ((long) i) * 1024;
    }

    @Nullable
    private static String a() {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/" + Process.myPid() + "/cmdline"), "iso-8859-1"));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int read = bufferedReader.read();
                    if (read > 0) {
                        sb.append((char) read);
                    } else {
                        String sb2 = sb.toString();
                        f.a((Closeable) bufferedReader);
                        return sb2;
                    }
                }
            } catch (Throwable th) {
                BufferedReader bufferedReader3 = bufferedReader;
                th = th;
                bufferedReader2 = bufferedReader3;
                f.a((Closeable) bufferedReader2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            f.a((Closeable) bufferedReader2);
            throw th;
        }
    }

    public static boolean c(Context context) {
        String d2 = d(context);
        if (f19468b == null) {
            try {
                String str = context.getPackageManager().getServiceInfo(new ComponentName(context, CrashUploadService.class), 65536).processName;
                f19468b = str;
                f19468b = str.substring(f19468b.lastIndexOf(":"));
            } catch (Throwable unused) {
                f19468b = ":npth";
            }
        }
        if (d2 == null || !d2.endsWith(f19468b)) {
            return false;
        }
        return true;
    }

    @NonNull
    public static String e(Context context) {
        Class<?> g = g(context);
        if (f19470d == null && g != null) {
            try {
                f19470d = g.getDeclaredField("VERSION_NAME");
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f19470d != null) {
            try {
                return (String) f19470d.get(null);
            } catch (Throwable unused2) {
            }
        }
        return "";
    }

    public static int f(Context context) {
        Class<?> g = g(context);
        if (f19471e == null && g != null) {
            try {
                f19471e = g.getDeclaredField("VERSION_CODE");
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f19471e != null) {
            try {
                return ((Integer) f19471e.get(null)).intValue();
            } catch (Throwable unused2) {
            }
        }
        return -1;
    }

    @Nullable
    private static Class<?> g(Context context) {
        if (f19469c == null && !f19472f) {
            try {
                f19469c = Class.forName(context.getPackageName() + ".BuildConfig");
            } catch (ClassNotFoundException unused) {
            }
            f19472f = true;
        }
        return f19469c;
    }

    public static boolean b(Context context) {
        String d2 = d(context);
        if (d2 != null && d2.contains(":")) {
            return false;
        }
        if (d2 != null && d2.equals(context.getPackageName())) {
            return true;
        }
        if (d2 == null || !d2.equals(context.getApplicationInfo().processName)) {
            return false;
        }
        return true;
    }

    @Nullable
    public static String d(Context context) {
        String str = f19467a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo next : activityManager.getRunningAppProcesses()) {
                    if (next.pid == myPid) {
                        String str2 = next.processName;
                        f19467a = str2;
                        return str2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        String a2 = a();
        f19467a = a2;
        if (a2 == null) {
            return "";
        }
        return f19467a;
    }

    private static void a(@NonNull JSONObject jSONObject) throws JSONException {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("dalvikPrivateDirty", a(memoryInfo.dalvikPrivateDirty));
        jSONObject2.put("dalvikPss", a(memoryInfo.dalvikPss));
        jSONObject2.put("dalvikSharedDirty", a(memoryInfo.dalvikSharedDirty));
        jSONObject2.put("nativePrivateDirty", a(memoryInfo.nativePrivateDirty));
        jSONObject2.put("nativePss", a(memoryInfo.nativePss));
        jSONObject2.put("nativeSharedDirty", a(memoryInfo.nativeSharedDirty));
        jSONObject2.put("otherPrivateDirty", a(memoryInfo.otherPrivateDirty));
        jSONObject2.put("otherPss", a(memoryInfo.otherPss));
        jSONObject2.put("otherSharedDirty", memoryInfo.otherSharedDirty);
        jSONObject2.put("totalPrivateClean", b.a(memoryInfo));
        jSONObject2.put("totalPrivateDirty", memoryInfo.getTotalPrivateDirty());
        jSONObject2.put("totalPss", a(memoryInfo.getTotalPss()));
        jSONObject2.put("totalSharedClean", b.b(memoryInfo));
        jSONObject2.put("totalSharedDirty", a(memoryInfo.getTotalSharedDirty()));
        jSONObject2.put("totalSwappablePss", a(b.c(memoryInfo)));
        jSONObject.put("memory_info", jSONObject2);
    }

    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        String packageName = context.getPackageName();
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (activityManager == null) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 21) {
                List<ActivityManager.RunningTaskInfo> runningTasks = activityManager.getRunningTasks(1);
                if (runningTasks != null && !runningTasks.isEmpty()) {
                    ComponentName componentName = runningTasks.get(0).topActivity;
                    if (componentName == null || !packageName.equals(componentName.getPackageName())) {
                        return false;
                    }
                    return true;
                }
            } else {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                        if (next.importance == 100) {
                            return packageName.equals(next.pkgList[0]);
                        }
                    }
                }
            }
            return false;
        } catch (Throwable unused) {
        }
    }

    public static void a(@NonNull Context context, @NonNull JSONObject jSONObject) {
        try {
            a(jSONObject);
            ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            if (activityManager != null) {
                b(jSONObject, activityManager);
            }
            a(jSONObject, activityManager);
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public static ActivityManager.ProcessErrorStateInfo a(Context context, int i) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
        if (activityManager == null) {
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            SystemClock.sleep(200);
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo next : processesInErrorState) {
                    if (next.condition == 2) {
                        return next;
                    }
                }
                continue;
            }
        }
        return null;
    }

    private static void b(@NonNull JSONObject jSONObject, ActivityManager activityManager) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        jSONObject2.put("availMem", memoryInfo.availMem);
        jSONObject2.put("lowMemory", memoryInfo.lowMemory);
        jSONObject2.put("threshold", memoryInfo.threshold);
        jSONObject2.put("totalMem", g.a(memoryInfo));
        jSONObject.put("sys_memory_info", jSONObject2);
    }

    private static void a(@NonNull JSONObject jSONObject, ActivityManager activityManager) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("native_heap_size", Debug.getNativeHeapSize());
        jSONObject2.put("native_heap_alloc_size", Debug.getNativeHeapAllocatedSize());
        jSONObject2.put("native_heap_free_size", Debug.getNativeHeapFreeSize());
        Runtime runtime = Runtime.getRuntime();
        jSONObject2.put("max_memory", runtime.maxMemory());
        jSONObject2.put("free_memory", runtime.freeMemory());
        jSONObject2.put("total_memory", runtime.totalMemory());
        if (activityManager != null) {
            jSONObject2.put("memory_class", activityManager.getMemoryClass());
            jSONObject2.put("large_memory_class", activityManager.getLargeMemoryClass());
        }
        jSONObject.put("app_memory_info", jSONObject2);
    }
}
