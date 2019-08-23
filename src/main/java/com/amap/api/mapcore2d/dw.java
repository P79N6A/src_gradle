package com.amap.api.mapcore2d;

import android.content.Context;
import java.util.List;

public class dw {

    /* renamed from: a  reason: collision with root package name */
    private dm f5981a;

    /* renamed from: b  reason: collision with root package name */
    private Context f5982b;

    public List<cy> a() {
        try {
            return this.f5981a.a(cy.h(), cy.class, true);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void a(cy cyVar) {
        if (cyVar != null) {
            try {
                if (this.f5981a == null) {
                    this.f5981a = a(this.f5982b, false);
                }
                String a2 = cy.a(cyVar.a());
                List<cy> b2 = this.f5981a.b(a2, cy.class);
                if (b2 != null) {
                    if (b2.size() != 0) {
                        if (a(b2, cyVar)) {
                            this.f5981a.a(a2, (Object) cyVar);
                        }
                        return;
                    }
                }
                this.f5981a.a(cyVar);
            } catch (Throwable th) {
                dd.a(th, "SDKDB", "insert");
            }
        }
    }

    public dw(Context context, boolean z) {
        this.f5982b = context;
        this.f5981a = a(this.f5982b, z);
    }

    private dm a(Context context, boolean z) {
        try {
            return new dm(context, dm.a(dt.class));
        } catch (Throwable th) {
            if (!z) {
                dd.a(th, "SDKDB", "getDB");
            }
            return null;
        }
    }

    private boolean a(List<cy> list, cy cyVar) {
        for (cy equals : list) {
            if (equals.equals(cyVar)) {
                return false;
            }
        }
        return true;
    }
}
