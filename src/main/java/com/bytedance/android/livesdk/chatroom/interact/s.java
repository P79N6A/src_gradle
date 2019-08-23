package com.bytedance.android.livesdk.chatroom.interact;

import android.support.annotation.NonNull;
import com.bytedance.android.livesdk.v.h;
import com.bytedance.b.a.a.e.b;
import com.bytedance.b.a.a.e.c;
import com.bytedance.b.a.a.e.d;
import com.bytedance.b.a.a.f.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class s implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10994a;

    public static final class a implements h.b<a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10995a;

        @NonNull
        public final h.b.a<a> a(h.b.a<a> aVar) {
            h.b.a<a> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f10995a, false, 4427, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new s()).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f10995a, false, 4427, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f10994a, false, 4426, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10994a, false, 4426, new Class[0], Void.TYPE);
            return;
        }
        d.f19192a.put(a.e.AGORA, new c() {
            public final b a(com.bytedance.b.a.a.f.a aVar, com.bytedance.b.a.a.g.d dVar, com.bytedance.b.a.a.a.b bVar, com.bytedance.b.a.a.b.a aVar2) {
                return new com.bytedance.b.a.a.e.a(aVar, dVar, bVar, aVar2);
            }
        });
    }
}
