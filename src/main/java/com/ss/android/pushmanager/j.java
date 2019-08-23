package com.ss.android.pushmanager;

import android.content.Context;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.message.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class j implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30567a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile j f30568b;

    /* renamed from: c  reason: collision with root package name */
    private List<d> f30569c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private d.a f30570d;

    private j() {
    }

    public static j b() {
        if (PatchProxy.isSupport(new Object[0], null, f30567a, true, 18979, new Class[0], j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[0], null, f30567a, true, 18979, new Class[0], j.class);
        }
        if (f30568b == null) {
            synchronized (j.class) {
                if (f30568b == null) {
                    f30568b = new j();
                }
            }
        }
        return f30568b;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f30567a, false, 18986, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f30567a, false, 18986, new Class[0], Void.TYPE);
            return;
        }
        for (d a2 : this.f30569c) {
            try {
                a2.a();
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, this, f30567a, false, 18984, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, this, f30567a, false, 18984, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        for (d a2 : this.f30569c) {
            try {
                a2.a(context2);
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{intent2}, this, f30567a, false, 18985, new Class[]{Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{intent2}, this, f30567a, false, 18985, new Class[]{Intent.class}, Void.TYPE);
            return;
        }
        for (d a2 : this.f30569c) {
            try {
                a2.a(intent2);
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(Context context, c cVar) {
        if (PatchProxy.isSupport(new Object[]{context, cVar}, this, f30567a, false, 18981, new Class[]{Context.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, cVar}, this, f30567a, false, 18981, new Class[]{Context.class, c.class}, Void.TYPE);
            return;
        }
        this.f30570d = new d.a() {
        };
        for (d a2 : this.f30569c) {
            try {
                a2.a(context, cVar);
            } catch (Throwable unused) {
            }
        }
    }

    public final void a(Context context, Map<String, String> map) {
        Context context2 = context;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{context2, map2}, this, f30567a, false, 18982, new Class[]{Context.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, map2}, this, f30567a, false, 18982, new Class[]{Context.class, Map.class}, Void.TYPE);
            return;
        }
        for (d a2 : this.f30569c) {
            try {
                a2.a(context2, map2);
            } catch (Throwable unused) {
            }
        }
    }
}
