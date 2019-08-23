package com.bytedance.android.livesdk.i18n;

import android.text.TextUtils;
import com.bytedance.android.livesdk.i18n.c;
import com.bytedance.android.livesdk.i18n.db.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

public final /* synthetic */ class d implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15603a;

    /* renamed from: b  reason: collision with root package name */
    private final c f15604b;

    d(c cVar) {
        this.f15604b = cVar;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f15603a, false, 10167, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f15603a, false, 10167, new Class[0], Object.class);
        }
        c cVar = this.f15604b;
        a a2 = c.f15596d.a("locale");
        if (a2 == null) {
            throw new Exception("locale info not found in db");
        } else if (TextUtils.equals(cVar.f15597b, a2.f15611b)) {
            c.b bVar = new c.b();
            bVar.f15600a = cVar.f15597b;
            a a3 = c.f15596d.a("version");
            if (a3 != null) {
                bVar.f15601b = Long.valueOf(a3.f15611b).longValue();
                List<com.bytedance.android.livesdk.i18n.db.d> a4 = c.f15595c.a();
                if (a4 == null || a4.isEmpty()) {
                    throw new Exception("translations not found for locale: " + cVar.f15597b);
                }
                HashMap hashMap = new HashMap();
                for (com.bytedance.android.livesdk.i18n.db.d dVar : a4) {
                    if (!TextUtils.isEmpty(dVar.f15617a) && !TextUtils.isEmpty(dVar.f15618b)) {
                        hashMap.put(dVar.f15617a, dVar.f15618b);
                    }
                }
                bVar.f15602c = hashMap;
                return bVar;
            }
            throw new Exception("version info not found in db");
        } else {
            throw new Exception("locale in db is " + a2.f15611b + ", but you are request for " + cVar.f15597b);
        }
    }
}
