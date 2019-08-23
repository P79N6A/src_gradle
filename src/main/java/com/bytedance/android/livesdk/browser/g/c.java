package com.bytedance.android.livesdk.browser.g;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.SparseArray;
import com.bytedance.android.livesdk.v.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9405a;

    /* renamed from: b  reason: collision with root package name */
    private SparseArray<b> f9406b;

    public static final class a implements h.b<a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f9407a;

        @NonNull
        public final h.b.a<a> a(h.b.a<a> aVar) {
            h.b.a<a> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f9407a, false, 3792, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new c((byte) 0)).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f9407a, false, 3792, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }

    private c() {
        this.f9406b = new SparseArray<>();
    }

    /* synthetic */ c(byte b2) {
        this();
    }

    public final void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f9405a, false, 3790, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f9405a, false, 3790, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        this.f9406b.remove(context.hashCode());
    }

    @Nullable
    public final b b(Context context) {
        if (!PatchProxy.isSupport(new Object[]{context}, this, f9405a, false, 3791, new Class[]{Context.class}, b.class)) {
            return this.f9406b.get(context.hashCode());
        }
        return (b) PatchProxy.accessDispatch(new Object[]{context}, this, f9405a, false, 3791, new Class[]{Context.class}, b.class);
    }
}
