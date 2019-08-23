package com.bytedance.android.livesdk.live.provider;

import android.support.annotation.NonNull;
import com.bytedance.android.livesdk.v.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.android.livesdk.live.b.a f15874a;

    /* renamed from: com.bytedance.android.livesdk.live.provider.a$a  reason: collision with other inner class name */
    public static class C0113a implements h.b<a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f15875a;

        @NonNull
        public final h.b.a<a> a(h.b.a<a> aVar) {
            h.b.a<a> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f15875a, false, 10355, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new a()).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f15875a, false, 10355, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }
}
