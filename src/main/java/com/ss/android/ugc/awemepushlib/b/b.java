package com.ss.android.ugc.awemepushlib.b;

import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.e;
import com.ss.android.newmedia.redbadge.j;
import java.util.ArrayList;
import java.util.List;

public class b implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76964a;

    /* renamed from: b  reason: collision with root package name */
    private static b f76965b;

    /* renamed from: c  reason: collision with root package name */
    private List<e> f76966c = new ArrayList();

    private b() {
        this.f76966c.add(new j());
        this.f76966c.add(new com.ss.android.http.b());
    }

    public static synchronized b b() {
        synchronized (b.class) {
            if (PatchProxy.isSupport(new Object[0], null, f76964a, true, 90364, new Class[0], b.class)) {
                b bVar = (b) PatchProxy.accessDispatch(new Object[0], null, f76964a, true, 90364, new Class[0], b.class);
                return bVar;
            }
            if (f76965b == null) {
                f76965b = new b();
            }
            b bVar2 = f76965b;
            return bVar2;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f76964a, false, 90369, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76964a, false, 90369, new Class[0], Void.TYPE);
            return;
        }
        for (int i = 0; i < this.f76966c.size(); i++) {
            this.f76966c.get(i).a();
        }
    }

    public final void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f76964a, false, 90367, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f76964a, false, 90367, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        for (int i = 0; i < this.f76966c.size(); i++) {
            this.f76966c.get(i).a(context);
        }
    }

    public final void a(Intent intent) {
        if (PatchProxy.isSupport(new Object[]{intent}, this, f76964a, false, 90368, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent}, this, f76964a, false, 90368, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        for (int i = 0; i < this.f76966c.size(); i++) {
            this.f76966c.get(i).a(intent);
        }
    }
}
