package com.bytedance.sdk.account.bdplatform.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.sdk.account.b.b.a;
import com.bytedance.sdk.account.bdplatform.a.c;
import java.util.ArrayList;
import java.util.List;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private Context f22307a;

    /* renamed from: b  reason: collision with root package name */
    private List<com.bytedance.sdk.account.b.a.b> f22308b;

    public b(Context context) {
        this(context, null);
    }

    private b(Context context, List<com.bytedance.sdk.account.b.a.b> list) {
        this.f22308b = new ArrayList();
        this.f22307a = context;
        this.f22308b.add(new a());
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
        for (com.bytedance.sdk.account.b.a.b a2 : this.f22308b) {
            if (a2.a(i, extras, aVar)) {
                return true;
            }
        }
        aVar.onErrorIntent(intent);
        return false;
    }

    public final boolean a(com.bytedance.sdk.account.b.c.a aVar, com.bytedance.sdk.account.b.c.b bVar) {
        if (aVar == null) {
            return false;
        }
        String callerPackage = aVar.getCallerPackage();
        String str = aVar.callerLocalEntry;
        if (TextUtils.isEmpty(callerPackage) || bVar == null || this.f22307a == null || TextUtils.isEmpty(str) || !bVar.checkArgs()) {
            return false;
        }
        Bundle bundle = new Bundle();
        bVar.toBundle(bundle);
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(callerPackage, str));
        intent.putExtras(bundle);
        if (Build.VERSION.SDK_INT >= 11) {
            intent.addFlags(32768);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            intent.addFlags(67108864);
            intent.addFlags(536870912);
        }
        try {
            this.f22307a.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
