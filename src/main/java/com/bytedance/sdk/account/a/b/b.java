package com.bytedance.sdk.account.a.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sdk.account.b.c.c;
import com.bytedance.sdk.account.b.d.a;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.taobao.android.dexposed.ClassUtils;
import java.util.ArrayList;
import java.util.List;

public final class b implements com.bytedance.sdk.account.a.a.b {

    /* renamed from: a  reason: collision with root package name */
    private Context f22230a;

    /* renamed from: b  reason: collision with root package name */
    private List<com.bytedance.sdk.account.b.a.b> f22231b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private c f22232c;

    public final boolean a(String str) {
        return a.a(this.f22230a, str);
    }

    private static String b(String str, String str2) {
        return str + ClassUtils.PACKAGE_SEPARATOR + str2;
    }

    private int c(String str, String str2) {
        if (this.f22230a == null || TextUtils.isEmpty(str) || !a(str)) {
            return -1;
        }
        try {
            ActivityInfo activityInfo = this.f22230a.getPackageManager().getActivityInfo(new ComponentName(str, b(str, str2)), SearchJediMixFeedAdapter.f42517f);
            if (!(activityInfo == null || activityInfo.metaData == null)) {
                return activityInfo.metaData.getInt("BD_PLATFORM_SDK_VERSION", -1);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return -1;
    }

    public final boolean a(Intent intent, com.bytedance.sdk.account.b.a.a aVar) {
        if (aVar == null) {
            return false;
        }
        if (intent == null) {
            aVar.onErrorIntent(intent);
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            aVar.onErrorIntent(intent);
            return false;
        }
        int i = extras.getInt("_bytedance_params_type");
        for (com.bytedance.sdk.account.b.a.b a2 : this.f22231b) {
            if (a2.a(i, extras, aVar)) {
                return true;
            }
        }
        aVar.onErrorIntent(intent);
        return false;
    }

    public final boolean a(Class cls, c.a aVar) {
        if (aVar == null || this.f22230a == null || !aVar.checkArgs()) {
            return false;
        }
        Bundle bundle = new Bundle();
        aVar.toBundle(bundle);
        bundle.putString("_bytedance_params_client_key", this.f22232c.f22233a);
        bundle.putString("_bytedance_params_type_caller_package", this.f22230a.getPackageName());
        bundle.putString("__bytedance_base_caller_version", com.bytedance.sdk.account.a.a.a.f22229a);
        Intent intent = new Intent(this.f22230a, cls);
        intent.putExtras(bundle);
        if (Build.VERSION.SDK_INT >= 11) {
            intent.addFlags(32768);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            intent.addFlags(67108864);
            intent.addFlags(536870912);
        }
        try {
            this.f22230a.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean a(String str, String str2) {
        Context context = this.f22230a;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || context == null) {
            return false;
        }
        List<String> a2 = com.bytedance.sdk.account.b.d.c.a(context, str);
        if (a2 != null && a2.size() > 0) {
            for (String equalsIgnoreCase : a2) {
                if (str2.equalsIgnoreCase(equalsIgnoreCase)) {
                    return true;
                }
            }
        }
        return false;
    }

    public b(Context context, c cVar, List<com.bytedance.sdk.account.b.a.b> list) {
        this.f22230a = context;
        this.f22232c = cVar;
        this.f22231b.add(new com.bytedance.sdk.account.b.b.a());
        if (list != null) {
            this.f22231b.addAll(list);
        }
    }

    public final boolean a(String str, c.a aVar, com.bytedance.sdk.account.b.c.b bVar) {
        String str2;
        if (bVar == null || this.f22230a == null || !bVar.checkArgs()) {
            return false;
        }
        Bundle bundle = new Bundle();
        bVar.toBundle(bundle);
        String packageName = this.f22230a.getPackageName();
        if (TextUtils.isEmpty(aVar.callerLocalEntry)) {
            str2 = b(packageName, str);
        } else {
            str2 = aVar.callerLocalEntry;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(packageName, str2));
        intent.putExtras(bundle);
        if (Build.VERSION.SDK_INT >= 11) {
            intent.addFlags(32768);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            intent.addFlags(67108864);
            intent.addFlags(536870912);
        }
        try {
            this.f22230a.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final boolean a(String str, String str2, int i) {
        if (this.f22230a == null || TextUtils.isEmpty(str) || !a(str)) {
            return false;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, b(str, str2)));
        ActivityInfo resolveActivityInfo = intent.resolveActivityInfo(this.f22230a.getPackageManager(), 65536);
        int c2 = c(str, str2);
        if (resolveActivityInfo == null || !resolveActivityInfo.exported || c2 < i) {
            return false;
        }
        return true;
    }

    public final boolean a(String str, String str2, String str3, com.bytedance.sdk.account.b.c.a aVar) {
        if (TextUtils.isEmpty(str2) || aVar == null || this.f22230a == null || !aVar.checkArgs()) {
            return false;
        }
        Bundle bundle = new Bundle();
        aVar.toBundle(bundle);
        bundle.putString("_bytedance_params_client_key", this.f22232c.f22233a);
        bundle.putString("_bytedance_params_type_caller_package", this.f22230a.getPackageName());
        bundle.putString("__bytedance_base_caller_version", com.bytedance.sdk.account.a.a.a.f22229a);
        if (TextUtils.isEmpty(aVar.callerLocalEntry)) {
            bundle.putString("_bytedance_params_from_entry", b(this.f22230a.getPackageName(), str));
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str2, b(str2, str3)));
        intent.putExtras(bundle);
        if (Build.VERSION.SDK_INT >= 11) {
            intent.addFlags(32768);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            intent.addFlags(67108864);
            intent.addFlags(536870912);
        }
        try {
            this.f22230a.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
