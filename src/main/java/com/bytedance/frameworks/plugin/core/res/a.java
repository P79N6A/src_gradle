package com.bytedance.frameworks.plugin.core.res;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.e.b;
import com.bytedance.frameworks.plugin.f.g;
import com.bytedance.frameworks.plugin.f.l;
import com.ss.android.ugc.aweme.app.f;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    private static Map<String, Integer> f2212b = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public LinkedHashMap<String, Integer> f2213a = new LinkedHashMap<>();

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public a() {
        this.f2213a.put(e.a().getApplicationInfo().sourceDir, 0);
    }

    static {
        List<String> a2 = l.a();
        if (a2 != null && a2.size() > 0) {
            for (String put : a2) {
                f2212b.put(put, 0);
            }
        }
    }

    public static AssetManager b(AssetManager assetManager, String str) {
        Method a2 = b.a(AssetManager.class, "addAssetPath", (Class<?>[]) new Class[]{String.class});
        if (a2 != null) {
            int i = 3;
            while (true) {
                int i2 = i - 1;
                if (i < 0) {
                    break;
                }
                try {
                    int intValue = ((Integer) a2.invoke(assetManager, new Object[]{str})).intValue();
                    if (intValue != 0) {
                        g.a(String.format("appendAssetPath success[cookie:%d]:%s: ", new Object[]{Integer.valueOf(intValue), str}));
                        break;
                    }
                    g.c("appendAssetPath failed: cookie is " + intValue);
                    i = i2;
                } catch (Exception e2) {
                    g.a("appendAssetPath failed.", e2.getMessage());
                }
            }
        } else {
            g.c("appendAssetPath failed: addAssetPathMethod is null!!!");
        }
        return assetManager;
    }

    public AssetManager a(AssetManager assetManager, String str) {
        AssetManager assetManager2;
        List<String> b2 = l.b(assetManager);
        ArrayList<String> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (String next : b2) {
            if (!f2212b.containsKey(next) && !this.f2213a.containsKey(next) && !next.equals(str)) {
                arrayList.add(next);
            }
        }
        try {
            if (assetManager.getClass().getName().equals("android.content.res.BaiduAssetManager")) {
                assetManager2 = (AssetManager) Class.forName("android.content.res.BaiduAssetManager").getConstructor(new Class[0]).newInstance(new Object[0]);
            } else {
                assetManager2 = AssetManager.class.newInstance();
            }
            for (Map.Entry next2 : this.f2213a.entrySet()) {
                if (!f2212b.containsKey(next2.getKey())) {
                    sb.append((String) next2.getKey());
                    b(assetManager2, (String) next2.getKey());
                }
            }
            if (!sb.toString().contains(e.a().getApplicationInfo().sourceDir)) {
                b(assetManager2, e.a().getApplicationInfo().sourceDir);
                g.c("New AssetManager lost host path!!!：" + f2212b.containsKey(e.a().getApplicationInfo().sourceDir));
            }
            sb.append(str);
            b(assetManager2, str);
            if (!arrayList.isEmpty()) {
                for (String str2 : arrayList) {
                    sb.append(str2);
                    b(assetManager2, str2);
                }
            }
            if (Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT < 23 && !sb.toString().toLowerCase().contains(f.f34167a)) {
                try {
                    Resources resources = e.a().getResources();
                    String str3 = e.a().createPackageContext(resources.getString(resources.getIdentifier("android:string/config_webViewPackageName", "string", "android")), 0).getApplicationInfo().sourceDir;
                    if (!TextUtils.isEmpty(str3)) {
                        b(assetManager2, str3);
                    }
                } catch (Exception unused) {
                }
            }
            assetManager = assetManager2;
        } catch (Exception e2) {
            g.a("Create new AssetManager failed.", (Throwable) e2);
            b(assetManager, str);
        }
        try {
            b.a((Object) assetManager, "ensureStringBlocks", new Object[0]);
        } catch (Exception e3) {
            g.a("Invoke assetManager#ensureStringBlocks failed.", (Throwable) e3);
        }
        return assetManager;
    }
}
