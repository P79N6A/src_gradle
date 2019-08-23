package com.bytedance.android.livesdk.y;

import android.support.annotation.NonNull;
import com.bytedance.android.livesdk.v.h;
import com.bytedance.android.livesdkapi.depend.d.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class c implements o {

    public static final class a implements h.b<o> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18608a;

        @NonNull
        public final h.b.a<o> a(h.b.a<o> aVar) {
            h.b.a<o> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f18608a, false, 13514, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new c()).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f18608a, false, 13514, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }
}
