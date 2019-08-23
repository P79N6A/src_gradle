package com.amap.api.services.a;

import android.content.Context;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import java.util.List;

public class cj {

    /* renamed from: a  reason: collision with root package name */
    private ce f6714a;

    /* renamed from: b  reason: collision with root package name */
    private Context f6715b;

    public List<bn> a() {
        try {
            return this.f6714a.a(bn.g(), bn.class, true);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void a(bn bnVar) {
        if (bnVar != null) {
            try {
                if (this.f6714a == null) {
                    this.f6714a = a(this.f6715b, false);
                }
                String a2 = bn.a(bnVar.a());
                List<bn> b2 = this.f6714a.b(a2, bn.class);
                if (b2 != null) {
                    if (b2.size() != 0) {
                        if (a(b2, bnVar)) {
                            this.f6714a.a(a2, (Object) bnVar);
                        }
                        return;
                    }
                }
                this.f6714a.a(bnVar);
            } catch (Throwable th) {
                ca.c(th, "sd", AdvanceSetting.NETWORK_TYPE);
            }
        }
    }

    public cj(Context context, boolean z) {
        this.f6715b = context;
        this.f6714a = a(this.f6715b, z);
    }

    private ce a(Context context, boolean z) {
        try {
            return new ce(context, ce.a(ci.class));
        } catch (Throwable th) {
            if (!z) {
                ca.c(th, "sd", "gdb");
            }
            return null;
        }
    }

    private boolean a(List<bn> list, bn bnVar) {
        for (bn equals : list) {
            if (equals.equals(bnVar)) {
                return false;
            }
        }
        return true;
    }
}
