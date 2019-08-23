package com.bytedance.android.livesdk.player;

import com.bytedance.android.live.core.utils.aa;
import com.bytedance.android.livesdkapi.depend.e.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;

public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f16815a;

    /* renamed from: b  reason: collision with root package name */
    private final f f16816b;

    g(f fVar) {
        this.f16816b = fVar;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f16815a, false, 12718, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f16815a, false, 12718, new Class[0], Object.class);
        }
        b a2 = b.a();
        h hVar = new h(this.f16816b, ((float) aa.a()) / 1024.0f);
        if (PatchProxy.isSupport(new Object[]{hVar}, a2, b.f18648a, false, 14953, new Class[]{Runnable.class}, Void.TYPE)) {
            b bVar = a2;
            PatchProxy.accessDispatch(new Object[]{hVar}, bVar, b.f18648a, false, 14953, new Class[]{Runnable.class}, Void.TYPE);
        } else {
            b.a(a2);
            if (a2.f18653c != null) {
                a2.f18653c.post(hVar);
            }
        }
        return null;
    }
}
