package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class dk {

    /* renamed from: a  reason: collision with root package name */
    static final List<b> f5962a = Collections.synchronizedList(new ArrayList());

    /* renamed from: b  reason: collision with root package name */
    private cy f5963b;

    /* renamed from: c  reason: collision with root package name */
    private int f5964c;

    /* renamed from: d  reason: collision with root package name */
    private em f5965d;

    /* renamed from: e  reason: collision with root package name */
    private el f5966e;

    class a implements em {

        /* renamed from: b  reason: collision with root package name */
        private du f5968b;

        public void a(String str) {
            try {
                this.f5968b.b(str, de.a(dk.this.c()));
            } catch (Throwable unused) {
            }
        }

        a(du duVar) {
            this.f5968b = duVar;
        }
    }

    public interface b {
        void a(Context context);
    }

    /* access modifiers changed from: protected */
    public abstract String a(List<cy> list);

    /* access modifiers changed from: protected */
    public abstract boolean a(Context context);

    public static List<b> a() {
        return f5962a;
    }

    /* access modifiers changed from: protected */
    public int c() {
        return this.f5964c;
    }

    /* access modifiers changed from: package-private */
    public void a(cy cyVar, Context context, Throwable th, String str, String str2, String str3) {
        a(cyVar, context, c(th), str, str2, str3);
    }

    /* access modifiers changed from: package-private */
    public void a(cy cyVar, Context context, String str, String str2, String str3, String str4) {
        Context context2 = context;
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        a(cyVar);
        String a2 = fd.a();
        cy cyVar2 = cyVar;
        String a3 = a(context, cyVar);
        String a4 = cp.a(context);
        if (str5 != null && !"".equals(str5)) {
            int c2 = c();
            StringBuilder sb = new StringBuilder();
            if (str7 != null) {
                sb.append("class:");
                sb.append(str7);
            }
            if (str8 != null) {
                sb.append(" method:");
                sb.append(str8);
                sb.append("$<br/>");
            }
            sb.append(str6);
            String a5 = a(str6);
            String a6 = fd.a(a4, a3, a2, c2, str, sb.toString());
            if (a6 != null && !"".equals(a6)) {
                String a7 = a(context, a6);
                String b2 = b();
                synchronized (Looper.getMainLooper()) {
                    du duVar = new du(context);
                    boolean a8 = a(context, a5, b2, a7, duVar);
                    a(duVar, cyVar.a(), a5, c2, a8);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Context context, Throwable th, String str, String str2) {
        List<cy> g = g(context);
        if (g != null && g.size() != 0) {
            String a2 = a(th);
            if (a2 != null && !"".equals(a2)) {
                for (cy next : g) {
                    if (a(next.g(), a2)) {
                        a(next, context, th, a2.replaceAll("\n", "<br/>"), str, str2);
                        return;
                    }
                }
                if (a2.contains("com.amap.api.col")) {
                    try {
                        a(cz.a(), context, th, a2, str, str2);
                    } catch (co unused) {
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(cy cyVar) {
        this.f5963b = cyVar;
    }

    /* access modifiers changed from: protected */
    public String a(String str) {
        return cv.c(str);
    }

    /* access modifiers changed from: protected */
    public String a(Throwable th) {
        try {
            return b(th);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public String b() {
        return de.c(this.f5964c);
    }

    /* access modifiers changed from: package-private */
    public void d() {
        try {
            if (this.f5966e != null && !this.f5966e.d()) {
                this.f5966e.close();
            }
        } catch (IOException e2) {
            dd.a((Throwable) e2, "LogProcessor", "closeDiskLru");
        } catch (Throwable th) {
            dd.a(th, "LogProcessor", "closeDiskLru");
        }
    }

    protected dk(int i) {
        this.f5964c = i;
    }

    public static String b(Throwable th) {
        return cz.a(th);
    }

    private String c(Throwable th) {
        return th.toString();
    }

    private void f(Context context) {
        try {
            this.f5966e = b(context, b());
        } catch (Throwable th) {
            dd.a(th, "LogProcessor", "LogUpDateProcessor");
        }
    }

    private List<cy> g(Context context) {
        List<cy> list = null;
        try {
            synchronized (Looper.getMainLooper()) {
                try {
                    List<cy> a2 = new dw(context, false).a();
                    try {
                        return a2;
                    } catch (Throwable th) {
                        Throwable th2 = th;
                        list = a2;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
        } catch (Throwable unused) {
            return list;
        }
    }

    private boolean c(String str) {
        boolean z;
        if (this.f5966e == null) {
            return false;
        }
        try {
            z = this.f5966e.c(str);
        } catch (Throwable th) {
            dd.a(th, "LogUpdateProcessor", "deleteLogData-" + str);
            z = false;
        }
        return z;
    }

    public static String e(Context context) {
        String str;
        try {
            String d2 = d(context);
            if ("".equals(d2)) {
                return null;
            }
            str = cs.b(context, cz.a(d2));
            return str;
        } catch (Throwable th) {
            dd.a(th, "LogProcessor", "getPublicInfo");
            str = null;
        }
    }

    public static int b(String str) {
        df dfVar = new df(cz.c(cz.a(str)));
        int i = 1;
        try {
            byte[] a2 = ep.a().a(dfVar);
            if (a2 == null) {
                return 0;
            }
            try {
                JSONObject jSONObject = new JSONObject(cz.a(a2));
                if (jSONObject.has("code")) {
                    i = jSONObject.getInt("code");
                } else {
                    i = 0;
                }
            } catch (JSONException e2) {
                dd.a((Throwable) e2, "LogProcessor", "processUpdate");
            }
            return i;
        } catch (co e3) {
            if (e3.e() == 27) {
                i = 0;
            }
            dd.a((Throwable) e3, "LogProcessor", "processUpdate");
        }
    }

    public static String d(Context context) {
        StringBuilder sb = new StringBuilder();
        try {
            sb.append("\"key\":\"");
            sb.append(cp.f(context));
            sb.append("\",\"platform\":\"android\",\"diu\":\"");
            sb.append(ct.q(context));
            sb.append("\",\"pkg\":\"");
            sb.append(cp.c(context));
            sb.append("\",\"model\":\"");
            sb.append(Build.MODEL);
            sb.append("\",\"appname\":\"");
            sb.append(cp.b(context));
            sb.append("\",\"appversion\":\"");
            sb.append(cp.d(context));
            sb.append("\",\"sysversion\":\"");
            sb.append(Build.VERSION.RELEASE);
            sb.append("\",");
        } catch (Throwable th) {
            dd.a(th, "CInfo", "getPublicJSONInfo");
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(android.content.Context r5) {
        /*
            r4 = this;
            boolean r0 = r4.a((android.content.Context) r5)     // Catch:{ Throwable -> 0x004e }
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch:{ Throwable -> 0x004e }
            monitor-enter(r0)     // Catch:{ Throwable -> 0x004e }
            r4.f(r5)     // Catch:{ all -> 0x004b }
            com.amap.api.mapcore2d.du r1 = new com.amap.api.mapcore2d.du     // Catch:{ all -> 0x004b }
            r1.<init>(r5)     // Catch:{ all -> 0x004b }
            int r2 = r4.c()     // Catch:{ all -> 0x004b }
            r4.a((com.amap.api.mapcore2d.du) r1, (int) r2)     // Catch:{ all -> 0x004b }
            r2 = 0
            int r3 = r4.c()     // Catch:{ all -> 0x004b }
            java.lang.Class r3 = com.amap.api.mapcore2d.de.a((int) r3)     // Catch:{ all -> 0x004b }
            java.util.List r2 = r1.a((int) r2, (java.lang.Class<? extends com.amap.api.mapcore2d.dv>) r3)     // Catch:{ all -> 0x004b }
            if (r2 == 0) goto L_0x0049
            int r3 = r2.size()     // Catch:{ all -> 0x004b }
            if (r3 != 0) goto L_0x0031
            goto L_0x0049
        L_0x0031:
            java.lang.String r5 = r4.a((java.util.List<? extends com.amap.api.mapcore2d.dv>) r2, (android.content.Context) r5)     // Catch:{ all -> 0x004b }
            if (r5 != 0) goto L_0x0039
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            return
        L_0x0039:
            int r5 = b((java.lang.String) r5)     // Catch:{ all -> 0x004b }
            r3 = 1
            if (r5 != r3) goto L_0x0047
            int r5 = r4.c()     // Catch:{ all -> 0x004b }
            r4.a(r2, r1, r5)     // Catch:{ all -> 0x004b }
        L_0x0047:
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            goto L_0x0056
        L_0x0049:
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            return
        L_0x004b:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004b }
            throw r5     // Catch:{ Throwable -> 0x004e }
        L_0x004e:
            r5 = move-exception
            java.lang.String r0 = "LogProcessor"
            java.lang.String r1 = "processUpdateLog"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r5, (java.lang.String) r0, (java.lang.String) r1)
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.dk.c(android.content.Context):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0065 A[SYNTHETIC, Splitter:B:41:0x0065] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0073 A[SYNTHETIC, Splitter:B:46:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0083 A[SYNTHETIC, Splitter:B:53:0x0083] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0091 A[SYNTHETIC, Splitter:B:58:0x0091] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String d(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 0
            com.amap.api.mapcore2d.el r1 = r6.f5966e     // Catch:{ Throwable -> 0x0059, all -> 0x0054 }
            if (r1 != 0) goto L_0x0006
            return r0
        L_0x0006:
            com.amap.api.mapcore2d.el r1 = r6.f5966e     // Catch:{ Throwable -> 0x0059, all -> 0x0054 }
            com.amap.api.mapcore2d.el$b r7 = r1.a((java.lang.String) r7)     // Catch:{ Throwable -> 0x0059, all -> 0x0054 }
            if (r7 != 0) goto L_0x000f
            return r0
        L_0x000f:
            r1 = 0
            java.io.InputStream r7 = r7.a(r1)     // Catch:{ Throwable -> 0x0059, all -> 0x0054 }
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch:{ Throwable -> 0x0051, all -> 0x004d }
            r2.<init>()     // Catch:{ Throwable -> 0x0051, all -> 0x004d }
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch:{ Throwable -> 0x004b }
        L_0x001d:
            int r4 = r7.read(r3)     // Catch:{ Throwable -> 0x004b }
            r5 = -1
            if (r4 == r5) goto L_0x0028
            r2.write(r3, r1, r4)     // Catch:{ Throwable -> 0x004b }
            goto L_0x001d
        L_0x0028:
            byte[] r1 = r2.toByteArray()     // Catch:{ Throwable -> 0x004b }
            java.lang.String r1 = com.amap.api.mapcore2d.cz.a((byte[]) r1)     // Catch:{ Throwable -> 0x004b }
            r2.close()     // Catch:{ IOException -> 0x0034 }
            goto L_0x003c
        L_0x0034:
            r0 = move-exception
            java.lang.String r2 = "LogProcessor"
            java.lang.String r3 = "readLog1"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r0, (java.lang.String) r2, (java.lang.String) r3)
        L_0x003c:
            if (r7 == 0) goto L_0x004a
            r7.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x004a
        L_0x0042:
            r7 = move-exception
            java.lang.String r0 = "LogProcessor"
            java.lang.String r2 = "readLog2"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r7, (java.lang.String) r0, (java.lang.String) r2)
        L_0x004a:
            return r1
        L_0x004b:
            r1 = move-exception
            goto L_0x005c
        L_0x004d:
            r1 = move-exception
            r2 = r0
            r0 = r1
            goto L_0x0081
        L_0x0051:
            r1 = move-exception
            r2 = r0
            goto L_0x005c
        L_0x0054:
            r7 = move-exception
            r2 = r0
            r0 = r7
            r7 = r2
            goto L_0x0081
        L_0x0059:
            r1 = move-exception
            r7 = r0
            r2 = r7
        L_0x005c:
            java.lang.String r3 = "LogProcessor"
            java.lang.String r4 = "readLog"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r1, (java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x0080 }
            if (r2 == 0) goto L_0x0071
            r2.close()     // Catch:{ IOException -> 0x0069 }
            goto L_0x0071
        L_0x0069:
            r1 = move-exception
            java.lang.String r2 = "LogProcessor"
            java.lang.String r3 = "readLog1"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r1, (java.lang.String) r2, (java.lang.String) r3)
        L_0x0071:
            if (r7 == 0) goto L_0x007f
            r7.close()     // Catch:{ IOException -> 0x0077 }
            goto L_0x007f
        L_0x0077:
            r7 = move-exception
            java.lang.String r1 = "LogProcessor"
            java.lang.String r2 = "readLog2"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r7, (java.lang.String) r1, (java.lang.String) r2)
        L_0x007f:
            return r0
        L_0x0080:
            r0 = move-exception
        L_0x0081:
            if (r2 == 0) goto L_0x008f
            r2.close()     // Catch:{ IOException -> 0x0087 }
            goto L_0x008f
        L_0x0087:
            r1 = move-exception
            java.lang.String r2 = "LogProcessor"
            java.lang.String r3 = "readLog1"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r1, (java.lang.String) r2, (java.lang.String) r3)
        L_0x008f:
            if (r7 == 0) goto L_0x009d
            r7.close()     // Catch:{ IOException -> 0x0095 }
            goto L_0x009d
        L_0x0095:
            r7 = move-exception
            java.lang.String r1 = "LogProcessor"
            java.lang.String r2 = "readLog2"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r7, (java.lang.String) r1, (java.lang.String) r2)
        L_0x009d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.dk.d(java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public void b(Context context) {
        List<cy> g = g(context);
        if (g != null && g.size() != 0) {
            String a2 = a(g);
            if (a2 != null && !"".equals(a2)) {
                String a3 = fd.a();
                String a4 = fd.a(context, this.f5963b);
                String a5 = cp.a(context);
                int c2 = c();
                String a6 = fd.a(a5, a4, a3, c2, "ANR", a2);
                if (a6 != null && !"".equals(a6)) {
                    String a7 = a(a2);
                    String a8 = a(context, a6);
                    String b2 = b();
                    synchronized (Looper.getMainLooper()) {
                        du duVar = new du(context);
                        boolean a9 = a(context, a7, b2, a8, duVar);
                        a(duVar, this.f5963b.a(), a7, c2, a9);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public em a(du duVar) {
        try {
            if (this.f5965d == null) {
                this.f5965d = new a(duVar);
            }
        } catch (Throwable unused) {
        }
        return this.f5965d;
    }

    public static String a(Context context, cy cyVar) {
        return fd.a(context, cyVar);
    }

    private String a(Context context, String str) {
        try {
            return cs.e(context, cz.a(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    private void a(du duVar, int i) {
        try {
            a(duVar.a(2, de.a(i)), duVar, i);
        } catch (Throwable th) {
            dd.a(th, "LogProcessor", "processDeleteFail");
        }
    }

    private el b(Context context, String str) {
        el elVar;
        try {
            File file = new File(de.a(context, str));
            if (!file.exists() && !file.mkdirs()) {
                return null;
            }
            elVar = el.a(file, 1, 1, 20480);
            return elVar;
        } catch (IOException e2) {
            dd.a((Throwable) e2, "LogProcessor", "initDiskLru");
            elVar = null;
            return elVar;
        } catch (Throwable th) {
            dd.a(th, "LogProcessor", "initDiskLru");
            elVar = null;
            return elVar;
        }
    }

    private String a(List<? extends dv> list, Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append("{\"pinfo\":\"");
        sb.append(e(context));
        sb.append("\",\"els\":[");
        boolean z = true;
        for (dv b2 : list) {
            String d2 = d(b2.b());
            if (d2 != null && !"".equals(d2)) {
                String str = d2 + "||" + b2.c();
                if (z) {
                    z = false;
                } else {
                    sb.append(",");
                }
                sb.append("{\"log\":\"");
                sb.append(str);
                sb.append("\"}");
            }
        }
        if (z) {
            return null;
        }
        sb.append("]}");
        return sb.toString();
    }

    public static boolean b(String[] strArr, String str) {
        if (strArr == null || str == null) {
            return false;
        }
        try {
            String str2 = str;
            for (String str3 : strArr) {
                str2 = str2.trim();
                if (str2.startsWith("at ")) {
                    if (str2.contains(str3 + ClassUtils.PACKAGE_SEPARATOR) && str2.endsWith(")")) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean a(String[] strArr, String str) {
        if (strArr == null || str == null) {
            return false;
        }
        try {
            for (String trim : str.split("\n")) {
                if (b(strArr, trim.trim())) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    private void a(List<? extends dv> list, du duVar, int i) {
        if (list != null && list.size() > 0) {
            for (dv dvVar : list) {
                if (c(dvVar.b())) {
                    duVar.a(dvVar.b(), dvVar.getClass());
                } else {
                    dvVar.a(2);
                    duVar.b(dvVar);
                }
            }
        }
    }

    private void a(du duVar, String str, String str2, int i, boolean z) {
        dv b2 = de.b(i);
        b2.a(0);
        b2.b(str);
        b2.a(str2);
        duVar.a(b2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x00d1, code lost:
        if (r7.d() == false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x00b5, code lost:
        if (r7.d() == false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0087 A[SYNTHETIC, Splitter:B:59:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x008e A[SYNTHETIC, Splitter:B:63:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00a3 A[SYNTHETIC, Splitter:B:76:0x00a3] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00aa A[SYNTHETIC, Splitter:B:80:0x00aa] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00bf A[SYNTHETIC, Splitter:B:91:0x00bf] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x00c6 A[SYNTHETIC, Splitter:B:95:0x00c6] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, com.amap.api.mapcore2d.du r9) {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
            java.lang.String r5 = com.amap.api.mapcore2d.de.a((android.content.Context) r5, (java.lang.String) r7)     // Catch:{ IOException -> 0x00bb, Throwable -> 0x009f, all -> 0x0082 }
            java.io.File r7 = new java.io.File     // Catch:{ IOException -> 0x00bb, Throwable -> 0x009f, all -> 0x0082 }
            r7.<init>(r5)     // Catch:{ IOException -> 0x00bb, Throwable -> 0x009f, all -> 0x0082 }
            boolean r5 = r7.exists()     // Catch:{ IOException -> 0x00bb, Throwable -> 0x009f, all -> 0x0082 }
            if (r5 != 0) goto L_0x0018
            boolean r5 = r7.mkdirs()     // Catch:{ IOException -> 0x00bb, Throwable -> 0x009f, all -> 0x0082 }
            if (r5 != 0) goto L_0x0018
            return r1
        L_0x0018:
            r2 = 20480(0x5000, double:1.01185E-319)
            r5 = 1
            com.amap.api.mapcore2d.el r7 = com.amap.api.mapcore2d.el.a(r7, r5, r5, r2)     // Catch:{ IOException -> 0x00bb, Throwable -> 0x009f, all -> 0x0082 }
            com.amap.api.mapcore2d.em r9 = r4.a((com.amap.api.mapcore2d.du) r9)     // Catch:{ IOException -> 0x0080, Throwable -> 0x007e, all -> 0x007b }
            r7.a((com.amap.api.mapcore2d.em) r9)     // Catch:{ IOException -> 0x0080, Throwable -> 0x007e, all -> 0x007b }
            com.amap.api.mapcore2d.el$b r9 = r7.a((java.lang.String) r6)     // Catch:{ IOException -> 0x0080, Throwable -> 0x007e, all -> 0x007b }
            if (r9 == 0) goto L_0x003f
            if (r9 == 0) goto L_0x0033
            r9.close()     // Catch:{ Throwable -> 0x0032 }
            goto L_0x0033
        L_0x0032:
        L_0x0033:
            if (r7 == 0) goto L_0x003e
            boolean r5 = r7.d()
            if (r5 != 0) goto L_0x003e
            r7.close()     // Catch:{ Throwable -> 0x003e }
        L_0x003e:
            return r1
        L_0x003f:
            byte[] r8 = com.amap.api.mapcore2d.cz.a((java.lang.String) r8)     // Catch:{ IOException -> 0x0079, Throwable -> 0x0077, all -> 0x0075 }
            com.amap.api.mapcore2d.el$a r6 = r7.b((java.lang.String) r6)     // Catch:{ IOException -> 0x0079, Throwable -> 0x0077, all -> 0x0075 }
            java.io.OutputStream r2 = r6.a((int) r1)     // Catch:{ IOException -> 0x0079, Throwable -> 0x0077, all -> 0x0075 }
            r2.write(r8)     // Catch:{ IOException -> 0x0073, Throwable -> 0x0071, all -> 0x006e }
            r6.a()     // Catch:{ IOException -> 0x0073, Throwable -> 0x0071, all -> 0x006e }
            r7.e()     // Catch:{ IOException -> 0x0073, Throwable -> 0x0071, all -> 0x006e }
            if (r2 == 0) goto L_0x005b
            r2.close()     // Catch:{ Throwable -> 0x005a }
            goto L_0x005b
        L_0x005a:
        L_0x005b:
            if (r9 == 0) goto L_0x0062
            r9.close()     // Catch:{ Throwable -> 0x0061 }
            goto L_0x0062
        L_0x0061:
        L_0x0062:
            if (r7 == 0) goto L_0x006d
            boolean r6 = r7.d()
            if (r6 != 0) goto L_0x006d
            r7.close()     // Catch:{ Throwable -> 0x006d }
        L_0x006d:
            return r5
        L_0x006e:
            r5 = move-exception
            r0 = r2
            goto L_0x0085
        L_0x0071:
            r0 = r2
            goto L_0x00a1
        L_0x0073:
            r0 = r2
            goto L_0x00bd
        L_0x0075:
            r5 = move-exception
            goto L_0x0085
        L_0x0077:
            goto L_0x00a1
        L_0x0079:
            goto L_0x00bd
        L_0x007b:
            r5 = move-exception
            r9 = r0
            goto L_0x0085
        L_0x007e:
            r9 = r0
            goto L_0x00a1
        L_0x0080:
            r9 = r0
            goto L_0x00bd
        L_0x0082:
            r5 = move-exception
            r7 = r0
            r9 = r7
        L_0x0085:
            if (r0 == 0) goto L_0x008c
            r0.close()     // Catch:{ Throwable -> 0x008b }
            goto L_0x008c
        L_0x008b:
        L_0x008c:
            if (r9 == 0) goto L_0x0093
            r9.close()     // Catch:{ Throwable -> 0x0092 }
            goto L_0x0093
        L_0x0092:
        L_0x0093:
            if (r7 == 0) goto L_0x009e
            boolean r6 = r7.d()
            if (r6 != 0) goto L_0x009e
            r7.close()     // Catch:{ Throwable -> 0x009e }
        L_0x009e:
            throw r5
        L_0x009f:
            r7 = r0
            r9 = r7
        L_0x00a1:
            if (r0 == 0) goto L_0x00a8
            r0.close()     // Catch:{ Throwable -> 0x00a7 }
            goto L_0x00a8
        L_0x00a7:
        L_0x00a8:
            if (r9 == 0) goto L_0x00af
            r9.close()     // Catch:{ Throwable -> 0x00ae }
            goto L_0x00af
        L_0x00ae:
        L_0x00af:
            if (r7 == 0) goto L_0x00d4
            boolean r5 = r7.d()
            if (r5 != 0) goto L_0x00d4
        L_0x00b7:
            r7.close()     // Catch:{ Throwable -> 0x00d4 }
            goto L_0x00d4
        L_0x00bb:
            r7 = r0
            r9 = r7
        L_0x00bd:
            if (r0 == 0) goto L_0x00c4
            r0.close()     // Catch:{ Throwable -> 0x00c3 }
            goto L_0x00c4
        L_0x00c3:
        L_0x00c4:
            if (r9 == 0) goto L_0x00cb
            r9.close()     // Catch:{ Throwable -> 0x00ca }
            goto L_0x00cb
        L_0x00ca:
        L_0x00cb:
            if (r7 == 0) goto L_0x00d4
            boolean r5 = r7.d()
            if (r5 != 0) goto L_0x00d4
            goto L_0x00b7
        L_0x00d4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.dk.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.amap.api.mapcore2d.du):boolean");
    }
}
