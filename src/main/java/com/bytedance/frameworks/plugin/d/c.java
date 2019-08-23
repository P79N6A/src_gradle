package com.bytedance.frameworks.plugin.d;

import android.content.pm.PackageInfo;
import android.os.Build;
import com.bytedance.frameworks.plugin.b.f;
import com.bytedance.frameworks.plugin.d.d;
import com.bytedance.frameworks.plugin.e;
import dalvik.system.DexFile;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class c {

    /* renamed from: b  reason: collision with root package name */
    private static final String f2228b = "c";

    /* renamed from: a  reason: collision with root package name */
    public d.a f2229a;

    public static class a extends IOException {
        public a(String str) {
            super(str);
        }

        public a(String str, Throwable th) {
            super(str, th);
        }
    }

    c() {
    }

    private static void a(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            try {
                if (f.b(e.a())) {
                    DexFile.loadDex(str, null, 0).close();
                }
            } catch (Exception unused) {
            }
        }
    }

    private static void b(a aVar) throws a {
        try {
            PackageInfo packageInfo = e.a().getPackageManager().getPackageInfo(e.a().getPackageName(), 4096);
            PackageInfo packageArchiveInfo = e.a().getPackageManager().getPackageArchiveInfo(aVar.f2216c.getAbsolutePath(), 4096);
            List asList = Arrays.asList(packageInfo.requestedPermissions);
            if (packageArchiveInfo.requestedPermissions != null && packageArchiveInfo.requestedPermissions.length > 0) {
                String[] strArr = packageArchiveInfo.requestedPermissions;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    if (asList.contains(strArr[i])) {
                        i++;
                    } else {
                        throw new a("安装包权限校验失败");
                    }
                }
            }
        } catch (Exception e2) {
            com.bytedance.frameworks.plugin.f.a(aVar.f2214a, aVar.f2215b, 12002);
            throw new a("安装包权限校验失败", e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01e3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01e4, code lost:
        com.bytedance.frameworks.plugin.f.g.a(f2228b, "Install plugin " + r12.f2214a + " failed", r1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01e3 A[ExcHandler: a (r1v0 'e' com.bytedance.frameworks.plugin.d.c$a A[CUSTOM_DECLARE]), Splitter:B:1:0x0001] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.bytedance.frameworks.plugin.d.a r12) {
        /*
            r11 = this;
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r2 = "PluginInstaller-"
            r1.<init>(r2)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r2 = r12.f2214a     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            r1.append(r2)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r1 = r1.toString()     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            com.bytedance.frameworks.plugin.f.m r1 = com.bytedance.frameworks.plugin.f.m.a(r1)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r2 = r12.f2214a     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            int r3 = r12.f2215b     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            r4 = 10000(0x2710, float:1.4013E-41)
            com.bytedance.frameworks.plugin.f.a(r2, r3, r4)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r2 = r12.f2214a     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            int r3 = r12.f2215b     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            r4 = 2
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            r5[r0] = r2     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r6 = "version-"
            r2.<init>(r6)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            r2.append(r3)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r2 = r2.toString()     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            r3 = 1
            r5[r3] = r2     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r2 = com.bytedance.frameworks.plugin.b.e.a((java.lang.String[]) r5)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            com.bytedance.frameworks.plugin.f.d.a((java.lang.String) r2)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r2 = "cleanDir"
            r1.b(r2)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.io.File r2 = r12.f2216c     // Catch:{ Exception -> 0x01a5, a -> 0x01e3 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ Exception -> 0x01a5, a -> 0x01e3 }
            boolean r2 = com.bytedance.frameworks.plugin.f.i.a(r2)     // Catch:{ Exception -> 0x01a5, a -> 0x01e3 }
            if (r2 == 0) goto L_0x019d
            java.lang.String r2 = "checkSignature"
            r1.b(r2)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            b(r12)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r2 = "checkPermissions"
            r1.b(r2)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r2 = r12.f2214a     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            int r5 = r12.f2215b     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r2 = com.bytedance.frameworks.plugin.b.e.a(r2, r5)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.io.File r5 = r12.f2216c     // Catch:{ Exception -> 0x018b, a -> 0x01e3 }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x018b, a -> 0x01e3 }
            com.bytedance.frameworks.plugin.f.f.a((java.lang.String) r5, (java.lang.String) r2)     // Catch:{ Exception -> 0x018b, a -> 0x01e3 }
            java.lang.String r2 = "copyApk"
            r1.b(r2)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r2 = r12.f2214a     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            int r5 = r12.f2215b     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r2 = com.bytedance.frameworks.plugin.b.e.a(r2, r5)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r5 = r12.f2214a     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            int r6 = r12.f2215b     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r5 = com.bytedance.frameworks.plugin.b.e.c(r5, r6)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x0174, a -> 0x01e3 }
            r6.<init>(r2)     // Catch:{ Exception -> 0x0174, a -> 0x01e3 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0174, a -> 0x01e3 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0174, a -> 0x01e3 }
            com.bytedance.frameworks.plugin.b.d.a((java.io.File) r6, (java.io.File) r2)     // Catch:{ Exception -> 0x0174, a -> 0x01e3 }
            java.lang.String r2 = "copySo"
            r1.b(r2)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r2 = "multiDex"
            r1.b(r2)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            com.bytedance.frameworks.plugin.d.d$a r2 = r11.f2229a     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            if (r2 == 0) goto L_0x00b5
            com.bytedance.frameworks.plugin.d.b r2 = com.bytedance.frameworks.plugin.d.b.a()     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r5 = r12.f2214a     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            r2.a(r5)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r2 = r12.f2214a     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            int r5 = r12.f2215b     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            com.bytedance.frameworks.plugin.b.e.a(r2, r5)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r2 = r12.f2214a     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            int r5 = r12.f2215b     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            com.bytedance.frameworks.plugin.b.e.b(r2, r5)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
        L_0x00b5:
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r2 = r12.f2214a     // Catch:{ Exception -> 0x0162, a -> 0x01e3 }
            int r7 = r12.f2215b     // Catch:{ Exception -> 0x0162, a -> 0x01e3 }
            java.lang.String r2 = com.bytedance.frameworks.plugin.b.e.b(r2, r7)     // Catch:{ Exception -> 0x0162, a -> 0x01e3 }
            java.lang.String r7 = r12.f2214a     // Catch:{ Exception -> 0x0162, a -> 0x01e3 }
            int r8 = r12.f2215b     // Catch:{ Exception -> 0x0162, a -> 0x01e3 }
            java.lang.String r7 = com.bytedance.frameworks.plugin.b.e.c(r7, r8)     // Catch:{ Exception -> 0x0162, a -> 0x01e3 }
            java.io.File r8 = r12.f2216c     // Catch:{ Exception -> 0x0162, a -> 0x01e3 }
            java.lang.String r8 = r8.getAbsolutePath()     // Catch:{ Exception -> 0x0162, a -> 0x01e3 }
            a((java.lang.String) r8)     // Catch:{ Exception -> 0x0162, a -> 0x01e3 }
            java.lang.String r8 = r12.f2214a     // Catch:{ Exception -> 0x0162, a -> 0x01e3 }
            int r9 = r12.f2215b     // Catch:{ Exception -> 0x0162, a -> 0x01e3 }
            java.lang.String r8 = com.bytedance.frameworks.plugin.b.e.a(r8, r9)     // Catch:{ Exception -> 0x0162, a -> 0x01e3 }
            com.bytedance.frameworks.plugin.core.f r9 = new com.bytedance.frameworks.plugin.core.f     // Catch:{ Exception -> 0x0162, a -> 0x01e3 }
            java.lang.ClassLoader r10 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ Exception -> 0x0162, a -> 0x01e3 }
            r9.<init>(r8, r2, r7, r10)     // Catch:{ Exception -> 0x0162, a -> 0x01e3 }
            com.bytedance.frameworks.plugin.d.b r2 = com.bytedance.frameworks.plugin.d.b.a()     // Catch:{ Exception -> 0x0162, a -> 0x01e3 }
            java.lang.String r7 = r12.f2214a     // Catch:{ Exception -> 0x0162, a -> 0x01e3 }
            com.bytedance.frameworks.plugin.a.b r2 = r2.a(r7)     // Catch:{ Exception -> 0x0162, a -> 0x01e3 }
            if (r2 == 0) goto L_0x00fc
            java.lang.String r7 = r2.i     // Catch:{ Exception -> 0x0162, a -> 0x01e3 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x0162, a -> 0x01e3 }
            if (r7 != 0) goto L_0x00fc
            java.lang.String r2 = r2.i     // Catch:{ Exception -> 0x0162, a -> 0x01e3 }
            r9.loadClass(r2)     // Catch:{ Exception -> 0x0162, a -> 0x01e3 }
        L_0x00fc:
            java.lang.String r2 = "dexOpt: pluginName: %s, dexOpt:%d"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r7 = r12.f2214a     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            r4[r0] = r7     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            r9 = 0
            long r7 = r7 - r5
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            r4[r3] = r5     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r2 = java.lang.String.format(r2, r4)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            com.bytedance.frameworks.plugin.f.g.c(r2)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r2 = "dexOpt"
            r1.b(r2)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.io.File r2 = r12.f2216c     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            com.bytedance.frameworks.plugin.f.d.a((java.io.File) r2)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r2 = "cleanPluginApk"
            r1.b(r2)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            r2.<init>()     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r4 = "INSTALL_DURATION"
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            long r7 = r1.f2266a     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            r1 = 0
            long r5 = r5 - r7
            java.lang.Long r1 = java.lang.Long.valueOf(r5)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            r2.put(r4, r1)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r1 = r12.f2214a     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            int r4 = r12.f2215b     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            r5 = 11000(0x2af8, float:1.5414E-41)
            com.bytedance.frameworks.plugin.f.a(r1, r4, r5, r2)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r2 = "Install plugin "
            r1.<init>(r2)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r2 = r12.f2214a     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            r1.append(r2)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r2 = " success"
            r1.append(r2)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r1 = r1.toString()     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            boolean r2 = com.bytedance.frameworks.plugin.f.g.f2259a     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            if (r2 == 0) goto L_0x0161
            com.bytedance.frameworks.plugin.f.g.d(r1)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
        L_0x0161:
            return r3
        L_0x0162:
            r1 = move-exception
            java.lang.String r2 = r12.f2214a     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            int r3 = r12.f2215b     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            r4 = 12006(0x2ee6, float:1.6824E-41)
            com.bytedance.frameworks.plugin.f.a(r2, r3, r4)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            com.bytedance.frameworks.plugin.d.c$a r2 = new com.bytedance.frameworks.plugin.d.c$a     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r3 = "dexOpt失败"
            r2.<init>(r3, r1)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            throw r2     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
        L_0x0174:
            r1 = move-exception
            java.lang.String r2 = "NativeLibCopyHelper copy so failed."
            com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r2, (java.lang.Throwable) r1)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r1 = r12.f2214a     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            int r2 = r12.f2215b     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            r3 = 12004(0x2ee4, float:1.6821E-41)
            com.bytedance.frameworks.plugin.f.a(r1, r2, r3)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            com.bytedance.frameworks.plugin.d.c$a r1 = new com.bytedance.frameworks.plugin.d.c$a     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r2 = "安装包动态库拷贝失败"
            r1.<init>(r2)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            throw r1     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
        L_0x018b:
            r1 = move-exception
            java.lang.String r2 = r12.f2214a     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            int r3 = r12.f2215b     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            r4 = 12003(0x2ee3, float:1.682E-41)
            com.bytedance.frameworks.plugin.f.a(r2, r3, r4)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            com.bytedance.frameworks.plugin.d.c$a r2 = new com.bytedance.frameworks.plugin.d.c$a     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r3 = "安装包拷贝失败"
            r2.<init>(r3, r1)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            throw r2     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
        L_0x019d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x01a5, a -> 0x01e3 }
            java.lang.String r2 = "安装包签名校验失败"
            r1.<init>(r2)     // Catch:{ Exception -> 0x01a5, a -> 0x01e3 }
            throw r1     // Catch:{ Exception -> 0x01a5, a -> 0x01e3 }
        L_0x01a5:
            r1 = move-exception
            java.lang.String r2 = r12.f2214a     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            int r3 = r12.f2215b     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            r4 = 12001(0x2ee1, float:1.6817E-41)
            com.bytedance.frameworks.plugin.f.a(r2, r3, r4)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            com.bytedance.frameworks.plugin.d.c$a r2 = new com.bytedance.frameworks.plugin.d.c$a     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            java.lang.String r3 = r1.getMessage()     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            r2.<init>(r3, r1)     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
            throw r2     // Catch:{ a -> 0x01e3, Exception -> 0x01b9 }
        L_0x01b9:
            r1 = move-exception
            java.lang.String r2 = f2228b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Install plugin "
            r3.<init>(r4)
            java.lang.String r4 = r12.f2214a
            r3.append(r4)
            java.lang.String r4 = " unknown error."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.bytedance.frameworks.plugin.f.g.a(r2, r3, r1)
            java.lang.String r2 = r12.f2214a
            int r12 = r12.f2215b
            r3 = 12000(0x2ee0, float:1.6816E-41)
            r4 = 0
            java.lang.String r1 = com.bytedance.frameworks.plugin.f.c.a(r1)
            com.bytedance.frameworks.plugin.f.a(r2, r12, r3, r4, r1)
            goto L_0x01fe
        L_0x01e3:
            r1 = move-exception
            java.lang.String r2 = f2228b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Install plugin "
            r3.<init>(r4)
            java.lang.String r12 = r12.f2214a
            r3.append(r12)
            java.lang.String r12 = " failed"
            r3.append(r12)
            java.lang.String r12 = r3.toString()
            com.bytedance.frameworks.plugin.f.g.a(r2, r12, r1)
        L_0x01fe:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.d.c.a(com.bytedance.frameworks.plugin.d.a):boolean");
    }
}
