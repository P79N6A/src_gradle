package com.toutiao.proxyserver.f;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.toutiao.proxyserver.Proxy;
import com.toutiao.proxyserver.b.a;
import com.toutiao.proxyserver.n;
import com.toutiao.proxyserver.net.d;
import com.toutiao.proxyserver.net.e;
import com.toutiao.proxyserver.u;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80072a;

    /* renamed from: b  reason: collision with root package name */
    public static final Charset f80073b = Charset.forName("UTF-8");

    /* renamed from: c  reason: collision with root package name */
    private static final Handler f80074c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    private static final ExecutorService f80075d;

    public static void a(Socket socket) {
        if (PatchProxy.isSupport(new Object[]{socket}, null, f80072a, true, 91866, new Class[]{Socket.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{socket}, null, f80072a, true, 91866, new Class[]{Socket.class}, Void.TYPE);
            return;
        }
        if (socket != null) {
            try {
                socket.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:5|6|7|8|9) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x003b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.io.RandomAccessFile r17) {
        /*
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r17
            com.meituan.robust.ChangeQuickRedirect r4 = f80072a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.io.RandomAccessFile> r3 = java.io.RandomAccessFile.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = 0
            r5 = 1
            r6 = 91867(0x166db, float:1.28733E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0032
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r17
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f80072a
            r13 = 1
            r14 = 91867(0x166db, float:1.28733E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.io.RandomAccessFile> r0 = java.io.RandomAccessFile.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0032:
            if (r17 == 0) goto L_0x003f
            java.io.FileDescriptor r1 = r17.getFD()     // Catch:{ Throwable -> 0x003b }
            r1.sync()     // Catch:{ Throwable -> 0x003b }
        L_0x003b:
            r17.close()     // Catch:{ Throwable -> 0x003f }
            return
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.f.c.a(java.io.RandomAccessFile):void");
    }

    public static boolean a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f80072a, true, 91868, new Class[]{String.class}, Boolean.TYPE)) {
            return str2 != null && (str2.startsWith("http://") || str2.startsWith("https://"));
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f80072a, true, 91868, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.lang.String> a(java.lang.String... r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f80072a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r7[r9] = r3
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r3 = 0
            r5 = 1
            r6 = 91874(0x166e2, float:1.28743E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f80072a
            r13 = 1
            r14 = 91874(0x166e2, float:1.28743E-40)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r15[r9] = r0
            java.lang.Class<java.util.List> r16 = java.util.List.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0037:
            r1 = 0
            if (r0 == 0) goto L_0x005d
            int r2 = r0.length
            if (r2 != 0) goto L_0x003e
            goto L_0x005d
        L_0x003e:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r0.length
            r2.<init>(r3)
            int r3 = r0.length
        L_0x0045:
            if (r9 >= r3) goto L_0x0055
            r4 = r0[r9]
            boolean r5 = a((java.lang.String) r4)
            if (r5 == 0) goto L_0x0052
            r2.add(r4)
        L_0x0052:
            int r9 = r9 + 1
            goto L_0x0045
        L_0x0055:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x005c
            return r1
        L_0x005c:
            return r2
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.f.c.a(java.lang.String[]):java.util.List");
    }

    public static void a(e eVar, boolean z, boolean z2) throws u {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, null, f80072a, true, 91878, new Class[]{e.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar2, Byte.valueOf(z), Byte.valueOf(z2)}, null, f80072a, true, 91878, new Class[]{e.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (eVar2 == null) {
            com.toutiao.proxyserver.d.c.d("TAG_PROXY_Response", "response null");
            throw new u("response null", 10);
        } else if (!eVar.a()) {
            com.toutiao.proxyserver.d.c.d("TAG_PROXY_Response", "response code: " + eVar2.f80159c);
            final JSONObject a2 = a(eVar2, eVar2.f80158b);
            if (eVar2.f80159c == 416) {
                final n b2 = Proxy.b();
                if (b2 != null) {
                    b((Runnable) new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f80078a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f80078a, false, 91899, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f80078a, false, 91899, new Class[0], Void.TYPE);
                                return;
                            }
                            b2.a(a2);
                        }
                    });
                }
            }
            throw new u("response code: " + eVar2.f80159c + " Error extra: " + a2.toString(), eVar2.f80159c);
        } else {
            String a3 = eVar2.a("Content-Type");
            if (!d(a3)) {
                com.toutiao.proxyserver.d.c.d("TAG_PROXY_Response", "Content-Type: " + a3 + ", url: " + eVar2.f80158b.f80146b);
                String str = null;
                if (e(a3)) {
                    str = a(eVar.d());
                    int i = 500;
                    if (str.length() <= 500) {
                        i = str.length();
                    }
                    if (!TextUtils.isEmpty(str)) {
                        str = str.substring(0, i - 1);
                    }
                }
                throw new u("Content-Type: " + a3 + ", extra:" + str + ", url: " + eVar2.f80158b.f80146b, 11);
            }
            int a4 = a(eVar);
            if (a4 > 0) {
                if (z) {
                    if (!"http/1.0".equalsIgnoreCase(eVar.b())) {
                        String a5 = eVar2.a("Accept-Ranges");
                        if (eVar2.f80159c != 206 && (a5 == null || !a5.contains("bytes"))) {
                            com.toutiao.proxyserver.d.c.d("TAG_PROXY_Response", "Accept-Ranges: " + a5 + ", url: " + eVar2.f80158b.f80146b);
                            throw new u("Accept-Ranges: " + a5 + ", url: " + eVar2.f80158b.f80146b, 14);
                        }
                    } else {
                        throw new u("http/1.0 do not support range request.", 13);
                    }
                }
                if (z2 && eVar.d() == null) {
                    com.toutiao.proxyserver.d.c.d("TAG_PROXY_Response", "response body null");
                    throw new u("response body null", 10);
                }
                return;
            }
            com.toutiao.proxyserver.d.c.d("TAG_PROXY_Response", "Content-Length: " + a4);
            throw new u("Content-Length: " + a4, 12);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0061 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.io.InputStream r17) {
        /*
            r1 = r17
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r9 = 0
            r2[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r4 = f80072a
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
            r7[r9] = r3
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = 0
            r5 = 1
            r6 = 91879(0x166e7, float:1.2875E-40)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r0]
            r10[r9] = r1
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f80072a
            r13 = 1
            r14 = 91879(0x166e7, float:1.2875E-40)
            java.lang.Class[] r15 = new java.lang.Class[r0]
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            r15[r9] = r0
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0037:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            r2.<init>(r1)
            r0.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
        L_0x0046:
            java.lang.String r3 = r0.readLine()     // Catch:{ IOException -> 0x0061, all -> 0x0065 }
            if (r3 == 0) goto L_0x0061
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0061, all -> 0x0065 }
            r4.<init>()     // Catch:{ IOException -> 0x0061, all -> 0x0065 }
            r4.append(r3)     // Catch:{ IOException -> 0x0061, all -> 0x0065 }
            java.lang.String r3 = "\n"
            r4.append(r3)     // Catch:{ IOException -> 0x0061, all -> 0x0065 }
            java.lang.String r3 = r4.toString()     // Catch:{ IOException -> 0x0061, all -> 0x0065 }
            r2.append(r3)     // Catch:{ IOException -> 0x0061, all -> 0x0065 }
            goto L_0x0046
        L_0x0061:
            r17.close()     // Catch:{ IOException -> 0x006a }
            goto L_0x006a
        L_0x0065:
            r0 = move-exception
            r17.close()     // Catch:{ IOException -> 0x0069 }
        L_0x0069:
            throw r0
        L_0x006a:
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.f.c.a(java.io.InputStream):java.lang.String");
    }

    @NonNull
    private static JSONObject a(e eVar, d dVar) {
        e eVar2 = eVar;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{eVar2, dVar2}, null, f80072a, true, 91880, new Class[]{e.class, d.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{eVar2, dVar2}, null, f80072a, true, 91880, new Class[]{e.class, d.class}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Range", dVar2.a("Range"));
            jSONObject.put("Vpwp-Type", dVar2.a("Vpwp-Type"));
            jSONObject.put("Vpwp-Mp-Range", dVar2.a("Vpwp-Mp-Range"));
            jSONObject.put("Content-Range", eVar2.a("Content-Range"));
            jSONObject.put("Content-Type", eVar2.a("Content-Type"));
            jSONObject.put("Content-Length", eVar2.a("Content-Length"));
            jSONObject.put(PushConstants.WEB_URL, eVar2.f80158b.f80146b);
            String a2 = dVar2.a("Vpwp-Key");
            jSONObject.put("Vpwp-Key", a2);
            int b2 = b(dVar2.a("Vpwp-Flag"));
            if (b2 != 1) {
                b2 = 0;
            }
            com.toutiao.proxyserver.b.c cVar = Proxy.f79956d;
            if (cVar != null) {
                a a3 = cVar.a(a2, b2);
                if (a3 != null) {
                    jSONObject.put("DB-Content-Type", a3.f80011c);
                    jSONObject.put("DB-Content-Length", a3.f80012d);
                    jSONObject.put("DB-extra", a3.f80014f);
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static void a(Runnable runnable) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{runnable2}, null, f80072a, true, 91884, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable2}, null, f80072a, true, 91884, new Class[]{Runnable.class}, Void.TYPE);
        } else if (b()) {
            f80075d.execute(runnable2);
            com.toutiao.proxyserver.d.c.c("TAG_PROXY_UTIL", "invoke in pool thread");
        } else {
            runnable.run();
            com.toutiao.proxyserver.d.c.c("TAG_PROXY_UTIL", "invoke calling thread");
        }
    }

    public static void a(List<com.toutiao.proxyserver.net.c> list) {
        List<com.toutiao.proxyserver.net.c> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, null, f80072a, true, 91886, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, null, f80072a, true, 91886, new Class[]{List.class}, Void.TYPE);
        } else if (list2 != null) {
            com.toutiao.proxyserver.d.c.b("TAG_PROXY_PRE_FILTER", list.toString());
            a(list2, "Host");
            a(list2, "Keep-Alive");
            List<com.toutiao.proxyserver.net.c> b2 = b(list2, "Connection");
            if (b2 != null && !b2.isEmpty()) {
                for (com.toutiao.proxyserver.net.c cVar : b2) {
                    List<String> f2 = f(cVar.f80144c);
                    if (f2 != null) {
                        for (String a2 : f2) {
                            a(list2, a2);
                        }
                    }
                }
            }
            a(list2, "Connection");
            List<com.toutiao.proxyserver.net.c> b3 = b(list2, "Proxy-Connection");
            if (b3 != null && !b3.isEmpty()) {
                for (com.toutiao.proxyserver.net.c cVar2 : b3) {
                    List<String> f3 = f(cVar2.f80144c);
                    if (f3 != null) {
                        for (String a3 : f3) {
                            a(list2, a3);
                        }
                    }
                }
            }
            a(list2, "Proxy-Connection");
            com.toutiao.proxyserver.d.c.b("TAG_PROXY_PRE_FILTER", list.toString());
        }
    }

    private static void a(List<com.toutiao.proxyserver.net.c> list, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{list, str2}, null, f80072a, true, 91887, new Class[]{List.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, str2}, null, f80072a, true, 91887, new Class[]{List.class, String.class}, Void.TYPE);
            return;
        }
        Iterator<com.toutiao.proxyserver.net.c> it2 = list.iterator();
        while (it2.hasNext()) {
            if (it2.next().f80143b.equalsIgnoreCase(str2)) {
                it2.remove();
            }
        }
    }

    public static void a(@NonNull JSONObject jSONObject, String str, Object obj) {
        if (PatchProxy.isSupport(new Object[]{jSONObject, str, obj}, null, f80072a, true, 91893, new Class[]{JSONObject.class, String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, str, obj}, null, f80072a, true, 91893, new Class[]{JSONObject.class, String.class, Object.class}, Void.TYPE);
            return;
        }
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        f80075d = threadPoolExecutor;
    }

    public static int a() {
        if (PatchProxy.isSupport(new Object[0], null, f80072a, true, 91876, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f80072a, true, 91876, new Class[0], Integer.TYPE)).intValue();
        }
        if (Build.VERSION.SDK_INT >= 17) {
            return Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        try {
            File file = new File("/sys/devices/system/cpu/");
            if (file.exists()) {
                File[] listFiles = file.listFiles(new FilenameFilter() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f80076a;

                    /* renamed from: b  reason: collision with root package name */
                    private Pattern f80077b = Pattern.compile("^cpu[0-9]+$");

                    public final boolean accept(File file, String str) {
                        String str2 = str;
                        if (!PatchProxy.isSupport(new Object[]{file, str2}, this, f80076a, false, 91898, new Class[]{File.class, String.class}, Boolean.TYPE)) {
                            return this.f80077b.matcher(str2).matches();
                        }
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{file, str2}, this, f80076a, false, 91898, new Class[]{File.class, String.class}, Boolean.TYPE)).booleanValue();
                    }
                });
                if (listFiles != null) {
                    return Math.max(listFiles.length, 1);
                }
                return 1;
            }
        } catch (Throwable unused) {
        }
        return 1;
    }

    private static boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f80072a, true, 91883, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f80072a, true, 91883, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            z = true;
        }
        return z;
    }

    public static void a(Closeable closeable) {
        if (PatchProxy.isSupport(new Object[]{closeable}, null, f80072a, true, 91864, new Class[]{Closeable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{closeable}, null, f80072a, true, 91864, new Class[]{Closeable.class}, Void.TYPE);
            return;
        }
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static int b(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f80072a, true, 91869, new Class[]{String.class}, Integer.TYPE)) {
            return a(str2, 0);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, null, f80072a, true, 91869, new Class[]{String.class}, Integer.TYPE)).intValue();
    }

    private static String b(List<com.toutiao.proxyserver.net.c> list) {
        if (PatchProxy.isSupport(new Object[]{list}, null, f80072a, true, 91891, new Class[]{List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{list}, null, f80072a, true, 91891, new Class[]{List.class}, String.class);
        } else if (list == null || list.size() == 0) {
            return "";
        } else {
            StringBuilder sb = new StringBuilder();
            for (com.toutiao.proxyserver.net.c next : list) {
                sb.append(next.f80143b);
                sb.append(": ");
                sb.append(next.f80144c);
                sb.append("\r\n");
            }
            return sb.toString();
        }
    }

    public static String c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f80072a, true, 91897, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f80072a, true, 91897, new Class[]{String.class}, String.class);
        } else if (str2 == null) {
            return "";
        } else {
            int length = str.length();
            StringBuilder sb = null;
            for (int i = 0; i < length; i++) {
                char charAt = str2.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    if (sb != null) {
                        sb.append(charAt);
                    }
                } else if (sb == null) {
                    sb = new StringBuilder(str2.substring(0, i));
                }
            }
            if (sb == null) {
                return str2;
            }
            return sb.toString();
        }
    }

    private static boolean d(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f80072a, true, 91881, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f80072a, true, 91881, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (str2 == null || (!str2.startsWith("video/") && !"application/octet-stream".equals(str2) && !"binary/octet-stream".equals(str2))) {
            return false;
        } else {
            return true;
        }
    }

    private static boolean e(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f80072a, true, 91882, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f80072a, true, 91882, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (str2 == null || !str2.startsWith("text/")) {
            return false;
        } else {
            return true;
        }
    }

    private static List<String> f(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f80072a, true, 91889, new Class[]{String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str2}, null, f80072a, true, 91889, new Class[]{String.class}, List.class);
        } else if (TextUtils.isEmpty(str)) {
            return null;
        } else {
            String[] split = str2.split(",");
            ArrayList arrayList = new ArrayList(split.length);
            for (String str3 : split) {
                if (!TextUtils.isEmpty(str3)) {
                    String trim = str3.trim();
                    if (!TextUtils.isEmpty(trim)) {
                        arrayList.add(trim);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        }
    }

    public static int a(e eVar) {
        e eVar2 = eVar;
        if (PatchProxy.isSupport(new Object[]{eVar2}, null, f80072a, true, 91877, new Class[]{e.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{eVar2}, null, f80072a, true, 91877, new Class[]{e.class}, Integer.TYPE)).intValue();
        } else if (eVar2 == null) {
            return -1;
        } else {
            if (eVar2.f80159c == 200) {
                return a(eVar2.a("Content-Length"), -1);
            }
            if (eVar2.f80159c == 206) {
                String a2 = eVar2.a("Content-Range");
                if (!TextUtils.isEmpty(a2)) {
                    int lastIndexOf = a2.lastIndexOf("/");
                    if (lastIndexOf >= 0 && lastIndexOf < a2.length() - 1) {
                        return a(a2.substring(lastIndexOf + 1), -1);
                    }
                }
            }
            return -1;
        }
    }

    public static void b(Runnable runnable) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{runnable2}, null, f80072a, true, 91885, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable2}, null, f80072a, true, 91885, new Class[]{Runnable.class}, Void.TYPE);
        } else if (b()) {
            runnable.run();
        } else {
            f80074c.post(runnable2);
        }
    }

    private static List<com.toutiao.proxyserver.net.c> b(List<com.toutiao.proxyserver.net.c> list, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{list, str2}, null, f80072a, true, 91888, new Class[]{List.class, String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list, str2}, null, f80072a, true, 91888, new Class[]{List.class, String.class}, List.class);
        }
        ArrayList arrayList = null;
        for (com.toutiao.proxyserver.net.c next : list) {
            if (next.f80143b.equalsIgnoreCase(str2)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    private static int a(String str, int i) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i)}, null, f80072a, true, 91870, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i)}, null, f80072a, true, 91870, new Class[]{String.class, Integer.TYPE}, Integer.TYPE)).intValue();
        } else if (TextUtils.isEmpty(str)) {
            return i;
        } else {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return i;
            }
        }
    }

    public static String a(a aVar, int i) {
        a aVar2 = aVar;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{aVar2, Integer.valueOf(i)}, null, f80072a, true, 91875, new Class[]{a.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{aVar2, Integer.valueOf(i)}, null, f80072a, true, 91875, new Class[]{a.class, Integer.TYPE}, String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (i2 <= 0) {
            sb.append("HTTP/1.1 200 OK\r\n");
        } else {
            sb.append("HTTP/1.1 206 Partial Content\r\n");
        }
        sb.append("Accept-Ranges: bytes\r\n");
        sb.append("Content-Type: ");
        sb.append(aVar2.f80011c);
        sb.append("\r\n");
        if (i2 <= 0) {
            sb.append("Content-Length: ");
            sb.append(aVar2.f80012d);
            sb.append("\r\n");
        } else {
            sb.append("Content-Range: bytes ");
            sb.append(i2);
            sb.append("-");
            sb.append(aVar2.f80012d - 1);
            sb.append("/");
            sb.append(aVar2.f80012d);
            sb.append("\r\n");
            sb.append("Content-Length: ");
            sb.append(aVar2.f80012d - i2);
            sb.append("\r\n");
        }
        sb.append("Connection: close\r\n");
        sb.append("\r\n");
        String sb2 = sb.toString();
        com.toutiao.proxyserver.d.c.b("TAG_PROXY_WRITE_TO_MP", sb2);
        return sb2;
    }

    public static String a(e eVar, int i) {
        e eVar2 = eVar;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{eVar2, Integer.valueOf(i)}, null, f80072a, true, 91871, new Class[]{e.class, Integer.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{eVar2, Integer.valueOf(i)}, null, f80072a, true, 91871, new Class[]{e.class, Integer.TYPE}, String.class);
        } else if (eVar2 == null || !eVar.a()) {
            return null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(eVar.b().toUpperCase());
            sb.append(' ');
            sb.append(eVar2.f80159c);
            sb.append(' ');
            sb.append(eVar.c());
            sb.append("\r\n");
            com.toutiao.proxyserver.d.c.b("TAG_PROXY_headers", eVar.b().toUpperCase() + " " + eVar2.f80159c + " " + eVar.c());
            List<com.toutiao.proxyserver.net.c> list = eVar2.f80160d;
            a(list);
            for (com.toutiao.proxyserver.net.c next : list) {
                String str = next.f80143b;
                String str2 = next.f80144c;
                sb.append(str);
                sb.append(": ");
                sb.append(str2);
                sb.append("\r\n");
                if ("Content-Range".equalsIgnoreCase(str) || ("Accept-Ranges".equalsIgnoreCase(str) && "bytes".equalsIgnoreCase(str2))) {
                    z = false;
                }
            }
            if (z) {
                int a2 = a(eVar);
                if (a2 > 0) {
                    sb.append("Content-Range: bytes ");
                    sb.append(Math.max(i, 0));
                    sb.append("-");
                    sb.append(a2 - 1);
                    sb.append("/");
                    sb.append(a2);
                    sb.append("\r\n");
                }
            }
            sb.append("Connection: close\r\n");
            sb.append("\r\n");
            String sb2 = sb.toString();
            com.toutiao.proxyserver.d.c.b("TAG_PROXY_WRITE_TO_MP", sb2);
            return sb2;
        }
    }

    public static a a(e eVar, com.toutiao.proxyserver.b.c cVar, String str, int i) {
        String str2;
        e eVar2 = eVar;
        com.toutiao.proxyserver.b.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{eVar2, cVar2, str, Integer.valueOf(i)}, null, f80072a, true, 91890, new Class[]{e.class, com.toutiao.proxyserver.b.c.class, String.class, Integer.TYPE}, a.class)) {
            Object[] objArr = {eVar2, cVar2, str, Integer.valueOf(i)};
            return (a) PatchProxy.accessDispatch(objArr, null, f80072a, true, 91890, new Class[]{e.class, com.toutiao.proxyserver.b.c.class, String.class, Integer.TYPE}, a.class);
        }
        a a2 = cVar.a(str, i);
        if (a2 == null) {
            int a3 = a(eVar);
            String a4 = eVar2.a("Content-Type");
            if (a3 > 0 && !TextUtils.isEmpty(a4)) {
                String str3 = eVar2.f80158b.f80146b;
                String b2 = b(eVar2.f80158b.f80148d);
                String b3 = b(eVar2.f80160d);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("requestUrl", str3);
                    jSONObject.put("requestHeaders", b2);
                    jSONObject.put("responseHeaders", b3);
                    str2 = jSONObject.toString();
                } catch (Throwable unused) {
                    str2 = "";
                }
                a aVar = new a(str, a4, a3, i, str2);
                if (PatchProxy.isSupport(new Object[]{aVar}, cVar, com.toutiao.proxyserver.b.c.f80015a, false, 91778, new Class[]{a.class}, Void.TYPE)) {
                    com.toutiao.proxyserver.b.c cVar3 = cVar;
                    PatchProxy.accessDispatch(new Object[]{aVar}, cVar3, com.toutiao.proxyserver.b.c.f80015a, false, 91778, new Class[]{a.class}, Void.TYPE);
                } else {
                    Map map = cVar2.f80017b.get(aVar.f80013e);
                    if (map != null) {
                        map.put(aVar.f80010b, aVar);
                    }
                    cVar2.f80019d.execute(new Runnable(aVar) {

                        /* renamed from: a */
                        public static ChangeQuickRedirect f80021a;

                        /* renamed from: b */
                        final /* synthetic */ a f80022b;

                        public final void run(
/*
Method generation error in method: com.toutiao.proxyserver.b.c.1.run():void, dex: classes6.dex
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.toutiao.proxyserver.b.c.1.run():void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:267)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:312)
                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:659)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:593)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:351)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:218)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:106)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:770)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:711)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:355)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:237)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:208)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:317)
                        	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:263)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:226)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:111)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:77)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:63)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:258)
                        
*/
                    });
                }
                a2 = aVar;
            }
        }
        return a2;
    }
}
