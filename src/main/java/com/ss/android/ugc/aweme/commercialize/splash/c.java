package com.ss.android.ugc.aweme.commercialize.splash;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.thermometer.annotation.MeasureFunction;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39451a;

    /* renamed from: b  reason: collision with root package name */
    static final long f39452b = TimeUnit.DAYS.toMillis(3);

    /* renamed from: c  reason: collision with root package name */
    static final long f39453c = TimeUnit.DAYS.toMillis(14);

    /* renamed from: e  reason: collision with root package name */
    static String f39454e;
    private static String i;
    private static String j = "awemes.json";

    /* renamed from: d  reason: collision with root package name */
    public SharedPreferences f39455d;

    /* renamed from: f  reason: collision with root package name */
    long f39456f;
    private Gson g = new Gson();
    private volatile Map<String, Aweme> h;

    /* access modifiers changed from: package-private */
    public Map<String, Aweme> a() {
        if (PatchProxy.isSupport(new Object[0], this, f39451a, false, 31993, new Class[0], Map.class)) {
            return (Map) PatchProxy.accessDispatch(new Object[0], this, f39451a, false, 31993, new Class[0], Map.class);
        }
        if (this.h == null) {
            synchronized (c.class) {
                if (this.h == null) {
                    this.h = d();
                }
            }
        }
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f39451a, false, 32010, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f39451a, false, 32010, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f39455d != null) {
            return this.f39455d.getBoolean("awesome_splash_filter_enable", false);
        } else {
            return false;
        }
    }

    private String e() {
        if (PatchProxy.isSupport(new Object[0], this, f39451a, false, 32000, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f39451a, false, 32000, new Class[0], String.class);
        }
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(i + j)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0077 A[Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }] */
    @com.ss.android.ugc.thermometer.annotation.MeasureFunction
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme> d() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f39451a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.util.Map> r7 = java.util.Map.class
            r4 = 0
            r5 = 31996(0x7cfc, float:4.4836E-41)
            r2 = r11
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0026
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f39451a
            r5 = 0
            r6 = 31996(0x7cfc, float:4.4836E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.util.Map> r8 = java.util.Map.class
            r3 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.util.Map r0 = (java.util.Map) r0
            return r0
        L_0x0026:
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }
            com.meituan.robust.ChangeQuickRedirect r4 = f39451a     // Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }
            r5 = 0
            r6 = 31999(0x7cff, float:4.484E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = r11
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }
            r3 = 0
            if (r2 == 0) goto L_0x0052
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }
            com.meituan.robust.ChangeQuickRedirect r6 = f39451a     // Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }
            r7 = 0
            r8 = 31999(0x7cff, float:4.484E-41)
            java.lang.Class[] r9 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r5 = r11
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }
            r3 = r0
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }
            goto L_0x0070
        L_0x0052:
            java.lang.String r0 = r11.e()     // Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }
            if (r2 != 0) goto L_0x005d
            goto L_0x0071
        L_0x005d:
            android.content.SharedPreferences r0 = r11.f39455d     // Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }
            if (r0 == 0) goto L_0x0070
            android.content.SharedPreferences r0 = r11.f39455d     // Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }
            java.lang.String r2 = "awesome_splash_info"
            java.lang.String r0 = r0.getString(r2, r3)     // Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }
            if (r2 != 0) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r0 = r3
        L_0x0071:
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }
            if (r2 != 0) goto L_0x00d0
            com.google.gson.Gson r2 = r11.g     // Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }
            com.ss.android.ugc.aweme.commercialize.splash.c$1 r3 = new com.ss.android.ugc.aweme.commercialize.splash.c$1     // Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }
            r3.<init>()     // Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }
            java.lang.reflect.Type r3 = r3.getType()     // Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }
            java.lang.Object r0 = r2.fromJson((java.lang.String) r0, (java.lang.reflect.Type) r3)     // Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }
            if (r0 == 0) goto L_0x0095
            int r2 = r0.size()     // Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }
            if (r2 != 0) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            r1.putAll(r0)     // Catch:{ Exception -> 0x00d0, OutOfMemoryError -> 0x0096 }
            goto L_0x00d0
        L_0x0095:
            return r1
        L_0x0096:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "AwesomeSplash OutOfMemoryError:"
            r2.<init>(r3)
            java.lang.String r3 = r0.toString()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.ss.android.ugc.aweme.util.c.a(r2)
            com.ss.android.ugc.aweme.framework.a.a.a((java.lang.Throwable) r0)
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = i
            r2.append(r3)
            java.lang.String r3 = j
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L_0x00d0
            r0.delete()
        L_0x00d0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.splash.c.d():java.util.Map");
    }

    /* access modifiers changed from: package-private */
    public void b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f39451a, false, 32007, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f39451a, false, 32007, new Class[0], Void.TYPE);
            return;
        }
        File file = new File(i);
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(i + j);
        try {
            if (!file2.exists()) {
                file2.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
            bufferedWriter.write(this.g.toJson((Object) a(), new TypeToken<Map<String, Aweme>>() {
            }.getType()));
            bufferedWriter.close();
            z = true;
        } catch (IOException unused) {
        } catch (OutOfMemoryError e2) {
            com.ss.android.ugc.aweme.util.c.a("AwesomeSplash OutOfMemoryError:" + e2.toString());
            a.a((Throwable) e2);
        }
        if (z && this.f39455d != null) {
            this.f39455d.edit().remove("awesome_splash_info").apply();
        }
    }

    c(String str) {
        k a2 = k.a();
        f39454e = str;
        i = f39454e + "awemeJson/";
        this.f39455d = com.ss.android.ugc.aweme.q.c.a(a2, "awesome_splash", 0);
    }

    @MeasureFunction
    public final Aweme a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f39451a, false, 31994, new Class[]{String.class}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{str2}, this, f39451a, false, 31994, new Class[]{String.class}, Aweme.class);
        }
        Aweme aweme = a().get(str2);
        if (com.ss.android.ugc.aweme.commercialize.utils.c.W(aweme)) {
            aweme = null;
        }
        return aweme;
    }

    /* access modifiers changed from: package-private */
    @MeasureFunction
    public final Aweme b(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f39451a, false, 31995, new Class[]{String.class}, Aweme.class)) {
            return a().get(str2);
        }
        return (Aweme) PatchProxy.accessDispatch(new Object[]{str2}, this, f39451a, false, 31995, new Class[]{String.class}, Aweme.class);
    }

    /* access modifiers changed from: package-private */
    public boolean c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f39451a, false, 32005, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f39451a, false, 32005, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        for (Map.Entry<String, Aweme> value : a().entrySet()) {
            Aweme aweme = (Aweme) value.getValue();
            if (aweme != null && TextUtils.equals(aweme.getAid(), str2)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean d(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f39451a, false, 32008, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f39451a, false, 32008, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        for (String str3 : a().keySet()) {
            Aweme aweme = a().get(str3);
            if (aweme != null && TextUtils.equals(str2, aweme.getAid()) && !com.ss.android.ugc.aweme.commercialize.utils.c.W(aweme)) {
                return false;
            }
        }
        return true;
    }
}
