package com.ss.android.ugc.aweme.plugin.f;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.f.d;
import com.bytedance.frameworks.plugin.f.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59344a;

    static class a implements Comparator<b> {
        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            b bVar = (b) obj;
            b bVar2 = (b) obj2;
            if (bVar.f59340b == bVar2.f59340b) {
                return 0;
            }
            if (bVar.f59340b > bVar2.f59340b) {
                return -1;
            }
            return 1;
        }
    }

    private InputStream a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f59344a, false, 64657, new Class[]{String.class}, InputStream.class)) {
            return (InputStream) PatchProxy.accessDispatch(new Object[]{str}, this, f59344a, false, 64657, new Class[]{String.class}, InputStream.class);
        }
        try {
            AssetManager newInstance = AssetManager.class.newInstance();
            Method declaredMethod = AssetManager.class.getDeclaredMethod("addAssetPath", new Class[]{String.class});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(newInstance, new Object[]{str});
            return new Resources(newInstance, e.a().getResources().getDisplayMetrics(), null).getAssets().open("plugin.dps");
        } catch (Exception unused) {
            return null;
        }
    }

    private int b(Context context) {
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[]{context}, this, f59344a, false, 64655, new Class[]{Context.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context}, this, f59344a, false, 64655, new Class[]{Context.class}, Integer.TYPE)).intValue();
        }
        try {
            String packageName = context.getPackageName();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(packageName, SearchJediMixFeedAdapter.f42517f);
            i = packageInfo.versionCode;
            try {
                if (applicationInfo.metaData == null || applicationInfo.metaData.isEmpty()) {
                    i2 = i;
                } else {
                    i2 = Math.max(applicationInfo.metaData.getInt("SS_VERSION_CODE"), i);
                }
                return i2;
            } catch (Exception unused) {
                return i;
            }
        } catch (Exception unused2) {
            i = 0;
            return i;
        }
    }

    private String a(InputStream inputStream) {
        InputStream inputStream2 = inputStream;
        if (PatchProxy.isSupport(new Object[]{inputStream2}, this, f59344a, false, 64659, new Class[]{InputStream.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{inputStream2}, this, f59344a, false, 64659, new Class[]{InputStream.class}, String.class);
        }
        if (inputStream2 != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                f.a(inputStream2, (OutputStream) byteArrayOutputStream);
                return byteArrayOutputStream.toString();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private b b(InputStream inputStream) {
        if (PatchProxy.isSupport(new Object[]{inputStream}, this, f59344a, false, 64660, new Class[]{InputStream.class}, b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[]{inputStream}, this, f59344a, false, 64660, new Class[]{InputStream.class}, b.class);
        }
        String a2 = a(inputStream);
        b bVar = new b();
        if (!TextUtils.isEmpty(a2)) {
            try {
                JSONObject jSONObject = new JSONObject(a2);
                bVar.f59339a = jSONObject.optString("packageName");
                bVar.f59340b = jSONObject.optInt("versionCode");
                JSONObject optJSONObject = jSONObject.optJSONObject("dependOnHost");
                if (optJSONObject != null) {
                    bVar.f59342d = new a();
                    bVar.f59342d.f59336a = optJSONObject.optString("packageName");
                    bVar.f59342d.f59337b = Math.max(optJSONObject.optInt("versionCode"), optJSONObject.optInt("minVersionCode"));
                    bVar.f59342d.f59338c = optJSONObject.optInt("maxVersionCode");
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("dependOnPlugins");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    bVar.f59343e = new ArrayList();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                        if (optJSONObject2 != null) {
                            a aVar = new a();
                            aVar.f59336a = optJSONObject2.optString("packageName");
                            aVar.f59337b = Math.max(optJSONObject2.optInt("versionCode"), optJSONObject2.optInt("minVersionCode"));
                            aVar.f59338c = optJSONObject2.optInt("maxVersionCode");
                            bVar.f59343e.add(aVar);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.support.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.Map<java.lang.String, java.util.List<com.ss.android.ugc.aweme.plugin.f.b>> a(java.io.File[] r16) {
        /*
            r15 = this;
            r7 = r15
            r8 = r16
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f59344a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.io.File[]> r1 = java.io.File[].class
            r5[r10] = r1
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            r3 = 0
            r4 = 64654(0xfc8e, float:9.06E-41)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f59344a
            r3 = 0
            r4 = 64654(0xfc8e, float:9.06E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.io.File[]> r1 = java.io.File[].class
            r5[r10] = r1
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            r1 = r15
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.util.Map r0 = (java.util.Map) r0
            return r0
        L_0x0038:
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            if (r8 == 0) goto L_0x010f
            int r0 = r8.length
            if (r0 != 0) goto L_0x0044
            goto L_0x010f
        L_0x0044:
            int r12 = r8.length
            r13 = 0
        L_0x0046:
            if (r13 >= r12) goto L_0x00e8
            r14 = r8[r13]
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r14
            com.meituan.robust.ChangeQuickRedirect r2 = f59344a
            r3 = 0
            r4 = 64658(0xfc92, float:9.0605E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.io.File> r1 = java.io.File.class
            r5[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.plugin.f.b> r6 = com.ss.android.ugc.aweme.plugin.f.b.class
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x007d
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r14
            com.meituan.robust.ChangeQuickRedirect r2 = f59344a
            r3 = 0
            r4 = 64658(0xfc92, float:9.0605E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.io.File> r1 = java.io.File.class
            r5[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.plugin.f.b> r6 = com.ss.android.ugc.aweme.plugin.f.b.class
            r1 = r15
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.plugin.f.b r0 = (com.ss.android.ugc.aweme.plugin.f.b) r0
            goto L_0x00ba
        L_0x007d:
            java.lang.String r0 = r14.getPath()
            java.io.InputStream r0 = r15.a((java.lang.String) r0)
            com.ss.android.ugc.aweme.plugin.f.b r0 = r15.b((java.io.InputStream) r0)
            java.lang.String r1 = r14.getPath()
            r0.f59341c = r1
            android.content.Context r1 = com.bytedance.frameworks.plugin.e.a()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = r14.getPath()
            android.content.pm.PackageInfo r1 = r1.getPackageArchiveInfo(r2, r10)
            if (r1 == 0) goto L_0x00ba
            java.lang.String r2 = r0.f59339a
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x00ac
            java.lang.String r2 = r1.packageName
            goto L_0x00ae
        L_0x00ac:
            java.lang.String r2 = r0.f59339a
        L_0x00ae:
            r0.f59339a = r2
            int r1 = r1.versionCode
            int r2 = r0.f59340b
            int r1 = java.lang.Math.max(r1, r2)
            r0.f59340b = r1
        L_0x00ba:
            java.lang.String r1 = r0.f59339a
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x00c6
            com.bytedance.frameworks.plugin.f.d.a((java.io.File) r14)
            goto L_0x00e4
        L_0x00c6:
            java.lang.String r1 = r0.f59339a
            boolean r1 = r11.containsKey(r1)
            if (r1 != 0) goto L_0x00d9
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = r0.f59339a
            r11.put(r2, r1)
            goto L_0x00e1
        L_0x00d9:
            java.lang.String r1 = r0.f59339a
            java.lang.Object r1 = r11.get(r1)
            java.util.List r1 = (java.util.List) r1
        L_0x00e1:
            r1.add(r0)
        L_0x00e4:
            int r13 = r13 + 1
            goto L_0x0046
        L_0x00e8:
            com.ss.android.ugc.aweme.plugin.f.c$a r0 = new com.ss.android.ugc.aweme.plugin.f.c$a
            r0.<init>(r10)
            java.util.Set r1 = r11.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x00f5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x010e
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.get(r2)
            java.util.List r3 = (java.util.List) r3
            java.util.Collections.sort(r3, r0)
            r11.put(r2, r3)
            goto L_0x00f5
        L_0x010e:
            return r11
        L_0x010f:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.plugin.f.c.a(java.io.File[]):java.util.Map");
    }

    public final void a(Context context) {
        boolean z;
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{context}, this, f59344a, false, 64653, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f59344a, false, 64653, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        File file = new File(com.ss.android.ugc.aweme.plugin.b.e.b());
        int b2 = b(context);
        Map<String, List<b>> a2 = a(file.listFiles(new FileFilter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f59345a;

            public final boolean accept(File file) {
                if (PatchProxy.isSupport(new Object[]{file}, this, f59345a, false, 64661, new Class[]{File.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{file}, this, f59345a, false, 64661, new Class[]{File.class}, Boolean.TYPE)).booleanValue();
                } else if (file == null) {
                    return false;
                } else {
                    String name = file.getName();
                    if (name.endsWith(".apk") || name.endsWith(".so") || name.endsWith(".jar")) {
                        return true;
                    }
                    if (name.endsWith(".tmp")) {
                        return false;
                    }
                    d.a(file);
                    return false;
                }
            }
        }));
        if (!a2.isEmpty()) {
            for (List<b> it2 : a2.values()) {
                for (b bVar : it2) {
                    if (PatchProxy.isSupport(new Object[]{context, Integer.valueOf(b2), bVar}, this, f59344a, false, 64656, new Class[]{Context.class, Integer.TYPE, b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{context, Integer.valueOf(b2), bVar}, this, f59344a, false, 64656, new Class[]{Context.class, Integer.TYPE, b.class}, Void.TYPE);
                    } else if (bVar != null) {
                        if (bVar.f59342d == null) {
                            com.bytedance.frameworks.plugin.pm.c.a(bVar.f59341c, true, 0);
                        } else {
                            int i = bVar.f59342d.f59337b;
                            int i2 = bVar.f59342d.f59338c;
                            if (i2 == 0) {
                                i2 = b2;
                            }
                            if (b2 < i || b2 > i2) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (z) {
                                com.bytedance.frameworks.plugin.pm.c.a(bVar.f59341c, true, 0);
                            } else {
                                a aVar = bVar.f59342d;
                                if (aVar.f59338c == 0 || aVar.f59338c >= b2) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    d.a(new File(bVar.f59341c));
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
