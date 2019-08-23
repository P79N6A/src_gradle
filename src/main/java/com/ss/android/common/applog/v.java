package com.ss.android.common.applog;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.io.IOUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.d.a.d;
import com.ss.android.ugc.aweme.framework.core.a;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class v extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28208a;

    /* renamed from: d  reason: collision with root package name */
    public static Context f28209d;

    /* renamed from: e  reason: collision with root package name */
    public static final FilenameFilter f28210e = new FilenameFilter() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f28215a;

        public final boolean accept(File file, String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{file, str2}, this, f28215a, false, 15585, new Class[]{File.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{file, str2}, this, f28215a, false, 15585, new Class[]{File.class, String.class}, Boolean.TYPE)).booleanValue();
            } else if (str2 == null || !str2.startsWith("ss_crash-")) {
                return false;
            } else {
                return true;
            }
        }
    };

    /* renamed from: f  reason: collision with root package name */
    public static Thread.UncaughtExceptionHandler f28211f;
    public static final Thread.UncaughtExceptionHandler g = new Thread.UncaughtExceptionHandler() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f28216a;

        public final void uncaughtException(Thread thread, Throwable th) {
            Thread thread2 = thread;
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{thread2, th2}, this, f28216a, false, 15586, new Class[]{Thread.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{thread2, th2}, this, f28216a, false, 15586, new Class[]{Thread.class, Throwable.class}, Void.TYPE);
                return;
            }
            if (!(th2 == null || v.f28209d == null)) {
                FileOutputStream fileOutputStream = null;
                try {
                    JSONObject a2 = f.a(v.f28209d, thread2, th2);
                    long currentTimeMillis = System.currentTimeMillis();
                    String str = "ss_crash-" + currentTimeMillis + ".log";
                    File file = new File(v.f28209d.getCacheDir().getPath(), "ss_crash_logs");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    FileOutputStream fileOutputStream2 = new FileOutputStream(new File(file, str));
                    try {
                        fileOutputStream2.write(a2.toString().getBytes());
                        fileOutputStream2.close();
                        File[] listFiles = file.listFiles(v.f28210e);
                        if (listFiles != null) {
                            if (listFiles.length > 5) {
                                Arrays.sort(listFiles, Collections.reverseOrder());
                                for (int i = 5; i < listFiles.length; i++) {
                                    listFiles[i].delete();
                                }
                            }
                        }
                    } catch (Exception unused) {
                        fileOutputStream = fileOutputStream2;
                    } catch (Throwable th3) {
                        th = th3;
                        fileOutputStream = fileOutputStream2;
                        IOUtils.close((Closeable) fileOutputStream);
                        throw th;
                    }
                } catch (Exception unused2) {
                } catch (Throwable th4) {
                    th = th4;
                    IOUtils.close((Closeable) fileOutputStream);
                    throw th;
                }
                IOUtils.close((Closeable) fileOutputStream);
            }
            if (!(v.f28211f == null || v.f28211f == v.g)) {
                v.f28211f.uncaughtException(thread2, th2);
            }
            if (!ToolUtils.isMainProcess(v.f28209d)) {
                try {
                    Logger.debug();
                    int myPid = Process.myPid();
                    if (PatchProxy.isSupport(new Object[]{Integer.valueOf(myPid)}, null, w.f28217a, true, 15587, new Class[]{Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{Integer.valueOf(myPid)}, null, w.f28217a, true, 15587, new Class[]{Integer.TYPE}, Void.TYPE);
                    } else {
                        String str2 = a.b().f3304b;
                        if (!TextUtils.isEmpty(str2) && str2.startsWith("gray_")) {
                            if (ToolUtils.isMainProcess(GlobalContext.getContext())) {
                                throw new RuntimeException("Process killed, pid is " + myPid);
                            }
                        }
                        Process.killProcess(myPid);
                    }
                } catch (Throwable unused3) {
                }
            }
        }
    };
    private static final FilenameFilter v = new FilenameFilter() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f28214a;

        public final boolean accept(File file, String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{file, str2}, this, f28214a, false, 15584, new Class[]{File.class, String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{file, str2}, this, f28214a, false, 15584, new Class[]{File.class, String.class}, Boolean.TYPE)).booleanValue();
            } else if (str2 == null || !str2.startsWith("ss_native_crash-")) {
                return false;
            } else {
                return true;
            }
        }
    };

    /* renamed from: b  reason: collision with root package name */
    public int f28212b = 1;

    /* renamed from: c  reason: collision with root package name */
    public volatile JSONObject f28213c = null;
    private final LinkedList<s> h;
    private final Context i;
    private final JSONObject j;
    private final AtomicBoolean k;
    private final List<AppLog.j> l;
    private long m;
    private long n;
    private x o;
    private long p;
    private AtomicLong q = new AtomicLong();
    private volatile long r = 120000;
    private final ConcurrentHashMap<String, String> s;
    private final ConcurrentHashMap<String, String> t;
    private final j u;
    private String w = null;
    private String x = null;

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3)}, this, f28208a, false, 15563, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3)}, this, f28208a, false, 15563, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.q.set(j3);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f28208a, false, 15564, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f28208a, false, 15564, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        try {
            for (String str : AppLog.HEADER_KEYS) {
                this.j.put(str, jSONObject.opt(str));
            }
        } catch (Exception unused) {
        }
    }

    private boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f28208a, false, 15573, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f28208a, false, 15573, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            if (!StringUtils.isEmpty(this.j.optString("device_id", ""))) {
                z = true;
            }
            return z;
        } catch (Throwable unused) {
            return false;
        }
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f28208a, false, 15578, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f28208a, false, 15578, new Class[0], Void.TYPE);
            return;
        }
        h.a(this.i).b();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        if (PatchProxy.isSupport(new Object[0], this, f28208a, false, 15565, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f28208a, false, 15565, new Class[0], Void.TYPE);
            return;
        }
        d.a(this.j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0103, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0123, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0124, code lost:
        r17 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[ExcHandler: Throwable (unused java.lang.Throwable), SYNTHETIC, Splitter:B:4:0x0027] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d() {
        /*
            r19 = this;
            r8 = r19
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f28208a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 15581(0x3cdd, float:2.1834E-41)
            r2 = r19
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0027
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f28208a
            r4 = 0
            r5 = 15581(0x3cdd, float:2.1834E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0027:
            java.io.File r2 = new java.io.File     // Catch:{ Throwable -> 0x0103, all -> 0x012c }
            android.content.Context r3 = r8.i     // Catch:{ Throwable -> 0x0103, all -> 0x012c }
            java.lang.String r3 = com.ss.android.common.util.ToolUtils.getCacheDirPath(r3)     // Catch:{ Throwable -> 0x0103, all -> 0x012c }
            java.lang.String r4 = "ss_native_crash_logs"
            r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x0103, all -> 0x012c }
            java.io.FilenameFilter r3 = v     // Catch:{ Throwable -> 0x0103, all -> 0x012c }
            java.io.File[] r2 = r2.listFiles(r3)     // Catch:{ Throwable -> 0x0103, all -> 0x012c }
            if (r2 == 0) goto L_0x0127
            int r3 = r2.length     // Catch:{ Throwable -> 0x0103, all -> 0x0123 }
            if (r3 > 0) goto L_0x0041
            goto L_0x0127
        L_0x0041:
            java.util.Comparator r3 = java.util.Collections.reverseOrder()     // Catch:{ Throwable -> 0x0103, all -> 0x0123 }
            java.util.Arrays.sort(r2, r3)     // Catch:{ Throwable -> 0x0103, all -> 0x0123 }
            java.lang.String r3 = r8.x     // Catch:{ Throwable -> 0x0103, all -> 0x0123 }
            r4 = r2[r0]     // Catch:{ Throwable -> 0x0103, all -> 0x0123 }
            java.lang.String r4 = r4.getName()     // Catch:{ Throwable -> 0x0103, all -> 0x0123 }
            r8.x = r4     // Catch:{ Throwable -> 0x0103, all -> 0x0123 }
            int r4 = r2.length     // Catch:{ Throwable -> 0x0103, all -> 0x0123 }
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x0056:
            if (r5 >= r4) goto L_0x011f
            r9 = r2[r5]     // Catch:{ Throwable -> 0x0134, all -> 0x011d }
            r10 = 5
            r11 = 1
            if (r5 >= r10) goto L_0x006a
            if (r3 == 0) goto L_0x006b
            java.lang.String r10 = r9.getName()     // Catch:{ Throwable -> 0x0134, all -> 0x011d }
            boolean r10 = r3.equals(r10)     // Catch:{ Throwable -> 0x0134, all -> 0x011d }
            if (r10 == 0) goto L_0x006b
        L_0x006a:
            r7 = 1
        L_0x006b:
            java.lang.StringBuffer r10 = new java.lang.StringBuffer     // Catch:{ Throwable -> 0x0134, all -> 0x011d }
            r10.<init>()     // Catch:{ Throwable -> 0x0134, all -> 0x011d }
            if (r7 != 0) goto L_0x0110
            long r12 = r9.length()     // Catch:{ Throwable -> 0x0134, all -> 0x011d }
            r14 = 16384(0x4000, double:8.0948E-320)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x0110
            java.io.BufferedReader r12 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0110 }
            java.io.FileReader r13 = new java.io.FileReader     // Catch:{ Exception -> 0x0110 }
            r13.<init>(r9)     // Catch:{ Exception -> 0x0110 }
            r12.<init>(r13)     // Catch:{ Exception -> 0x0110 }
            r18 = r2
            r1 = 0
            r6 = 0
            r15 = 0
        L_0x008c:
            java.lang.String r0 = r12.readLine()     // Catch:{ Exception -> 0x010d, Throwable -> 0x010b, all -> 0x0107 }
            if (r0 == 0) goto L_0x00b5
            if (r6 != 0) goto L_0x009a
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ Exception -> 0x010d, Throwable -> 0x010b, all -> 0x0107 }
            r1 = r0
            goto L_0x00b2
        L_0x009a:
            if (r6 != r11) goto L_0x009e
            r15 = r0
            goto L_0x00b2
        L_0x009e:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x010d, Throwable -> 0x010b, all -> 0x0107 }
            r13.<init>()     // Catch:{ Exception -> 0x010d, Throwable -> 0x010b, all -> 0x0107 }
            r13.append(r0)     // Catch:{ Exception -> 0x010d, Throwable -> 0x010b, all -> 0x0107 }
            java.lang.String r0 = "\n"
            r13.append(r0)     // Catch:{ Exception -> 0x010d, Throwable -> 0x010b, all -> 0x0107 }
            java.lang.String r0 = r13.toString()     // Catch:{ Exception -> 0x010d, Throwable -> 0x010b, all -> 0x0107 }
            r10.append(r0)     // Catch:{ Exception -> 0x010d, Throwable -> 0x010b, all -> 0x0107 }
        L_0x00b2:
            int r6 = r6 + 1
            goto L_0x008c
        L_0x00b5:
            r12.close()     // Catch:{ Exception -> 0x010d, Throwable -> 0x010b, all -> 0x0107 }
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x0105 }
            r0.<init>()     // Catch:{ Exception -> 0x0105 }
            java.lang.String r6 = "data"
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x0105 }
            java.lang.String r10 = r10.trim()     // Catch:{ Exception -> 0x0105 }
            r0.put(r6, r10)     // Catch:{ Exception -> 0x0105 }
            java.lang.String r6 = "is_native_crash"
            r0.put(r6, r11)     // Catch:{ Exception -> 0x0105 }
            java.lang.String r6 = "no_process_name"
            boolean r6 = r15.startsWith(r6)     // Catch:{ Exception -> 0x0105 }
            if (r6 != 0) goto L_0x00dc
            java.lang.String r6 = "process_name"
            r0.put(r6, r15)     // Catch:{ Exception -> 0x0105 }
        L_0x00dc:
            r12 = 0
            int r6 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r6 <= 0) goto L_0x00e7
            java.lang.String r6 = "crash_time"
            r0.put(r6, r1)     // Catch:{ Exception -> 0x0105 }
        L_0x00e7:
            if (r15 == 0) goto L_0x00f8
            java.lang.String r1 = ":"
            boolean r1 = r15.contains(r1)     // Catch:{ Exception -> 0x0105 }
            if (r1 == 0) goto L_0x00f8
            java.lang.String r1 = "remote_process"
            r0.put(r1, r11)     // Catch:{ Exception -> 0x0105 }
            r2 = 0
            goto L_0x00fe
        L_0x00f8:
            java.lang.String r1 = "remote_process"
            r2 = 0
            r0.put(r1, r2)     // Catch:{ Exception -> 0x0101 }
        L_0x00fe:
            r8.b((org.json.JSONObject) r0)     // Catch:{ Exception -> 0x0101 }
        L_0x0101:
            r6 = 0
            goto L_0x0113
        L_0x0103:
            r6 = 0
            goto L_0x0134
        L_0x0105:
            r2 = 0
            goto L_0x0101
        L_0x0107:
            r0 = move-exception
            r17 = r12
            goto L_0x0130
        L_0x010b:
            r6 = r12
            goto L_0x0134
        L_0x010d:
            r2 = 0
            r6 = r12
            goto L_0x0113
        L_0x0110:
            r18 = r2
            r2 = 0
        L_0x0113:
            r9.delete()     // Catch:{ Exception -> 0x0116 }
        L_0x0116:
            int r5 = r5 + 1
            r2 = r18
            r0 = 0
            goto L_0x0056
        L_0x011d:
            r0 = move-exception
            goto L_0x012e
        L_0x011f:
            com.bytedance.common.utility.io.IOUtils.close((java.io.Closeable) r6)
            return
        L_0x0123:
            r0 = move-exception
            r17 = 0
            goto L_0x0130
        L_0x0127:
            r6 = 0
            com.bytedance.common.utility.io.IOUtils.close((java.io.Closeable) r6)
            return
        L_0x012c:
            r0 = move-exception
            r6 = 0
        L_0x012e:
            r17 = r6
        L_0x0130:
            com.bytedance.common.utility.io.IOUtils.close((java.io.Closeable) r17)
            throw r0
        L_0x0134:
            com.bytedance.common.utility.io.IOUtils.close((java.io.Closeable) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.v.d():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: int} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [java.util.Collection] */
    /* JADX WARNING: type inference failed for: r9v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c9, code lost:
        r9 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cf, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d4, code lost:
        r5 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00c2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c8 A[ExcHandler: all (th java.lang.Throwable), PHI: r5 
      PHI: (r5v16 java.io.BufferedReader) = (r5v15 java.io.BufferedReader), (r5v17 java.io.BufferedReader), (r5v17 java.io.BufferedReader), (r5v15 java.io.BufferedReader), (r5v15 java.io.BufferedReader) binds: [B:16:0x0085, B:39:0x00c2, B:40:?, B:27:0x00a3, B:28:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:16:0x0085] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00cf A[ExcHandler: all (th java.lang.Throwable), Splitter:B:7:0x0055] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean e() {
        /*
            r17 = this;
            r8 = r17
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f28208a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 15582(0x3cde, float:2.1835E-41)
            r2 = r17
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002e
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f28208a
            r4 = 0
            r5 = 15582(0x3cde, float:2.1835E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r2 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002e:
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f28208a
            r4 = 0
            r5 = 15580(0x3cdc, float:2.1832E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r17
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            r9 = 0
            r10 = 1
            if (r1 == 0) goto L_0x0055
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f28208a
            r4 = 0
            r5 = 15580(0x3cdc, float:2.1832E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00d8
        L_0x0055:
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x00d4, all -> 0x00cf }
            android.content.Context r2 = r8.i     // Catch:{ Exception -> 0x00d4, all -> 0x00cf }
            java.lang.String r2 = com.ss.android.common.util.ToolUtils.getCacheDirPath(r2)     // Catch:{ Exception -> 0x00d4, all -> 0x00cf }
            java.lang.String r3 = "ss_crash_logs"
            r1.<init>(r2, r3)     // Catch:{ Exception -> 0x00d4, all -> 0x00cf }
            java.io.FilenameFilter r2 = f28210e     // Catch:{ Exception -> 0x00d4, all -> 0x00cf }
            java.io.File[] r1 = r1.listFiles(r2)     // Catch:{ Exception -> 0x00d4, all -> 0x00cf }
            if (r1 == 0) goto L_0x00cb
            int r2 = r1.length     // Catch:{ Exception -> 0x00d4, all -> 0x00cf }
            if (r2 > 0) goto L_0x006e
            goto L_0x00cb
        L_0x006e:
            java.util.Comparator r2 = java.util.Collections.reverseOrder()     // Catch:{ Exception -> 0x00d4, all -> 0x00cf }
            java.util.Arrays.sort(r1, r2)     // Catch:{ Exception -> 0x00d4, all -> 0x00cf }
            java.lang.String r2 = r8.w     // Catch:{ Exception -> 0x00d4, all -> 0x00cf }
            r3 = r1[r0]     // Catch:{ Exception -> 0x00d4, all -> 0x00cf }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x00d4, all -> 0x00cf }
            r8.w = r3     // Catch:{ Exception -> 0x00d4, all -> 0x00cf }
            int r3 = r1.length     // Catch:{ Exception -> 0x00d4, all -> 0x00cf }
            r5 = r9
            r4 = 0
            r6 = 0
        L_0x0083:
            if (r4 >= r3) goto L_0x00d5
            r7 = r1[r4]     // Catch:{ Exception -> 0x00d5, all -> 0x00c8 }
            r11 = 5
            if (r4 >= r11) goto L_0x0096
            if (r2 == 0) goto L_0x0097
            java.lang.String r11 = r7.getName()     // Catch:{ Exception -> 0x00d5, all -> 0x00c8 }
            boolean r11 = r2.equals(r11)     // Catch:{ Exception -> 0x00d5, all -> 0x00c8 }
            if (r11 == 0) goto L_0x0097
        L_0x0096:
            r6 = 1
        L_0x0097:
            if (r6 != 0) goto L_0x00c2
            long r11 = r7.length()     // Catch:{ Exception -> 0x00d5, all -> 0x00c8 }
            r13 = 16384(0x4000, double:8.0948E-320)
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x00c2
            java.io.BufferedReader r11 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00c2, all -> 0x00c8 }
            java.io.FileReader r12 = new java.io.FileReader     // Catch:{ Exception -> 0x00c2, all -> 0x00c8 }
            r12.<init>(r7)     // Catch:{ Exception -> 0x00c2, all -> 0x00c8 }
            r11.<init>(r12)     // Catch:{ Exception -> 0x00c2, all -> 0x00c8 }
            java.lang.String r5 = r11.readLine()     // Catch:{ Exception -> 0x00c1, all -> 0x00be }
            r11.close()     // Catch:{ Exception -> 0x00c1, all -> 0x00be }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Exception -> 0x00bc, all -> 0x00cf }
            r11.<init>(r5)     // Catch:{ Exception -> 0x00bc, all -> 0x00cf }
            r8.b((org.json.JSONObject) r11)     // Catch:{ Exception -> 0x00bc, all -> 0x00cf }
        L_0x00bc:
            r5 = r9
            goto L_0x00c2
        L_0x00be:
            r0 = move-exception
            r9 = r11
            goto L_0x00d0
        L_0x00c1:
            r5 = r11
        L_0x00c2:
            r7.delete()     // Catch:{ Exception -> 0x00c5, all -> 0x00c8 }
        L_0x00c5:
            int r4 = r4 + 1
            goto L_0x0083
        L_0x00c8:
            r0 = move-exception
            r9 = r5
            goto L_0x00d0
        L_0x00cb:
            com.bytedance.common.utility.io.IOUtils.close((java.io.Closeable) r9)
            goto L_0x00d8
        L_0x00cf:
            r0 = move-exception
        L_0x00d0:
            com.bytedance.common.utility.io.IOUtils.close((java.io.Closeable) r9)
            throw r0
        L_0x00d4:
            r5 = r9
        L_0x00d5:
            com.bytedance.common.utility.io.IOUtils.close((java.io.Closeable) r5)
        L_0x00d8:
            r17.d()
            android.content.Context r1 = r8.i
            boolean r1 = com.bytedance.common.utility.NetworkUtils.isNetworkAvailable(r1)
            if (r1 != 0) goto L_0x00e4
            return r0
        L_0x00e4:
            long r1 = r8.m
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0104
            long r1 = java.lang.System.currentTimeMillis()
            long r5 = r8.n
            long r1 = r1 - r5
            long r5 = r8.r
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0104
            r8.m = r3
            r17.c()
            long r1 = java.lang.System.currentTimeMillis()
            r8.n = r1
        L_0x0104:
            long r1 = r8.m
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x010b
            return r0
        L_0x010b:
            android.content.Context r1 = r8.i
            com.ss.android.common.applog.h r1 = com.ss.android.common.applog.h.a((android.content.Context) r1)
            long r2 = r8.m
            com.ss.android.common.applog.p r2 = r1.a((long) r2)
            if (r2 != 0) goto L_0x011e
            r1 = -1
            r8.m = r1
            return r0
        L_0x011e:
            long r3 = r8.m
            long r5 = r2.f28193a
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x012b
            long r3 = r2.f28193a
            r8.m = r3
            goto L_0x0132
        L_0x012b:
            long r3 = r8.m
            r5 = 1
            long r3 = r3 + r5
            r8.m = r3
        L_0x0132:
            java.lang.String r3 = r2.f28194b
            if (r3 == 0) goto L_0x01b4
            java.lang.String r3 = r2.f28194b
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0140
            goto L_0x01b4
        L_0x0140:
            int r3 = r2.f28198f     // Catch:{ Throwable -> 0x017b }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 != 0) goto L_0x0151
            java.lang.String r3 = com.ss.android.common.applog.AppLog.APPLOG_URL()     // Catch:{ Throwable -> 0x017b }
            java.lang.String r5 = r2.f28194b     // Catch:{ Throwable -> 0x017b }
            int r3 = r8.a(r3, r5, r10)     // Catch:{ Throwable -> 0x017b }
            goto L_0x0172
        L_0x0151:
            int r3 = r2.f28198f     // Catch:{ Throwable -> 0x017b }
            if (r3 != r10) goto L_0x0160
            java.lang.String r3 = com.ss.android.common.applog.AppLog.CRASH_URL()     // Catch:{ Throwable -> 0x017b }
            java.lang.String r5 = r2.f28194b     // Catch:{ Throwable -> 0x017b }
            int r3 = r8.a(r3, r5, r0)     // Catch:{ Throwable -> 0x017b }
            goto L_0x0172
        L_0x0160:
            int r3 = r2.f28198f     // Catch:{ Throwable -> 0x017b }
            r5 = 2
            if (r3 != r5) goto L_0x0170
            java.lang.String r3 = com.ss.android.common.applog.AppLog.MON_URL()     // Catch:{ Throwable -> 0x017b }
            java.lang.String r5 = r2.f28194b     // Catch:{ Throwable -> 0x017b }
            int r3 = r8.a(r3, r5, r0)     // Catch:{ Throwable -> 0x017b }
            goto L_0x0172
        L_0x0170:
            r3 = 200(0xc8, float:2.8E-43)
        L_0x0172:
            if (r3 != r4) goto L_0x0175
            r0 = 1
        L_0x0175:
            r16 = r3
            r3 = r0
            r0 = r16
            goto L_0x017c
        L_0x017b:
            r3 = 0
        L_0x017c:
            r4 = -1
            if (r0 != r4) goto L_0x0180
            return r10
        L_0x0180:
            int r0 = r2.f28198f
            if (r0 != 0) goto L_0x0192
            java.lang.String r0 = r2.f28194b
            java.util.List r9 = c(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r9)
            com.ss.android.common.applog.AppLog.tryReportLogRequest(r3, r0)
        L_0x0192:
            java.lang.String r0 = r2.f28194b
            long r4 = r2.f28193a
            boolean r1 = r1.a((long) r4, (boolean) r3)
            if (r3 != 0) goto L_0x01b3
            if (r1 == 0) goto L_0x01b3
            int r1 = r2.f28198f
            if (r1 != 0) goto L_0x01b3
            if (r9 == 0) goto L_0x01ac
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r9)
            com.ss.android.common.applog.AppLog.tryReportLogExpired(r1)
        L_0x01ac:
            java.util.List r0 = a((java.lang.String) r0)
            com.ss.android.common.applog.AppLog.tryReportTerminateLost(r0)
        L_0x01b3:
            return r10
        L_0x01b4:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.v.e():boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:61|(6:63|64|(1:66)(4:67|(2:69|(1:72))(1:73)|74|(1:76))|71|74|(0))(1:77)|78|79|(3:90|81|82)(1:83)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:78:0x0108 */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fd A[Catch:{ InterruptedException -> 0x0108 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0110 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x00cc A[EDGE_INSN: B:94:0x00cc->B:56:0x00cc ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r16 = this;
            r8 = r16
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f28208a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 15583(0x3cdf, float:2.1836E-41)
            r2 = r16
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0027
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f28208a
            r4 = 0
            r5 = 15583(0x3cdf, float:2.1836E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r16
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0027:
            r16.c()
            long r1 = java.lang.System.currentTimeMillis()
            r8.n = r1
            long r1 = java.lang.System.currentTimeMillis()
            r8.p = r1
            r9 = 0
            r1 = r9
        L_0x0038:
            r10 = 0
        L_0x0039:
            if (r1 != 0) goto L_0x005d
            java.util.LinkedList<com.ss.android.common.applog.s> r2 = r8.h
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r3 = r8.k     // Catch:{ all -> 0x005a }
            boolean r3 = r3.get()     // Catch:{ all -> 0x005a }
            if (r3 == 0) goto L_0x0048
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            return
        L_0x0048:
            java.util.LinkedList<com.ss.android.common.applog.s> r3 = r8.h     // Catch:{ all -> 0x005a }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x005a }
            if (r3 != 0) goto L_0x0058
            java.util.LinkedList<com.ss.android.common.applog.s> r1 = r8.h     // Catch:{ all -> 0x005a }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x005a }
            com.ss.android.common.applog.s r1 = (com.ss.android.common.applog.s) r1     // Catch:{ all -> 0x005a }
        L_0x0058:
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            goto L_0x005d
        L_0x005a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x005a }
            throw r0
        L_0x005d:
            r11 = r1
            if (r11 == 0) goto L_0x0065
            r8.a((com.ss.android.common.applog.s) r11)
            r1 = r9
            goto L_0x0039
        L_0x0065:
            java.util.concurrent.atomic.AtomicLong r1 = r8.q
            long r1 = r1.get()
            r3 = 10000(0x2710, double:4.9407E-320)
            r12 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x007b
            int r5 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r5 > 0) goto L_0x0079
            r14 = r12
            goto L_0x007c
        L_0x0079:
            r14 = r3
            goto L_0x007c
        L_0x007b:
            r14 = r1
        L_0x007c:
            com.ss.android.common.applog.x r2 = r8.o
            if (r2 == 0) goto L_0x0087
            boolean r1 = r2.i
            if (r1 != 0) goto L_0x0087
            long r3 = r2.f28218a
            goto L_0x0088
        L_0x0087:
            r3 = r12
        L_0x0088:
            long r5 = java.lang.System.currentTimeMillis()
            int r1 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x00b2
            int r1 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r1 > 0) goto L_0x0095
            goto L_0x00b2
        L_0x0095:
            long r3 = r8.p
            long r3 = r5 - r3
            int r1 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x00b3
            android.content.Context r1 = r8.i
            boolean r1 = com.bytedance.common.utility.NetworkUtils.isNetworkAvailable(r1)
            if (r1 == 0) goto L_0x00b2
            r8.p = r5
            r3 = 0
            r4 = 1
            r5 = 0
            r7 = 0
            r1 = r16
            r1.a(r2, r3, r4, r5, r7)
            goto L_0x00b3
        L_0x00b2:
            r14 = r12
        L_0x00b3:
            boolean r1 = r16.e()
            if (r1 == 0) goto L_0x00cc
            boolean r1 = com.ss.android.common.applog.AppLog.getLogRecoverySwitch()
            if (r1 == 0) goto L_0x00c9
            int r10 = r10 + 1
            r1 = 4
            if (r10 <= r1) goto L_0x00c9
            r1 = -1
            r8.m = r1
            goto L_0x00cc
        L_0x00c9:
            r1 = r11
            goto L_0x0039
        L_0x00cc:
            java.util.LinkedList<com.ss.android.common.applog.s> r1 = r8.h
            monitor-enter(r1)
            java.util.LinkedList<com.ss.android.common.applog.s> r2 = r8.h     // Catch:{ all -> 0x0120 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0120 }
            if (r2 == 0) goto L_0x0114
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x0103
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ InterruptedException -> 0x0108 }
            long r4 = r8.p     // Catch:{ InterruptedException -> 0x0108 }
            r6 = 0
            long r2 = r2 - r4
            long r4 = r8.p     // Catch:{ InterruptedException -> 0x0108 }
            int r6 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r6 != 0) goto L_0x00ea
            goto L_0x00f2
        L_0x00ea:
            int r4 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r4 >= 0) goto L_0x00f8
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 >= 0) goto L_0x00f4
        L_0x00f2:
            r2 = r14
            goto L_0x00f9
        L_0x00f4:
            r4 = 0
            long r2 = r14 - r2
            goto L_0x00f9
        L_0x00f8:
            r2 = r12
        L_0x00f9:
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x0108
            java.util.LinkedList<com.ss.android.common.applog.s> r4 = r8.h     // Catch:{ InterruptedException -> 0x0108 }
            r4.wait(r2)     // Catch:{ InterruptedException -> 0x0108 }
            goto L_0x0108
        L_0x0103:
            java.util.LinkedList<com.ss.android.common.applog.s> r2 = r8.h     // Catch:{ InterruptedException -> 0x0108 }
            r2.wait()     // Catch:{ InterruptedException -> 0x0108 }
        L_0x0108:
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.k     // Catch:{ all -> 0x0120 }
            boolean r2 = r2.get()     // Catch:{ all -> 0x0120 }
            if (r2 == 0) goto L_0x0112
            monitor-exit(r1)     // Catch:{ all -> 0x0120 }
            return
        L_0x0112:
            r2 = r11
            goto L_0x011c
        L_0x0114:
            java.util.LinkedList<com.ss.android.common.applog.s> r2 = r8.h     // Catch:{ all -> 0x0120 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x0120 }
            com.ss.android.common.applog.s r2 = (com.ss.android.common.applog.s) r2     // Catch:{ all -> 0x0120 }
        L_0x011c:
            monitor-exit(r1)     // Catch:{ all -> 0x0120 }
            r1 = r2
            goto L_0x0038
        L_0x0120:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0120 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.v.run():void");
    }

    static List<String> a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f28208a, true, 15577, new Class[]{String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str2}, null, f28208a, true, 15577, new Class[]{String.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (str2 != null) {
            try {
                JSONArray optJSONArray = new JSONObject(str2).optJSONArray("terminate");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        String optString = optJSONArray.getJSONObject(i2).optString("session_id", "");
                        if (!TextUtils.isEmpty(optString)) {
                            arrayList.add(optString);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    private String b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f28208a, false, 15574, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f28208a, false, 15574, new Class[]{String.class}, String.class);
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            if (jSONObject.optJSONObject("header") != null) {
                str2 = jSONObject.toString();
            }
        } catch (JSONException unused) {
        }
        return str2;
    }

    private static List<Long> c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f28208a, true, 15576, new Class[]{String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str2}, null, f28208a, true, 15576, new Class[]{String.class}, List.class);
        }
        ArrayList arrayList = new ArrayList();
        if (str2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                JSONArray optJSONArray = jSONObject.optJSONArray("event_v3");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        arrayList.add(Long.valueOf(optJSONArray.getJSONObject(i2).getJSONObject("params").getLong("tea_event_index")));
                    }
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("event");
                if (optJSONArray2 != null) {
                    int length2 = optJSONArray2.length();
                    for (int i3 = 0; i3 < length2; i3++) {
                        arrayList.add(Long.valueOf(optJSONArray2.getJSONObject(i3).getLong("tea_event_index")));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b7, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(org.json.JSONObject r19) {
        /*
            r18 = this;
            r8 = r18
            r0 = r19
            monitor-enter(r18)
            r9 = 1
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x00b8 }
            r10 = 0
            r1[r10] = r0     // Catch:{ all -> 0x00b8 }
            com.meituan.robust.ChangeQuickRedirect r3 = f28208a     // Catch:{ all -> 0x00b8 }
            r4 = 0
            r5 = 15567(0x3ccf, float:2.1814E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x00b8 }
            java.lang.Class<org.json.JSONObject> r2 = org.json.JSONObject.class
            r6[r10] = r2     // Catch:{ all -> 0x00b8 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00b8 }
            r2 = r18
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00b8 }
            if (r1 == 0) goto L_0x0038
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x00b8 }
            r1[r10] = r0     // Catch:{ all -> 0x00b8 }
            com.meituan.robust.ChangeQuickRedirect r3 = f28208a     // Catch:{ all -> 0x00b8 }
            r4 = 0
            r5 = 15567(0x3ccf, float:2.1814E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x00b8 }
            java.lang.Class<org.json.JSONObject> r0 = org.json.JSONObject.class
            r6[r10] = r0     // Catch:{ all -> 0x00b8 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00b8 }
            r2 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00b8 }
            monitor-exit(r18)
            return
        L_0x0038:
            if (r0 == 0) goto L_0x00b6
            int r1 = r19.length()     // Catch:{ all -> 0x00b8 }
            if (r1 != 0) goto L_0x0042
            goto L_0x00b6
        L_0x0042:
            android.content.Context r1 = r8.i     // Catch:{ Exception -> 0x00b4 }
            com.ss.android.common.applog.h r1 = com.ss.android.common.applog.h.a((android.content.Context) r1)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = "magic_tag"
            java.lang.String r3 = "ss_app_log"
            r0.put(r2, r3)     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = "header"
            org.json.JSONObject r3 = r8.j     // Catch:{ Exception -> 0x00b4 }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x00b4 }
            com.ss.android.common.applog.x r2 = r8.o     // Catch:{ Exception -> 0x00b4 }
            if (r2 == 0) goto L_0x006d
            com.ss.android.common.applog.x r2 = r8.o     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r2 = r2.f28219b     // Catch:{ Exception -> 0x00b4 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x00b4 }
            if (r2 != 0) goto L_0x006d
            java.lang.String r2 = "session_id"
            com.ss.android.common.applog.x r3 = r8.o     // Catch:{ Exception -> 0x00b4 }
            java.lang.String r3 = r3.f28219b     // Catch:{ Exception -> 0x00b4 }
            r0.put(r2, r3)     // Catch:{ Exception -> 0x00b4 }
        L_0x006d:
            java.lang.String r0 = r19.toString()     // Catch:{ Exception -> 0x00b4 }
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x00b4 }
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00b4 }
            r11[r10] = r0     // Catch:{ Exception -> 0x00b4 }
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.common.applog.h.f28160a     // Catch:{ Exception -> 0x00b4 }
            r14 = 0
            r15 = 15508(0x3c94, float:2.1731E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x00b4 }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r2[r10] = r3     // Catch:{ Exception -> 0x00b4 }
            java.lang.Class r17 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x00b4 }
            r12 = r1
            r16 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00b4 }
            if (r2 == 0) goto L_0x00ac
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x00b4 }
            r11[r10] = r0     // Catch:{ Exception -> 0x00b4 }
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.common.applog.h.f28160a     // Catch:{ Exception -> 0x00b4 }
            r14 = 0
            r15 = 15508(0x3c94, float:2.1731E-41)
            java.lang.Class[] r0 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x00b4 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r10] = r2     // Catch:{ Exception -> 0x00b4 }
            java.lang.Class r17 = java.lang.Long.TYPE     // Catch:{ Exception -> 0x00b4 }
            r12 = r1
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00b4 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x00b4 }
            r0.longValue()     // Catch:{ Exception -> 0x00b4 }
            goto L_0x00af
        L_0x00ac:
            r1.a((java.lang.String) r0, (int) r9)     // Catch:{ Exception -> 0x00b4 }
        L_0x00af:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Exception -> 0x00b4 }
            monitor-exit(r18)
            return
        L_0x00b4:
            monitor-exit(r18)
            return
        L_0x00b6:
            monitor-exit(r18)
            return
        L_0x00b8:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.v.b(org.json.JSONObject):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:63|(1:65)|66|67) */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x015e, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x015a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void a(com.ss.android.common.applog.s r16) {
        /*
            r15 = this;
            r8 = r15
            r0 = r16
            monitor-enter(r15)
            r9 = 1
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x015f }
            r10 = 0
            r1[r10] = r0     // Catch:{ all -> 0x015f }
            com.meituan.robust.ChangeQuickRedirect r3 = f28208a     // Catch:{ all -> 0x015f }
            r4 = 0
            r5 = 15568(0x3cd0, float:2.1815E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x015f }
            java.lang.Class<com.ss.android.common.applog.s> r2 = com.ss.android.common.applog.s.class
            r6[r10] = r2     // Catch:{ all -> 0x015f }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x015f }
            r2 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x015f }
            if (r1 == 0) goto L_0x0035
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x015f }
            r1[r10] = r0     // Catch:{ all -> 0x015f }
            com.meituan.robust.ChangeQuickRedirect r3 = f28208a     // Catch:{ all -> 0x015f }
            r4 = 0
            r5 = 15568(0x3cd0, float:2.1815E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x015f }
            java.lang.Class<com.ss.android.common.applog.s> r0 = com.ss.android.common.applog.s.class
            r6[r10] = r0     // Catch:{ all -> 0x015f }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x015f }
            r2 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x015f }
            monitor-exit(r15)
            return
        L_0x0035:
            if (r0 != 0) goto L_0x0039
            monitor-exit(r15)
            return
        L_0x0039:
            boolean r1 = r0 instanceof com.ss.android.common.applog.u     // Catch:{ all -> 0x015f }
            if (r1 == 0) goto L_0x0057
            com.ss.android.common.applog.u r0 = (com.ss.android.common.applog.u) r0     // Catch:{ all -> 0x015f }
            com.ss.android.common.applog.x r2 = r0.f28204a     // Catch:{ all -> 0x015f }
            com.ss.android.common.applog.x r3 = r0.f28205b     // Catch:{ all -> 0x015f }
            boolean r4 = r0.f28206c     // Catch:{ all -> 0x015f }
            long r5 = r0.f28207d     // Catch:{ all -> 0x015f }
            r1 = r15
            r1.a(r2, r3, r4, r5)     // Catch:{ all -> 0x015f }
            com.ss.android.common.applog.x r0 = r0.f28205b     // Catch:{ all -> 0x015f }
            r8.o = r0     // Catch:{ all -> 0x015f }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x015f }
            r8.p = r0     // Catch:{ all -> 0x015f }
            monitor-exit(r15)
            return
        L_0x0057:
            boolean r1 = r0 instanceof com.ss.android.common.applog.r     // Catch:{ all -> 0x015f }
            r11 = 0
            if (r1 == 0) goto L_0x00cc
            com.ss.android.common.applog.r r0 = (com.ss.android.common.applog.r) r0     // Catch:{ all -> 0x015f }
            long r13 = r0.f28202a     // Catch:{ all -> 0x015f }
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x015f }
            java.lang.Long r0 = new java.lang.Long     // Catch:{ all -> 0x015f }
            r0.<init>(r13)     // Catch:{ all -> 0x015f }
            r1[r10] = r0     // Catch:{ all -> 0x015f }
            com.meituan.robust.ChangeQuickRedirect r3 = f28208a     // Catch:{ all -> 0x015f }
            r4 = 0
            r5 = 15570(0x3cd2, float:2.1818E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x015f }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x015f }
            r6[r10] = r0     // Catch:{ all -> 0x015f }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x015f }
            r2 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x015f }
            if (r0 == 0) goto L_0x009a
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ all -> 0x015f }
            java.lang.Long r0 = new java.lang.Long     // Catch:{ all -> 0x015f }
            r0.<init>(r13)     // Catch:{ all -> 0x015f }
            r1[r10] = r0     // Catch:{ all -> 0x015f }
            com.meituan.robust.ChangeQuickRedirect r3 = f28208a     // Catch:{ all -> 0x015f }
            r4 = 0
            r5 = 15570(0x3cd2, float:2.1818E-41)
            java.lang.Class[] r6 = new java.lang.Class[r9]     // Catch:{ all -> 0x015f }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x015f }
            r6[r10] = r0     // Catch:{ all -> 0x015f }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x015f }
            r2 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x015f }
            goto L_0x015d
        L_0x009a:
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ca
            android.content.Context r0 = r8.i     // Catch:{ all -> 0x015f }
            com.ss.android.common.applog.h r0 = com.ss.android.common.applog.h.a((android.content.Context) r0)     // Catch:{ all -> 0x015f }
            com.ss.android.common.applog.x r0 = r0.b(r13)     // Catch:{ all -> 0x015f }
            if (r0 == 0) goto L_0x00ca
            r3 = 0
            r4 = 0
            r5 = 0
            r1 = r15
            r2 = r0
            r1.a(r2, r3, r4, r5)     // Catch:{ all -> 0x015f }
            com.ss.android.common.applog.r r1 = new com.ss.android.common.applog.r     // Catch:{ all -> 0x015f }
            r1.<init>()     // Catch:{ all -> 0x015f }
            long r2 = r0.f28218a     // Catch:{ all -> 0x015f }
            r1.f28202a = r2     // Catch:{ all -> 0x015f }
            java.util.LinkedList<com.ss.android.common.applog.s> r2 = r8.h     // Catch:{ all -> 0x015f }
            monitor-enter(r2)     // Catch:{ all -> 0x015f }
            java.util.LinkedList<com.ss.android.common.applog.s> r0 = r8.h     // Catch:{ all -> 0x00c7 }
            r0.add(r1)     // Catch:{ all -> 0x00c7 }
            monitor-exit(r2)     // Catch:{ all -> 0x00c7 }
            goto L_0x015d
        L_0x00c7:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00c7 }
            throw r0     // Catch:{ all -> 0x015f }
        L_0x00ca:
            monitor-exit(r15)
            return
        L_0x00cc:
            boolean r1 = r0 instanceof com.ss.android.common.applog.t     // Catch:{ all -> 0x015f }
            if (r1 == 0) goto L_0x015d
            com.ss.android.common.applog.t r0 = (com.ss.android.common.applog.t) r0     // Catch:{ all -> 0x015f }
            com.ss.android.common.applog.a.d r0 = r0.f28203a     // Catch:{ all -> 0x015f }
            if (r0 == 0) goto L_0x015d
            android.content.Context r1 = r8.i     // Catch:{ all -> 0x015f }
            com.ss.android.common.applog.y r1 = com.ss.android.common.applog.y.a(r1)     // Catch:{ all -> 0x015f }
            org.json.JSONObject r2 = r8.j     // Catch:{ all -> 0x015f }
            android.util.Pair r0 = r1.a(r0, r2)     // Catch:{ all -> 0x015f }
            if (r0 == 0) goto L_0x015d
            java.lang.Object r1 = r0.first     // Catch:{ all -> 0x015f }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x015f }
            long r13 = r1.longValue()     // Catch:{ all -> 0x015f }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x015f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x015f }
            int r1 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r1 <= 0) goto L_0x015d
            r11 = 2
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x015f }
            r1[r10] = r0     // Catch:{ all -> 0x015f }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ all -> 0x015f }
            r2.<init>(r13)     // Catch:{ all -> 0x015f }
            r1[r9] = r2     // Catch:{ all -> 0x015f }
            com.meituan.robust.ChangeQuickRedirect r3 = f28208a     // Catch:{ all -> 0x015f }
            r4 = 0
            r5 = 15569(0x3cd1, float:2.1817E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ all -> 0x015f }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r10] = r2     // Catch:{ all -> 0x015f }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x015f }
            r6[r9] = r2     // Catch:{ all -> 0x015f }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x015f }
            r2 = r15
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x015f }
            if (r1 == 0) goto L_0x013a
            java.lang.Object[] r1 = new java.lang.Object[r11]     // Catch:{ all -> 0x015f }
            r1[r10] = r0     // Catch:{ all -> 0x015f }
            java.lang.Long r0 = new java.lang.Long     // Catch:{ all -> 0x015f }
            r0.<init>(r13)     // Catch:{ all -> 0x015f }
            r1[r9] = r0     // Catch:{ all -> 0x015f }
            com.meituan.robust.ChangeQuickRedirect r3 = f28208a     // Catch:{ all -> 0x015f }
            r4 = 0
            r5 = 15569(0x3cd1, float:2.1817E-41)
            java.lang.Class[] r6 = new java.lang.Class[r11]     // Catch:{ all -> 0x015f }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r10] = r0     // Catch:{ all -> 0x015f }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x015f }
            r6[r9] = r0     // Catch:{ all -> 0x015f }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x015f }
            r2 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x015f }
            monitor-exit(r15)
            return
        L_0x013a:
            android.content.Context r1 = r8.i     // Catch:{ all -> 0x015f }
            com.ss.android.common.applog.h r1 = com.ss.android.common.applog.h.a((android.content.Context) r1)     // Catch:{ all -> 0x015f }
            android.content.Context r2 = r8.i     // Catch:{ all -> 0x015f }
            boolean r2 = com.bytedance.common.utility.NetworkUtils.isNetworkAvailable(r2)     // Catch:{ all -> 0x015f }
            if (r2 == 0) goto L_0x015d
            java.lang.String r2 = com.ss.android.common.applog.AppLog.APPLOG_URL()     // Catch:{ Throwable -> 0x015a }
            int r0 = r15.a(r2, r0, r9)     // Catch:{ Throwable -> 0x015a }
            r2 = -1
            if (r0 != r2) goto L_0x0155
            monitor-exit(r15)
            return
        L_0x0155:
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 != r2) goto L_0x015a
            r10 = 1
        L_0x015a:
            r1.a((long) r13, (boolean) r10)     // Catch:{ all -> 0x015f }
        L_0x015d:
            monitor-exit(r15)
            return
        L_0x015f:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.v.a(com.ss.android.common.applog.s):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:46|(1:51)(1:50)|(4:53|54|55|(1:57))|58|59|(2:61|(4:63|(3:67|(3:69|(2:71|137)(1:138)|72)|136)|73|(2:77|(3:79|(2:81|139)(1:140)|82)))(4:83|(1:85)|86|(1:88)))|89|90|(2:94|(1:96)(2:97|(4:101|(1:103)|104|(1:106))))|(2:108|109)(1:110)) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0128 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x018b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:89:0x0211 */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0290 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0128 A[SYNTHETIC, Splitter:B:40:0x0128] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0191 A[Catch:{ Throwable -> 0x0211 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0238 A[Catch:{ Throwable -> 0x0292 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0251 A[Catch:{ Throwable -> 0x0292 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int a(java.lang.String r22, java.lang.String r23, boolean r24) throws java.lang.Throwable {
        /*
            r21 = this;
            r8 = r21
            r9 = r22
            r0 = r23
            r10 = 3
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r11 = 0
            r1[r11] = r9
            r12 = 1
            r1[r12] = r0
            java.lang.Byte r2 = java.lang.Byte.valueOf(r24)
            r13 = 2
            r1[r13] = r2
            com.meituan.robust.ChangeQuickRedirect r3 = f28208a
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r11] = r2
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r6[r12] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r6[r13] = r2
            java.lang.Class r7 = java.lang.Integer.TYPE
            r4 = 0
            r5 = 15575(0x3cd7, float:2.1825E-41)
            r2 = r21
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0061
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r11] = r9
            r1[r12] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r24)
            r1[r13] = r0
            com.meituan.robust.ChangeQuickRedirect r3 = f28208a
            r4 = 0
            r5 = 15575(0x3cd7, float:2.1825E-41)
            java.lang.Class[] r6 = new java.lang.Class[r10]
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r11] = r0
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r6[r12] = r0
            java.lang.Class r0 = java.lang.Boolean.TYPE
            r6[r13] = r0
            java.lang.Class r7 = java.lang.Integer.TYPE
            r2 = r21
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x0061:
            r1 = 0
            java.lang.String r0 = r8.b((java.lang.String) r0)     // Catch:{ Throwable -> 0x0292 }
            boolean r3 = com.ss.android.common.applog.AppLog.getLogRecoverySwitch()     // Catch:{ Throwable -> 0x0292 }
            if (r3 == 0) goto L_0x00fc
            com.ss.android.common.applog.j r3 = r8.u     // Catch:{ Throwable -> 0x0292 }
            if (r3 == 0) goto L_0x00fc
            com.ss.android.common.applog.j r3 = r8.u     // Catch:{ Throwable -> 0x0292 }
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x0292 }
            r14[r11] = r9     // Catch:{ Throwable -> 0x0292 }
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.common.applog.j.f28170a     // Catch:{ Throwable -> 0x0292 }
            r17 = 0
            r18 = 15532(0x3cac, float:2.1765E-41)
            java.lang.Class[] r4 = new java.lang.Class[r12]     // Catch:{ Throwable -> 0x0292 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r11] = r5     // Catch:{ Throwable -> 0x0292 }
            java.lang.Class r20 = java.lang.Boolean.TYPE     // Catch:{ Throwable -> 0x0292 }
            r15 = r3
            r19 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Throwable -> 0x0292 }
            if (r4 == 0) goto L_0x00ae
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x0292 }
            r14[r11] = r9     // Catch:{ Throwable -> 0x0292 }
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.common.applog.j.f28170a     // Catch:{ Throwable -> 0x0292 }
            r17 = 0
            r18 = 15532(0x3cac, float:2.1765E-41)
            java.lang.Class[] r4 = new java.lang.Class[r12]     // Catch:{ Throwable -> 0x0292 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r11] = r5     // Catch:{ Throwable -> 0x0292 }
            java.lang.Class r20 = java.lang.Boolean.TYPE     // Catch:{ Throwable -> 0x0292 }
            r15 = r3
            r19 = r4
            java.lang.Object r3 = com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Throwable -> 0x0292 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Throwable -> 0x0292 }
            boolean r3 = r3.booleanValue()     // Catch:{ Throwable -> 0x0292 }
            goto L_0x00ed
        L_0x00ae:
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r22)     // Catch:{ Throwable -> 0x0292 }
            if (r4 != 0) goto L_0x00ec
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.common.applog.j$a> r4 = r3.f28171b     // Catch:{ Throwable -> 0x0292 }
            boolean r4 = r4.containsKey(r9)     // Catch:{ Throwable -> 0x0292 }
            if (r4 == 0) goto L_0x00ec
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.common.applog.j$a> r3 = r3.f28171b     // Catch:{ Throwable -> 0x0292 }
            java.lang.Object r3 = r3.get(r9)     // Catch:{ Throwable -> 0x0292 }
            com.ss.android.common.applog.j$a r3 = (com.ss.android.common.applog.j.a) r3     // Catch:{ Throwable -> 0x0292 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0292 }
            long r6 = r3.f28172a     // Catch:{ Throwable -> 0x0292 }
            r10 = 0
            long r4 = r4 - r6
            long r6 = r3.f28173b     // Catch:{ Throwable -> 0x0292 }
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 <= 0) goto L_0x00db
            r3.f28175d = r12     // Catch:{ Throwable -> 0x0292 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0292 }
            r3.f28172a = r4     // Catch:{ Throwable -> 0x0292 }
            goto L_0x00ec
        L_0x00db:
            int r4 = r3.f28175d     // Catch:{ Throwable -> 0x0292 }
            long r4 = (long) r4     // Catch:{ Throwable -> 0x0292 }
            long r6 = r3.f28174c     // Catch:{ Throwable -> 0x0292 }
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x00ea
            int r4 = r3.f28175d     // Catch:{ Throwable -> 0x0292 }
            int r4 = r4 + r12
            r3.f28175d = r4     // Catch:{ Throwable -> 0x0292 }
            goto L_0x00ec
        L_0x00ea:
            r3 = 0
            goto L_0x00ed
        L_0x00ec:
            r3 = 1
        L_0x00ed:
            if (r3 != 0) goto L_0x00fc
            com.ss.android.common.applog.AppLog$h r0 = com.ss.android.common.applog.AppLog.sCustomInfo     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = com.ss.android.common.applog.AppLog.CRASH_URL()     // Catch:{ Throwable -> 0x0292 }
            r9.equalsIgnoreCase(r0)     // Catch:{ Throwable -> 0x0292 }
        L_0x00fa:
            r0 = -1
            return r0
        L_0x00fc:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0292 }
            java.lang.String r15 = com.ss.android.common.applog.NetUtil.addCommonParams(r9, r12)     // Catch:{ Throwable -> 0x0292 }
            java.lang.String r3 = "UTF-8"
            byte[] r16 = r0.getBytes(r3)     // Catch:{ Throwable -> 0x0292 }
            java.lang.Object r0 = r16.clone()     // Catch:{ Throwable -> 0x0292 }
            byte[] r0 = (byte[]) r0     // Catch:{ Throwable -> 0x0292 }
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r15)     // Catch:{ Throwable -> 0x0292 }
            if (r3 != 0) goto L_0x0128
            if (r24 == 0) goto L_0x0128
            android.content.Context r3 = r8.i     // Catch:{ Throwable -> 0x0292 }
            if (r3 == 0) goto L_0x0128
            boolean r3 = com.ss.android.common.applog.AppLog.getLogEncryptSwitch()     // Catch:{ Throwable -> 0x0292 }
            if (r3 == 0) goto L_0x0128
            android.content.Context r3 = r8.i     // Catch:{ RuntimeException -> 0x0128 }
            java.lang.String r0 = com.ss.android.common.applog.NetUtil.sendEncryptLog(r15, r0, r3, r11)     // Catch:{ RuntimeException -> 0x0128 }
            goto L_0x0136
        L_0x0128:
            com.bytedance.common.utility.NetworkClient r14 = com.bytedance.common.utility.NetworkClient.getDefault()     // Catch:{ Throwable -> 0x0292 }
            r17 = 1
            java.lang.String r18 = "application/json; charset=utf-8"
            r19 = 0
            java.lang.String r0 = r14.post(r15, r16, r17, r18, r19)     // Catch:{ Throwable -> 0x0292 }
        L_0x0136:
            if (r0 == 0) goto L_0x0291
            int r3 = r0.length()     // Catch:{ Throwable -> 0x0292 }
            if (r3 != 0) goto L_0x0140
            goto L_0x0291
        L_0x0140:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x0292 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0292 }
            r3.<init>(r0)     // Catch:{ Throwable -> 0x0292 }
            java.lang.String r0 = "ss_app_log"
            java.lang.String r4 = "magic_tag"
            java.lang.String r4 = r3.optString(r4)     // Catch:{ Throwable -> 0x0292 }
            boolean r0 = r0.equals(r4)     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x0166
            java.lang.String r0 = "success"
            java.lang.String r4 = "message"
            java.lang.String r4 = r3.optString(r4)     // Catch:{ Throwable -> 0x0292 }
            boolean r0 = r0.equals(r4)     // Catch:{ Throwable -> 0x0292 }
            if (r0 == 0) goto L_0x0166
            r0 = 1
            goto L_0x0167
        L_0x0166:
            r0 = 0
        L_0x0167:
            if (r0 == 0) goto L_0x018b
            java.lang.String r4 = "server_time"
            long r4 = r3.optLong(r4)     // Catch:{ Exception -> 0x018b }
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x018b
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Exception -> 0x018b }
            r6.<init>()     // Catch:{ Exception -> 0x018b }
            java.lang.String r7 = "server_time"
            r6.put(r7, r4)     // Catch:{ Exception -> 0x018b }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x018b }
            r14 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r14
            java.lang.String r7 = "local_time"
            r6.put(r7, r4)     // Catch:{ Exception -> 0x018b }
            r8.f28213c = r6     // Catch:{ Exception -> 0x018b }
        L_0x018b:
            boolean r4 = com.ss.android.common.applog.AppLog.getLogRecoverySwitch()     // Catch:{ Throwable -> 0x0211 }
            if (r4 == 0) goto L_0x0211
            java.lang.String r4 = "blacklist"
            org.json.JSONObject r4 = r3.optJSONObject(r4)     // Catch:{ Throwable -> 0x0211 }
            if (r4 == 0) goto L_0x01f7
            java.lang.String r4 = "blacklist"
            org.json.JSONObject r4 = r3.optJSONObject(r4)     // Catch:{ Throwable -> 0x0211 }
            java.lang.String r5 = "v1"
            org.json.JSONArray r4 = r4.optJSONArray(r5)     // Catch:{ Throwable -> 0x0211 }
            if (r4 == 0) goto L_0x01c8
            int r5 = r4.length()     // Catch:{ Throwable -> 0x0211 }
            if (r5 <= 0) goto L_0x01c8
            int r5 = r4.length()     // Catch:{ Throwable -> 0x0211 }
            r6 = 0
        L_0x01b2:
            if (r6 >= r5) goto L_0x01c8
            java.lang.String r7 = r4.getString(r6)     // Catch:{ Throwable -> 0x0211 }
            boolean r10 = com.bytedance.common.utility.StringUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x0211 }
            if (r10 != 0) goto L_0x01c5
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r10 = r8.s     // Catch:{ Throwable -> 0x0211 }
            java.lang.String r14 = "black"
            r10.put(r7, r14)     // Catch:{ Throwable -> 0x0211 }
        L_0x01c5:
            int r6 = r6 + 1
            goto L_0x01b2
        L_0x01c8:
            java.lang.String r4 = "blacklist"
            org.json.JSONObject r3 = r3.optJSONObject(r4)     // Catch:{ Throwable -> 0x0211 }
            java.lang.String r4 = "v3"
            org.json.JSONArray r3 = r3.optJSONArray(r4)     // Catch:{ Throwable -> 0x0211 }
            if (r3 == 0) goto L_0x0211
            int r4 = r3.length()     // Catch:{ Throwable -> 0x0211 }
            if (r4 <= 0) goto L_0x0211
            int r4 = r3.length()     // Catch:{ Throwable -> 0x0211 }
            r5 = 0
        L_0x01e1:
            if (r5 >= r4) goto L_0x0211
            java.lang.String r6 = r3.getString(r5)     // Catch:{ Throwable -> 0x0211 }
            boolean r7 = com.bytedance.common.utility.StringUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x0211 }
            if (r7 != 0) goto L_0x01f4
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r7 = r8.t     // Catch:{ Throwable -> 0x0211 }
            java.lang.String r10 = "black"
            r7.put(r6, r10)     // Catch:{ Throwable -> 0x0211 }
        L_0x01f4:
            int r5 = r5 + 1
            goto L_0x01e1
        L_0x01f7:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r3 = r8.s     // Catch:{ Throwable -> 0x0211 }
            boolean r3 = r3.isEmpty()     // Catch:{ Throwable -> 0x0211 }
            if (r3 != 0) goto L_0x0204
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r3 = r8.s     // Catch:{ Throwable -> 0x0211 }
            r3.clear()     // Catch:{ Throwable -> 0x0211 }
        L_0x0204:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r3 = r8.t     // Catch:{ Throwable -> 0x0211 }
            boolean r3 = r3.isEmpty()     // Catch:{ Throwable -> 0x0211 }
            if (r3 != 0) goto L_0x0211
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r3 = r8.t     // Catch:{ Throwable -> 0x0211 }
            r3.clear()     // Catch:{ Throwable -> 0x0211 }
        L_0x0211:
            boolean r3 = com.ss.android.common.applog.AppLog.getLogRecoverySwitch()     // Catch:{ Throwable -> 0x0292 }
            if (r3 == 0) goto L_0x028b
            com.ss.android.common.applog.j r3 = r8.u     // Catch:{ Throwable -> 0x0292 }
            if (r3 == 0) goto L_0x028b
            com.ss.android.common.applog.j r3 = r8.u     // Catch:{ Throwable -> 0x0292 }
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x0292 }
            r14[r11] = r9     // Catch:{ Throwable -> 0x0292 }
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.common.applog.j.f28170a     // Catch:{ Throwable -> 0x0292 }
            r17 = 0
            r18 = 15534(0x3cae, float:2.1768E-41)
            java.lang.Class[] r4 = new java.lang.Class[r12]     // Catch:{ Throwable -> 0x0292 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r11] = r5     // Catch:{ Throwable -> 0x0292 }
            java.lang.Class r20 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0292 }
            r15 = r3
            r19 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Throwable -> 0x0292 }
            if (r4 == 0) goto L_0x0251
            java.lang.Object[] r14 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x0292 }
            r14[r11] = r9     // Catch:{ Throwable -> 0x0292 }
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.common.applog.j.f28170a     // Catch:{ Throwable -> 0x0292 }
            r17 = 0
            r18 = 15534(0x3cae, float:2.1768E-41)
            java.lang.Class[] r4 = new java.lang.Class[r12]     // Catch:{ Throwable -> 0x0292 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r11] = r5     // Catch:{ Throwable -> 0x0292 }
            java.lang.Class r20 = java.lang.Void.TYPE     // Catch:{ Throwable -> 0x0292 }
            r15 = r3
            r19 = r4
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Throwable -> 0x0292 }
            goto L_0x028b
        L_0x0251:
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r22)     // Catch:{ Throwable -> 0x0292 }
            if (r4 != 0) goto L_0x028b
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.common.applog.j$a> r4 = r3.f28171b     // Catch:{ Throwable -> 0x0292 }
            boolean r4 = r4.containsKey(r9)     // Catch:{ Throwable -> 0x0292 }
            if (r4 == 0) goto L_0x028b
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.common.applog.j$a> r3 = r3.f28171b     // Catch:{ Throwable -> 0x0292 }
            java.lang.Object r3 = r3.get(r9)     // Catch:{ Throwable -> 0x0292 }
            com.ss.android.common.applog.j$a r3 = (com.ss.android.common.applog.j.a) r3     // Catch:{ Throwable -> 0x0292 }
            long r4 = r3.f28173b     // Catch:{ Throwable -> 0x0292 }
            r6 = 120000(0x1d4c0, double:5.9288E-319)
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 == 0) goto L_0x0272
            r3.f28173b = r6     // Catch:{ Throwable -> 0x0292 }
        L_0x0272:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0292 }
            long r14 = r3.f28176e     // Catch:{ Throwable -> 0x0292 }
            r10 = 0
            long r4 = r4 - r14
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 <= 0) goto L_0x028b
            long r4 = r3.f28174c     // Catch:{ Throwable -> 0x0292 }
            r6 = 1
            long r4 = r4 + r6
            r3.f28174c = r4     // Catch:{ Throwable -> 0x0292 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0292 }
            r3.f28176e = r4     // Catch:{ Throwable -> 0x0292 }
        L_0x028b:
            if (r0 == 0) goto L_0x0290
            r0 = 200(0xc8, float:2.8E-43)
            return r0
        L_0x0290:
            return r11
        L_0x0291:
            return r11
        L_0x0292:
            r0 = move-exception
            boolean r3 = com.ss.android.common.applog.AppLog.getLogRecoverySwitch()
            if (r3 == 0) goto L_0x031b
            com.ss.android.common.applog.j r3 = r8.u
            if (r3 == 0) goto L_0x031b
            com.ss.android.common.applog.j r3 = r8.u
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r14[r11] = r9
            r14[r12] = r0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.common.applog.j.f28170a
            r17 = 0
            r18 = 15533(0x3cad, float:2.1766E-41)
            java.lang.Class[] r4 = new java.lang.Class[r13]
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r11] = r5
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r4[r12] = r5
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r3
            r19 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r14, r15, r16, r17, r18, r19, r20)
            if (r4 != 0) goto L_0x02fd
            boolean r4 = r0 instanceof com.bytedance.common.utility.CommonHttpException
            if (r4 == 0) goto L_0x031b
            r4 = r0
            com.bytedance.common.utility.CommonHttpException r4 = (com.bytedance.common.utility.CommonHttpException) r4
            int r4 = r4.getResponseCode()
            r5 = 500(0x1f4, float:7.0E-43)
            if (r4 < r5) goto L_0x031b
            r5 = 600(0x258, float:8.41E-43)
            if (r4 >= r5) goto L_0x031b
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.common.applog.j$a> r4 = r3.f28171b
            boolean r4 = r4.containsKey(r9)
            if (r4 == 0) goto L_0x031b
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.ss.android.common.applog.j$a> r3 = r3.f28171b
            java.lang.Object r3 = r3.get(r9)
            com.ss.android.common.applog.j$a r3 = (com.ss.android.common.applog.j.a) r3
            long r4 = r3.f28174c
            r6 = 2
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 > 0) goto L_0x02fa
            long r4 = r3.f28174c
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x02f4
            r3.f28174c = r1
            goto L_0x031b
        L_0x02f4:
            r1 = 900000(0xdbba0, double:4.44659E-318)
            r3.f28173b = r1
            goto L_0x031b
        L_0x02fa:
            r3.f28174c = r6
            goto L_0x031b
        L_0x02fd:
            java.lang.Object[] r14 = new java.lang.Object[r13]
            r14[r11] = r9
            r14[r12] = r0
            com.meituan.robust.ChangeQuickRedirect r16 = com.ss.android.common.applog.j.f28170a
            r17 = 0
            r18 = 15533(0x3cad, float:2.1766E-41)
            java.lang.Class[] r1 = new java.lang.Class[r13]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r11] = r2
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            r1[r12] = r2
            java.lang.Class r20 = java.lang.Void.TYPE
            r15 = r3
            r19 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r14, r15, r16, r17, r18, r19, r20)
        L_0x031b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.common.applog.v.a(java.lang.String, java.lang.String, boolean):int");
    }

    private void a(x xVar, x xVar2, boolean z, long j2) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{xVar, xVar2, Byte.valueOf(z ? (byte) 1 : 0), new Long(j3)}, this, f28208a, false, 15571, new Class[]{x.class, x.class, Boolean.TYPE, Long.TYPE}, Void.TYPE)) {
            Object[] objArr = {xVar, xVar2, Byte.valueOf(z), new Long(j3)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f28208a, false, 15571, new Class[]{x.class, x.class, Boolean.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        a(xVar, xVar2, z, j2, true);
    }

    private void a(x xVar, x xVar2, boolean z, long j2, boolean z2) {
        boolean z3;
        x xVar3 = xVar;
        x xVar4 = xVar2;
        long j3 = j2;
        boolean z4 = false;
        if (PatchProxy.isSupport(new Object[]{xVar3, xVar4, Byte.valueOf(z ? (byte) 1 : 0), new Long(j3), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f28208a, false, 15572, new Class[]{x.class, x.class, Boolean.TYPE, Long.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{xVar3, xVar4, Byte.valueOf(z), new Long(j3), Byte.valueOf(z2)}, this, f28208a, false, 15572, new Class[]{x.class, x.class, Boolean.TYPE, Long.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        h a2 = h.a(this.i);
        try {
            a2.a(this.j, this.f28213c);
        } catch (Throwable unused) {
        }
        if (xVar3 != null || xVar4 != null) {
            if (xVar3 != null) {
                long[] jArr = new long[1];
                if (z) {
                    jArr[0] = j3;
                } else {
                    jArr[0] = 0;
                }
                List<AppLog.j> list = this.l;
                String[] strArr = new String[1];
                JSONObject jSONObject = this.j;
                JSONObject jSONObject2 = jSONObject;
                long j4 = j3;
                x xVar5 = xVar4;
                long a3 = a2.a(xVar, xVar2, jSONObject2, z, jArr, strArr, list, z2, this.f28213c);
                if (a3 > 0) {
                    String str = strArr[0];
                    if (jArr[0] <= j4 || !z2) {
                        z3 = true;
                    } else {
                        u uVar = new u();
                        uVar.f28204a = xVar3;
                        z3 = true;
                        uVar.f28206c = true;
                        uVar.f28207d = jArr[0];
                        synchronized (this.h) {
                            this.h.add(uVar);
                        }
                    }
                    if (NetworkUtils.isNetworkAvailable(this.i)) {
                        try {
                            int a4 = a(AppLog.APPLOG_URL(), str, z3);
                            if (a4 != -1) {
                                if (a4 == 200) {
                                    z4 = true;
                                }
                                if (z4 && xVar5 != null && b()) {
                                    xVar5.j = z3;
                                    a2.c(xVar5.f28218a);
                                }
                                boolean z5 = z4;
                                List<Long> c2 = c(str);
                                AppLog.tryReportLogRequest(z5, new ArrayList(c2));
                                boolean a5 = a2.a(a3, z5);
                                if (!z5 && a5) {
                                    AppLog.tryReportLogExpired(new ArrayList(c2));
                                    AppLog.tryReportTerminateLost(a(str));
                                }
                                if (!z5 && this.m < 0) {
                                    this.m = a3;
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
                return;
            }
            x xVar6 = xVar4;
            if (xVar6 != null && NetworkUtils.isNetworkAvailable(this.i) && this.f28212b > 0 && !xVar6.i) {
                try {
                    if (b()) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("magic_tag", "ss_app_log");
                        jSONObject3.put("header", this.j);
                        JSONArray jSONArray = new JSONArray();
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("datetime", AppLog.formatDate(xVar6.f28220c));
                        jSONObject4.put("session_id", xVar6.f28219b);
                        jSONObject4.put("local_time_ms", xVar6.f28220c);
                        jSONObject4.put("tea_event_index", xVar6.f28221d);
                        if (xVar6.i) {
                            jSONObject4.put("is_background", true);
                        }
                        jSONArray.put(jSONObject4);
                        jSONObject3.put("launch", jSONArray);
                        a(AppLog.APPLOG_URL(), jSONObject3.toString(), true);
                    }
                } catch (Throwable unused3) {
                }
            }
        }
    }

    v(Context context, JSONObject jSONObject, LinkedList<s> linkedList, AtomicBoolean atomicBoolean, List<AppLog.j> list, x xVar, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2) {
        super("LogReaper");
        this.i = context;
        this.j = jSONObject;
        this.h = linkedList;
        this.k = atomicBoolean;
        this.l = list;
        this.o = xVar;
        this.s = concurrentHashMap;
        this.t = concurrentHashMap2;
        this.u = new j();
        this.u.a(AppLog.APPLOG_URL());
        this.u.a(AppLog.CRASH_URL());
    }
}
