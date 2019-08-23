package com.bytedance.crash.runtime;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.crash.f;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.HashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public f f19511a;

    /* renamed from: b  reason: collision with root package name */
    private Context f19512b;

    public final String b() {
        return com.bytedance.crash.i.a.d(this.f19512b);
    }

    public final String c() {
        return this.f19511a.b();
    }

    @Nullable
    public final Map<String, Object> a() {
        Map<String, Object> a2 = this.f19511a.a();
        if (a2 == null) {
            a2 = new HashMap<>(4);
        }
        if (a(a2)) {
            try {
                PackageInfo packageInfo = this.f19512b.getPackageManager().getPackageInfo(this.f19512b.getPackageName(), SearchJediMixFeedAdapter.f42517f);
                a2.put("version_name", packageInfo.versionName);
                a2.put("version_code", Integer.valueOf(packageInfo.versionCode));
                if (a2.get("update_version_code") == null) {
                    Object obj = null;
                    if (packageInfo.applicationInfo.metaData != null) {
                        obj = packageInfo.applicationInfo.metaData.get("UPDATE_VERSION_CODE");
                    }
                    if (obj == null) {
                        obj = a2.get("version_code");
                    }
                    a2.put("update_version_code", obj);
                }
            } catch (Throwable unused) {
                a2.put("version_name", com.bytedance.crash.i.a.e(this.f19512b));
                a2.put("version_code", Integer.valueOf(com.bytedance.crash.i.a.f(this.f19512b)));
                if (a2.get("update_version_code") == null) {
                    a2.put("update_version_code", a2.get("version_code"));
                }
            }
        }
        return a2;
    }

    public static boolean a(Map<String, Object> map) {
        if (map == null || map.isEmpty() || ((!map.containsKey("app_version") && !map.containsKey("version_name")) || !map.containsKey("version_code") || !map.containsKey("update_version_code"))) {
            return true;
        }
        return false;
    }

    public a(@NonNull Context context, @NonNull f fVar) {
        this.f19512b = context;
        this.f19511a = fVar;
    }
}
