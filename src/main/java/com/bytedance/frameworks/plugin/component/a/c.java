package com.bytedance.frameworks.plugin.component.a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import com.bytedance.frameworks.plugin.b.a;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.e.b;
import java.util.Iterator;
import java.util.List;

public final class c {
    public static void a() {
        Object b2 = a.b();
        if (b2 != null) {
            try {
                List list = (List) com.bytedance.frameworks.plugin.e.a.a(b2, "providers");
                if (list != null) {
                    if (list.size() != 0) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            if (!com.bytedance.frameworks.plugin.f.a.a(((ProviderInfo) it2.next()).name)) {
                                it2.remove();
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void a(Context context, String str, String str2, boolean z) {
        List a2 = com.bytedance.frameworks.plugin.pm.c.a(str, str2, 0);
        if (a2 != null && a2.size() > 0) {
            PackageManager packageManager = e.a().getPackageManager();
            Iterator it2 = a2.iterator();
            while (it2.hasNext()) {
                ProviderInfo providerInfo = (ProviderInfo) it2.next();
                if (!z && packageManager.resolveContentProvider(providerInfo.authority, 16777216) != null) {
                    it2.remove();
                }
                if (providerInfo != null && !providerInfo.applicationInfo.packageName.equals(context.getPackageName())) {
                    providerInfo.applicationInfo.packageName = context.getPackageName();
                }
            }
            try {
                b.a(a.a(), "installContentProviders", context, a2);
            } catch (Exception unused) {
            }
        }
    }
}
