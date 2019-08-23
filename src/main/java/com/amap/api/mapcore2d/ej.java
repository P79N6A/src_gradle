package com.amap.api.mapcore2d;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public class ej {

    /* renamed from: a  reason: collision with root package name */
    private static final ej f6038a = new ej();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, ec> f6039b = new HashMap();

    public static ej a() {
        return f6038a;
    }

    private ej() {
    }

    private boolean a(cy cyVar) {
        if (cyVar == null || TextUtils.isEmpty(cyVar.b()) || TextUtils.isEmpty(cyVar.a())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public synchronized ec a(Context context, cy cyVar) throws Exception {
        ec ecVar;
        if (a(cyVar)) {
            if (context != null) {
                String a2 = cyVar.a();
                ecVar = this.f6039b.get(a2);
                if (ecVar == null) {
                    try {
                        eh ehVar = new eh(context.getApplicationContext(), cyVar, true);
                        try {
                            this.f6039b.put(a2, ehVar);
                            ef.a(context, cyVar);
                        } catch (Throwable unused) {
                        }
                        ecVar = ehVar;
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
        return null;
        return ecVar;
    }
}
