package com.aweme.storage;

import a.i;
import android.content.Context;
import android.content.SharedPreferences;
import com.aweme.storage.b;
import com.aweme.storage.d;
import com.aweme.storage.n;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f7378a;

    /* renamed from: b  reason: collision with root package name */
    static boolean f7379b;

    /* renamed from: c  reason: collision with root package name */
    static a f7380c;

    /* renamed from: d  reason: collision with root package name */
    static h f7381d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile boolean f7382e;

    /* renamed from: f  reason: collision with root package name */
    private static List<n> f7383f;
    private static g g;
    private static long h;
    private static i i;

    private static void b() {
        if (f7383f != null && !f7383f.isEmpty()) {
            for (n next : f7383f) {
                if (next != null) {
                    next.a();
                }
            }
        }
    }

    private static void a() {
        Set set;
        a aVar = f7380c;
        if (aVar != null && aVar.f7364b != null && aVar.f7364b.length > 0) {
            if (f7381d == null) {
                set = null;
            } else {
                set = f7381d.b();
            }
            for (String str : aVar.f7364b) {
                if (set != null && !set.contains(str)) {
                    File file = new File(str);
                    if (file.exists()) {
                        if (file.isFile()) {
                            file.delete();
                        } else {
                            e.b(file);
                        }
                    }
                }
            }
        }
    }

    static void a(Context context) {
        if (f7381d != null) {
            f7381d.a();
        }
        a();
        c(context);
    }

    static void b(Context context) {
        if (context != null) {
            final Context applicationContext = context.getApplicationContext();
            i.a((Callable<TResult>) new Callable<Object>() {
                public final Object call() throws Exception {
                    if (applicationContext == null) {
                        return null;
                    }
                    com.ss.android.ugc.aweme.q.c.a(applicationContext, "clean_storage_pref", 0).edit().putLong("key_clean_date", System.currentTimeMillis()).commit();
                    c.f7378a = false;
                    return null;
                }
            });
        }
    }

    private static void d(Context context) {
        if (context != null && g != null) {
            ArrayList<File> arrayList = new ArrayList<>();
            File cacheDir = context.getCacheDir();
            if (cacheDir != null) {
                a(cacheDir.getParentFile(), (List<File>) arrayList);
            }
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null) {
                externalCacheDir = externalCacheDir.getParentFile();
                a(externalCacheDir, (List<File>) arrayList);
            }
            if (arrayList.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    for (File file : arrayList) {
                        if (!externalCacheDir.getName().endsWith(".so")) {
                            jSONObject.put(file.getAbsolutePath(), (file.length() / 1024) / 1024);
                        }
                    }
                } catch (Exception unused) {
                }
                new StringBuilder("large files \n").append(jSONObject.toString());
                g.a("large_files", null, jSONObject, null);
            }
        }
    }

    private static void c(Context context) {
        List<String> list;
        if (g != null) {
            try {
                e(context);
                b();
                JSONObject jSONObject = new JSONObject();
                long a2 = e.a(context.getCacheDir().getParent());
                long a3 = e.a(context.getExternalCacheDir().getParent());
                jSONObject.put("private_size", a2);
                jSONObject.put("external_size", a3);
                jSONObject.put("total_size", a2 + a3);
                jSONObject.put("device_size", e.a());
                jSONObject.put("available_size", e.b());
                a(jSONObject);
                jSONObject.put("black_size", h);
                g.a("storage_usage", jSONObject);
                if (i == null) {
                    list = null;
                } else {
                    list = i.f7398c;
                }
                Map a4 = f.a(context, list);
                if (a4 != null && a4.size() > 0) {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry entry : a4.entrySet()) {
                        jSONObject2.put((String) entry.getKey(), entry.getValue());
                    }
                    g.a("storage_full", null, jSONObject2, null);
                }
                d(context);
            } catch (Exception unused) {
            }
        }
    }

    private static void e(Context context) {
        h = 0;
        if (f7379b && context != null) {
            ArrayList<d.a> arrayList = new ArrayList<>();
            File cacheDir = context.getCacheDir();
            if (cacheDir != null) {
                a(cacheDir.getParentFile(), cacheDir.getAbsolutePath() + File.separator + "ptree.txt", d.b.p, arrayList);
            }
            File externalCacheDir = context.getExternalCacheDir();
            if (externalCacheDir != null) {
                a(externalCacheDir.getParentFile(), externalCacheDir.getAbsolutePath() + File.separator + "etree.txt", d.b.e, arrayList);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                for (d.a aVar : arrayList) {
                    new StringBuilder("black: ").append(aVar.b());
                    h += aVar.f7390a;
                    String b2 = aVar.b();
                    if (b2 != null) {
                        jSONObject.put(b2.replace("/", "_"), (aVar.f7390a / 1024) / 1024);
                    }
                }
            } catch (Exception unused) {
            }
            b.a(context, arrayList);
            if (g != null) {
                g.a("black_storage", null, jSONObject, null);
            }
        }
    }

    private static void a(JSONObject jSONObject) {
        if (f7383f != null && !f7383f.isEmpty()) {
            for (n next : f7383f) {
                if (next != null) {
                    try {
                        jSONObject.put(next.f7416b, next.f7417c);
                        if (next.f7418d != null && !next.f7418d.isEmpty()) {
                            for (n.a next2 : next.f7418d) {
                                if (next2 != null) {
                                    jSONObject.put(next2.f7420b, next2.f7421c);
                                }
                            }
                        }
                    } catch (JSONException unused) {
                    }
                }
            }
        }
    }

    public static void a(final Context context, i iVar) {
        long j;
        long j2;
        int i2;
        long j3;
        if (!f7382e) {
            f7382e = true;
            i = iVar;
            f7380c = iVar.f7400e;
            f7381d = iVar.f7396a;
            g = iVar.f7397b;
            f7383f = iVar.f7399d;
            d.f7389c = iVar.f7398c;
            if (f7380c == null || f7380c.f7366d <= 0) {
                j = 3145728;
            } else {
                j = ((long) f7380c.f7366d) * 1024;
            }
            d.f7387a = j;
            if (f7380c == null || f7380c.i <= 0) {
                j2 = 1048576;
            } else {
                j2 = ((long) f7380c.i) * 1024;
            }
            d.f7388b = j2;
            b.f7372d = iVar.f7401f;
            b.g = iVar.f7397b;
            b.f7374f = iVar.f7396a;
            int i3 = 10;
            if (f7380c == null || f7380c.f7368f <= 0) {
                i2 = 10;
            } else {
                i2 = f7380c.f7368f;
            }
            b.f7369a = i2;
            if (f7380c == null || f7380c.f7367e <= 0) {
                j3 = 2592000000L;
            } else {
                j3 = ((long) f7380c.f7367e) * 86400000;
            }
            b.f7370b = j3;
            if (f7380c != null && f7380c.g > 0) {
                i3 = f7380c.g;
            }
            b.f7371c = i3;
            i.a((Callable<TResult>) new Callable<Object>() {
                public final Object call() {
                    Context context = context;
                    if (context != null) {
                        SharedPreferences a2 = com.ss.android.ugc.aweme.q.c.a(context, "clean_storage_pref", 0);
                        int i = a2.getInt("key_start_time", 0);
                        if (i > 5) {
                            c.f7379b = true;
                        } else {
                            a2.edit().putInt("key_start_time", i + 1).apply();
                        }
                    }
                    Context context2 = context;
                    if (!b.h) {
                        b.h = true;
                        if (context2 != null) {
                            List<m> a3 = b.a(context2);
                            if (a3 != null && a3.size() > 0) {
                                b.f7373e = new ArrayList(a3.size());
                                for (m mVar : a3) {
                                    if (!(mVar == null || mVar.f7411b == null)) {
                                        new StringBuilder("new observer ").append(mVar.f7411b);
                                        if (new File(mVar.f7411b).exists()) {
                                            b.a aVar = new b.a(context2, mVar, 547);
                                            b.f7373e.add(aVar);
                                            aVar.startWatching();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return null;
                }
            });
        }
    }

    private static void a(File file, List<File> list) {
        if (file != null && file.exists() && list != null) {
            int i2 = 0;
            if (file.isFile()) {
                if (file != null) {
                    long j = 50;
                    if (f7380c != null) {
                        j = (long) f7380c.h;
                    }
                    if (file.length() > j * 1024 * 1024) {
                        i2 = 1;
                    }
                }
                if (i2 != 0) {
                    list.add(file);
                }
                return;
            }
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                while (i2 < length) {
                    a(listFiles[i2], list);
                    i2++;
                }
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x0061 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0067 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x006d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.io.File r2, java.lang.String r3, com.aweme.storage.d.b r4, java.util.List<com.aweme.storage.d.a> r5) {
        /*
            if (r3 != 0) goto L_0x0003
            return
        L_0x0003:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            r1 = 0
            com.aweme.storage.d$a r2 = com.aweme.storage.d.a((java.io.File) r2, (com.aweme.storage.d.a) r1, (com.aweme.storage.d.b) r4)
            if (r2 != 0) goto L_0x0010
            return
        L_0x0010:
            boolean r4 = r0.exists()
            if (r4 != 0) goto L_0x001c
            r0.createNewFile()     // Catch:{ IOException -> 0x001a }
            goto L_0x0029
        L_0x001a:
            goto L_0x0029
        L_0x001c:
            com.aweme.storage.d$a r4 = com.aweme.storage.d.a((java.lang.String) r3)
            if (r4 != 0) goto L_0x0023
            return
        L_0x0023:
            com.aweme.storage.d.a((com.aweme.storage.d.a) r4)
            com.aweme.storage.d.a((com.aweme.storage.d.a) r4, (com.aweme.storage.d.a) r2, (java.util.List<com.aweme.storage.d.a>) r5)
        L_0x0029:
            if (r2 == 0) goto L_0x0072
            if (r3 != 0) goto L_0x002e
            goto L_0x0072
        L_0x002e:
            org.json.JSONObject r2 = r2.c()
            java.io.File r4 = new java.io.File     // Catch:{ FileNotFoundException -> 0x006c, IOException -> 0x0066, Exception -> 0x0060, all -> 0x005b }
            r4.<init>(r3)     // Catch:{ FileNotFoundException -> 0x006c, IOException -> 0x0066, Exception -> 0x0060, all -> 0x005b }
            boolean r3 = r4.exists()     // Catch:{ FileNotFoundException -> 0x006c, IOException -> 0x0066, Exception -> 0x0060, all -> 0x005b }
            if (r3 != 0) goto L_0x0040
            r4.createNewFile()     // Catch:{ FileNotFoundException -> 0x006c, IOException -> 0x0066, Exception -> 0x0060, all -> 0x005b }
        L_0x0040:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x006c, IOException -> 0x0066, Exception -> 0x0060, all -> 0x005b }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x006c, IOException -> 0x0066, Exception -> 0x0060, all -> 0x005b }
            java.lang.String r2 = r2.toString()     // Catch:{ FileNotFoundException -> 0x006d, IOException -> 0x0067, Exception -> 0x0061, all -> 0x0058 }
            byte[] r2 = r2.getBytes()     // Catch:{ FileNotFoundException -> 0x006d, IOException -> 0x0067, Exception -> 0x0061, all -> 0x0058 }
            r3.write(r2)     // Catch:{ FileNotFoundException -> 0x006d, IOException -> 0x0067, Exception -> 0x0061, all -> 0x0058 }
            r3.close()     // Catch:{ FileNotFoundException -> 0x006d, IOException -> 0x0067, Exception -> 0x0061, all -> 0x0058 }
            r3.close()     // Catch:{ Exception -> 0x0057 }
            return
        L_0x0057:
            return
        L_0x0058:
            r2 = move-exception
            r1 = r3
            goto L_0x005c
        L_0x005b:
            r2 = move-exception
        L_0x005c:
            r1.close()     // Catch:{ Exception -> 0x005f }
        L_0x005f:
            throw r2
        L_0x0060:
            r3 = r1
        L_0x0061:
            r3.close()     // Catch:{ Exception -> 0x0065 }
            return
        L_0x0065:
            return
        L_0x0066:
            r3 = r1
        L_0x0067:
            r3.close()     // Catch:{ Exception -> 0x006b }
            return
        L_0x006b:
            return
        L_0x006c:
            r3 = r1
        L_0x006d:
            r3.close()     // Catch:{ Exception -> 0x0071 }
            return
        L_0x0071:
            return
        L_0x0072:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aweme.storage.c.a(java.io.File, java.lang.String, com.aweme.storage.d$b, java.util.List):void");
    }
}
