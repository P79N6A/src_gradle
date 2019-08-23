package com.ss.android.common.applog;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import com.bytedance.common.util.HoneyCombV11Compat;
import com.bytedance.common.util.JellyBeanV16Compat;
import com.bytedance.common.utility.Logger;
import com.google.a.a.a.a.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.util.ToolUtils;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28149a;

    /* renamed from: b  reason: collision with root package name */
    private static Set<String> f28150b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private static Set<String> f28151c = new HashSet();

    private static boolean a(String str, Throwable th) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, th}, null, f28149a, true, 15479, new Class[]{String.class, Throwable.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2, th}, null, f28149a, true, 15479, new Class[]{String.class, Throwable.class}, Boolean.TYPE)).booleanValue();
        } else if (str2 == null || !str2.endsWith(":ad")) {
            return false;
        } else {
            Throwable th2 = th;
            int i = 0;
            while (th2 != null) {
                if (th2 instanceof NullPointerException) {
                    return true;
                }
                if (i > 20) {
                    return false;
                }
                i++;
                try {
                    th2 = th2.getCause();
                } catch (Throwable unused) {
                }
            }
            return false;
        }
    }

    private static boolean a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, null, f28149a, true, 15480, new Class[]{Throwable.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{th}, null, f28149a, true, 15480, new Class[]{Throwable.class}, Boolean.TYPE)).booleanValue();
        } else if (th == null) {
            return false;
        } else {
            int i = 0;
            Throwable th2 = th;
            while (th2 != null) {
                if (th2 instanceof OutOfMemoryError) {
                    return true;
                }
                if (i > 20) {
                    return false;
                }
                i++;
                try {
                    th2 = th2.getCause();
                } catch (Throwable unused) {
                }
            }
            return false;
        }
    }

    static {
        f28150b.add("ThreadPlus");
        f28150b.add("ApiDispatcher");
        f28150b.add("ApiLocalDispatcher");
        f28150b.add("AsyncLoader");
        f28150b.add("AsyncTask");
        f28150b.add("Binder");
        f28150b.add("PackageProcessor");
        f28150b.add("SettingsObserver");
        f28150b.add("WifiManager");
        f28150b.add("JavaBridge");
        f28150b.add("Compiler");
        f28150b.add("Signal Catcher");
        f28150b.add("GC");
        f28150b.add("ReferenceQueueDaemon");
        f28150b.add("FinalizerDaemon");
        f28150b.add("FinalizerWatchdogDaemon");
        f28150b.add("CookieSyncManager");
        f28150b.add("RefQueueWorker");
        f28150b.add("CleanupReference");
        f28150b.add("VideoManager");
        f28150b.add("DBHelper-AsyncOp");
        f28150b.add("InstalledAppTracker2");
        f28150b.add("AppData-AsyncOp");
        f28150b.add("IdleConnectionMonitor");
        f28150b.add("LogReaper");
        f28150b.add("ActionReaper");
        f28150b.add("Okio Watchdog");
        f28150b.add("CheckWaitingQueue");
        f28151c.add("com.facebook.imagepipeline.core.PriorityThreadFactory");
        f28151c.add("com.ss.android.common.util.SimpleThreadFactory");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0091 A[Catch:{ Throwable -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0047 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a() {
        /*
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f28149a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r2 = 0
            r4 = 1
            r5 = 15481(0x3c79, float:2.1694E-41)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = f28149a
            r5 = 1
            r6 = 15481(0x3c79, float:2.1694E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0026:
            java.util.Map r1 = java.lang.Thread.getAllStackTraces()     // Catch:{ Throwable -> 0x0123 }
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0123 }
            r2.<init>()     // Catch:{ Throwable -> 0x0123 }
            if (r1 == 0) goto L_0x003a
            java.lang.String r3 = "tr_all_count"
            int r4 = r1.size()     // Catch:{ Throwable -> 0x0123 }
            r2.put(r3, r4)     // Catch:{ Throwable -> 0x0123 }
        L_0x003a:
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Throwable -> 0x0123 }
            r3.<init>()     // Catch:{ Throwable -> 0x0123 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ Throwable -> 0x0123 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Throwable -> 0x0123 }
        L_0x0047:
            boolean r4 = r1.hasNext()     // Catch:{ Throwable -> 0x0123 }
            if (r4 == 0) goto L_0x011b
            java.lang.Object r4 = r1.next()     // Catch:{ Throwable -> 0x0123 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ Throwable -> 0x0123 }
            if (r4 == 0) goto L_0x0114
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0123 }
            r5.<init>()     // Catch:{ Throwable -> 0x0123 }
            java.lang.Object r6 = r4.getKey()     // Catch:{ Throwable -> 0x0123 }
            java.lang.Thread r6 = (java.lang.Thread) r6     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r7 = r6.getName()     // Catch:{ Throwable -> 0x0123 }
            java.util.Set<java.lang.String> r8 = f28150b     // Catch:{ Throwable -> 0x0123 }
            boolean r8 = r8.contains(r7)     // Catch:{ Throwable -> 0x0123 }
            r9 = 1
            if (r8 == 0) goto L_0x006f
        L_0x006d:
            r7 = 1
            goto L_0x008f
        L_0x006f:
            java.util.Set<java.lang.String> r8 = f28150b     // Catch:{ Throwable -> 0x0123 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Throwable -> 0x0123 }
        L_0x0075:
            boolean r10 = r8.hasNext()     // Catch:{ Throwable -> 0x0123 }
            if (r10 == 0) goto L_0x008e
            java.lang.Object r10 = r8.next()     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Throwable -> 0x0123 }
            boolean r11 = com.bytedance.common.utility.StringUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x0123 }
            if (r11 != 0) goto L_0x0075
            boolean r10 = r7.startsWith(r10)     // Catch:{ Throwable -> 0x0123 }
            if (r10 == 0) goto L_0x0075
            goto L_0x006d
        L_0x008e:
            r7 = 0
        L_0x008f:
            if (r7 != 0) goto L_0x0047
            java.lang.String r8 = "tr_n"
            java.lang.String r6 = r6.getName()     // Catch:{ Throwable -> 0x0123 }
            r5.put(r8, r6)     // Catch:{ Throwable -> 0x0123 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ Throwable -> 0x0123 }
            java.lang.StackTraceElement[] r4 = (java.lang.StackTraceElement[]) r4     // Catch:{ Throwable -> 0x0123 }
            if (r4 == 0) goto L_0x010f
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ Throwable -> 0x0123 }
            r6.<init>()     // Catch:{ Throwable -> 0x0123 }
            int r8 = r4.length     // Catch:{ Throwable -> 0x0123 }
            r10 = r7
            r7 = 0
        L_0x00aa:
            if (r7 >= r8) goto L_0x0107
            r11 = r4[r7]     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r12 = r11.getClassName()     // Catch:{ Throwable -> 0x0123 }
            java.util.Set<java.lang.String> r13 = f28151c     // Catch:{ Throwable -> 0x0123 }
            boolean r13 = r13.contains(r12)     // Catch:{ Throwable -> 0x0123 }
            if (r13 == 0) goto L_0x00bc
            r7 = 1
            goto L_0x0108
        L_0x00bc:
            java.util.Set<java.lang.String> r13 = f28151c     // Catch:{ Throwable -> 0x0123 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ Throwable -> 0x0123 }
        L_0x00c2:
            boolean r14 = r13.hasNext()     // Catch:{ Throwable -> 0x0123 }
            if (r14 == 0) goto L_0x00db
            java.lang.Object r14 = r13.next()     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ Throwable -> 0x0123 }
            boolean r15 = com.bytedance.common.utility.StringUtils.isEmpty(r12)     // Catch:{ Throwable -> 0x0123 }
            if (r15 != 0) goto L_0x00c2
            boolean r14 = r12.startsWith(r14)     // Catch:{ Throwable -> 0x0123 }
            if (r14 == 0) goto L_0x00c2
            r10 = 1
        L_0x00db:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0123 }
            r13.<init>(r12)     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r12 = "."
            r13.append(r12)     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r12 = r11.getMethodName()     // Catch:{ Throwable -> 0x0123 }
            r13.append(r12)     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r12 = "("
            r13.append(r12)     // Catch:{ Throwable -> 0x0123 }
            int r11 = r11.getLineNumber()     // Catch:{ Throwable -> 0x0123 }
            r13.append(r11)     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r11 = ")"
            r13.append(r11)     // Catch:{ Throwable -> 0x0123 }
            java.lang.String r11 = r13.toString()     // Catch:{ Throwable -> 0x0123 }
            r6.put(r11)     // Catch:{ Throwable -> 0x0123 }
            int r7 = r7 + 1
            goto L_0x00aa
        L_0x0107:
            r7 = r10
        L_0x0108:
            if (r7 != 0) goto L_0x0047
            java.lang.String r4 = "tr_st"
            r5.put(r4, r6)     // Catch:{ Throwable -> 0x0123 }
        L_0x010f:
            if (r7 != 0) goto L_0x0047
            r3.put(r5)     // Catch:{ Throwable -> 0x0123 }
        L_0x0114:
            java.lang.String r4 = "tr_stacks"
            r2.put(r4, r3)     // Catch:{ Throwable -> 0x0123 }
            goto L_0x0047
        L_0x011b:
            java.lang.String r0 = r2.toString()     // Catch:{ Throwable -> 0x0123 }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0123 }
            return r0
        L_0x0123:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.f.a():java.lang.String");
    }

    private static String a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f28149a, true, 15477, new Class[]{Context.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{context}, null, f28149a, true, 15477, new Class[]{Context.class}, String.class);
        } else if (context == null) {
            return "";
        } else {
            try {
                return a(context.getFilesDir()).toString();
            } catch (Throwable unused) {
                return "";
            }
        }
    }

    private static JSONArray a(File file) {
        if (PatchProxy.isSupport(new Object[]{file}, null, f28149a, true, 15478, new Class[]{File.class}, JSONArray.class)) {
            return (JSONArray) PatchProxy.accessDispatch(new Object[]{file}, null, f28149a, true, 15478, new Class[]{File.class}, JSONArray.class);
        }
        JSONArray jSONArray = new JSONArray();
        if (file == null || !file.exists()) {
            return jSONArray;
        }
        if (file.isFile()) {
            jSONArray.put(file.getName());
            return jSONArray;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return jSONArray;
        }
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                jSONArray.put(file2.getName());
            } else if (file2.isDirectory()) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(file2.getName(), a(file2));
                    jSONArray.put(jSONObject);
                } catch (JSONException unused) {
                }
            }
        }
        return jSONArray;
    }

    public static void a(Context context, JSONObject jSONObject) {
        Context context2;
        ActivityManager activityManager;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{context, jSONObject2}, null, f28149a, true, 15482, new Class[]{Context.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, jSONObject2}, null, f28149a, true, 15482, new Class[]{Context.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (context != null) {
            try {
                context2 = context.getApplicationContext();
            } catch (Throwable unused) {
                return;
            }
        } else {
            context2 = context;
        }
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("dalvikPrivateDirty", memoryInfo.dalvikPrivateDirty);
        jSONObject3.put("dalvikPss", memoryInfo.dalvikPss);
        jSONObject3.put("dalvikSharedDirty", memoryInfo.dalvikSharedDirty);
        jSONObject3.put("nativePrivateDirty", memoryInfo.nativePrivateDirty);
        jSONObject3.put("nativePss", memoryInfo.nativePss);
        jSONObject3.put("nativeSharedDirty", memoryInfo.nativeSharedDirty);
        jSONObject3.put("otherPrivateDirty", memoryInfo.otherPrivateDirty);
        jSONObject3.put("otherPss", memoryInfo.otherPss);
        jSONObject3.put("otherSharedDirty", memoryInfo.otherSharedDirty);
        jSONObject3.put("totalPrivateClean", i.a(memoryInfo));
        jSONObject3.put("totalPrivateDirty", memoryInfo.getTotalPrivateDirty());
        jSONObject3.put("totalPss", memoryInfo.getTotalPss());
        jSONObject3.put("totalSharedClean", i.b(memoryInfo));
        jSONObject3.put("totalSharedDirty", memoryInfo.getTotalSharedDirty());
        jSONObject3.put("totalSwappablePss", i.c(memoryInfo));
        jSONObject2.put("memory_info", jSONObject3);
        if (context2 != null) {
            JSONObject jSONObject4 = new JSONObject();
            ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
            activityManager = (ActivityManager) context2.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
            activityManager.getMemoryInfo(memoryInfo2);
            jSONObject4.put("availMem", memoryInfo2.availMem);
            jSONObject4.put("lowMemory", memoryInfo2.lowMemory);
            jSONObject4.put("threshold", memoryInfo2.threshold);
            jSONObject4.put("totalMem", JellyBeanV16Compat.getTotalMem(memoryInfo2));
            jSONObject2.put("sys_memory_info", jSONObject4);
        } else {
            activityManager = null;
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("native_heap_size", Debug.getNativeHeapSize());
        jSONObject5.put("native_heap_alloc_size", Debug.getNativeHeapAllocatedSize());
        jSONObject5.put("native_heap_free_size", Debug.getNativeHeapFreeSize());
        Runtime runtime = Runtime.getRuntime();
        jSONObject5.put("max_memory", runtime.maxMemory());
        jSONObject5.put("free_memory", runtime.freeMemory());
        jSONObject5.put("total_memory", runtime.totalMemory());
        if (activityManager != null) {
            jSONObject5.put("memory_class", activityManager.getMemoryClass());
            jSONObject5.put("large_memory_class", HoneyCombV11Compat.getLargeMemoryClass(activityManager));
        }
        jSONObject2.put("app_memory_info", jSONObject5);
    }

    public static JSONObject a(Context context, Thread thread, Throwable th) {
        Context context2;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{context, thread, th2}, null, f28149a, true, 15476, new Class[]{Context.class, Thread.class, Throwable.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{context, thread, th2}, null, f28149a, true, 15476, new Class[]{Context.class, Thread.class, Throwable.class}, JSONObject.class);
        } else if (th2 == null) {
            return null;
        } else {
            JSONObject jSONObject = new JSONObject();
            if (context != null) {
                try {
                    context2 = context.getApplicationContext();
                } catch (Throwable unused) {
                }
            } else {
                context2 = context;
            }
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            a.a(th2, printWriter);
            Throwable cause = th.getCause();
            if (cause != null) {
                a.a(cause, printWriter);
                Throwable cause2 = cause.getCause();
                if (cause2 != null) {
                    a.a(cause2, printWriter);
                }
            }
            String stringWriter2 = stringWriter.toString();
            printWriter.close();
            if (stringWriter2 == null) {
                return jSONObject;
            }
            jSONObject.put("data", stringWriter2);
            jSONObject.put("crash_time", System.currentTimeMillis());
            String str = "";
            if (context2 != null) {
                str = ToolUtils.getCurProcessName(context2);
                jSONObject.put("process_name", str);
                if (!ToolUtils.isMainProcess(context2)) {
                    jSONObject.put("remote_process", 1);
                }
            }
            jSONObject.put("app_count", AppLog.sAppCount);
            if (context2 != null) {
                a(context2, jSONObject);
            }
            if (a(th) || a(str, th2)) {
                if (ToolUtils.isMainProcess(context2)) {
                    String b2 = com.ss.android.common.b.a.b();
                    Logger.debug();
                    jSONObject.put("finished_activities", b2);
                } else if (str != null && str.endsWith(":ad")) {
                    jSONObject.put("data_files", a(context2));
                }
                jSONObject.put("all_thread_stacks", a());
            }
            return jSONObject;
        }
    }
}
