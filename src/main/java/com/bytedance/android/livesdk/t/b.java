package com.bytedance.android.livesdk.t;

import android.support.annotation.NonNull;
import com.bytedance.android.livesdk.v.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b implements a {

    public static final class a implements h.b<a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f17423a;

        @NonNull
        public final h.b.a<a> a(h.b.a<a> aVar) {
            h.b.a<a> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f17423a, false, 13113, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new b()).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f17423a, false, 13113, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }
}
