package com.amap.api.mapcore2d;

import android.content.Context;
import java.util.List;

public class du {

    /* renamed from: a  reason: collision with root package name */
    private dm f5976a;

    public du(Context context) {
        try {
            this.f5976a = new dm(context, dm.a(dt.class));
        } catch (Throwable unused) {
        }
    }

    public void b(dv dvVar) {
        try {
            this.f5976a.a(dv.c(dvVar.b()), (Object) dvVar);
        } catch (Throwable th) {
            dd.a(th, "LogDB", "updateLogInfo");
        }
    }

    public void a(dv dvVar) {
        if (dvVar != null) {
            String c2 = dv.c(dvVar.b());
            List<?> a2 = this.f5976a.a(c2, (Class) dvVar.getClass(), true);
            if (a2 == null || a2.size() == 0) {
                this.f5976a.a(dvVar, true);
                return;
            }
            dv dvVar2 = (dv) a2.get(0);
            if (dvVar.a() == 0) {
                dvVar2.b(dvVar2.c() + 1);
            } else {
                dvVar2.b(0);
            }
            this.f5976a.a(c2, (Object) dvVar2, true);
        }
    }

    public void b(String str, Class<? extends dv> cls) {
        try {
            c(str, cls);
        } catch (Throwable unused) {
        }
    }

    private void c(String str, Class<? extends dv> cls) {
        this.f5976a.a(dv.c(str), cls);
    }

    public void a(String str, Class<? extends dv> cls) {
        try {
            c(str, cls);
        } catch (Throwable th) {
            dd.a(th, "LogDB", "delLog");
        }
    }

    public List<? extends dv> a(int i, Class<? extends dv> cls) {
        try {
            return this.f5976a.b(dv.c(i), cls);
        } catch (Throwable th) {
            dd.a(th, "LogDB", "ByState");
            return null;
        }
    }
}
