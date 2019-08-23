package com.amap.api.services.a;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public class co {

    /* renamed from: a  reason: collision with root package name */
    private static final co f6736a = new co();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, cn> f6737b = new HashMap();

    public static co a() {
        return f6736a;
    }

    private co() {
    }

    private boolean a(bn bnVar) {
        if (bnVar == null || TextUtils.isEmpty(bnVar.b()) || TextUtils.isEmpty(bnVar.a())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public synchronized cn a(Context context, bn bnVar) throws Exception {
        cn cnVar;
        if (!a(bnVar) || context == null) {
            throw new Exception("sdkInfo or context referance is null");
        }
        String a2 = bnVar.a();
        cnVar = this.f6737b.get(a2);
        if (cnVar == null) {
            try {
                cr crVar = new cr(context.getApplicationContext(), bnVar, true);
                try {
                    this.f6737b.put(a2, crVar);
                    cs.a(context, bnVar);
                } catch (Throwable unused) {
                }
                cnVar = crVar;
            } catch (Throwable unused2) {
            }
        }
        return cnVar;
    }
}
