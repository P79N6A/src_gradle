package com.bytedance.android.livesdk.y;

import android.support.annotation.NonNull;
import com.bytedance.android.livesdk.v.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class d implements com.bytedance.android.livesdk.n.a {

    public static final class a implements h.b<com.bytedance.android.livesdk.n.a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f18609a;

        @NonNull
        public final h.b.a<com.bytedance.android.livesdk.n.a> a(h.b.a<com.bytedance.android.livesdk.n.a> aVar) {
            h.b.a<com.bytedance.android.livesdk.n.a> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f18609a, false, 13516, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new d()).a();
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f18609a, false, 13516, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }

    public final String a() {
        return "http://aweme.snssdk.com/aweme/v1/fansclub/club/";
    }
}
