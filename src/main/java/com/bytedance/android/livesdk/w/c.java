package com.bytedance.android.livesdk.w;

import android.support.annotation.NonNull;
import com.bytedance.android.livesdkapi.depend.g.a;
import com.bytedance.android.livesdkapi.depend.g.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class c<T> extends a<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17769a;

    public final T a() {
        if (PatchProxy.isSupport(new Object[0], this, f17769a, false, 13306, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f17769a, false, 13306, new Class[0], Object.class);
        }
        T a2 = d.a(this);
        if (a2 != null) {
            return a2;
        }
        T a3 = b.a((a<T>) this);
        a(a3);
        return a3;
    }

    public final T b() {
        if (!PatchProxy.isSupport(new Object[0], this, f17769a, false, 13308, new Class[0], Object.class)) {
            return super.a();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f17769a, false, 13308, new Class[0], Object.class);
    }

    public final void a(T t) {
        if (PatchProxy.isSupport(new Object[]{t}, this, f17769a, false, 13307, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t}, this, f17769a, false, 13307, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        d.a((a) this, t);
    }

    public final void b(T t) {
        if (PatchProxy.isSupport(new Object[]{t}, this, f17769a, false, 13309, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{t}, this, f17769a, false, 13309, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        super.a(t);
    }

    public c(String str, @NonNull T t) {
        super(str, t);
    }
}
