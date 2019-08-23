package com.bytedance.frameworks.plugin.d;

import android.content.SharedPreferences;
import com.bytedance.common.utility.android.ManifestData;
import com.bytedance.frameworks.plugin.a.b;
import com.bytedance.frameworks.plugin.b.f;
import com.bytedance.frameworks.plugin.core.d;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.f.g;
import com.bytedance.frameworks.plugin.f.m;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class b {

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f2218c;

    /* renamed from: a  reason: collision with root package name */
    public Set<String> f2219a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private volatile Map<String, com.bytedance.frameworks.plugin.a.b> f2220b;

    /* renamed from: d  reason: collision with root package name */
    private int f2221d = -1;

    public static b a() {
        if (f2218c == null) {
            synchronized (b.class) {
                if (f2218c == null) {
                    f2218c = new b();
                }
            }
        }
        return f2218c;
    }

    public final List<com.bytedance.frameworks.plugin.a.b> c() {
        if (this.f2220b == null) {
            e();
        }
        return new ArrayList(this.f2220b.values());
    }

    public final void b() {
        this.f2221d = ManifestData.getInt(e.a(), "UPDATE_VERSION_CODE");
        g.a("PluginAttributeManager", "updateVersionCode=" + this.f2221d);
        m a2 = m.a("PluginAttributeManager");
        e();
        a2.b("parseConf");
        d();
        a2.b("loadInstallState");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x01a7 A[Catch:{ Exception -> 0x01b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01ac A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void e() {
        /*
            r10 = this;
            monitor-enter(r10)
            android.content.Context r0 = com.bytedance.frameworks.plugin.e.a()     // Catch:{ Exception -> 0x01c0 }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r1 = "plugins.json"
            java.io.InputStream r0 = r0.open(r1)     // Catch:{ Exception -> 0x01c0 }
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x01c0 }
            r1.<init>()     // Catch:{ Exception -> 0x01c0 }
            com.bytedance.frameworks.plugin.f.f.a((java.io.InputStream) r0, (java.io.OutputStream) r1)     // Catch:{ Exception -> 0x01c0 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x01c0 }
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ Exception -> 0x01b4 }
            r1.<init>()     // Catch:{ Exception -> 0x01b4 }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Exception -> 0x01b4 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x01b4 }
            r0 = 0
            r3 = 0
        L_0x0027:
            int r4 = r2.length()     // Catch:{ Exception -> 0x01b4 }
            if (r3 >= r4) goto L_0x01b0
            org.json.JSONObject r4 = r2.optJSONObject(r3)     // Catch:{ Exception -> 0x01b4 }
            if (r4 == 0) goto L_0x01ac
            com.bytedance.frameworks.plugin.a.b r5 = new com.bytedance.frameworks.plugin.a.b     // Catch:{ Exception -> 0x01b4 }
            r5.<init>()     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = "packageName"
            java.lang.String r6 = r4.optString(r6)     // Catch:{ Exception -> 0x01b4 }
            r5.f2145a = r6     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = "pluginName"
            java.lang.String r6 = r4.optString(r6)     // Catch:{ Exception -> 0x01b4 }
            r5.f2149e = r6     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = "pluginType"
            int r6 = r4.optInt(r6)     // Catch:{ Exception -> 0x01b4 }
            r5.f2150f = r6     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = "shareRes"
            r7 = 1
            boolean r6 = r4.optBoolean(r6, r7)     // Catch:{ Exception -> 0x01b4 }
            r5.g = r6     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = "standalone"
            boolean r6 = r4.optBoolean(r6, r0)     // Catch:{ Exception -> 0x01b4 }
            r5.h = r6     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = "classToVerify"
            java.lang.String r6 = r4.optString(r6)     // Catch:{ Exception -> 0x01b4 }
            r5.i = r6     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = "internalPluginMD5"
            java.lang.String r6 = r4.optString(r6)     // Catch:{ Exception -> 0x01b4 }
            r5.m = r6     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = "internalPluginVersion"
            int r6 = r4.optInt(r6)     // Catch:{ Exception -> 0x01b4 }
            r5.n = r6     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = "loadSign"
            int r6 = r4.optInt(r6)     // Catch:{ Exception -> 0x01b4 }
            if (r6 != r7) goto L_0x0084
            com.bytedance.frameworks.plugin.a.b$b r6 = com.bytedance.frameworks.plugin.a.b.C0011b.RIGHTNOW     // Catch:{ Exception -> 0x01b4 }
            goto L_0x0086
        L_0x0084:
            com.bytedance.frameworks.plugin.a.b$b r6 = com.bytedance.frameworks.plugin.a.b.C0011b.LAZY     // Catch:{ Exception -> 0x01b4 }
        L_0x0086:
            r5.r = r6     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = "routerModuleName"
            java.lang.String r6 = r4.optString(r6)     // Catch:{ Exception -> 0x01b4 }
            r5.p = r6     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = "routerRegExp"
            java.lang.String r6 = r4.optString(r6)     // Catch:{ Exception -> 0x01b4 }
            r5.q = r6     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = "minVersionCode"
            int r6 = r4.optInt(r6, r0)     // Catch:{ Exception -> 0x01b4 }
            r5.k = r6     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = "maxVersionCode"
            r8 = 2147483647(0x7fffffff, float:NaN)
            int r6 = r4.optInt(r6, r8)     // Catch:{ Exception -> 0x01b4 }
            r5.l = r6     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = "_isMiraInternalPluginSwitcher"
            boolean r6 = r4.optBoolean(r6, r0)     // Catch:{ Exception -> 0x01b4 }
            r5.u = r6     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = "loadAsHostClass"
            boolean r6 = r4.optBoolean(r6, r0)     // Catch:{ Exception -> 0x01b4 }
            r5.f2147c = r6     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = "disabledInDebug"
            boolean r6 = r4.optBoolean(r6, r0)     // Catch:{ Exception -> 0x01b4 }
            r5.f2148d = r6     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = "extraPackages"
            org.json.JSONArray r4 = r4.optJSONArray(r6)     // Catch:{ Exception -> 0x01b4 }
            if (r4 == 0) goto L_0x00de
            r6 = 0
        L_0x00cc:
            int r8 = r4.length()     // Catch:{ Exception -> 0x01b4 }
            if (r6 >= r8) goto L_0x00de
            java.util.List<java.lang.String> r8 = r5.j     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r9 = r4.getString(r6)     // Catch:{ Exception -> 0x01b4 }
            r8.add(r9)     // Catch:{ Exception -> 0x01b4 }
            int r6 = r6 + 1
            goto L_0x00cc
        L_0x00de:
            java.lang.String r4 = r5.f2145a     // Catch:{ Exception -> 0x01b4 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x01b4 }
            if (r4 == 0) goto L_0x00f0
            java.lang.String r4 = "PluginAttributeManager"
            java.lang.String r6 = "pluginAttribute missing mPackageName."
            com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r4, (java.lang.String) r6)     // Catch:{ Exception -> 0x01b4 }
        L_0x00ed:
            r7 = 0
            goto L_0x01a5
        L_0x00f0:
            int r4 = r5.f2150f     // Catch:{ Exception -> 0x01b4 }
            if (r4 == r7) goto L_0x0114
            int r4 = r5.f2150f     // Catch:{ Exception -> 0x01b4 }
            r6 = 2
            if (r4 == r6) goto L_0x0114
            java.lang.String r4 = "PluginAttributeManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r7 = "pluginAttribute "
            r6.<init>(r7)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r7 = r5.f2145a     // Catch:{ Exception -> 0x01b4 }
            r6.append(r7)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r7 = " invalid. must be 1 or 2."
            r6.append(r7)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x01b4 }
            com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r4, (java.lang.String) r6)     // Catch:{ Exception -> 0x01b4 }
            goto L_0x00ed
        L_0x0114:
            int r4 = r5.f2150f     // Catch:{ Exception -> 0x01b4 }
            if (r4 != r7) goto L_0x01a5
            boolean r4 = r5.u     // Catch:{ Exception -> 0x01b4 }
            if (r4 != 0) goto L_0x013e
            java.lang.String r4 = "PluginAttributeManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r7 = "pluginAttribute "
            r6.<init>(r7)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r7 = r5.f2145a     // Catch:{ Exception -> 0x01b4 }
            r6.append(r7)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r7 = " not being built as plugin but as a host module."
            r6.append(r7)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x01b4 }
            com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r4, (java.lang.String) r6)     // Catch:{ Exception -> 0x01b4 }
            java.util.Set<java.lang.String> r4 = r10.f2219a     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = r5.f2145a     // Catch:{ Exception -> 0x01b4 }
            r4.add(r6)     // Catch:{ Exception -> 0x01b4 }
            goto L_0x00ed
        L_0x013e:
            int r4 = r5.n     // Catch:{ Exception -> 0x01b4 }
            if (r4 > 0) goto L_0x015d
            java.lang.String r4 = "PluginAttributeManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r7 = "pluginAttribute "
            r6.<init>(r7)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r7 = r5.f2145a     // Catch:{ Exception -> 0x01b4 }
            r6.append(r7)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r7 = " invalid. missing internalPluginVersion."
            r6.append(r7)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x01b4 }
            com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r4, (java.lang.String) r6)     // Catch:{ Exception -> 0x01b4 }
            goto L_0x00ed
        L_0x015d:
            java.lang.String r4 = r5.m     // Catch:{ Exception -> 0x01b4 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x01b4 }
            if (r4 == 0) goto L_0x0181
            java.lang.String r4 = "PluginAttributeManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r7 = "pluginAttribute "
            r6.<init>(r7)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r7 = r5.f2145a     // Catch:{ Exception -> 0x01b4 }
            r6.append(r7)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r7 = " invalid. missing internalPluginMD5."
            r6.append(r7)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x01b4 }
            com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r4, (java.lang.String) r6)     // Catch:{ Exception -> 0x01b4 }
            goto L_0x00ed
        L_0x0181:
            java.lang.String r4 = r5.f2149e     // Catch:{ Exception -> 0x01b4 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x01b4 }
            if (r4 == 0) goto L_0x01a5
            java.lang.String r4 = "PluginAttributeManager"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r7 = "pluginAttribute "
            r6.<init>(r7)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r7 = r5.f2145a     // Catch:{ Exception -> 0x01b4 }
            r6.append(r7)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r7 = " invalid. missing pluginName."
            r6.append(r7)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x01b4 }
            com.bytedance.frameworks.plugin.f.g.a((java.lang.String) r4, (java.lang.String) r6)     // Catch:{ Exception -> 0x01b4 }
            goto L_0x00ed
        L_0x01a5:
            if (r7 == 0) goto L_0x01ac
            java.lang.String r4 = r5.f2145a     // Catch:{ Exception -> 0x01b4 }
            r1.put(r4, r5)     // Catch:{ Exception -> 0x01b4 }
        L_0x01ac:
            int r3 = r3 + 1
            goto L_0x0027
        L_0x01b0:
            r10.f2220b = r1     // Catch:{ Exception -> 0x01b4 }
            monitor-exit(r10)
            return
        L_0x01b4:
            r0 = move-exception
            java.lang.String r1 = "PluginAttributeManager"
            java.lang.String r2 = "parseConf plugins.conf error"
            com.bytedance.frameworks.plugin.f.g.b(r1, r2, r0)     // Catch:{ all -> 0x01be }
            monitor-exit(r10)
            return
        L_0x01be:
            r0 = move-exception
            goto L_0x01c9
        L_0x01c0:
            java.lang.String r0 = "PluginAttributeManager"
            java.lang.String r1 = "open plugins.conf failed."
            com.bytedance.frameworks.plugin.f.g.b((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ all -> 0x01be }
            monitor-exit(r10)
            return
        L_0x01c9:
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.plugin.d.b.e():void");
    }

    private void d() {
        int i;
        boolean z;
        for (final com.bytedance.frameworks.plugin.a.b next : c()) {
            final String str = next.f2145a;
            int i2 = 0;
            if (f.b(e.a())) {
                if (d.a().f2195a.getBoolean("DELETED_" + str, false)) {
                    SharedPreferences.Editor edit = d.a().f2195a.edit();
                    edit.remove("DELETED_" + str);
                    edit.apply();
                    String a2 = com.bytedance.frameworks.plugin.b.e.a(str);
                    new File(a2).listFiles(new FileFilter() {
                        public final boolean accept(File file) {
                            if (file.getName().matches("^version-(\\d+)$")) {
                                d.a().a(str, Integer.parseInt(file.getName().split("-")[1]), false);
                            }
                            return false;
                        }
                    });
                    com.bytedance.frameworks.plugin.f.d.a(a2);
                }
            }
            String a3 = com.bytedance.frameworks.plugin.b.e.a(next.f2145a);
            File[] listFiles = new File(a3).listFiles(new FileFilter() {
                public final boolean accept(File file) {
                    if (file == null || !file.getName().matches("^version-(\\d+)$")) {
                        return false;
                    }
                    return true;
                }
            });
            if (listFiles == null || listFiles.length <= 0) {
                z = false;
                i = 0;
            } else {
                i = 0;
                for (File name : listFiles) {
                    int parseInt = Integer.parseInt(name.getName().split("-")[1]);
                    if (parseInt > i) {
                        if (d.a().f2195a.getBoolean(String.format("%s-%d", new Object[]{next.f2145a, Integer.valueOf(parseInt)}), false) && new File(com.bytedance.frameworks.plugin.b.e.a(next.f2145a, parseInt)).exists()) {
                            i = parseInt;
                        }
                    }
                }
                g.b(String.format("%s load maxVersion=%s", new Object[]{next.f2145a, Integer.valueOf(i)}));
                if (i > 0 && i >= next.k && i <= next.l) {
                    if (next.f2150f == 1) {
                        if (i < next.n) {
                            g.b(String.format("%s installed version miss match. maxVersion=%s . mInternalPluginVersion=%s", new Object[]{next.f2145a, Integer.valueOf(i), Integer.valueOf(next.n)}));
                        } else if (i == next.n) {
                            String a4 = d.a().a(next.f2145a);
                            if (!next.m.equalsIgnoreCase(a4)) {
                                g.b(String.format("%s installed md5 miss match. md5=%s . mInternalPluginMD5=%s", new Object[]{next.f2145a, a4, next.m}));
                            }
                        }
                    }
                    z = true;
                }
                z = false;
            }
            if (z && this.f2221d != -1) {
                d a5 = d.a();
                String str2 = next.f2145a;
                int i3 = a5.f2195a.getInt("HOST_MIN_" + str2 + "_" + i, 0);
                d a6 = d.a();
                String str3 = next.f2145a;
                int i4 = a6.f2195a.getInt("HOST_MAX_" + str3 + "_" + i, Integer.MAX_VALUE);
                if (i4 == 0) {
                    i4 = Integer.MAX_VALUE;
                }
                if (i3 > this.f2221d || i4 < this.f2221d) {
                    g.a("PluginAttributeManager", String.format("plugin %s[version=%s] is not compatible with host[update_version_code=%s]. hostCompatibleVersion=[%s,%s]", new Object[]{next.f2145a, Integer.valueOf(next.f2146b), Integer.valueOf(this.f2221d), Integer.valueOf(i3), Integer.valueOf(i4)}));
                    z = false;
                } else {
                    g.b(String.format("plugin %s[version=%s] is compatible with host[update_version_code=%s]. hostCompatibleVersion=[%s,%s]", new Object[]{next.f2145a, Integer.valueOf(next.f2146b), Integer.valueOf(this.f2221d), Integer.valueOf(i3), Integer.valueOf(i4)}));
                }
            }
            if (z) {
                next.f2146b = i;
                next.o = b.a.INSTALLED;
                g.b(String.format("plugin %s init as installed. version=%s", new Object[]{next.f2145a, Integer.valueOf(next.f2146b)}));
                i2 = i;
            } else if (next.f2150f == 1 && f.b(e.a()) && a(next, false) == null) {
                a(next, true);
            }
            if (f.b(e.a())) {
                final String str4 = "version-" + i2;
                new File(a3).listFiles(new FileFilter() {
                    public final boolean accept(File file) {
                        if (file != null && !str4.equals(file.getName()) && !"data".equals(file.getName())) {
                            g.b("deleting old plugin dir = " + file.getAbsolutePath());
                            com.bytedance.frameworks.plugin.f.d.a(file.getAbsolutePath());
                            if (file.getName().matches("^version-(\\d+)$")) {
                                d.a().a(next.f2145a, Integer.parseInt(file.getName().split("-")[1]), false);
                            }
                        }
                        return false;
                    }
                });
            }
            g.b("loadInstallState pluginAttribute" + next);
        }
    }

    public final com.bytedance.frameworks.plugin.a.b a(String str) {
        if (str == null) {
            return null;
        }
        if (this.f2220b == null) {
            e();
        }
        return this.f2220b.get(str);
    }

    private static File a(com.bytedance.frameworks.plugin.a.b bVar, boolean z) {
        String a2 = com.bytedance.frameworks.plugin.b.e.a();
        if (z) {
            a2 = com.bytedance.frameworks.plugin.b.e.b();
        }
        try {
            File file = new File(e.a().getApplicationInfo().dataDir + "/lib/", bVar.f2149e);
            File file2 = new File(a2, bVar.f2145a + ".apk");
            if (!file.exists()) {
                ZipFile zipFile = new ZipFile(e.a().getApplicationInfo().sourceDir);
                ZipEntry entry = zipFile.getEntry("lib/armeabi/" + bVar.f2149e);
                if (entry != null && (!file2.exists() || file2.length() != entry.getSize())) {
                    com.bytedance.frameworks.plugin.f.f.a(zipFile, entry, file2);
                    g.b(String.format("prepareHostPluginFile package=%s, src=%s, dest=%s", new Object[]{bVar.f2145a, "apkSource", file2.getAbsolutePath()}));
                }
            } else {
                com.bytedance.frameworks.plugin.f.f.a(file.getAbsolutePath(), file2.getAbsolutePath());
                g.b(String.format("prepareHostPluginFile package=%s, src=%s, dest=%s", new Object[]{bVar.f2145a, file.getAbsolutePath(), file2.getAbsolutePath()}));
            }
            if (file2.exists()) {
                return file2;
            }
        } catch (Exception e2) {
            g.b("PluginAttributeManager", "prepareHostPluginFile error in " + bVar.f2145a, e2);
        }
        g.b("PluginAttributeManager", "pluginApkFile not exist with " + bVar.f2145a);
        return null;
    }
}
