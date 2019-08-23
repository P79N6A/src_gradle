package com.bytedance.frameworks.plugin.f;

import android.content.res.AssetManager;
import android.text.TextUtils;
import com.bytedance.frameworks.plugin.e.b;
import java.util.ArrayList;
import java.util.List;

public final class l {
    public static List<String> a() {
        AssetManager assetManager;
        try {
            assetManager = AssetManager.class.newInstance();
        } catch (Exception e2) {
            g.a("Execute 'AssetManager.class.newInstance()' failed. ", (Throwable) e2);
            assetManager = null;
        }
        return b(assetManager);
    }

    public static String c(AssetManager assetManager) {
        return a(b(assetManager));
    }

    public static int a(AssetManager assetManager) {
        int i;
        try {
            if (h.a()) {
                Object[] objArr = (Object[]) b.a((Object) assetManager, "getApkAssets", new Object[0]);
                if (objArr != null) {
                    i = objArr.length;
                } else {
                    i = 0;
                }
            } else {
                i = ((Integer) b.a((Object) assetManager, "getStringBlockCount", new Object[0])).intValue();
            }
            return i;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static String a(List<String> list) {
        StringBuilder sb = new StringBuilder("[");
        if (list != null && list.size() > 0) {
            for (String append : list) {
                sb.append(append);
                sb.append(" , ");
            }
            sb.delete(sb.lastIndexOf(" , "), sb.length());
        }
        sb.append("]");
        return sb.toString();
    }

    public static List<String> b(AssetManager assetManager) {
        ArrayList arrayList = new ArrayList();
        if (assetManager == null) {
            return arrayList;
        }
        try {
            if (h.a()) {
                Object[] objArr = (Object[]) b.a((Object) assetManager, "getApkAssets", new Object[0]);
                if (objArr != null && objArr.length > 0) {
                    for (Object a2 : objArr) {
                        arrayList.add((String) b.a(a2, "getAssetPath", new Object[0]));
                    }
                }
            } else {
                int intValue = ((Integer) b.a((Object) assetManager, "getStringBlockCount", new Object[0])).intValue();
                int i = 0;
                while (i < intValue) {
                    i++;
                    String str = (String) b.a((Object) assetManager, "getCookieName", Integer.valueOf(i));
                    if (!TextUtils.isEmpty(str)) {
                        arrayList.add(str);
                    }
                }
            }
        } catch (Throwable th) {
            g.a("GetAssetsPaths error. ", th);
        }
        return arrayList;
    }
}
