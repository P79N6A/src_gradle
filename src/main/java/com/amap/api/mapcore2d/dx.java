package com.amap.api.mapcore2d;

import android.content.Context;
import java.util.List;

public class dx {

    /* renamed from: a  reason: collision with root package name */
    private dm f5983a = a(this.f5984b);

    /* renamed from: b  reason: collision with root package name */
    private Context f5984b;

    public dy a() {
        try {
            if (this.f5983a == null) {
                this.f5983a = a(this.f5984b);
            }
            List<dy> b2 = this.f5983a.b("1=1", dy.class);
            if (b2.size() > 0) {
                return b2.get(0);
            }
            return null;
        } catch (Throwable th) {
            dd.a(th, "UpdateLogDB", "getUpdateLog");
            return null;
        }
    }

    public dx(Context context) {
        this.f5984b = context;
    }

    private dm a(Context context) {
        try {
            return new dm(context, dm.a(dt.class));
        } catch (Throwable th) {
            dd.a(th, "UpdateLogDB", "getDB");
            return null;
        }
    }

    public void a(dy dyVar) {
        if (dyVar != null) {
            try {
                if (this.f5983a == null) {
                    this.f5983a = a(this.f5984b);
                }
                List<dy> b2 = this.f5983a.b("1=1", dy.class);
                if (b2 != null) {
                    if (b2.size() != 0) {
                        this.f5983a.a("1=1", (Object) dyVar);
                        return;
                    }
                }
                this.f5983a.a(dyVar);
            } catch (Throwable th) {
                dd.a(th, "UpdateLogDB", "updateLog");
            }
        }
    }
}
